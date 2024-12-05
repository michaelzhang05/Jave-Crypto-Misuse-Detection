package com.stripe.android.view;

import L5.InterfaceC1227k;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import e6.InterfaceC2643c;
import f3.C2662c;
import i6.C2812b0;
import j2.C3057I;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import r2.InterfaceC3684d;
import x2.C3866D;
import x2.C3872b;
import x2.InterfaceC3873c;

/* renamed from: com.stripe.android.view.n0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2461n0 extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final PaymentBrowserAuthContract.a f27870a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3873c f27871b;

    /* renamed from: c, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f27872c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1227k f27873d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f27874e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ b f27875f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f27876g;

    /* renamed from: com.stripe.android.view.n0$a */
    /* loaded from: classes4.dex */
    public static final class a implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Application f27877a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3684d f27878b;

        /* renamed from: c, reason: collision with root package name */
        private final PaymentBrowserAuthContract.a f27879c;

        public a(Application application, InterfaceC3684d logger, PaymentBrowserAuthContract.a args) {
            AbstractC3159y.i(application, "application");
            AbstractC3159y.i(logger, "logger");
            AbstractC3159y.i(args, "args");
            this.f27877a = application;
            this.f27878b = logger;
            this.f27879c = args;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2643c interfaceC2643c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC2643c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return androidx.lifecycle.n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3159y.i(modelClass, "modelClass");
            return new C2461n0(this.f27879c, new x2.m(this.f27878b, C2812b0.b()), new PaymentAnalyticsRequestFactory(this.f27877a, this.f27879c.i(), M5.a0.d("PaymentAuthWebViewActivity")));
        }
    }

    /* renamed from: com.stripe.android.view.n0$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f27880a;

        /* renamed from: b, reason: collision with root package name */
        private final T3.k f27881b;

        public b(String text, T3.k toolbarCustomization) {
            AbstractC3159y.i(text, "text");
            AbstractC3159y.i(toolbarCustomization, "toolbarCustomization");
            this.f27880a = text;
            this.f27881b = toolbarCustomization;
        }

        public final String a() {
            return this.f27880a;
        }

        public final T3.k b() {
            return this.f27881b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f27880a, bVar.f27880a) && AbstractC3159y.d(this.f27881b, bVar.f27881b);
        }

        public int hashCode() {
            return (this.f27880a.hashCode() * 31) + this.f27881b.hashCode();
        }

        public String toString() {
            return "ToolbarTitleData(text=" + this.f27880a + ", toolbarCustomization=" + this.f27881b + ")";
        }
    }

    /* renamed from: com.stripe.android.view.n0$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map invoke() {
            C2461n0 c2461n0 = C2461n0.this;
            Map c8 = M5.Q.c();
            if (c2461n0.f27870a.j() != null) {
                c8.put("Referer", c2461n0.f27870a.j());
            }
            return M5.Q.q(new C3866D(null, 1, null).a(C3057I.f32934f.b()), M5.Q.b(c8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2461n0(com.stripe.android.auth.PaymentBrowserAuthContract.a r3, x2.InterfaceC3873c r4, com.stripe.android.networking.PaymentAnalyticsRequestFactory r5) {
        /*
            r2 = this;
            java.lang.String r0 = "args"
            kotlin.jvm.internal.AbstractC3159y.i(r3, r0)
            java.lang.String r0 = "analyticsRequestExecutor"
            kotlin.jvm.internal.AbstractC3159y.i(r4, r0)
            java.lang.String r0 = "paymentAnalyticsRequestFactory"
            kotlin.jvm.internal.AbstractC3159y.i(r5, r0)
            r2.<init>()
            r2.f27870a = r3
            r2.f27871b = r4
            r2.f27872c = r5
            com.stripe.android.view.n0$c r4 = new com.stripe.android.view.n0$c
            r4.<init>()
            L5.k r4 = L5.l.b(r4)
            r2.f27873d = r4
            T3.k r4 = r3.z()
            r5 = 0
            if (r4 == 0) goto L36
            java.lang.String r4 = r4.s()
            if (r4 == 0) goto L36
            boolean r0 = g6.n.u(r4)
            if (r0 == 0) goto L37
        L36:
            r4 = r5
        L37:
            r2.f27874e = r4
            T3.k r4 = r3.z()
            if (r4 == 0) goto L57
            java.lang.String r0 = r4.f()
            if (r0 == 0) goto L4b
            boolean r1 = g6.n.u(r0)
            if (r1 == 0) goto L4c
        L4b:
            r0 = r5
        L4c:
            if (r0 == 0) goto L57
            com.stripe.android.view.n0$b r1 = new com.stripe.android.view.n0$b
            kotlin.jvm.internal.AbstractC3159y.f(r0)
            r1.<init>(r0, r4)
            goto L58
        L57:
            r1 = r5
        L58:
            r2.f27875f = r1
            T3.k r3 = r3.z()
            if (r3 == 0) goto L64
            java.lang.String r5 = r3.e()
        L64:
            r2.f27876g = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2461n0.<init>(com.stripe.android.auth.PaymentBrowserAuthContract$a, x2.c, com.stripe.android.networking.PaymentAnalyticsRequestFactory):void");
    }

    private final void b(C3872b c3872b) {
        this.f27871b.a(c3872b);
    }

    public final String c() {
        return this.f27874e;
    }

    public final /* synthetic */ Intent d() {
        int i8;
        Intent intent = new Intent();
        C2662c f8 = f();
        if (this.f27870a.n()) {
            i8 = 3;
        } else {
            i8 = 1;
        }
        Intent putExtras = intent.putExtras(C2662c.c(f8, null, i8, null, this.f27870a.o(), null, null, null, 117, null).o());
        AbstractC3159y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    public final Map e() {
        return (Map) this.f27873d.getValue();
    }

    public final /* synthetic */ C2662c f() {
        String d8 = this.f27870a.d();
        String lastPathSegment = Uri.parse(this.f27870a.G()).getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        return new C2662c(d8, 0, null, false, lastPathSegment, null, this.f27870a.u(), 46, null);
    }

    public final String g() {
        return this.f27876g;
    }

    public final b h() {
        return this.f27875f;
    }

    public final void i() {
        b(PaymentAnalyticsRequestFactory.v(this.f27872c, PaymentAnalyticsEvent.f24821J, null, null, null, null, null, 62, null));
    }

    public final void j() {
        b(PaymentAnalyticsRequestFactory.v(this.f27872c, PaymentAnalyticsEvent.f24820I, null, null, null, null, null, 62, null));
    }

    public final void k() {
        b(PaymentAnalyticsRequestFactory.v(this.f27872c, PaymentAnalyticsEvent.f24819H, null, null, null, null, null, 62, null));
        b(PaymentAnalyticsRequestFactory.v(this.f27872c, PaymentAnalyticsEvent.f24822K, null, null, null, null, null, 62, null));
    }
}
