package k6;

import P5.N;
import c6.AbstractC2055a;
import g6.C2883c;
import g6.i;
import g6.l;
import g6.m;
import j6.n;
import java.util.Collection;
import java.util.Iterator;
import k6.C3225a;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: k6.c */
/* loaded from: classes5.dex */
public abstract class AbstractC3227c {
    public static final long i(long j8, int i8) {
        return C3225a.h((j8 << 1) + i8);
    }

    public static final long j(long j8) {
        return C3225a.h((j8 << 1) + 1);
    }

    public static final long k(long j8) {
        if (new l(-4611686018426L, 4611686018426L).k(j8)) {
            return l(n(j8));
        }
        return j(m.m(j8, -4611686018427387903L, 4611686018427387903L));
    }

    public static final long l(long j8) {
        return C3225a.h(j8 << 1);
    }

    public static final long m(long j8) {
        if (new l(-4611686018426999999L, 4611686018426999999L).k(j8)) {
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
        long j8;
        String str2 = str;
        int length = str.length();
        if (length != 0) {
            C3225a.C0782a c0782a = C3225a.f34131b;
            long b8 = c0782a.b();
            char charAt = str2.charAt(0);
            int i8 = (charAt == '+' || charAt == '-') ? 1 : 0;
            boolean z9 = i8 > 0;
            boolean z10 = z9 && n.x0(str2, '-', false, 2, null);
            if (length > i8) {
                char c8 = '9';
                char c9 = '0';
                if (str2.charAt(i8) == 'P') {
                    int i9 = i8 + 1;
                    if (i9 == length) {
                        throw new IllegalArgumentException();
                    }
                    EnumC3228d enumC3228d = null;
                    boolean z11 = false;
                    while (i9 < length) {
                        if (str2.charAt(i9) != 'T') {
                            int i10 = i9;
                            while (i10 < str.length()) {
                                char charAt2 = str2.charAt(i10);
                                if (!new C2883c(c9, c8).k(charAt2) && !n.G("+-.", charAt2, false, 2, null)) {
                                    break;
                                }
                                i10++;
                                c8 = '9';
                                c9 = '0';
                            }
                            AbstractC3255y.g(str2, "null cannot be cast to non-null type java.lang.String");
                            String substring = str2.substring(i9, i10);
                            AbstractC3255y.h(substring, "substring(...)");
                            if (substring.length() != 0) {
                                int length2 = i9 + substring.length();
                                if (length2 >= 0 && length2 <= n.M(str)) {
                                    char charAt3 = str2.charAt(length2);
                                    i9 = length2 + 1;
                                    EnumC3228d d8 = AbstractC3230f.d(charAt3, z11);
                                    if (enumC3228d != null && enumC3228d.compareTo(d8) <= 0) {
                                        throw new IllegalArgumentException("Unexpected order of duration components");
                                    }
                                    int R8 = n.R(substring, '.', 0, false, 6, null);
                                    if (d8 == EnumC3228d.f34141e && R8 > 0) {
                                        AbstractC3255y.g(substring, "null cannot be cast to non-null type java.lang.String");
                                        String substring2 = substring.substring(0, R8);
                                        AbstractC3255y.h(substring2, "substring(...)");
                                        long I8 = C3225a.I(b8, t(q(substring2), d8));
                                        AbstractC3255y.g(substring, "null cannot be cast to non-null type java.lang.String");
                                        String substring3 = substring.substring(R8);
                                        AbstractC3255y.h(substring3, "substring(...)");
                                        b8 = C3225a.I(I8, r(Double.parseDouble(substring3), d8));
                                    } else {
                                        b8 = C3225a.I(b8, t(q(substring), d8));
                                    }
                                    enumC3228d = d8;
                                    c8 = '9';
                                    c9 = '0';
                                    str2 = str;
                                } else {
                                    throw new IllegalArgumentException("Missing unit for value " + substring);
                                }
                            } else {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (z11 || (i9 = i9 + 1) == length) {
                                throw new IllegalArgumentException();
                            }
                            z11 = true;
                        }
                    }
                } else {
                    if (z8) {
                        throw new IllegalArgumentException();
                    }
                    String str3 = "Unexpected order of duration components";
                    if (n.v(str, i8, "Infinity", 0, Math.max(length - i8, 8), true)) {
                        b8 = c0782a.a();
                    } else {
                        boolean z12 = !z9;
                        if (z9 && str.charAt(i8) == '(' && n.R0(str) == ')') {
                            i8++;
                            length--;
                            if (i8 == length) {
                                throw new IllegalArgumentException("No components");
                            }
                            j8 = b8;
                            z12 = true;
                        } else {
                            j8 = b8;
                        }
                        boolean z13 = false;
                        EnumC3228d enumC3228d2 = null;
                        while (i8 < length) {
                            if (z13 && z12) {
                                while (i8 < str.length() && str.charAt(i8) == ' ') {
                                    i8++;
                                }
                            }
                            int i11 = i8;
                            while (i11 < str.length()) {
                                char charAt4 = str.charAt(i11);
                                if (!new C2883c('0', '9').k(charAt4) && charAt4 != '.') {
                                    break;
                                }
                                i11++;
                            }
                            AbstractC3255y.g(str, "null cannot be cast to non-null type java.lang.String");
                            String substring4 = str.substring(i8, i11);
                            AbstractC3255y.h(substring4, "substring(...)");
                            if (substring4.length() != 0) {
                                int length3 = i8 + substring4.length();
                                int i12 = length3;
                                while (i12 < str.length()) {
                                    if (!new C2883c('a', 'z').k(str.charAt(i12))) {
                                        break;
                                    }
                                    i12++;
                                }
                                AbstractC3255y.g(str, "null cannot be cast to non-null type java.lang.String");
                                String substring5 = str.substring(length3, i12);
                                AbstractC3255y.h(substring5, "substring(...)");
                                i8 = length3 + substring5.length();
                                EnumC3228d e8 = AbstractC3230f.e(substring5);
                                if (enumC3228d2 != null && enumC3228d2.compareTo(e8) <= 0) {
                                    throw new IllegalArgumentException(str3);
                                }
                                String str4 = str3;
                                int R9 = n.R(substring4, '.', 0, false, 6, null);
                                if (R9 > 0) {
                                    AbstractC3255y.g(substring4, "null cannot be cast to non-null type java.lang.String");
                                    String substring6 = substring4.substring(0, R9);
                                    AbstractC3255y.h(substring6, "substring(...)");
                                    long I9 = C3225a.I(j8, t(Long.parseLong(substring6), e8));
                                    AbstractC3255y.g(substring4, "null cannot be cast to non-null type java.lang.String");
                                    String substring7 = substring4.substring(R9);
                                    AbstractC3255y.h(substring7, "substring(...)");
                                    j8 = C3225a.I(I9, r(Double.parseDouble(substring7), e8));
                                    if (i8 < length) {
                                        throw new IllegalArgumentException("Fractional component must be last");
                                    }
                                } else {
                                    j8 = C3225a.I(j8, t(Long.parseLong(substring4), e8));
                                }
                                enumC3228d2 = e8;
                                str3 = str4;
                                z13 = true;
                            } else {
                                throw new IllegalArgumentException();
                            }
                        }
                        b8 = j8;
                    }
                }
                return z10 ? C3225a.O(b8) : b8;
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
                    if (!new C2883c('0', '9').k(str.charAt(((N) it).nextInt()))) {
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

    public static final long r(double d8, EnumC3228d unit) {
        AbstractC3255y.i(unit, "unit");
        double a8 = AbstractC3229e.a(d8, unit, EnumC3228d.f34138b);
        if (!Double.isNaN(a8)) {
            long e8 = AbstractC2055a.e(a8);
            if (new l(-4611686018426999999L, 4611686018426999999L).k(e8)) {
                return l(e8);
            }
            return k(AbstractC2055a.e(AbstractC3229e.a(d8, unit, EnumC3228d.f34140d)));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }

    public static final long s(int i8, EnumC3228d unit) {
        AbstractC3255y.i(unit, "unit");
        if (unit.compareTo(EnumC3228d.f34141e) <= 0) {
            return l(AbstractC3229e.c(i8, unit, EnumC3228d.f34138b));
        }
        return t(i8, unit);
    }

    public static final long t(long j8, EnumC3228d unit) {
        AbstractC3255y.i(unit, "unit");
        EnumC3228d enumC3228d = EnumC3228d.f34138b;
        long c8 = AbstractC3229e.c(4611686018426999999L, enumC3228d, unit);
        if (new l(-c8, c8).k(j8)) {
            return l(AbstractC3229e.c(j8, unit, enumC3228d));
        }
        return j(m.m(AbstractC3229e.b(j8, unit, EnumC3228d.f34140d), -4611686018427387903L, 4611686018427387903L));
    }
}
