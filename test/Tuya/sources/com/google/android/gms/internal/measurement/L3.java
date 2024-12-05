package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class L3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr, int i8, K3 k32) {
        int j8 = j(bArr, i8, k32);
        int i9 = k32.f15371a;
        if (i9 >= 0) {
            if (i9 <= bArr.length - j8) {
                if (i9 == 0) {
                    k32.f15373c = X3.f15622b;
                    return j8;
                }
                k32.f15373c = X3.u(bArr, j8, i9);
                return j8 + i9;
            }
            throw D4.f();
        }
        throw D4.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(byte[] bArr, int i8) {
        int i9 = bArr[i8] & 255;
        int i10 = bArr[i8 + 1] & 255;
        int i11 = bArr[i8 + 2] & 255;
        return ((bArr[i8 + 3] & 255) << 24) | (i10 << 8) | i9 | (i11 << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(InterfaceC2026j5 interfaceC2026j5, byte[] bArr, int i8, int i9, int i10, K3 k32) {
        Object e8 = interfaceC2026j5.e();
        int n8 = n(e8, interfaceC2026j5, bArr, i8, i9, i10, k32);
        interfaceC2026j5.a(e8);
        k32.f15373c = e8;
        return n8;
    }

    static int d(InterfaceC2026j5 interfaceC2026j5, byte[] bArr, int i8, int i9, K3 k32) {
        Object e8 = interfaceC2026j5.e();
        int o8 = o(e8, interfaceC2026j5, bArr, i8, i9, k32);
        interfaceC2026j5.a(e8);
        k32.f15373c = e8;
        return o8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(InterfaceC2026j5 interfaceC2026j5, int i8, byte[] bArr, int i9, int i10, A4 a42, K3 k32) {
        int d8 = d(interfaceC2026j5, bArr, i9, i10, k32);
        a42.add(k32.f15373c);
        while (d8 < i10) {
            int j8 = j(bArr, d8, k32);
            if (i8 != k32.f15371a) {
                break;
            }
            d8 = d(interfaceC2026j5, bArr, j8, i10, k32);
            a42.add(k32.f15373c);
        }
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(byte[] bArr, int i8, A4 a42, K3 k32) {
        C2120v4 c2120v4 = (C2120v4) a42;
        int j8 = j(bArr, i8, k32);
        int i9 = k32.f15371a + j8;
        while (j8 < i9) {
            j8 = j(bArr, j8, k32);
            c2120v4.h(k32.f15371a);
        }
        if (j8 == i9) {
            return j8;
        }
        throw D4.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(byte[] bArr, int i8, K3 k32) {
        int j8 = j(bArr, i8, k32);
        int i9 = k32.f15371a;
        if (i9 >= 0) {
            if (i9 == 0) {
                k32.f15373c = "";
                return j8;
            }
            k32.f15373c = new String(bArr, j8, i9, B4.f15270b);
            return j8 + i9;
        }
        throw D4.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(byte[] bArr, int i8, K3 k32) {
        int j8 = j(bArr, i8, k32);
        int i9 = k32.f15371a;
        if (i9 >= 0) {
            if (i9 == 0) {
                k32.f15373c = "";
                return j8;
            }
            int i10 = E5.f15318b;
            int length = bArr.length;
            if ((((length - j8) - i9) | j8 | i9) >= 0) {
                int i11 = j8 + i9;
                char[] cArr = new char[i9];
                int i12 = 0;
                while (j8 < i11) {
                    byte b8 = bArr[j8];
                    if (!A5.d(b8)) {
                        break;
                    }
                    j8++;
                    cArr[i12] = (char) b8;
                    i12++;
                }
                int i13 = i12;
                while (j8 < i11) {
                    int i14 = j8 + 1;
                    byte b9 = bArr[j8];
                    if (A5.d(b9)) {
                        cArr[i13] = (char) b9;
                        i13++;
                        j8 = i14;
                        while (j8 < i11) {
                            byte b10 = bArr[j8];
                            if (A5.d(b10)) {
                                j8++;
                                cArr[i13] = (char) b10;
                                i13++;
                            }
                        }
                    } else if (b9 < -32) {
                        if (i14 < i11) {
                            j8 += 2;
                            A5.c(b9, bArr[i14], cArr, i13);
                            i13++;
                        } else {
                            throw D4.c();
                        }
                    } else if (b9 < -16) {
                        if (i14 < i11 - 1) {
                            int i15 = j8 + 2;
                            j8 += 3;
                            A5.b(b9, bArr[i14], bArr[i15], cArr, i13);
                            i13++;
                        } else {
                            throw D4.c();
                        }
                    } else if (i14 < i11 - 2) {
                        byte b11 = bArr[i14];
                        int i16 = j8 + 3;
                        byte b12 = bArr[j8 + 2];
                        j8 += 4;
                        A5.a(b9, b11, b12, bArr[i16], cArr, i13);
                        i13 += 2;
                    } else {
                        throw D4.c();
                    }
                }
                k32.f15373c = new String(cArr, 0, i13);
                return i11;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(j8), Integer.valueOf(i9)));
        }
        throw D4.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(int i8, byte[] bArr, int i9, int i10, C2082q5 c2082q5, K3 k32) {
        if ((i8 >>> 3) != 0) {
            int i11 = i8 & 7;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 5) {
                                c2082q5.j(i8, Integer.valueOf(b(bArr, i9)));
                                return i9 + 4;
                            }
                            throw D4.b();
                        }
                        int i12 = (i8 & (-8)) | 4;
                        C2082q5 f8 = C2082q5.f();
                        int i13 = 0;
                        while (true) {
                            if (i9 >= i10) {
                                break;
                            }
                            int j8 = j(bArr, i9, k32);
                            int i14 = k32.f15371a;
                            i13 = i14;
                            if (i14 != i12) {
                                int i15 = i(i13, bArr, j8, i10, f8, k32);
                                i13 = i14;
                                i9 = i15;
                            } else {
                                i9 = j8;
                                break;
                            }
                        }
                        if (i9 <= i10 && i13 == i12) {
                            c2082q5.j(i8, f8);
                            return i9;
                        }
                        throw D4.e();
                    }
                    int j9 = j(bArr, i9, k32);
                    int i16 = k32.f15371a;
                    if (i16 >= 0) {
                        if (i16 <= bArr.length - j9) {
                            if (i16 == 0) {
                                c2082q5.j(i8, X3.f15622b);
                            } else {
                                c2082q5.j(i8, X3.u(bArr, j9, i16));
                            }
                            return j9 + i16;
                        }
                        throw D4.f();
                    }
                    throw D4.d();
                }
                c2082q5.j(i8, Long.valueOf(p(bArr, i9)));
                return i9 + 8;
            }
            int m8 = m(bArr, i9, k32);
            c2082q5.j(i8, Long.valueOf(k32.f15372b));
            return m8;
        }
        throw D4.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(byte[] bArr, int i8, K3 k32) {
        int i9 = i8 + 1;
        byte b8 = bArr[i8];
        if (b8 >= 0) {
            k32.f15371a = b8;
            return i9;
        }
        return k(b8, bArr, i9, k32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(int i8, byte[] bArr, int i9, K3 k32) {
        byte b8 = bArr[i9];
        int i10 = i9 + 1;
        int i11 = i8 & 127;
        if (b8 >= 0) {
            k32.f15371a = i11 | (b8 << 7);
            return i10;
        }
        int i12 = i11 | ((b8 & Byte.MAX_VALUE) << 7);
        int i13 = i9 + 2;
        byte b9 = bArr[i10];
        if (b9 >= 0) {
            k32.f15371a = i12 | (b9 << 14);
            return i13;
        }
        int i14 = i12 | ((b9 & Byte.MAX_VALUE) << 14);
        int i15 = i9 + 3;
        byte b10 = bArr[i13];
        if (b10 >= 0) {
            k32.f15371a = i14 | (b10 << 21);
            return i15;
        }
        int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 21);
        int i17 = i9 + 4;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            k32.f15371a = i16 | (b11 << 28);
            return i17;
        }
        int i18 = i16 | ((b11 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i19 = i17 + 1;
            if (bArr[i17] < 0) {
                i17 = i19;
            } else {
                k32.f15371a = i18;
                return i19;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(int i8, byte[] bArr, int i9, int i10, A4 a42, K3 k32) {
        C2120v4 c2120v4 = (C2120v4) a42;
        int j8 = j(bArr, i9, k32);
        c2120v4.h(k32.f15371a);
        while (j8 < i10) {
            int j9 = j(bArr, j8, k32);
            if (i8 != k32.f15371a) {
                break;
            }
            j8 = j(bArr, j9, k32);
            c2120v4.h(k32.f15371a);
        }
        return j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(byte[] bArr, int i8, K3 k32) {
        long j8 = bArr[i8];
        int i9 = i8 + 1;
        if (j8 >= 0) {
            k32.f15372b = j8;
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
        k32.f15372b = j9;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(Object obj, InterfaceC2026j5 interfaceC2026j5, byte[] bArr, int i8, int i9, int i10, K3 k32) {
        int F8 = ((C1956b5) interfaceC2026j5).F(obj, bArr, i8, i9, i10, k32);
        k32.f15373c = obj;
        return F8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(Object obj, InterfaceC2026j5 interfaceC2026j5, byte[] bArr, int i8, int i9, K3 k32) {
        int i10 = i8 + 1;
        int i11 = bArr[i8];
        if (i11 < 0) {
            i10 = k(i11, bArr, i10, k32);
            i11 = k32.f15371a;
        }
        int i12 = i10;
        if (i11 >= 0 && i11 <= i9 - i12) {
            int i13 = i11 + i12;
            interfaceC2026j5.f(obj, bArr, i12, i13, k32);
            k32.f15373c = obj;
            return i13;
        }
        throw D4.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long p(byte[] bArr, int i8) {
        return (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 3] & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48) | ((bArr[i8 + 7] & 255) << 56);
    }
}
