package e.e.b.b.u;

/* compiled from: MathUtils.java */
/* loaded from: classes2.dex */
public final class a {
    public static float a(float f2, float f3, float f4, float f5) {
        return (float) Math.hypot(f4 - f2, f5 - f3);
    }

    public static float b(float f2, float f3, float f4, float f5, float f6, float f7) {
        return d(a(f2, f3, f4, f5), a(f2, f3, f6, f5), a(f2, f3, f6, f7), a(f2, f3, f4, f7));
    }

    public static float c(float f2, float f3, float f4) {
        return ((1.0f - f4) * f2) + (f4 * f3);
    }

    private static float d(float f2, float f3, float f4, float f5) {
        return (f2 <= f3 || f2 <= f4 || f2 <= f5) ? (f3 <= f4 || f3 <= f5) ? f4 > f5 ? f4 : f5 : f3 : f2;
    }
}
