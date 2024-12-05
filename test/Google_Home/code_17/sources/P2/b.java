package P2;

import A2.InterfaceC0945c;
import S5.g;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import n3.i;
import u2.InterfaceC4057d;

/* loaded from: classes4.dex */
public final class b implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f8703a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f8704b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f8705c;

    /* renamed from: d, reason: collision with root package name */
    private final L5.a f8706d;

    /* renamed from: e, reason: collision with root package name */
    private final L5.a f8707e;

    /* renamed from: f, reason: collision with root package name */
    private final L5.a f8708f;

    public b(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5, L5.a aVar6) {
        this.f8703a = aVar;
        this.f8704b = aVar2;
        this.f8705c = aVar3;
        this.f8706d = aVar4;
        this.f8707e = aVar5;
        this.f8708f = aVar6;
    }

    public static b a(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5, L5.a aVar6) {
        return new b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static a c(InterfaceC0945c interfaceC0945c, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, i iVar, g gVar, InterfaceC4057d interfaceC4057d, D2.d dVar) {
        return new a(interfaceC0945c, paymentAnalyticsRequestFactory, iVar, gVar, interfaceC4057d, dVar);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c((InterfaceC0945c) this.f8703a.get(), (PaymentAnalyticsRequestFactory) this.f8704b.get(), (i) this.f8705c.get(), (g) this.f8706d.get(), (InterfaceC4057d) this.f8707e.get(), (D2.d) this.f8708f.get());
    }
}
