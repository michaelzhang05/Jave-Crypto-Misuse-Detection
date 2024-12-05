package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.h0;
import com.google.crypto.tink.shaded.protobuf.q1;
import com.google.crypto.tink.shaded.protobuf.z;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r0 implements d1 {

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f5624r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    private static final Unsafe f5625s = n1.D();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f5626a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f5627b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5628c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5629d;

    /* renamed from: e, reason: collision with root package name */
    private final o0 f5630e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f5631f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f5632g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f5633h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f5634i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f5635j;

    /* renamed from: k, reason: collision with root package name */
    private final int f5636k;

    /* renamed from: l, reason: collision with root package name */
    private final int f5637l;

    /* renamed from: m, reason: collision with root package name */
    private final t0 f5638m;

    /* renamed from: n, reason: collision with root package name */
    private final e0 f5639n;

    /* renamed from: o, reason: collision with root package name */
    private final j1 f5640o;

    /* renamed from: p, reason: collision with root package name */
    private final q f5641p;

    /* renamed from: q, reason: collision with root package name */
    private final j0 f5642q;

    private r0(int[] iArr, Object[] objArr, int i6, int i7, o0 o0Var, boolean z5, boolean z6, int[] iArr2, int i8, int i9, t0 t0Var, e0 e0Var, j1 j1Var, q qVar, j0 j0Var) {
        this.f5626a = iArr;
        this.f5627b = objArr;
        this.f5628c = i6;
        this.f5629d = i7;
        this.f5632g = o0Var instanceof x;
        this.f5633h = z5;
        this.f5631f = qVar != null && qVar.e(o0Var);
        this.f5634i = z6;
        this.f5635j = iArr2;
        this.f5636k = i8;
        this.f5637l = i9;
        this.f5638m = t0Var;
        this.f5639n = e0Var;
        this.f5640o = j1Var;
        this.f5641p = qVar;
        this.f5630e = o0Var;
        this.f5642q = j0Var;
    }

    private static boolean A(int i6) {
        return (i6 & 536870912) != 0;
    }

    private void A0(q1 q1Var, int i6, Object obj, int i7) {
        if (obj != null) {
            this.f5642q.h(t(i7));
            q1Var.g(i6, null, this.f5642q.b(obj));
        }
    }

    private boolean B(Object obj, int i6) {
        int k02 = k0(i6);
        long j6 = 1048575 & k02;
        if (j6 != 1048575) {
            return (n1.z(obj, j6) & (1 << (k02 >>> 20))) != 0;
        }
        int w02 = w0(i6);
        long X = X(w02);
        switch (v0(w02)) {
            case 0:
                return Double.doubleToRawLongBits(n1.x(obj, X)) != 0;
            case 1:
                return Float.floatToRawIntBits(n1.y(obj, X)) != 0;
            case 2:
                return n1.A(obj, X) != 0;
            case 3:
                return n1.A(obj, X) != 0;
            case 4:
                return n1.z(obj, X) != 0;
            case t3.b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return n1.A(obj, X) != 0;
            case 6:
                return n1.z(obj, X) != 0;
            case 7:
                return n1.r(obj, X);
            case 8:
                Object C = n1.C(obj, X);
                if (C instanceof String) {
                    return !((String) C).isEmpty();
                }
                if (C instanceof h) {
                    return !h.f5485b.equals(C);
                }
                throw new IllegalArgumentException();
            case 9:
                return n1.C(obj, X) != null;
            case 10:
                return !h.f5485b.equals(n1.C(obj, X));
            case 11:
                return n1.z(obj, X) != 0;
            case 12:
                return n1.z(obj, X) != 0;
            case 13:
                return n1.z(obj, X) != 0;
            case 14:
                return n1.A(obj, X) != 0;
            case 15:
                return n1.z(obj, X) != 0;
            case 16:
                return n1.A(obj, X) != 0;
            case 17:
                return n1.C(obj, X) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void B0(int i6, Object obj, q1 q1Var) {
        if (obj instanceof String) {
            q1Var.u(i6, (String) obj);
        } else {
            q1Var.a(i6, (h) obj);
        }
    }

    private boolean C(Object obj, int i6, int i7, int i8, int i9) {
        return i7 == 1048575 ? B(obj, i6) : (i8 & i9) != 0;
    }

    private void C0(j1 j1Var, Object obj, q1 q1Var) {
        j1Var.t(j1Var.g(obj), q1Var);
    }

    private static boolean D(Object obj, int i6, d1 d1Var) {
        return d1Var.b(n1.C(obj, X(i6)));
    }

    private boolean E(Object obj, int i6, int i7) {
        List list = (List) n1.C(obj, X(i6));
        if (list.isEmpty()) {
            return true;
        }
        d1 u5 = u(i7);
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (!u5.b(list.get(i8))) {
                return false;
            }
        }
        return true;
    }

    private boolean F(Object obj, int i6, int i7) {
        if (this.f5642q.b(n1.C(obj, X(i6))).isEmpty()) {
            return true;
        }
        this.f5642q.h(t(i7));
        throw null;
    }

    private static boolean G(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof x) {
            return ((x) obj).D();
        }
        return true;
    }

    private boolean H(Object obj, Object obj2, int i6) {
        long k02 = k0(i6) & 1048575;
        return n1.z(obj, k02) == n1.z(obj2, k02);
    }

    private boolean I(Object obj, int i6, int i7) {
        return n1.z(obj, (long) (k0(i7) & 1048575)) == i6;
    }

    private static boolean J(int i6) {
        return (i6 & 268435456) != 0;
    }

    private static List K(Object obj, long j6) {
        return (List) n1.C(obj, j6);
    }

    private static long L(Object obj, long j6) {
        return n1.A(obj, j6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x0091, code lost:
    
        r0 = r19.f5636k;
        r5 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0097, code lost:
    
        if (r0 >= r19.f5637l) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0099, code lost:
    
        r5 = q(r22, r19.f5635j[r0], r5, r20, r22);
        r0 = r0 + 1;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x00af, code lost:
    
        r10 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x00b0, code lost:
    
        if (r5 == null) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x00b2, code lost:
    
        r7.o(r10, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x00b5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:?, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x00cf. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:37:0x055f A[Catch: all -> 0x05bc, TRY_LEAVE, TryCatch #6 {all -> 0x05bc, blocks: (B:75:0x00d6, B:35:0x0559, B:37:0x055f, B:50:0x0588, B:110:0x0223, B:111:0x0228, B:112:0x0234, B:113:0x0239, B:114:0x0245, B:115:0x024a, B:116:0x0256, B:117:0x025b, B:118:0x0267, B:119:0x026c, B:120:0x027f, B:121:0x028d, B:122:0x0299, B:123:0x029e, B:124:0x02aa, B:125:0x02af, B:126:0x02bb, B:127:0x02c0, B:128:0x02cc, B:129:0x02d1, B:130:0x02dd, B:131:0x02e2, B:132:0x02ee, B:133:0x02f3, B:134:0x02ff, B:135:0x0304, B:136:0x0310, B:137:0x0315, B:138:0x0321, B:139:0x0326, B:140:0x0334, B:141:0x0342, B:142:0x0350, B:143:0x035e, B:144:0x0373, B:145:0x0381, B:146:0x0392, B:147:0x03a6, B:148:0x03ad, B:149:0x03bb, B:150:0x03c9, B:151:0x03d7, B:152:0x03e5, B:153:0x03f3, B:154:0x0401, B:155:0x040f, B:156:0x041d, B:157:0x042c, B:158:0x0431, B:159:0x043e, B:160:0x0443, B:161:0x0451, B:162:0x045f, B:163:0x046d, B:164:0x047e, B:165:0x048c, B:166:0x049a, B:167:0x04aa, B:168:0x04b0, B:169:0x04be, B:170:0x04cd, B:171:0x04dc, B:172:0x04eb, B:173:0x04fa, B:174:0x0509, B:175:0x0518), top: B:74:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x05cd A[LOOP:4: B:67:0x05c9->B:69:0x05cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x05e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void M(com.google.crypto.tink.shaded.protobuf.j1 r20, com.google.crypto.tink.shaded.protobuf.q r21, java.lang.Object r22, com.google.crypto.tink.shaded.protobuf.c1 r23, com.google.crypto.tink.shaded.protobuf.p r24) {
        /*
            Method dump skipped, instructions count: 1652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r0.M(com.google.crypto.tink.shaded.protobuf.j1, com.google.crypto.tink.shaded.protobuf.q, java.lang.Object, com.google.crypto.tink.shaded.protobuf.c1, com.google.crypto.tink.shaded.protobuf.p):void");
    }

    private final void N(Object obj, int i6, Object obj2, p pVar, c1 c1Var) {
        long X = X(w0(i6));
        Object C = n1.C(obj, X);
        if (C == null) {
            C = this.f5642q.c(obj2);
            n1.R(obj, X, C);
        } else if (this.f5642q.f(C)) {
            Object c6 = this.f5642q.c(obj2);
            this.f5642q.a(c6, C);
            n1.R(obj, X, c6);
            C = c6;
        }
        Map e6 = this.f5642q.e(C);
        this.f5642q.h(obj2);
        c1Var.v(e6, null, pVar);
    }

    private void O(Object obj, Object obj2, int i6) {
        if (B(obj2, i6)) {
            long X = X(w0(i6));
            Unsafe unsafe = f5625s;
            Object object = unsafe.getObject(obj2, X);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + W(i6) + " is present but null: " + obj2);
            }
            d1 u5 = u(i6);
            if (!B(obj, i6)) {
                if (G(object)) {
                    Object g6 = u5.g();
                    u5.a(g6, object);
                    unsafe.putObject(obj, X, g6);
                } else {
                    unsafe.putObject(obj, X, object);
                }
                q0(obj, i6);
                return;
            }
            Object object2 = unsafe.getObject(obj, X);
            if (!G(object2)) {
                Object g7 = u5.g();
                u5.a(g7, object2);
                unsafe.putObject(obj, X, g7);
                object2 = g7;
            }
            u5.a(object2, object);
        }
    }

    private void P(Object obj, Object obj2, int i6) {
        int W = W(i6);
        if (I(obj2, W, i6)) {
            long X = X(w0(i6));
            Unsafe unsafe = f5625s;
            Object object = unsafe.getObject(obj2, X);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + W(i6) + " is present but null: " + obj2);
            }
            d1 u5 = u(i6);
            if (!I(obj, W, i6)) {
                if (G(object)) {
                    Object g6 = u5.g();
                    u5.a(g6, object);
                    unsafe.putObject(obj, X, g6);
                } else {
                    unsafe.putObject(obj, X, object);
                }
                r0(obj, W, i6);
                return;
            }
            Object object2 = unsafe.getObject(obj, X);
            if (!G(object2)) {
                Object g7 = u5.g();
                u5.a(g7, object2);
                unsafe.putObject(obj, X, g7);
                object2 = g7;
            }
            u5.a(object2, object);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    private void Q(Object obj, Object obj2, int i6) {
        int w02 = w0(i6);
        long X = X(w02);
        int W = W(i6);
        switch (v0(w02)) {
            case 0:
                if (B(obj2, i6)) {
                    n1.N(obj, X, n1.x(obj2, X));
                    q0(obj, i6);
                    return;
                }
                return;
            case 1:
                if (B(obj2, i6)) {
                    n1.O(obj, X, n1.y(obj2, X));
                    q0(obj, i6);
                    return;
                }
                return;
            case 2:
                if (!B(obj2, i6)) {
                    return;
                }
                n1.Q(obj, X, n1.A(obj2, X));
                q0(obj, i6);
                return;
            case 3:
                if (!B(obj2, i6)) {
                    return;
                }
                n1.Q(obj, X, n1.A(obj2, X));
                q0(obj, i6);
                return;
            case 4:
                if (!B(obj2, i6)) {
                    return;
                }
                n1.P(obj, X, n1.z(obj2, X));
                q0(obj, i6);
                return;
            case t3.b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                if (!B(obj2, i6)) {
                    return;
                }
                n1.Q(obj, X, n1.A(obj2, X));
                q0(obj, i6);
                return;
            case 6:
                if (!B(obj2, i6)) {
                    return;
                }
                n1.P(obj, X, n1.z(obj2, X));
                q0(obj, i6);
                return;
            case 7:
                if (B(obj2, i6)) {
                    n1.H(obj, X, n1.r(obj2, X));
                    q0(obj, i6);
                    return;
                }
                return;
            case 8:
                if (!B(obj2, i6)) {
                    return;
                }
                n1.R(obj, X, n1.C(obj2, X));
                q0(obj, i6);
                return;
            case 9:
            case 17:
                O(obj, obj2, i6);
                return;
            case 10:
                if (!B(obj2, i6)) {
                    return;
                }
                n1.R(obj, X, n1.C(obj2, X));
                q0(obj, i6);
                return;
            case 11:
                if (!B(obj2, i6)) {
                    return;
                }
                n1.P(obj, X, n1.z(obj2, X));
                q0(obj, i6);
                return;
            case 12:
                if (!B(obj2, i6)) {
                    return;
                }
                n1.P(obj, X, n1.z(obj2, X));
                q0(obj, i6);
                return;
            case 13:
                if (!B(obj2, i6)) {
                    return;
                }
                n1.P(obj, X, n1.z(obj2, X));
                q0(obj, i6);
                return;
            case 14:
                if (!B(obj2, i6)) {
                    return;
                }
                n1.Q(obj, X, n1.A(obj2, X));
                q0(obj, i6);
                return;
            case 15:
                if (!B(obj2, i6)) {
                    return;
                }
                n1.P(obj, X, n1.z(obj2, X));
                q0(obj, i6);
                return;
            case 16:
                if (!B(obj2, i6)) {
                    return;
                }
                n1.Q(obj, X, n1.A(obj2, X));
                q0(obj, i6);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f5639n.d(obj, obj2, X);
                return;
            case 50:
                f1.E(this.f5642q, obj, obj2, X);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (!I(obj2, W, i6)) {
                    return;
                }
                n1.R(obj, X, n1.C(obj2, X));
                r0(obj, W, i6);
                return;
            case 60:
            case 68:
                P(obj, obj2, i6);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (!I(obj2, W, i6)) {
                    return;
                }
                n1.R(obj, X, n1.C(obj2, X));
                r0(obj, W, i6);
                return;
            default:
                return;
        }
    }

    private Object R(Object obj, int i6) {
        d1 u5 = u(i6);
        long X = X(w0(i6));
        if (!B(obj, i6)) {
            return u5.g();
        }
        Object object = f5625s.getObject(obj, X);
        if (G(object)) {
            return object;
        }
        Object g6 = u5.g();
        if (object != null) {
            u5.a(g6, object);
        }
        return g6;
    }

    private Object S(Object obj, int i6, int i7) {
        d1 u5 = u(i7);
        if (!I(obj, i6, i7)) {
            return u5.g();
        }
        Object object = f5625s.getObject(obj, X(w0(i7)));
        if (G(object)) {
            return object;
        }
        Object g6 = u5.g();
        if (object != null) {
            u5.a(g6, object);
        }
        return g6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r0 T(Class cls, m0 m0Var, t0 t0Var, e0 e0Var, j1 j1Var, q qVar, j0 j0Var) {
        if (m0Var instanceof b1) {
            return V((b1) m0Var, t0Var, e0Var, j1Var, qVar, j0Var);
        }
        androidx.appcompat.app.f0.a(m0Var);
        return U(null, t0Var, e0Var, j1Var, qVar, j0Var);
    }

    static r0 U(g1 g1Var, t0 t0Var, e0 e0Var, j1 j1Var, q qVar, j0 j0Var) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.crypto.tink.shaded.protobuf.r0 V(com.google.crypto.tink.shaded.protobuf.b1 r34, com.google.crypto.tink.shaded.protobuf.t0 r35, com.google.crypto.tink.shaded.protobuf.e0 r36, com.google.crypto.tink.shaded.protobuf.j1 r37, com.google.crypto.tink.shaded.protobuf.q r38, com.google.crypto.tink.shaded.protobuf.j0 r39) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r0.V(com.google.crypto.tink.shaded.protobuf.b1, com.google.crypto.tink.shaded.protobuf.t0, com.google.crypto.tink.shaded.protobuf.e0, com.google.crypto.tink.shaded.protobuf.j1, com.google.crypto.tink.shaded.protobuf.q, com.google.crypto.tink.shaded.protobuf.j0):com.google.crypto.tink.shaded.protobuf.r0");
    }

    private int W(int i6) {
        return this.f5626a[i6];
    }

    private static long X(int i6) {
        return i6 & 1048575;
    }

    private static boolean Y(Object obj, long j6) {
        return ((Boolean) n1.C(obj, j6)).booleanValue();
    }

    private static double Z(Object obj, long j6) {
        return ((Double) n1.C(obj, j6)).doubleValue();
    }

    private static float a0(Object obj, long j6) {
        return ((Float) n1.C(obj, j6)).floatValue();
    }

    private static int b0(Object obj, long j6) {
        return ((Integer) n1.C(obj, j6)).intValue();
    }

    private static long c0(Object obj, long j6) {
        return ((Long) n1.C(obj, j6)).longValue();
    }

    private int d0(Object obj, byte[] bArr, int i6, int i7, int i8, long j6, e.a aVar) {
        Unsafe unsafe = f5625s;
        Object t5 = t(i8);
        Object object = unsafe.getObject(obj, j6);
        if (this.f5642q.f(object)) {
            Object c6 = this.f5642q.c(t5);
            this.f5642q.a(c6, object);
            unsafe.putObject(obj, j6, c6);
            object = c6;
        }
        this.f5642q.h(t5);
        return n(bArr, i6, i7, null, this.f5642q.e(object), aVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0022. Please report as an issue. */
    private int e0(Object obj, byte[] bArr, int i6, int i7, int i8, int i9, int i10, int i11, int i12, long j6, int i13, e.a aVar) {
        Object valueOf;
        Object valueOf2;
        int K;
        long j7;
        int i14;
        Object valueOf3;
        Object S;
        int N;
        Unsafe unsafe = f5625s;
        long j8 = this.f5626a[i13 + 2] & 1048575;
        switch (i12) {
            case 51:
                if (i10 == 1) {
                    valueOf = Double.valueOf(e.d(bArr, i6));
                    unsafe.putObject(obj, j6, valueOf);
                    K = i6 + 8;
                    unsafe.putInt(obj, j8, i9);
                    return K;
                }
                return i6;
            case 52:
                if (i10 == 5) {
                    valueOf2 = Float.valueOf(e.k(bArr, i6));
                    unsafe.putObject(obj, j6, valueOf2);
                    K = i6 + 4;
                    unsafe.putInt(obj, j8, i9);
                    return K;
                }
                return i6;
            case 53:
            case 54:
                if (i10 == 0) {
                    K = e.K(bArr, i6, aVar);
                    j7 = aVar.f5472b;
                    valueOf3 = Long.valueOf(j7);
                    unsafe.putObject(obj, j6, valueOf3);
                    unsafe.putInt(obj, j8, i9);
                    return K;
                }
                return i6;
            case 55:
            case 62:
                if (i10 == 0) {
                    K = e.H(bArr, i6, aVar);
                    i14 = aVar.f5471a;
                    valueOf3 = Integer.valueOf(i14);
                    unsafe.putObject(obj, j6, valueOf3);
                    unsafe.putInt(obj, j8, i9);
                    return K;
                }
                return i6;
            case 56:
            case 65:
                if (i10 == 1) {
                    valueOf = Long.valueOf(e.i(bArr, i6));
                    unsafe.putObject(obj, j6, valueOf);
                    K = i6 + 8;
                    unsafe.putInt(obj, j8, i9);
                    return K;
                }
                return i6;
            case 57:
            case 64:
                if (i10 == 5) {
                    valueOf2 = Integer.valueOf(e.g(bArr, i6));
                    unsafe.putObject(obj, j6, valueOf2);
                    K = i6 + 4;
                    unsafe.putInt(obj, j8, i9);
                    return K;
                }
                return i6;
            case 58:
                if (i10 == 0) {
                    K = e.K(bArr, i6, aVar);
                    valueOf3 = Boolean.valueOf(aVar.f5472b != 0);
                    unsafe.putObject(obj, j6, valueOf3);
                    unsafe.putInt(obj, j8, i9);
                    return K;
                }
                return i6;
            case 59:
                if (i10 == 2) {
                    K = e.H(bArr, i6, aVar);
                    int i15 = aVar.f5471a;
                    if (i15 == 0) {
                        valueOf3 = "";
                        unsafe.putObject(obj, j6, valueOf3);
                        unsafe.putInt(obj, j8, i9);
                        return K;
                    }
                    if ((i11 & 536870912) != 0 && !o1.n(bArr, K, K + i15)) {
                        throw a0.d();
                    }
                    unsafe.putObject(obj, j6, new String(bArr, K, i15, z.f5708b));
                    K += i15;
                    unsafe.putInt(obj, j8, i9);
                    return K;
                }
                return i6;
            case 60:
                if (i10 == 2) {
                    S = S(obj, i9, i13);
                    N = e.N(S, u(i13), bArr, i6, i7, aVar);
                    u0(obj, i9, i13, S);
                    return N;
                }
                return i6;
            case 61:
                if (i10 == 2) {
                    K = e.b(bArr, i6, aVar);
                    valueOf3 = aVar.f5473c;
                    unsafe.putObject(obj, j6, valueOf3);
                    unsafe.putInt(obj, j8, i9);
                    return K;
                }
                return i6;
            case 63:
                if (i10 == 0) {
                    K = e.H(bArr, i6, aVar);
                    i14 = aVar.f5471a;
                    s(i13);
                    valueOf3 = Integer.valueOf(i14);
                    unsafe.putObject(obj, j6, valueOf3);
                    unsafe.putInt(obj, j8, i9);
                    return K;
                }
                return i6;
            case 66:
                if (i10 == 0) {
                    K = e.H(bArr, i6, aVar);
                    i14 = i.b(aVar.f5471a);
                    valueOf3 = Integer.valueOf(i14);
                    unsafe.putObject(obj, j6, valueOf3);
                    unsafe.putInt(obj, j8, i9);
                    return K;
                }
                return i6;
            case 67:
                if (i10 == 0) {
                    K = e.K(bArr, i6, aVar);
                    j7 = i.c(aVar.f5472b);
                    valueOf3 = Long.valueOf(j7);
                    unsafe.putObject(obj, j6, valueOf3);
                    unsafe.putInt(obj, j8, i9);
                    return K;
                }
                return i6;
            case 68:
                if (i10 == 3) {
                    S = S(obj, i9, i13);
                    N = e.M(S, u(i13), bArr, i6, i7, (i8 & (-8)) | 4, aVar);
                    u0(obj, i9, i13, S);
                    return N;
                }
                return i6;
            default:
                return i6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0296, code lost:
    
        if (r0 != r10) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0298, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r1 = r18;
        r2 = r19;
        r7 = r22;
        r6 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02ff, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02db, code lost:
    
        if (r0 != r15) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02fc, code lost:
    
        if (r0 != r15) goto L100;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0087. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int g0(java.lang.Object r30, byte[] r31, int r32, int r33, com.google.crypto.tink.shaded.protobuf.e.a r34) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r0.g0(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0030. Please report as an issue. */
    private int h0(Object obj, byte[] bArr, int i6, int i7, int i8, int i9, int i10, int i11, long j6, int i12, long j7, e.a aVar) {
        int I;
        Unsafe unsafe = f5625s;
        z.d dVar = (z.d) unsafe.getObject(obj, j7);
        if (!dVar.f()) {
            int size = dVar.size();
            dVar = dVar.d(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j7, dVar);
        }
        switch (i12) {
            case 18:
            case 35:
                if (i10 == 2) {
                    return e.r(bArr, i6, dVar, aVar);
                }
                if (i10 == 1) {
                    return e.e(i8, bArr, i6, i7, dVar, aVar);
                }
                return i6;
            case 19:
            case 36:
                if (i10 == 2) {
                    return e.u(bArr, i6, dVar, aVar);
                }
                if (i10 == 5) {
                    return e.l(i8, bArr, i6, i7, dVar, aVar);
                }
                return i6;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i10 == 2) {
                    return e.y(bArr, i6, dVar, aVar);
                }
                if (i10 == 0) {
                    return e.L(i8, bArr, i6, i7, dVar, aVar);
                }
                return i6;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i10 == 2) {
                    return e.x(bArr, i6, dVar, aVar);
                }
                if (i10 == 0) {
                    return e.I(i8, bArr, i6, i7, dVar, aVar);
                }
                return i6;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i10 == 2) {
                    return e.t(bArr, i6, dVar, aVar);
                }
                if (i10 == 1) {
                    return e.j(i8, bArr, i6, i7, dVar, aVar);
                }
                return i6;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i10 == 2) {
                    return e.s(bArr, i6, dVar, aVar);
                }
                if (i10 == 5) {
                    return e.h(i8, bArr, i6, i7, dVar, aVar);
                }
                return i6;
            case 25:
            case 42:
                if (i10 == 2) {
                    return e.q(bArr, i6, dVar, aVar);
                }
                if (i10 == 0) {
                    return e.a(i8, bArr, i6, i7, dVar, aVar);
                }
                return i6;
            case 26:
                if (i10 == 2) {
                    long j8 = j6 & 536870912;
                    z.d dVar2 = dVar;
                    return j8 == 0 ? e.C(i8, bArr, i6, i7, dVar2, aVar) : e.D(i8, bArr, i6, i7, dVar2, aVar);
                }
                return i6;
            case 27:
                if (i10 == 2) {
                    return e.p(u(i11), i8, bArr, i6, i7, dVar, aVar);
                }
                return i6;
            case 28:
                if (i10 == 2) {
                    return e.c(i8, bArr, i6, i7, dVar, aVar);
                }
                return i6;
            case 30:
            case 44:
                if (i10 != 2) {
                    if (i10 == 0) {
                        I = e.I(i8, bArr, i6, i7, dVar, aVar);
                    }
                    return i6;
                }
                I = e.x(bArr, i6, dVar, aVar);
                s(i11);
                f1.z(obj, i9, dVar, null, null, this.f5640o);
                return I;
            case 33:
            case 47:
                if (i10 == 2) {
                    return e.v(bArr, i6, dVar, aVar);
                }
                if (i10 == 0) {
                    return e.z(i8, bArr, i6, i7, dVar, aVar);
                }
                return i6;
            case 34:
            case 48:
                if (i10 == 2) {
                    return e.w(bArr, i6, dVar, aVar);
                }
                if (i10 == 0) {
                    return e.A(i8, bArr, i6, i7, dVar, aVar);
                }
                return i6;
            case 49:
                if (i10 == 3) {
                    return e.n(u(i11), i8, bArr, i6, i7, dVar, aVar);
                }
                return i6;
            default:
                return i6;
        }
    }

    private int i0(int i6) {
        if (i6 < this.f5628c || i6 > this.f5629d) {
            return -1;
        }
        return s0(i6, 0);
    }

    private int j0(int i6, int i7) {
        if (i6 < this.f5628c || i6 > this.f5629d) {
            return -1;
        }
        return s0(i6, i7);
    }

    private boolean k(Object obj, Object obj2, int i6) {
        return B(obj, i6) == B(obj2, i6);
    }

    private int k0(int i6) {
        return this.f5626a[i6 + 2];
    }

    private static boolean l(Object obj, long j6) {
        return n1.r(obj, j6);
    }

    private void l0(Object obj, long j6, c1 c1Var, d1 d1Var, p pVar) {
        c1Var.B(this.f5639n.e(obj, j6), d1Var, pVar);
    }

    private static void m(Object obj) {
        if (G(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private void m0(Object obj, int i6, c1 c1Var, d1 d1Var, p pVar) {
        c1Var.C(this.f5639n.e(obj, X(i6)), d1Var, pVar);
    }

    private int n(byte[] bArr, int i6, int i7, h0.a aVar, Map map, e.a aVar2) {
        int H = e.H(bArr, i6, aVar2);
        int i8 = aVar2.f5471a;
        if (i8 < 0 || i8 > i7 - H) {
            throw a0.m();
        }
        throw null;
    }

    private void n0(Object obj, int i6, c1 c1Var) {
        long X;
        Object c6;
        if (A(i6)) {
            X = X(i6);
            c6 = c1Var.E();
        } else if (this.f5632g) {
            X = X(i6);
            c6 = c1Var.A();
        } else {
            X = X(i6);
            c6 = c1Var.c();
        }
        n1.R(obj, X, c6);
    }

    private static double o(Object obj, long j6) {
        return n1.x(obj, j6);
    }

    private void o0(Object obj, int i6, c1 c1Var) {
        if (A(i6)) {
            c1Var.b(this.f5639n.e(obj, X(i6)));
        } else {
            c1Var.M(this.f5639n.e(obj, X(i6)));
        }
    }

    private boolean p(Object obj, Object obj2, int i6) {
        int w02 = w0(i6);
        long X = X(w02);
        switch (v0(w02)) {
            case 0:
                return k(obj, obj2, i6) && Double.doubleToLongBits(n1.x(obj, X)) == Double.doubleToLongBits(n1.x(obj2, X));
            case 1:
                return k(obj, obj2, i6) && Float.floatToIntBits(n1.y(obj, X)) == Float.floatToIntBits(n1.y(obj2, X));
            case 2:
                return k(obj, obj2, i6) && n1.A(obj, X) == n1.A(obj2, X);
            case 3:
                return k(obj, obj2, i6) && n1.A(obj, X) == n1.A(obj2, X);
            case 4:
                return k(obj, obj2, i6) && n1.z(obj, X) == n1.z(obj2, X);
            case t3.b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return k(obj, obj2, i6) && n1.A(obj, X) == n1.A(obj2, X);
            case 6:
                return k(obj, obj2, i6) && n1.z(obj, X) == n1.z(obj2, X);
            case 7:
                return k(obj, obj2, i6) && n1.r(obj, X) == n1.r(obj2, X);
            case 8:
                return k(obj, obj2, i6) && f1.J(n1.C(obj, X), n1.C(obj2, X));
            case 9:
                return k(obj, obj2, i6) && f1.J(n1.C(obj, X), n1.C(obj2, X));
            case 10:
                return k(obj, obj2, i6) && f1.J(n1.C(obj, X), n1.C(obj2, X));
            case 11:
                return k(obj, obj2, i6) && n1.z(obj, X) == n1.z(obj2, X);
            case 12:
                return k(obj, obj2, i6) && n1.z(obj, X) == n1.z(obj2, X);
            case 13:
                return k(obj, obj2, i6) && n1.z(obj, X) == n1.z(obj2, X);
            case 14:
                return k(obj, obj2, i6) && n1.A(obj, X) == n1.A(obj2, X);
            case 15:
                return k(obj, obj2, i6) && n1.z(obj, X) == n1.z(obj2, X);
            case 16:
                return k(obj, obj2, i6) && n1.A(obj, X) == n1.A(obj2, X);
            case 17:
                return k(obj, obj2, i6) && f1.J(n1.C(obj, X), n1.C(obj2, X));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                return f1.J(n1.C(obj, X), n1.C(obj2, X));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return H(obj, obj2, i6) && f1.J(n1.C(obj, X), n1.C(obj2, X));
            default:
                return true;
        }
    }

    private static Field p0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private Object q(Object obj, int i6, Object obj2, j1 j1Var, Object obj3) {
        W(i6);
        if (n1.C(obj, X(w0(i6))) == null) {
            return obj2;
        }
        s(i6);
        return obj2;
    }

    private void q0(Object obj, int i6) {
        int k02 = k0(i6);
        long j6 = 1048575 & k02;
        if (j6 == 1048575) {
            return;
        }
        n1.P(obj, j6, (1 << (k02 >>> 20)) | n1.z(obj, j6));
    }

    private static float r(Object obj, long j6) {
        return n1.y(obj, j6);
    }

    private void r0(Object obj, int i6, int i7) {
        n1.P(obj, k0(i7) & 1048575, i6);
    }

    private z.c s(int i6) {
        androidx.appcompat.app.f0.a(this.f5627b[((i6 / 3) * 2) + 1]);
        return null;
    }

    private int s0(int i6, int i7) {
        int length = (this.f5626a.length / 3) - 1;
        while (i7 <= length) {
            int i8 = (length + i7) >>> 1;
            int i9 = i8 * 3;
            int W = W(i9);
            if (i6 == W) {
                return i9;
            }
            if (i6 < W) {
                length = i8 - 1;
            } else {
                i7 = i8 + 1;
            }
        }
        return -1;
    }

    private Object t(int i6) {
        return this.f5627b[(i6 / 3) * 2];
    }

    private void t0(Object obj, int i6, Object obj2) {
        f5625s.putObject(obj, X(w0(i6)), obj2);
        q0(obj, i6);
    }

    private d1 u(int i6) {
        int i7 = (i6 / 3) * 2;
        d1 d1Var = (d1) this.f5627b[i7];
        if (d1Var != null) {
            return d1Var;
        }
        d1 c6 = z0.a().c((Class) this.f5627b[i7 + 1]);
        this.f5627b[i7] = c6;
        return c6;
    }

    private void u0(Object obj, int i6, int i7, Object obj2) {
        f5625s.putObject(obj, X(w0(i7)), obj2);
        r0(obj, i6, i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k1 v(Object obj) {
        x xVar = (x) obj;
        k1 k1Var = xVar.unknownFields;
        if (k1Var != k1.c()) {
            return k1Var;
        }
        k1 k6 = k1.k();
        xVar.unknownFields = k6;
        return k6;
    }

    private static int v0(int i6) {
        return (i6 & 267386880) >>> 20;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01cd, code lost:
    
        if (r16.f5634i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01df, code lost:
    
        if (r16.f5634i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f1, code lost:
    
        if (r16.f5634i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0202, code lost:
    
        if (r16.f5634i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0213, code lost:
    
        if (r16.f5634i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0224, code lost:
    
        if (r16.f5634i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0235, code lost:
    
        if (r16.f5634i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0246, code lost:
    
        if (r16.f5634i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        if (I(r17, r10, r5) != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0257, code lost:
    
        if (r16.f5634i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0310, code lost:
    
        r3 = com.google.crypto.tink.shaded.protobuf.k.r(r10, (com.google.crypto.tink.shaded.protobuf.o0) r2.getObject(r17, r13), u(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x030e, code lost:
    
        if ((r8 & r15) != 0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x033b, code lost:
    
        if ((r8 & r15) != 0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0344, code lost:
    
        if ((r8 & r15) != 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0369, code lost:
    
        if ((r8 & r15) != 0) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0378, code lost:
    
        if ((r8 & r15) != 0) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03a5, code lost:
    
        if ((r8 & r15) != 0) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        if (I(r17, r10, r5) != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x033d, code lost:
    
        r3 = com.google.crypto.tink.shaded.protobuf.k.D(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        if (I(r17, r10, r5) != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0346, code lost:
    
        r4 = com.google.crypto.tink.shaded.protobuf.k.B(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b0, code lost:
    
        if (I(r17, r10, r5) != false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x036b, code lost:
    
        r3 = com.google.crypto.tink.shaded.protobuf.k.f(r10, (com.google.crypto.tink.shaded.protobuf.h) r2.getObject(r17, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b8, code lost:
    
        if (I(r17, r10, r5) != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x037a, code lost:
    
        r3 = com.google.crypto.tink.shaded.protobuf.f1.o(r10, r2.getObject(r17, r13), u(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00de, code lost:
    
        if (I(r17, r10, r5) != false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x03a7, code lost:
    
        r3 = com.google.crypto.tink.shaded.protobuf.k.d(r10, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0173, code lost:
    
        if (r16.f5634i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x025d, code lost:
    
        r4 = (com.google.crypto.tink.shaded.protobuf.k.L(r10) + com.google.crypto.tink.shaded.protobuf.k.N(r3)) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0259, code lost:
    
        r2.putInt(r17, r12, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0185, code lost:
    
        if (r16.f5634i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0197, code lost:
    
        if (r16.f5634i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a9, code lost:
    
        if (r16.f5634i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01bb, code lost:
    
        if (r16.f5634i != false) goto L150;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x005f. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int w(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r0.w(java.lang.Object):int");
    }

    private int w0(int i6) {
        return this.f5626a[i6 + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x012a, code lost:
    
        if (r15.f5634i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0214, code lost:
    
        r6 = (com.google.crypto.tink.shaded.protobuf.k.L(r8) + com.google.crypto.tink.shaded.protobuf.k.N(r7)) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0210, code lost:
    
        r2.putInt(r16, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x013c, code lost:
    
        if (r15.f5634i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x014e, code lost:
    
        if (r15.f5634i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0160, code lost:
    
        if (r15.f5634i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0172, code lost:
    
        if (r15.f5634i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0184, code lost:
    
        if (r15.f5634i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0196, code lost:
    
        if (r15.f5634i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01a8, code lost:
    
        if (r15.f5634i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01b9, code lost:
    
        if (r15.f5634i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01ca, code lost:
    
        if (r15.f5634i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01db, code lost:
    
        if (r15.f5634i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01ec, code lost:
    
        if (r15.f5634i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01fd, code lost:
    
        if (r15.f5634i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x020e, code lost:
    
        if (r15.f5634i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0334, code lost:
    
        if ((r6 instanceof com.google.crypto.tink.shaded.protobuf.h) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a6, code lost:
    
        if ((r6 instanceof com.google.crypto.tink.shaded.protobuf.h) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00aa, code lost:
    
        r6 = com.google.crypto.tink.shaded.protobuf.k.J(r8, (java.lang.String) r6);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int x(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r0.x(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void x0(java.lang.Object r18, com.google.crypto.tink.shaded.protobuf.q1 r19) {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r0.x0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.q1):void");
    }

    private int y(j1 j1Var, Object obj) {
        return j1Var.h(j1Var.g(obj));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0050. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void y0(java.lang.Object r13, com.google.crypto.tink.shaded.protobuf.q1 r14) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r0.y0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.q1):void");
    }

    private static int z(Object obj, long j6) {
        return n1.z(obj, j6);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0056. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:267:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void z0(java.lang.Object r11, com.google.crypto.tink.shaded.protobuf.q1 r12) {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r0.z0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.q1):void");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d1
    public void a(Object obj, Object obj2) {
        m(obj);
        obj2.getClass();
        for (int i6 = 0; i6 < this.f5626a.length; i6 += 3) {
            Q(obj, obj2, i6);
        }
        f1.F(this.f5640o, obj, obj2);
        if (this.f5631f) {
            f1.D(this.f5641p, obj, obj2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d1
    public final boolean b(Object obj) {
        int i6;
        int i7;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        while (i10 < this.f5636k) {
            int i11 = this.f5635j[i10];
            int W = W(i11);
            int w02 = w0(i11);
            int i12 = this.f5626a[i11 + 2];
            int i13 = i12 & 1048575;
            int i14 = 1 << (i12 >>> 20);
            if (i13 != i8) {
                if (i13 != 1048575) {
                    i9 = f5625s.getInt(obj, i13);
                }
                i7 = i9;
                i6 = i13;
            } else {
                i6 = i8;
                i7 = i9;
            }
            if (J(w02) && !C(obj, i11, i6, i7, i14)) {
                return false;
            }
            int v02 = v0(w02);
            if (v02 != 9 && v02 != 17) {
                if (v02 != 27) {
                    if (v02 == 60 || v02 == 68) {
                        if (I(obj, W, i11) && !D(obj, w02, u(i11))) {
                            return false;
                        }
                    } else if (v02 != 49) {
                        if (v02 == 50 && !F(obj, w02, i11)) {
                            return false;
                        }
                    }
                }
                if (!E(obj, w02, i11)) {
                    return false;
                }
            } else if (C(obj, i11, i6, i7, i14) && !D(obj, w02, u(i11))) {
                return false;
            }
            i10++;
            i8 = i6;
            i9 = i7;
        }
        return !this.f5631f || this.f5641p.c(obj).e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d1
    public boolean c(Object obj, Object obj2) {
        int length = this.f5626a.length;
        for (int i6 = 0; i6 < length; i6 += 3) {
            if (!p(obj, obj2, i6)) {
                return false;
            }
        }
        if (!this.f5640o.g(obj).equals(this.f5640o.g(obj2))) {
            return false;
        }
        if (this.f5631f) {
            return this.f5641p.c(obj).equals(this.f5641p.c(obj2));
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d1
    public void d(Object obj, byte[] bArr, int i6, int i7, e.a aVar) {
        if (this.f5633h) {
            g0(obj, bArr, i6, i7, aVar);
        } else {
            f0(obj, bArr, i6, i7, 0, aVar);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d1
    public void e(Object obj, q1 q1Var) {
        if (q1Var.n() == q1.a.DESCENDING) {
            z0(obj, q1Var);
        } else if (this.f5633h) {
            y0(obj, q1Var);
        } else {
            x0(obj, q1Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d1
    public int f(Object obj) {
        return this.f5633h ? x(obj) : w(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02c1, code lost:
    
        if (r0 != r11) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02c3, code lost:
    
        r15 = r27;
        r14 = r28;
        r12 = r29;
        r13 = r31;
        r11 = r32;
        r9 = r33;
        r5 = r17;
        r3 = r19;
        r6 = r20;
        r2 = r21;
        r1 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0328, code lost:
    
        r2 = r0;
        r8 = r19;
        r0 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0302, code lost:
    
        if (r0 != r15) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0325, code lost:
    
        if (r0 != r15) goto L101;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x008e. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int f0(java.lang.Object r28, byte[] r29, int r30, int r31, int r32, com.google.crypto.tink.shaded.protobuf.e.a r33) {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r0.f0(java.lang.Object, byte[], int, int, int, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d1
    public Object g() {
        return this.f5638m.a(this.f5630e);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d1
    public void h(Object obj, c1 c1Var, p pVar) {
        pVar.getClass();
        m(obj);
        M(this.f5640o, this.f5641p, obj, c1Var, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d1
    public void i(Object obj) {
        if (G(obj)) {
            if (obj instanceof x) {
                x xVar = (x) obj;
                xVar.n();
                xVar.m();
                xVar.F();
            }
            int length = this.f5626a.length;
            for (int i6 = 0; i6 < length; i6 += 3) {
                int w02 = w0(i6);
                long X = X(w02);
                int v02 = v0(w02);
                if (v02 != 9) {
                    switch (v02) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f5639n.c(obj, X);
                            break;
                        case 50:
                            Unsafe unsafe = f5625s;
                            Object object = unsafe.getObject(obj, X);
                            if (object != null) {
                                unsafe.putObject(obj, X, this.f5642q.g(object));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                if (B(obj, i6)) {
                    u(i6).i(f5625s.getObject(obj, X));
                }
            }
            this.f5640o.j(obj);
            if (this.f5631f) {
                this.f5641p.f(obj);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00cc, code lost:
    
        if (r3 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e4, code lost:
    
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e0, code lost:
    
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00de, code lost:
    
        if (r3 != null) goto L68;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0019. Please report as an issue. */
    @Override // com.google.crypto.tink.shaded.protobuf.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int j(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r0.j(java.lang.Object):int");
    }
}
