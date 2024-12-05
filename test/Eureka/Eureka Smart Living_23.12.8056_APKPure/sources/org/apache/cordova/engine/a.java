package org.apache.cordova.engine;

import android.webkit.CookieManager;
import android.webkit.WebView;
import m5.m;

/* loaded from: classes.dex */
class a implements m {

    /* renamed from: a, reason: collision with root package name */
    protected final WebView f8410a;

    /* renamed from: b, reason: collision with root package name */
    private final CookieManager f8411b;

    public a(WebView webView) {
        this.f8410a = webView;
        CookieManager cookieManager = CookieManager.getInstance();
        this.f8411b = cookieManager;
        CookieManager.setAcceptFileSchemeCookies(true);
        cookieManager.setAcceptThirdPartyCookies(webView, true);
    }
}
