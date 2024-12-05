package C;

import w.InterfaceC3836b;

/* loaded from: classes3.dex */
public final class N implements InterfaceC3836b {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f1098a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f1099b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f1100c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f1101d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.a f1102e;

    public N(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5) {
        this.f1098a = aVar;
        this.f1099b = aVar2;
        this.f1100c = aVar3;
        this.f1101d = aVar4;
        this.f1102e = aVar5;
    }

    public static N a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5) {
        return new N(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static M c(E.a aVar, E.a aVar2, Object obj, Object obj2, I5.a aVar3) {
        return new M(aVar, aVar2, (AbstractC1071e) obj, (U) obj2, aVar3);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public M get() {
        return c((E.a) this.f1098a.get(), (E.a) this.f1099b.get(), this.f1100c.get(), this.f1101d.get(), this.f1102e);
    }
}
