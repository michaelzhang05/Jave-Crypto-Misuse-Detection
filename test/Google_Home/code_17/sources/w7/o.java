package w7;

/* loaded from: classes5.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private final int f40450a;

    /* renamed from: b, reason: collision with root package name */
    private final long f40451b;

    /* renamed from: c, reason: collision with root package name */
    private final int f40452c;

    /* renamed from: d, reason: collision with root package name */
    private final int f40453d;

    /* loaded from: classes5.dex */
    protected static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f40454a;

        /* renamed from: b, reason: collision with root package name */
        private int f40455b = 0;

        /* renamed from: c, reason: collision with root package name */
        private long f40456c = 0;

        /* renamed from: d, reason: collision with root package name */
        private int f40457d = 0;

        /* JADX INFO: Access modifiers changed from: protected */
        public a(int i8) {
            this.f40454a = i8;
        }

        protected abstract a e();

        /* JADX INFO: Access modifiers changed from: protected */
        public a f(int i8) {
            this.f40457d = i8;
            return e();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a g(int i8) {
            this.f40455b = i8;
            return e();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a h(long j8) {
            this.f40456c = j8;
            return e();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public o(a aVar) {
        this.f40450a = aVar.f40455b;
        this.f40451b = aVar.f40456c;
        this.f40452c = aVar.f40454a;
        this.f40453d = aVar.f40457d;
    }

    public final int a() {
        return this.f40453d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int b() {
        return this.f40450a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long c() {
        return this.f40451b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] d() {
        byte[] bArr = new byte[32];
        H7.f.d(this.f40450a, bArr, 0);
        H7.f.i(this.f40451b, bArr, 4);
        H7.f.d(this.f40452c, bArr, 12);
        H7.f.d(this.f40453d, bArr, 28);
        return bArr;
    }
}
