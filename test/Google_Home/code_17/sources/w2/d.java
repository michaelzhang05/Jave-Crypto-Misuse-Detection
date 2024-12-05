package W2;

import u2.InterfaceC4057d;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f11430a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f11431b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f11432c;

    /* renamed from: d, reason: collision with root package name */
    private final L5.a f11433d;

    public d(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4) {
        this.f11430a = aVar;
        this.f11431b = aVar2;
        this.f11432c = aVar3;
        this.f11433d = aVar4;
    }

    public static d a(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4) {
        return new d(aVar, aVar2, aVar3, aVar4);
    }

    public static c c(k kVar, N2.d dVar, O2.b bVar, P2.e eVar, InterfaceC4057d interfaceC4057d) {
        return new c(kVar, dVar, bVar, eVar, interfaceC4057d);
    }

    public c b(k kVar) {
        return c(kVar, (N2.d) this.f11430a.get(), (O2.b) this.f11431b.get(), (P2.e) this.f11432c.get(), (InterfaceC4057d) this.f11433d.get());
    }
}
