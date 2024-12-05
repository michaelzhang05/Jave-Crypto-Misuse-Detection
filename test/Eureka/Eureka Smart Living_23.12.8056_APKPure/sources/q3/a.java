package q3;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class a {
    public static byte[] a(byte[] bArr) {
        if (bArr.length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 16);
        copyOf[bArr.length] = Byte.MIN_VALUE;
        return copyOf;
    }

    public static byte[] b(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i6 = 0; i6 < 16; i6++) {
            byte b6 = (byte) ((bArr[i6] << 1) & 254);
            bArr2[i6] = b6;
            if (i6 < 15) {
                bArr2[i6] = (byte) (((byte) ((bArr[i6 + 1] >> 7) & 1)) | b6);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }
}
