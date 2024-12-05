package androidx.core.content.res;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final float f2025a;

    /* renamed from: b, reason: collision with root package name */
    private final float f2026b;

    /* renamed from: c, reason: collision with root package name */
    private final float f2027c;

    /* renamed from: d, reason: collision with root package name */
    private final float f2028d;

    /* renamed from: e, reason: collision with root package name */
    private final float f2029e;

    /* renamed from: f, reason: collision with root package name */
    private final float f2030f;

    /* renamed from: g, reason: collision with root package name */
    private final float f2031g;

    /* renamed from: h, reason: collision with root package name */
    private final float f2032h;

    /* renamed from: i, reason: collision with root package name */
    private final float f2033i;

    a(float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
        this.f2025a = f6;
        this.f2026b = f7;
        this.f2027c = f8;
        this.f2028d = f9;
        this.f2029e = f10;
        this.f2030f = f11;
        this.f2031g = f12;
        this.f2032h = f13;
        this.f2033i = f14;
    }

    private static a b(float f6, float f7, float f8) {
        float f9 = 100.0f;
        float f10 = 1000.0f;
        a aVar = null;
        float f11 = 1000.0f;
        float f12 = 0.0f;
        while (Math.abs(f12 - f9) > 0.01f) {
            float f13 = ((f9 - f12) / 2.0f) + f12;
            int p6 = e(f13, f7, f6).p();
            float b6 = b.b(p6);
            float abs = Math.abs(f8 - b6);
            if (abs < 0.2f) {
                a c6 = c(p6);
                float a6 = c6.a(e(c6.k(), c6.i(), f6));
                if (a6 <= 1.0f) {
                    aVar = c6;
                    f10 = abs;
                    f11 = a6;
                }
            }
            if (f10 == 0.0f && f11 == 0.0f) {
                break;
            }
            if (b6 < f8) {
                f12 = f13;
            } else {
                f9 = f13;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a c(int i6) {
        return d(i6, o.f2070k);
    }

    static a d(int i6, o oVar) {
        float[] f6 = b.f(i6);
        float[][] fArr = b.f2034a;
        float f7 = f6[0];
        float[] fArr2 = fArr[0];
        float f8 = fArr2[0] * f7;
        float f9 = f6[1];
        float f10 = f8 + (fArr2[1] * f9);
        float f11 = f6[2];
        float f12 = f10 + (fArr2[2] * f11);
        float[] fArr3 = fArr[1];
        float f13 = (fArr3[0] * f7) + (fArr3[1] * f9) + (fArr3[2] * f11);
        float[] fArr4 = fArr[2];
        float f14 = (f7 * fArr4[0]) + (f9 * fArr4[1]) + (f11 * fArr4[2]);
        float f15 = oVar.i()[0] * f12;
        float f16 = oVar.i()[1] * f13;
        float f17 = oVar.i()[2] * f14;
        float pow = (float) Math.pow((oVar.c() * Math.abs(f15)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((oVar.c() * Math.abs(f16)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((oVar.c() * Math.abs(f17)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f15) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f16) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f17) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d6 = signum3;
        float f18 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d6)) / 11.0f;
        float f19 = ((float) ((signum + signum2) - (d6 * 2.0d))) / 9.0f;
        float f20 = signum2 * 20.0f;
        float f21 = (((signum * 20.0f) + f20) + (21.0f * signum3)) / 20.0f;
        float f22 = (((signum * 40.0f) + f20) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f19, f18)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f23 = atan2;
        float f24 = (3.1415927f * f23) / 180.0f;
        float pow4 = ((float) Math.pow((f22 * oVar.f()) / oVar.a(), oVar.b() * oVar.j())) * 100.0f;
        float d7 = oVar.d() * (4.0f / oVar.b()) * ((float) Math.sqrt(pow4 / 100.0f)) * (oVar.a() + 4.0f);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, oVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f23) < 20.14d ? 360.0f + f23 : f23) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * oVar.g()) * oVar.h()) * ((float) Math.sqrt((f18 * f18) + (f19 * f19)))) / (f21 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float d8 = pow5 * oVar.d();
        float sqrt = ((float) Math.sqrt((r3 * oVar.b()) / (oVar.a() + 4.0f))) * 50.0f;
        float f25 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * d8) + 1.0f)) * 43.85965f;
        double d9 = f24;
        return new a(f23, pow5, pow4, d7, d8, sqrt, f25, log * ((float) Math.cos(d9)), log * ((float) Math.sin(d9)));
    }

    private static a e(float f6, float f7, float f8) {
        return f(f6, f7, f8, o.f2070k);
    }

    private static a f(float f6, float f7, float f8, o oVar) {
        float b6 = (4.0f / oVar.b()) * ((float) Math.sqrt(f6 / 100.0d)) * (oVar.a() + 4.0f) * oVar.d();
        float d6 = f7 * oVar.d();
        float sqrt = ((float) Math.sqrt(((f7 / ((float) Math.sqrt(r4))) * oVar.b()) / (oVar.a() + 4.0f))) * 50.0f;
        float f9 = (1.7f * f6) / ((0.007f * f6) + 1.0f);
        float log = ((float) Math.log((d6 * 0.0228d) + 1.0d)) * 43.85965f;
        double d7 = (3.1415927f * f8) / 180.0f;
        return new a(f8, f7, f6, b6, d6, sqrt, f9, log * ((float) Math.cos(d7)), log * ((float) Math.sin(d7)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(float f6, float f7, float f8) {
        return n(f6, f7, f8, o.f2070k);
    }

    static int n(float f6, float f7, float f8, o oVar) {
        if (f7 < 1.0d || Math.round(f8) <= 0.0d || Math.round(f8) >= 100.0d) {
            return b.a(f8);
        }
        float min = f6 < 0.0f ? 0.0f : Math.min(360.0f, f6);
        float f9 = f7;
        a aVar = null;
        float f10 = 0.0f;
        boolean z5 = true;
        while (Math.abs(f10 - f7) >= 0.4f) {
            a b6 = b(min, f9, f8);
            if (!z5) {
                if (b6 == null) {
                    f7 = f9;
                } else {
                    f10 = f9;
                    aVar = b6;
                }
                f9 = ((f7 - f10) / 2.0f) + f10;
            } else {
                if (b6 != null) {
                    return b6.o(oVar);
                }
                f9 = ((f7 - f10) / 2.0f) + f10;
                z5 = false;
            }
        }
        return aVar == null ? b.a(f8) : aVar.o(oVar);
    }

    float a(a aVar) {
        float l6 = l() - aVar.l();
        float g6 = g() - aVar.g();
        float h6 = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((l6 * l6) + (g6 * g6) + (h6 * h6)), 0.63d) * 1.41d);
    }

    float g() {
        return this.f2032h;
    }

    float h() {
        return this.f2033i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float i() {
        return this.f2026b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        return this.f2025a;
    }

    float k() {
        return this.f2027c;
    }

    float l() {
        return this.f2031g;
    }

    int o(o oVar) {
        float pow = (float) Math.pow(((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, oVar.e()), 0.73d), 1.1111111111111112d);
        double j6 = (j() * 3.1415927f) / 180.0f;
        float cos = ((float) (Math.cos(2.0d + j6) + 3.8d)) * 0.25f;
        float a6 = oVar.a() * ((float) Math.pow(k() / 100.0d, (1.0d / oVar.b()) / oVar.j()));
        float g6 = cos * 3846.1538f * oVar.g() * oVar.h();
        float f6 = a6 / oVar.f();
        float sin = (float) Math.sin(j6);
        float cos2 = (float) Math.cos(j6);
        float f7 = (((0.305f + f6) * 23.0f) * pow) / (((g6 * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f8 = cos2 * f7;
        float f9 = f7 * sin;
        float f10 = f6 * 460.0f;
        float f11 = (((451.0f * f8) + f10) + (288.0f * f9)) / 1403.0f;
        float f12 = ((f10 - (891.0f * f8)) - (261.0f * f9)) / 1403.0f;
        float signum = Math.signum(f11) * (100.0f / oVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f11) * 27.13d) / (400.0d - Math.abs(f11))), 2.380952380952381d));
        float signum2 = Math.signum(f12) * (100.0f / oVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f12) * 27.13d) / (400.0d - Math.abs(f12))), 2.380952380952381d));
        float signum3 = Math.signum(((f10 - (f8 * 220.0f)) - (f9 * 6300.0f)) / 1403.0f) * (100.0f / oVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f13 = signum / oVar.i()[0];
        float f14 = signum2 / oVar.i()[1];
        float f15 = signum3 / oVar.i()[2];
        float[][] fArr = b.f2035b;
        float[] fArr2 = fArr[0];
        float f16 = (fArr2[0] * f13) + (fArr2[1] * f14) + (fArr2[2] * f15);
        float[] fArr3 = fArr[1];
        float f17 = (fArr3[0] * f13) + (fArr3[1] * f14) + (fArr3[2] * f15);
        float[] fArr4 = fArr[2];
        return androidx.core.graphics.a.b(f16, f17, (f13 * fArr4[0]) + (f14 * fArr4[1]) + (f15 * fArr4[2]));
    }

    int p() {
        return o(o.f2070k);
    }
}
