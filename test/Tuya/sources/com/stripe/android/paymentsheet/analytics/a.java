package com.stripe.android.paymentsheet.analytics;

import A2.d;
import L5.I;
import L5.p;
import L5.t;
import P5.g;
import X5.n;
import b3.EnumC1870e;
import b3.y;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.analytics.c;
import com.stripe.android.paymentsheet.u;
import h6.C2758a;
import i6.AbstractC2829k;
import i6.M;
import i6.N;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3159y;
import q3.EnumC3653f;
import t3.AbstractC3792b;
import t3.AbstractC3793c;
import x2.InterfaceC3873c;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public final class a implements EventReporter {

    /* renamed from: a, reason: collision with root package name */
    private final EventReporter.Mode f25732a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3873c f25733b;

    /* renamed from: c, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f25734c;

    /* renamed from: d, reason: collision with root package name */
    private final d f25735d;

    /* renamed from: e, reason: collision with root package name */
    private final g f25736e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f25737f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f25738g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f25739h;

    /* renamed from: i, reason: collision with root package name */
    private String f25740i;

    /* renamed from: com.stripe.android.paymentsheet.analytics.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C0601a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25741a;

        static {
            int[] iArr = new int[EventReporter.a.values().length];
            try {
                iArr[EventReporter.a.f25729b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventReporter.a.f25728a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25741a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f25742a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f25744c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c cVar, P5.d dVar) {
            super(2, dVar);
            this.f25744c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f25744c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f25742a == 0) {
                t.b(obj);
                InterfaceC3873c interfaceC3873c = a.this.f25733b;
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = a.this.f25734c;
                c cVar = this.f25744c;
                interfaceC3873c.a(paymentAnalyticsRequestFactory.g(cVar, cVar.e()));
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public a(EventReporter.Mode mode, InterfaceC3873c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, d durationProvider, g workContext) {
        AbstractC3159y.i(mode, "mode");
        AbstractC3159y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3159y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3159y.i(durationProvider, "durationProvider");
        AbstractC3159y.i(workContext, "workContext");
        this.f25732a = mode;
        this.f25733b = analyticsRequestExecutor;
        this.f25734c = paymentAnalyticsRequestFactory;
        this.f25735d = durationProvider;
        this.f25736e = workContext;
    }

    private final void A(c cVar) {
        AbstractC2829k.d(N.a(this.f25736e), null, null, new b(cVar, null), 3, null);
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void a() {
        A(new c.C0602c(this.f25737f, this.f25738g, this.f25739h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void b(EnumC1870e selectedBrand, Throwable error) {
        AbstractC3159y.i(selectedBrand, "selectedBrand");
        AbstractC3159y.i(error, "error");
        A(new c.x(selectedBrand, error, this.f25737f, this.f25738g, this.f25739h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void c(EnumC1870e selectedBrand) {
        AbstractC3159y.i(selectedBrand, "selectedBrand");
        A(new c.y(selectedBrand, this.f25737f, this.f25738g, this.f25739h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void d() {
        A(new c.t(this.f25732a, this.f25740i, this.f25737f, this.f25738g, this.f25739h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void e(String type) {
        AbstractC3159y.i(type, "type");
        A(new c.a(type, this.f25737f, this.f25738g, this.f25739h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void f() {
        A(new c.s(this.f25737f, this.f25738g, this.f25739h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void g(AbstractC3991f abstractC3991f, AbstractC3792b error) {
        AbstractC3159y.i(error, "error");
        A(new c.n(this.f25732a, new c.n.a.b(error), this.f25735d.a(d.b.f79b), abstractC3991f, this.f25740i, this.f25737f, this.f25738g, this.f25739h, null, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void h(String code) {
        AbstractC3159y.i(code, "code");
        A(new c.q(code, this.f25740i, this.f25737f, this.f25738g, this.f25739h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void i(boolean z8) {
        d.a.a(this.f25735d, d.b.f78a, false, 2, null);
        A(new c.k(this.f25737f, this.f25738g, this.f25739h, z8));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void j(u.g configuration, boolean z8) {
        AbstractC3159y.i(configuration, "configuration");
        this.f25737f = z8;
        A(new c.i(this.f25732a, configuration, z8, this.f25738g, this.f25739h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void k(AbstractC3991f paymentSelection) {
        AbstractC3159y.i(paymentSelection, "paymentSelection");
        A(new c.r(this.f25732a, paymentSelection, this.f25740i, this.f25737f, this.f25738g, this.f25739h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void l(EventReporter.a source, EnumC1870e selectedBrand) {
        c.v.a aVar;
        AbstractC3159y.i(source, "source");
        AbstractC3159y.i(selectedBrand, "selectedBrand");
        int i8 = C0601a.f25741a[source.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                aVar = c.v.a.f25866b;
            } else {
                throw new p();
            }
        } else {
            aVar = c.v.a.f25867c;
        }
        A(new c.v(aVar, selectedBrand, this.f25737f, this.f25738g, this.f25739h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void m(AbstractC3991f abstractC3991f, EnumC3653f enumC3653f) {
        AbstractC3991f.C0916f c0916f;
        AbstractC3991f abstractC3991f2;
        boolean z8;
        AbstractC3991f.C0916f.b k8;
        AbstractC3991f b8;
        if (abstractC3991f instanceof AbstractC3991f.C0916f) {
            c0916f = (AbstractC3991f.C0916f) abstractC3991f;
        } else {
            c0916f = null;
        }
        if (c0916f != null && (k8 = c0916f.k()) != null && (b8 = k8.b()) != null) {
            abstractC3991f2 = b8;
        } else {
            abstractC3991f2 = abstractC3991f;
        }
        C2758a a8 = this.f25735d.a(d.b.f79b);
        EventReporter.Mode mode = this.f25732a;
        c.n.a.C0604c c0604c = c.n.a.C0604c.f25825a;
        String str = this.f25740i;
        if (enumC3653f != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        A(new c.n(mode, c0604c, a8, abstractC3991f2, str, z8, this.f25738g, this.f25739h, enumC3653f, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void n(Throwable error) {
        AbstractC3159y.i(error, "error");
        A(new c.f(error, this.f25737f, this.f25738g, this.f25739h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void o(String code) {
        AbstractC3159y.i(code, "code");
        d.a.a(this.f25735d, d.b.f81d, false, 2, null);
        A(new c.w(code, this.f25737f, this.f25738g, this.f25739h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onDismiss() {
        A(new c.e(this.f25737f, this.f25738g, this.f25739h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void p(Throwable error) {
        AbstractC3159y.i(error, "error");
        A(new c.j(this.f25735d.a(d.b.f78a), error, this.f25737f, this.f25738g, this.f25739h, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void q(String str) {
        A(new c.m(this.f25737f, this.f25738g, this.f25739h, str));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void r() {
        A(new c.u(this.f25732a, this.f25740i, this.f25737f, this.f25738g, this.f25739h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void s(AbstractC3991f abstractC3991f) {
        A(new c.p(this.f25740i, this.f25735d.a(d.b.f81d), AbstractC3793c.c(abstractC3991f), AbstractC3793c.e(abstractC3991f), this.f25737f, this.f25738g, this.f25739h, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void t(AbstractC3991f abstractC3991f, y yVar, boolean z8, String str, u.l initializationMode, List orderedLpms) {
        boolean z9;
        AbstractC3159y.i(initializationMode, "initializationMode");
        AbstractC3159y.i(orderedLpms, "orderedLpms");
        this.f25740i = str;
        if (yVar != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f25738g = z9;
        this.f25739h = z8;
        d.a.a(this.f25735d, d.b.f79b, false, 2, null);
        A(new c.l(abstractC3991f, initializationMode, orderedLpms, this.f25735d.a(d.b.f78a), yVar, this.f25737f, z8, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void u(EventReporter.a source, EnumC1870e enumC1870e) {
        c.h.a aVar;
        AbstractC3159y.i(source, "source");
        int i8 = C0601a.f25741a[source.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                aVar = c.h.a.f25786b;
            } else {
                throw new p();
            }
        } else {
            aVar = c.h.a.f25787c;
        }
        A(new c.h(aVar, enumC1870e, this.f25737f, this.f25738g, this.f25739h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void v() {
        A(new c.b(this.f25732a));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void w() {
        A(new c.g(this.f25737f, this.f25738g, this.f25739h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void x(String code) {
        AbstractC3159y.i(code, "code");
        A(new c.o(code, this.f25737f, this.f25738g, this.f25739h));
    }
}
