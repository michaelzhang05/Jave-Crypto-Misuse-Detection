package com.rjfun.cordova.plugin.nativeaudio;

import android.media.AudioManager;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.apache.cordova.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NativeAudio extends org.apache.cordova.b implements AudioManager.OnAudioFocusChangeListener {
    public static final String ADD_COMPLETE_LISTENER = "addCompleteListener";
    public static final String ERROR_AUDIOID_EXISTS = "A reference already exists for the specified audio id.";
    public static final String ERROR_NO_AUDIOID = "A reference does not exist for the specified audio id.";
    public static final String LOOP = "loop";
    public static final String OPT_FADE_MUSIC = "fadeMusic";
    public static final String PLAY = "play";
    public static final String PRELOAD_COMPLEX = "preloadComplex";
    public static final String PRELOAD_SIMPLE = "preloadSimple";
    public static final String SET_OPTIONS = "setOptions";
    public static final String SET_VOLUME_FOR_COMPLEX_ASSET = "setVolumeForComplexAsset";
    public static final String STOP = "stop";
    public static final String UNLOAD = "unload";

    /* renamed from: d, reason: collision with root package name */
    private static HashMap f6084d;

    /* renamed from: e, reason: collision with root package name */
    private static ArrayList f6085e;

    /* renamed from: f, reason: collision with root package name */
    private static HashMap f6086f;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6087c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6088a;

        a(String str) {
            this.f6088a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            org.apache.cordova.a aVar;
            if (NativeAudio.f6086f == null || (aVar = (org.apache.cordova.a) NativeAudio.f6086f.get(this.f6088a)) == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.f6088a);
            aVar.sendPluginResult(new org.apache.cordova.f(f.a.OK, jSONObject));
            return null;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f6090a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONArray f6091b;

        b(org.apache.cordova.a aVar, JSONArray jSONArray) {
            this.f6090a = aVar;
            this.f6091b = jSONArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6090a.sendPluginResult(NativeAudio.this.h(this.f6091b));
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f6093a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONArray f6094b;

        c(org.apache.cordova.a aVar, JSONArray jSONArray) {
            this.f6093a = aVar;
            this.f6094b = jSONArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6093a.sendPluginResult(NativeAudio.this.h(this.f6094b));
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f6096a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f6097b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONArray f6098c;

        d(org.apache.cordova.a aVar, String str, JSONArray jSONArray) {
            this.f6096a = aVar;
            this.f6097b = str;
            this.f6098c = jSONArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6096a.sendPluginResult(NativeAudio.this.g(this.f6097b, this.f6098c));
        }
    }

    /* loaded from: classes.dex */
    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f6100a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONArray f6101b;

        e(org.apache.cordova.a aVar, JSONArray jSONArray) {
            this.f6100a = aVar;
            this.f6101b = jSONArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6100a.sendPluginResult(NativeAudio.this.j(this.f6101b));
        }
    }

    /* loaded from: classes.dex */
    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONArray f6103a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f6104b;

        f(JSONArray jSONArray, org.apache.cordova.a aVar) {
            this.f6103a = jSONArray;
            this.f6104b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeAudio.this.j(this.f6103a);
            this.f6104b.sendPluginResult(NativeAudio.this.k(this.f6103a));
        }
    }

    /* loaded from: classes.dex */
    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f6106a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONArray f6107b;

        g(org.apache.cordova.a aVar, JSONArray jSONArray) {
            this.f6106a = aVar;
            this.f6107b = jSONArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6106a.sendPluginResult(NativeAudio.this.i(this.f6107b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.apache.cordova.f g(String str, JSONArray jSONArray) {
        try {
            String string = jSONArray.getString(0);
            if (!f6084d.containsKey(string)) {
                return new org.apache.cordova.f(f.a.ERROR, ERROR_NO_AUDIOID);
            }
            w4.a aVar = (w4.a) f6084d.get(string);
            if (LOOP.equals(str)) {
                aVar.a();
            } else {
                aVar.c(new a(string));
            }
            return new org.apache.cordova.f(f.a.OK);
        } catch (IOException e6) {
            return new org.apache.cordova.f(f.a.ERROR, e6.toString());
        } catch (JSONException e7) {
            return new org.apache.cordova.f(f.a.ERROR, e7.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.apache.cordova.f h(JSONArray jSONArray) {
        try {
            String string = jSONArray.getString(0);
            if (f6084d.containsKey(string)) {
                return new org.apache.cordova.f(f.a.ERROR, ERROR_AUDIOID_EXISTS);
            }
            int i6 = 1;
            String string2 = jSONArray.getString(1);
            Log.d("NativeAudio", "preloadComplex - " + string + ": " + string2);
            double d6 = jSONArray.length() <= 2 ? 1.0d : jSONArray.getDouble(2);
            if (jSONArray.length() > 3) {
                i6 = jSONArray.getInt(3);
            }
            f6084d.put(string, new w4.a(this.f8371cordova.getActivity().getApplicationContext().getResources().getAssets().openFd("www/".concat(string2)), i6, (float) d6));
            return new org.apache.cordova.f(f.a.OK);
        } catch (IOException e6) {
            return new org.apache.cordova.f(f.a.ERROR, e6.toString());
        } catch (JSONException e7) {
            return new org.apache.cordova.f(f.a.ERROR, e7.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.apache.cordova.f i(JSONArray jSONArray) {
        try {
            String string = jSONArray.getString(0);
            float f6 = (float) jSONArray.getDouble(1);
            Log.d("NativeAudio", "setVolume - " + string);
            if (!f6084d.containsKey(string)) {
                return new org.apache.cordova.f(f.a.ERROR, ERROR_NO_AUDIOID);
            }
            ((w4.a) f6084d.get(string)).e(f6);
            return new org.apache.cordova.f(f.a.OK);
        } catch (JSONException e6) {
            return new org.apache.cordova.f(f.a.ERROR, e6.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.apache.cordova.f j(JSONArray jSONArray) {
        try {
            String string = jSONArray.getString(0);
            if (!f6084d.containsKey(string)) {
                return new org.apache.cordova.f(f.a.ERROR, ERROR_NO_AUDIOID);
            }
            ((w4.a) f6084d.get(string)).f();
            return new org.apache.cordova.f(f.a.OK);
        } catch (JSONException e6) {
            return new org.apache.cordova.f(f.a.ERROR, e6.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.apache.cordova.f k(JSONArray jSONArray) {
        try {
            String string = jSONArray.getString(0);
            Log.d("NativeAudio", "unload - " + string);
            if (!f6084d.containsKey(string)) {
                return new org.apache.cordova.f(f.a.ERROR, ERROR_NO_AUDIOID);
            }
            ((w4.a) f6084d.get(string)).g();
            f6084d.remove(string);
            return new org.apache.cordova.f(f.a.OK);
        } catch (IOException e6) {
            return new org.apache.cordova.f(f.a.ERROR, e6.toString());
        } catch (JSONException e7) {
            return new org.apache.cordova.f(f.a.ERROR, e7.toString());
        }
    }

    private void l() {
        if (f6084d == null) {
            f6084d = new HashMap();
        }
        if (f6085e == null) {
            f6085e = new ArrayList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0104  */
    @Override // org.apache.cordova.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean execute(java.lang.String r3, org.json.JSONArray r4, org.apache.cordova.a r5) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rjfun.cordova.plugin.nativeaudio.NativeAudio.execute(java.lang.String, org.json.JSONArray, org.apache.cordova.a):boolean");
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i6) {
    }

    @Override // org.apache.cordova.b
    public void onPause(boolean z5) {
        super.onPause(z5);
        Iterator it = f6084d.entrySet().iterator();
        while (it.hasNext()) {
            w4.a aVar = (w4.a) ((Map.Entry) it.next()).getValue();
            if (aVar.b()) {
                f6085e.add(aVar);
            }
        }
    }

    @Override // org.apache.cordova.b
    public void onResume(boolean z5) {
        super.onResume(z5);
        while (!f6085e.isEmpty()) {
            ((w4.a) f6085e.remove(0)).d();
        }
    }

    @Override // org.apache.cordova.b
    protected void pluginInitialize() {
        ((AudioManager) this.f8371cordova.getActivity().getSystemService("audio")).requestAudioFocus(this, 3, 1);
        this.webView.setButtonPlumbedToJs(25, false);
        this.webView.setButtonPlumbedToJs(24, false);
    }

    public void setOptions(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has(OPT_FADE_MUSIC)) {
            return;
        }
        this.f6087c = jSONObject.optBoolean(OPT_FADE_MUSIC);
    }
}
