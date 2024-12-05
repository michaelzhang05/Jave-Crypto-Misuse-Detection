package w;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4116a implements L5.a {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f40317c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile L5.a f40318a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f40319b = f40317c;

    private C4116a(L5.a aVar) {
        this.f40318a = aVar;
    }

    public static L5.a a(L5.a aVar) {
        d.b(aVar);
        if (aVar instanceof C4116a) {
            return aVar;
        }
        return new C4116a(aVar);
    }

    private static Object b(Object obj, Object obj2) {
        if (obj != f40317c && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
        return obj2;
    }

    @Override // L5.a
    public Object get() {
        Object obj = this.f40319b;
        Object obj2 = f40317c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f40319b;
                    if (obj == obj2) {
                        obj = this.f40318a.get();
                        this.f40319b = b(this.f40319b, obj);
                        this.f40318a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
