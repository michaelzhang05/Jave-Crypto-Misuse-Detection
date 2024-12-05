package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.q1;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: f, reason: collision with root package name */
    private static final k1 f5536f = new k1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f5537a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f5538b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f5539c;

    /* renamed from: d, reason: collision with root package name */
    private int f5540d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5541e;

    private k1() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int i6) {
        int[] iArr = this.f5538b;
        if (i6 > iArr.length) {
            int i7 = this.f5537a;
            int i8 = i7 + (i7 / 2);
            if (i8 >= i6) {
                i6 = i8;
            }
            if (i6 < 8) {
                i6 = 8;
            }
            this.f5538b = Arrays.copyOf(iArr, i6);
            this.f5539c = Arrays.copyOf(this.f5539c, i6);
        }
    }

    public static k1 c() {
        return f5536f;
    }

    private static int f(int[] iArr, int i6) {
        int i7 = 17;
        for (int i8 = 0; i8 < i6; i8++) {
            i7 = (i7 * 31) + iArr[i8];
        }
        return i7;
    }

    private static int g(Object[] objArr, int i6) {
        int i7 = 17;
        for (int i8 = 0; i8 < i6; i8++) {
            i7 = (i7 * 31) + objArr[i8].hashCode();
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k1 j(k1 k1Var, k1 k1Var2) {
        int i6 = k1Var.f5537a + k1Var2.f5537a;
        int[] copyOf = Arrays.copyOf(k1Var.f5538b, i6);
        System.arraycopy(k1Var2.f5538b, 0, copyOf, k1Var.f5537a, k1Var2.f5537a);
        Object[] copyOf2 = Arrays.copyOf(k1Var.f5539c, i6);
        System.arraycopy(k1Var2.f5539c, 0, copyOf2, k1Var.f5537a, k1Var2.f5537a);
        return new k1(i6, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k1 k() {
        return new k1();
    }

    private static boolean l(Object[] objArr, Object[] objArr2, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            if (!objArr[i7].equals(objArr2[i7])) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(int[] iArr, int[] iArr2, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            if (iArr[i7] != iArr2[i7]) {
                return false;
            }
        }
        return true;
    }

    private static void q(int i6, Object obj, q1 q1Var) {
        int a6 = p1.a(i6);
        int b6 = p1.b(i6);
        if (b6 == 0) {
            q1Var.f(a6, ((Long) obj).longValue());
            return;
        }
        if (b6 == 1) {
            q1Var.j(a6, ((Long) obj).longValue());
            return;
        }
        if (b6 == 2) {
            q1Var.a(a6, (h) obj);
            return;
        }
        if (b6 != 3) {
            if (b6 != 5) {
                throw new RuntimeException(a0.e());
            }
            q1Var.C(a6, ((Integer) obj).intValue());
        } else if (q1Var.n() == q1.a.ASCENDING) {
            q1Var.s(a6);
            ((k1) obj).r(q1Var);
            q1Var.t(a6);
        } else {
            q1Var.t(a6);
            ((k1) obj).r(q1Var);
            q1Var.s(a6);
        }
    }

    void a() {
        if (!this.f5541e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int O;
        int i6 = this.f5540d;
        if (i6 != -1) {
            return i6;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.f5537a; i8++) {
            int i9 = this.f5538b[i8];
            int a6 = p1.a(i9);
            int b6 = p1.b(i9);
            if (b6 == 0) {
                O = k.O(a6, ((Long) this.f5539c[i8]).longValue());
            } else if (b6 == 1) {
                O = k.n(a6, ((Long) this.f5539c[i8]).longValue());
            } else if (b6 == 2) {
                O = k.f(a6, (h) this.f5539c[i8]);
            } else if (b6 == 3) {
                O = (k.L(a6) * 2) + ((k1) this.f5539c[i8]).d();
            } else {
                if (b6 != 5) {
                    throw new IllegalStateException(a0.e());
                }
                O = k.l(a6, ((Integer) this.f5539c[i8]).intValue());
            }
            i7 += O;
        }
        this.f5540d = i7;
        return i7;
    }

    public int e() {
        int i6 = this.f5540d;
        if (i6 != -1) {
            return i6;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.f5537a; i8++) {
            i7 += k.A(p1.a(this.f5538b[i8]), (h) this.f5539c[i8]);
        }
        this.f5540d = i7;
        return i7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        int i6 = this.f5537a;
        return i6 == k1Var.f5537a && o(this.f5538b, k1Var.f5538b, i6) && l(this.f5539c, k1Var.f5539c, this.f5537a);
    }

    public void h() {
        this.f5541e = false;
    }

    public int hashCode() {
        int i6 = this.f5537a;
        return ((((527 + i6) * 31) + f(this.f5538b, i6)) * 31) + g(this.f5539c, this.f5537a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k1 i(k1 k1Var) {
        if (k1Var.equals(c())) {
            return this;
        }
        a();
        int i6 = this.f5537a + k1Var.f5537a;
        b(i6);
        System.arraycopy(k1Var.f5538b, 0, this.f5538b, this.f5537a, k1Var.f5537a);
        System.arraycopy(k1Var.f5539c, 0, this.f5539c, this.f5537a, k1Var.f5537a);
        this.f5537a = i6;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(StringBuilder sb, int i6) {
        for (int i7 = 0; i7 < this.f5537a; i7++) {
            q0.d(sb, i6, String.valueOf(p1.a(this.f5538b[i7])), this.f5539c[i7]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(int i6, Object obj) {
        a();
        b(this.f5537a + 1);
        int[] iArr = this.f5538b;
        int i7 = this.f5537a;
        iArr[i7] = i6;
        this.f5539c[i7] = obj;
        this.f5537a = i7 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(q1 q1Var) {
        if (q1Var.n() == q1.a.DESCENDING) {
            for (int i6 = this.f5537a - 1; i6 >= 0; i6--) {
                q1Var.m(p1.a(this.f5538b[i6]), this.f5539c[i6]);
            }
            return;
        }
        for (int i7 = 0; i7 < this.f5537a; i7++) {
            q1Var.m(p1.a(this.f5538b[i7]), this.f5539c[i7]);
        }
    }

    public void r(q1 q1Var) {
        if (this.f5537a == 0) {
            return;
        }
        if (q1Var.n() == q1.a.ASCENDING) {
            for (int i6 = 0; i6 < this.f5537a; i6++) {
                q(this.f5538b[i6], this.f5539c[i6], q1Var);
            }
            return;
        }
        for (int i7 = this.f5537a - 1; i7 >= 0; i7--) {
            q(this.f5538b[i7], this.f5539c[i7], q1Var);
        }
    }

    private k1(int i6, int[] iArr, Object[] objArr, boolean z5) {
        this.f5540d = -1;
        this.f5537a = i6;
        this.f5538b = iArr;
        this.f5539c = objArr;
        this.f5541e = z5;
    }
}
