package u3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import l3.b;

/* loaded from: classes.dex */
public final class m implements s3.a {

    /* renamed from: d, reason: collision with root package name */
    public static final b.EnumC0114b f9471d = b.EnumC0114b.f7402a;

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f9472a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f9473b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f9474c;

    public m(byte[] bArr) {
        r.a(bArr.length);
        this.f9472a = new SecretKeySpec(bArr, "AES");
        b();
    }

    private void b() {
        Cipher c6 = c();
        c6.init(1, this.f9472a);
        byte[] b6 = q3.a.b(c6.doFinal(new byte[16]));
        this.f9473b = b6;
        this.f9474c = q3.a.b(b6);
    }

    private static Cipher c() {
        if (f9471d.a()) {
            return (Cipher) i.f9460b.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // s3.a
    public byte[] a(byte[] bArr, int i6) {
        if (i6 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher c6 = c();
        c6.init(1, this.f9472a);
        int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        byte[] d6 = max * 16 == bArr.length ? f.d(bArr, (max - 1) * 16, this.f9473b, 0, 16) : f.e(q3.a.a(Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length)), this.f9474c);
        byte[] bArr2 = new byte[16];
        for (int i7 = 0; i7 < max - 1; i7++) {
            bArr2 = c6.doFinal(f.d(bArr2, 0, bArr, i7 * 16, 16));
        }
        return Arrays.copyOf(c6.doFinal(f.e(d6, bArr2)), i6);
    }
}
