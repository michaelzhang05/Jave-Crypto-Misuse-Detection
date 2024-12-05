package n2;

import A2.InterfaceC0945c;
import D2.d;
import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.M;
import l6.N;
import n2.AbstractC3465b;

/* renamed from: n2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3464a implements InterfaceC3466c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0945c f35352a;

    /* renamed from: b, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f35353b;

    /* renamed from: c, reason: collision with root package name */
    private final D2.d f35354c;

    /* renamed from: d, reason: collision with root package name */
    private final S5.g f35355d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0801a extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f35356a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC3465b f35358c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0801a(AbstractC3465b abstractC3465b, S5.d dVar) {
            super(2, dVar);
            this.f35358c = abstractC3465b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C0801a(this.f35358c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f35356a == 0) {
                t.b(obj);
                InterfaceC0945c interfaceC0945c = C3464a.this.f35352a;
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = C3464a.this.f35353b;
                AbstractC3465b abstractC3465b = this.f35358c;
                interfaceC0945c.a(paymentAnalyticsRequestFactory.g(abstractC3465b, abstractC3465b.b()));
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((C0801a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public C3464a(InterfaceC0945c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, D2.d durationProvider, S5.g workContext) {
        AbstractC3255y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3255y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3255y.i(durationProvider, "durationProvider");
        AbstractC3255y.i(workContext, "workContext");
        this.f35352a = analyticsRequestExecutor;
        this.f35353b = paymentAnalyticsRequestFactory;
        this.f35354c = durationProvider;
        this.f35355d = workContext;
    }

    private final void h(AbstractC3465b abstractC3465b) {
        AbstractC3364k.d(N.a(this.f35355d), null, null, new C0801a(abstractC3465b, null), 3, null);
    }

    @Override // n2.InterfaceC3466c
    public void a() {
        h(new AbstractC3465b.a());
    }

    @Override // n2.InterfaceC3466c
    public void b(String code) {
        AbstractC3255y.i(code, "code");
        d.a.a(this.f35354c, d.b.f1783d, false, 2, null);
        h(new AbstractC3465b.e(code));
    }

    @Override // n2.InterfaceC3466c
    public void c() {
        d.a.a(this.f35354c, d.b.f1780a, false, 2, null);
        h(new AbstractC3465b.c());
    }

    @Override // n2.InterfaceC3466c
    public void d(String code) {
        AbstractC3255y.i(code, "code");
        h(new AbstractC3465b.f(code, this.f35354c.a(d.b.f1783d), null));
    }

    @Override // n2.InterfaceC3466c
    public void e(String code) {
        AbstractC3255y.i(code, "code");
        h(new AbstractC3465b.d(code));
    }
}
