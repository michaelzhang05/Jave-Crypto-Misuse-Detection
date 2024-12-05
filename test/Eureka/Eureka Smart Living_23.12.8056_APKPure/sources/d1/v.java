package d1;

/* loaded from: classes.dex */
public final class v implements f1.b {

    /* renamed from: a, reason: collision with root package name */
    private final y4.a f6468a;

    /* renamed from: b, reason: collision with root package name */
    private final y4.a f6469b;

    /* renamed from: c, reason: collision with root package name */
    private final y4.a f6470c;

    /* renamed from: d, reason: collision with root package name */
    private final y4.a f6471d;

    /* renamed from: e, reason: collision with root package name */
    private final y4.a f6472e;

    public v(y4.a aVar, y4.a aVar2, y4.a aVar3, y4.a aVar4, y4.a aVar5) {
        this.f6468a = aVar;
        this.f6469b = aVar2;
        this.f6470c = aVar3;
        this.f6471d = aVar4;
        this.f6472e = aVar5;
    }

    public static v a(y4.a aVar, y4.a aVar2, y4.a aVar3, y4.a aVar4, y4.a aVar5) {
        return new v(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static t c(n1.a aVar, n1.a aVar2, j1.e eVar, k1.r rVar, k1.v vVar) {
        return new t(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // y4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c((n1.a) this.f6468a.get(), (n1.a) this.f6469b.get(), (j1.e) this.f6470c.get(), (k1.r) this.f6471d.get(), (k1.v) this.f6472e.get());
    }
}
