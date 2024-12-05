package K1;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final m f5775a;

    /* renamed from: b, reason: collision with root package name */
    private final Z1.c f5776b;

    /* renamed from: c, reason: collision with root package name */
    private final Z1.c f5777c;

    /* renamed from: d, reason: collision with root package name */
    private final Z1.c f5778d;

    /* renamed from: e, reason: collision with root package name */
    private final Z1.c f5779e;

    public j(m mVar, Z1.c cVar, Z1.c cVar2, Z1.c cVar3, Z1.c cVar4) {
        this.f5775a = mVar;
        this.f5776b = cVar;
        this.f5777c = cVar2;
        if (cVar3 != null) {
            this.f5778d = cVar3;
            this.f5779e = cVar4;
            return;
        }
        throw new IllegalArgumentException("The cipher text must not be null");
    }

    public Z1.c a() {
        return this.f5779e;
    }

    public Z1.c b() {
        return this.f5778d;
    }

    public Z1.c c() {
        return this.f5776b;
    }

    public m d() {
        return this.f5775a;
    }

    public Z1.c e() {
        return this.f5777c;
    }
}
