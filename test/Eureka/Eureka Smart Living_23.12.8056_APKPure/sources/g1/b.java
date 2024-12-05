package g1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static final b f6671b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final e f6672a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private e f6673a = null;

        a() {
        }

        public b a() {
            return new b(this.f6673a);
        }

        public a b(e eVar) {
            this.f6673a = eVar;
            return this;
        }
    }

    b(e eVar) {
        this.f6672a = eVar;
    }

    public static a b() {
        return new a();
    }

    public e a() {
        return this.f6672a;
    }
}
