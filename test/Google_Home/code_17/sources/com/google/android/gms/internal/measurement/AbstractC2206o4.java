package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.o4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2206o4 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f16757a = 100;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double a(byte[] bArr, int i8) {
        return Double.longBitsToDouble(t(bArr, i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i8, byte[] bArr, int i9, int i10, InterfaceC2180l5 interfaceC2180l5, C2197n4 c2197n4) {
        C2121f5 c2121f5 = (C2121f5) interfaceC2180l5;
        int r8 = r(bArr, i9, c2197n4);
        c2121f5.f(c2197n4.f16736a);
        while (r8 < i10) {
            int r9 = r(bArr, r8, c2197n4);
            if (i8 != c2197n4.f16736a) {
                break;
            }
            r8 = r(bArr, r9, c2197n4);
            c2121f5.f(c2197n4.f16736a);
        }
        return r8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i8, byte[] bArr, int i9, int i10, C2226q6 c2226q6, C2197n4 c2197n4) {
        if ((i8 >>> 3) != 0) {
            int i11 = i8 & 7;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 5) {
                                c2226q6.e(i8, Integer.valueOf(q(bArr, i9)));
                                return i9 + 4;
                            }
                            throw C2171k5.b();
                        }
                        C2226q6 l8 = C2226q6.l();
                        int i12 = (i8 & (-8)) | 4;
                        int i13 = c2197n4.f16740e + 1;
                        c2197n4.f16740e = i13;
                        m(i13);
                        int i14 = 0;
                        while (true) {
                            if (i9 >= i10) {
                                break;
                            }
                            int r8 = r(bArr, i9, c2197n4);
                            int i15 = c2197n4.f16736a;
                            i14 = i15;
                            if (i15 != i12) {
                                int c8 = c(i14, bArr, r8, i10, l8, c2197n4);
                                i14 = i15;
                                i9 = c8;
                            } else {
                                i9 = r8;
                                break;
                            }
                        }
                        c2197n4.f16740e--;
                        if (i9 <= i10 && i14 == i12) {
                            c2226q6.e(i8, l8);
                            return i9;
                        }
                        throw C2171k5.e();
                    }
                    int r9 = r(bArr, i9, c2197n4);
                    int i16 = c2197n4.f16736a;
                    if (i16 >= 0) {
                        if (i16 <= bArr.length - r9) {
                            if (i16 == 0) {
                                c2226q6.e(i8, AbstractC2241s4.f16818b);
                            } else {
                                c2226q6.e(i8, AbstractC2241s4.n(bArr, r9, i16));
                            }
                            return r9 + i16;
                        }
                        throw C2171k5.g();
                    }
                    throw C2171k5.d();
                }
                c2226q6.e(i8, Long.valueOf(t(bArr, i9)));
                return i9 + 8;
            }
            int s8 = s(bArr, i9, c2197n4);
            c2226q6.e(i8, Long.valueOf(c2197n4.f16737b));
            return s8;
        }
        throw C2171k5.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i8, byte[] bArr, int i9, int i10, Object obj, I5 i52, AbstractC2234r6 abstractC2234r6, C2197n4 c2197n4) {
        c2197n4.f16739d.b(i52, i8 >>> 3);
        return c(i8, bArr, i9, i10, L5.I(obj), c2197n4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(int i8, byte[] bArr, int i9, C2197n4 c2197n4) {
        int i10 = i8 & 127;
        int i11 = i9 + 1;
        byte b8 = bArr[i9];
        if (b8 >= 0) {
            c2197n4.f16736a = i10 | (b8 << 7);
            return i11;
        }
        int i12 = i10 | ((b8 & Byte.MAX_VALUE) << 7);
        int i13 = i9 + 2;
        byte b9 = bArr[i11];
        if (b9 >= 0) {
            c2197n4.f16736a = i12 | (b9 << 14);
            return i13;
        }
        int i14 = i12 | ((b9 & Byte.MAX_VALUE) << 14);
        int i15 = i9 + 3;
        byte b10 = bArr[i13];
        if (b10 >= 0) {
            c2197n4.f16736a = i14 | (b10 << 21);
            return i15;
        }
        int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 21);
        int i17 = i9 + 4;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            c2197n4.f16736a = i16 | (b11 << 28);
            return i17;
        }
        int i18 = i16 | ((b11 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i19 = i17 + 1;
            if (bArr[i17] >= 0) {
                c2197n4.f16736a = i18;
                return i19;
            }
            i17 = i19;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(Y5 y52, int i8, byte[] bArr, int i9, int i10, InterfaceC2180l5 interfaceC2180l5, C2197n4 c2197n4) {
        int i11 = (i8 & (-8)) | 4;
        int g8 = g(y52, bArr, i9, i10, i11, c2197n4);
        interfaceC2180l5.add(c2197n4.f16738c);
        while (g8 < i10) {
            int r8 = r(bArr, g8, c2197n4);
            if (i8 != c2197n4.f16736a) {
                break;
            }
            g8 = g(y52, bArr, r8, i10, i11, c2197n4);
            interfaceC2180l5.add(c2197n4.f16738c);
        }
        return g8;
    }

    private static int g(Y5 y52, byte[] bArr, int i8, int i9, int i10, C2197n4 c2197n4) {
        Object w8 = y52.w();
        int i11 = i(w8, y52, bArr, i8, i9, i10, c2197n4);
        y52.c(w8);
        c2197n4.f16738c = w8;
        return i11;
    }

    static int h(Y5 y52, byte[] bArr, int i8, int i9, C2197n4 c2197n4) {
        Object w8 = y52.w();
        int j8 = j(w8, y52, bArr, i8, i9, c2197n4);
        y52.c(w8);
        c2197n4.f16738c = w8;
        return j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(Object obj, Y5 y52, byte[] bArr, int i8, int i9, int i10, C2197n4 c2197n4) {
        L5 l52 = (L5) y52;
        int i11 = c2197n4.f16740e + 1;
        c2197n4.f16740e = i11;
        m(i11);
        int l8 = l52.l(obj, bArr, i8, i9, i10, c2197n4);
        c2197n4.f16740e--;
        c2197n4.f16738c = obj;
        return l8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(Object obj, Y5 y52, byte[] bArr, int i8, int i9, C2197n4 c2197n4) {
        int i10 = i8 + 1;
        int i11 = bArr[i8];
        if (i11 < 0) {
            i10 = e(i11, bArr, i10, c2197n4);
            i11 = c2197n4.f16736a;
        }
        int i12 = i10;
        if (i11 >= 0 && i11 <= i9 - i12) {
            int i13 = c2197n4.f16740e + 1;
            c2197n4.f16740e = i13;
            m(i13);
            int i14 = i11 + i12;
            y52.f(obj, bArr, i12, i14, c2197n4);
            c2197n4.f16740e--;
            c2197n4.f16738c = obj;
            return i14;
        }
        throw C2171k5.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(byte[] bArr, int i8, C2197n4 c2197n4) {
        int r8 = r(bArr, i8, c2197n4);
        int i9 = c2197n4.f16736a;
        if (i9 >= 0) {
            if (i9 <= bArr.length - r8) {
                if (i9 == 0) {
                    c2197n4.f16738c = AbstractC2241s4.f16818b;
                    return r8;
                }
                c2197n4.f16738c = AbstractC2241s4.n(bArr, r8, i9);
                return r8 + i9;
            }
            throw C2171k5.g();
        }
        throw C2171k5.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(byte[] bArr, int i8, InterfaceC2180l5 interfaceC2180l5, C2197n4 c2197n4) {
        C2121f5 c2121f5 = (C2121f5) interfaceC2180l5;
        int r8 = r(bArr, i8, c2197n4);
        int i9 = c2197n4.f16736a + r8;
        while (r8 < i9) {
            r8 = r(bArr, r8, c2197n4);
            c2121f5.f(c2197n4.f16736a);
        }
        if (r8 == i9) {
            return r8;
        }
        throw C2171k5.g();
    }

    private static void m(int i8) {
        if (i8 < f16757a) {
        } else {
            throw C2171k5.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float n(byte[] bArr, int i8) {
        return Float.intBitsToFloat(q(bArr, i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(Y5 y52, int i8, byte[] bArr, int i9, int i10, InterfaceC2180l5 interfaceC2180l5, C2197n4 c2197n4) {
        int h8 = h(y52, bArr, i9, i10, c2197n4);
        interfaceC2180l5.add(c2197n4.f16738c);
        while (h8 < i10) {
            int r8 = r(bArr, h8, c2197n4);
            if (i8 != c2197n4.f16736a) {
                break;
            }
            h8 = h(y52, bArr, r8, i10, c2197n4);
            interfaceC2180l5.add(c2197n4.f16738c);
        }
        return h8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(byte[] bArr, int i8, C2197n4 c2197n4) {
        int r8 = r(bArr, i8, c2197n4);
        int i9 = c2197n4.f16736a;
        if (i9 >= 0) {
            if (i9 == 0) {
                c2197n4.f16738c = "";
                return r8;
            }
            c2197n4.f16738c = AbstractC2288x6.d(bArr, r8, i9);
            return r8 + i9;
        }
        throw C2171k5.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(byte[] bArr, int i8) {
        return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(byte[] bArr, int i8, C2197n4 c2197n4) {
        int i9 = i8 + 1;
        byte b8 = bArr[i8];
        if (b8 >= 0) {
            c2197n4.f16736a = b8;
            return i9;
        }
        return e(b8, bArr, i9, c2197n4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int s(byte[] bArr, int i8, C2197n4 c2197n4) {
        int i9 = i8 + 1;
        long j8 = bArr[i8];
        if (j8 >= 0) {
            c2197n4.f16737b = j8;
            return i9;
        }
        int i10 = i8 + 2;
        byte b8 = bArr[i9];
        long j9 = (j8 & 127) | ((b8 & Byte.MAX_VALUE) << 7);
        int i11 = 7;
        while (b8 < 0) {
            int i12 = i10 + 1;
            i11 += 7;
            j9 |= (r10 & Byte.MAX_VALUE) << i11;
            b8 = bArr[i10];
            i10 = i12;
        }
        c2197n4.f16737b = j9;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long t(byte[] bArr, int i8) {
        return ((bArr[i8 + 7] & 255) << 56) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 3] & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48);
    }
}
