package com.hutchind.cordova.plugins.streamingmedia;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import m5.h;
import org.apache.cordova.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class StreamingMedia extends b {
    public static final String ACTION_PLAY_AUDIO = "playAudio";
    public static final String ACTION_PLAY_VIDEO = "playVideo";

    /* renamed from: c, reason: collision with root package name */
    private org.apache.cordova.a f6041c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f6042a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f6043b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f6044c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ JSONObject f6045d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b f6046e;

        a(h hVar, Class cls, String str, JSONObject jSONObject, b bVar) {
            this.f6042a = hVar;
            this.f6043b = cls;
            this.f6044c = str;
            this.f6045d = jSONObject;
            this.f6046e = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            String next;
            StringBuilder sb;
            Intent intent = new Intent(this.f6042a.getActivity().getApplicationContext(), (Class<?>) this.f6043b);
            Bundle bundle = new Bundle();
            bundle.putString("mediaUrl", this.f6044c);
            JSONObject jSONObject = this.f6045d;
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        next = keys.next();
                    } catch (JSONException unused) {
                        Log.e("StreamingMediaPlugin", "JSONException while trying to read options. Skipping option.");
                    }
                    if (this.f6045d.get(next).getClass().equals(String.class)) {
                        bundle.putString(next, (String) this.f6045d.get(next));
                        sb = new StringBuilder();
                        sb.append("Added option: ");
                        sb.append(next);
                        sb.append(" -> ");
                        sb.append(String.valueOf(this.f6045d.get(next)));
                    } else if (this.f6045d.get(next).getClass().equals(Boolean.class)) {
                        bundle.putBoolean(next, ((Boolean) this.f6045d.get(next)).booleanValue());
                        sb = new StringBuilder();
                        sb.append("Added option: ");
                        sb.append(next);
                        sb.append(" -> ");
                        sb.append(String.valueOf(this.f6045d.get(next)));
                    }
                    Log.v("StreamingMediaPlugin", sb.toString());
                }
                intent.putExtras(bundle);
            }
            this.f6042a.startActivityForResult(this.f6046e, intent, 7);
        }
    }

    private boolean a(Class cls, String str, JSONObject jSONObject) {
        h hVar = this.f8371cordova;
        hVar.getActivity().runOnUiThread(new a(hVar, cls, str, jSONObject, this));
        return true;
    }

    private boolean b(String str, JSONObject jSONObject) {
        return a(SimpleAudioStream.class, str, jSONObject);
    }

    private boolean c(String str, JSONObject jSONObject) {
        return a(SimpleVideoStream.class, str, jSONObject);
    }

    @Override // org.apache.cordova.b
    public boolean execute(String str, JSONArray jSONArray, org.apache.cordova.a aVar) {
        JSONObject jSONObject;
        this.f6041c = aVar;
        try {
            jSONObject = jSONArray.getJSONObject(1);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (ACTION_PLAY_AUDIO.equals(str)) {
            return b(jSONArray.getString(0), jSONObject);
        }
        if (ACTION_PLAY_VIDEO.equals(str)) {
            return c(jSONArray.getString(0), jSONObject);
        }
        aVar.error("streamingMedia." + str + " is not a supported method.");
        return false;
    }

    @Override // org.apache.cordova.b
    public void onActivityResult(int i6, int i7, Intent intent) {
        Log.v("StreamingMediaPlugin", "onActivityResult: " + i6 + " " + i7);
        super.onActivityResult(i6, i7, intent);
        if (7 == i6) {
            if (-1 == i7) {
                this.f6041c.success();
            } else if (i7 == 0) {
                this.f6041c.error((intent == null || !intent.hasExtra("message")) ? "Error" : intent.getStringExtra("message"));
            }
        }
    }
}
