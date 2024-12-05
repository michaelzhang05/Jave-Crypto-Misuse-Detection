package com.getcapacitor.cordova;

import android.webkit.CookieManager;
import android.webkit.WebView;
import m5.m;

/* loaded from: classes.dex */
class a implements m {

    /* renamed from: a, reason: collision with root package name */
    protected final WebView f4356a;

    /* renamed from: b, reason: collision with root package name */
    private final CookieManager f4357b;

    public a(WebView webView) {
        this.f4356a = webView;
        CookieManager cookieManager = CookieManager.getInstance();
        this.f4357b = cookieManager;
        cookieManager.setAcceptThirdPartyCookies(webView, true);
    }
}
