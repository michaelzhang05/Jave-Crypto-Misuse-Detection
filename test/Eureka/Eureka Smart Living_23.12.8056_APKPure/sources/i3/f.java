package i3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import l3.b;

/* loaded from: classes.dex */
abstract class f {

    /* renamed from: c, reason: collision with root package name */
    public static final b.EnumC0114b f6989c = b.EnumC0114b.f7402a;

    /* renamed from: a, reason: collision with root package name */
    private final d f6990a;

    /* renamed from: b, reason: collision with root package name */
    private final d f6991b;

    public f(byte[] bArr) {
        if (!f6989c.a()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f6990a = e(bArr, 1);
        this.f6991b = e(bArr, 0);
    }

    private byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        this.f6991b.a(bArr, 0).get(bArr2);
        return bArr2;
    }

    private static byte[] d(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i6 = remaining % 16;
        int i7 = (i6 == 0 ? remaining : (remaining + 16) - i6) + length;
        ByteBuffer order = ByteBuffer.allocate(i7 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i7);
        order.putLong(bArr.length);
        order.putLong(remaining);
        return order.array();
    }

    public byte[] a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int position = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            i.f(c(bArr), d(bArr2, byteBuffer), bArr3);
            byteBuffer.position(position);
            return this.f6990a.c(bArr, byteBuffer);
        } catch (GeneralSecurityException e6) {
            throw new AEADBadTagException(e6.toString());
        }
    }

    public void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = byteBuffer.position();
        this.f6990a.d(byteBuffer, bArr, bArr2);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] a6 = i.a(c(bArr), d(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(a6);
    }

    abstract d e(byte[] bArr, int i6);
}
