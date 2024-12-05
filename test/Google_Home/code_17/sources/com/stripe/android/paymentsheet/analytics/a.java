package com.stripe.android.paymentsheet.analytics;

import A2.InterfaceC0945c;
import B3.f;
import D2.d;
import O5.I;
import O5.p;
import O5.t;
import S5.g;
import a6.InterfaceC1668n;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.analytics.c;
import com.stripe.android.paymentsheet.u;
import e3.EnumC2791e;
import e3.y;
import java.util.List;
import k6.C3225a;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.M;
import l6.N;
import t3.EnumC4032f;
import w3.AbstractC4146b;
import w3.AbstractC4147c;

/* loaded from: classes4.dex */
public final class a implements EventReporter {

    /* renamed from: a, reason: collision with root package name */
    private final EventReporter.Mode f26787a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0945c f26788b;

    /* renamed from: c, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f26789c;

    /* renamed from: d, reason: collision with root package name */
    private final d f26790d;

    /* renamed from: e, reason: collision with root package name */
    private final g f26791e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f26792f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f26793g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f26794h;

    /* renamed from: i, reason: collision with root package name */
    private String f26795i;

    /* renamed from: com.stripe.android.paymentsheet.analytics.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C0597a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26796a;

        static {
            int[] iArr = new int[EventReporter.a.values().length];
            try {
                iArr[EventReporter.a.f26784b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventReporter.a.f26783a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26796a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26797a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f26799c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c cVar, S5.d dVar) {
            super(2, dVar);
            this.f26799c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f26799c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f26797a == 0) {
                t.b(obj);
                InterfaceC0945c interfaceC0945c = a.this.f26788b;
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = a.this.f26789c;
                c cVar = this.f26799c;
                interfaceC0945c.a(paymentAnalyticsRequestFactory.g(cVar, cVar.e()));
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public a(EventReporter.Mode mode, InterfaceC0945c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, d durationProvider, g workContext) {
        AbstractC3255y.i(mode, "mode");
        AbstractC3255y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3255y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3255y.i(durationProvider, "durationProvider");
        AbstractC3255y.i(workContext, "workContext");
        this.f26787a = mode;
        this.f26788b = analyticsRequestExecutor;
        this.f26789c = paymentAnalyticsRequestFactory;
        this.f26790d = durationProvider;
        this.f26791e = workContext;
    }

    private final void A(c cVar) {
        AbstractC3364k.d(N.a(this.f26791e), null, null, new b(cVar, null), 3, null);
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void a() {
        A(new c.C0598c(this.f26792f, this.f26793g, this.f26794h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void b(EnumC2791e selectedBrand) {
        AbstractC3255y.i(selectedBrand, "selectedBrand");
        A(new c.y(selectedBrand, this.f26792f, this.f26793g, this.f26794h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void c(EnumC2791e selectedBrand, Throwable error) {
        AbstractC3255y.i(selectedBrand, "selectedBrand");
        AbstractC3255y.i(error, "error");
        A(new c.x(selectedBrand, error, this.f26792f, this.f26793g, this.f26794h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void d(EventReporter.a source, EnumC2791e enumC2791e) {
        c.h.a aVar;
        AbstractC3255y.i(source, "source");
        int i8 = C0597a.f26796a[source.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                aVar = c.h.a.f26841b;
            } else {
                throw new p();
            }
        } else {
            aVar = c.h.a.f26842c;
        }
        A(new c.h(aVar, enumC2791e, this.f26792f, this.f26793g, this.f26794h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void e() {
        A(new c.t(this.f26787a, this.f26795i, this.f26792f, this.f26793g, this.f26794h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void f(String type) {
        AbstractC3255y.i(type, "type");
        A(new c.a(type, this.f26792f, this.f26793g, this.f26794h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void g() {
        A(new c.s(this.f26792f, this.f26793g, this.f26794h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void h(String code) {
        AbstractC3255y.i(code, "code");
        A(new c.q(code, this.f26795i, this.f26792f, this.f26793g, this.f26794h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void i(f paymentSelection) {
        AbstractC3255y.i(paymentSelection, "paymentSelection");
        A(new c.r(this.f26787a, paymentSelection, this.f26795i, this.f26792f, this.f26793g, this.f26794h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void j(f fVar) {
        A(new c.p(this.f26795i, this.f26790d.a(d.b.f1783d), AbstractC4147c.c(fVar), AbstractC4147c.e(fVar), this.f26792f, this.f26793g, this.f26794h, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void k(boolean z8) {
        d.a.a(this.f26790d, d.b.f1780a, false, 2, null);
        A(new c.k(this.f26792f, this.f26793g, this.f26794h, z8));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void l(u.g configuration, boolean z8) {
        AbstractC3255y.i(configuration, "configuration");
        this.f26792f = z8;
        A(new c.i(this.f26787a, configuration, z8, this.f26793g, this.f26794h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void m(f fVar, y yVar, boolean z8, String str, u.l initializationMode, List orderedLpms) {
        boolean z9;
        AbstractC3255y.i(initializationMode, "initializationMode");
        AbstractC3255y.i(orderedLpms, "orderedLpms");
        this.f26795i = str;
        if (yVar != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f26793g = z9;
        this.f26794h = z8;
        d.a.a(this.f26790d, d.b.f1781b, false, 2, null);
        A(new c.l(fVar, initializationMode, orderedLpms, this.f26790d.a(d.b.f1780a), yVar, this.f26792f, z8, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void n(Throwable error) {
        AbstractC3255y.i(error, "error");
        A(new c.f(error, this.f26792f, this.f26793g, this.f26794h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void o(f fVar, AbstractC4146b error) {
        AbstractC3255y.i(error, "error");
        A(new c.n(this.f26787a, new c.n.a.b(error), this.f26790d.a(d.b.f1781b), fVar, this.f26795i, this.f26792f, this.f26793g, this.f26794h, null, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onDismiss() {
        A(new c.e(this.f26792f, this.f26793g, this.f26794h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void p(EventReporter.a source, EnumC2791e selectedBrand) {
        c.v.a aVar;
        AbstractC3255y.i(source, "source");
        AbstractC3255y.i(selectedBrand, "selectedBrand");
        int i8 = C0597a.f26796a[source.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                aVar = c.v.a.f26921b;
            } else {
                throw new p();
            }
        } else {
            aVar = c.v.a.f26922c;
        }
        A(new c.v(aVar, selectedBrand, this.f26792f, this.f26793g, this.f26794h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void q(String code) {
        AbstractC3255y.i(code, "code");
        d.a.a(this.f26790d, d.b.f1783d, false, 2, null);
        A(new c.w(code, this.f26792f, this.f26793g, this.f26794h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void r(Throwable error) {
        AbstractC3255y.i(error, "error");
        A(new c.j(this.f26790d.a(d.b.f1780a), error, this.f26792f, this.f26793g, this.f26794h, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void s(String str) {
        A(new c.m(this.f26792f, this.f26793g, this.f26794h, str));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void t() {
        A(new c.u(this.f26787a, this.f26795i, this.f26792f, this.f26793g, this.f26794h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void u(f fVar, EnumC4032f enumC4032f) {
        f.C0009f c0009f;
        f fVar2;
        boolean z8;
        f.C0009f.b p8;
        f b8;
        if (fVar instanceof f.C0009f) {
            c0009f = (f.C0009f) fVar;
        } else {
            c0009f = null;
        }
        if (c0009f != null && (p8 = c0009f.p()) != null && (b8 = p8.b()) != null) {
            fVar2 = b8;
        } else {
            fVar2 = fVar;
        }
        C3225a a8 = this.f26790d.a(d.b.f1781b);
        EventReporter.Mode mode = this.f26787a;
        c.n.a.C0600c c0600c = c.n.a.C0600c.f26880a;
        String str = this.f26795i;
        if (enumC4032f != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        A(new c.n(mode, c0600c, a8, fVar2, str, z8, this.f26793g, this.f26794h, enumC4032f, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void v() {
        A(new c.b(this.f26787a));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void w() {
        A(new c.g(this.f26792f, this.f26793g, this.f26794h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void x(String code) {
        AbstractC3255y.i(code, "code");
        A(new c.o(code, this.f26792f, this.f26793g, this.f26794h));
    }
}
