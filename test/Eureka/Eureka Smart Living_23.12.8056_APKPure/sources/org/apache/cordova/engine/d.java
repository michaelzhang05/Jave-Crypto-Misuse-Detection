package org.apache.cordova.engine;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.MimeTypeMap;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.f0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Iterator;
import m5.i;
import m5.o;
import o0.e;
import org.apache.cordova.CordovaClientCertRequest;
import org.apache.cordova.CordovaHttpAuthHandler;
import org.apache.cordova.c;
import org.apache.cordova.engine.d;

/* loaded from: classes.dex */
public class d extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    protected final SystemWebViewEngine f8426a;

    /* renamed from: b, reason: collision with root package name */
    private final e f8427b;

    /* renamed from: d, reason: collision with root package name */
    boolean f8429d;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8428c = false;

    /* renamed from: e, reason: collision with root package name */
    private Hashtable f8430e = new Hashtable();

    public d(final SystemWebViewEngine systemWebViewEngine) {
        this.f8426a = systemWebViewEngine;
        e.a d6 = new e.a().c(systemWebViewEngine.f8398c.c("hostname", "localhost")).d(true);
        d6.a("/", new e.b() { // from class: n5.a
            @Override // o0.e.b
            public final WebResourceResponse a(String str) {
                WebResourceResponse c6;
                c6 = d.this.c(systemWebViewEngine, str);
                return c6;
            }
        });
        this.f8427b = d6.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WebResourceResponse c(SystemWebViewEngine systemWebViewEngine, String str) {
        WebResourceResponse a6;
        try {
            org.apache.cordova.e eVar = this.f8426a.f8403h;
            if (eVar != null) {
                Iterator it = eVar.g().iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    if (iVar.a() != null && (a6 = iVar.a().a(str)) != null) {
                        return a6;
                    }
                }
            }
            if (str.isEmpty()) {
                str = "index.html";
            }
            InputStream open = systemWebViewEngine.f8396a.getContext().getAssets().open("www/" + str, 2);
            String str2 = "text/html";
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
            if (fileExtensionFromUrl != null) {
                if (!str.endsWith(".js") && !str.endsWith(".mjs")) {
                    str2 = str.endsWith(".wasm") ? "application/wasm" : MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                }
                str2 = "application/javascript";
            }
            return new WebResourceResponse(str2, null, open);
        } catch (Exception e6) {
            e6.printStackTrace();
            o.c("SystemWebViewClient", e6.getMessage());
            return null;
        }
    }

    private static boolean d(Uri uri) {
        return "content".equals(uri.getScheme());
    }

    private static boolean e(Uri uri) {
        if (org.apache.cordova.c.h(uri) != 1) {
            return false;
        }
        if (uri.getQuery() != null || uri.getFragment() != null) {
            return true;
        }
        uri.toString().contains("%");
        return false;
    }

    public m5.b b(String str, String str2) {
        f0.a(this.f8430e.get(str.concat(str2)));
        f0.a(this.f8430e.get(str));
        f0.a(this.f8430e.get(str2));
        f0.a(this.f8430e.get(""));
        return null;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (this.f8429d || str.startsWith("about:")) {
            this.f8429d = false;
            if (this.f8428c) {
                webView.clearHistory();
                this.f8428c = false;
            }
            this.f8426a.f8400e.onPageFinishedLoading(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f8429d = true;
        this.f8426a.f8399d.g();
        this.f8426a.f8400e.onPageStarted(str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        org.apache.cordova.e eVar = this.f8426a.f8403h;
        if (eVar == null || !eVar.o(null, new CordovaClientCertRequest(clientCertRequest))) {
            super.onReceivedClientCertRequest(webView, clientCertRequest);
        } else {
            this.f8426a.f8400e.clearLoadTimeoutTimer();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i6, String str, String str2) {
        if (this.f8429d) {
            o.b("SystemWebViewClient", "CordovaWebViewClient.onReceivedError: Error code=%s Description=%s URL=%s", Integer.valueOf(i6), str, str2);
            if (i6 == -10) {
                this.f8426a.f8400e.clearLoadTimeoutTimer();
                if (webView.canGoBack()) {
                    webView.goBack();
                    return;
                }
                super.onReceivedError(webView, i6, str, str2);
            }
            this.f8426a.f8400e.onReceivedError(i6, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        b(str, str2);
        org.apache.cordova.e eVar = this.f8426a.f8403h;
        if (eVar == null || !eVar.p(null, new CordovaHttpAuthHandler(httpAuthHandler), str, str2)) {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        } else {
            this.f8426a.f8400e.clearLoadTimeoutTimer();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        try {
            if ((this.f8426a.f8402g.getActivity().getPackageManager().getApplicationInfo(this.f8426a.f8402g.getActivity().getPackageName(), 128).flags & 2) != 0) {
                sslErrorHandler.proceed();
            } else {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return this.f8427b.a(webResourceRequest.getUrl());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.f8426a.f8400e.onNavigationAttempt(str);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            if (!this.f8426a.f8403h.A(str)) {
                o.g("SystemWebViewClient", "URL blocked by allow list: " + str);
                return new WebResourceResponse("text/plain", "UTF-8", null);
            }
            org.apache.cordova.c cVar = this.f8426a.f8404i;
            Uri parse = Uri.parse(str);
            Uri o6 = cVar.o(parse);
            if (parse.equals(o6) && !e(parse) && !d(parse)) {
                return null;
            }
            c.a k6 = cVar.k(o6, true);
            return new WebResourceResponse(k6.f8380c, "UTF-8", k6.f8379b);
        } catch (IOException e6) {
            if (!(e6 instanceof FileNotFoundException)) {
                o.d("SystemWebViewClient", "Error occurred while loading a file (returning a 404).", e6);
            }
            return new WebResourceResponse("text/plain", "UTF-8", null);
        }
    }
}
