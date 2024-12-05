package M2;

import P5.g;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import k3.i;
import r2.InterfaceC3684d;
import x2.InterfaceC3873c;

/* loaded from: classes4.dex */
public final class b implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f6879a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f6880b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f6881c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f6882d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.a f6883e;

    /* renamed from: f, reason: collision with root package name */
    private final I5.a f6884f;

    public b(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6) {
        this.f6879a = aVar;
        this.f6880b = aVar2;
        this.f6881c = aVar3;
        this.f6882d = aVar4;
        this.f6883e = aVar5;
        this.f6884f = aVar6;
    }

    public static b a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6) {
        return new b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static a c(InterfaceC3873c interfaceC3873c, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, i iVar, g gVar, InterfaceC3684d interfaceC3684d, A2.d dVar) {
        return new a(interfaceC3873c, paymentAnalyticsRequestFactory, iVar, gVar, interfaceC3684d, dVar);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c((InterfaceC3873c) this.f6879a.get(), (PaymentAnalyticsRequestFactory) this.f6880b.get(), (i) this.f6881c.get(), (g) this.f6882d.get(), (InterfaceC3684d) this.f6883e.get(), (A2.d) this.f6884f.get());
    }
}
