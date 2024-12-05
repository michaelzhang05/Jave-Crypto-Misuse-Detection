package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.z;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f5478a = A();

    /* renamed from: b, reason: collision with root package name */
    private static final j1 f5479b = B(false);

    /* renamed from: c, reason: collision with root package name */
    private static final j1 f5480c = B(true);

    /* renamed from: d, reason: collision with root package name */
    private static final j1 f5481d = new l1();

    private static Class A() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static j1 B(boolean z5) {
        try {
            Class C = C();
            if (C == null) {
                return null;
            }
            return (j1) C.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z5));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class C() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void D(q qVar, Object obj, Object obj2) {
        t c6 = qVar.c(obj2);
        if (c6.d()) {
            return;
        }
        qVar.d(obj).h(c6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void E(j0 j0Var, Object obj, Object obj2, long j6) {
        n1.R(obj, j6, j0Var.a(n1.C(obj, j6), n1.C(obj2, j6)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void F(j1 j1Var, Object obj, Object obj2) {
        j1Var.p(obj, j1Var.k(j1Var.g(obj), j1Var.g(obj2)));
    }

    public static j1 G() {
        return f5479b;
    }

    public static j1 H() {
        return f5480c;
    }

    public static void I(Class cls) {
        Class cls2;
        if (!x.class.isAssignableFrom(cls) && (cls2 = f5478a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean J(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static Object K(Object obj, int i6, int i7, Object obj2, j1 j1Var) {
        if (obj2 == null) {
            obj2 = j1Var.f(obj);
        }
        j1Var.e(obj2, i6, i7);
        return obj2;
    }

    public static j1 L() {
        return f5481d;
    }

    public static void M(int i6, List list, q1 q1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.O(i6, list, z5);
    }

    public static void N(int i6, List list, q1 q1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.K(i6, list);
    }

    public static void O(int i6, List list, q1 q1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.F(i6, list, z5);
    }

    public static void P(int i6, List list, q1 q1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.D(i6, list, z5);
    }

    public static void Q(int i6, List list, q1 q1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.L(i6, list, z5);
    }

    public static void R(int i6, List list, q1 q1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.y(i6, list, z5);
    }

    public static void S(int i6, List list, q1 q1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.d(i6, list, z5);
    }

    public static void T(int i6, List list, q1 q1Var, d1 d1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.b(i6, list, d1Var);
    }

    public static void U(int i6, List list, q1 q1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.c(i6, list, z5);
    }

    public static void V(int i6, List list, q1 q1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.B(i6, list, z5);
    }

    public static void W(int i6, List list, q1 q1Var, d1 d1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.l(i6, list, d1Var);
    }

    public static void X(int i6, List list, q1 q1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.z(i6, list, z5);
    }

    public static void Y(int i6, List list, q1 q1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.I(i6, list, z5);
    }

    public static void Z(int i6, List list, q1 q1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.w(i6, list, z5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i6, List list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z5 ? k.L(i6) + k.x(size) : size * k.d(i6, true);
    }

    public static void a0(int i6, List list, q1 q1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.h(i6, list, z5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(List list) {
        return list.size();
    }

    public static void b0(int i6, List list, q1 q1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.q(i6, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int L = size * k.L(i6);
        for (int i7 = 0; i7 < list.size(); i7++) {
            L += k.g((h) list.get(i7));
        }
        return L;
    }

    public static void c0(int i6, List list, q1 q1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.e(i6, list, z5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i6, List list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e6 = e(list);
        int L = k.L(i6);
        return z5 ? L + k.x(e6) : e6 + (size * L);
    }

    public static void d0(int i6, List list, q1 q1Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        q1Var.N(i6, list, z5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(List list) {
        int i6;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i6 = 0;
            while (i7 < size) {
                i6 += k.k(yVar.j(i7));
                i7++;
            }
        } else {
            i6 = 0;
            while (i7 < size) {
                i6 += k.k(((Integer) list.get(i7)).intValue());
                i7++;
            }
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(int i6, List list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z5 ? k.L(i6) + k.x(size * 4) : size * k.l(i6, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(int i6, List list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z5 ? k.L(i6) + k.x(size * 8) : size * k.n(i6, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(int i6, List list, d1 d1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += k.r(i6, (o0) list.get(i8), d1Var);
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(int i6, List list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l6 = l(list);
        int L = k.L(i6);
        return z5 ? L + k.x(l6) : l6 + (size * L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(List list) {
        int i6;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i6 = 0;
            while (i7 < size) {
                i6 += k.u(yVar.j(i7));
                i7++;
            }
        } else {
            i6 = 0;
            while (i7 < size) {
                i6 += k.u(((Integer) list.get(i7)).intValue());
                i7++;
            }
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(int i6, List list, boolean z5) {
        if (list.size() == 0) {
            return 0;
        }
        int n6 = n(list);
        return z5 ? k.L(i6) + k.x(n6) : n6 + (list.size() * k.L(i6));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(List list) {
        int i6;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            i6 = 0;
            while (i7 < size) {
                i6 += k.w(f0Var.j(i7));
                i7++;
            }
        } else {
            i6 = 0;
            while (i7 < size) {
                i6 += k.w(((Long) list.get(i7)).longValue());
                i7++;
            }
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(int i6, Object obj, d1 d1Var) {
        return k.y(i6, (o0) obj, d1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(int i6, List list, d1 d1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int L = k.L(i6) * size;
        for (int i7 = 0; i7 < size; i7++) {
            L += k.z((o0) list.get(i7), d1Var);
        }
        return L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(int i6, List list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r5 = r(list);
        int L = k.L(i6);
        return z5 ? L + k.x(r5) : r5 + (size * L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(List list) {
        int i6;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i6 = 0;
            while (i7 < size) {
                i6 += k.G(yVar.j(i7));
                i7++;
            }
        } else {
            i6 = 0;
            while (i7 < size) {
                i6 += k.G(((Integer) list.get(i7)).intValue());
                i7++;
            }
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int s(int i6, List list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t5 = t(list);
        int L = k.L(i6);
        return z5 ? L + k.x(t5) : t5 + (size * L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(List list) {
        int i6;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            i6 = 0;
            while (i7 < size) {
                i6 += k.I(f0Var.j(i7));
                i7++;
            }
        } else {
            i6 = 0;
            while (i7 < size) {
                i6 += k.I(((Long) list.get(i7)).longValue());
                i7++;
            }
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u(int i6, List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        int L = k.L(i6) * size;
        if (list instanceof d0) {
            d0 d0Var = (d0) list;
            while (i7 < size) {
                Object c6 = d0Var.c(i7);
                L += c6 instanceof h ? k.g((h) c6) : k.K((String) c6);
                i7++;
            }
        } else {
            while (i7 < size) {
                Object obj = list.get(i7);
                L += obj instanceof h ? k.g((h) obj) : k.K((String) obj);
                i7++;
            }
        }
        return L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int v(int i6, List list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w5 = w(list);
        int L = k.L(i6);
        return z5 ? L + k.x(w5) : w5 + (size * L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(List list) {
        int i6;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i6 = 0;
            while (i7 < size) {
                i6 += k.N(yVar.j(i7));
                i7++;
            }
        } else {
            i6 = 0;
            while (i7 < size) {
                i6 += k.N(((Integer) list.get(i7)).intValue());
                i7++;
            }
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(int i6, List list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y5 = y(list);
        int L = k.L(i6);
        return z5 ? L + k.x(y5) : y5 + (size * L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(List list) {
        int i6;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            i6 = 0;
            while (i7 < size) {
                i6 += k.P(f0Var.j(i7));
                i7++;
            }
        } else {
            i6 = 0;
            while (i7 < size) {
                i6 += k.P(((Long) list.get(i7)).longValue());
                i7++;
            }
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object z(Object obj, int i6, List list, z.c cVar, Object obj2, j1 j1Var) {
        if (cVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i7 = 0;
            for (int i8 = 0; i8 < size; i8++) {
                int intValue = ((Integer) list.get(i8)).intValue();
                if (cVar.a(intValue)) {
                    if (i8 != i7) {
                        list.set(i7, Integer.valueOf(intValue));
                    }
                    i7++;
                } else {
                    obj2 = K(obj, i6, intValue, obj2, j1Var);
                }
            }
            if (i7 != size) {
                list.subList(i7, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!cVar.a(intValue2)) {
                    obj2 = K(obj, i6, intValue2, obj2, j1Var);
                    it.remove();
                }
            }
        }
        return obj2;
    }
}
