package p3;

import A2.B;
import A2.InterfaceC0945c;
import S5.g;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import h3.m;
import u2.InterfaceC4057d;

/* renamed from: p3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3740b implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f36946a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f36947b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f36948c;

    /* renamed from: d, reason: collision with root package name */
    private final L5.a f36949d;

    /* renamed from: e, reason: collision with root package name */
    private final L5.a f36950e;

    /* renamed from: f, reason: collision with root package name */
    private final L5.a f36951f;

    public C3740b(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5, L5.a aVar6) {
        this.f36946a = aVar;
        this.f36947b = aVar2;
        this.f36948c = aVar3;
        this.f36949d = aVar4;
        this.f36950e = aVar5;
        this.f36951f = aVar6;
    }

    public static C3740b a(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5, L5.a aVar6) {
        return new C3740b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static C3739a c(m mVar, InterfaceC0945c interfaceC0945c, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, B b8, InterfaceC4057d interfaceC4057d, g gVar) {
        return new C3739a(mVar, interfaceC0945c, paymentAnalyticsRequestFactory, b8, interfaceC4057d, gVar);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3739a get() {
        return c((m) this.f36946a.get(), (InterfaceC0945c) this.f36947b.get(), (PaymentAnalyticsRequestFactory) this.f36948c.get(), (B) this.f36949d.get(), (InterfaceC4057d) this.f36950e.get(), (g) this.f36951f.get());
    }
}
