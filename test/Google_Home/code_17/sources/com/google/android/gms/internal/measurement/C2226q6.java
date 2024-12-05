package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.q6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2226q6 {

    /* renamed from: f, reason: collision with root package name */
    private static final C2226q6 f16781f = new C2226q6(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f16782a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f16783b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f16784c;

    /* renamed from: d, reason: collision with root package name */
    private int f16785d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16786e;

    private C2226q6() {
        this(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2226q6 c(C2226q6 c2226q6, C2226q6 c2226q62) {
        int i8 = c2226q6.f16782a + c2226q62.f16782a;
        int[] copyOf = Arrays.copyOf(c2226q6.f16783b, i8);
        System.arraycopy(c2226q62.f16783b, 0, copyOf, c2226q6.f16782a, c2226q62.f16782a);
        Object[] copyOf2 = Arrays.copyOf(c2226q6.f16784c, i8);
        System.arraycopy(c2226q62.f16784c, 0, copyOf2, c2226q6.f16782a, c2226q62.f16782a);
        return new C2226q6(i8, copyOf, copyOf2, true);
    }

    private final void d(int i8) {
        int[] iArr = this.f16783b;
        if (i8 > iArr.length) {
            int i9 = this.f16782a;
            int i10 = i9 + (i9 / 2);
            if (i10 >= i8) {
                i8 = i10;
            }
            if (i8 < 8) {
                i8 = 8;
            }
            this.f16783b = Arrays.copyOf(iArr, i8);
            this.f16784c = Arrays.copyOf(this.f16784c, i8);
        }
    }

    private static void f(int i8, Object obj, N6 n62) {
        int i9 = i8 >>> 3;
        int i10 = i8 & 7;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 5) {
                            n62.f(i9, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(C2171k5.a());
                    }
                    if (n62.w() == 1) {
                        n62.g(i9);
                        ((C2226q6) obj).j(n62);
                        n62.a(i9);
                        return;
                    } else {
                        n62.a(i9);
                        ((C2226q6) obj).j(n62);
                        n62.g(i9);
                        return;
                    }
                }
                n62.C(i9, (AbstractC2241s4) obj);
                return;
            }
            n62.x(i9, ((Long) obj).longValue());
            return;
        }
        n62.e(i9, ((Long) obj).longValue());
    }

    public static C2226q6 k() {
        return f16781f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2226q6 l() {
        return new C2226q6();
    }

    private final void n() {
        if (this.f16786e) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final int a() {
        int m02;
        int i8 = this.f16785d;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f16782a; i10++) {
            int i11 = this.f16783b[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                m02 = K4.h0(i12, ((Integer) this.f16784c[i10]).intValue());
                            } else {
                                throw new IllegalStateException(C2171k5.a());
                            }
                        } else {
                            m02 = (K4.s0(i12) << 1) + ((C2226q6) this.f16784c[i10]).a();
                        }
                    } else {
                        m02 = K4.Q(i12, (AbstractC2241s4) this.f16784c[i10]);
                    }
                } else {
                    m02 = K4.P(i12, ((Long) this.f16784c[i10]).longValue());
                }
            } else {
                m02 = K4.m0(i12, ((Long) this.f16784c[i10]).longValue());
            }
            i9 += m02;
        }
        this.f16785d = i9;
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C2226q6 b(C2226q6 c2226q6) {
        if (c2226q6.equals(f16781f)) {
            return this;
        }
        n();
        int i8 = this.f16782a + c2226q6.f16782a;
        d(i8);
        System.arraycopy(c2226q6.f16783b, 0, this.f16783b, this.f16782a, c2226q6.f16782a);
        System.arraycopy(c2226q6.f16784c, 0, this.f16784c, this.f16782a, c2226q6.f16782a);
        this.f16782a = i8;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i8, Object obj) {
        n();
        d(this.f16782a + 1);
        int[] iArr = this.f16783b;
        int i9 = this.f16782a;
        iArr[i9] = i8;
        this.f16784c[i9] = obj;
        this.f16782a = i9 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2226q6)) {
            return false;
        }
        C2226q6 c2226q6 = (C2226q6) obj;
        int i8 = this.f16782a;
        if (i8 == c2226q6.f16782a) {
            int[] iArr = this.f16783b;
            int[] iArr2 = c2226q6.f16783b;
            int i9 = 0;
            while (true) {
                if (i9 < i8) {
                    if (iArr[i9] != iArr2[i9]) {
                        break;
                    }
                    i9++;
                } else {
                    Object[] objArr = this.f16784c;
                    Object[] objArr2 = c2226q6.f16784c;
                    int i10 = this.f16782a;
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (objArr[i11].equals(objArr2[i11])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(N6 n62) {
        if (n62.w() == 2) {
            for (int i8 = this.f16782a - 1; i8 >= 0; i8--) {
                n62.l(this.f16783b[i8] >>> 3, this.f16784c[i8]);
            }
            return;
        }
        for (int i9 = 0; i9 < this.f16782a; i9++) {
            n62.l(this.f16783b[i9] >>> 3, this.f16784c[i9]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < this.f16782a; i9++) {
            J5.d(sb, i8, String.valueOf(this.f16783b[i9] >>> 3), this.f16784c[i9]);
        }
    }

    public final int hashCode() {
        int i8 = this.f16782a;
        int i9 = (i8 + 527) * 31;
        int[] iArr = this.f16783b;
        int i10 = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i8; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i9 + i11) * 31;
        Object[] objArr = this.f16784c;
        int i14 = this.f16782a;
        for (int i15 = 0; i15 < i14; i15++) {
            i10 = (i10 * 31) + objArr[i15].hashCode();
        }
        return i13 + i10;
    }

    public final int i() {
        int i8 = this.f16785d;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f16782a; i10++) {
            i9 += K4.Z(this.f16783b[i10] >>> 3, (AbstractC2241s4) this.f16784c[i10]);
        }
        this.f16785d = i9;
        return i9;
    }

    public final void j(N6 n62) {
        if (this.f16782a == 0) {
            return;
        }
        if (n62.w() == 1) {
            for (int i8 = 0; i8 < this.f16782a; i8++) {
                f(this.f16783b[i8], this.f16784c[i8], n62);
            }
            return;
        }
        for (int i9 = this.f16782a - 1; i9 >= 0; i9--) {
            f(this.f16783b[i9], this.f16784c[i9], n62);
        }
    }

    public final void m() {
        if (this.f16786e) {
            this.f16786e = false;
        }
    }

    private C2226q6(int i8, int[] iArr, Object[] objArr, boolean z8) {
        this.f16785d = -1;
        this.f16782a = i8;
        this.f16783b = iArr;
        this.f16784c = objArr;
        this.f16786e = z8;
    }
}
