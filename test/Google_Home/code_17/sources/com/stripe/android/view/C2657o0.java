package com.stripe.android.view;

import O5.s;
import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import u2.InterfaceC4057d;

/* renamed from: com.stripe.android.view.o0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2657o0 extends WebViewClient {

    /* renamed from: i, reason: collision with root package name */
    public static final a f28938i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f28939j = 8;

    /* renamed from: k, reason: collision with root package name */
    private static final Set f28940k = P5.a0.d("https://hooks.stripe.com/three_d_secure/authenticate");

    /* renamed from: l, reason: collision with root package name */
    private static final Set f28941l = P5.a0.i("https://hooks.stripe.com/redirect/complete/", "https://hooks.stripe.com/3d_secure/complete/", "https://hooks.stripe.com/3d_secure_2/hosted/complete");

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4057d f28942a;

    /* renamed from: b, reason: collision with root package name */
    private final o6.w f28943b;

    /* renamed from: c, reason: collision with root package name */
    private final String f28944c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1 f28945d;

    /* renamed from: e, reason: collision with root package name */
    private final Function1 f28946e;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f28947f;

    /* renamed from: g, reason: collision with root package name */
    private String f28948g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f28949h;

    /* renamed from: com.stripe.android.view.o0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(String str) {
            Set set = C2657o0.f28940k;
            if ((set instanceof Collection) && set.isEmpty()) {
                return false;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (j6.n.C(str, (String) it.next(), false, 2, null)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean c(String url) {
            AbstractC3255y.i(url, "url");
            Set set = C2657o0.f28941l;
            if ((set instanceof Collection) && set.isEmpty()) {
                return false;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (j6.n.C(url, (String) it.next(), false, 2, null)) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C2657o0(InterfaceC4057d logger, o6.w isPageLoaded, String clientSecret, String str, Function1 activityStarter, Function1 activityFinisher) {
        Uri uri;
        AbstractC3255y.i(logger, "logger");
        AbstractC3255y.i(isPageLoaded, "isPageLoaded");
        AbstractC3255y.i(clientSecret, "clientSecret");
        AbstractC3255y.i(activityStarter, "activityStarter");
        AbstractC3255y.i(activityFinisher, "activityFinisher");
        this.f28942a = logger;
        this.f28943b = isPageLoaded;
        this.f28944c = clientSecret;
        this.f28945d = activityStarter;
        this.f28946e = activityFinisher;
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        this.f28947f = uri;
    }

    private final void c() {
        this.f28942a.b("PaymentAuthWebViewClient#hideProgressBar()");
        this.f28943b.setValue(Boolean.TRUE);
    }

    private final boolean d(Uri uri) {
        if (!AbstractC3255y.d("stripejs://use_stripe_sdk/return_url", uri.toString())) {
            String uri2 = uri.toString();
            AbstractC3255y.h(uri2, "toString(...)");
            if (!j6.n.C(uri2, "stripesdk://payment_return_url/", false, 2, null)) {
                return false;
            }
        }
        return true;
    }

    private final boolean e(Uri uri) {
        String str;
        this.f28942a.b("PaymentAuthWebViewClient#isReturnUrl()");
        if (d(uri)) {
            return true;
        }
        Uri uri2 = this.f28947f;
        if (uri2 != null) {
            if (uri2.getScheme() != null && AbstractC3255y.d(this.f28947f.getScheme(), uri.getScheme()) && this.f28947f.getHost() != null && AbstractC3255y.d(this.f28947f.getHost(), uri.getHost())) {
                return true;
            }
            return false;
        }
        if (uri.isOpaque()) {
            return false;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames.contains("payment_intent_client_secret")) {
            str = uri.getQueryParameter("payment_intent_client_secret");
        } else if (queryParameterNames.contains("setup_intent_client_secret")) {
            str = uri.getQueryParameter("setup_intent_client_secret");
        } else {
            str = null;
        }
        return AbstractC3255y.d(this.f28944c, str);
    }

    private final void f(Throwable th) {
        this.f28942a.b("PaymentAuthWebViewClient#onAuthCompleted()");
        this.f28946e.invoke(th);
    }

    static /* synthetic */ void g(C2657o0 c2657o0, Throwable th, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            th = null;
        }
        c2657o0.f(th);
    }

    private final void h(Intent intent) {
        Object b8;
        this.f28942a.b("PaymentAuthWebViewClient#openIntent()");
        try {
            s.a aVar = O5.s.f8302b;
            this.f28945d.invoke(intent);
            b8 = O5.s.b(O5.I.f8278a);
        } catch (Throwable th) {
            s.a aVar2 = O5.s.f8302b;
            b8 = O5.s.b(O5.t.a(th));
        }
        Throwable e8 = O5.s.e(b8);
        if (e8 != null) {
            this.f28942a.a("Failed to start Intent.", e8);
            if (!AbstractC3255y.d(intent.getScheme(), "alipays")) {
                f(e8);
            }
        }
    }

    private final void i(Uri uri) {
        Object b8;
        this.f28942a.b("PaymentAuthWebViewClient#openIntentScheme()");
        try {
            s.a aVar = O5.s.f8302b;
            Intent parseUri = Intent.parseUri(uri.toString(), 1);
            AbstractC3255y.h(parseUri, "parseUri(...)");
            h(parseUri);
            b8 = O5.s.b(O5.I.f8278a);
        } catch (Throwable th) {
            s.a aVar2 = O5.s.f8302b;
            b8 = O5.s.b(O5.t.a(th));
        }
        Throwable e8 = O5.s.e(b8);
        if (e8 != null) {
            this.f28942a.a("Failed to start Intent.", e8);
            f(e8);
        }
    }

    private final void k(Uri uri) {
        String str;
        this.f28942a.b("PaymentAuthWebViewClient#updateCompletionUrl()");
        a aVar = f28938i;
        String uri2 = uri.toString();
        AbstractC3255y.h(uri2, "toString(...)");
        if (aVar.b(uri2)) {
            str = uri.getQueryParameter("return_url");
        } else {
            str = null;
        }
        if (str != null && !j6.n.u(str)) {
            this.f28948g = str;
        }
    }

    public final void j(boolean z8) {
        this.f28949h = z8;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String str) {
        AbstractC3255y.i(view, "view");
        this.f28942a.b("PaymentAuthWebViewClient#onPageFinished() - " + str);
        super.onPageFinished(view, str);
        if (!this.f28949h) {
            c();
        }
        if (str != null && f28938i.c(str)) {
            this.f28942a.b(str + " is a completion URL");
            g(this, null, 1, null);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        AbstractC3255y.i(view, "view");
        AbstractC3255y.i(request, "request");
        Uri url = request.getUrl();
        this.f28942a.b("PaymentAuthWebViewClient#shouldOverrideUrlLoading(): " + url);
        AbstractC3255y.f(url);
        k(url);
        if (e(url)) {
            this.f28942a.b("PaymentAuthWebViewClient#shouldOverrideUrlLoading() - handle return URL");
            g(this, null, 1, null);
            return true;
        }
        if (j6.n.s("intent", url.getScheme(), true)) {
            i(url);
            return true;
        }
        if (!URLUtil.isNetworkUrl(url.toString())) {
            h(new Intent("android.intent.action.VIEW", url));
            return true;
        }
        return super.shouldOverrideUrlLoading(view, request);
    }
}
