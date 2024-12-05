package h6;

import M5.N;
import d6.C2559c;
import d6.i;
import d6.l;
import d6.m;
import g6.n;
import h6.C2758a;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: h6.c */
/* loaded from: classes5.dex */
public abstract class AbstractC2760c {
    public static final long i(long j8, int i8) {
        return C2758a.h((j8 << 1) + i8);
    }

    public static final long j(long j8) {
        return C2758a.h((j8 << 1) + 1);
    }

    public static final long k(long j8) {
        if (new l(-4611686018426L, 4611686018426L).l(j8)) {
            return l(n(j8));
        }
        return j(m.m(j8, -4611686018427387903L, 4611686018427387903L));
    }

    public static final long l(long j8) {
        return C2758a.h(j8 << 1);
    }

    public static final long m(long j8) {
        if (new l(-4611686018426999999L, 4611686018426999999L).l(j8)) {
            return l(j8);
        }
        return j(o(j8));
    }

    public static final long n(long j8) {
        return j8 * 1000000;
    }

    public static final long o(long j8) {
        return j8 / 1000000;
    }

    public static final long p(String str, boolean z8) {
        int i8;
        boolean z9;
        boolean z10;
        long j8;
        String str2 = str;
        int length = str.length();
        if (length != 0) {
            C2758a.C0756a c0756a = C2758a.f31409b;
            long b8 = c0756a.b();
            char charAt = str2.charAt(0);
            if (charAt == '+' || charAt == '-') {
                i8 = 1;
            } else {
                i8 = 0;
            }
            if (i8 > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 && n.x0(str2, '-', false, 2, null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (length > i8) {
                char c8 = '9';
                char c9 = '0';
                if (str2.charAt(i8) == 'P') {
                    int i9 = i8 + 1;
                    if (i9 != length) {
                        EnumC2761d enumC2761d = null;
                        boolean z11 = false;
                        while (i9 < length) {
                            if (str2.charAt(i9) == 'T') {
                                if (!z11 && (i9 = i9 + 1) != length) {
                                    z11 = true;
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } else {
                                int i10 = i9;
                                while (i10 < str.length()) {
                                    char charAt2 = str2.charAt(i10);
                                    if (!new C2559c(c9, c8).l(charAt2) && !n.G("+-.", charAt2, false, 2, null)) {
                                        break;
                                    }
                                    i10++;
                                    c8 = '9';
                                    c9 = '0';
                                }
                                AbstractC3159y.g(str2, "null cannot be cast to non-null type java.lang.String");
                                String substring = str2.substring(i9, i10);
                                AbstractC3159y.h(substring, "substring(...)");
                                if (substring.length() != 0) {
                                    int length2 = i9 + substring.length();
                                    if (length2 >= 0 && length2 <= n.M(str)) {
                                        char charAt3 = str2.charAt(length2);
                                        i9 = length2 + 1;
                                        EnumC2761d d8 = AbstractC2763f.d(charAt3, z11);
                                        if (enumC2761d != null && enumC2761d.compareTo(d8) <= 0) {
                                            throw new IllegalArgumentException("Unexpected order of duration components");
                                        }
                                        int R8 = n.R(substring, '.', 0, false, 6, null);
                                        if (d8 == EnumC2761d.f31419e && R8 > 0) {
                                            AbstractC3159y.g(substring, "null cannot be cast to non-null type java.lang.String");
                                            String substring2 = substring.substring(0, R8);
                                            AbstractC3159y.h(substring2, "substring(...)");
                                            long E8 = C2758a.E(b8, t(q(substring2), d8));
                                            AbstractC3159y.g(substring, "null cannot be cast to non-null type java.lang.String");
                                            String substring3 = substring.substring(R8);
                                            AbstractC3159y.h(substring3, "substring(...)");
                                            b8 = C2758a.E(E8, r(Double.parseDouble(substring3), d8));
                                        } else {
                                            b8 = C2758a.E(b8, t(q(substring), d8));
                                        }
                                        enumC2761d = d8;
                                        c8 = '9';
                                        c9 = '0';
                                        str2 = str;
                                    } else {
                                        throw new IllegalArgumentException("Missing unit for value " + substring);
                                    }
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else if (!z8) {
                    String str3 = "Unexpected order of duration components";
                    if (n.v(str, i8, "Infinity", 0, Math.max(length - i8, 8), true)) {
                        b8 = c0756a.a();
                    } else {
                        boolean z12 = !z9;
                        if (z9 && str.charAt(i8) == '(' && n.R0(str) == ')') {
                            i8++;
                            length--;
                            if (i8 != length) {
                                j8 = b8;
                                z12 = true;
                            } else {
                                throw new IllegalArgumentException("No components");
                            }
                        } else {
                            j8 = b8;
                        }
                        boolean z13 = false;
                        EnumC2761d enumC2761d2 = null;
                        while (i8 < length) {
                            if (z13 && z12) {
                                while (i8 < str.length() && str.charAt(i8) == ' ') {
                                    i8++;
                                }
                            }
                            int i11 = i8;
                            while (i11 < str.length()) {
                                char charAt4 = str.charAt(i11);
                                if (!new C2559c('0', '9').l(charAt4) && charAt4 != '.') {
                                    break;
                                }
                                i11++;
                            }
                            AbstractC3159y.g(str, "null cannot be cast to non-null type java.lang.String");
                            String substring4 = str.substring(i8, i11);
                            AbstractC3159y.h(substring4, "substring(...)");
                            if (substring4.length() != 0) {
                                int length3 = i8 + substring4.length();
                                int i12 = length3;
                                while (i12 < str.length()) {
                                    if (!new C2559c('a', 'z').l(str.charAt(i12))) {
                                        break;
                                    }
                                    i12++;
                                }
                                AbstractC3159y.g(str, "null cannot be cast to non-null type java.lang.String");
                                String substring5 = str.substring(length3, i12);
                                AbstractC3159y.h(substring5, "substring(...)");
                                i8 = length3 + substring5.length();
                                EnumC2761d e8 = AbstractC2763f.e(substring5);
                                if (enumC2761d2 == null || enumC2761d2.compareTo(e8) > 0) {
                                    String str4 = str3;
                                    int R9 = n.R(substring4, '.', 0, false, 6, null);
                                    if (R9 > 0) {
                                        AbstractC3159y.g(substring4, "null cannot be cast to non-null type java.lang.String");
                                        String substring6 = substring4.substring(0, R9);
                                        AbstractC3159y.h(substring6, "substring(...)");
                                        long E9 = C2758a.E(j8, t(Long.parseLong(substring6), e8));
                                        AbstractC3159y.g(substring4, "null cannot be cast to non-null type java.lang.String");
                                        String substring7 = substring4.substring(R9);
                                        AbstractC3159y.h(substring7, "substring(...)");
                                        j8 = C2758a.E(E9, r(Double.parseDouble(substring7), e8));
                                        if (i8 < length) {
                                            throw new IllegalArgumentException("Fractional component must be last");
                                        }
                                    } else {
                                        j8 = C2758a.E(j8, t(Long.parseLong(substring4), e8));
                                    }
                                    enumC2761d2 = e8;
                                    str3 = str4;
                                    z13 = true;
                                } else {
                                    throw new IllegalArgumentException(str3);
                                }
                            } else {
                                throw new IllegalArgumentException();
                            }
                        }
                        b8 = j8;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
                if (z10) {
                    return C2758a.K(b8);
                }
                return b8;
            }
            throw new IllegalArgumentException("No components");
        }
        throw new IllegalArgumentException("The string is empty");
    }

    private static final long q(String str) {
        int i8;
        int length = str.length();
        if (length > 0 && n.G("+-", str.charAt(0), false, 2, null)) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        if (length - i8 > 16) {
            Iterable iVar = new i(i8, n.M(str));
            if (!(iVar instanceof Collection) || !((Collection) iVar).isEmpty()) {
                Iterator it = iVar.iterator();
                while (it.hasNext()) {
                    if (!new C2559c('0', '9').l(str.charAt(((N) it).nextInt()))) {
                    }
                }
            }
            if (str.charAt(0) == '-') {
                return Long.MIN_VALUE;
            }
            return Long.MAX_VALUE;
        }
        if (n.C(str, "+", false, 2, null)) {
            str = n.P0(str, 1);
        }
        return Long.parseLong(str);
    }

    public static final long r(double d8, EnumC2761d unit) {
        AbstractC3159y.i(unit, "unit");
        double a8 = AbstractC2762e.a(d8, unit, EnumC2761d.f31416b);
        if (!Double.isNaN(a8)) {
            long e8 = Z5.a.e(a8);
            if (new l(-4611686018426999999L, 4611686018426999999L).l(e8)) {
                return l(e8);
            }
            return k(Z5.a.e(AbstractC2762e.a(d8, unit, EnumC2761d.f31418d)));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }

    public static final long s(int i8, EnumC2761d unit) {
        AbstractC3159y.i(unit, "unit");
        if (unit.compareTo(EnumC2761d.f31419e) <= 0) {
            return l(AbstractC2762e.c(i8, unit, EnumC2761d.f31416b));
        }
        return t(i8, unit);
    }

    public static final long t(long j8, EnumC2761d unit) {
        AbstractC3159y.i(unit, "unit");
        EnumC2761d enumC2761d = EnumC2761d.f31416b;
        long c8 = AbstractC2762e.c(4611686018426999999L, enumC2761d, unit);
        if (new l(-c8, c8).l(j8)) {
            return l(AbstractC2762e.c(j8, unit, enumC2761d));
        }
        return j(m.m(AbstractC2762e.b(j8, unit, EnumC2761d.f31418d), -4611686018427387903L, 4611686018427387903L));
    }
}
