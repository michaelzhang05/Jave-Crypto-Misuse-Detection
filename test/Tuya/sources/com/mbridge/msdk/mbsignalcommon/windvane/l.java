package com.mbridge.msdk.mbsignalcommon.windvane;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public final class l extends com.mbridge.msdk.mbsignalcommon.base.b {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f20633b = true;

    /* renamed from: a, reason: collision with root package name */
    protected String f20634a = null;

    /* renamed from: c, reason: collision with root package name */
    private int f20635c = 0;

    /* renamed from: d, reason: collision with root package name */
    private d f20636d;

    private WebResourceResponse a(String str) {
        try {
            if (!TextUtils.isEmpty(str) && j.d(str)) {
                ad.c("WindVaneWebViewClient", "is image " + str);
                Bitmap b8 = com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).b(str);
                ad.c("WindVaneWebViewClient", "find image from cache " + str);
                if (b8 != null && !b8.isRecycled()) {
                    return new WebResourceResponse(j.e(str), "utf-8", com.mbridge.msdk.foundation.same.c.a.a(b8));
                }
                return null;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f20634a = str;
        d dVar = this.f20636d;
        if (dVar != null) {
            dVar.a(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse a8 = a(str);
        if (a8 != null) {
            ad.c("WindVaneWebViewClient", "find WebResourceResponse url is " + str);
            return a8;
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
