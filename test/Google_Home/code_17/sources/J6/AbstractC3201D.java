package j6;

import O5.C1352h;
import O5.F;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: j6.D, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3201D {
    public static final byte a(String str) {
        AbstractC3255y.i(str, "<this>");
        O5.y b8 = b(str);
        if (b8 != null) {
            return b8.f();
        }
        v.h(str);
        throw new C1352h();
    }

    public static final O5.y b(String str) {
        AbstractC3255y.i(str, "<this>");
        return c(str, 10);
    }

    public static final O5.y c(String str, int i8) {
        int compare;
        AbstractC3255y.i(str, "<this>");
        O5.A f8 = f(str, i8);
        if (f8 == null) {
            return null;
        }
        int f9 = f8.f();
        compare = Integer.compare(f9 ^ Integer.MIN_VALUE, O5.A.b(255) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return O5.y.a(O5.y.b((byte) f9));
    }

    public static final int d(String str) {
        AbstractC3255y.i(str, "<this>");
        O5.A e8 = e(str);
        if (e8 != null) {
            return e8.f();
        }
        v.h(str);
        throw new C1352h();
    }

    public static final O5.A e(String str) {
        AbstractC3255y.i(str, "<this>");
        return f(str, 10);
    }

    public static final O5.A f(String str, int i8) {
        int i9;
        int compare;
        int compare2;
        int compare3;
        AbstractC3255y.i(str, "<this>");
        AbstractC3202a.a(i8);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char charAt = str.charAt(0);
        if (AbstractC3255y.k(charAt, 48) < 0) {
            i9 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i9 = 0;
        }
        int b8 = O5.A.b(i8);
        int i11 = 119304647;
        while (i9 < length) {
            int b9 = AbstractC3203b.b(str.charAt(i9), i8);
            if (b9 >= 0) {
                compare = Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
                if (compare > 0) {
                    if (i11 == 119304647) {
                        i11 = AbstractC3200C.a(-1, b8);
                        compare3 = Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
                        if (compare3 > 0) {
                        }
                    }
                    return null;
                }
                int b10 = O5.A.b(i10 * b8);
                int b11 = O5.A.b(O5.A.b(b9) + b10);
                compare2 = Integer.compare(b11 ^ Integer.MIN_VALUE, b10 ^ Integer.MIN_VALUE);
                if (compare2 < 0) {
                    return null;
                }
                i9++;
                i10 = b11;
            } else {
                return null;
            }
        }
        return O5.A.a(i10);
    }

    public static final long g(String str) {
        AbstractC3255y.i(str, "<this>");
        O5.C h8 = h(str);
        if (h8 != null) {
            return h8.g();
        }
        v.h(str);
        throw new C1352h();
    }

    public static final O5.C h(String str) {
        AbstractC3255y.i(str, "<this>");
        return i(str, 10);
    }

    public static final O5.C i(String str, int i8) {
        int compare;
        int compare2;
        int compare3;
        AbstractC3255y.i(str, "<this>");
        AbstractC3202a.a(i8);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i9 = 0;
        char charAt = str.charAt(0);
        if (AbstractC3255y.k(charAt, 48) < 0) {
            i9 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long b8 = O5.C.b(i8);
        long j8 = 0;
        long j9 = 512409557603043100L;
        while (i9 < length) {
            if (AbstractC3203b.b(str.charAt(i9), i8) >= 0) {
                compare = Long.compare(j8 ^ Long.MIN_VALUE, j9 ^ Long.MIN_VALUE);
                if (compare > 0) {
                    if (j9 == 512409557603043100L) {
                        j9 = AbstractC3198A.a(-1L, b8);
                        compare3 = Long.compare(j8 ^ Long.MIN_VALUE, j9 ^ Long.MIN_VALUE);
                        if (compare3 > 0) {
                        }
                    }
                    return null;
                }
                long b9 = O5.C.b(j8 * b8);
                long b10 = O5.C.b(O5.C.b(O5.A.b(r13) & 4294967295L) + b9);
                compare2 = Long.compare(b10 ^ Long.MIN_VALUE, b9 ^ Long.MIN_VALUE);
                if (compare2 < 0) {
                    return null;
                }
                i9++;
                j8 = b10;
            } else {
                return null;
            }
        }
        return O5.C.a(j8);
    }

    public static final short j(String str) {
        AbstractC3255y.i(str, "<this>");
        F k8 = k(str);
        if (k8 != null) {
            return k8.f();
        }
        v.h(str);
        throw new C1352h();
    }

    public static final F k(String str) {
        AbstractC3255y.i(str, "<this>");
        return l(str, 10);
    }

    public static final F l(String str, int i8) {
        int compare;
        AbstractC3255y.i(str, "<this>");
        O5.A f8 = f(str, i8);
        if (f8 == null) {
            return null;
        }
        int f9 = f8.f();
        compare = Integer.compare(f9 ^ Integer.MIN_VALUE, O5.A.b(65535) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return F.a(F.b((short) f9));
    }
}
