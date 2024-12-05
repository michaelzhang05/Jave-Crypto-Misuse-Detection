package d6;

import d6.C2563g;
import kotlin.jvm.internal.AbstractC3159y;

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

    public static int l(int i8, InterfaceC2562f range) {
        AbstractC3159y.i(range, "range");
        if (range instanceof InterfaceC2561e) {
            return ((Number) m.o(Integer.valueOf(i8), (InterfaceC2561e) range)).intValue();
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

    public static long n(long j8, InterfaceC2562f range) {
        AbstractC3159y.i(range, "range");
        if (range instanceof InterfaceC2561e) {
            return ((Number) m.o(Long.valueOf(j8), (InterfaceC2561e) range)).longValue();
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

    public static Comparable o(Comparable comparable, InterfaceC2561e range) {
        AbstractC3159y.i(comparable, "<this>");
        AbstractC3159y.i(range, "range");
        if (!range.isEmpty()) {
            if (range.a(comparable, range.getStart()) && !range.a(range.getStart(), comparable)) {
                return range.getStart();
            }
            if (range.a(range.getEndInclusive(), comparable) && !range.a(comparable, range.getEndInclusive())) {
                return range.getEndInclusive();
            }
            return comparable;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static C2563g p(int i8, int i9) {
        return C2563g.f30191d.a(i8, i9, -1);
    }

    public static C2563g q(C2563g c2563g) {
        AbstractC3159y.i(c2563g, "<this>");
        return C2563g.f30191d.a(c2563g.h(), c2563g.g(), -c2563g.i());
    }

    public static C2563g r(C2563g c2563g, int i8) {
        boolean z8;
        AbstractC3159y.i(c2563g, "<this>");
        if (i8 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        n.a(z8, Integer.valueOf(i8));
        C2563g.a aVar = C2563g.f30191d;
        int g8 = c2563g.g();
        int h8 = c2563g.h();
        if (c2563g.i() <= 0) {
            i8 = -i8;
        }
        return aVar.a(g8, h8, i8);
    }

    public static i s(int i8, int i9) {
        if (i9 <= Integer.MIN_VALUE) {
            return i.f30199e.a();
        }
        return new i(i8, i9 - 1);
    }
}
