package u3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g implements g3.a {

    /* renamed from: a, reason: collision with root package name */
    private final i3.e f9456a;

    public g(byte[] bArr) {
        this.f9456a = new i3.e(bArr);
    }

    @Override // g3.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 12 + 16);
        byte[] c6 = p.c(12);
        allocate.put(c6);
        this.f9456a.b(allocate, c6, bArr, bArr2);
        return allocate.array();
    }

    @Override // g3.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 12);
        return this.f9456a.a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), copyOf, bArr2);
    }
}
