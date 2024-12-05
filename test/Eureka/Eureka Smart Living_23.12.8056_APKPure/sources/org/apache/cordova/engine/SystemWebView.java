package org.apache.cordova.engine;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import m5.h;
import m5.k;

/* loaded from: classes.dex */
public class SystemWebView extends WebView {

    /* renamed from: a, reason: collision with root package name */
    private d f8392a;

    /* renamed from: b, reason: collision with root package name */
    c f8393b;

    /* renamed from: c, reason: collision with root package name */
    private SystemWebViewEngine f8394c;

    /* renamed from: d, reason: collision with root package name */
    private h f8395d;

    public SystemWebView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(SystemWebViewEngine systemWebViewEngine, h hVar) {
        this.f8395d = hVar;
        this.f8394c = systemWebViewEngine;
        if (this.f8392a == null) {
            setWebViewClient(new d(systemWebViewEngine));
        }
        if (this.f8393b == null) {
            setWebChromeClient(new c(systemWebViewEngine));
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Boolean onDispatchKeyEvent = this.f8394c.f8400e.onDispatchKeyEvent(keyEvent);
        return onDispatchKeyEvent != null ? onDispatchKeyEvent.booleanValue() : super.dispatchKeyEvent(keyEvent);
    }

    public k getCordovaWebView() {
        SystemWebViewEngine systemWebViewEngine = this.f8394c;
        if (systemWebViewEngine != null) {
            return systemWebViewEngine.getCordovaWebView();
        }
        return null;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f8393b = (c) webChromeClient;
        super.setWebChromeClient(webChromeClient);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        this.f8392a = (d) webViewClient;
        super.setWebViewClient(webViewClient);
    }

    public SystemWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
