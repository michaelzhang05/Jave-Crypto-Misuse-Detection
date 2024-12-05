package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.l5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2042l5 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f15757a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2074p5 f15758b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC2074p5 f15759c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f15760d = 0;

    static {
        Class<?> cls;
        Class<?> cls2;
        AbstractC2074p5 abstractC2074p5 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f15757a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                abstractC2074p5 = (AbstractC2074p5) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f15758b = abstractC2074p5;
        f15759c = new C2089r5();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int A(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC1991f4.y(i8 << 3) + 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int B(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int C(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC1991f4.y(i8 << 3) + 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int D(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int E(int i8, List list, InterfaceC2026j5 interfaceC2026j5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += AbstractC1991f4.u(i8, (Y4) list.get(i10), interfaceC2026j5);
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int F(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return G(list) + (size * AbstractC1991f4.y(i8 << 3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int G(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2120v4) {
            C2120v4 c2120v4 = (C2120v4) list;
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC1991f4.v(c2120v4.d(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC1991f4.v(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int H(int i8, List list, boolean z8) {
        if (list.size() == 0) {
            return 0;
        }
        return I(list) + (list.size() * AbstractC1991f4.y(i8 << 3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int I(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof N4) {
            N4 n42 = (N4) list;
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC1991f4.z(n42.j(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC1991f4.z(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int J(int i8, Object obj, InterfaceC2026j5 interfaceC2026j5) {
        return AbstractC1991f4.y(i8 << 3) + AbstractC1991f4.w((Y4) obj, interfaceC2026j5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int K(int i8, List list, InterfaceC2026j5 interfaceC2026j5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y8 = AbstractC1991f4.y(i8 << 3) * size;
        for (int i9 = 0; i9 < size; i9++) {
            y8 += AbstractC1991f4.w((Y4) list.get(i9), interfaceC2026j5);
        }
        return y8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int L(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return M(list) + (size * AbstractC1991f4.y(i8 << 3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int M(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2120v4) {
            C2120v4 c2120v4 = (C2120v4) list;
            i8 = 0;
            while (i9 < size) {
                int d8 = c2120v4.d(i9);
                i8 += AbstractC1991f4.y((d8 >> 31) ^ (d8 + d8));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                int intValue = ((Integer) list.get(i9)).intValue();
                i8 += AbstractC1991f4.y((intValue >> 31) ^ (intValue + intValue));
                i9++;
            }
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int N(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return O(list) + (size * AbstractC1991f4.y(i8 << 3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int O(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof N4) {
            N4 n42 = (N4) list;
            i8 = 0;
            while (i9 < size) {
                long j8 = n42.j(i9);
                i8 += AbstractC1991f4.z((j8 >> 63) ^ (j8 + j8));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                long longValue = ((Long) list.get(i9)).longValue();
                i8 += AbstractC1991f4.z((longValue >> 63) ^ (longValue + longValue));
                i9++;
            }
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int P(int i8, List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z8 = list instanceof G4;
        int y8 = AbstractC1991f4.y(i8 << 3) * size;
        if (z8) {
            G4 g42 = (G4) list;
            while (i9 < size) {
                Object o8 = g42.o(i9);
                if (o8 instanceof X3) {
                    int g8 = ((X3) o8).g();
                    y8 += AbstractC1991f4.y(g8) + g8;
                } else {
                    y8 += AbstractC1991f4.x((String) o8);
                }
                i9++;
            }
        } else {
            while (i9 < size) {
                Object obj = list.get(i9);
                if (obj instanceof X3) {
                    int g9 = ((X3) obj).g();
                    y8 += AbstractC1991f4.y(g9) + g9;
                } else {
                    y8 += AbstractC1991f4.x((String) obj);
                }
                i9++;
            }
        }
        return y8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int Q(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return R(list) + (size * AbstractC1991f4.y(i8 << 3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int R(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2120v4) {
            C2120v4 c2120v4 = (C2120v4) list;
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC1991f4.y(c2120v4.d(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC1991f4.y(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int S(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * AbstractC1991f4.y(i8 << 3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int T(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof N4) {
            N4 n42 = (N4) list;
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC1991f4.z(n42.j(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC1991f4.z(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return i8;
    }

    public static AbstractC2074p5 U() {
        return f15758b;
    }

    public static AbstractC2074p5 V() {
        return f15759c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(Object obj, int i8, int i9, Object obj2, AbstractC2074p5 abstractC2074p5) {
        if (obj2 == null) {
            obj2 = abstractC2074p5.c(obj);
        }
        abstractC2074p5.f(obj2, i8, i9);
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(AbstractC2074p5 abstractC2074p5, Object obj, Object obj2) {
        abstractC2074p5.h(obj, abstractC2074p5.e(abstractC2074p5.d(obj), abstractC2074p5.d(obj2)));
    }

    public static void c(Class cls) {
        Class cls2;
        if (!AbstractC2112u4.class.isAssignableFrom(cls) && (cls2 = f15757a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void d(int i8, List list, G5 g52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            g52.j(i8, list, z8);
        }
    }

    public static void e(int i8, List list, G5 g52) {
        if (list != null && !list.isEmpty()) {
            g52.d(i8, list);
        }
    }

    public static void f(int i8, List list, G5 g52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            g52.C(i8, list, z8);
        }
    }

    public static void g(int i8, List list, G5 g52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            g52.p(i8, list, z8);
        }
    }

    public static void h(int i8, List list, G5 g52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            g52.m(i8, list, z8);
        }
    }

    public static void i(int i8, List list, G5 g52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            g52.u(i8, list, z8);
        }
    }

    public static void j(int i8, List list, G5 g52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            g52.F(i8, list, z8);
        }
    }

    public static void k(int i8, List list, G5 g52, InterfaceC2026j5 interfaceC2026j5) {
        if (list != null && !list.isEmpty()) {
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((C2000g4) g52).a(i8, list.get(i9), interfaceC2026j5);
            }
        }
    }

    public static void l(int i8, List list, G5 g52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            g52.n(i8, list, z8);
        }
    }

    public static void m(int i8, List list, G5 g52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            g52.y(i8, list, z8);
        }
    }

    public static void n(int i8, List list, G5 g52, InterfaceC2026j5 interfaceC2026j5) {
        if (list != null && !list.isEmpty()) {
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((C2000g4) g52).t(i8, list.get(i9), interfaceC2026j5);
            }
        }
    }

    public static void o(int i8, List list, G5 g52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            g52.B(i8, list, z8);
        }
    }

    public static void p(int i8, List list, G5 g52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            g52.c(i8, list, z8);
        }
    }

    public static void q(int i8, List list, G5 g52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            g52.x(i8, list, z8);
        }
    }

    public static void r(int i8, List list, G5 g52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            g52.H(i8, list, z8);
        }
    }

    public static void s(int i8, List list, G5 g52) {
        if (list != null && !list.isEmpty()) {
            g52.r(i8, list);
        }
    }

    public static void t(int i8, List list, G5 g52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            g52.l(i8, list, z8);
        }
    }

    public static void u(int i8, List list, G5 g52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            g52.z(i8, list, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean v(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC1991f4.y(i8 << 3) + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y8 = size * AbstractC1991f4.y(i8 << 3);
        for (int i9 = 0; i9 < list.size(); i9++) {
            int g8 = ((X3) list.get(i9)).g();
            y8 += AbstractC1991f4.y(g8) + g8;
        }
        return y8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z(list) + (size * AbstractC1991f4.y(i8 << 3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int z(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2120v4) {
            C2120v4 c2120v4 = (C2120v4) list;
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC1991f4.v(c2120v4.d(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC1991f4.v(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i8;
    }
}
