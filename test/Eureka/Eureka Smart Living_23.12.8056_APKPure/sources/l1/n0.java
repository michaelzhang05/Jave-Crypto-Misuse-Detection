package l1;

/* loaded from: classes.dex */
public final class n0 implements f1.b {

    /* renamed from: a, reason: collision with root package name */
    private final y4.a f7313a;

    /* renamed from: b, reason: collision with root package name */
    private final y4.a f7314b;

    /* renamed from: c, reason: collision with root package name */
    private final y4.a f7315c;

    /* renamed from: d, reason: collision with root package name */
    private final y4.a f7316d;

    /* renamed from: e, reason: collision with root package name */
    private final y4.a f7317e;

    public n0(y4.a aVar, y4.a aVar2, y4.a aVar3, y4.a aVar4, y4.a aVar5) {
        this.f7313a = aVar;
        this.f7314b = aVar2;
        this.f7315c = aVar3;
        this.f7316d = aVar4;
        this.f7317e = aVar5;
    }

    public static n0 a(y4.a aVar, y4.a aVar2, y4.a aVar3, y4.a aVar4, y4.a aVar5) {
        return new n0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static m0 c(n1.a aVar, n1.a aVar2, Object obj, Object obj2, y4.a aVar3) {
        return new m0(aVar, aVar2, (e) obj, (t0) obj2, aVar3);
    }

    @Override // y4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m0 get() {
        return c((n1.a) this.f7313a.get(), (n1.a) this.f7314b.get(), this.f7315c.get(), this.f7316d.get(), this.f7317e);
    }
}
