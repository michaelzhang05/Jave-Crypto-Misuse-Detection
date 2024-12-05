package com.getcapacitor;

import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import o0.f;

/* loaded from: classes.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    private h f4452a;

    /* renamed from: b, reason: collision with root package name */
    private WebView f4453b;

    /* renamed from: c, reason: collision with root package name */
    private org.apache.cordova.e f4454c;

    /* renamed from: d, reason: collision with root package name */
    private o0.a f4455d;

    public p0(h hVar, WebView webView, org.apache.cordova.e eVar) {
        this.f4452a = hVar;
        this.f4453b = webView;
        this.f4454c = eVar;
        if (o0.g.a("WEB_MESSAGE_LISTENER") && !hVar.n().t()) {
            try {
                o0.f.a(webView, "androidBridge", hVar.k(), new f.a() { // from class: com.getcapacitor.m0
                    @Override // o0.f.a
                    public final void a(WebView webView2, o0.c cVar, Uri uri, boolean z5, o0.a aVar) {
                        p0.this.h(webView2, cVar, uri, z5, aVar);
                    }
                });
                return;
            } catch (Exception unused) {
            }
        }
        webView.addJavascriptInterface(this, "androidBridge");
    }

    private void d(final String str, final String str2, final String str3, final String str4) {
        this.f4452a.h(new Runnable() { // from class: com.getcapacitor.o0
            @Override // java.lang.Runnable
            public final void run() {
                p0.this.f(str2, str3, str, str4);
            }
        });
    }

    private void e(String str, String str2, String str3, j0 j0Var) {
        this.f4452a.f(str2, str3, new v0(this, str2, str, str3, j0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(String str, String str2, String str3, String str4) {
        this.f4454c.d(str, str2, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(WebView webView, o0.c cVar, Uri uri, boolean z5, o0.a aVar) {
        if (!z5) {
            l0.n("Plugin execution is allowed in Main Frame only");
        } else {
            postMessage(cVar.a());
            this.f4455d = aVar;
        }
    }

    private void i(c1 c1Var) {
        final String str = "window.Capacitor.fromNative(" + c1Var.toString() + ")";
        final WebView webView = this.f4453b;
        webView.post(new Runnable() { // from class: com.getcapacitor.n0
            @Override // java.lang.Runnable
            public final void run() {
                webView.evaluateJavascript(str, null);
            }
        });
    }

    public void j(v0 v0Var, c1 c1Var, c1 c1Var2) {
        o0.a aVar;
        try {
            c1 c1Var3 = new c1();
            c1Var3.e("save", v0Var.q());
            c1Var3.d("callbackId", v0Var.g());
            c1Var3.d("pluginId", v0Var.m());
            c1Var3.d("methodName", v0Var.k());
            if (c1Var2 != null) {
                c1Var3.e("success", false);
                c1Var3.c("error", c1Var2);
                l0.a("Sending plugin error: " + c1Var3.toString());
            } else {
                c1Var3.e("success", true);
                if (c1Var != null) {
                    c1Var3.c("data", c1Var);
                }
            }
            if (!(!v0Var.g().equals("-1"))) {
                this.f4452a.l().a(c1Var3);
            } else if (this.f4452a.n().t() || !o0.g.a("WEB_MESSAGE_LISTENER") || (aVar = this.f4455d) == null) {
                i(c1Var3);
            } else {
                aVar.a(c1Var3.toString());
            }
        } catch (Exception e6) {
            l0.c("sendResponseMessage: error: " + e6);
        }
        if (v0Var.q()) {
            return;
        }
        v0Var.v(this.f4452a);
    }

    @JavascriptInterface
    public void postMessage(String str) {
        try {
            j0 j0Var = new j0(str);
            String string = j0Var.getString("type");
            boolean z5 = true;
            boolean z6 = string != null;
            boolean z7 = z6 && string.equals("cordova");
            if (!z6 || !string.equals("js.error")) {
                z5 = false;
            }
            String string2 = j0Var.getString("callbackId");
            if (z7) {
                String string3 = j0Var.getString("service");
                String string4 = j0Var.getString("action");
                String string5 = j0Var.getString("actionArgs");
                l0.m(l0.k("Plugin"), "To native (Cordova plugin): callbackId: " + string2 + ", service: " + string3 + ", action: " + string4 + ", actionArgs: " + string5);
                d(string2, string3, string4, string5);
                return;
            }
            if (z5) {
                l0.c("JavaScript Error: " + str);
                return;
            }
            String string6 = j0Var.getString("pluginId");
            String string7 = j0Var.getString("methodName");
            j0 g6 = j0Var.g("options", new j0());
            l0.m(l0.k("Plugin"), "To native (Capacitor plugin): callbackId: " + string2 + ", pluginId: " + string6 + ", methodName: " + string7);
            e(string2, string6, string7, g6);
        } catch (Exception e6) {
            l0.e("Post message error:", e6);
        }
    }
}
