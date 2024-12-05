package androidx.appcompat.app;

/* loaded from: classes.dex */
class d0 {

    /* renamed from: d, reason: collision with root package name */
    private static d0 f289d;

    /* renamed from: a, reason: collision with root package name */
    public long f290a;

    /* renamed from: b, reason: collision with root package name */
    public long f291b;

    /* renamed from: c, reason: collision with root package name */
    public int f292c;

    d0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d0 b() {
        if (f289d == null) {
            f289d = new d0();
        }
        return f289d;
    }

    public void a(long j6, double d6, double d7) {
        double d8 = (0.01720197f * (((float) (j6 - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(d8) * 0.03341960161924362d) + d8 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double round = ((float) Math.round((r3 - 9.0E-4f) - r7)) + 9.0E-4f + ((-d7) / 360.0d) + (Math.sin(d8) * 0.0053d) + (Math.sin(2.0d * sin) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d9 = 0.01745329238474369d * d6;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d9) * Math.sin(asin))) / (Math.cos(d9) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.f292c = 1;
        } else {
            if (sin2 > -1.0d) {
                double acos = (float) (Math.acos(sin2) / 6.283185307179586d);
                this.f290a = Math.round((round + acos) * 8.64E7d) + 946728000000L;
                long round2 = Math.round((round - acos) * 8.64E7d) + 946728000000L;
                this.f291b = round2;
                if (round2 >= j6 || this.f290a <= j6) {
                    this.f292c = 1;
                    return;
                } else {
                    this.f292c = 0;
                    return;
                }
            }
            this.f292c = 0;
        }
        this.f290a = -1L;
        this.f291b = -1L;
    }
}
