package u3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class f {
    public static byte[] a(byte[]... bArr) {
        int i6 = 0;
        for (byte[] bArr2 : bArr) {
            if (i6 > Integer.MAX_VALUE - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i6 += bArr2.length;
        }
        byte[] bArr3 = new byte[i6];
        int i7 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i7, bArr4.length);
            i7 += bArr4.length;
        }
        return bArr3;
    }

    public static final boolean b(byte[] bArr, byte[] bArr2) {
        return MessageDigest.isEqual(bArr, bArr2);
    }

    public static final void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i6) {
        if (i6 < 0 || byteBuffer2.remaining() < i6 || byteBuffer3.remaining() < i6 || byteBuffer.remaining() < i6) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i7 = 0; i7 < i6; i7++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final byte[] d(byte[] bArr, int i6, byte[] bArr2, int i7, int i8) {
        if (i8 < 0 || bArr.length - i8 < i6 || bArr2.length - i8 < i7) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            bArr3[i9] = (byte) (bArr[i9 + i6] ^ bArr2[i9 + i7]);
        }
        return bArr3;
    }

    public static final byte[] e(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return d(bArr, 0, bArr2, 0, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final byte[] f(byte[] bArr, byte[] bArr2) {
        if (bArr.length < bArr2.length) {
            throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
        }
        int length = bArr.length - bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        for (int i6 = 0; i6 < bArr2.length; i6++) {
            int i7 = length + i6;
            copyOf[i7] = (byte) (copyOf[i7] ^ bArr2[i6]);
        }
        return copyOf;
    }
}
