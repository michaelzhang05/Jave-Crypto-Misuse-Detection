package O0;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f7694a;

    /* renamed from: b, reason: collision with root package name */
    public final a f7695b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7696c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7697d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7698e;

    /* renamed from: f, reason: collision with root package name */
    public final double f7699f;

    /* renamed from: g, reason: collision with root package name */
    public final double f7700g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7701h;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7702a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f7703b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f7704c;

        public a(boolean z8, boolean z9, boolean z10) {
            this.f7702a = z8;
            this.f7703b = z9;
            this.f7704c = z10;
        }
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f7705a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7706b;

        public b(int i8, int i9) {
            this.f7705a = i8;
            this.f7706b = i9;
        }
    }

    public d(long j8, b bVar, a aVar, int i8, int i9, double d8, double d9, int i10) {
        this.f7696c = j8;
        this.f7694a = bVar;
        this.f7695b = aVar;
        this.f7697d = i8;
        this.f7698e = i9;
        this.f7699f = d8;
        this.f7700g = d9;
        this.f7701h = i10;
    }

    public boolean a(long j8) {
        if (this.f7696c < j8) {
            return true;
        }
        return false;
    }
}
