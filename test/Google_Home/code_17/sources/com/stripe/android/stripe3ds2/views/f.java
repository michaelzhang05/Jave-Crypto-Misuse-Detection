package com.stripe.android.stripe3ds2.views;

import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import j6.n;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class f extends WebViewClient {

    /* renamed from: b, reason: collision with root package name */
    public static final a f28158b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private b f28159a;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(String str);
    }

    public final void a(Uri uri) {
        b bVar;
        AbstractC3255y.i(uri, "uri");
        String uri2 = uri.toString();
        AbstractC3255y.h(uri2, "toString(...)");
        Locale ENGLISH = Locale.ENGLISH;
        AbstractC3255y.h(ENGLISH, "ENGLISH");
        String lowerCase = uri2.toLowerCase(ENGLISH);
        AbstractC3255y.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (n.C(lowerCase, "https://emv3ds/challenge", false, 2, null) && (bVar = this.f28159a) != null) {
            bVar.a(uri.getQuery());
        }
    }

    public final void b(b bVar) {
        this.f28159a = bVar;
    }

    public final boolean c(Uri uri) {
        AbstractC3255y.i(uri, "uri");
        return URLUtil.isDataUrl(uri.toString());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        AbstractC3255y.i(view, "view");
        AbstractC3255y.i(request, "request");
        Uri url = request.getUrl();
        AbstractC3255y.h(url, "getUrl(...)");
        a(url);
        Uri url2 = request.getUrl();
        AbstractC3255y.h(url2, "getUrl(...)");
        if (c(url2)) {
            return super.shouldInterceptRequest(view, request);
        }
        return new WebResourceResponse(null, null, null);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        AbstractC3255y.i(view, "view");
        AbstractC3255y.i(request, "request");
        Uri url = request.getUrl();
        AbstractC3255y.h(url, "getUrl(...)");
        a(url);
        return true;
    }
}
