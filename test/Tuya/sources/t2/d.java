package T2;

import r2.InterfaceC3684d;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f9773a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f9774b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f9775c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f9776d;

    public d(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4) {
        this.f9773a = aVar;
        this.f9774b = aVar2;
        this.f9775c = aVar3;
        this.f9776d = aVar4;
    }

    public static d a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4) {
        return new d(aVar, aVar2, aVar3, aVar4);
    }

    public static c c(k kVar, K2.d dVar, L2.b bVar, M2.e eVar, InterfaceC3684d interfaceC3684d) {
        return new c(kVar, dVar, bVar, eVar, interfaceC3684d);
    }

    public c b(k kVar) {
        return c(kVar, (K2.d) this.f9773a.get(), (L2.b) this.f9774b.get(), (M2.e) this.f9775c.get(), (InterfaceC3684d) this.f9776d.get());
    }
}
