package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.y6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2297y6 extends AbstractC2306z6 {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2306z6
    public final int a(int i8, byte[] bArr, int i9, int i10) {
        while (i9 < i10 && bArr[i9] >= 0) {
            i9++;
        }
        if (i9 >= i10) {
            return 0;
        }
        while (i9 < i10) {
            int i11 = i9 + 1;
            byte b8 = bArr[i9];
            if (b8 < 0) {
                if (b8 < -32) {
                    if (i11 >= i10) {
                        return b8;
                    }
                    if (b8 >= -62) {
                        i9 += 2;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return -1;
                }
                if (b8 < -16) {
                    if (i11 >= i10 - 1) {
                        return AbstractC2288x6.c(bArr, i11, i10);
                    }
                    int i12 = i9 + 2;
                    byte b9 = bArr[i11];
                    if (b9 <= -65 && ((b8 != -32 || b9 >= -96) && (b8 != -19 || b9 < -96))) {
                        i9 += 3;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return -1;
                }
                if (i11 >= i10 - 2) {
                    return AbstractC2288x6.c(bArr, i11, i10);
                }
                int i13 = i9 + 2;
                byte b10 = bArr[i11];
                if (b10 <= -65 && (((b8 << 28) + (b10 + 112)) >> 30) == 0) {
                    int i14 = i9 + 3;
                    if (bArr[i13] <= -65) {
                        i9 += 4;
                        if (bArr[i14] > -65) {
                        }
                    }
                }
                return -1;
            }
            i9 = i11;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r10 + r0;
     */
    @Override // com.google.android.gms.internal.measurement.AbstractC2306z6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(java.lang.String r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2297y6.b(java.lang.String, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2306z6
    public final String c(byte[] bArr, int i8, int i9) {
        if ((i8 | i9 | ((bArr.length - i8) - i9)) >= 0) {
            int i10 = i8 + i9;
            char[] cArr = new char[i9];
            int i11 = 0;
            while (i8 < i10) {
                byte b8 = bArr[i8];
                if (b8 < 0) {
                    break;
                }
                i8++;
                AbstractC2279w6.d(b8, cArr, i11);
                i11++;
            }
            int i12 = i11;
            while (i8 < i10) {
                int i13 = i8 + 1;
                byte b9 = bArr[i8];
                if (b9 >= 0) {
                    int i14 = i12 + 1;
                    AbstractC2279w6.d(b9, cArr, i12);
                    while (i13 < i10) {
                        byte b10 = bArr[i13];
                        if (b10 < 0) {
                            break;
                        }
                        i13++;
                        AbstractC2279w6.d(b10, cArr, i14);
                        i14++;
                    }
                    i12 = i14;
                    i8 = i13;
                } else if (b9 < -32) {
                    if (i13 < i10) {
                        i8 += 2;
                        AbstractC2279w6.c(b9, bArr[i13], cArr, i12);
                        i12++;
                    } else {
                        throw C2171k5.c();
                    }
                } else if (b9 < -16) {
                    if (i13 < i10 - 1) {
                        int i15 = i8 + 2;
                        i8 += 3;
                        AbstractC2279w6.b(b9, bArr[i13], bArr[i15], cArr, i12);
                        i12++;
                    } else {
                        throw C2171k5.c();
                    }
                } else if (i13 < i10 - 2) {
                    byte b11 = bArr[i13];
                    int i16 = i8 + 3;
                    byte b12 = bArr[i8 + 2];
                    i8 += 4;
                    AbstractC2279w6.a(b9, b11, b12, bArr[i16], cArr, i12);
                    i12 += 2;
                } else {
                    throw C2171k5.c();
                }
            }
            return new String(cArr, 0, i12);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i8), Integer.valueOf(i9)));
    }
}
