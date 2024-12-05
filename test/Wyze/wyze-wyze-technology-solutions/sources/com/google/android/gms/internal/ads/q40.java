package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class q40 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private ValueCallback<String> f12040f = new r40(this);

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ zzuo f12041g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ WebView f12042h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f12043i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ zzuu f12044j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q40(zzuu zzuuVar, zzuo zzuoVar, WebView webView, boolean z) {
        this.f12044j = zzuuVar;
        this.f12041g = zzuoVar;
        this.f12042h = webView;
        this.f12043i = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f12042h.getSettings().getJavaScriptEnabled()) {
            try {
                this.f12042h.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f12040f);
            } catch (Throwable unused) {
                this.f12040f.onReceiveValue(HttpUrl.FRAGMENT_ENCODE_SET);
            }
        }
    }
}
