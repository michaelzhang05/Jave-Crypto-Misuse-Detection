package z3;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c0 implements k4.b {

    /* renamed from: c, reason: collision with root package name */
    private static final k4.a f9989c = new k4.a() { // from class: z3.a0
        @Override // k4.a
        public final void a(k4.b bVar) {
            c0.d(bVar);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final k4.b f9990d = new k4.b() { // from class: z3.b0
        @Override // k4.b
        public final Object get() {
            Object e6;
            e6 = c0.e();
            return e6;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private k4.a f9991a;

    /* renamed from: b, reason: collision with root package name */
    private volatile k4.b f9992b;

    private c0(k4.a aVar, k4.b bVar) {
        this.f9991a = aVar;
        this.f9992b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 c() {
        return new c0(f9989c, f9990d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(k4.b bVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object e() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(k4.b bVar) {
        k4.a aVar;
        if (this.f9992b != f9990d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.f9991a;
            this.f9991a = null;
            this.f9992b = bVar;
        }
        aVar.a(bVar);
    }

    @Override // k4.b
    public Object get() {
        return this.f9992b.get();
    }
}
