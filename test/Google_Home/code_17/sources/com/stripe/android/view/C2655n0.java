package com.stripe.android.view;

import A2.C0944b;
import A2.InterfaceC0945c;
import O5.InterfaceC1355k;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import h6.InterfaceC2963c;
import i3.C2980c;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.C3347b0;
import m2.C3411I;
import u2.InterfaceC4057d;

/* renamed from: com.stripe.android.view.n0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2655n0 extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final PaymentBrowserAuthContract.a f28925a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0945c f28926b;

    /* renamed from: c, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f28927c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1355k f28928d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f28929e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ b f28930f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f28931g;

    /* renamed from: com.stripe.android.view.n0$a */
    /* loaded from: classes4.dex */
    public static final class a implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Application f28932a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC4057d f28933b;

        /* renamed from: c, reason: collision with root package name */
        private final PaymentBrowserAuthContract.a f28934c;

        public a(Application application, InterfaceC4057d logger, PaymentBrowserAuthContract.a args) {
            AbstractC3255y.i(application, "application");
            AbstractC3255y.i(logger, "logger");
            AbstractC3255y.i(args, "args");
            this.f28932a = application;
            this.f28933b = logger;
            this.f28934c = args;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2963c interfaceC2963c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC2963c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return androidx.lifecycle.n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3255y.i(modelClass, "modelClass");
            return new C2655n0(this.f28934c, new A2.m(this.f28933b, C3347b0.b()), new PaymentAnalyticsRequestFactory(this.f28932a, this.f28934c.i(), P5.a0.d("PaymentAuthWebViewActivity")));
        }
    }

    /* renamed from: com.stripe.android.view.n0$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f28935a;

        /* renamed from: b, reason: collision with root package name */
        private final W3.k f28936b;

        public b(String text, W3.k toolbarCustomization) {
            AbstractC3255y.i(text, "text");
            AbstractC3255y.i(toolbarCustomization, "toolbarCustomization");
            this.f28935a = text;
            this.f28936b = toolbarCustomization;
        }

        public final String a() {
            return this.f28935a;
        }

        public final W3.k b() {
            return this.f28936b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3255y.d(this.f28935a, bVar.f28935a) && AbstractC3255y.d(this.f28936b, bVar.f28936b);
        }

        public int hashCode() {
            return (this.f28935a.hashCode() * 31) + this.f28936b.hashCode();
        }

        public String toString() {
            return "ToolbarTitleData(text=" + this.f28935a + ", toolbarCustomization=" + this.f28936b + ")";
        }
    }

    /* renamed from: com.stripe.android.view.n0$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map invoke() {
            C2655n0 c2655n0 = C2655n0.this;
            Map c8 = P5.Q.c();
            if (c2655n0.f28925a.l() != null) {
                c8.put("Referer", c2655n0.f28925a.l());
            }
            return P5.Q.q(new A2.D(null, 1, null).a(C3411I.f34910f.b()), P5.Q.b(c8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2655n0(com.stripe.android.auth.PaymentBrowserAuthContract.a r3, A2.InterfaceC0945c r4, com.stripe.android.networking.PaymentAnalyticsRequestFactory r5) {
        /*
            r2 = this;
            java.lang.String r0 = "args"
            kotlin.jvm.internal.AbstractC3255y.i(r3, r0)
            java.lang.String r0 = "analyticsRequestExecutor"
            kotlin.jvm.internal.AbstractC3255y.i(r4, r0)
            java.lang.String r0 = "paymentAnalyticsRequestFactory"
            kotlin.jvm.internal.AbstractC3255y.i(r5, r0)
            r2.<init>()
            r2.f28925a = r3
            r2.f28926b = r4
            r2.f28927c = r5
            com.stripe.android.view.n0$c r4 = new com.stripe.android.view.n0$c
            r4.<init>()
            O5.k r4 = O5.l.b(r4)
            r2.f28928d = r4
            W3.k r4 = r3.x()
            r5 = 0
            if (r4 == 0) goto L36
            java.lang.String r4 = r4.v()
            if (r4 == 0) goto L36
            boolean r0 = j6.n.u(r4)
            if (r0 == 0) goto L37
        L36:
            r4 = r5
        L37:
            r2.f28929e = r4
            W3.k r4 = r3.x()
            if (r4 == 0) goto L57
            java.lang.String r0 = r4.h()
            if (r0 == 0) goto L4b
            boolean r1 = j6.n.u(r0)
            if (r1 == 0) goto L4c
        L4b:
            r0 = r5
        L4c:
            if (r0 == 0) goto L57
            com.stripe.android.view.n0$b r1 = new com.stripe.android.view.n0$b
            kotlin.jvm.internal.AbstractC3255y.f(r0)
            r1.<init>(r0, r4)
            goto L58
        L57:
            r1 = r5
        L58:
            r2.f28930f = r1
            W3.k r3 = r3.x()
            if (r3 == 0) goto L64
            java.lang.String r5 = r3.g()
        L64:
            r2.f28931g = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2655n0.<init>(com.stripe.android.auth.PaymentBrowserAuthContract$a, A2.c, com.stripe.android.networking.PaymentAnalyticsRequestFactory):void");
    }

    private final void b(C0944b c0944b) {
        this.f28926b.a(c0944b);
    }

    public final String c() {
        return this.f28929e;
    }

    public final /* synthetic */ Intent d() {
        int i8;
        Intent intent = new Intent();
        C2980c f8 = f();
        if (this.f28925a.s()) {
            i8 = 3;
        } else {
            i8 = 1;
        }
        Intent putExtras = intent.putExtras(C2980c.b(f8, null, i8, null, this.f28925a.u(), null, null, null, 117, null).u());
        AbstractC3255y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    public final Map e() {
        return (Map) this.f28928d.getValue();
    }

    public final /* synthetic */ C2980c f() {
        String d8 = this.f28925a.d();
        String lastPathSegment = Uri.parse(this.f28925a.y()).getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        return new C2980c(d8, 0, null, false, lastPathSegment, null, this.f28925a.w(), 46, null);
    }

    public final String g() {
        return this.f28931g;
    }

    public final b h() {
        return this.f28930f;
    }

    public final void i() {
        b(PaymentAnalyticsRequestFactory.v(this.f28927c, PaymentAnalyticsEvent.f25876J, null, null, null, null, null, 62, null));
    }

    public final void j() {
        b(PaymentAnalyticsRequestFactory.v(this.f28927c, PaymentAnalyticsEvent.f25875I, null, null, null, null, null, 62, null));
    }

    public final void k() {
        b(PaymentAnalyticsRequestFactory.v(this.f28927c, PaymentAnalyticsEvent.f25874H, null, null, null, null, null, 62, null));
        b(PaymentAnalyticsRequestFactory.v(this.f28927c, PaymentAnalyticsEvent.f25877K, null, null, null, null, null, 62, null));
    }
}
