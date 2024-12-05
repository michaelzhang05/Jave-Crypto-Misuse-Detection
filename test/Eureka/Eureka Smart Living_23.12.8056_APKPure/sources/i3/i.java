package i3;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class i {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        int i6 = 0;
        long c6 = c(bArr, 0, 0) & 67108863;
        int i7 = 3;
        long c7 = c(bArr, 3, 2) & 67108611;
        long c8 = c(bArr, 6, 4) & 67092735;
        long c9 = c(bArr, 9, 6) & 66076671;
        long c10 = c(bArr, 12, 8) & 1048575;
        long j6 = c7 * 5;
        long j7 = c8 * 5;
        long j8 = c9 * 5;
        long j9 = c10 * 5;
        byte[] bArr3 = new byte[17];
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        int i8 = 0;
        while (i8 < bArr2.length) {
            b(bArr3, bArr2, i8);
            long c11 = j14 + c(bArr3, i6, i6);
            long c12 = j10 + c(bArr3, i7, 2);
            long c13 = j11 + c(bArr3, 6, 4);
            long c14 = j12 + c(bArr3, 9, 6);
            long c15 = j13 + (c(bArr3, 12, 8) | (bArr3[16] << 24));
            long j15 = (c11 * c6) + (c12 * j9) + (c13 * j8) + (c14 * j7) + (c15 * j6);
            long j16 = (c11 * c7) + (c12 * c6) + (c13 * j9) + (c14 * j8) + (c15 * j7);
            long j17 = (c11 * c8) + (c12 * c7) + (c13 * c6) + (c14 * j9) + (c15 * j8);
            long j18 = (c11 * c9) + (c12 * c8) + (c13 * c7) + (c14 * c6) + (c15 * j9);
            long j19 = j16 + (j15 >> 26);
            long j20 = j17 + (j19 >> 26);
            long j21 = j18 + (j20 >> 26);
            long j22 = (c11 * c10) + (c12 * c9) + (c13 * c8) + (c14 * c7) + (c15 * c6) + (j21 >> 26);
            long j23 = (j15 & 67108863) + ((j22 >> 26) * 5);
            j10 = (j19 & 67108863) + (j23 >> 26);
            i8 += 16;
            j11 = j20 & 67108863;
            j12 = j21 & 67108863;
            j13 = j22 & 67108863;
            i7 = 3;
            j14 = j23 & 67108863;
            i6 = 0;
        }
        long j24 = j11 + (j10 >> 26);
        long j25 = j24 & 67108863;
        long j26 = j12 + (j24 >> 26);
        long j27 = j26 & 67108863;
        long j28 = j13 + (j26 >> 26);
        long j29 = j28 & 67108863;
        long j30 = j14 + ((j28 >> 26) * 5);
        long j31 = j30 & 67108863;
        long j32 = (j10 & 67108863) + (j30 >> 26);
        long j33 = j31 + 5;
        long j34 = j33 & 67108863;
        long j35 = (j33 >> 26) + j32;
        long j36 = j25 + (j35 >> 26);
        long j37 = j27 + (j36 >> 26);
        long j38 = (j29 + (j37 >> 26)) - 67108864;
        long j39 = j38 >> 63;
        long j40 = j31 & j39;
        long j41 = j32 & j39;
        long j42 = j25 & j39;
        long j43 = j27 & j39;
        long j44 = j29 & j39;
        long j45 = ~j39;
        long j46 = (j35 & 67108863 & j45) | j41;
        long j47 = (j36 & 67108863 & j45) | j42;
        long j48 = (j37 & 67108863 & j45) | j43;
        long j49 = (j38 & j45) | j44;
        long j50 = (j40 | (j34 & j45) | (j46 << 26)) & 4294967295L;
        long j51 = ((j46 >> 6) | (j47 << 20)) & 4294967295L;
        long j52 = ((j47 >> 12) | (j48 << 14)) & 4294967295L;
        long j53 = ((j48 >> 18) | (j49 << 8)) & 4294967295L;
        long d6 = j50 + d(bArr, 16);
        long j54 = d6 & 4294967295L;
        long d7 = j51 + d(bArr, 20) + (d6 >> 32);
        long j55 = d7 & 4294967295L;
        long d8 = j52 + d(bArr, 24) + (d7 >> 32);
        long j56 = d8 & 4294967295L;
        long d9 = (j53 + d(bArr, 28) + (d8 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        e(bArr4, j54, 0);
        e(bArr4, j55, 4);
        e(bArr4, j56, 8);
        e(bArr4, d9, 12);
        return bArr4;
    }

    private static void b(byte[] bArr, byte[] bArr2, int i6) {
        int min = Math.min(16, bArr2.length - i6);
        System.arraycopy(bArr2, i6, bArr, 0, min);
        bArr[min] = 1;
        if (min != 16) {
            Arrays.fill(bArr, min + 1, bArr.length, (byte) 0);
        }
    }

    private static long c(byte[] bArr, int i6, int i7) {
        return (d(bArr, i6) >> i7) & 67108863;
    }

    private static long d(byte[] bArr, int i6) {
        return (((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16)) & 4294967295L;
    }

    private static void e(byte[] bArr, long j6, int i6) {
        int i7 = 0;
        while (i7 < 4) {
            bArr[i6 + i7] = (byte) (255 & j6);
            i7++;
            j6 >>= 8;
        }
    }

    public static void f(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!u3.f.b(a(bArr, bArr2), bArr3)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
