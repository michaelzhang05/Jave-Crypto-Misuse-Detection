package H;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    protected Boolean f3456a;

    /* renamed from: b, reason: collision with root package name */
    protected String f3457b;

    public f() {
        this.f3456a = Boolean.FALSE;
    }

    public final f a(String str) {
        this.f3457b = str;
        return this;
    }

    public f(g gVar) {
        boolean z8;
        String str;
        this.f3456a = Boolean.FALSE;
        g.b(gVar);
        z8 = gVar.f3460b;
        this.f3456a = Boolean.valueOf(z8);
        str = gVar.f3461c;
        this.f3457b = str;
    }
}
