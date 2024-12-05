package g6;

import g6.C2887g;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class o extends n {
    public static float c(float f8, float f9) {
        if (f8 < f9) {
            return f9;
        }
        return f8;
    }

    public static int d(int i8, int i9) {
        if (i8 < i9) {
            return i9;
        }
        return i8;
    }

    public static long e(long j8, long j9) {
        if (j8 < j9) {
            return j9;
        }
        return j8;
    }

    public static float f(float f8, float f9) {
        if (f8 > f9) {
            return f9;
        }
        return f8;
    }

    public static int g(int i8, int i9) {
        if (i8 > i9) {
            return i9;
        }
        return i8;
    }

    public static long h(long j8, long j9) {
        if (j8 > j9) {
            return j9;
        }
        return j8;
    }

    public static double i(double d8, double d9, double d10) {
        if (d9 <= d10) {
            if (d8 < d9) {
                return d9;
            }
            if (d8 > d10) {
                return d10;
            }
            return d8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d10 + " is less than minimum " + d9 + '.');
    }

    public static float j(float f8, float f9, float f10) {
        if (f9 <= f10) {
            if (f8 < f9) {
                return f9;
            }
            if (f8 > f10) {
                return f10;
            }
            return f8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f10 + " is less than minimum " + f9 + '.');
    }

    public static int k(int i8, int i9, int i10) {
        if (i9 <= i10) {
            if (i8 < i9) {
                return i9;
            }
            if (i8 > i10) {
                return i10;
            }
            return i8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i10 + " is less than minimum " + i9 + '.');
    }

    public static int l(int i8, InterfaceC2886f range) {
        AbstractC3255y.i(range, "range");
        if (range instanceof InterfaceC2885e) {
            return ((Number) m.o(Integer.valueOf(i8), (InterfaceC2885e) range)).intValue();
        }
        if (!range.isEmpty()) {
            if (i8 < ((Number) range.getStart()).intValue()) {
                return ((Number) range.getStart()).intValue();
            }
            if (i8 > ((Number) range.getEndInclusive()).intValue()) {
                return ((Number) range.getEndInclusive()).intValue();
            }
            return i8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static long m(long j8, long j9, long j10) {
        if (j9 <= j10) {
            if (j8 < j9) {
                return j9;
            }
            if (j8 > j10) {
                return j10;
            }
            return j8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j10 + " is less than minimum " + j9 + '.');
    }

    public static long n(long j8, InterfaceC2886f range) {
        AbstractC3255y.i(range, "range");
        if (range instanceof InterfaceC2885e) {
            return ((Number) m.o(Long.valueOf(j8), (InterfaceC2885e) range)).longValue();
        }
        if (!range.isEmpty()) {
            if (j8 < ((Number) range.getStart()).longValue()) {
                return ((Number) range.getStart()).longValue();
            }
            if (j8 > ((Number) range.getEndInclusive()).longValue()) {
                return ((Number) range.getEndInclusive()).longValue();
            }
            return j8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static Comparable o(Comparable comparable, InterfaceC2885e range) {
        AbstractC3255y.i(comparable, "<this>");
        AbstractC3255y.i(range, "range");
        if (!range.isEmpty()) {
            if (range.c(comparable, range.getStart()) && !range.c(range.getStart(), comparable)) {
                return range.getStart();
            }
            if (range.c(range.getEndInclusive(), comparable) && !range.c(comparable, range.getEndInclusive())) {
                return range.getEndInclusive();
            }
            return comparable;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static C2887g p(int i8, int i9) {
        return C2887g.f32071d.a(i8, i9, -1);
    }

    public static C2887g q(C2887g c2887g) {
        AbstractC3255y.i(c2887g, "<this>");
        return C2887g.f32071d.a(c2887g.f(), c2887g.e(), -c2887g.j());
    }

    public static C2887g r(C2887g c2887g, int i8) {
        boolean z8;
        AbstractC3255y.i(c2887g, "<this>");
        if (i8 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        n.a(z8, Integer.valueOf(i8));
        C2887g.a aVar = C2887g.f32071d;
        int e8 = c2887g.e();
        int f8 = c2887g.f();
        if (c2887g.j() <= 0) {
            i8 = -i8;
        }
        return aVar.a(e8, f8, i8);
    }

    public static i s(int i8, int i9) {
        if (i9 <= Integer.MIN_VALUE) {
            return i.f32079e.a();
        }
        return new i(i8, i9 - 1);
    }
}
