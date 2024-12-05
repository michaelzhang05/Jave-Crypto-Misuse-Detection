package B0;

/* loaded from: classes3.dex */
public class x implements Z0.b {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f660c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f661a = f660c;

    /* renamed from: b, reason: collision with root package name */
    private volatile Z0.b f662b;

    public x(Z0.b bVar) {
        this.f662b = bVar;
    }

    @Override // Z0.b
    public Object get() {
        Object obj = this.f661a;
        Object obj2 = f660c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f661a;
                    if (obj == obj2) {
                        obj = this.f662b.get();
                        this.f661a = obj;
                        this.f662b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
