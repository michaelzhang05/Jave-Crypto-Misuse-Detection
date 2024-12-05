package u;

import w.InterfaceC4117b;

/* loaded from: classes3.dex */
public final class w implements InterfaceC4117b {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f39908a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f39909b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f39910c;

    /* renamed from: d, reason: collision with root package name */
    private final L5.a f39911d;

    /* renamed from: e, reason: collision with root package name */
    private final L5.a f39912e;

    public w(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5) {
        this.f39908a = aVar;
        this.f39909b = aVar2;
        this.f39910c = aVar3;
        this.f39911d = aVar4;
        this.f39912e = aVar5;
    }

    public static w a(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5) {
        return new w(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static u c(E.a aVar, E.a aVar2, A.e eVar, B.r rVar, B.v vVar) {
        return new u(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c((E.a) this.f39908a.get(), (E.a) this.f39909b.get(), (A.e) this.f39910c.get(), (B.r) this.f39911d.get(), (B.v) this.f39912e.get());
    }
}
