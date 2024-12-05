package androidx.core.content.res;

/* loaded from: classes.dex */
final class o {

    /* renamed from: k, reason: collision with root package name */
    static final o f2070k = k(b.f2036c, (float) ((b.h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a, reason: collision with root package name */
    private final float f2071a;

    /* renamed from: b, reason: collision with root package name */
    private final float f2072b;

    /* renamed from: c, reason: collision with root package name */
    private final float f2073c;

    /* renamed from: d, reason: collision with root package name */
    private final float f2074d;

    /* renamed from: e, reason: collision with root package name */
    private final float f2075e;

    /* renamed from: f, reason: collision with root package name */
    private final float f2076f;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f2077g;

    /* renamed from: h, reason: collision with root package name */
    private final float f2078h;

    /* renamed from: i, reason: collision with root package name */
    private final float f2079i;

    /* renamed from: j, reason: collision with root package name */
    private final float f2080j;

    private o(float f6, float f7, float f8, float f9, float f10, float f11, float[] fArr, float f12, float f13, float f14) {
        this.f2076f = f6;
        this.f2071a = f7;
        this.f2072b = f8;
        this.f2073c = f9;
        this.f2074d = f10;
        this.f2075e = f11;
        this.f2077g = fArr;
        this.f2078h = f12;
        this.f2079i = f13;
        this.f2080j = f14;
    }

    static o k(float[] fArr, float f6, float f7, float f8, boolean z5) {
        float[][] fArr2 = b.f2034a;
        float f9 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f10 = fArr3[0] * f9;
        float f11 = fArr[1];
        float f12 = f10 + (fArr3[1] * f11);
        float f13 = fArr[2];
        float f14 = f12 + (fArr3[2] * f13);
        float[] fArr4 = fArr2[1];
        float f15 = (fArr4[0] * f9) + (fArr4[1] * f11) + (fArr4[2] * f13);
        float[] fArr5 = fArr2[2];
        float f16 = (f9 * fArr5[0]) + (f11 * fArr5[1]) + (f13 * fArr5[2]);
        float f17 = (f8 / 10.0f) + 0.8f;
        float d6 = ((double) f17) >= 0.9d ? b.d(0.59f, 0.69f, (f17 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f17 - 0.8f) * 10.0f);
        float exp = z5 ? 1.0f : (1.0f - (((float) Math.exp(((-f6) - 42.0f) / 92.0f)) * 0.2777778f)) * f17;
        double d7 = exp;
        if (d7 > 1.0d) {
            exp = 1.0f;
        } else if (d7 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f14) * exp) + 1.0f) - exp, (((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp};
        float f18 = 1.0f / ((5.0f * f6) + 1.0f);
        float f19 = f18 * f18 * f18 * f18;
        float f20 = 1.0f - f19;
        float cbrt = (f19 * f6) + (0.1f * f20 * f20 * ((float) Math.cbrt(f6 * 5.0d)));
        float h6 = b.h(f7) / fArr[1];
        double d8 = h6;
        float sqrt = ((float) Math.sqrt(d8)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d8, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f16) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f14) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f15) / 100.0d, 0.42d), pow2};
        float f21 = fArr7[0];
        float f22 = fArr7[1];
        return new o(h6, ((((f21 * 400.0f) / (f21 + 27.13f)) * 2.0f) + ((f22 * 400.0f) / (f22 + 27.13f)) + (((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f)) * pow, pow, pow, d6, f17, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float a() {
        return this.f2071a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float b() {
        return this.f2074d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.f2078h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float d() {
        return this.f2079i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float e() {
        return this.f2076f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float f() {
        return this.f2072b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float g() {
        return this.f2075e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float h() {
        return this.f2073c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float[] i() {
        return this.f2077g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        return this.f2080j;
    }
}
