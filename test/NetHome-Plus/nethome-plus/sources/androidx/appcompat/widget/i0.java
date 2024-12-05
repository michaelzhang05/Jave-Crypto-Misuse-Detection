package androidx.appcompat.widget;

/* compiled from: RtlSpacingHelper.java */
/* loaded from: classes.dex */
class i0 {
    private int a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f507b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f508c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private int f509d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f510e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f511f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f512g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f513h = false;

    public int a() {
        return this.f512g ? this.a : this.f507b;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.f507b;
    }

    public int d() {
        return this.f512g ? this.f507b : this.a;
    }

    public void e(int i2, int i3) {
        this.f513h = false;
        if (i2 != Integer.MIN_VALUE) {
            this.f510e = i2;
            this.a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f511f = i3;
            this.f507b = i3;
        }
    }

    public void f(boolean z) {
        if (z == this.f512g) {
            return;
        }
        this.f512g = z;
        if (!this.f513h) {
            this.a = this.f510e;
            this.f507b = this.f511f;
            return;
        }
        if (z) {
            int i2 = this.f509d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.f510e;
            }
            this.a = i2;
            int i3 = this.f508c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = this.f511f;
            }
            this.f507b = i3;
            return;
        }
        int i4 = this.f508c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = this.f510e;
        }
        this.a = i4;
        int i5 = this.f509d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = this.f511f;
        }
        this.f507b = i5;
    }

    public void g(int i2, int i3) {
        this.f508c = i2;
        this.f509d = i3;
        this.f513h = true;
        if (this.f512g) {
            if (i3 != Integer.MIN_VALUE) {
                this.a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f507b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f507b = i3;
        }
    }
}
