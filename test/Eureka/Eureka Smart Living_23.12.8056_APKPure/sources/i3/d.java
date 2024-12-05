package i3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes.dex */
abstract class d {

    /* renamed from: a, reason: collision with root package name */
    int[] f6987a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6988b;

    public d(byte[] bArr, int i6) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f6987a = a.e(bArr);
        this.f6988b = i6;
    }

    private void f(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length != e()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + e());
        }
        int remaining = byteBuffer2.remaining();
        int i6 = (remaining / 64) + 1;
        for (int i7 = 0; i7 < i6; i7++) {
            ByteBuffer a6 = a(bArr, this.f6988b + i7);
            if (i7 == i6 - 1) {
                u3.f.c(byteBuffer, byteBuffer2, a6, remaining % 64);
            } else {
                u3.f.c(byteBuffer, byteBuffer2, a6, 64);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ByteBuffer a(byte[] bArr, int i6) {
        int[] b6 = b(a.e(bArr), i6);
        int[] iArr = (int[]) b6.clone();
        a.d(iArr);
        for (int i7 = 0; i7 < b6.length; i7++) {
            b6[i7] = b6[i7] + iArr[i7];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b6, 0, 16);
        return order;
    }

    abstract int[] b(int[] iArr, int i6);

    public byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        f(bArr, allocate, byteBuffer);
        return allocate.array();
    }

    public void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        f(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    abstract int e();
}
