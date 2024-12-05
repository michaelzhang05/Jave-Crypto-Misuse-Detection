package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class E {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static r a(String str, C1986f c1986f, T1 t12, List list) {
        String str2;
        char c8;
        double d8;
        String str3;
        double d9;
        double d10;
        double min;
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                if (str.equals(str2)) {
                    c8 = 18;
                    break;
                }
                c8 = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    c8 = 0;
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
                    c8 = '\n';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c8 = 17;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    str2 = "toString";
                    c8 = 3;
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
                    c8 = 19;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c8 = 7;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c8 = '\b';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c8 = 5;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 3452698:
                if (str.equals("push")) {
                    c8 = '\t';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c8 = 15;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c8 = 16;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    str2 = "toString";
                    c8 = 1;
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c8 = '\r';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c8 = 14;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c8 = 11;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c8 = '\f';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c8 = 4;
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
        AbstractC2028k abstractC2028k = null;
        switch (c8) {
            case 0:
                r d11 = c1986f.d();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        r b8 = t12.b((r) it.next());
                        if (!(b8 instanceof C2004h)) {
                            C1986f c1986f2 = (C1986f) d11;
                            int r8 = c1986f2.r();
                            if (b8 instanceof C1986f) {
                                C1986f c1986f3 = (C1986f) b8;
                                Iterator u8 = c1986f3.u();
                                while (u8.hasNext()) {
                                    Integer num = (Integer) u8.next();
                                    c1986f2.z(num.intValue() + r8, c1986f3.s(num.intValue()));
                                }
                            } else {
                                c1986f2.z(r8, b8);
                            }
                        } else {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                    }
                }
                return d11;
            case 1:
                AbstractC2110u2.h("every", 1, list);
                r b9 = t12.b((r) list.get(0));
                if (b9 instanceof C2076q) {
                    if (c1986f.r() == 0) {
                        return r.f15871h0;
                    }
                    if (b(c1986f, t12, (C2076q) b9, Boolean.FALSE, Boolean.TRUE).r() != c1986f.r()) {
                        return r.f15872i0;
                    }
                    return r.f15871h0;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 2:
                AbstractC2110u2.h("filter", 1, list);
                r b10 = t12.b((r) list.get(0));
                if (b10 instanceof C2076q) {
                    if (c1986f.q() == 0) {
                        return new C1986f();
                    }
                    r d12 = c1986f.d();
                    C1986f b11 = b(c1986f, t12, (C2076q) b10, null, Boolean.TRUE);
                    C1986f c1986f4 = new C1986f();
                    Iterator u9 = b11.u();
                    while (u9.hasNext()) {
                        c1986f4.z(c1986f4.r(), ((C1986f) d12).s(((Integer) u9.next()).intValue()));
                    }
                    return c1986f4;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 3:
                AbstractC2110u2.h("forEach", 1, list);
                r b12 = t12.b((r) list.get(0));
                if (b12 instanceof C2076q) {
                    if (c1986f.q() == 0) {
                        return r.f15866c0;
                    }
                    b(c1986f, t12, (C2076q) b12, null, null);
                    return r.f15866c0;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 4:
                AbstractC2110u2.j("indexOf", 2, list);
                r rVar = r.f15866c0;
                if (!list.isEmpty()) {
                    rVar = t12.b((r) list.get(0));
                }
                if (list.size() > 1) {
                    d8 = AbstractC2110u2.a(t12.b((r) list.get(1)).f().doubleValue());
                    if (d8 >= c1986f.r()) {
                        return new C2020j(Double.valueOf(-1.0d));
                    }
                    if (d8 < 0.0d) {
                        d8 += c1986f.r();
                    }
                } else {
                    d8 = 0.0d;
                }
                Iterator u10 = c1986f.u();
                while (u10.hasNext()) {
                    int intValue = ((Integer) u10.next()).intValue();
                    double d13 = intValue;
                    if (d13 >= d8 && AbstractC2110u2.l(c1986f.s(intValue), rVar)) {
                        return new C2020j(Double.valueOf(d13));
                    }
                }
                return new C2020j(Double.valueOf(-1.0d));
            case 5:
                AbstractC2110u2.j("join", 1, list);
                if (c1986f.r() == 0) {
                    return r.f15873j0;
                }
                if (list.isEmpty()) {
                    str3 = ",";
                } else {
                    r b13 = t12.b((r) list.get(0));
                    if (!(b13 instanceof C2068p) && !(b13 instanceof C2123w)) {
                        str3 = b13.g();
                    } else {
                        str3 = "";
                    }
                }
                return new C2115v(c1986f.t(str3));
            case 6:
                AbstractC2110u2.j("lastIndexOf", 2, list);
                r rVar2 = r.f15866c0;
                if (!list.isEmpty()) {
                    rVar2 = t12.b((r) list.get(0));
                }
                int r9 = c1986f.r() - 1;
                if (list.size() > 1) {
                    r b14 = t12.b((r) list.get(1));
                    d10 = Double.isNaN(b14.f().doubleValue()) ? c1986f.r() - 1 : AbstractC2110u2.a(b14.f().doubleValue());
                    d9 = 0.0d;
                    if (d10 < 0.0d) {
                        d10 += c1986f.r();
                    }
                } else {
                    d9 = 0.0d;
                    d10 = r9;
                }
                if (d10 < d9) {
                    return new C2020j(Double.valueOf(-1.0d));
                }
                for (int min2 = (int) Math.min(c1986f.r(), d10); min2 >= 0; min2--) {
                    if (c1986f.A(min2) && AbstractC2110u2.l(c1986f.s(min2), rVar2)) {
                        return new C2020j(Double.valueOf(min2));
                    }
                }
                return new C2020j(Double.valueOf(-1.0d));
            case 7:
                AbstractC2110u2.h("map", 1, list);
                r b15 = t12.b((r) list.get(0));
                if (b15 instanceof C2076q) {
                    if (c1986f.r() == 0) {
                        return new C1986f();
                    }
                    return b(c1986f, t12, (C2076q) b15, null, null);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\b':
                AbstractC2110u2.h("pop", 0, list);
                int r10 = c1986f.r();
                if (r10 == 0) {
                    return r.f15866c0;
                }
                int i8 = r10 - 1;
                r s8 = c1986f.s(i8);
                c1986f.y(i8);
                return s8;
            case '\t':
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        c1986f.z(c1986f.r(), t12.b((r) it2.next()));
                    }
                }
                return new C2020j(Double.valueOf(c1986f.r()));
            case '\n':
                return c(c1986f, t12, list, true);
            case 11:
                return c(c1986f, t12, list, false);
            case '\f':
                AbstractC2110u2.h("reverse", 0, list);
                int r11 = c1986f.r();
                if (r11 != 0) {
                    for (int i9 = 0; i9 < r11 / 2; i9++) {
                        if (c1986f.A(i9)) {
                            r s9 = c1986f.s(i9);
                            c1986f.z(i9, null);
                            int i10 = (r11 - 1) - i9;
                            if (c1986f.A(i10)) {
                                c1986f.z(i9, c1986f.s(i10));
                            }
                            c1986f.z(i10, s9);
                        }
                    }
                }
                return c1986f;
            case '\r':
                AbstractC2110u2.h("shift", 0, list);
                if (c1986f.r() == 0) {
                    return r.f15866c0;
                }
                r s10 = c1986f.s(0);
                c1986f.y(0);
                return s10;
            case 14:
                AbstractC2110u2.j("slice", 2, list);
                if (list.isEmpty()) {
                    return c1986f.d();
                }
                double r12 = c1986f.r();
                double a8 = AbstractC2110u2.a(t12.b((r) list.get(0)).f().doubleValue());
                if (a8 < 0.0d) {
                    min = Math.max(a8 + r12, 0.0d);
                } else {
                    min = Math.min(a8, r12);
                }
                if (list.size() == 2) {
                    double a9 = AbstractC2110u2.a(t12.b((r) list.get(1)).f().doubleValue());
                    if (a9 < 0.0d) {
                        r12 = Math.max(r12 + a9, 0.0d);
                    } else {
                        r12 = Math.min(r12, a9);
                    }
                }
                C1986f c1986f5 = new C1986f();
                for (int i11 = (int) min; i11 < r12; i11++) {
                    c1986f5.z(c1986f5.r(), c1986f.s(i11));
                }
                return c1986f5;
            case 15:
                AbstractC2110u2.h("some", 1, list);
                r b16 = t12.b((r) list.get(0));
                if (b16 instanceof AbstractC2028k) {
                    if (c1986f.r() == 0) {
                        return r.f15872i0;
                    }
                    AbstractC2028k abstractC2028k2 = (AbstractC2028k) b16;
                    Iterator u11 = c1986f.u();
                    while (u11.hasNext()) {
                        int intValue2 = ((Integer) u11.next()).intValue();
                        if (c1986f.A(intValue2) && abstractC2028k2.b(t12, Arrays.asList(c1986f.s(intValue2), new C2020j(Double.valueOf(intValue2)), c1986f)).h().booleanValue()) {
                            return r.f15871h0;
                        }
                    }
                    return r.f15872i0;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 16:
                AbstractC2110u2.j("sort", 1, list);
                if (c1986f.r() >= 2) {
                    List v8 = c1986f.v();
                    if (!list.isEmpty()) {
                        r b17 = t12.b((r) list.get(0));
                        if (b17 instanceof AbstractC2028k) {
                            abstractC2028k = (AbstractC2028k) b17;
                        } else {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                    }
                    Collections.sort(v8, new D(abstractC2028k, t12));
                    c1986f.w();
                    Iterator it3 = v8.iterator();
                    int i12 = 0;
                    while (it3.hasNext()) {
                        c1986f.z(i12, (r) it3.next());
                        i12++;
                    }
                }
                return c1986f;
            case 17:
                if (list.isEmpty()) {
                    return new C1986f();
                }
                int a10 = (int) AbstractC2110u2.a(t12.b((r) list.get(0)).f().doubleValue());
                if (a10 < 0) {
                    a10 = Math.max(0, a10 + c1986f.r());
                } else if (a10 > c1986f.r()) {
                    a10 = c1986f.r();
                }
                int r13 = c1986f.r();
                C1986f c1986f6 = new C1986f();
                if (list.size() > 1) {
                    int max = Math.max(0, (int) AbstractC2110u2.a(t12.b((r) list.get(1)).f().doubleValue()));
                    if (max > 0) {
                        for (int i13 = a10; i13 < Math.min(r13, a10 + max); i13++) {
                            c1986f6.z(c1986f6.r(), c1986f.s(a10));
                            c1986f.y(a10);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i14 = 2; i14 < list.size(); i14++) {
                            r b18 = t12.b((r) list.get(i14));
                            if (!(b18 instanceof C2004h)) {
                                c1986f.x((a10 + i14) - 2, b18);
                            } else {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                        }
                    }
                } else {
                    while (a10 < r13) {
                        c1986f6.z(c1986f6.r(), c1986f.s(a10));
                        c1986f.z(a10, null);
                        a10++;
                    }
                }
                return c1986f6;
            case 18:
                AbstractC2110u2.h(str2, 0, list);
                return new C2115v(c1986f.t(","));
            case 19:
                if (!list.isEmpty()) {
                    C1986f c1986f7 = new C1986f();
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        r b19 = t12.b((r) it4.next());
                        if (!(b19 instanceof C2004h)) {
                            c1986f7.z(c1986f7.r(), b19);
                        } else {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                    }
                    int r14 = c1986f7.r();
                    Iterator u12 = c1986f.u();
                    while (u12.hasNext()) {
                        Integer num2 = (Integer) u12.next();
                        c1986f7.z(num2.intValue() + r14, c1986f.s(num2.intValue()));
                    }
                    c1986f.w();
                    Iterator u13 = c1986f7.u();
                    while (u13.hasNext()) {
                        Integer num3 = (Integer) u13.next();
                        c1986f.z(num3.intValue(), c1986f7.s(num3.intValue()));
                    }
                }
                return new C2020j(Double.valueOf(c1986f.r()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    private static C1986f b(C1986f c1986f, T1 t12, AbstractC2028k abstractC2028k, Boolean bool, Boolean bool2) {
        C1986f c1986f2 = new C1986f();
        Iterator u8 = c1986f.u();
        while (u8.hasNext()) {
            int intValue = ((Integer) u8.next()).intValue();
            if (c1986f.A(intValue)) {
                r b8 = abstractC2028k.b(t12, Arrays.asList(c1986f.s(intValue), new C2020j(Double.valueOf(intValue)), c1986f));
                if (b8.h().equals(bool)) {
                    return c1986f2;
                }
                if (bool2 == null || b8.h().equals(bool2)) {
                    c1986f2.z(intValue, b8);
                }
            }
        }
        return c1986f2;
    }

    private static r c(C1986f c1986f, T1 t12, List list, boolean z8) {
        r rVar;
        int i8;
        int i9;
        int i10 = -1;
        AbstractC2110u2.i("reduce", 1, list);
        AbstractC2110u2.j("reduce", 2, list);
        r b8 = t12.b((r) list.get(0));
        if (b8 instanceof AbstractC2028k) {
            if (list.size() == 2) {
                rVar = t12.b((r) list.get(1));
                if (rVar instanceof C2004h) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else if (c1986f.r() != 0) {
                rVar = null;
            } else {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            AbstractC2028k abstractC2028k = (AbstractC2028k) b8;
            int r8 = c1986f.r();
            if (z8) {
                i8 = 0;
            } else {
                i8 = r8 - 1;
            }
            if (z8) {
                i9 = r8 - 1;
            } else {
                i9 = 0;
            }
            if (true == z8) {
                i10 = 1;
            }
            if (rVar == null) {
                rVar = c1986f.s(i8);
                i8 += i10;
            }
            while ((i9 - i8) * i10 >= 0) {
                if (!c1986f.A(i8)) {
                    i8 += i10;
                } else {
                    rVar = abstractC2028k.b(t12, Arrays.asList(rVar, c1986f.s(i8), new C2020j(Double.valueOf(i8)), c1986f));
                    if (!(rVar instanceof C2004h)) {
                        i8 += i10;
                    } else {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                }
            }
            return rVar;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }
}
