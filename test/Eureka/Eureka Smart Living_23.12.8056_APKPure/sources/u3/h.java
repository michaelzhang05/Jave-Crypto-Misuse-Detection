package u3;

import g3.t;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h implements g3.a {

    /* renamed from: a, reason: collision with root package name */
    private final l f9457a;

    /* renamed from: b, reason: collision with root package name */
    private final t f9458b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9459c;

    public h(l lVar, t tVar, int i6) {
        this.f9457a = lVar;
        this.f9458b = tVar;
        this.f9459c = i6;
    }

    @Override // g3.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a6 = this.f9457a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return f.a(a6, this.f9458b.b(f.a(bArr2, a6, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // g3.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i6 = this.f9459c;
        if (length < i6) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i6);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f9459c, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f9458b.a(copyOfRange2, f.a(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.f9457a.b(copyOfRange);
    }
}
