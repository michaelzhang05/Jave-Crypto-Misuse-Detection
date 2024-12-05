package v1;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    private static o f9629b;

    /* renamed from: c, reason: collision with root package name */
    private static final p f9630c = new p(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private p f9631a;

    private o() {
    }

    public static synchronized o b() {
        o oVar;
        synchronized (o.class) {
            if (f9629b == null) {
                f9629b = new o();
            }
            oVar = f9629b;
        }
        return oVar;
    }

    public p a() {
        return this.f9631a;
    }

    public final synchronized void c(p pVar) {
        if (pVar == null) {
            this.f9631a = f9630c;
            return;
        }
        p pVar2 = this.f9631a;
        if (pVar2 == null || pVar2.e() < pVar.e()) {
            this.f9631a = pVar;
        }
    }
}
