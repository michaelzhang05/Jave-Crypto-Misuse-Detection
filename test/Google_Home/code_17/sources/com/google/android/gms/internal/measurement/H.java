package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class H {
    private static C2125g a(C2125g c2125g, V2 v22, AbstractC2192n abstractC2192n) {
        return b(c2125g, v22, abstractC2192n, null, null);
    }

    private static C2125g b(C2125g c2125g, V2 v22, AbstractC2192n abstractC2192n, Boolean bool, Boolean bool2) {
        C2125g c2125g2 = new C2125g();
        Iterator r8 = c2125g.r();
        while (r8.hasNext()) {
            int intValue = ((Integer) r8.next()).intValue();
            if (c2125g.q(intValue)) {
                InterfaceC2236s a8 = abstractC2192n.a(v22, Arrays.asList(c2125g.e(intValue), new C2165k(Double.valueOf(intValue)), c2125g));
                if (a8.y().equals(bool)) {
                    return c2125g2;
                }
                if (bool2 == null || a8.y().equals(bool2)) {
                    c2125g2.p(intValue, a8);
                }
            }
        }
        return c2125g2;
    }

    private static InterfaceC2236s c(C2125g c2125g, V2 v22, List list, boolean z8) {
        InterfaceC2236s interfaceC2236s;
        int i8;
        int i9;
        int i10;
        AbstractC2128g2.k("reduce", 1, list);
        AbstractC2128g2.n("reduce", 2, list);
        InterfaceC2236s b8 = v22.b((InterfaceC2236s) list.get(0));
        if (b8 instanceof AbstractC2192n) {
            if (list.size() == 2) {
                interfaceC2236s = v22.b((InterfaceC2236s) list.get(1));
                if (interfaceC2236s instanceof C2174l) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else if (c2125g.m() != 0) {
                interfaceC2236s = null;
            } else {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            AbstractC2192n abstractC2192n = (AbstractC2192n) b8;
            int m8 = c2125g.m();
            if (z8) {
                i8 = 0;
            } else {
                i8 = m8 - 1;
            }
            if (z8) {
                i9 = m8 - 1;
            } else {
                i9 = 0;
            }
            if (z8) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            if (interfaceC2236s == null) {
                interfaceC2236s = c2125g.e(i8);
                i8 += i10;
            }
            while ((i9 - i8) * i10 >= 0) {
                if (c2125g.q(i8)) {
                    interfaceC2236s = abstractC2192n.a(v22, Arrays.asList(interfaceC2236s, c2125g.e(i8), new C2165k(Double.valueOf(i8)), c2125g));
                    if (interfaceC2236s instanceof C2174l) {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                    i8 += i10;
                } else {
                    i8 += i10;
                }
            }
            return interfaceC2236s;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static InterfaceC2236s d(String str, C2125g c2125g, V2 v22, List list) {
        String str2;
        char c8;
        double d8;
        double a8;
        String str3;
        AbstractC2192n abstractC2192n;
        double min;
        int i8;
        V2 v23;
        Double d9;
        double d10;
        str.hashCode();
        Double valueOf = Double.valueOf(-1.0d);
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                if (str.equals(str2)) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    c8 = 1;
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    str2 = "toString";
                    c8 = 2;
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    str2 = "toString";
                    c8 = 3;
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c8 = 4;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c8 = 5;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c8 = 6;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c8 = 7;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c8 = '\b';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c8 = '\t';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c8 = '\n';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 3452698:
                if (str.equals("push")) {
                    c8 = 11;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c8 = '\f';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c8 = '\r';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    c8 = 14;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c8 = 15;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c8 = 16;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c8 = 17;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c8 = 18;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c8 = 19;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            default:
                str2 = "toString";
                c8 = 65535;
                break;
        }
        switch (c8) {
            case 0:
                AbstractC2128g2.g(str2, 0, list);
                return new C2254u(c2125g.toString());
            case 1:
                C2125g c2125g2 = (C2125g) c2125g.b();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        InterfaceC2236s b8 = v22.b((InterfaceC2236s) it.next());
                        if (!(b8 instanceof C2174l)) {
                            int m8 = c2125g2.m();
                            if (b8 instanceof C2125g) {
                                C2125g c2125g3 = (C2125g) b8;
                                Iterator r8 = c2125g3.r();
                                while (r8.hasNext()) {
                                    Integer num = (Integer) r8.next();
                                    c2125g2.p(num.intValue() + m8, c2125g3.e(num.intValue()));
                                }
                            } else {
                                c2125g2.p(m8, b8);
                            }
                        } else {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                    }
                }
                return c2125g2;
            case 2:
                AbstractC2128g2.g("filter", 1, list);
                InterfaceC2236s b9 = v22.b((InterfaceC2236s) list.get(0));
                if (b9 instanceof C2245t) {
                    if (c2125g.d() == 0) {
                        return new C2125g();
                    }
                    C2125g c2125g4 = (C2125g) c2125g.b();
                    C2125g b10 = b(c2125g, v22, (C2245t) b9, null, Boolean.TRUE);
                    C2125g c2125g5 = new C2125g();
                    Iterator r9 = b10.r();
                    while (r9.hasNext()) {
                        c2125g5.l(c2125g4.e(((Integer) r9.next()).intValue()));
                    }
                    return c2125g5;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 3:
                return c(c2125g, v22, list, true);
            case 4:
                if (list.isEmpty()) {
                    return new C2125g();
                }
                int a9 = (int) AbstractC2128g2.a(v22.b((InterfaceC2236s) list.get(0)).z().doubleValue());
                if (a9 < 0) {
                    a9 = Math.max(0, a9 + c2125g.m());
                } else if (a9 > c2125g.m()) {
                    a9 = c2125g.m();
                }
                int m9 = c2125g.m();
                C2125g c2125g6 = new C2125g();
                if (list.size() > 1) {
                    int max = Math.max(0, (int) AbstractC2128g2.a(v22.b((InterfaceC2236s) list.get(1)).z().doubleValue()));
                    if (max > 0) {
                        for (int i9 = a9; i9 < Math.min(m9, a9 + max); i9++) {
                            c2125g6.l(c2125g.e(a9));
                            c2125g.o(a9);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i10 = 2; i10 < list.size(); i10++) {
                            InterfaceC2236s b11 = v22.b((InterfaceC2236s) list.get(i10));
                            if (!(b11 instanceof C2174l)) {
                                c2125g.k((a9 + i10) - 2, b11);
                            } else {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                        }
                    }
                    return c2125g6;
                }
                while (a9 < m9) {
                    c2125g6.l(c2125g.e(a9));
                    c2125g.p(a9, null);
                    a9++;
                }
                return c2125g6;
            case 5:
                AbstractC2128g2.g("forEach", 1, list);
                InterfaceC2236s b12 = v22.b((InterfaceC2236s) list.get(0));
                if (b12 instanceof C2245t) {
                    if (c2125g.d() == 0) {
                        return InterfaceC2236s.f16802b0;
                    }
                    a(c2125g, v22, (C2245t) b12);
                    return InterfaceC2236s.f16802b0;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 6:
                AbstractC2128g2.n("lastIndexOf", 2, list);
                InterfaceC2236s interfaceC2236s = InterfaceC2236s.f16802b0;
                if (!list.isEmpty()) {
                    interfaceC2236s = v22.b((InterfaceC2236s) list.get(0));
                }
                double m10 = c2125g.m() - 1;
                if (list.size() > 1) {
                    InterfaceC2236s b13 = v22.b((InterfaceC2236s) list.get(1));
                    if (Double.isNaN(b13.z().doubleValue())) {
                        a8 = c2125g.m() - 1;
                    } else {
                        a8 = AbstractC2128g2.a(b13.z().doubleValue());
                    }
                    m10 = a8;
                    d8 = 0.0d;
                    if (m10 < 0.0d) {
                        m10 += c2125g.m();
                    }
                } else {
                    d8 = 0.0d;
                }
                if (m10 < d8) {
                    return new C2165k(valueOf);
                }
                for (int min2 = (int) Math.min(c2125g.m(), m10); min2 >= 0; min2--) {
                    if (c2125g.q(min2) && AbstractC2128g2.h(c2125g.e(min2), interfaceC2236s)) {
                        return new C2165k(Double.valueOf(min2));
                    }
                }
                return new C2165k(valueOf);
            case 7:
                if (!list.isEmpty()) {
                    C2125g c2125g7 = new C2125g();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        InterfaceC2236s b14 = v22.b((InterfaceC2236s) it2.next());
                        if (!(b14 instanceof C2174l)) {
                            c2125g7.l(b14);
                        } else {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                    }
                    int m11 = c2125g7.m();
                    Iterator r10 = c2125g.r();
                    while (r10.hasNext()) {
                        Integer num2 = (Integer) r10.next();
                        c2125g7.p(num2.intValue() + m11, c2125g.e(num2.intValue()));
                    }
                    c2125g.u();
                    Iterator r11 = c2125g7.r();
                    while (r11.hasNext()) {
                        Integer num3 = (Integer) r11.next();
                        c2125g.p(num3.intValue(), c2125g7.e(num3.intValue()));
                    }
                }
                return new C2165k(Double.valueOf(c2125g.m()));
            case '\b':
                AbstractC2128g2.g("map", 1, list);
                InterfaceC2236s b15 = v22.b((InterfaceC2236s) list.get(0));
                if (b15 instanceof C2245t) {
                    if (c2125g.m() == 0) {
                        return new C2125g();
                    }
                    return a(c2125g, v22, (C2245t) b15);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\t':
                AbstractC2128g2.g("pop", 0, list);
                int m12 = c2125g.m();
                if (m12 == 0) {
                    return InterfaceC2236s.f16802b0;
                }
                int i11 = m12 - 1;
                InterfaceC2236s e8 = c2125g.e(i11);
                c2125g.o(i11);
                return e8;
            case '\n':
                AbstractC2128g2.n("join", 1, list);
                if (c2125g.m() == 0) {
                    return InterfaceC2236s.f16809i0;
                }
                if (!list.isEmpty()) {
                    InterfaceC2236s b16 = v22.b((InterfaceC2236s) list.get(0));
                    if (!(b16 instanceof C2219q) && !(b16 instanceof C2299z)) {
                        str3 = b16.A();
                    } else {
                        str3 = "";
                    }
                } else {
                    str3 = ",";
                }
                return new C2254u(c2125g.n(str3));
            case 11:
                if (!list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        c2125g.l(v22.b((InterfaceC2236s) it3.next()));
                    }
                }
                return new C2165k(Double.valueOf(c2125g.m()));
            case '\f':
                AbstractC2128g2.g("some", 1, list);
                InterfaceC2236s b17 = v22.b((InterfaceC2236s) list.get(0));
                if (b17 instanceof AbstractC2192n) {
                    if (c2125g.m() != 0) {
                        AbstractC2192n abstractC2192n2 = (AbstractC2192n) b17;
                        Iterator r12 = c2125g.r();
                        while (r12.hasNext()) {
                            int intValue = ((Integer) r12.next()).intValue();
                            if (c2125g.q(intValue) && abstractC2192n2.a(v22, Arrays.asList(c2125g.e(intValue), new C2165k(Double.valueOf(intValue)), c2125g)).y().booleanValue()) {
                                return InterfaceC2236s.f16807g0;
                            }
                        }
                    }
                    return InterfaceC2236s.f16808h0;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\r':
                AbstractC2128g2.n("sort", 1, list);
                if (c2125g.m() >= 2) {
                    List t8 = c2125g.t();
                    if (!list.isEmpty()) {
                        InterfaceC2236s b18 = v22.b((InterfaceC2236s) list.get(0));
                        if (b18 instanceof AbstractC2192n) {
                            abstractC2192n = (AbstractC2192n) b18;
                        } else {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                    } else {
                        abstractC2192n = null;
                    }
                    Collections.sort(t8, new K(abstractC2192n, v22));
                    c2125g.u();
                    Iterator it4 = t8.iterator();
                    int i12 = 0;
                    while (it4.hasNext()) {
                        c2125g.p(i12, (InterfaceC2236s) it4.next());
                        i12++;
                    }
                }
                return c2125g;
            case 14:
                AbstractC2128g2.g("every", 1, list);
                InterfaceC2236s b19 = v22.b((InterfaceC2236s) list.get(0));
                if (b19 instanceof C2245t) {
                    if (c2125g.m() != 0 && b(c2125g, v22, (C2245t) b19, Boolean.FALSE, Boolean.TRUE).m() != c2125g.m()) {
                        return InterfaceC2236s.f16808h0;
                    }
                    return InterfaceC2236s.f16807g0;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 15:
                AbstractC2128g2.g("shift", 0, list);
                if (c2125g.m() == 0) {
                    return InterfaceC2236s.f16802b0;
                }
                InterfaceC2236s e9 = c2125g.e(0);
                c2125g.o(0);
                return e9;
            case 16:
                AbstractC2128g2.n("slice", 2, list);
                if (list.isEmpty()) {
                    return c2125g.b();
                }
                double m13 = c2125g.m();
                double a10 = AbstractC2128g2.a(v22.b((InterfaceC2236s) list.get(0)).z().doubleValue());
                if (a10 < 0.0d) {
                    min = Math.max(a10 + m13, 0.0d);
                } else {
                    min = Math.min(a10, m13);
                }
                if (list.size() == 2) {
                    double a11 = AbstractC2128g2.a(v22.b((InterfaceC2236s) list.get(1)).z().doubleValue());
                    if (a11 < 0.0d) {
                        m13 = Math.max(m13 + a11, 0.0d);
                    } else {
                        m13 = Math.min(m13, a11);
                    }
                }
                C2125g c2125g8 = new C2125g();
                for (int i13 = (int) min; i13 < m13; i13++) {
                    c2125g8.l(c2125g.e(i13));
                }
                return c2125g8;
            case 17:
                return c(c2125g, v22, list, false);
            case 18:
                AbstractC2128g2.g("reverse", 0, list);
                int m14 = c2125g.m();
                if (m14 != 0) {
                    int i14 = 0;
                    while (i14 < m14 / 2) {
                        if (c2125g.q(i14)) {
                            InterfaceC2236s e10 = c2125g.e(i14);
                            c2125g.p(i14, null);
                            i8 = 1;
                            int i15 = (m14 - 1) - i14;
                            if (c2125g.q(i15)) {
                                c2125g.p(i14, c2125g.e(i15));
                            }
                            c2125g.p(i15, e10);
                        } else {
                            i8 = 1;
                        }
                        i14 += i8;
                    }
                }
                return c2125g;
            case 19:
                AbstractC2128g2.n("indexOf", 2, list);
                InterfaceC2236s interfaceC2236s2 = InterfaceC2236s.f16802b0;
                if (!list.isEmpty()) {
                    v23 = v22;
                    interfaceC2236s2 = v23.b((InterfaceC2236s) list.get(0));
                } else {
                    v23 = v22;
                }
                if (list.size() > 1) {
                    d10 = AbstractC2128g2.a(v23.b((InterfaceC2236s) list.get(1)).z().doubleValue());
                    if (d10 >= c2125g.m()) {
                        return new C2165k(valueOf);
                    }
                    d9 = valueOf;
                    if (d10 < 0.0d) {
                        d10 += c2125g.m();
                    }
                } else {
                    d9 = valueOf;
                    d10 = 0.0d;
                }
                Iterator r13 = c2125g.r();
                while (r13.hasNext()) {
                    int intValue2 = ((Integer) r13.next()).intValue();
                    double d11 = intValue2;
                    if (d11 >= d10 && AbstractC2128g2.h(c2125g.e(intValue2), interfaceC2236s2)) {
                        return new C2165k(Double.valueOf(d11));
                    }
                }
                return new C2165k(d9);
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }
}
