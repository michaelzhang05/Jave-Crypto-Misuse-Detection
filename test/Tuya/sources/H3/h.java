package H3;

import e3.m;

/* loaded from: classes4.dex */
public final class h implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f3517a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f3518b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f3519c;

    public h(I5.a aVar, I5.a aVar2, I5.a aVar3) {
        this.f3517a = aVar;
        this.f3518b = aVar2;
        this.f3519c = aVar3;
    }

    public static h a(I5.a aVar, I5.a aVar2, I5.a aVar3) {
        return new h(aVar, aVar2, aVar3);
    }

    public static g c(m mVar, I5.a aVar, P5.g gVar) {
        return new g(mVar, aVar, gVar);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c((m) this.f3517a.get(), this.f3518b, (P5.g) this.f3519c.get());
    }
}
