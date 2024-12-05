package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.webkit.ValueCallback;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
/* loaded from: classes2.dex */
public class zzbjb extends rb implements zzbje {

    /* renamed from: f, reason: collision with root package name */
    private final zzbiz f13310f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f13311g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13312h;

    public zzbjb(Context context, zzbiz zzbizVar) {
        super(context);
        zzk.zzlk().o();
        this.f13310f = zzbizVar;
        super.setWebViewClient(zzbizVar);
    }

    private final synchronized void A0() {
        if (!this.f13312h) {
            this.f13312h = true;
            zzk.zzlk().p();
        }
    }

    @Override // com.google.android.gms.internal.ads.rb, android.webkit.WebView
    public /* bridge */ /* synthetic */ void addJavascriptInterface(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
    }

    @Override // android.webkit.WebView
    public synchronized void destroy() {
        if (this.f13311g) {
            return;
        }
        this.f13311g = true;
        this.f13310f.q(this);
        z0(false);
        zzawz.m("Initiating WebView self destruct sequence in 3...");
        zzawz.m("Loading blank page in WebView, 2...");
        try {
            super.loadUrl("about:blank");
        } catch (UnsatisfiedLinkError e2) {
            zzk.zzlk().e(e2, "AdWebViewImpl.loadUrlUnsafe");
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.webkit.WebView
    @TargetApi(19)
    public synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (l()) {
            zzbad.i("#004 The webview is destroyed. Ignoring action.");
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!l()) {
                    z0(true);
                }
                A0();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.rb, com.google.android.gms.internal.ads.zzajq, com.google.android.gms.internal.ads.zzakg
    public /* bridge */ /* synthetic */ void k(String str) {
        super.k(str);
    }

    public final synchronized boolean l() {
        return this.f13311g;
    }

    @Override // android.webkit.WebView
    public synchronized void loadData(String str, String str2, String str3) {
        if (!l()) {
            super.loadData(str, str2, str3);
        } else {
            zzbad.i("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView
    public synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!l()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            zzbad.i("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.rb, android.webkit.WebView
    public synchronized void loadUrl(String str) {
        if (!l()) {
            super.loadUrl(str);
        } else {
            zzbad.i("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @VisibleForTesting
    public synchronized void n0() {
        zzawz.m("Destroying WebView!");
        A0();
        zzbbm.a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.tb

            /* renamed from: f, reason: collision with root package name */
            private final zzbjb f12197f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12197f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12197f.y0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    public void onDraw(Canvas canvas) {
        if (l()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbgz
    public void onPause() {
        if (l()) {
            return;
        }
        super.onPause();
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbgz
    public void onResume() {
        if (l()) {
            return;
        }
        super.onResume();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !l() && super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (l()) {
            return;
        }
        super.stopLoading();
    }

    @Override // com.google.android.gms.internal.ads.zzbje
    public final synchronized void u(zzbja zzbjaVar) {
        zzawz.m("Blank page loaded, 1...");
        n0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void y0() {
        super.destroy();
    }

    protected void z0(boolean z) {
    }
}
