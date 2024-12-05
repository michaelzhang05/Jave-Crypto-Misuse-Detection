package m3;

import P5.g;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import e3.m;
import r2.InterfaceC3684d;
import x2.InterfaceC3864B;
import x2.InterfaceC3873c;

/* renamed from: m3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3397b implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f34920a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f34921b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f34922c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f34923d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.a f34924e;

    /* renamed from: f, reason: collision with root package name */
    private final I5.a f34925f;

    public C3397b(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6) {
        this.f34920a = aVar;
        this.f34921b = aVar2;
        this.f34922c = aVar3;
        this.f34923d = aVar4;
        this.f34924e = aVar5;
        this.f34925f = aVar6;
    }

    public static C3397b a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6) {
        return new C3397b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static C3396a c(m mVar, InterfaceC3873c interfaceC3873c, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, InterfaceC3864B interfaceC3864B, InterfaceC3684d interfaceC3684d, g gVar) {
        return new C3396a(mVar, interfaceC3873c, paymentAnalyticsRequestFactory, interfaceC3864B, interfaceC3684d, gVar);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3396a get() {
        return c((m) this.f34920a.get(), (InterfaceC3873c) this.f34921b.get(), (PaymentAnalyticsRequestFactory) this.f34922c.get(), (InterfaceC3864B) this.f34923d.get(), (InterfaceC3684d) this.f34924e.get(), (g) this.f34925f.get());
    }
}
