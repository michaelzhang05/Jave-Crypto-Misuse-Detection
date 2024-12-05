package f1;

/* loaded from: classes.dex */
public final class a implements y4.a {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f6581c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile y4.a f6582a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f6583b = f6581c;

    private a(y4.a aVar) {
        this.f6582a = aVar;
    }

    public static y4.a a(y4.a aVar) {
        d.b(aVar);
        return aVar instanceof a ? aVar : new a(aVar);
    }

    public static Object b(Object obj, Object obj2) {
        if (!(obj != f6581c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // y4.a
    public Object get() {
        Object obj = this.f6583b;
        Object obj2 = f6581c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f6583b;
                if (obj == obj2) {
                    obj = this.f6582a.get();
                    this.f6583b = b(this.f6583b, obj);
                    this.f6582a = null;
                }
            }
        }
        return obj;
    }
}
