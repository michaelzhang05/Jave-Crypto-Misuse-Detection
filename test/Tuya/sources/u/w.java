package u;

import w.InterfaceC3836b;

/* loaded from: classes3.dex */
public final class w implements InterfaceC3836b {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f38480a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f38481b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f38482c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f38483d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.a f38484e;

    public w(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5) {
        this.f38480a = aVar;
        this.f38481b = aVar2;
        this.f38482c = aVar3;
        this.f38483d = aVar4;
        this.f38484e = aVar5;
    }

    public static w a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5) {
        return new w(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static u c(E.a aVar, E.a aVar2, A.e eVar, B.r rVar, B.v vVar) {
        return new u(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c((E.a) this.f38480a.get(), (E.a) this.f38481b.get(), (A.e) this.f38482c.get(), (B.r) this.f38483d.get(), (B.v) this.f38484e.get());
    }
}
