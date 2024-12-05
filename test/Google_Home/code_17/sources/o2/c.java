package O2;

import n3.i;

/* loaded from: classes4.dex */
public final class c implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f7897a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f7898b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f7899c;

    /* renamed from: d, reason: collision with root package name */
    private final L5.a f7900d;

    public c(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4) {
        this.f7897a = aVar;
        this.f7898b = aVar2;
        this.f7899c = aVar3;
        this.f7900d = aVar4;
    }

    public static c a(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4) {
        return new c(aVar, aVar2, aVar3, aVar4);
    }

    public static b c(N2.d dVar, S2.c cVar, P2.e eVar, i iVar) {
        return new b(dVar, cVar, eVar, iVar);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c((N2.d) this.f7897a.get(), (S2.c) this.f7898b.get(), (P2.e) this.f7899c.get(), (i) this.f7900d.get());
    }
}
