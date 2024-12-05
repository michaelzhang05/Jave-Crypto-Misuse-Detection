package Q;

/* renamed from: Q.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1401q {

    /* renamed from: b, reason: collision with root package name */
    private static C1401q f9063b;

    /* renamed from: c, reason: collision with root package name */
    private static final r f9064c = new r(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private r f9065a;

    private C1401q() {
    }

    public static synchronized C1401q b() {
        C1401q c1401q;
        synchronized (C1401q.class) {
            try {
                if (f9063b == null) {
                    f9063b = new C1401q();
                }
                c1401q = f9063b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1401q;
    }

    public r a() {
        return this.f9065a;
    }

    public final synchronized void c(r rVar) {
        if (rVar == null) {
            this.f9065a = f9064c;
            return;
        }
        r rVar2 = this.f9065a;
        if (rVar2 != null && rVar2.z() >= rVar.z()) {
            return;
        }
        this.f9065a = rVar;
    }
}
