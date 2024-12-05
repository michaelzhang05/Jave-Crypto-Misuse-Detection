package k2;

import A2.d;
import L5.I;
import L5.t;
import X5.n;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import i6.AbstractC2829k;
import i6.M;
import i6.N;
import k2.AbstractC3110b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3159y;
import x2.InterfaceC3873c;

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3109a implements InterfaceC3111c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3873c f33360a;

    /* renamed from: b, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f33361b;

    /* renamed from: c, reason: collision with root package name */
    private final A2.d f33362c;

    /* renamed from: d, reason: collision with root package name */
    private final P5.g f33363d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0771a extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f33364a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC3110b f33366c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0771a(AbstractC3110b abstractC3110b, P5.d dVar) {
            super(2, dVar);
            this.f33366c = abstractC3110b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0771a(this.f33366c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0771a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f33364a == 0) {
                t.b(obj);
                InterfaceC3873c interfaceC3873c = C3109a.this.f33360a;
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = C3109a.this.f33361b;
                AbstractC3110b abstractC3110b = this.f33366c;
                interfaceC3873c.a(paymentAnalyticsRequestFactory.g(abstractC3110b, abstractC3110b.b()));
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C3109a(InterfaceC3873c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, A2.d durationProvider, P5.g workContext) {
        AbstractC3159y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3159y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3159y.i(durationProvider, "durationProvider");
        AbstractC3159y.i(workContext, "workContext");
        this.f33360a = analyticsRequestExecutor;
        this.f33361b = paymentAnalyticsRequestFactory;
        this.f33362c = durationProvider;
        this.f33363d = workContext;
    }

    private final void h(AbstractC3110b abstractC3110b) {
        AbstractC2829k.d(N.a(this.f33363d), null, null, new C0771a(abstractC3110b, null), 3, null);
    }

    @Override // k2.InterfaceC3111c
    public void a() {
        h(new AbstractC3110b.a());
    }

    @Override // k2.InterfaceC3111c
    public void b(String code) {
        AbstractC3159y.i(code, "code");
        d.a.a(this.f33362c, d.b.f81d, false, 2, null);
        h(new AbstractC3110b.e(code));
    }

    @Override // k2.InterfaceC3111c
    public void c() {
        d.a.a(this.f33362c, d.b.f78a, false, 2, null);
        h(new AbstractC3110b.c());
    }

    @Override // k2.InterfaceC3111c
    public void d(String code) {
        AbstractC3159y.i(code, "code");
        h(new AbstractC3110b.f(code, this.f33362c.a(d.b.f81d), null));
    }

    @Override // k2.InterfaceC3111c
    public void e(String code) {
        AbstractC3159y.i(code, "code");
        h(new AbstractC3110b.d(code));
    }
}
