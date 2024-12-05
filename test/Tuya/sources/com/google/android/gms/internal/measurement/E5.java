package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class E5 {

    /* renamed from: a, reason: collision with root package name */
    private static final B5 f15317a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f15318b = 0;

    static {
        if (AbstractC2153z5.C() && AbstractC2153z5.D()) {
            int i8 = J3.f15360a;
        }
        f15317a = new C5();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ int a(byte[] bArr, int i8, int i9) {
        int i10 = i9 - i8;
        byte b8 = bArr[i8 - 1];
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    byte b9 = bArr[i8];
                    byte b10 = bArr[i8 + 1];
                    if (b8 <= -12 && b9 <= -65 && b10 <= -65) {
                        return ((b9 << 8) ^ b8) ^ (b10 << 16);
                    }
                } else {
                    throw new AssertionError();
                }
            } else {
                byte b11 = bArr[i8];
                if (b8 <= -12 && b11 <= -65) {
                    return b8 ^ (b11 << 8);
                }
            }
        } else if (b8 <= -12) {
            return b8;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ff, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.E5.b(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(CharSequence charSequence) {
        int length = charSequence.length();
        int i8 = 0;
        int i9 = 0;
        while (i9 < length && charSequence.charAt(i9) < 128) {
            i9++;
        }
        int i10 = length;
        while (true) {
            if (i9 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i9);
            if (charAt < 2048) {
                i10 += (127 - charAt) >>> 31;
                i9++;
            } else {
                int length2 = charSequence.length();
                while (i9 < length2) {
                    char charAt2 = charSequence.charAt(i9);
                    if (charAt2 < 2048) {
                        i8 += (127 - charAt2) >>> 31;
                    } else {
                        i8 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i9) >= 65536) {
                                i9++;
                            } else {
                                throw new D5(i9, length2);
                            }
                        }
                    }
                    i9++;
                }
                i10 += i8;
            }
        }
        if (i10 >= length) {
            return i10;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i10 + 4294967296L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(byte[] bArr) {
        return f15317a.b(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(byte[] bArr, int i8, int i9) {
        return f15317a.b(bArr, i8, i9);
    }
}
