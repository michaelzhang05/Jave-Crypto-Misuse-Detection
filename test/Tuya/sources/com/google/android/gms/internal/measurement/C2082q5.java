package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.q5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2082q5 {

    /* renamed from: f, reason: collision with root package name */
    private static final C2082q5 f15858f = new C2082q5(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f15859a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f15860b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f15861c;

    /* renamed from: d, reason: collision with root package name */
    private int f15862d = -1;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15863e;

    private C2082q5(int i8, int[] iArr, Object[] objArr, boolean z8) {
        this.f15859a = i8;
        this.f15860b = iArr;
        this.f15861c = objArr;
        this.f15863e = z8;
    }

    public static C2082q5 c() {
        return f15858f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2082q5 e(C2082q5 c2082q5, C2082q5 c2082q52) {
        int i8 = c2082q5.f15859a + c2082q52.f15859a;
        int[] copyOf = Arrays.copyOf(c2082q5.f15860b, i8);
        System.arraycopy(c2082q52.f15860b, 0, copyOf, c2082q5.f15859a, c2082q52.f15859a);
        Object[] copyOf2 = Arrays.copyOf(c2082q5.f15861c, i8);
        System.arraycopy(c2082q52.f15861c, 0, copyOf2, c2082q5.f15859a, c2082q52.f15859a);
        return new C2082q5(i8, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2082q5 f() {
        return new C2082q5(0, new int[8], new Object[8], true);
    }

    private final void l(int i8) {
        int[] iArr = this.f15860b;
        if (i8 > iArr.length) {
            int i9 = this.f15859a;
            int i10 = i9 + (i9 / 2);
            if (i10 >= i8) {
                i8 = i10;
            }
            if (i8 < 8) {
                i8 = 8;
            }
            this.f15860b = Arrays.copyOf(iArr, i8);
            this.f15861c = Arrays.copyOf(this.f15861c, i8);
        }
    }

    public final int a() {
        int z8;
        int y8;
        int i8;
        int i9 = this.f15862d;
        if (i9 == -1) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f15859a; i11++) {
                int i12 = this.f15860b[i11];
                int i13 = i12 >>> 3;
                int i14 = i12 & 7;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                if (i14 == 5) {
                                    ((Integer) this.f15861c[i11]).intValue();
                                    i8 = AbstractC1991f4.y(i13 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(D4.a());
                                }
                            } else {
                                int i15 = i13 << 3;
                                int i16 = AbstractC1991f4.f15702d;
                                z8 = ((C2082q5) this.f15861c[i11]).a();
                                int y9 = AbstractC1991f4.y(i15);
                                y8 = y9 + y9;
                            }
                        } else {
                            X3 x32 = (X3) this.f15861c[i11];
                            int i17 = AbstractC1991f4.f15702d;
                            int g8 = x32.g();
                            i8 = AbstractC1991f4.y(i13 << 3) + AbstractC1991f4.y(g8) + g8;
                        }
                    } else {
                        ((Long) this.f15861c[i11]).longValue();
                        i8 = AbstractC1991f4.y(i13 << 3) + 8;
                    }
                    i10 += i8;
                } else {
                    int i18 = i13 << 3;
                    z8 = AbstractC1991f4.z(((Long) this.f15861c[i11]).longValue());
                    y8 = AbstractC1991f4.y(i18);
                }
                i8 = y8 + z8;
                i10 += i8;
            }
            this.f15862d = i10;
            return i10;
        }
        return i9;
    }

    public final int b() {
        int i8 = this.f15862d;
        if (i8 == -1) {
            int i9 = 0;
            for (int i10 = 0; i10 < this.f15859a; i10++) {
                int i11 = this.f15860b[i10] >>> 3;
                X3 x32 = (X3) this.f15861c[i10];
                int i12 = AbstractC1991f4.f15702d;
                int g8 = x32.g();
                int y8 = AbstractC1991f4.y(g8) + g8;
                int y9 = AbstractC1991f4.y(16);
                int y10 = AbstractC1991f4.y(i11);
                int y11 = AbstractC1991f4.y(8);
                i9 += y11 + y11 + y9 + y10 + AbstractC1991f4.y(24) + y8;
            }
            this.f15862d = i9;
            return i9;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C2082q5 d(C2082q5 c2082q5) {
        if (c2082q5.equals(f15858f)) {
            return this;
        }
        g();
        int i8 = this.f15859a + c2082q5.f15859a;
        l(i8);
        System.arraycopy(c2082q5.f15860b, 0, this.f15860b, this.f15859a, c2082q5.f15859a);
        System.arraycopy(c2082q5.f15861c, 0, this.f15861c, this.f15859a, c2082q5.f15859a);
        this.f15859a = i8;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2082q5)) {
            return false;
        }
        C2082q5 c2082q5 = (C2082q5) obj;
        int i8 = this.f15859a;
        if (i8 == c2082q5.f15859a) {
            int[] iArr = this.f15860b;
            int[] iArr2 = c2082q5.f15860b;
            int i9 = 0;
            while (true) {
                if (i9 < i8) {
                    if (iArr[i9] != iArr2[i9]) {
                        break;
                    }
                    i9++;
                } else {
                    Object[] objArr = this.f15861c;
                    Object[] objArr2 = c2082q5.f15861c;
                    int i10 = this.f15859a;
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

    final void g() {
        if (this.f15863e) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f15863e) {
            this.f15863e = false;
        }
    }

    public final int hashCode() {
        int i8 = this.f15859a;
        int i9 = i8 + 527;
        int[] iArr = this.f15860b;
        int i10 = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i8; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i9 * 31) + i11;
        Object[] objArr = this.f15861c;
        int i14 = this.f15859a;
        for (int i15 = 0; i15 < i14; i15++) {
            i10 = (i10 * 31) + objArr[i15].hashCode();
        }
        return (i13 * 31) + i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < this.f15859a; i9++) {
            AbstractC1947a5.b(sb, i8, String.valueOf(this.f15860b[i9] >>> 3), this.f15861c[i9]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(int i8, Object obj) {
        g();
        l(this.f15859a + 1);
        int[] iArr = this.f15860b;
        int i9 = this.f15859a;
        iArr[i9] = i8;
        this.f15861c[i9] = obj;
        this.f15859a = i9 + 1;
    }

    public final void k(G5 g52) {
        if (this.f15859a != 0) {
            for (int i8 = 0; i8 < this.f15859a; i8++) {
                int i9 = this.f15860b[i8];
                Object obj = this.f15861c[i8];
                int i10 = i9 & 7;
                int i11 = i9 >>> 3;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 5) {
                                    g52.e(i11, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(D4.a());
                                }
                            } else {
                                g52.E(i11);
                                ((C2082q5) obj).k(g52);
                                g52.J(i11);
                            }
                        } else {
                            g52.A(i11, (X3) obj);
                        }
                    } else {
                        g52.G(i11, ((Long) obj).longValue());
                    }
                } else {
                    g52.i(i11, ((Long) obj).longValue());
                }
            }
        }
    }
}
