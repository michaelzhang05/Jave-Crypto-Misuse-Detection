package com.stripe.android.view;

import L5.s;
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
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import r2.InterfaceC3684d;

/* renamed from: com.stripe.android.view.o0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2463o0 extends WebViewClient {

    /* renamed from: i, reason: collision with root package name */
    public static final a f27883i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f27884j = 8;

    /* renamed from: k, reason: collision with root package name */
    private static final Set f27885k = M5.a0.d("https://hooks.stripe.com/three_d_secure/authenticate");

    /* renamed from: l, reason: collision with root package name */
    private static final Set f27886l = M5.a0.i("https://hooks.stripe.com/redirect/complete/", "https://hooks.stripe.com/3d_secure/complete/", "https://hooks.stripe.com/3d_secure_2/hosted/complete");

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3684d f27887a;

    /* renamed from: b, reason: collision with root package name */
    private final l6.v f27888b;

    /* renamed from: c, reason: collision with root package name */
    private final String f27889c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1 f27890d;

    /* renamed from: e, reason: collision with root package name */
    private final Function1 f27891e;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f27892f;

    /* renamed from: g, reason: collision with root package name */
    private String f27893g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f27894h;

    /* renamed from: com.stripe.android.view.o0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(String str) {
            Set set = C2463o0.f27885k;
            if ((set instanceof Collection) && set.isEmpty()) {
                return false;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (g6.n.C(str, (String) it.next(), false, 2, null)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean c(String url) {
            AbstractC3159y.i(url, "url");
            Set set = C2463o0.f27886l;
            if ((set instanceof Collection) && set.isEmpty()) {
                return false;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (g6.n.C(url, (String) it.next(), false, 2, null)) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C2463o0(InterfaceC3684d logger, l6.v isPageLoaded, String clientSecret, String str, Function1 activityStarter, Function1 activityFinisher) {
        Uri uri;
        AbstractC3159y.i(logger, "logger");
        AbstractC3159y.i(isPageLoaded, "isPageLoaded");
        AbstractC3159y.i(clientSecret, "clientSecret");
        AbstractC3159y.i(activityStarter, "activityStarter");
        AbstractC3159y.i(activityFinisher, "activityFinisher");
        this.f27887a = logger;
        this.f27888b = isPageLoaded;
        this.f27889c = clientSecret;
        this.f27890d = activityStarter;
        this.f27891e = activityFinisher;
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        this.f27892f = uri;
    }

    private final void c() {
        this.f27887a.b("PaymentAuthWebViewClient#hideProgressBar()");
        this.f27888b.setValue(Boolean.TRUE);
    }

    private final boolean d(Uri uri) {
        if (!AbstractC3159y.d("stripejs://use_stripe_sdk/return_url", uri.toString())) {
            String uri2 = uri.toString();
            AbstractC3159y.h(uri2, "toString(...)");
            if (!g6.n.C(uri2, "stripesdk://payment_return_url/", false, 2, null)) {
                return false;
            }
        }
        return true;
    }

    private final boolean e(Uri uri) {
        String str;
        this.f27887a.b("PaymentAuthWebViewClient#isReturnUrl()");
        if (d(uri)) {
            return true;
        }
        Uri uri2 = this.f27892f;
        if (uri2 != null) {
            if (uri2.getScheme() != null && AbstractC3159y.d(this.f27892f.getScheme(), uri.getScheme()) && this.f27892f.getHost() != null && AbstractC3159y.d(this.f27892f.getHost(), uri.getHost())) {
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
        return AbstractC3159y.d(this.f27889c, str);
    }

    private final void f(Throwable th) {
        this.f27887a.b("PaymentAuthWebViewClient#onAuthCompleted()");
        this.f27891e.invoke(th);
    }

    static /* synthetic */ void g(C2463o0 c2463o0, Throwable th, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            th = null;
        }
        c2463o0.f(th);
    }

    private final void h(Intent intent) {
        Object b8;
        this.f27887a.b("PaymentAuthWebViewClient#openIntent()");
        try {
            s.a aVar = L5.s.f6511b;
            this.f27890d.invoke(intent);
            b8 = L5.s.b(L5.I.f6487a);
        } catch (Throwable th) {
            s.a aVar2 = L5.s.f6511b;
            b8 = L5.s.b(L5.t.a(th));
        }
        Throwable e8 = L5.s.e(b8);
        if (e8 != null) {
            this.f27887a.a("Failed to start Intent.", e8);
            if (!AbstractC3159y.d(intent.getScheme(), "alipays")) {
                f(e8);
            }
        }
    }

    private final void i(Uri uri) {
        Object b8;
        this.f27887a.b("PaymentAuthWebViewClient#openIntentScheme()");
        try {
            s.a aVar = L5.s.f6511b;
            Intent parseUri = Intent.parseUri(uri.toString(), 1);
            AbstractC3159y.h(parseUri, "parseUri(...)");
            h(parseUri);
            b8 = L5.s.b(L5.I.f6487a);
        } catch (Throwable th) {
            s.a aVar2 = L5.s.f6511b;
            b8 = L5.s.b(L5.t.a(th));
        }
        Throwable e8 = L5.s.e(b8);
        if (e8 != null) {
            this.f27887a.a("Failed to start Intent.", e8);
            f(e8);
        }
    }

    private final void k(Uri uri) {
        String str;
        this.f27887a.b("PaymentAuthWebViewClient#updateCompletionUrl()");
        a aVar = f27883i;
        String uri2 = uri.toString();
        AbstractC3159y.h(uri2, "toString(...)");
        if (aVar.b(uri2)) {
            str = uri.getQueryParameter("return_url");
        } else {
            str = null;
        }
        if (str != null && !g6.n.u(str)) {
            this.f27893g = str;
        }
    }

    public final void j(boolean z8) {
        this.f27894h = z8;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String str) {
        AbstractC3159y.i(view, "view");
        this.f27887a.b("PaymentAuthWebViewClient#onPageFinished() - " + str);
        super.onPageFinished(view, str);
        if (!this.f27894h) {
            c();
        }
        if (str != null && f27883i.c(str)) {
            this.f27887a.b(str + " is a completion URL");
            g(this, null, 1, null);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        AbstractC3159y.i(view, "view");
        AbstractC3159y.i(request, "request");
        Uri url = request.getUrl();
        this.f27887a.b("PaymentAuthWebViewClient#shouldOverrideUrlLoading(): " + url);
        AbstractC3159y.f(url);
        k(url);
        if (e(url)) {
            this.f27887a.b("PaymentAuthWebViewClient#shouldOverrideUrlLoading() - handle return URL");
            g(this, null, 1, null);
            return true;
        }
        if (g6.n.s("intent", url.getScheme(), true)) {
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
