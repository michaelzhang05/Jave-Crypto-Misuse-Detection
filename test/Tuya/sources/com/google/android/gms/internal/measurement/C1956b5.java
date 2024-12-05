package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.b5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1956b5 implements InterfaceC2026j5 {

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f15649p = new int[0];

    /* renamed from: q, reason: collision with root package name */
    private static final Unsafe f15650q = AbstractC2153z5.l();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f15651a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f15652b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15653c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15654d;

    /* renamed from: e, reason: collision with root package name */
    private final Y4 f15655e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f15656f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f15657g;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f15658h;

    /* renamed from: i, reason: collision with root package name */
    private final int f15659i;

    /* renamed from: j, reason: collision with root package name */
    private final int f15660j;

    /* renamed from: k, reason: collision with root package name */
    private final M4 f15661k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC2074p5 f15662l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC2033k4 f15663m;

    /* renamed from: n, reason: collision with root package name */
    private final C1974d5 f15664n;

    /* renamed from: o, reason: collision with root package name */
    private final T4 f15665o;

    private C1956b5(int[] iArr, Object[] objArr, int i8, int i9, Y4 y42, boolean z8, boolean z9, int[] iArr2, int i10, int i11, C1974d5 c1974d5, M4 m42, AbstractC2074p5 abstractC2074p5, AbstractC2033k4 abstractC2033k4, T4 t42) {
        this.f15651a = iArr;
        this.f15652b = objArr;
        this.f15653c = i8;
        this.f15654d = i9;
        this.f15657g = z8;
        boolean z10 = false;
        if (abstractC2033k4 != null && abstractC2033k4.c(y42)) {
            z10 = true;
        }
        this.f15656f = z10;
        this.f15658h = iArr2;
        this.f15659i = i10;
        this.f15660j = i11;
        this.f15664n = c1974d5;
        this.f15661k = m42;
        this.f15662l = abstractC2074p5;
        this.f15663m = abstractC2033k4;
        this.f15655e = y42;
        this.f15665o = t42;
    }

    private static boolean A(Object obj, int i8, InterfaceC2026j5 interfaceC2026j5) {
        return interfaceC2026j5.c(AbstractC2153z5.k(obj, i8 & 1048575));
    }

    private static boolean B(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2112u4) {
            return ((AbstractC2112u4) obj).y();
        }
        return true;
    }

    private final boolean C(Object obj, int i8, int i9) {
        if (AbstractC2153z5.h(obj, R(i9) & 1048575) == i8) {
            return true;
        }
        return false;
    }

    private static boolean D(Object obj, long j8) {
        return ((Boolean) AbstractC2153z5.k(obj, j8)).booleanValue();
    }

    private static final void E(int i8, Object obj, G5 g52) {
        if (obj instanceof String) {
            g52.h(i8, (String) obj);
        } else {
            g52.A(i8, (X3) obj);
        }
    }

    static C2082q5 G(Object obj) {
        AbstractC2112u4 abstractC2112u4 = (AbstractC2112u4) obj;
        C2082q5 c2082q5 = abstractC2112u4.zzc;
        if (c2082q5 == C2082q5.c()) {
            C2082q5 f8 = C2082q5.f();
            abstractC2112u4.zzc = f8;
            return f8;
        }
        return c2082q5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.measurement.C1956b5 H(java.lang.Class r32, com.google.android.gms.internal.measurement.V4 r33, com.google.android.gms.internal.measurement.C1974d5 r34, com.google.android.gms.internal.measurement.M4 r35, com.google.android.gms.internal.measurement.AbstractC2074p5 r36, com.google.android.gms.internal.measurement.AbstractC2033k4 r37, com.google.android.gms.internal.measurement.T4 r38) {
        /*
            Method dump skipped, instructions count: 1014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1956b5.H(java.lang.Class, com.google.android.gms.internal.measurement.V4, com.google.android.gms.internal.measurement.d5, com.google.android.gms.internal.measurement.M4, com.google.android.gms.internal.measurement.p5, com.google.android.gms.internal.measurement.k4, com.google.android.gms.internal.measurement.T4):com.google.android.gms.internal.measurement.b5");
    }

    private static double I(Object obj, long j8) {
        return ((Double) AbstractC2153z5.k(obj, j8)).doubleValue();
    }

    private static float J(Object obj, long j8) {
        return ((Float) AbstractC2153z5.k(obj, j8)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x003c. Please report as an issue. */
    private final int K(Object obj) {
        int i8;
        int y8;
        int y9;
        int z8;
        int y10;
        int y11;
        int y12;
        int y13;
        int P8;
        int D8;
        int y14;
        int y15;
        int i9;
        int y16;
        int y17;
        int y18;
        int y19;
        Unsafe unsafe = f15650q;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        int i14 = 0;
        while (i11 < this.f15651a.length) {
            int U7 = U(i11);
            int[] iArr = this.f15651a;
            int i15 = iArr[i11];
            int T7 = T(U7);
            if (T7 <= 17) {
                int i16 = iArr[i11 + 2];
                int i17 = i16 & i10;
                int i18 = i16 >>> 20;
                if (i17 != i13) {
                    i14 = unsafe.getInt(obj, i17);
                    i13 = i17;
                }
                i8 = 1 << i18;
            } else {
                i8 = 0;
            }
            long j8 = U7 & i10;
            switch (T7) {
                case 0:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        y8 = AbstractC1991f4.y(i15 << 3);
                        y11 = y8 + 8;
                        i12 += y11;
                        break;
                    }
                case 1:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        y9 = AbstractC1991f4.y(i15 << 3);
                        y11 = y9 + 4;
                        i12 += y11;
                        break;
                    }
                case 2:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        z8 = AbstractC1991f4.z(unsafe.getLong(obj, j8));
                        y10 = AbstractC1991f4.y(i15 << 3);
                        i12 += y10 + z8;
                        break;
                    }
                case 3:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        z8 = AbstractC1991f4.z(unsafe.getLong(obj, j8));
                        y10 = AbstractC1991f4.y(i15 << 3);
                        i12 += y10 + z8;
                        break;
                    }
                case 4:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        z8 = AbstractC1991f4.v(unsafe.getInt(obj, j8));
                        y10 = AbstractC1991f4.y(i15 << 3);
                        i12 += y10 + z8;
                        break;
                    }
                case 5:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        y8 = AbstractC1991f4.y(i15 << 3);
                        y11 = y8 + 8;
                        i12 += y11;
                        break;
                    }
                case 6:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        y9 = AbstractC1991f4.y(i15 << 3);
                        y11 = y9 + 4;
                        i12 += y11;
                        break;
                    }
                case 7:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        y11 = AbstractC1991f4.y(i15 << 3) + 1;
                        i12 += y11;
                        break;
                    }
                case 8:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j8);
                        if (object instanceof X3) {
                            int i19 = AbstractC1991f4.f15702d;
                            int g8 = ((X3) object).g();
                            y12 = AbstractC1991f4.y(g8) + g8;
                            y13 = AbstractC1991f4.y(i15 << 3);
                            y11 = y13 + y12;
                            i12 += y11;
                            break;
                        } else {
                            z8 = AbstractC1991f4.x((String) object);
                            y10 = AbstractC1991f4.y(i15 << 3);
                            i12 += y10 + z8;
                            break;
                        }
                    }
                case 9:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        y11 = AbstractC2042l5.J(i15, unsafe.getObject(obj, j8), k(i11));
                        i12 += y11;
                        break;
                    }
                case 10:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        X3 x32 = (X3) unsafe.getObject(obj, j8);
                        int i20 = AbstractC1991f4.f15702d;
                        int g9 = x32.g();
                        y12 = AbstractC1991f4.y(g9) + g9;
                        y13 = AbstractC1991f4.y(i15 << 3);
                        y11 = y13 + y12;
                        i12 += y11;
                        break;
                    }
                case 11:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        z8 = AbstractC1991f4.y(unsafe.getInt(obj, j8));
                        y10 = AbstractC1991f4.y(i15 << 3);
                        i12 += y10 + z8;
                        break;
                    }
                case 12:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        z8 = AbstractC1991f4.v(unsafe.getInt(obj, j8));
                        y10 = AbstractC1991f4.y(i15 << 3);
                        i12 += y10 + z8;
                        break;
                    }
                case 13:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        y9 = AbstractC1991f4.y(i15 << 3);
                        y11 = y9 + 4;
                        i12 += y11;
                        break;
                    }
                case 14:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        y8 = AbstractC1991f4.y(i15 << 3);
                        y11 = y8 + 8;
                        i12 += y11;
                        break;
                    }
                case 15:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        int i21 = unsafe.getInt(obj, j8);
                        y10 = AbstractC1991f4.y(i15 << 3);
                        z8 = AbstractC1991f4.y((i21 >> 31) ^ (i21 + i21));
                        i12 += y10 + z8;
                        break;
                    }
                case 16:
                    if ((i8 & i14) == 0) {
                        break;
                    } else {
                        long j9 = unsafe.getLong(obj, j8);
                        i12 += AbstractC1991f4.y(i15 << 3) + AbstractC1991f4.z((j9 >> 63) ^ (j9 + j9));
                        break;
                    }
                case 17:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        y11 = AbstractC1991f4.u(i15, (Y4) unsafe.getObject(obj, j8), k(i11));
                        i12 += y11;
                        break;
                    }
                case 18:
                    y11 = AbstractC2042l5.C(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += y11;
                    break;
                case 19:
                    y11 = AbstractC2042l5.A(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += y11;
                    break;
                case 20:
                    y11 = AbstractC2042l5.H(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += y11;
                    break;
                case 21:
                    y11 = AbstractC2042l5.S(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += y11;
                    break;
                case 22:
                    y11 = AbstractC2042l5.F(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += y11;
                    break;
                case 23:
                    y11 = AbstractC2042l5.C(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += y11;
                    break;
                case 24:
                    y11 = AbstractC2042l5.A(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += y11;
                    break;
                case 25:
                    y11 = AbstractC2042l5.w(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += y11;
                    break;
                case 26:
                    P8 = AbstractC2042l5.P(i15, (List) unsafe.getObject(obj, j8));
                    i12 += P8;
                    break;
                case 27:
                    P8 = AbstractC2042l5.K(i15, (List) unsafe.getObject(obj, j8), k(i11));
                    i12 += P8;
                    break;
                case 28:
                    P8 = AbstractC2042l5.x(i15, (List) unsafe.getObject(obj, j8));
                    i12 += P8;
                    break;
                case 29:
                    P8 = AbstractC2042l5.Q(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += P8;
                    break;
                case 30:
                    P8 = AbstractC2042l5.y(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += P8;
                    break;
                case 31:
                    P8 = AbstractC2042l5.A(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += P8;
                    break;
                case 32:
                    P8 = AbstractC2042l5.C(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += P8;
                    break;
                case 33:
                    P8 = AbstractC2042l5.L(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += P8;
                    break;
                case 34:
                    P8 = AbstractC2042l5.N(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += P8;
                    break;
                case 35:
                    D8 = AbstractC2042l5.D((List) unsafe.getObject(obj, j8));
                    if (D8 > 0) {
                        y14 = AbstractC1991f4.y(D8);
                        y15 = AbstractC1991f4.y(i15 << 3);
                        i9 = y15 + y14;
                        i12 += i9 + D8;
                    }
                    break;
                case 36:
                    D8 = AbstractC2042l5.B((List) unsafe.getObject(obj, j8));
                    if (D8 > 0) {
                        y14 = AbstractC1991f4.y(D8);
                        y15 = AbstractC1991f4.y(i15 << 3);
                        i9 = y15 + y14;
                        i12 += i9 + D8;
                    }
                    break;
                case 37:
                    D8 = AbstractC2042l5.I((List) unsafe.getObject(obj, j8));
                    if (D8 > 0) {
                        y14 = AbstractC1991f4.y(D8);
                        y15 = AbstractC1991f4.y(i15 << 3);
                        i9 = y15 + y14;
                        i12 += i9 + D8;
                    }
                    break;
                case 38:
                    D8 = AbstractC2042l5.T((List) unsafe.getObject(obj, j8));
                    if (D8 > 0) {
                        y14 = AbstractC1991f4.y(D8);
                        y15 = AbstractC1991f4.y(i15 << 3);
                        i9 = y15 + y14;
                        i12 += i9 + D8;
                    }
                    break;
                case 39:
                    D8 = AbstractC2042l5.G((List) unsafe.getObject(obj, j8));
                    if (D8 > 0) {
                        y14 = AbstractC1991f4.y(D8);
                        y15 = AbstractC1991f4.y(i15 << 3);
                        i9 = y15 + y14;
                        i12 += i9 + D8;
                    }
                    break;
                case 40:
                    D8 = AbstractC2042l5.D((List) unsafe.getObject(obj, j8));
                    if (D8 > 0) {
                        y14 = AbstractC1991f4.y(D8);
                        y15 = AbstractC1991f4.y(i15 << 3);
                        i9 = y15 + y14;
                        i12 += i9 + D8;
                    }
                    break;
                case 41:
                    D8 = AbstractC2042l5.B((List) unsafe.getObject(obj, j8));
                    if (D8 > 0) {
                        y14 = AbstractC1991f4.y(D8);
                        y15 = AbstractC1991f4.y(i15 << 3);
                        i9 = y15 + y14;
                        i12 += i9 + D8;
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j8);
                    int i22 = AbstractC2042l5.f15760d;
                    D8 = list.size();
                    if (D8 > 0) {
                        y14 = AbstractC1991f4.y(D8);
                        y15 = AbstractC1991f4.y(i15 << 3);
                        i9 = y15 + y14;
                        i12 += i9 + D8;
                    }
                    break;
                case 43:
                    D8 = AbstractC2042l5.R((List) unsafe.getObject(obj, j8));
                    if (D8 > 0) {
                        y14 = AbstractC1991f4.y(D8);
                        y15 = AbstractC1991f4.y(i15 << 3);
                        i9 = y15 + y14;
                        i12 += i9 + D8;
                    }
                    break;
                case 44:
                    D8 = AbstractC2042l5.z((List) unsafe.getObject(obj, j8));
                    if (D8 > 0) {
                        y14 = AbstractC1991f4.y(D8);
                        y15 = AbstractC1991f4.y(i15 << 3);
                        i9 = y15 + y14;
                        i12 += i9 + D8;
                    }
                    break;
                case 45:
                    D8 = AbstractC2042l5.B((List) unsafe.getObject(obj, j8));
                    if (D8 > 0) {
                        y14 = AbstractC1991f4.y(D8);
                        y15 = AbstractC1991f4.y(i15 << 3);
                        i9 = y15 + y14;
                        i12 += i9 + D8;
                    }
                    break;
                case 46:
                    D8 = AbstractC2042l5.D((List) unsafe.getObject(obj, j8));
                    if (D8 > 0) {
                        y14 = AbstractC1991f4.y(D8);
                        y15 = AbstractC1991f4.y(i15 << 3);
                        i9 = y15 + y14;
                        i12 += i9 + D8;
                    }
                    break;
                case 47:
                    D8 = AbstractC2042l5.M((List) unsafe.getObject(obj, j8));
                    if (D8 > 0) {
                        y14 = AbstractC1991f4.y(D8);
                        y15 = AbstractC1991f4.y(i15 << 3);
                        i9 = y15 + y14;
                        i12 += i9 + D8;
                    }
                    break;
                case 48:
                    D8 = AbstractC2042l5.O((List) unsafe.getObject(obj, j8));
                    if (D8 > 0) {
                        y14 = AbstractC1991f4.y(D8);
                        y15 = AbstractC1991f4.y(i15 << 3);
                        i9 = y15 + y14;
                        i12 += i9 + D8;
                    }
                    break;
                case 49:
                    P8 = AbstractC2042l5.E(i15, (List) unsafe.getObject(obj, j8), k(i11));
                    i12 += P8;
                    break;
                case 50:
                    T4.a(i15, unsafe.getObject(obj, j8), l(i11));
                    break;
                case 51:
                    if (C(obj, i15, i11)) {
                        y16 = AbstractC1991f4.y(i15 << 3);
                        P8 = y16 + 8;
                        i12 += P8;
                    }
                    break;
                case 52:
                    if (C(obj, i15, i11)) {
                        y17 = AbstractC1991f4.y(i15 << 3);
                        P8 = y17 + 4;
                        i12 += P8;
                    }
                    break;
                case 53:
                    if (C(obj, i15, i11)) {
                        D8 = AbstractC1991f4.z(V(obj, j8));
                        i9 = AbstractC1991f4.y(i15 << 3);
                        i12 += i9 + D8;
                    }
                    break;
                case 54:
                    if (C(obj, i15, i11)) {
                        D8 = AbstractC1991f4.z(V(obj, j8));
                        i9 = AbstractC1991f4.y(i15 << 3);
                        i12 += i9 + D8;
                    }
                    break;
                case 55:
                    if (C(obj, i15, i11)) {
                        D8 = AbstractC1991f4.v(L(obj, j8));
                        i9 = AbstractC1991f4.y(i15 << 3);
                        i12 += i9 + D8;
                    }
                    break;
                case 56:
                    if (C(obj, i15, i11)) {
                        y16 = AbstractC1991f4.y(i15 << 3);
                        P8 = y16 + 8;
                        i12 += P8;
                    }
                    break;
                case 57:
                    if (C(obj, i15, i11)) {
                        y17 = AbstractC1991f4.y(i15 << 3);
                        P8 = y17 + 4;
                        i12 += P8;
                    }
                    break;
                case 58:
                    if (C(obj, i15, i11)) {
                        P8 = AbstractC1991f4.y(i15 << 3) + 1;
                        i12 += P8;
                    }
                    break;
                case 59:
                    if (C(obj, i15, i11)) {
                        Object object2 = unsafe.getObject(obj, j8);
                        if (object2 instanceof X3) {
                            int i23 = AbstractC1991f4.f15702d;
                            int g10 = ((X3) object2).g();
                            y18 = AbstractC1991f4.y(g10) + g10;
                            y19 = AbstractC1991f4.y(i15 << 3);
                            P8 = y19 + y18;
                            i12 += P8;
                        } else {
                            D8 = AbstractC1991f4.x((String) object2);
                            i9 = AbstractC1991f4.y(i15 << 3);
                            i12 += i9 + D8;
                        }
                    }
                    break;
                case 60:
                    if (C(obj, i15, i11)) {
                        P8 = AbstractC2042l5.J(i15, unsafe.getObject(obj, j8), k(i11));
                        i12 += P8;
                    }
                    break;
                case 61:
                    if (C(obj, i15, i11)) {
                        X3 x33 = (X3) unsafe.getObject(obj, j8);
                        int i24 = AbstractC1991f4.f15702d;
                        int g11 = x33.g();
                        y18 = AbstractC1991f4.y(g11) + g11;
                        y19 = AbstractC1991f4.y(i15 << 3);
                        P8 = y19 + y18;
                        i12 += P8;
                    }
                    break;
                case 62:
                    if (C(obj, i15, i11)) {
                        D8 = AbstractC1991f4.y(L(obj, j8));
                        i9 = AbstractC1991f4.y(i15 << 3);
                        i12 += i9 + D8;
                    }
                    break;
                case 63:
                    if (C(obj, i15, i11)) {
                        D8 = AbstractC1991f4.v(L(obj, j8));
                        i9 = AbstractC1991f4.y(i15 << 3);
                        i12 += i9 + D8;
                    }
                    break;
                case 64:
                    if (C(obj, i15, i11)) {
                        y17 = AbstractC1991f4.y(i15 << 3);
                        P8 = y17 + 4;
                        i12 += P8;
                    }
                    break;
                case 65:
                    if (C(obj, i15, i11)) {
                        y16 = AbstractC1991f4.y(i15 << 3);
                        P8 = y16 + 8;
                        i12 += P8;
                    }
                    break;
                case 66:
                    if (C(obj, i15, i11)) {
                        int L8 = L(obj, j8);
                        i9 = AbstractC1991f4.y(i15 << 3);
                        D8 = AbstractC1991f4.y((L8 >> 31) ^ (L8 + L8));
                        i12 += i9 + D8;
                    }
                    break;
                case 67:
                    if (C(obj, i15, i11)) {
                        long V7 = V(obj, j8);
                        i12 += AbstractC1991f4.y(i15 << 3) + AbstractC1991f4.z((V7 >> 63) ^ (V7 + V7));
                    }
                    break;
                case 68:
                    if (C(obj, i15, i11)) {
                        P8 = AbstractC1991f4.u(i15, (Y4) unsafe.getObject(obj, j8), k(i11));
                        i12 += P8;
                    }
                    break;
            }
            i11 += 3;
            i10 = 1048575;
        }
        AbstractC2074p5 abstractC2074p5 = this.f15662l;
        int a8 = i12 + abstractC2074p5.a(abstractC2074p5.d(obj));
        if (!this.f15656f) {
            return a8;
        }
        this.f15663m.a(obj);
        throw null;
    }

    private static int L(Object obj, long j8) {
        return ((Integer) AbstractC2153z5.k(obj, j8)).intValue();
    }

    private final int M(Object obj, byte[] bArr, int i8, int i9, int i10, long j8, K3 k32) {
        Unsafe unsafe = f15650q;
        Object l8 = l(i10);
        Object object = unsafe.getObject(obj, j8);
        if (!((S4) object).f()) {
            S4 b8 = S4.a().b();
            T4.b(b8, object);
            unsafe.putObject(obj, j8, b8);
        }
        android.support.v4.media.a.a(l8);
        throw null;
    }

    private final int N(Object obj, byte[] bArr, int i8, int i9, int i10, int i11, int i12, int i13, int i14, long j8, int i15, K3 k32) {
        Unsafe unsafe = f15650q;
        long j9 = this.f15651a[i15 + 2] & 1048575;
        switch (i14) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(obj, j8, Double.valueOf(Double.longBitsToDouble(L3.p(bArr, i8))));
                    int i16 = i8 + 8;
                    unsafe.putInt(obj, j9, i11);
                    return i16;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(obj, j8, Float.valueOf(Float.intBitsToFloat(L3.b(bArr, i8))));
                    int i17 = i8 + 4;
                    unsafe.putInt(obj, j9, i11);
                    return i17;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int m8 = L3.m(bArr, i8, k32);
                    unsafe.putObject(obj, j8, Long.valueOf(k32.f15372b));
                    unsafe.putInt(obj, j9, i11);
                    return m8;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int j10 = L3.j(bArr, i8, k32);
                    unsafe.putObject(obj, j8, Integer.valueOf(k32.f15371a));
                    unsafe.putInt(obj, j9, i11);
                    return j10;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(obj, j8, Long.valueOf(L3.p(bArr, i8)));
                    int i18 = i8 + 8;
                    unsafe.putInt(obj, j9, i11);
                    return i18;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(obj, j8, Integer.valueOf(L3.b(bArr, i8)));
                    int i19 = i8 + 4;
                    unsafe.putInt(obj, j9, i11);
                    return i19;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int m9 = L3.m(bArr, i8, k32);
                    unsafe.putObject(obj, j8, Boolean.valueOf(k32.f15372b != 0));
                    unsafe.putInt(obj, j9, i11);
                    return m9;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int j11 = L3.j(bArr, i8, k32);
                    int i20 = k32.f15371a;
                    if (i20 == 0) {
                        unsafe.putObject(obj, j8, "");
                    } else {
                        if ((i13 & 536870912) != 0 && !E5.e(bArr, j11, j11 + i20)) {
                            throw D4.c();
                        }
                        unsafe.putObject(obj, j8, new String(bArr, j11, i20, B4.f15270b));
                        j11 += i20;
                    }
                    unsafe.putInt(obj, j9, i11);
                    return j11;
                }
                break;
            case 60:
                if (i12 == 2) {
                    Object n8 = n(obj, i11, i15);
                    int o8 = L3.o(n8, k(i15), bArr, i8, i9, k32);
                    v(obj, i11, i15, n8);
                    return o8;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int a8 = L3.a(bArr, i8, k32);
                    unsafe.putObject(obj, j8, k32.f15373c);
                    unsafe.putInt(obj, j9, i11);
                    return a8;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int j12 = L3.j(bArr, i8, k32);
                    int i21 = k32.f15371a;
                    InterfaceC2136x4 j13 = j(i15);
                    if (j13 != null && !j13.j(i21)) {
                        G(obj).j(i10, Long.valueOf(i21));
                    } else {
                        unsafe.putObject(obj, j8, Integer.valueOf(i21));
                        unsafe.putInt(obj, j9, i11);
                    }
                    return j12;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int j14 = L3.j(bArr, i8, k32);
                    unsafe.putObject(obj, j8, Integer.valueOf(AbstractC1955b4.a(k32.f15371a)));
                    unsafe.putInt(obj, j9, i11);
                    return j14;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int m10 = L3.m(bArr, i8, k32);
                    unsafe.putObject(obj, j8, Long.valueOf(AbstractC1955b4.b(k32.f15372b)));
                    unsafe.putInt(obj, j9, i11);
                    return m10;
                }
                break;
            case 68:
                if (i12 == 3) {
                    Object n9 = n(obj, i11, i15);
                    int n10 = L3.n(n9, k(i15), bArr, i8, i9, (i10 & (-8)) | 4, k32);
                    v(obj, i11, i15, n9);
                    return n10;
                }
                break;
        }
        return i8;
    }

    private final int O(Object obj, byte[] bArr, int i8, int i9, int i10, int i11, int i12, int i13, long j8, int i14, long j9, K3 k32) {
        int i15;
        int i16;
        int l8;
        int i17 = i8;
        Unsafe unsafe = f15650q;
        A4 a42 = (A4) unsafe.getObject(obj, j9);
        if (!a42.c()) {
            int size = a42.size();
            a42 = a42.k(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j9, a42);
        }
        Object obj2 = null;
        switch (i14) {
            case 18:
            case 35:
                if (i12 == 2) {
                    android.support.v4.media.a.a(a42);
                    int j10 = L3.j(bArr, i17, k32);
                    int i18 = k32.f15371a + j10;
                    if (j10 < i18) {
                        Double.longBitsToDouble(L3.p(bArr, j10));
                        throw null;
                    }
                    if (j10 == i18) {
                        return j10;
                    }
                    throw D4.f();
                }
                if (i12 == 1) {
                    android.support.v4.media.a.a(a42);
                    Double.longBitsToDouble(L3.p(bArr, i8));
                    throw null;
                }
                break;
            case 19:
            case 36:
                if (i12 == 2) {
                    android.support.v4.media.a.a(a42);
                    int j11 = L3.j(bArr, i17, k32);
                    int i19 = k32.f15371a + j11;
                    if (j11 < i19) {
                        Float.intBitsToFloat(L3.b(bArr, j11));
                        throw null;
                    }
                    if (j11 == i19) {
                        return j11;
                    }
                    throw D4.f();
                }
                if (i12 == 5) {
                    android.support.v4.media.a.a(a42);
                    Float.intBitsToFloat(L3.b(bArr, i8));
                    throw null;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i12 == 2) {
                    N4 n42 = (N4) a42;
                    int j12 = L3.j(bArr, i17, k32);
                    int i20 = k32.f15371a + j12;
                    while (j12 < i20) {
                        j12 = L3.m(bArr, j12, k32);
                        n42.g(k32.f15372b);
                    }
                    if (j12 == i20) {
                        return j12;
                    }
                    throw D4.f();
                }
                if (i12 == 0) {
                    N4 n43 = (N4) a42;
                    int m8 = L3.m(bArr, i17, k32);
                    n43.g(k32.f15372b);
                    while (m8 < i9) {
                        int j13 = L3.j(bArr, m8, k32);
                        if (i10 != k32.f15371a) {
                            return m8;
                        }
                        m8 = L3.m(bArr, j13, k32);
                        n43.g(k32.f15372b);
                    }
                    return m8;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i12 == 2) {
                    return L3.f(bArr, i17, a42, k32);
                }
                if (i12 == 0) {
                    return L3.l(i10, bArr, i8, i9, a42, k32);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i12 == 2) {
                    N4 n44 = (N4) a42;
                    int j14 = L3.j(bArr, i17, k32);
                    int i21 = k32.f15371a + j14;
                    while (j14 < i21) {
                        n44.g(L3.p(bArr, j14));
                        j14 += 8;
                    }
                    if (j14 == i21) {
                        return j14;
                    }
                    throw D4.f();
                }
                if (i12 == 1) {
                    N4 n45 = (N4) a42;
                    n45.g(L3.p(bArr, i8));
                    while (true) {
                        i15 = i17 + 8;
                        if (i15 < i9) {
                            i17 = L3.j(bArr, i15, k32);
                            if (i10 == k32.f15371a) {
                                n45.g(L3.p(bArr, i17));
                            }
                        }
                    }
                    return i15;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i12 == 2) {
                    C2120v4 c2120v4 = (C2120v4) a42;
                    int j15 = L3.j(bArr, i17, k32);
                    int i22 = k32.f15371a + j15;
                    while (j15 < i22) {
                        c2120v4.h(L3.b(bArr, j15));
                        j15 += 4;
                    }
                    if (j15 == i22) {
                        return j15;
                    }
                    throw D4.f();
                }
                if (i12 == 5) {
                    C2120v4 c2120v42 = (C2120v4) a42;
                    c2120v42.h(L3.b(bArr, i8));
                    while (true) {
                        i16 = i17 + 4;
                        if (i16 < i9) {
                            i17 = L3.j(bArr, i16, k32);
                            if (i10 == k32.f15371a) {
                                c2120v42.h(L3.b(bArr, i17));
                            }
                        }
                    }
                    return i16;
                }
                break;
            case 25:
            case 42:
                if (i12 == 2) {
                    android.support.v4.media.a.a(a42);
                    int j16 = L3.j(bArr, i17, k32);
                    int i23 = k32.f15371a + j16;
                    if (j16 < i23) {
                        L3.m(bArr, j16, k32);
                        throw null;
                    }
                    if (j16 == i23) {
                        return j16;
                    }
                    throw D4.f();
                }
                if (i12 == 0) {
                    android.support.v4.media.a.a(a42);
                    L3.m(bArr, i17, k32);
                    long j17 = k32.f15372b;
                    throw null;
                }
                break;
            case 26:
                if (i12 == 2) {
                    if ((j8 & 536870912) == 0) {
                        i17 = L3.j(bArr, i17, k32);
                        int i24 = k32.f15371a;
                        if (i24 < 0) {
                            throw D4.d();
                        }
                        if (i24 == 0) {
                            a42.add("");
                        } else {
                            a42.add(new String(bArr, i17, i24, B4.f15270b));
                            i17 += i24;
                        }
                        while (i17 < i9) {
                            int j18 = L3.j(bArr, i17, k32);
                            if (i10 != k32.f15371a) {
                                break;
                            } else {
                                i17 = L3.j(bArr, j18, k32);
                                int i25 = k32.f15371a;
                                if (i25 < 0) {
                                    throw D4.d();
                                }
                                if (i25 == 0) {
                                    a42.add("");
                                } else {
                                    a42.add(new String(bArr, i17, i25, B4.f15270b));
                                    i17 += i25;
                                }
                            }
                        }
                        break;
                    } else {
                        i17 = L3.j(bArr, i17, k32);
                        int i26 = k32.f15371a;
                        if (i26 < 0) {
                            throw D4.d();
                        }
                        if (i26 == 0) {
                            a42.add("");
                        } else {
                            int i27 = i17 + i26;
                            if (E5.e(bArr, i17, i27)) {
                                a42.add(new String(bArr, i17, i26, B4.f15270b));
                                i17 = i27;
                            } else {
                                throw D4.c();
                            }
                        }
                        while (i17 < i9) {
                            int j19 = L3.j(bArr, i17, k32);
                            if (i10 != k32.f15371a) {
                                break;
                            } else {
                                i17 = L3.j(bArr, j19, k32);
                                int i28 = k32.f15371a;
                                if (i28 < 0) {
                                    throw D4.d();
                                }
                                if (i28 == 0) {
                                    a42.add("");
                                } else {
                                    int i29 = i17 + i28;
                                    if (E5.e(bArr, i17, i29)) {
                                        a42.add(new String(bArr, i17, i28, B4.f15270b));
                                        i17 = i29;
                                    } else {
                                        throw D4.c();
                                    }
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 27:
                if (i12 == 2) {
                    return L3.e(k(i13), i10, bArr, i8, i9, a42, k32);
                }
                break;
            case 28:
                if (i12 == 2) {
                    int j20 = L3.j(bArr, i17, k32);
                    int i30 = k32.f15371a;
                    if (i30 >= 0) {
                        if (i30 > bArr.length - j20) {
                            throw D4.f();
                        }
                        if (i30 == 0) {
                            a42.add(X3.f15622b);
                        } else {
                            a42.add(X3.u(bArr, j20, i30));
                            j20 += i30;
                        }
                        while (j20 < i9) {
                            int j21 = L3.j(bArr, j20, k32);
                            if (i10 != k32.f15371a) {
                                return j20;
                            }
                            j20 = L3.j(bArr, j21, k32);
                            int i31 = k32.f15371a;
                            if (i31 >= 0) {
                                if (i31 > bArr.length - j20) {
                                    throw D4.f();
                                }
                                if (i31 == 0) {
                                    a42.add(X3.f15622b);
                                } else {
                                    a42.add(X3.u(bArr, j20, i31));
                                    j20 += i31;
                                }
                            } else {
                                throw D4.d();
                            }
                        }
                        return j20;
                    }
                    throw D4.d();
                }
                break;
            case 30:
            case 44:
                if (i12 == 2) {
                    l8 = L3.f(bArr, i17, a42, k32);
                } else if (i12 == 0) {
                    l8 = L3.l(i10, bArr, i8, i9, a42, k32);
                }
                InterfaceC2136x4 j22 = j(i13);
                AbstractC2074p5 abstractC2074p5 = this.f15662l;
                int i32 = AbstractC2042l5.f15760d;
                if (j22 != null) {
                    if (a42 instanceof RandomAccess) {
                        int size2 = a42.size();
                        int i33 = 0;
                        for (int i34 = 0; i34 < size2; i34++) {
                            Integer num = (Integer) a42.get(i34);
                            int intValue = num.intValue();
                            if (j22.j(intValue)) {
                                if (i34 != i33) {
                                    a42.set(i33, num);
                                }
                                i33++;
                            } else {
                                obj2 = AbstractC2042l5.a(obj, i11, intValue, obj2, abstractC2074p5);
                            }
                        }
                        if (i33 != size2) {
                            a42.subList(i33, size2).clear();
                            return l8;
                        }
                    } else {
                        Iterator it = a42.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (!j22.j(intValue2)) {
                                obj2 = AbstractC2042l5.a(obj, i11, intValue2, obj2, abstractC2074p5);
                                it.remove();
                            }
                        }
                    }
                }
                return l8;
            case 33:
            case 47:
                if (i12 == 2) {
                    C2120v4 c2120v43 = (C2120v4) a42;
                    int j23 = L3.j(bArr, i17, k32);
                    int i35 = k32.f15371a + j23;
                    while (j23 < i35) {
                        j23 = L3.j(bArr, j23, k32);
                        c2120v43.h(AbstractC1955b4.a(k32.f15371a));
                    }
                    if (j23 == i35) {
                        return j23;
                    }
                    throw D4.f();
                }
                if (i12 == 0) {
                    C2120v4 c2120v44 = (C2120v4) a42;
                    int j24 = L3.j(bArr, i17, k32);
                    c2120v44.h(AbstractC1955b4.a(k32.f15371a));
                    while (j24 < i9) {
                        int j25 = L3.j(bArr, j24, k32);
                        if (i10 != k32.f15371a) {
                            return j24;
                        }
                        j24 = L3.j(bArr, j25, k32);
                        c2120v44.h(AbstractC1955b4.a(k32.f15371a));
                    }
                    return j24;
                }
                break;
            case 34:
            case 48:
                if (i12 == 2) {
                    N4 n46 = (N4) a42;
                    int j26 = L3.j(bArr, i17, k32);
                    int i36 = k32.f15371a + j26;
                    while (j26 < i36) {
                        j26 = L3.m(bArr, j26, k32);
                        n46.g(AbstractC1955b4.b(k32.f15372b));
                    }
                    if (j26 == i36) {
                        return j26;
                    }
                    throw D4.f();
                }
                if (i12 == 0) {
                    N4 n47 = (N4) a42;
                    int m9 = L3.m(bArr, i17, k32);
                    n47.g(AbstractC1955b4.b(k32.f15372b));
                    while (m9 < i9) {
                        int j27 = L3.j(bArr, m9, k32);
                        if (i10 != k32.f15371a) {
                            return m9;
                        }
                        m9 = L3.m(bArr, j27, k32);
                        n47.g(AbstractC1955b4.b(k32.f15372b));
                    }
                    return m9;
                }
                break;
            default:
                if (i12 == 3) {
                    InterfaceC2026j5 k8 = k(i13);
                    int i37 = (i10 & (-8)) | 4;
                    int c8 = L3.c(k8, bArr, i8, i9, i37, k32);
                    a42.add(k32.f15373c);
                    while (c8 < i9) {
                        int j28 = L3.j(bArr, c8, k32);
                        if (i10 != k32.f15371a) {
                            return c8;
                        }
                        c8 = L3.c(k8, bArr, j28, i9, i37, k32);
                        a42.add(k32.f15373c);
                    }
                    return c8;
                }
                break;
        }
        return i17;
    }

    private final int P(int i8) {
        if (i8 >= this.f15653c && i8 <= this.f15654d) {
            return S(i8, 0);
        }
        return -1;
    }

    private final int Q(int i8, int i9) {
        if (i8 >= this.f15653c && i8 <= this.f15654d) {
            return S(i8, i9);
        }
        return -1;
    }

    private final int R(int i8) {
        return this.f15651a[i8 + 2];
    }

    private final int S(int i8, int i9) {
        int length = (this.f15651a.length / 3) - 1;
        while (i9 <= length) {
            int i10 = (length + i9) >>> 1;
            int i11 = i10 * 3;
            int i12 = this.f15651a[i11];
            if (i8 == i12) {
                return i11;
            }
            if (i8 < i12) {
                length = i10 - 1;
            } else {
                i9 = i10 + 1;
            }
        }
        return -1;
    }

    private static int T(int i8) {
        return (i8 >>> 20) & 255;
    }

    private final int U(int i8) {
        return this.f15651a[i8 + 1];
    }

    private static long V(Object obj, long j8) {
        return ((Long) AbstractC2153z5.k(obj, j8)).longValue();
    }

    private final InterfaceC2136x4 j(int i8) {
        int i9 = i8 / 3;
        return (InterfaceC2136x4) this.f15652b[i9 + i9 + 1];
    }

    private final InterfaceC2026j5 k(int i8) {
        int i9 = i8 / 3;
        int i10 = i9 + i9;
        InterfaceC2026j5 interfaceC2026j5 = (InterfaceC2026j5) this.f15652b[i10];
        if (interfaceC2026j5 != null) {
            return interfaceC2026j5;
        }
        InterfaceC2026j5 b8 = C2001g5.a().b((Class) this.f15652b[i10 + 1]);
        this.f15652b[i10] = b8;
        return b8;
    }

    private final Object l(int i8) {
        int i9 = i8 / 3;
        return this.f15652b[i9 + i9];
    }

    private final Object m(Object obj, int i8) {
        InterfaceC2026j5 k8 = k(i8);
        int U7 = U(i8) & 1048575;
        if (!y(obj, i8)) {
            return k8.e();
        }
        Object object = f15650q.getObject(obj, U7);
        if (B(object)) {
            return object;
        }
        Object e8 = k8.e();
        if (object != null) {
            k8.h(e8, object);
        }
        return e8;
    }

    private final Object n(Object obj, int i8, int i9) {
        InterfaceC2026j5 k8 = k(i9);
        if (!C(obj, i8, i9)) {
            return k8.e();
        }
        Object object = f15650q.getObject(obj, U(i9) & 1048575);
        if (B(object)) {
            return object;
        }
        Object e8 = k8.e();
        if (object != null) {
            k8.h(e8, object);
        }
        return e8;
    }

    private static Field o(Class cls, String str) {
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

    private static void p(Object obj) {
        if (B(obj)) {
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void q(Object obj, Object obj2, int i8) {
        if (!y(obj2, i8)) {
            return;
        }
        int U7 = U(i8) & 1048575;
        Unsafe unsafe = f15650q;
        long j8 = U7;
        Object object = unsafe.getObject(obj2, j8);
        if (object != null) {
            InterfaceC2026j5 k8 = k(i8);
            if (!y(obj, i8)) {
                if (!B(object)) {
                    unsafe.putObject(obj, j8, object);
                } else {
                    Object e8 = k8.e();
                    k8.h(e8, object);
                    unsafe.putObject(obj, j8, e8);
                }
                s(obj, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!B(object2)) {
                Object e9 = k8.e();
                k8.h(e9, object2);
                unsafe.putObject(obj, j8, e9);
                object2 = e9;
            }
            k8.h(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f15651a[i8] + " is present but null: " + obj2.toString());
    }

    private final void r(Object obj, Object obj2, int i8) {
        int i9 = this.f15651a[i8];
        if (!C(obj2, i9, i8)) {
            return;
        }
        int U7 = U(i8) & 1048575;
        Unsafe unsafe = f15650q;
        long j8 = U7;
        Object object = unsafe.getObject(obj2, j8);
        if (object != null) {
            InterfaceC2026j5 k8 = k(i8);
            if (!C(obj, i9, i8)) {
                if (!B(object)) {
                    unsafe.putObject(obj, j8, object);
                } else {
                    Object e8 = k8.e();
                    k8.h(e8, object);
                    unsafe.putObject(obj, j8, e8);
                }
                t(obj, i9, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!B(object2)) {
                Object e9 = k8.e();
                k8.h(e9, object2);
                unsafe.putObject(obj, j8, e9);
                object2 = e9;
            }
            k8.h(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f15651a[i8] + " is present but null: " + obj2.toString());
    }

    private final void s(Object obj, int i8) {
        int R8 = R(i8);
        long j8 = 1048575 & R8;
        if (j8 == 1048575) {
            return;
        }
        AbstractC2153z5.v(obj, j8, (1 << (R8 >>> 20)) | AbstractC2153z5.h(obj, j8));
    }

    private final void t(Object obj, int i8, int i9) {
        AbstractC2153z5.v(obj, R(i9) & 1048575, i8);
    }

    private final void u(Object obj, int i8, Object obj2) {
        f15650q.putObject(obj, U(i8) & 1048575, obj2);
        s(obj, i8);
    }

    private final void v(Object obj, int i8, int i9, Object obj2) {
        f15650q.putObject(obj, U(i9) & 1048575, obj2);
        t(obj, i8, i9);
    }

    private final void w(G5 g52, int i8, Object obj, int i9) {
        if (obj == null) {
            return;
        }
        android.support.v4.media.a.a(l(i9));
        throw null;
    }

    private final boolean x(Object obj, Object obj2, int i8) {
        if (y(obj, i8) == y(obj2, i8)) {
            return true;
        }
        return false;
    }

    private final boolean y(Object obj, int i8) {
        int R8 = R(i8);
        long j8 = R8 & 1048575;
        if (j8 == 1048575) {
            int U7 = U(i8);
            long j9 = U7 & 1048575;
            switch (T(U7)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC2153z5.f(obj, j9)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC2153z5.g(obj, j9)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (AbstractC2153z5.i(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (AbstractC2153z5.i(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (AbstractC2153z5.h(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (AbstractC2153z5.i(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (AbstractC2153z5.h(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return AbstractC2153z5.B(obj, j9);
                case 8:
                    Object k8 = AbstractC2153z5.k(obj, j9);
                    if (k8 instanceof String) {
                        if (((String) k8).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (k8 instanceof X3) {
                        if (X3.f15622b.equals(k8)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (AbstractC2153z5.k(obj, j9) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (X3.f15622b.equals(AbstractC2153z5.k(obj, j9))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (AbstractC2153z5.h(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (AbstractC2153z5.h(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (AbstractC2153z5.h(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (AbstractC2153z5.i(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (AbstractC2153z5.h(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (AbstractC2153z5.i(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (AbstractC2153z5.k(obj, j9) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((AbstractC2153z5.h(obj, j8) & (1 << (R8 >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean z(Object obj, int i8, int i9, int i10, int i11) {
        if (i9 == 1048575) {
            return y(obj, i8);
        }
        if ((i10 & i11) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:106:0x008b. Please report as an issue. */
    public final int F(Object obj, byte[] bArr, int i8, int i9, int i10, K3 k32) {
        Unsafe unsafe;
        int i11;
        C1956b5 c1956b5;
        Object obj2;
        int i12;
        int P8;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        C2025j4 c2025j4;
        int i20;
        int i21;
        byte[] bArr2;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        byte[] bArr3;
        boolean z8;
        int i29;
        int i30;
        int i31;
        C1956b5 c1956b52 = this;
        Object obj3 = obj;
        byte[] bArr4 = bArr;
        int i32 = i9;
        int i33 = i10;
        K3 k33 = k32;
        p(obj);
        Unsafe unsafe2 = f15650q;
        int i34 = -1;
        int i35 = i8;
        int i36 = -1;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 1048575;
        while (true) {
            if (i35 < i32) {
                int i41 = i35 + 1;
                byte b8 = bArr4[i35];
                if (b8 < 0) {
                    int k8 = L3.k(b8, bArr4, i41, k33);
                    i12 = k33.f15371a;
                    i41 = k8;
                } else {
                    i12 = b8;
                }
                int i42 = i12 >>> 3;
                if (i42 > i36) {
                    P8 = c1956b52.Q(i42, i37 / 3);
                } else {
                    P8 = c1956b52.P(i42);
                }
                int i43 = P8;
                if (i43 == i34) {
                    i13 = i42;
                    i14 = i41;
                    i15 = i12;
                    i16 = i39;
                    unsafe = unsafe2;
                    i17 = i33;
                    i18 = 0;
                } else {
                    int i44 = i12 & 7;
                    int[] iArr = c1956b52.f15651a;
                    int i45 = iArr[i43 + 1];
                    int T7 = T(i45);
                    int i46 = i12;
                    long j8 = i45 & 1048575;
                    if (T7 <= 17) {
                        int i47 = iArr[i43 + 2];
                        int i48 = 1 << (i47 >>> 20);
                        int i49 = i47 & 1048575;
                        if (i49 != i40) {
                            if (i40 != 1048575) {
                                unsafe2.putInt(obj3, i40, i39);
                            }
                            i21 = i49;
                            i20 = unsafe2.getInt(obj3, i49);
                        } else {
                            i20 = i39;
                            i21 = i40;
                        }
                        switch (T7) {
                            case 0:
                                bArr2 = bArr;
                                i22 = i42;
                                i23 = i43;
                                i24 = i21;
                                i25 = i41;
                                i26 = i48;
                                i27 = i46;
                                if (i44 == 1) {
                                    AbstractC2153z5.t(obj3, j8, Double.longBitsToDouble(L3.p(bArr2, i25)));
                                    i35 = i25 + 8;
                                    i39 = i20 | i26;
                                    i32 = i9;
                                    bArr4 = bArr2;
                                    i37 = i23;
                                    i36 = i22;
                                    i38 = i27;
                                    i34 = -1;
                                    i40 = i24;
                                    i33 = i10;
                                } else {
                                    i40 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                }
                            case 1:
                                bArr2 = bArr;
                                i22 = i42;
                                i23 = i43;
                                i24 = i21;
                                i25 = i41;
                                i26 = i48;
                                i27 = i46;
                                if (i44 == 5) {
                                    AbstractC2153z5.u(obj3, j8, Float.intBitsToFloat(L3.b(bArr2, i25)));
                                    i35 = i25 + 4;
                                    i39 = i20 | i26;
                                    i32 = i9;
                                    bArr4 = bArr2;
                                    i37 = i23;
                                    i36 = i22;
                                    i38 = i27;
                                    i34 = -1;
                                    i40 = i24;
                                    i33 = i10;
                                } else {
                                    i40 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                }
                            case 2:
                            case 3:
                                i22 = i42;
                                i23 = i43;
                                i24 = i21;
                                i25 = i41;
                                i27 = i46;
                                if (i44 == 0) {
                                    int m8 = L3.m(bArr, i25, k33);
                                    unsafe2.putLong(obj, j8, k33.f15372b);
                                    i39 = i20 | i48;
                                    bArr4 = bArr;
                                    i37 = i23;
                                    i35 = m8;
                                    i36 = i22;
                                    i38 = i27;
                                    i34 = -1;
                                    i40 = i24;
                                    i32 = i9;
                                    i33 = i10;
                                } else {
                                    i40 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i22 = i42;
                                i23 = i43;
                                i24 = i21;
                                i25 = i41;
                                i26 = i48;
                                i27 = i46;
                                if (i44 == 0) {
                                    i35 = L3.j(bArr2, i25, k33);
                                    unsafe2.putInt(obj3, j8, k33.f15371a);
                                    i39 = i20 | i26;
                                    i32 = i9;
                                    bArr4 = bArr2;
                                    i37 = i23;
                                    i36 = i22;
                                    i38 = i27;
                                    i34 = -1;
                                    i40 = i24;
                                    i33 = i10;
                                } else {
                                    i40 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i22 = i42;
                                i23 = i43;
                                i24 = i21;
                                i28 = i46;
                                i26 = i48;
                                if (i44 != 1) {
                                    i27 = i28;
                                    i25 = i41;
                                    i40 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                } else {
                                    i27 = i28;
                                    i25 = i41;
                                    unsafe2.putLong(obj, j8, L3.p(bArr2, i41));
                                    i35 = i25 + 8;
                                    i39 = i20 | i26;
                                    i32 = i9;
                                    bArr4 = bArr2;
                                    i37 = i23;
                                    i36 = i22;
                                    i38 = i27;
                                    i34 = -1;
                                    i40 = i24;
                                    i33 = i10;
                                }
                            case 6:
                            case 13:
                                bArr3 = bArr;
                                i22 = i42;
                                i23 = i43;
                                i24 = i21;
                                i28 = i46;
                                if (i44 != 5) {
                                    i27 = i28;
                                    i25 = i41;
                                    i40 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                } else {
                                    unsafe2.putInt(obj3, j8, L3.b(bArr3, i41));
                                    i35 = i41 + 4;
                                    i39 = i20 | i48;
                                    bArr4 = bArr3;
                                    i37 = i23;
                                    i38 = i28;
                                    i36 = i22;
                                    i34 = -1;
                                    i40 = i24;
                                    i32 = i9;
                                    i33 = i10;
                                }
                            case 7:
                                bArr3 = bArr;
                                i22 = i42;
                                i23 = i43;
                                i24 = i21;
                                i28 = i46;
                                if (i44 != 0) {
                                    i27 = i28;
                                    i25 = i41;
                                    i40 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                } else {
                                    i35 = L3.m(bArr3, i41, k33);
                                    if (k33.f15372b != 0) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    AbstractC2153z5.r(obj3, j8, z8);
                                    i39 = i20 | i48;
                                    bArr4 = bArr3;
                                    i37 = i23;
                                    i38 = i28;
                                    i36 = i22;
                                    i34 = -1;
                                    i40 = i24;
                                    i32 = i9;
                                    i33 = i10;
                                }
                            case 8:
                                bArr3 = bArr;
                                i22 = i42;
                                i23 = i43;
                                i24 = i21;
                                i28 = i46;
                                if (i44 != 2) {
                                    i27 = i28;
                                    i25 = i41;
                                    i40 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                } else {
                                    if ((536870912 & i45) == 0) {
                                        i35 = L3.g(bArr3, i41, k33);
                                    } else {
                                        i35 = L3.h(bArr3, i41, k33);
                                    }
                                    unsafe2.putObject(obj3, j8, k33.f15373c);
                                    i39 = i20 | i48;
                                    bArr4 = bArr3;
                                    i37 = i23;
                                    i38 = i28;
                                    i36 = i22;
                                    i34 = -1;
                                    i40 = i24;
                                    i32 = i9;
                                    i33 = i10;
                                }
                            case 9:
                                bArr3 = bArr;
                                i22 = i42;
                                i23 = i43;
                                i24 = i21;
                                i28 = i46;
                                if (i44 != 2) {
                                    i27 = i28;
                                    i25 = i41;
                                    i40 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                } else {
                                    Object m9 = c1956b52.m(obj3, i23);
                                    i35 = L3.o(m9, c1956b52.k(i23), bArr, i41, i9, k32);
                                    c1956b52.u(obj3, i23, m9);
                                    i39 = i20 | i48;
                                    bArr4 = bArr3;
                                    i37 = i23;
                                    i38 = i28;
                                    i36 = i22;
                                    i34 = -1;
                                    i40 = i24;
                                    i32 = i9;
                                    i33 = i10;
                                }
                            case 10:
                                bArr3 = bArr;
                                i22 = i42;
                                i23 = i43;
                                i24 = i21;
                                i28 = i46;
                                if (i44 != 2) {
                                    i27 = i28;
                                    i25 = i41;
                                    i40 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                } else {
                                    i35 = L3.a(bArr3, i41, k33);
                                    unsafe2.putObject(obj3, j8, k33.f15373c);
                                    i39 = i20 | i48;
                                    bArr4 = bArr3;
                                    i37 = i23;
                                    i38 = i28;
                                    i36 = i22;
                                    i34 = -1;
                                    i40 = i24;
                                    i32 = i9;
                                    i33 = i10;
                                }
                            case 12:
                                bArr3 = bArr;
                                i22 = i42;
                                i23 = i43;
                                i24 = i21;
                                i28 = i46;
                                if (i44 != 0) {
                                    i27 = i28;
                                    i25 = i41;
                                    i40 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                } else {
                                    i35 = L3.j(bArr3, i41, k33);
                                    int i50 = k33.f15371a;
                                    InterfaceC2136x4 j9 = c1956b52.j(i23);
                                    if (j9 != null && !j9.j(i50)) {
                                        G(obj).j(i28, Long.valueOf(i50));
                                        i37 = i23;
                                        i39 = i20;
                                        i38 = i28;
                                        i36 = i22;
                                        i34 = -1;
                                        i32 = i9;
                                        i33 = i10;
                                        bArr4 = bArr3;
                                        i40 = i24;
                                    } else {
                                        unsafe2.putInt(obj3, j8, i50);
                                        i39 = i20 | i48;
                                        bArr4 = bArr3;
                                        i37 = i23;
                                        i38 = i28;
                                        i36 = i22;
                                        i34 = -1;
                                        i40 = i24;
                                        i32 = i9;
                                        i33 = i10;
                                    }
                                }
                                break;
                            case 15:
                                bArr3 = bArr;
                                i22 = i42;
                                i23 = i43;
                                i24 = i21;
                                i28 = i46;
                                if (i44 != 0) {
                                    i27 = i28;
                                    i25 = i41;
                                    i40 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                } else {
                                    i35 = L3.j(bArr3, i41, k33);
                                    unsafe2.putInt(obj3, j8, AbstractC1955b4.a(k33.f15371a));
                                    i39 = i20 | i48;
                                    bArr4 = bArr3;
                                    i37 = i23;
                                    i38 = i28;
                                    i36 = i22;
                                    i34 = -1;
                                    i40 = i24;
                                    i32 = i9;
                                    i33 = i10;
                                }
                            case 16:
                                i22 = i42;
                                i23 = i43;
                                i24 = i21;
                                i28 = i46;
                                if (i44 == 0) {
                                    int m10 = L3.m(bArr, i41, k33);
                                    unsafe2.putLong(obj, j8, AbstractC1955b4.b(k33.f15372b));
                                    i39 = i20 | i48;
                                    bArr4 = bArr;
                                    i35 = m10;
                                    i37 = i23;
                                    i38 = i28;
                                    i36 = i22;
                                    i34 = -1;
                                    i40 = i24;
                                    i32 = i9;
                                    i33 = i10;
                                } else {
                                    i27 = i28;
                                    i25 = i41;
                                    i40 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                }
                            default:
                                if (i44 == 3) {
                                    Object m11 = c1956b52.m(obj3, i43);
                                    i35 = L3.n(m11, c1956b52.k(i43), bArr, i41, i9, (i42 << 3) | 4, k32);
                                    c1956b52.u(obj3, i43, m11);
                                    i39 = i20 | i48;
                                    bArr4 = bArr;
                                    i40 = i21;
                                    i37 = i43;
                                    i38 = i46;
                                    i36 = i42;
                                    i34 = -1;
                                    i32 = i9;
                                    i33 = i10;
                                } else {
                                    i22 = i42;
                                    i23 = i43;
                                    i24 = i21;
                                    i25 = i41;
                                    i27 = i46;
                                    i40 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                }
                        }
                    } else {
                        int i51 = i41;
                        if (T7 == 27) {
                            if (i44 == 2) {
                                A4 a42 = (A4) unsafe2.getObject(obj3, j8);
                                if (!a42.c()) {
                                    int size = a42.size();
                                    if (size == 0) {
                                        i31 = 10;
                                    } else {
                                        i31 = size + size;
                                    }
                                    a42 = a42.k(i31);
                                    unsafe2.putObject(obj3, j8, a42);
                                }
                                i35 = L3.e(c1956b52.k(i43), i46, bArr, i51, i9, a42, k32);
                                i32 = i9;
                                i37 = i43;
                                i36 = i42;
                                i39 = i39;
                                i38 = i46;
                                i40 = i40;
                                i34 = -1;
                                bArr4 = bArr;
                                i33 = i10;
                            } else {
                                i16 = i39;
                                i29 = i40;
                                unsafe = unsafe2;
                                i18 = i43;
                                i13 = i42;
                                i30 = i51;
                            }
                        } else {
                            i16 = i39;
                            i29 = i40;
                            if (T7 <= 49) {
                                unsafe = unsafe2;
                                i18 = i43;
                                i13 = i42;
                                i35 = O(obj, bArr, i51, i9, i46, i42, i44, i43, i45, T7, j8, k32);
                                if (i35 != i51) {
                                    c1956b52 = this;
                                    obj3 = obj;
                                    bArr4 = bArr;
                                    i32 = i9;
                                    i33 = i10;
                                    k33 = k32;
                                    i39 = i16;
                                    i38 = i46;
                                    i40 = i29;
                                    i37 = i18;
                                    i36 = i13;
                                    unsafe2 = unsafe;
                                    i34 = -1;
                                } else {
                                    i14 = i35;
                                    i15 = i46;
                                    i40 = i29;
                                    i17 = i10;
                                }
                            } else {
                                unsafe = unsafe2;
                                i18 = i43;
                                i13 = i42;
                                i30 = i51;
                                if (T7 == 50) {
                                    if (i44 == 2) {
                                        i35 = M(obj, bArr, i30, i9, i18, j8, k32);
                                        if (i35 != i30) {
                                            c1956b52 = this;
                                            obj3 = obj;
                                            bArr4 = bArr;
                                            i32 = i9;
                                            i33 = i10;
                                            k33 = k32;
                                            i39 = i16;
                                            i38 = i46;
                                            i40 = i29;
                                            i37 = i18;
                                            i36 = i13;
                                            unsafe2 = unsafe;
                                            i34 = -1;
                                        } else {
                                            i14 = i35;
                                            i15 = i46;
                                            i40 = i29;
                                            i17 = i10;
                                        }
                                    }
                                } else {
                                    i35 = N(obj, bArr, i30, i9, i46, i13, i44, i45, T7, j8, i18, k32);
                                    if (i35 != i30) {
                                        c1956b52 = this;
                                        obj3 = obj;
                                        bArr4 = bArr;
                                        i32 = i9;
                                        i33 = i10;
                                        k33 = k32;
                                        i39 = i16;
                                        i38 = i46;
                                        i40 = i29;
                                        i37 = i18;
                                        i36 = i13;
                                        unsafe2 = unsafe;
                                        i34 = -1;
                                    } else {
                                        i14 = i35;
                                        i15 = i46;
                                        i40 = i29;
                                        i17 = i10;
                                    }
                                }
                            }
                        }
                        i17 = i10;
                        i14 = i30;
                        i15 = i46;
                        i40 = i29;
                    }
                }
                if (i15 == i17 && i17 != 0) {
                    c1956b5 = this;
                    i11 = i17;
                    i35 = i14;
                    i38 = i15;
                    i39 = i16;
                } else {
                    int i52 = i17;
                    if (this.f15656f && (c2025j4 = k32.f15374d) != C2025j4.f15743c) {
                        i19 = i13;
                        c2025j4.b(this.f15655e, i19);
                        i35 = L3.i(i15, bArr, i14, i9, G(obj), k32);
                    } else {
                        i19 = i13;
                        i35 = L3.i(i15, bArr, i14, i9, G(obj), k32);
                    }
                    obj3 = obj;
                    bArr4 = bArr;
                    i32 = i9;
                    i38 = i15;
                    c1956b52 = this;
                    i36 = i19;
                    i39 = i16;
                    i37 = i18;
                    i34 = -1;
                    i33 = i52;
                    k33 = k32;
                    unsafe2 = unsafe;
                }
            } else {
                unsafe = unsafe2;
                i11 = i33;
                c1956b5 = c1956b52;
            }
        }
        if (i40 != 1048575) {
            obj2 = obj;
            unsafe.putInt(obj2, i40, i39);
        } else {
            obj2 = obj;
        }
        for (int i53 = c1956b5.f15659i; i53 < c1956b5.f15660j; i53++) {
            int i54 = c1956b5.f15658h[i53];
            int i55 = c1956b5.f15651a[i54];
            Object k9 = AbstractC2153z5.k(obj2, c1956b5.U(i54) & 1048575);
            if (k9 != null && c1956b5.j(i54) != null) {
                android.support.v4.media.a.a(c1956b5.l(i54));
                throw null;
            }
        }
        if (i11 == 0) {
            if (i35 != i9) {
                throw D4.e();
            }
        } else if (i35 > i9 || i38 != i11) {
            throw D4.e();
        }
        return i35;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2026j5
    public final void a(Object obj) {
        if (!B(obj)) {
            return;
        }
        if (obj instanceof AbstractC2112u4) {
            AbstractC2112u4 abstractC2112u4 = (AbstractC2112u4) obj;
            abstractC2112u4.x(Integer.MAX_VALUE);
            abstractC2112u4.zzb = 0;
            abstractC2112u4.v();
        }
        int length = this.f15651a.length;
        for (int i8 = 0; i8 < length; i8 += 3) {
            int U7 = U(i8);
            int i9 = 1048575 & U7;
            int T7 = T(U7);
            long j8 = i9;
            if (T7 != 9) {
                if (T7 != 60 && T7 != 68) {
                    switch (T7) {
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
                            this.f15661k.a(obj, j8);
                            break;
                        case 50:
                            Unsafe unsafe = f15650q;
                            Object object = unsafe.getObject(obj, j8);
                            if (object != null) {
                                ((S4) object).c();
                                unsafe.putObject(obj, j8, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (C(obj, this.f15651a[i8], i8)) {
                    k(i8).a(f15650q.getObject(obj, j8));
                }
            }
            if (y(obj, i8)) {
                k(i8).a(f15650q.getObject(obj, j8));
            }
        }
        this.f15662l.g(obj);
        if (this.f15656f) {
            this.f15663m.b(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2026j5
    public final void b(Object obj, G5 g52) {
        int i8;
        int i9 = 1048575;
        if (this.f15657g) {
            if (!this.f15656f) {
                int length = this.f15651a.length;
                for (int i10 = 0; i10 < length; i10 += 3) {
                    int U7 = U(i10);
                    int i11 = this.f15651a[i10];
                    switch (T(U7)) {
                        case 0:
                            if (y(obj, i10)) {
                                g52.s(i11, AbstractC2153z5.f(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (y(obj, i10)) {
                                g52.w(i11, AbstractC2153z5.g(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (y(obj, i10)) {
                                g52.i(i11, AbstractC2153z5.i(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (y(obj, i10)) {
                                g52.D(i11, AbstractC2153z5.i(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (y(obj, i10)) {
                                g52.q(i11, AbstractC2153z5.h(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (y(obj, i10)) {
                                g52.G(i11, AbstractC2153z5.i(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (y(obj, i10)) {
                                g52.e(i11, AbstractC2153z5.h(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (y(obj, i10)) {
                                g52.f(i11, AbstractC2153z5.B(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (y(obj, i10)) {
                                E(i11, AbstractC2153z5.k(obj, U7 & 1048575), g52);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (y(obj, i10)) {
                                g52.t(i11, AbstractC2153z5.k(obj, U7 & 1048575), k(i10));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (y(obj, i10)) {
                                g52.A(i11, (X3) AbstractC2153z5.k(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (y(obj, i10)) {
                                g52.b(i11, AbstractC2153z5.h(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (y(obj, i10)) {
                                g52.o(i11, AbstractC2153z5.h(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (y(obj, i10)) {
                                g52.v(i11, AbstractC2153z5.h(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (y(obj, i10)) {
                                g52.k(i11, AbstractC2153z5.i(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (y(obj, i10)) {
                                g52.g(i11, AbstractC2153z5.h(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (y(obj, i10)) {
                                g52.I(i11, AbstractC2153z5.i(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (y(obj, i10)) {
                                g52.a(i11, AbstractC2153z5.k(obj, U7 & 1048575), k(i10));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            AbstractC2042l5.f(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, false);
                            break;
                        case 19:
                            AbstractC2042l5.j(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, false);
                            break;
                        case 20:
                            AbstractC2042l5.m(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, false);
                            break;
                        case 21:
                            AbstractC2042l5.u(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, false);
                            break;
                        case 22:
                            AbstractC2042l5.l(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, false);
                            break;
                        case 23:
                            AbstractC2042l5.i(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, false);
                            break;
                        case 24:
                            AbstractC2042l5.h(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, false);
                            break;
                        case 25:
                            AbstractC2042l5.d(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, false);
                            break;
                        case 26:
                            AbstractC2042l5.s(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52);
                            break;
                        case 27:
                            AbstractC2042l5.n(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, k(i10));
                            break;
                        case 28:
                            AbstractC2042l5.e(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52);
                            break;
                        case 29:
                            AbstractC2042l5.t(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, false);
                            break;
                        case 30:
                            AbstractC2042l5.g(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, false);
                            break;
                        case 31:
                            AbstractC2042l5.o(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, false);
                            break;
                        case 32:
                            AbstractC2042l5.p(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, false);
                            break;
                        case 33:
                            AbstractC2042l5.q(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, false);
                            break;
                        case 34:
                            AbstractC2042l5.r(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, false);
                            break;
                        case 35:
                            AbstractC2042l5.f(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, true);
                            break;
                        case 36:
                            AbstractC2042l5.j(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, true);
                            break;
                        case 37:
                            AbstractC2042l5.m(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, true);
                            break;
                        case 38:
                            AbstractC2042l5.u(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, true);
                            break;
                        case 39:
                            AbstractC2042l5.l(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, true);
                            break;
                        case 40:
                            AbstractC2042l5.i(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, true);
                            break;
                        case 41:
                            AbstractC2042l5.h(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, true);
                            break;
                        case 42:
                            AbstractC2042l5.d(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, true);
                            break;
                        case 43:
                            AbstractC2042l5.t(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, true);
                            break;
                        case 44:
                            AbstractC2042l5.g(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, true);
                            break;
                        case 45:
                            AbstractC2042l5.o(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, true);
                            break;
                        case 46:
                            AbstractC2042l5.p(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, true);
                            break;
                        case 47:
                            AbstractC2042l5.q(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, true);
                            break;
                        case 48:
                            AbstractC2042l5.r(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, true);
                            break;
                        case 49:
                            AbstractC2042l5.k(i11, (List) AbstractC2153z5.k(obj, U7 & 1048575), g52, k(i10));
                            break;
                        case 50:
                            w(g52, i11, AbstractC2153z5.k(obj, U7 & 1048575), i10);
                            break;
                        case 51:
                            if (C(obj, i11, i10)) {
                                g52.s(i11, I(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (C(obj, i11, i10)) {
                                g52.w(i11, J(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (C(obj, i11, i10)) {
                                g52.i(i11, V(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (C(obj, i11, i10)) {
                                g52.D(i11, V(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (C(obj, i11, i10)) {
                                g52.q(i11, L(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (C(obj, i11, i10)) {
                                g52.G(i11, V(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (C(obj, i11, i10)) {
                                g52.e(i11, L(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (C(obj, i11, i10)) {
                                g52.f(i11, D(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (C(obj, i11, i10)) {
                                E(i11, AbstractC2153z5.k(obj, U7 & 1048575), g52);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (C(obj, i11, i10)) {
                                g52.t(i11, AbstractC2153z5.k(obj, U7 & 1048575), k(i10));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (C(obj, i11, i10)) {
                                g52.A(i11, (X3) AbstractC2153z5.k(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (C(obj, i11, i10)) {
                                g52.b(i11, L(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (C(obj, i11, i10)) {
                                g52.o(i11, L(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (C(obj, i11, i10)) {
                                g52.v(i11, L(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (C(obj, i11, i10)) {
                                g52.k(i11, V(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (C(obj, i11, i10)) {
                                g52.g(i11, L(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (C(obj, i11, i10)) {
                                g52.I(i11, V(obj, U7 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (C(obj, i11, i10)) {
                                g52.a(i11, AbstractC2153z5.k(obj, U7 & 1048575), k(i10));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                AbstractC2074p5 abstractC2074p5 = this.f15662l;
                abstractC2074p5.i(abstractC2074p5.d(obj), g52);
                return;
            }
            this.f15663m.a(obj);
            throw null;
        }
        if (!this.f15656f) {
            int length2 = this.f15651a.length;
            Unsafe unsafe = f15650q;
            int i12 = 0;
            int i13 = 1048575;
            int i14 = 0;
            while (i12 < length2) {
                int U8 = U(i12);
                int[] iArr = this.f15651a;
                int i15 = iArr[i12];
                int T7 = T(U8);
                if (T7 <= 17) {
                    int i16 = iArr[i12 + 2];
                    int i17 = i16 & i9;
                    if (i17 != i13) {
                        i14 = unsafe.getInt(obj, i17);
                        i13 = i17;
                    }
                    i8 = 1 << (i16 >>> 20);
                } else {
                    i8 = 0;
                }
                long j8 = U8 & i9;
                switch (T7) {
                    case 0:
                        if ((i14 & i8) == 0) {
                            break;
                        } else {
                            g52.s(i15, AbstractC2153z5.f(obj, j8));
                            continue;
                        }
                    case 1:
                        if ((i14 & i8) != 0) {
                            g52.w(i15, AbstractC2153z5.g(obj, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i14 & i8) != 0) {
                            g52.i(i15, unsafe.getLong(obj, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i14 & i8) != 0) {
                            g52.D(i15, unsafe.getLong(obj, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i14 & i8) != 0) {
                            g52.q(i15, unsafe.getInt(obj, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i14 & i8) != 0) {
                            g52.G(i15, unsafe.getLong(obj, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i14 & i8) != 0) {
                            g52.e(i15, unsafe.getInt(obj, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i14 & i8) != 0) {
                            g52.f(i15, AbstractC2153z5.B(obj, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i14 & i8) != 0) {
                            E(i15, unsafe.getObject(obj, j8), g52);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i14 & i8) != 0) {
                            g52.t(i15, unsafe.getObject(obj, j8), k(i12));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i14 & i8) != 0) {
                            g52.A(i15, (X3) unsafe.getObject(obj, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i14 & i8) != 0) {
                            g52.b(i15, unsafe.getInt(obj, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i14 & i8) != 0) {
                            g52.o(i15, unsafe.getInt(obj, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i14 & i8) != 0) {
                            g52.v(i15, unsafe.getInt(obj, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i14 & i8) != 0) {
                            g52.k(i15, unsafe.getLong(obj, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i14 & i8) != 0) {
                            g52.g(i15, unsafe.getInt(obj, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i14 & i8) != 0) {
                            g52.I(i15, unsafe.getLong(obj, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i14 & i8) != 0) {
                            g52.a(i15, unsafe.getObject(obj, j8), k(i12));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        AbstractC2042l5.f(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, false);
                        continue;
                    case 19:
                        AbstractC2042l5.j(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, false);
                        continue;
                    case 20:
                        AbstractC2042l5.m(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, false);
                        continue;
                    case 21:
                        AbstractC2042l5.u(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, false);
                        continue;
                    case 22:
                        AbstractC2042l5.l(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, false);
                        continue;
                    case 23:
                        AbstractC2042l5.i(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, false);
                        continue;
                    case 24:
                        AbstractC2042l5.h(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, false);
                        continue;
                    case 25:
                        AbstractC2042l5.d(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, false);
                        continue;
                    case 26:
                        AbstractC2042l5.s(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52);
                        break;
                    case 27:
                        AbstractC2042l5.n(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, k(i12));
                        break;
                    case 28:
                        AbstractC2042l5.e(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52);
                        break;
                    case 29:
                        AbstractC2042l5.t(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, false);
                        break;
                    case 30:
                        AbstractC2042l5.g(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, false);
                        break;
                    case 31:
                        AbstractC2042l5.o(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, false);
                        break;
                    case 32:
                        AbstractC2042l5.p(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, false);
                        break;
                    case 33:
                        AbstractC2042l5.q(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, false);
                        break;
                    case 34:
                        AbstractC2042l5.r(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, false);
                        break;
                    case 35:
                        AbstractC2042l5.f(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, true);
                        break;
                    case 36:
                        AbstractC2042l5.j(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, true);
                        break;
                    case 37:
                        AbstractC2042l5.m(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, true);
                        break;
                    case 38:
                        AbstractC2042l5.u(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, true);
                        break;
                    case 39:
                        AbstractC2042l5.l(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, true);
                        break;
                    case 40:
                        AbstractC2042l5.i(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, true);
                        break;
                    case 41:
                        AbstractC2042l5.h(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, true);
                        break;
                    case 42:
                        AbstractC2042l5.d(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, true);
                        break;
                    case 43:
                        AbstractC2042l5.t(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, true);
                        break;
                    case 44:
                        AbstractC2042l5.g(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, true);
                        break;
                    case 45:
                        AbstractC2042l5.o(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, true);
                        break;
                    case 46:
                        AbstractC2042l5.p(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, true);
                        break;
                    case 47:
                        AbstractC2042l5.q(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, true);
                        break;
                    case 48:
                        AbstractC2042l5.r(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, true);
                        break;
                    case 49:
                        AbstractC2042l5.k(this.f15651a[i12], (List) unsafe.getObject(obj, j8), g52, k(i12));
                        break;
                    case 50:
                        w(g52, i15, unsafe.getObject(obj, j8), i12);
                        break;
                    case 51:
                        if (C(obj, i15, i12)) {
                            g52.s(i15, I(obj, j8));
                            break;
                        }
                        break;
                    case 52:
                        if (C(obj, i15, i12)) {
                            g52.w(i15, J(obj, j8));
                            break;
                        }
                        break;
                    case 53:
                        if (C(obj, i15, i12)) {
                            g52.i(i15, V(obj, j8));
                            break;
                        }
                        break;
                    case 54:
                        if (C(obj, i15, i12)) {
                            g52.D(i15, V(obj, j8));
                            break;
                        }
                        break;
                    case 55:
                        if (C(obj, i15, i12)) {
                            g52.q(i15, L(obj, j8));
                            break;
                        }
                        break;
                    case 56:
                        if (C(obj, i15, i12)) {
                            g52.G(i15, V(obj, j8));
                            break;
                        }
                        break;
                    case 57:
                        if (C(obj, i15, i12)) {
                            g52.e(i15, L(obj, j8));
                            break;
                        }
                        break;
                    case 58:
                        if (C(obj, i15, i12)) {
                            g52.f(i15, D(obj, j8));
                            break;
                        }
                        break;
                    case 59:
                        if (C(obj, i15, i12)) {
                            E(i15, unsafe.getObject(obj, j8), g52);
                            break;
                        }
                        break;
                    case 60:
                        if (C(obj, i15, i12)) {
                            g52.t(i15, unsafe.getObject(obj, j8), k(i12));
                            break;
                        }
                        break;
                    case 61:
                        if (C(obj, i15, i12)) {
                            g52.A(i15, (X3) unsafe.getObject(obj, j8));
                            break;
                        }
                        break;
                    case 62:
                        if (C(obj, i15, i12)) {
                            g52.b(i15, L(obj, j8));
                            break;
                        }
                        break;
                    case 63:
                        if (C(obj, i15, i12)) {
                            g52.o(i15, L(obj, j8));
                            break;
                        }
                        break;
                    case 64:
                        if (C(obj, i15, i12)) {
                            g52.v(i15, L(obj, j8));
                            break;
                        }
                        break;
                    case 65:
                        if (C(obj, i15, i12)) {
                            g52.k(i15, V(obj, j8));
                            break;
                        }
                        break;
                    case 66:
                        if (C(obj, i15, i12)) {
                            g52.g(i15, L(obj, j8));
                            break;
                        }
                        break;
                    case 67:
                        if (C(obj, i15, i12)) {
                            g52.I(i15, V(obj, j8));
                            break;
                        }
                        break;
                    case 68:
                        if (C(obj, i15, i12)) {
                            g52.a(i15, unsafe.getObject(obj, j8), k(i12));
                            break;
                        }
                        break;
                }
                i12 += 3;
                i9 = 1048575;
            }
            AbstractC2074p5 abstractC2074p52 = this.f15662l;
            abstractC2074p52.i(abstractC2074p52.d(obj), g52);
            return;
        }
        this.f15663m.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2026j5
    public final boolean c(Object obj) {
        int i8;
        int i9;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.f15659i) {
            int i13 = this.f15658h[i12];
            int i14 = this.f15651a[i13];
            int U7 = U(i13);
            int i15 = this.f15651a[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i10) {
                if (i16 != 1048575) {
                    i11 = f15650q.getInt(obj, i16);
                }
                i9 = i11;
                i8 = i16;
            } else {
                i8 = i10;
                i9 = i11;
            }
            if ((268435456 & U7) != 0 && !z(obj, i13, i8, i9, i17)) {
                return false;
            }
            int T7 = T(U7);
            if (T7 != 9 && T7 != 17) {
                if (T7 != 27) {
                    if (T7 != 60 && T7 != 68) {
                        if (T7 != 49) {
                            if (T7 == 50 && !((S4) AbstractC2153z5.k(obj, U7 & 1048575)).isEmpty()) {
                                android.support.v4.media.a.a(l(i13));
                                throw null;
                            }
                        }
                    } else if (C(obj, i14, i13) && !A(obj, U7, k(i13))) {
                        return false;
                    }
                }
                List list = (List) AbstractC2153z5.k(obj, U7 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC2026j5 k8 = k(i13);
                    for (int i18 = 0; i18 < list.size(); i18++) {
                        if (!k8.c(list.get(i18))) {
                            return false;
                        }
                    }
                }
            } else if (z(obj, i13, i8, i9, i17) && !A(obj, U7, k(i13))) {
                return false;
            }
            i12++;
            i10 = i8;
            i11 = i9;
        }
        if (!this.f15656f) {
            return true;
        }
        this.f15663m.a(obj);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2026j5
    public final int d(Object obj) {
        int i8;
        long doubleToLongBits;
        int i9;
        int floatToIntBits;
        int length = this.f15651a.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int U7 = U(i11);
            int i12 = this.f15651a[i11];
            long j8 = 1048575 & U7;
            int i13 = 37;
            switch (T(U7)) {
                case 0:
                    i8 = i10 * 53;
                    doubleToLongBits = Double.doubleToLongBits(AbstractC2153z5.f(obj, j8));
                    byte[] bArr = B4.f15272d;
                    i10 = i8 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i9 = i10 * 53;
                    floatToIntBits = Float.floatToIntBits(AbstractC2153z5.g(obj, j8));
                    i10 = i9 + floatToIntBits;
                    break;
                case 2:
                    i8 = i10 * 53;
                    doubleToLongBits = AbstractC2153z5.i(obj, j8);
                    byte[] bArr2 = B4.f15272d;
                    i10 = i8 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i8 = i10 * 53;
                    doubleToLongBits = AbstractC2153z5.i(obj, j8);
                    byte[] bArr3 = B4.f15272d;
                    i10 = i8 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i9 = i10 * 53;
                    floatToIntBits = AbstractC2153z5.h(obj, j8);
                    i10 = i9 + floatToIntBits;
                    break;
                case 5:
                    i8 = i10 * 53;
                    doubleToLongBits = AbstractC2153z5.i(obj, j8);
                    byte[] bArr4 = B4.f15272d;
                    i10 = i8 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i9 = i10 * 53;
                    floatToIntBits = AbstractC2153z5.h(obj, j8);
                    i10 = i9 + floatToIntBits;
                    break;
                case 7:
                    i9 = i10 * 53;
                    floatToIntBits = B4.a(AbstractC2153z5.B(obj, j8));
                    i10 = i9 + floatToIntBits;
                    break;
                case 8:
                    i9 = i10 * 53;
                    floatToIntBits = ((String) AbstractC2153z5.k(obj, j8)).hashCode();
                    i10 = i9 + floatToIntBits;
                    break;
                case 9:
                    Object k8 = AbstractC2153z5.k(obj, j8);
                    if (k8 != null) {
                        i13 = k8.hashCode();
                    }
                    i10 = (i10 * 53) + i13;
                    break;
                case 10:
                    i9 = i10 * 53;
                    floatToIntBits = AbstractC2153z5.k(obj, j8).hashCode();
                    i10 = i9 + floatToIntBits;
                    break;
                case 11:
                    i9 = i10 * 53;
                    floatToIntBits = AbstractC2153z5.h(obj, j8);
                    i10 = i9 + floatToIntBits;
                    break;
                case 12:
                    i9 = i10 * 53;
                    floatToIntBits = AbstractC2153z5.h(obj, j8);
                    i10 = i9 + floatToIntBits;
                    break;
                case 13:
                    i9 = i10 * 53;
                    floatToIntBits = AbstractC2153z5.h(obj, j8);
                    i10 = i9 + floatToIntBits;
                    break;
                case 14:
                    i8 = i10 * 53;
                    doubleToLongBits = AbstractC2153z5.i(obj, j8);
                    byte[] bArr5 = B4.f15272d;
                    i10 = i8 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i9 = i10 * 53;
                    floatToIntBits = AbstractC2153z5.h(obj, j8);
                    i10 = i9 + floatToIntBits;
                    break;
                case 16:
                    i8 = i10 * 53;
                    doubleToLongBits = AbstractC2153z5.i(obj, j8);
                    byte[] bArr6 = B4.f15272d;
                    i10 = i8 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    Object k9 = AbstractC2153z5.k(obj, j8);
                    if (k9 != null) {
                        i13 = k9.hashCode();
                    }
                    i10 = (i10 * 53) + i13;
                    break;
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
                    i9 = i10 * 53;
                    floatToIntBits = AbstractC2153z5.k(obj, j8).hashCode();
                    i10 = i9 + floatToIntBits;
                    break;
                case 50:
                    i9 = i10 * 53;
                    floatToIntBits = AbstractC2153z5.k(obj, j8).hashCode();
                    i10 = i9 + floatToIntBits;
                    break;
                case 51:
                    if (C(obj, i12, i11)) {
                        i8 = i10 * 53;
                        doubleToLongBits = Double.doubleToLongBits(I(obj, j8));
                        byte[] bArr7 = B4.f15272d;
                        i10 = i8 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (C(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = Float.floatToIntBits(J(obj, j8));
                        i10 = i9 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (C(obj, i12, i11)) {
                        i8 = i10 * 53;
                        doubleToLongBits = V(obj, j8);
                        byte[] bArr8 = B4.f15272d;
                        i10 = i8 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (C(obj, i12, i11)) {
                        i8 = i10 * 53;
                        doubleToLongBits = V(obj, j8);
                        byte[] bArr9 = B4.f15272d;
                        i10 = i8 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (C(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = L(obj, j8);
                        i10 = i9 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (C(obj, i12, i11)) {
                        i8 = i10 * 53;
                        doubleToLongBits = V(obj, j8);
                        byte[] bArr10 = B4.f15272d;
                        i10 = i8 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (C(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = L(obj, j8);
                        i10 = i9 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (C(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = B4.a(D(obj, j8));
                        i10 = i9 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (C(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = ((String) AbstractC2153z5.k(obj, j8)).hashCode();
                        i10 = i9 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (C(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = AbstractC2153z5.k(obj, j8).hashCode();
                        i10 = i9 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (C(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = AbstractC2153z5.k(obj, j8).hashCode();
                        i10 = i9 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (C(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = L(obj, j8);
                        i10 = i9 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (C(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = L(obj, j8);
                        i10 = i9 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (C(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = L(obj, j8);
                        i10 = i9 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (C(obj, i12, i11)) {
                        i8 = i10 * 53;
                        doubleToLongBits = V(obj, j8);
                        byte[] bArr11 = B4.f15272d;
                        i10 = i8 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (C(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = L(obj, j8);
                        i10 = i9 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (C(obj, i12, i11)) {
                        i8 = i10 * 53;
                        doubleToLongBits = V(obj, j8);
                        byte[] bArr12 = B4.f15272d;
                        i10 = i8 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (C(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = AbstractC2153z5.k(obj, j8).hashCode();
                        i10 = i9 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i10 * 53) + this.f15662l.d(obj).hashCode();
        if (!this.f15656f) {
            return hashCode;
        }
        this.f15663m.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2026j5
    public final Object e() {
        return ((AbstractC2112u4) this.f15655e).l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x02f0, code lost:
    
        if (r0 != r24) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02f2, code lost:
    
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r15;
        r1 = r23;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0305, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0335, code lost:
    
        if (r0 != r14) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0354, code lost:
    
        if (r0 != r14) goto L104;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x0095. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2026j5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.measurement.K3 r35) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1956b5.f(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.K3):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0037. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2026j5
    public final int g(Object obj) {
        int y8;
        int y9;
        int z8;
        int y10;
        int y11;
        int y12;
        int y13;
        int J8;
        int y14;
        int z9;
        int y15;
        int y16;
        if (this.f15657g) {
            Unsafe unsafe = f15650q;
            int i8 = 0;
            for (int i9 = 0; i9 < this.f15651a.length; i9 += 3) {
                int U7 = U(i9);
                int T7 = T(U7);
                int i10 = this.f15651a[i9];
                int i11 = U7 & 1048575;
                if (T7 >= EnumC2065o4.f15789M.a() && T7 <= EnumC2065o4.f15802Z.a()) {
                    int i12 = this.f15651a[i9 + 2];
                }
                long j8 = i11;
                switch (T7) {
                    case 0:
                        if (y(obj, i9)) {
                            y8 = AbstractC1991f4.y(i10 << 3);
                            J8 = y8 + 8;
                            i8 += J8;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (y(obj, i9)) {
                            y9 = AbstractC1991f4.y(i10 << 3);
                            J8 = y9 + 4;
                            i8 += J8;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (y(obj, i9)) {
                            z8 = AbstractC1991f4.z(AbstractC2153z5.i(obj, j8));
                            y10 = AbstractC1991f4.y(i10 << 3);
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (y(obj, i9)) {
                            z8 = AbstractC1991f4.z(AbstractC2153z5.i(obj, j8));
                            y10 = AbstractC1991f4.y(i10 << 3);
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (y(obj, i9)) {
                            z8 = AbstractC1991f4.v(AbstractC2153z5.h(obj, j8));
                            y10 = AbstractC1991f4.y(i10 << 3);
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (y(obj, i9)) {
                            y8 = AbstractC1991f4.y(i10 << 3);
                            J8 = y8 + 8;
                            i8 += J8;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (y(obj, i9)) {
                            y9 = AbstractC1991f4.y(i10 << 3);
                            J8 = y9 + 4;
                            i8 += J8;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (y(obj, i9)) {
                            y11 = AbstractC1991f4.y(i10 << 3);
                            J8 = y11 + 1;
                            i8 += J8;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (y(obj, i9)) {
                            Object k8 = AbstractC2153z5.k(obj, j8);
                            if (k8 instanceof X3) {
                                int i13 = i10 << 3;
                                int i14 = AbstractC1991f4.f15702d;
                                int g8 = ((X3) k8).g();
                                y12 = AbstractC1991f4.y(g8) + g8;
                                y13 = AbstractC1991f4.y(i13);
                                J8 = y13 + y12;
                                i8 += J8;
                                break;
                            } else {
                                z8 = AbstractC1991f4.x((String) k8);
                                y10 = AbstractC1991f4.y(i10 << 3);
                                i8 += y10 + z8;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (y(obj, i9)) {
                            J8 = AbstractC2042l5.J(i10, AbstractC2153z5.k(obj, j8), k(i9));
                            i8 += J8;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (y(obj, i9)) {
                            X3 x32 = (X3) AbstractC2153z5.k(obj, j8);
                            int i15 = i10 << 3;
                            int i16 = AbstractC1991f4.f15702d;
                            int g9 = x32.g();
                            y12 = AbstractC1991f4.y(g9) + g9;
                            y13 = AbstractC1991f4.y(i15);
                            J8 = y13 + y12;
                            i8 += J8;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (y(obj, i9)) {
                            z8 = AbstractC1991f4.y(AbstractC2153z5.h(obj, j8));
                            y10 = AbstractC1991f4.y(i10 << 3);
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (y(obj, i9)) {
                            z8 = AbstractC1991f4.v(AbstractC2153z5.h(obj, j8));
                            y10 = AbstractC1991f4.y(i10 << 3);
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (y(obj, i9)) {
                            y9 = AbstractC1991f4.y(i10 << 3);
                            J8 = y9 + 4;
                            i8 += J8;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (y(obj, i9)) {
                            y8 = AbstractC1991f4.y(i10 << 3);
                            J8 = y8 + 8;
                            i8 += J8;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (y(obj, i9)) {
                            int h8 = AbstractC2153z5.h(obj, j8);
                            y10 = AbstractC1991f4.y(i10 << 3);
                            z8 = AbstractC1991f4.y((h8 >> 31) ^ (h8 + h8));
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (y(obj, i9)) {
                            long i17 = AbstractC2153z5.i(obj, j8);
                            y14 = AbstractC1991f4.y(i10 << 3);
                            z9 = AbstractC1991f4.z((i17 + i17) ^ (i17 >> 63));
                            J8 = y14 + z9;
                            i8 += J8;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (y(obj, i9)) {
                            J8 = AbstractC1991f4.u(i10, (Y4) AbstractC2153z5.k(obj, j8), k(i9));
                            i8 += J8;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        J8 = AbstractC2042l5.C(i10, (List) AbstractC2153z5.k(obj, j8), false);
                        i8 += J8;
                        break;
                    case 19:
                        J8 = AbstractC2042l5.A(i10, (List) AbstractC2153z5.k(obj, j8), false);
                        i8 += J8;
                        break;
                    case 20:
                        J8 = AbstractC2042l5.H(i10, (List) AbstractC2153z5.k(obj, j8), false);
                        i8 += J8;
                        break;
                    case 21:
                        J8 = AbstractC2042l5.S(i10, (List) AbstractC2153z5.k(obj, j8), false);
                        i8 += J8;
                        break;
                    case 22:
                        J8 = AbstractC2042l5.F(i10, (List) AbstractC2153z5.k(obj, j8), false);
                        i8 += J8;
                        break;
                    case 23:
                        J8 = AbstractC2042l5.C(i10, (List) AbstractC2153z5.k(obj, j8), false);
                        i8 += J8;
                        break;
                    case 24:
                        J8 = AbstractC2042l5.A(i10, (List) AbstractC2153z5.k(obj, j8), false);
                        i8 += J8;
                        break;
                    case 25:
                        J8 = AbstractC2042l5.w(i10, (List) AbstractC2153z5.k(obj, j8), false);
                        i8 += J8;
                        break;
                    case 26:
                        J8 = AbstractC2042l5.P(i10, (List) AbstractC2153z5.k(obj, j8));
                        i8 += J8;
                        break;
                    case 27:
                        J8 = AbstractC2042l5.K(i10, (List) AbstractC2153z5.k(obj, j8), k(i9));
                        i8 += J8;
                        break;
                    case 28:
                        J8 = AbstractC2042l5.x(i10, (List) AbstractC2153z5.k(obj, j8));
                        i8 += J8;
                        break;
                    case 29:
                        J8 = AbstractC2042l5.Q(i10, (List) AbstractC2153z5.k(obj, j8), false);
                        i8 += J8;
                        break;
                    case 30:
                        J8 = AbstractC2042l5.y(i10, (List) AbstractC2153z5.k(obj, j8), false);
                        i8 += J8;
                        break;
                    case 31:
                        J8 = AbstractC2042l5.A(i10, (List) AbstractC2153z5.k(obj, j8), false);
                        i8 += J8;
                        break;
                    case 32:
                        J8 = AbstractC2042l5.C(i10, (List) AbstractC2153z5.k(obj, j8), false);
                        i8 += J8;
                        break;
                    case 33:
                        J8 = AbstractC2042l5.L(i10, (List) AbstractC2153z5.k(obj, j8), false);
                        i8 += J8;
                        break;
                    case 34:
                        J8 = AbstractC2042l5.N(i10, (List) AbstractC2153z5.k(obj, j8), false);
                        i8 += J8;
                        break;
                    case 35:
                        z8 = AbstractC2042l5.D((List) unsafe.getObject(obj, j8));
                        if (z8 > 0) {
                            int i18 = i10 << 3;
                            y15 = AbstractC1991f4.y(z8);
                            y16 = AbstractC1991f4.y(i18);
                            y10 = y16 + y15;
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        z8 = AbstractC2042l5.B((List) unsafe.getObject(obj, j8));
                        if (z8 > 0) {
                            int i19 = i10 << 3;
                            y15 = AbstractC1991f4.y(z8);
                            y16 = AbstractC1991f4.y(i19);
                            y10 = y16 + y15;
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        z8 = AbstractC2042l5.I((List) unsafe.getObject(obj, j8));
                        if (z8 > 0) {
                            int i20 = i10 << 3;
                            y15 = AbstractC1991f4.y(z8);
                            y16 = AbstractC1991f4.y(i20);
                            y10 = y16 + y15;
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        z8 = AbstractC2042l5.T((List) unsafe.getObject(obj, j8));
                        if (z8 > 0) {
                            int i21 = i10 << 3;
                            y15 = AbstractC1991f4.y(z8);
                            y16 = AbstractC1991f4.y(i21);
                            y10 = y16 + y15;
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        z8 = AbstractC2042l5.G((List) unsafe.getObject(obj, j8));
                        if (z8 > 0) {
                            int i22 = i10 << 3;
                            y15 = AbstractC1991f4.y(z8);
                            y16 = AbstractC1991f4.y(i22);
                            y10 = y16 + y15;
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        z8 = AbstractC2042l5.D((List) unsafe.getObject(obj, j8));
                        if (z8 > 0) {
                            int i23 = i10 << 3;
                            y15 = AbstractC1991f4.y(z8);
                            y16 = AbstractC1991f4.y(i23);
                            y10 = y16 + y15;
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        z8 = AbstractC2042l5.B((List) unsafe.getObject(obj, j8));
                        if (z8 > 0) {
                            int i24 = i10 << 3;
                            y15 = AbstractC1991f4.y(z8);
                            y16 = AbstractC1991f4.y(i24);
                            y10 = y16 + y15;
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        List list = (List) unsafe.getObject(obj, j8);
                        int i25 = AbstractC2042l5.f15760d;
                        z8 = list.size();
                        if (z8 > 0) {
                            int i26 = i10 << 3;
                            y15 = AbstractC1991f4.y(z8);
                            y16 = AbstractC1991f4.y(i26);
                            y10 = y16 + y15;
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        z8 = AbstractC2042l5.R((List) unsafe.getObject(obj, j8));
                        if (z8 > 0) {
                            int i27 = i10 << 3;
                            y15 = AbstractC1991f4.y(z8);
                            y16 = AbstractC1991f4.y(i27);
                            y10 = y16 + y15;
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        z8 = AbstractC2042l5.z((List) unsafe.getObject(obj, j8));
                        if (z8 > 0) {
                            int i28 = i10 << 3;
                            y15 = AbstractC1991f4.y(z8);
                            y16 = AbstractC1991f4.y(i28);
                            y10 = y16 + y15;
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        z8 = AbstractC2042l5.B((List) unsafe.getObject(obj, j8));
                        if (z8 > 0) {
                            int i29 = i10 << 3;
                            y15 = AbstractC1991f4.y(z8);
                            y16 = AbstractC1991f4.y(i29);
                            y10 = y16 + y15;
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        z8 = AbstractC2042l5.D((List) unsafe.getObject(obj, j8));
                        if (z8 > 0) {
                            int i30 = i10 << 3;
                            y15 = AbstractC1991f4.y(z8);
                            y16 = AbstractC1991f4.y(i30);
                            y10 = y16 + y15;
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        z8 = AbstractC2042l5.M((List) unsafe.getObject(obj, j8));
                        if (z8 > 0) {
                            int i31 = i10 << 3;
                            y15 = AbstractC1991f4.y(z8);
                            y16 = AbstractC1991f4.y(i31);
                            y10 = y16 + y15;
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        z8 = AbstractC2042l5.O((List) unsafe.getObject(obj, j8));
                        if (z8 > 0) {
                            int i32 = i10 << 3;
                            y15 = AbstractC1991f4.y(z8);
                            y16 = AbstractC1991f4.y(i32);
                            y10 = y16 + y15;
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        J8 = AbstractC2042l5.E(i10, (List) AbstractC2153z5.k(obj, j8), k(i9));
                        i8 += J8;
                        break;
                    case 50:
                        T4.a(i10, AbstractC2153z5.k(obj, j8), l(i9));
                        break;
                    case 51:
                        if (C(obj, i10, i9)) {
                            y8 = AbstractC1991f4.y(i10 << 3);
                            J8 = y8 + 8;
                            i8 += J8;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (C(obj, i10, i9)) {
                            y9 = AbstractC1991f4.y(i10 << 3);
                            J8 = y9 + 4;
                            i8 += J8;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (C(obj, i10, i9)) {
                            z8 = AbstractC1991f4.z(V(obj, j8));
                            y10 = AbstractC1991f4.y(i10 << 3);
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (C(obj, i10, i9)) {
                            z8 = AbstractC1991f4.z(V(obj, j8));
                            y10 = AbstractC1991f4.y(i10 << 3);
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (C(obj, i10, i9)) {
                            z8 = AbstractC1991f4.v(L(obj, j8));
                            y10 = AbstractC1991f4.y(i10 << 3);
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (C(obj, i10, i9)) {
                            y8 = AbstractC1991f4.y(i10 << 3);
                            J8 = y8 + 8;
                            i8 += J8;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (C(obj, i10, i9)) {
                            y9 = AbstractC1991f4.y(i10 << 3);
                            J8 = y9 + 4;
                            i8 += J8;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (C(obj, i10, i9)) {
                            y11 = AbstractC1991f4.y(i10 << 3);
                            J8 = y11 + 1;
                            i8 += J8;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (C(obj, i10, i9)) {
                            Object k9 = AbstractC2153z5.k(obj, j8);
                            if (k9 instanceof X3) {
                                int i33 = i10 << 3;
                                int i34 = AbstractC1991f4.f15702d;
                                int g10 = ((X3) k9).g();
                                y12 = AbstractC1991f4.y(g10) + g10;
                                y13 = AbstractC1991f4.y(i33);
                                J8 = y13 + y12;
                                i8 += J8;
                                break;
                            } else {
                                z8 = AbstractC1991f4.x((String) k9);
                                y10 = AbstractC1991f4.y(i10 << 3);
                                i8 += y10 + z8;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (C(obj, i10, i9)) {
                            J8 = AbstractC2042l5.J(i10, AbstractC2153z5.k(obj, j8), k(i9));
                            i8 += J8;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (C(obj, i10, i9)) {
                            X3 x33 = (X3) AbstractC2153z5.k(obj, j8);
                            int i35 = i10 << 3;
                            int i36 = AbstractC1991f4.f15702d;
                            int g11 = x33.g();
                            y12 = AbstractC1991f4.y(g11) + g11;
                            y13 = AbstractC1991f4.y(i35);
                            J8 = y13 + y12;
                            i8 += J8;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (C(obj, i10, i9)) {
                            z8 = AbstractC1991f4.y(L(obj, j8));
                            y10 = AbstractC1991f4.y(i10 << 3);
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (C(obj, i10, i9)) {
                            z8 = AbstractC1991f4.v(L(obj, j8));
                            y10 = AbstractC1991f4.y(i10 << 3);
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (C(obj, i10, i9)) {
                            y9 = AbstractC1991f4.y(i10 << 3);
                            J8 = y9 + 4;
                            i8 += J8;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (C(obj, i10, i9)) {
                            y8 = AbstractC1991f4.y(i10 << 3);
                            J8 = y8 + 8;
                            i8 += J8;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (C(obj, i10, i9)) {
                            int L8 = L(obj, j8);
                            y10 = AbstractC1991f4.y(i10 << 3);
                            z8 = AbstractC1991f4.y((L8 >> 31) ^ (L8 + L8));
                            i8 += y10 + z8;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (C(obj, i10, i9)) {
                            long V7 = V(obj, j8);
                            y14 = AbstractC1991f4.y(i10 << 3);
                            z9 = AbstractC1991f4.z((V7 + V7) ^ (V7 >> 63));
                            J8 = y14 + z9;
                            i8 += J8;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (C(obj, i10, i9)) {
                            J8 = AbstractC1991f4.u(i10, (Y4) AbstractC2153z5.k(obj, j8), k(i9));
                            i8 += J8;
                            break;
                        } else {
                            break;
                        }
                }
            }
            AbstractC2074p5 abstractC2074p5 = this.f15662l;
            return i8 + abstractC2074p5.a(abstractC2074p5.d(obj));
        }
        return K(obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2026j5
    public final void h(Object obj, Object obj2) {
        p(obj);
        obj2.getClass();
        for (int i8 = 0; i8 < this.f15651a.length; i8 += 3) {
            int U7 = U(i8);
            int i9 = this.f15651a[i8];
            long j8 = 1048575 & U7;
            switch (T(U7)) {
                case 0:
                    if (y(obj2, i8)) {
                        AbstractC2153z5.t(obj, j8, AbstractC2153z5.f(obj2, j8));
                        s(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (y(obj2, i8)) {
                        AbstractC2153z5.u(obj, j8, AbstractC2153z5.g(obj2, j8));
                        s(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (y(obj2, i8)) {
                        AbstractC2153z5.w(obj, j8, AbstractC2153z5.i(obj2, j8));
                        s(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (y(obj2, i8)) {
                        AbstractC2153z5.w(obj, j8, AbstractC2153z5.i(obj2, j8));
                        s(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (y(obj2, i8)) {
                        AbstractC2153z5.v(obj, j8, AbstractC2153z5.h(obj2, j8));
                        s(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (y(obj2, i8)) {
                        AbstractC2153z5.w(obj, j8, AbstractC2153z5.i(obj2, j8));
                        s(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (y(obj2, i8)) {
                        AbstractC2153z5.v(obj, j8, AbstractC2153z5.h(obj2, j8));
                        s(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (y(obj2, i8)) {
                        AbstractC2153z5.r(obj, j8, AbstractC2153z5.B(obj2, j8));
                        s(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (y(obj2, i8)) {
                        AbstractC2153z5.x(obj, j8, AbstractC2153z5.k(obj2, j8));
                        s(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    q(obj, obj2, i8);
                    break;
                case 10:
                    if (y(obj2, i8)) {
                        AbstractC2153z5.x(obj, j8, AbstractC2153z5.k(obj2, j8));
                        s(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (y(obj2, i8)) {
                        AbstractC2153z5.v(obj, j8, AbstractC2153z5.h(obj2, j8));
                        s(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (y(obj2, i8)) {
                        AbstractC2153z5.v(obj, j8, AbstractC2153z5.h(obj2, j8));
                        s(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (y(obj2, i8)) {
                        AbstractC2153z5.v(obj, j8, AbstractC2153z5.h(obj2, j8));
                        s(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (y(obj2, i8)) {
                        AbstractC2153z5.w(obj, j8, AbstractC2153z5.i(obj2, j8));
                        s(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (y(obj2, i8)) {
                        AbstractC2153z5.v(obj, j8, AbstractC2153z5.h(obj2, j8));
                        s(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (y(obj2, i8)) {
                        AbstractC2153z5.w(obj, j8, AbstractC2153z5.i(obj2, j8));
                        s(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    q(obj, obj2, i8);
                    break;
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
                    this.f15661k.b(obj, obj2, j8);
                    break;
                case 50:
                    int i10 = AbstractC2042l5.f15760d;
                    AbstractC2153z5.x(obj, j8, T4.b(AbstractC2153z5.k(obj, j8), AbstractC2153z5.k(obj2, j8)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (C(obj2, i9, i8)) {
                        AbstractC2153z5.x(obj, j8, AbstractC2153z5.k(obj2, j8));
                        t(obj, i9, i8);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    r(obj, obj2, i8);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (C(obj2, i9, i8)) {
                        AbstractC2153z5.x(obj, j8, AbstractC2153z5.k(obj2, j8));
                        t(obj, i9, i8);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    r(obj, obj2, i8);
                    break;
            }
        }
        AbstractC2042l5.b(this.f15662l, obj, obj2);
        if (!this.f15656f) {
            return;
        }
        this.f15663m.a(obj2);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c0 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2026j5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(java.lang.Object r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1956b5.i(java.lang.Object, java.lang.Object):boolean");
    }
}
