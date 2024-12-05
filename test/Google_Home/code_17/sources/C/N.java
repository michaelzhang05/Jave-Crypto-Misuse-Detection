package C;

import w.InterfaceC4117b;

/* loaded from: classes3.dex */
public final class N implements InterfaceC4117b {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f1107a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f1108b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f1109c;

    /* renamed from: d, reason: collision with root package name */
    private final L5.a f1110d;

    /* renamed from: e, reason: collision with root package name */
    private final L5.a f1111e;

    public N(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5) {
        this.f1107a = aVar;
        this.f1108b = aVar2;
        this.f1109c = aVar3;
        this.f1110d = aVar4;
        this.f1111e = aVar5;
    }

    public static N a(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5) {
        return new N(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static M c(E.a aVar, E.a aVar2, Object obj, Object obj2, L5.a aVar3) {
        return new M(aVar, aVar2, (AbstractC1011e) obj, (W) obj2, aVar3);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public M get() {
        return c((E.a) this.f1107a.get(), (E.a) this.f1108b.get(), this.f1109c.get(), this.f1110d.get(), this.f1111e);
    }
}
