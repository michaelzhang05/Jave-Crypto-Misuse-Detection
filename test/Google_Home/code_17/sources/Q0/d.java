package Q0;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f9093a;

    /* renamed from: b, reason: collision with root package name */
    public final a f9094b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9095c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9096d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9097e;

    /* renamed from: f, reason: collision with root package name */
    public final double f9098f;

    /* renamed from: g, reason: collision with root package name */
    public final double f9099g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9100h;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f9101a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f9102b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f9103c;

        public a(boolean z8, boolean z9, boolean z10) {
            this.f9101a = z8;
            this.f9102b = z9;
            this.f9103c = z10;
        }
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f9104a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9105b;

        public b(int i8, int i9) {
            this.f9104a = i8;
            this.f9105b = i9;
        }
    }

    public d(long j8, b bVar, a aVar, int i8, int i9, double d8, double d9, int i10) {
        this.f9095c = j8;
        this.f9093a = bVar;
        this.f9094b = aVar;
        this.f9096d = i8;
        this.f9097e = i9;
        this.f9098f = d8;
        this.f9099g = d9;
        this.f9100h = i10;
    }

    public boolean a(long j8) {
        if (this.f9095c < j8) {
            return true;
        }
        return false;
    }
}
