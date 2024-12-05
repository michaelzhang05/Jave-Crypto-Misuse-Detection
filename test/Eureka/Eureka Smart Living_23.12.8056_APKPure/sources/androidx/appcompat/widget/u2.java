package androidx.appcompat.widget;

/* loaded from: classes.dex */
class u2 {

    /* renamed from: a, reason: collision with root package name */
    private int f1250a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f1251b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f1252c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private int f1253d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f1254e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f1255f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1256g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1257h = false;

    public int a() {
        return this.f1256g ? this.f1250a : this.f1251b;
    }

    public int b() {
        return this.f1250a;
    }

    public int c() {
        return this.f1251b;
    }

    public int d() {
        return this.f1256g ? this.f1251b : this.f1250a;
    }

    public void e(int i6, int i7) {
        this.f1257h = false;
        if (i6 != Integer.MIN_VALUE) {
            this.f1254e = i6;
            this.f1250a = i6;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f1255f = i7;
            this.f1251b = i7;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        if (r2 != Integer.MIN_VALUE) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
    
        if (r2 != Integer.MIN_VALUE) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f1256g
            if (r2 != r0) goto L5
            return
        L5:
            r1.f1256g = r2
            boolean r0 = r1.f1257h
            if (r0 == 0) goto L2b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L1d
            int r2 = r1.f1253d
            if (r2 == r0) goto L14
            goto L16
        L14:
            int r2 = r1.f1254e
        L16:
            r1.f1250a = r2
            int r2 = r1.f1252c
            if (r2 == r0) goto L2f
            goto L31
        L1d:
            int r2 = r1.f1252c
            if (r2 == r0) goto L22
            goto L24
        L22:
            int r2 = r1.f1254e
        L24:
            r1.f1250a = r2
            int r2 = r1.f1253d
            if (r2 == r0) goto L2f
            goto L31
        L2b:
            int r2 = r1.f1254e
            r1.f1250a = r2
        L2f:
            int r2 = r1.f1255f
        L31:
            r1.f1251b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.u2.f(boolean):void");
    }

    public void g(int i6, int i7) {
        this.f1252c = i6;
        this.f1253d = i7;
        this.f1257h = true;
        if (this.f1256g) {
            if (i7 != Integer.MIN_VALUE) {
                this.f1250a = i7;
            }
            if (i6 != Integer.MIN_VALUE) {
                this.f1251b = i6;
                return;
            }
            return;
        }
        if (i6 != Integer.MIN_VALUE) {
            this.f1250a = i6;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f1251b = i7;
        }
    }
}
