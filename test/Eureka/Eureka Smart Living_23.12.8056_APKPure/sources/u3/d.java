package u3;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import l3.b;

/* loaded from: classes.dex */
public final class d implements g3.e {

    /* renamed from: c, reason: collision with root package name */
    public static final b.EnumC0114b f9433c = b.EnumC0114b.f7402a;

    /* renamed from: d, reason: collision with root package name */
    private static final Collection f9434d = Arrays.asList(64);

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f9435e = new byte[16];

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f9436f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    private final m f9437a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f9438b;

    public d(byte[] bArr) {
        if (!f9433c.a()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (f9434d.contains(Integer.valueOf(bArr.length))) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.f9438b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.f9437a = new m(copyOfRange);
        } else {
            throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
        }
    }

    private byte[] c(byte[]... bArr) {
        if (bArr.length == 0) {
            return this.f9437a.a(f9436f, 16);
        }
        byte[] a6 = this.f9437a.a(f9435e, 16);
        for (int i6 = 0; i6 < bArr.length - 1; i6++) {
            byte[] bArr2 = bArr[i6];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            a6 = f.e(q3.a.b(a6), this.f9437a.a(bArr2, 16));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        return this.f9437a.a(bArr3.length >= 16 ? f.f(bArr3, a6) : f.e(q3.a.a(bArr3), q3.a.b(a6)), 16);
    }

    @Override // g3.e
    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) i.f9460b.a("AES/CTR/NoPadding");
        byte[] c6 = c(bArr2, bArr);
        byte[] bArr3 = (byte[]) c6.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        cipher.init(1, new SecretKeySpec(this.f9438b, "AES"), new IvParameterSpec(bArr3));
        return f.a(c6, cipher.doFinal(bArr));
    }

    @Override // g3.e
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipher = (Cipher) i.f9460b.a("AES/CTR/NoPadding");
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) copyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        cipher.init(2, new SecretKeySpec(this.f9438b, "AES"), new IvParameterSpec(bArr3));
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] doFinal = cipher.doFinal(copyOfRange2);
        if (copyOfRange2.length == 0 && doFinal == null && q.b()) {
            doFinal = new byte[0];
        }
        if (f.b(copyOfRange, c(bArr2, doFinal))) {
            return doFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }
}
