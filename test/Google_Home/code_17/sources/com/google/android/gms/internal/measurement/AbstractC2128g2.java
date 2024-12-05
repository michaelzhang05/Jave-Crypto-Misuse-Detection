package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.g2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2128g2 {
    public static double a(double d8) {
        int i8;
        if (Double.isNaN(d8)) {
            return 0.0d;
        }
        if (!Double.isInfinite(d8) && d8 != 0.0d && d8 != -0.0d) {
            if (d8 > 0.0d) {
                i8 = 1;
            } else {
                i8 = -1;
            }
            return i8 * Math.floor(Math.abs(d8));
        }
        return d8;
    }

    public static int b(V2 v22) {
        int i8 = i(v22.c("runtime.counter").z().doubleValue() + 1.0d);
        if (i8 <= 1000000) {
            v22.h("runtime.counter", new C2165k(Double.valueOf(i8)));
            return i8;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static Z c(String str) {
        Z z8;
        if (str != null && !str.isEmpty()) {
            z8 = Z.a(Integer.parseInt(str));
        } else {
            z8 = null;
        }
        if (z8 != null) {
            return z8;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object d(InterfaceC2236s interfaceC2236s) {
        if (InterfaceC2236s.f16803c0.equals(interfaceC2236s)) {
            return null;
        }
        if (InterfaceC2236s.f16802b0.equals(interfaceC2236s)) {
            return "";
        }
        if (interfaceC2236s instanceof r) {
            return e((r) interfaceC2236s);
        }
        if (interfaceC2236s instanceof C2125g) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((C2125g) interfaceC2236s).iterator();
            while (it.hasNext()) {
                Object d8 = d((InterfaceC2236s) it.next());
                if (d8 != null) {
                    arrayList.add(d8);
                }
            }
            return arrayList;
        }
        if (!interfaceC2236s.z().isNaN()) {
            return interfaceC2236s.z();
        }
        return interfaceC2236s.A();
    }

    public static Map e(r rVar) {
        HashMap hashMap = new HashMap();
        for (String str : rVar.a()) {
            Object d8 = d(rVar.c(str));
            if (d8 != null) {
                hashMap.put(str, d8);
            }
        }
        return hashMap;
    }

    public static void f(Z z8, int i8, List list) {
        g(z8.name(), i8, list);
    }

    public static void g(String str, int i8, List list) {
        if (list.size() == i8) {
        } else {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i8), Integer.valueOf(list.size())));
        }
    }

    public static boolean h(InterfaceC2236s interfaceC2236s, InterfaceC2236s interfaceC2236s2) {
        if (!interfaceC2236s.getClass().equals(interfaceC2236s2.getClass())) {
            return false;
        }
        if ((interfaceC2236s instanceof C2299z) || (interfaceC2236s instanceof C2219q)) {
            return true;
        }
        if (interfaceC2236s instanceof C2165k) {
            if (Double.isNaN(interfaceC2236s.z().doubleValue()) || Double.isNaN(interfaceC2236s2.z().doubleValue())) {
                return false;
            }
            return interfaceC2236s.z().equals(interfaceC2236s2.z());
        }
        if (interfaceC2236s instanceof C2254u) {
            return interfaceC2236s.A().equals(interfaceC2236s2.A());
        }
        if (interfaceC2236s instanceof C2135h) {
            return interfaceC2236s.y().equals(interfaceC2236s2.y());
        }
        if (interfaceC2236s != interfaceC2236s2) {
            return false;
        }
        return true;
    }

    public static int i(double d8) {
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

    public static void j(Z z8, int i8, List list) {
        k(z8.name(), i8, list);
    }

    public static void k(String str, int i8, List list) {
        if (list.size() >= i8) {
        } else {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i8), Integer.valueOf(list.size())));
        }
    }

    public static boolean l(InterfaceC2236s interfaceC2236s) {
        if (interfaceC2236s == null) {
            return false;
        }
        Double z8 = interfaceC2236s.z();
        if (z8.isNaN() || z8.doubleValue() < 0.0d || !z8.equals(Double.valueOf(Math.floor(z8.doubleValue())))) {
            return false;
        }
        return true;
    }

    public static long m(double d8) {
        return i(d8) & 4294967295L;
    }

    public static void n(String str, int i8, List list) {
        if (list.size() <= i8) {
        } else {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i8), Integer.valueOf(list.size())));
        }
    }
}
