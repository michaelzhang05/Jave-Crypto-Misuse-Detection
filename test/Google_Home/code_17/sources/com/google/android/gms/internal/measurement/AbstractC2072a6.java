package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.a6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2072a6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2234r6 f16549a = new C2252t6();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int A(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * K4.P(i8, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int B(List list) {
        return list.size() << 3;
    }

    public static void C(int i8, List list, N6 n62, boolean z8) {
        if (list != null && !list.isEmpty()) {
            n62.F(i8, list, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int D(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * K4.s0(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int E(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2121f5) {
            C2121f5 c2121f5 = (C2121f5) list;
            i8 = 0;
            while (i9 < size) {
                i8 += K4.g0(c2121f5.d(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += K4.g0(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i8;
    }

    public static void F(int i8, List list, N6 n62, boolean z8) {
        if (list != null && !list.isEmpty()) {
            n62.B(i8, list, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int G(int i8, List list, boolean z8) {
        if (list.size() == 0) {
            return 0;
        }
        return H(list) + (list.size() * K4.s0(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int H(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2242s5) {
            C2242s5 c2242s5 = (C2242s5) list;
            i8 = 0;
            while (i9 < size) {
                i8 += K4.a0(c2242s5.g(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += K4.a0(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return i8;
    }

    public static void I(int i8, List list, N6 n62, boolean z8) {
        if (list != null && !list.isEmpty()) {
            n62.L(i8, list, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int J(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return K(list) + (size * K4.s0(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int K(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2121f5) {
            C2121f5 c2121f5 = (C2121f5) list;
            i8 = 0;
            while (i9 < size) {
                i8 += K4.o0(c2121f5.d(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += K4.o0(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i8;
    }

    public static void L(int i8, List list, N6 n62, boolean z8) {
        if (list != null && !list.isEmpty()) {
            n62.H(i8, list, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int M(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * K4.s0(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int N(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2242s5) {
            C2242s5 c2242s5 = (C2242s5) list;
            i8 = 0;
            while (i9 < size) {
                i8 += K4.j0(c2242s5.g(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += K4.j0(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return i8;
    }

    public static void O(int i8, List list, N6 n62, boolean z8) {
        if (list != null && !list.isEmpty()) {
            n62.i(i8, list, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int P(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Q(list) + (size * K4.s0(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int Q(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2121f5) {
            C2121f5 c2121f5 = (C2121f5) list;
            i8 = 0;
            while (i9 < size) {
                i8 += K4.v0(c2121f5.d(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += K4.v0(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i8;
    }

    public static void R(int i8, List list, N6 n62, boolean z8) {
        if (list != null && !list.isEmpty()) {
            n62.d(i8, list, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int S(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * K4.s0(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int T(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2242s5) {
            C2242s5 c2242s5 = (C2242s5) list;
            i8 = 0;
            while (i9 < size) {
                i8 += K4.n0(c2242s5.g(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += K4.n0(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return i8;
    }

    public static void U(int i8, List list, N6 n62, boolean z8) {
        if (list != null && !list.isEmpty()) {
            n62.r(i8, list, z8);
        }
    }

    public static void V(int i8, List list, N6 n62, boolean z8) {
        if (list != null && !list.isEmpty()) {
            n62.t(i8, list, z8);
        }
    }

    public static void W(int i8, List list, N6 n62, boolean z8) {
        if (list != null && !list.isEmpty()) {
            n62.n(i8, list, z8);
        }
    }

    public static void X(int i8, List list, N6 n62, boolean z8) {
        if (list != null && !list.isEmpty()) {
            n62.G(i8, list, z8);
        }
    }

    public static void Y(int i8, List list, N6 n62, boolean z8) {
        if (list != null && !list.isEmpty()) {
            n62.E(i8, list, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i8, Object obj, Y5 y52) {
        return K4.R(i8, (I5) obj, y52);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int s02 = size * K4.s0(i8);
        for (int i9 = 0; i9 < list.size(); i9++) {
            s02 += K4.A((AbstractC2241s4) list.get(i9));
        }
        return s02;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i8, List list, Y5 y52) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += K4.x(i8, (I5) list.get(i10), y52);
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * K4.z(i8, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(List list) {
        return list.size();
    }

    public static AbstractC2234r6 f() {
        return f16549a;
    }

    static Object g(Object obj, int i8, int i9, Object obj2, AbstractC2234r6 abstractC2234r6) {
        if (obj2 == null) {
            obj2 = abstractC2234r6.i(obj);
        }
        abstractC2234r6.f(obj2, i8, i9);
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object h(Object obj, int i8, List list, InterfaceC2131g5 interfaceC2131g5, Object obj2, AbstractC2234r6 abstractC2234r6) {
        if (interfaceC2131g5 == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Integer num = (Integer) list.get(i10);
                int intValue = num.intValue();
                if (interfaceC2131g5.a(intValue)) {
                    if (i10 != i9) {
                        list.set(i9, num);
                    }
                    i9++;
                } else {
                    obj2 = g(obj, i8, intValue, obj2, abstractC2234r6);
                }
            }
            if (i9 != size) {
                list.subList(i9, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!interfaceC2131g5.a(intValue2)) {
                    obj2 = g(obj, i8, intValue2, obj2, abstractC2234r6);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static void i(int i8, List list, N6 n62) {
        if (list != null && !list.isEmpty()) {
            n62.O(i8, list);
        }
    }

    public static void j(int i8, List list, N6 n62, Y5 y52) {
        if (list != null && !list.isEmpty()) {
            n62.z(i8, list, y52);
        }
    }

    public static void k(int i8, List list, N6 n62, boolean z8) {
        if (list != null && !list.isEmpty()) {
            n62.h(i8, list, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l(Q4 q42, Object obj, Object obj2) {
        U4 b8 = q42.b(obj2);
        if (!b8.f16345a.isEmpty()) {
            q42.e(obj).f(b8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(B5 b52, Object obj, Object obj2, long j8) {
        AbstractC2243s6.j(obj, j8, b52.e(AbstractC2243s6.B(obj, j8), AbstractC2243s6.B(obj2, j8)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void n(AbstractC2234r6 abstractC2234r6, Object obj, Object obj2) {
        abstractC2234r6.j(obj, abstractC2234r6.b(abstractC2234r6.k(obj), abstractC2234r6.k(obj2)));
    }

    public static void o(Class cls) {
        AbstractC2091c5.class.isAssignableFrom(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean p(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(int i8, List list) {
        int C8;
        int C9;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        int s02 = K4.s0(i8) * size;
        if (list instanceof InterfaceC2216p5) {
            InterfaceC2216p5 interfaceC2216p5 = (InterfaceC2216p5) list;
            while (i9 < size) {
                Object a8 = interfaceC2216p5.a(i9);
                if (a8 instanceof AbstractC2241s4) {
                    C9 = K4.A((AbstractC2241s4) a8);
                } else {
                    C9 = K4.C((String) a8);
                }
                s02 += C9;
                i9++;
            }
        } else {
            while (i9 < size) {
                Object obj = list.get(i9);
                if (obj instanceof AbstractC2241s4) {
                    C8 = K4.A((AbstractC2241s4) obj);
                } else {
                    C8 = K4.C((String) obj);
                }
                s02 += C8;
                i9++;
            }
        }
        return s02;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(int i8, List list, Y5 y52) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int s02 = K4.s0(i8) * size;
        for (int i9 = 0; i9 < size; i9++) {
            s02 += K4.g((I5) list.get(i9), y52);
        }
        return s02;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int s(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return t(list) + (size * K4.s0(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2121f5) {
            C2121f5 c2121f5 = (C2121f5) list;
            i8 = 0;
            while (i9 < size) {
                i8 += K4.X(c2121f5.d(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += K4.X(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i8;
    }

    public static void u(int i8, List list, N6 n62) {
        if (list != null && !list.isEmpty()) {
            n62.I(i8, list);
        }
    }

    public static void v(int i8, List list, N6 n62, Y5 y52) {
        if (list != null && !list.isEmpty()) {
            n62.o(i8, list, y52);
        }
    }

    public static void w(int i8, List list, N6 n62, boolean z8) {
        if (list != null && !list.isEmpty()) {
            n62.p(i8, list, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * K4.h0(i8, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(List list) {
        return list.size() << 2;
    }

    public static void z(int i8, List list, N6 n62, boolean z8) {
        if (list != null && !list.isEmpty()) {
            n62.m(i8, list, z8);
        }
    }
}
