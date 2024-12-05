package h3;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class e0 implements g3.a {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f6844c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final t3.a0 f6845a;

    /* renamed from: b, reason: collision with root package name */
    private final g3.a f6846b;

    public e0(t3.a0 a0Var, g3.a aVar) {
        this.f6845a = a0Var;
        this.f6846b = aVar;
    }

    private byte[] c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }

    @Override // g3.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a6 = g3.x.j(this.f6845a).a();
        return c(this.f6846b.a(a6, f6844c), ((g3.a) g3.x.f(this.f6845a.a0(), a6, g3.a.class)).a(bArr, bArr2));
    }

    @Override // g3.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i6 = wrap.getInt();
            if (i6 <= 0 || i6 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i6];
            wrap.get(bArr3, 0, i6);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((g3.a) g3.x.f(this.f6845a.a0(), this.f6846b.b(bArr3, f6844c), g3.a.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e6) {
            throw new GeneralSecurityException("invalid ciphertext", e6);
        }
    }
}
