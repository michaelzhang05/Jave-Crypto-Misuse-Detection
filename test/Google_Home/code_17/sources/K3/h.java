package K3;

import h3.m;

/* loaded from: classes4.dex */
public final class h implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f5120a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f5121b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f5122c;

    public h(L5.a aVar, L5.a aVar2, L5.a aVar3) {
        this.f5120a = aVar;
        this.f5121b = aVar2;
        this.f5122c = aVar3;
    }

    public static h a(L5.a aVar, L5.a aVar2, L5.a aVar3) {
        return new h(aVar, aVar2, aVar3);
    }

    public static g c(m mVar, L5.a aVar, S5.g gVar) {
        return new g(mVar, aVar, gVar);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c((m) this.f5120a.get(), this.f5121b, (S5.g) this.f5122c.get());
    }
}
