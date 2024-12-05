package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
final class g2 {
    private static final Class<?> a = Z();

    /* renamed from: b, reason: collision with root package name */
    private static final v2<?, ?> f15962b = S(false);

    /* renamed from: c, reason: collision with root package name */
    private static final v2<?, ?> f15963c = S(true);

    /* renamed from: d, reason: collision with root package name */
    private static final v2<?, ?> f15964d = new w2();

    public static void A(int i2, List<Long> list, l3 l3Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3Var.r(i2, list, z);
    }

    public static void B(int i2, List<Long> list, l3 l3Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3Var.k(i2, list, z);
    }

    public static void C(int i2, List<Integer> list, l3 l3Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3Var.g(i2, list, z);
    }

    public static void D(int i2, List<Integer> list, l3 l3Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3Var.n(i2, list, z);
    }

    public static void E(int i2, List<Integer> list, l3 l3Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3Var.v(i2, list, z);
    }

    public static void F(Class<?> cls) {
        Class<?> cls2;
        if (!zzuo.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void G(int i2, List<Integer> list, l3 l3Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3Var.l(i2, list, z);
    }

    public static void H(int i2, List<Integer> list, l3 l3Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3Var.o(i2, list, z);
    }

    public static void I(int i2, List<Integer> list, l3 l3Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3Var.h(i2, list, z);
    }

    public static void J(int i2, List<Boolean> list, l3 l3Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3Var.f(i2, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int K(int i2, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return Y(list) + (list.size() * zztv.O(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int L(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return b0(list) + (size * zztv.O(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int M(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g(list) + (size * zztv.O(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int N(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return h(list) + (size * zztv.O(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int O(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return i(list) + (size * zztv.O(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int P(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return j(list) + (size * zztv.O(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int Q(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return k(list) + (size * zztv.O(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int R(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zztv.z0(i2, 0);
    }

    private static v2<?, ?> S(boolean z) {
        try {
            Class<?> a0 = a0();
            if (a0 == null) {
                return null;
            }
            return (v2) a0.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int T(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zztv.q0(i2, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int U(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zztv.c0(i2, true);
    }

    public static v2<?, ?> V() {
        return f15962b;
    }

    public static v2<?, ?> W() {
        return f15963c;
    }

    public static v2<?, ?> X() {
        return f15964d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int Y(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof l1) {
            l1 l1Var = (l1) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zztv.q(l1Var.b(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zztv.q(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    private static Class<?> Z() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a(int i2, List<String> list, l3 l3Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3Var.A(i2, list);
    }

    private static Class<?> a0() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void b(int i2, List<?> list, l3 l3Var, e2 e2Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3Var.C(i2, list, e2Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b0(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof l1) {
            l1 l1Var = (l1) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zztv.r(l1Var.b(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zztv.r(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static void c(int i2, List<Double> list, l3 l3Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3Var.w(i2, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends zzuh<FT>> void d(v0<FT> v0Var, T t, T t2) {
        y0<FT> d2 = v0Var.d(t2);
        if (d2.b()) {
            return;
        }
        v0Var.e(t).h(d2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void e(q1 q1Var, T t, T t2, long j2) {
        z2.f(t, j2, q1Var.a(z2.A(t, j2), z2.A(t2, j2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void f(v2<UT, UB> v2Var, T t, T t2) {
        v2Var.f(t, v2Var.g(v2Var.c(t), v2Var.c(t2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof l1) {
            l1 l1Var = (l1) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zztv.s(l1Var.b(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zztv.s(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d1) {
            d1 d1Var = (d1) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zztv.U(d1Var.b(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zztv.U(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d1) {
            d1 d1Var = (d1) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zztv.P(d1Var.b(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zztv.P(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d1) {
            d1 d1Var = (d1) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zztv.Q(d1Var.b(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zztv.Q(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d1) {
            d1 d1Var = (d1) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zztv.R(d1Var.b(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zztv.R(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(List<?> list) {
        return list.size() << 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(List<?> list) {
        return list.size() << 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(List<?> list) {
        return list.size();
    }

    public static void o(int i2, List<zzte> list, l3 l3Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3Var.x(i2, list);
    }

    public static void p(int i2, List<?> list, l3 l3Var, e2 e2Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3Var.B(i2, list, e2Var);
    }

    public static void q(int i2, List<Float> list, l3 l3Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3Var.z(i2, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(int i2, Object obj, e2 e2Var) {
        if (obj instanceof zzvc) {
            return zztv.c(i2, (zzvc) obj);
        }
        return zztv.z(i2, (zzvv) obj, e2Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int s(int i2, List<?> list) {
        int t0;
        int t02;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int O = zztv.O(i2) * size;
        if (list instanceof zzve) {
            zzve zzveVar = (zzve) list;
            while (i3 < size) {
                Object g2 = zzveVar.g(i3);
                if (g2 instanceof zzte) {
                    t02 = zztv.A((zzte) g2);
                } else {
                    t02 = zztv.t0((String) g2);
                }
                O += t02;
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                if (obj instanceof zzte) {
                    t0 = zztv.A((zzte) obj);
                } else {
                    t0 = zztv.t0((String) obj);
                }
                O += t0;
                i3++;
            }
        }
        return O;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(int i2, List<?> list, e2 e2Var) {
        int B;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int O = zztv.O(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzvc) {
                B = zztv.d((zzvc) obj);
            } else {
                B = zztv.B((zzvv) obj, e2Var);
            }
            O += B;
        }
        return O;
    }

    public static void u(int i2, List<Long> list, l3 l3Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3Var.j(i2, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int v(int i2, List<zzte> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int O = size * zztv.O(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            O += zztv.A(list.get(i3));
        }
        return O;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(int i2, List<zzvv> list, e2 e2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += zztv.a0(i2, list.get(i4), e2Var);
        }
        return i3;
    }

    public static void x(int i2, List<Long> list, l3 l3Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3Var.u(i2, list, z);
    }

    public static void y(int i2, List<Long> list, l3 l3Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3Var.s(i2, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean z(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
