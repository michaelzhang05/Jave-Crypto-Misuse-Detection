package u3;

import g3.t;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public class o implements t {

    /* renamed from: a, reason: collision with root package name */
    private final s3.a f9481a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9482b;

    public o(s3.a aVar, int i6) {
        this.f9481a = aVar;
        this.f9482b = i6;
        if (i6 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        aVar.a(new byte[0], i6);
    }

    @Override // g3.t
    public void a(byte[] bArr, byte[] bArr2) {
        if (!f.b(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // g3.t
    public byte[] b(byte[] bArr) {
        return this.f9481a.a(bArr, this.f9482b);
    }
}
