package com.getcapacitor;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Iterator;

/* loaded from: classes.dex */
public class b0 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    private h f4272a;

    public b0(h hVar) {
        this.f4272a = hVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (this.f4272a.H() == null || webView.getProgress() != 100) {
            return;
        }
        Iterator it = this.f4272a.H().iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.f0.a(it.next());
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f4272a.q0();
        if (this.f4272a.H() != null) {
            Iterator it = this.f4272a.H().iterator();
            if (it.hasNext()) {
                androidx.appcompat.app.f0.a(it.next());
                throw null;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (this.f4272a.H() != null) {
            Iterator it = this.f4272a.H().iterator();
            if (it.hasNext()) {
                androidx.appcompat.app.f0.a(it.next());
                throw null;
            }
        }
        String p6 = this.f4272a.p();
        if (p6 == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        webView.loadUrl(p6);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (this.f4272a.H() != null) {
            Iterator it = this.f4272a.H().iterator();
            if (it.hasNext()) {
                androidx.appcompat.app.f0.a(it.next());
                throw null;
            }
        }
        String p6 = this.f4272a.p();
        if (p6 == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        webView.loadUrl(p6);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        super.onRenderProcessGone(webView, renderProcessGoneDetail);
        if (this.f4272a.H() == null) {
            return false;
        }
        Iterator it = this.f4272a.H().iterator();
        if (!it.hasNext()) {
            return false;
        }
        androidx.appcompat.app.f0.a(it.next());
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return this.f4272a.u().s(webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return this.f4272a.T(webResourceRequest.getUrl());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.f4272a.T(Uri.parse(str));
    }
}
