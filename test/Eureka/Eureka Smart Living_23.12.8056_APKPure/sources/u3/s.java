package u3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s implements g3.a {

    /* renamed from: a, reason: collision with root package name */
    private final i3.h f9486a;

    public s(byte[] bArr) {
        this.f9486a = new i3.h(bArr);
    }

    @Override // g3.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 24 + 16);
        byte[] c6 = p.c(24);
        allocate.put(c6);
        this.f9486a.b(allocate, c6, bArr, bArr2);
        return allocate.array();
    }

    @Override // g3.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 24);
        return this.f9486a.a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), copyOf, bArr2);
    }
}
