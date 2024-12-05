package t7;

/* loaded from: classes5.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private final int f38323a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38324b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38325c;

    /* renamed from: d, reason: collision with root package name */
    private final int f38326d;

    /* loaded from: classes5.dex */
    protected static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f38327a;

        /* renamed from: b, reason: collision with root package name */
        private int f38328b = 0;

        /* renamed from: c, reason: collision with root package name */
        private long f38329c = 0;

        /* renamed from: d, reason: collision with root package name */
        private int f38330d = 0;

        /* JADX INFO: Access modifiers changed from: protected */
        public a(int i8) {
            this.f38327a = i8;
        }

        protected abstract a e();

        /* JADX INFO: Access modifiers changed from: protected */
        public a f(int i8) {
            this.f38330d = i8;
            return e();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a g(int i8) {
            this.f38328b = i8;
            return e();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a h(long j8) {
            this.f38329c = j8;
            return e();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public o(a aVar) {
        this.f38323a = aVar.f38328b;
        this.f38324b = aVar.f38329c;
        this.f38325c = aVar.f38327a;
        this.f38326d = aVar.f38330d;
    }

    public final int a() {
        return this.f38326d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int b() {
        return this.f38323a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long c() {
        return this.f38324b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] d() {
        byte[] bArr = new byte[32];
        E7.f.d(this.f38323a, bArr, 0);
        E7.f.i(this.f38324b, bArr, 4);
        E7.f.d(this.f38325c, bArr, 12);
        E7.f.d(this.f38326d, bArr, 28);
        return bArr;
    }
}
