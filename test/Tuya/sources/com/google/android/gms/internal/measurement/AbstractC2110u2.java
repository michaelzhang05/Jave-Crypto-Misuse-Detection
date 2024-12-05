package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.u2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2110u2 {
    public static double a(double d8) {
        int i8;
        if (Double.isNaN(d8)) {
            return 0.0d;
        }
        if (!Double.isInfinite(d8) && d8 != 0.0d && d8 != 0.0d) {
            if (d8 > 0.0d) {
                i8 = 1;
            } else {
                i8 = -1;
            }
            return i8 * Math.floor(Math.abs(d8));
        }
        return d8;
    }

    public static int b(double d8) {
        int i8;
        if (!Double.isNaN(d8) && !Double.isInfinite(d8) && d8 != 0.0d) {
            if (d8 > 0.0d) {
                i8 = 1;
            } else {
                i8 = -1;
            }
            return (int) ((i8 * Math.floor(Math.abs(d8))) % 4.294967296E9d);
        }
        return 0;
    }

    public static int c(T1 t12) {
        int b8 = b(t12.d("runtime.counter").f().doubleValue() + 1.0d);
        if (b8 <= 1000000) {
            t12.g("runtime.counter", new C2020j(Double.valueOf(b8)));
            return b8;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static long d(double d8) {
        return b(d8) & 4294967295L;
    }

    public static O e(String str) {
        O o8 = null;
        if (str != null && !str.isEmpty()) {
            o8 = O.a(Integer.parseInt(str));
        }
        if (o8 != null) {
            return o8;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object f(r rVar) {
        if (r.f15867d0.equals(rVar)) {
            return null;
        }
        if (r.f15866c0.equals(rVar)) {
            return "";
        }
        if (rVar instanceof C2060o) {
            return g((C2060o) rVar);
        }
        if (rVar instanceof C1986f) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((C1986f) rVar).iterator();
            while (it.hasNext()) {
                Object f8 = f((r) it.next());
                if (f8 != null) {
                    arrayList.add(f8);
                }
            }
            return arrayList;
        }
        if (!rVar.f().isNaN()) {
            return rVar.f();
        }
        return rVar.g();
    }

    public static Map g(C2060o c2060o) {
        HashMap hashMap = new HashMap();
        for (String str : c2060o.b()) {
            Object f8 = f(c2060o.p(str));
            if (f8 != null) {
                hashMap.put(str, f8);
            }
        }
        return hashMap;
    }

    public static void h(String str, int i8, List list) {
        if (list.size() == i8) {
        } else {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i8), Integer.valueOf(list.size())));
        }
    }

    public static void i(String str, int i8, List list) {
        if (list.size() >= i8) {
        } else {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i8), Integer.valueOf(list.size())));
        }
    }

    public static void j(String str, int i8, List list) {
        if (list.size() <= i8) {
        } else {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i8), Integer.valueOf(list.size())));
        }
    }

    public static boolean k(r rVar) {
        if (rVar == null) {
            return false;
        }
        Double f8 = rVar.f();
        if (f8.isNaN() || f8.doubleValue() < 0.0d || !f8.equals(Double.valueOf(Math.floor(f8.doubleValue())))) {
            return false;
        }
        return true;
    }

    public static boolean l(r rVar, r rVar2) {
        if (!rVar.getClass().equals(rVar2.getClass())) {
            return false;
        }
        if ((rVar instanceof C2123w) || (rVar instanceof C2068p)) {
            return true;
        }
        if (rVar instanceof C2020j) {
            if (Double.isNaN(rVar.f().doubleValue()) || Double.isNaN(rVar2.f().doubleValue())) {
                return false;
            }
            return rVar.f().equals(rVar2.f());
        }
        if (rVar instanceof C2115v) {
            return rVar.g().equals(rVar2.g());
        }
        if (rVar instanceof C1995g) {
            return rVar.h().equals(rVar2.h());
        }
        if (rVar != rVar2) {
            return false;
        }
        return true;
    }
}
