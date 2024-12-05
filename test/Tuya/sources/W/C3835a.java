package w;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3835a implements I5.a {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f38934c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile I5.a f38935a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f38936b = f38934c;

    private C3835a(I5.a aVar) {
        this.f38935a = aVar;
    }

    public static I5.a a(I5.a aVar) {
        AbstractC3838d.b(aVar);
        if (aVar instanceof C3835a) {
            return aVar;
        }
        return new C3835a(aVar);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj != f38934c && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
        return obj2;
    }

    @Override // I5.a
    public Object get() {
        Object obj = this.f38936b;
        Object obj2 = f38934c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f38936b;
                    if (obj == obj2) {
                        obj = this.f38935a.get();
                        this.f38936b = b(this.f38936b, obj);
                        this.f38935a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
