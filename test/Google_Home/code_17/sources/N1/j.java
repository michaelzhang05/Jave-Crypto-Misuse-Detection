package N1;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final m f7554a;

    /* renamed from: b, reason: collision with root package name */
    private final c2.c f7555b;

    /* renamed from: c, reason: collision with root package name */
    private final c2.c f7556c;

    /* renamed from: d, reason: collision with root package name */
    private final c2.c f7557d;

    /* renamed from: e, reason: collision with root package name */
    private final c2.c f7558e;

    public j(m mVar, c2.c cVar, c2.c cVar2, c2.c cVar3, c2.c cVar4) {
        this.f7554a = mVar;
        this.f7555b = cVar;
        this.f7556c = cVar2;
        if (cVar3 != null) {
            this.f7557d = cVar3;
            this.f7558e = cVar4;
            return;
        }
        throw new IllegalArgumentException("The cipher text must not be null");
    }

    public c2.c a() {
        return this.f7558e;
    }

    public c2.c b() {
        return this.f7557d;
    }

    public c2.c c() {
        return this.f7555b;
    }

    public m d() {
        return this.f7554a;
    }

    public c2.c e() {
        return this.f7556c;
    }
}
