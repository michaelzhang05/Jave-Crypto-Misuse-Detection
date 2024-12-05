package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FacebookWebFallbackDialog.java */
/* loaded from: classes.dex */
public class j extends z {
    private static final String t = j.class.getName();
    private boolean u;

    /* compiled from: FacebookWebFallbackDialog.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                j.super.cancel();
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    private j(Context context, String str, String str2) {
        super(context, str);
        v(str2);
    }

    public static j A(Context context, String str, String str2) {
        z.n(context);
        return new j(context, str, str2);
    }

    @Override // com.facebook.internal.z, android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        WebView m = m();
        if (p() && !o() && m != null && m.isShown()) {
            if (this.u) {
                return;
            }
            this.u = true;
            m.loadUrl("javascript:(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            new Handler(Looper.getMainLooper()).postDelayed(new a(), 1500L);
            return;
        }
        super.cancel();
    }

    @Override // com.facebook.internal.z
    protected Bundle r(String str) {
        Bundle a0 = x.a0(Uri.parse(str).getQuery());
        String string = a0.getString("bridge_args");
        a0.remove("bridge_args");
        if (!x.Q(string)) {
            try {
                a0.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", c.a(new JSONObject(string)));
            } catch (JSONException e2) {
                x.W(t, "Unable to parse bridge_args JSON", e2);
            }
        }
        String string2 = a0.getString("method_results");
        a0.remove("method_results");
        if (!x.Q(string2)) {
            if (x.Q(string2)) {
                string2 = "{}";
            }
            try {
                a0.putBundle("com.facebook.platform.protocol.RESULT_ARGS", c.a(new JSONObject(string2)));
            } catch (JSONException e3) {
                x.W(t, "Unable to parse bridge_args JSON", e3);
            }
        }
        a0.remove("version");
        a0.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", s.t());
        return a0;
    }
}
