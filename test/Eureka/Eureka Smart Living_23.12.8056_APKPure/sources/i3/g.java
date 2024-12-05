package i3;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public class g extends d {
    public g(byte[] bArr, int i6) {
        super(bArr, i6);
    }

    static int[] g(int[] iArr, int[] iArr2) {
        a.c(r0, iArr);
        int[] iArr3 = {0, 0, 0, 0, iArr3[12], iArr3[13], iArr3[14], iArr3[15], 0, 0, 0, 0, iArr2[0], iArr2[1], iArr2[2], iArr2[3]};
        a.d(iArr3);
        return Arrays.copyOf(iArr3, 8);
    }

    @Override // i3.d
    int[] b(int[] iArr, int i6) {
        if (iArr.length != e() / 4) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        a.c(iArr2, g(this.f6987a, iArr));
        iArr2[12] = i6;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    @Override // i3.d
    public /* bridge */ /* synthetic */ byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
        return super.c(bArr, byteBuffer);
    }

    @Override // i3.d
    public /* bridge */ /* synthetic */ void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        super.d(byteBuffer, bArr, bArr2);
    }

    @Override // i3.d
    int e() {
        return 24;
    }
}
