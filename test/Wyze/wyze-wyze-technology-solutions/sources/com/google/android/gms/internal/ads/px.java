package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class px extends mx {
    private static int g(byte[] bArr, int i2, long j2, int i3) {
        int h2;
        int e2;
        int g2;
        if (i3 == 0) {
            h2 = kx.h(i2);
            return h2;
        }
        if (i3 == 1) {
            e2 = kx.e(i2, hx.a(bArr, j2));
            return e2;
        }
        if (i3 == 2) {
            g2 = kx.g(i2, hx.a(bArr, j2), hx.a(bArr, j2 + 1));
            return g2;
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b6, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0061, code lost:
    
        return -1;
     */
    @Override // com.google.android.gms.internal.ads.mx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int a(int r16, byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.px.a(int, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.mx
    public final int b(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        char c2;
        long j2;
        long j3;
        long j4;
        int i4;
        char charAt;
        long j5 = i2;
        long j6 = i3 + j5;
        int length = charSequence.length();
        if (length > i3 || bArr.length - i3 < i2) {
            char charAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(i2 + i3);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i5 = 0;
        while (true) {
            c2 = 128;
            j2 = 1;
            if (i5 >= length || (charAt = charSequence.charAt(i5)) >= 128) {
                break;
            }
            hx.i(bArr, j5, (byte) charAt);
            i5++;
            j5 = 1 + j5;
        }
        if (i5 == length) {
            return (int) j5;
        }
        while (i5 < length) {
            char charAt3 = charSequence.charAt(i5);
            if (charAt3 >= c2 || j5 >= j6) {
                if (charAt3 < 2048 && j5 <= j6 - 2) {
                    long j7 = j5 + j2;
                    hx.i(bArr, j5, (byte) ((charAt3 >>> 6) | 960));
                    hx.i(bArr, j7, (byte) ((charAt3 & '?') | 128));
                    j3 = j7 + j2;
                    j4 = j2;
                } else {
                    if ((charAt3 >= 55296 && 57343 >= charAt3) || j5 > j6 - 3) {
                        if (j5 <= j6 - 4) {
                            int i6 = i5 + 1;
                            if (i6 != length) {
                                char charAt4 = charSequence.charAt(i6);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    long j8 = j5 + 1;
                                    hx.i(bArr, j5, (byte) ((codePoint >>> 18) | 240));
                                    long j9 = j8 + 1;
                                    hx.i(bArr, j8, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j10 = j9 + 1;
                                    hx.i(bArr, j9, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j4 = 1;
                                    j3 = j10 + 1;
                                    hx.i(bArr, j10, (byte) ((codePoint & 63) | 128));
                                    i5 = i6;
                                } else {
                                    i5 = i6;
                                }
                            }
                            throw new ox(i5 - 1, length);
                        }
                        if (55296 <= charAt3 && charAt3 <= 57343 && ((i4 = i5 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i4)))) {
                            throw new ox(i5, length);
                        }
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Failed writing ");
                        sb2.append(charAt3);
                        sb2.append(" at index ");
                        sb2.append(j5);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    long j11 = j5 + j2;
                    hx.i(bArr, j5, (byte) ((charAt3 >>> '\f') | 480));
                    long j12 = j11 + j2;
                    hx.i(bArr, j11, (byte) (((charAt3 >>> 6) & 63) | 128));
                    hx.i(bArr, j12, (byte) ((charAt3 & '?') | 128));
                    j3 = j12 + 1;
                    j4 = 1;
                }
                i5++;
                c2 = 128;
                long j13 = j4;
                j5 = j3;
                j2 = j13;
            } else {
                long j14 = j5 + j2;
                hx.i(bArr, j5, (byte) charAt3);
                j4 = j2;
                j3 = j14;
            }
            i5++;
            c2 = 128;
            long j132 = j4;
            j5 = j3;
            j2 = j132;
        }
        return (int) j5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.mx
    public final void c(CharSequence charSequence, ByteBuffer byteBuffer) {
        char c2;
        long j2;
        int i2;
        char charAt;
        long J = hx.J(byteBuffer);
        long position = byteBuffer.position() + J;
        long limit = byteBuffer.limit() + J;
        int length = charSequence.length();
        if (length > limit - position) {
            char charAt2 = charSequence.charAt(length - 1);
            int limit2 = byteBuffer.limit();
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(limit2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i3 = 0;
        while (true) {
            c2 = 128;
            if (i3 >= length || (charAt = charSequence.charAt(i3)) >= 128) {
                break;
            }
            hx.b(position, (byte) charAt);
            i3++;
            position = 1 + position;
        }
        if (i3 == length) {
            byteBuffer.position((int) (position - J));
            return;
        }
        while (i3 < length) {
            char charAt3 = charSequence.charAt(i3);
            if (charAt3 < c2 && position < limit) {
                hx.b(position, (byte) charAt3);
                position++;
                j2 = J;
            } else if (charAt3 >= 2048 || position > limit - 2) {
                j2 = J;
                if ((charAt3 >= 55296 && 57343 >= charAt3) || position > limit - 3) {
                    if (position <= limit - 4) {
                        int i4 = i3 + 1;
                        if (i4 != length) {
                            char charAt4 = charSequence.charAt(i4);
                            if (Character.isSurrogatePair(charAt3, charAt4)) {
                                int codePoint = Character.toCodePoint(charAt3, charAt4);
                                long j3 = position + 1;
                                hx.b(position, (byte) ((codePoint >>> 18) | 240));
                                long j4 = j3 + 1;
                                hx.b(j3, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j5 = j4 + 1;
                                hx.b(j4, (byte) (((codePoint >>> 6) & 63) | 128));
                                long j6 = j5 + 1;
                                hx.b(j5, (byte) ((codePoint & 63) | 128));
                                i3 = i4;
                                position = j6;
                            } else {
                                i3 = i4;
                            }
                        }
                        throw new ox(i3 - 1, length);
                    }
                    if (55296 <= charAt3 && charAt3 <= 57343 && ((i2 = i3 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i2)))) {
                        throw new ox(i3, length);
                    }
                    StringBuilder sb2 = new StringBuilder(46);
                    sb2.append("Failed writing ");
                    sb2.append(charAt3);
                    sb2.append(" at index ");
                    sb2.append(position);
                    throw new ArrayIndexOutOfBoundsException(sb2.toString());
                }
                long j7 = position + 1;
                hx.b(position, (byte) ((charAt3 >>> '\f') | 480));
                long j8 = j7 + 1;
                hx.b(j7, (byte) (((charAt3 >>> 6) & 63) | 128));
                hx.b(j8, (byte) ((charAt3 & '?') | 128));
                position = j8 + 1;
            } else {
                j2 = J;
                long j9 = position + 1;
                hx.b(position, (byte) ((charAt3 >>> 6) | 960));
                hx.b(j9, (byte) ((charAt3 & '?') | 128));
                position = j9 + 1;
            }
            i3++;
            J = j2;
            c2 = 128;
        }
        byteBuffer.position((int) (position - J));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.mx
    public final String f(byte[] bArr, int i2, int i3) throws zzdok {
        boolean i4;
        boolean i5;
        boolean j2;
        boolean k2;
        boolean i6;
        if ((i2 | i3 | ((bArr.length - i2) - i3)) >= 0) {
            int i7 = i2 + i3;
            char[] cArr = new char[i3];
            int i8 = 0;
            while (i2 < i7) {
                byte a = hx.a(bArr, i2);
                i6 = lx.i(a);
                if (!i6) {
                    break;
                }
                i2++;
                lx.d(a, cArr, i8);
                i8++;
            }
            int i9 = i8;
            while (i2 < i7) {
                int i10 = i2 + 1;
                byte a2 = hx.a(bArr, i2);
                i4 = lx.i(a2);
                if (i4) {
                    int i11 = i9 + 1;
                    lx.d(a2, cArr, i9);
                    while (i10 < i7) {
                        byte a3 = hx.a(bArr, i10);
                        i5 = lx.i(a3);
                        if (!i5) {
                            break;
                        }
                        i10++;
                        lx.d(a3, cArr, i11);
                        i11++;
                    }
                    i2 = i10;
                    i9 = i11;
                } else {
                    j2 = lx.j(a2);
                    if (!j2) {
                        k2 = lx.k(a2);
                        if (k2) {
                            if (i10 < i7 - 1) {
                                int i12 = i10 + 1;
                                lx.b(a2, hx.a(bArr, i10), hx.a(bArr, i12), cArr, i9);
                                i2 = i12 + 1;
                                i9++;
                            } else {
                                throw zzdok.h();
                            }
                        } else if (i10 < i7 - 2) {
                            int i13 = i10 + 1;
                            byte a4 = hx.a(bArr, i10);
                            int i14 = i13 + 1;
                            lx.a(a2, a4, hx.a(bArr, i13), hx.a(bArr, i14), cArr, i9);
                            i2 = i14 + 1;
                            i9 = i9 + 1 + 1;
                        } else {
                            throw zzdok.h();
                        }
                    } else if (i10 < i7) {
                        lx.c(a2, hx.a(bArr, i10), cArr, i9);
                        i2 = i10 + 1;
                        i9++;
                    } else {
                        throw zzdok.h();
                    }
                }
            }
            return new String(cArr, 0, i9);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
    }
}
