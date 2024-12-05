package z3;

/* loaded from: classes.dex */
public class x implements k4.b {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f10041c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f10042a = f10041c;

    /* renamed from: b, reason: collision with root package name */
    private volatile k4.b f10043b;

    public x(k4.b bVar) {
        this.f10043b = bVar;
    }

    @Override // k4.b
    public Object get() {
        Object obj = this.f10042a;
        Object obj2 = f10041c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f10042a;
                if (obj == obj2) {
                    obj = this.f10043b.get();
                    this.f10042a = obj;
                    this.f10043b = null;
                }
            }
        }
        return obj;
    }
}
