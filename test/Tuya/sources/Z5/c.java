package Z5;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class c extends b {
    public static int a(int i8) {
        if (i8 < 0) {
            return -1;
        }
        if (i8 > 0) {
            return 1;
        }
        return 0;
    }

    public static int b(long j8) {
        if (j8 < 0) {
            return -1;
        }
        if (j8 > 0) {
            return 1;
        }
        return 0;
    }

    public static int c(double d8) {
        if (!Double.isNaN(d8)) {
            if (d8 > 2.147483647E9d) {
                return Integer.MAX_VALUE;
            }
            if (d8 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d8);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static int d(float f8) {
        if (!Float.isNaN(f8)) {
            return Math.round(f8);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static long e(double d8) {
        if (!Double.isNaN(d8)) {
            return Math.round(d8);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static long f(float f8) {
        return a.e(f8);
    }
}
