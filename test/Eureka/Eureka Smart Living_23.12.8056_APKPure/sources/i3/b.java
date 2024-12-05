package i3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import l3.b;
import u3.q;
import u3.r;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b.EnumC0114b f6983c = b.EnumC0114b.f7403b;

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f6984d = new a();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f6985a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6986b;

    /* loaded from: classes.dex */
    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) u3.i.f9460b.a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e6) {
                throw new IllegalStateException(e6);
            }
        }
    }

    public b(byte[] bArr, boolean z5) {
        if (!f6983c.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        r.a(bArr.length);
        this.f6985a = new SecretKeySpec(bArr, "AES");
        this.f6986b = z5;
    }

    private static AlgorithmParameterSpec c(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    private static AlgorithmParameterSpec d(byte[] bArr, int i6, int i7) {
        return (!q.b() || q.a() > 19) ? new GCMParameterSpec(128, bArr, i6, i7) : new IvParameterSpec(bArr, i6, i7);
    }

    public byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        boolean z5 = this.f6986b;
        if (bArr2.length < (z5 ? 28 : 16)) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (z5 && !ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
            throw new GeneralSecurityException("iv does not match prepended iv");
        }
        AlgorithmParameterSpec c6 = c(bArr);
        ThreadLocal threadLocal = f6984d;
        ((Cipher) threadLocal.get()).init(2, this.f6985a, c6);
        if (bArr3 != null && bArr3.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr3);
        }
        boolean z6 = this.f6986b;
        return ((Cipher) threadLocal.get()).doFinal(bArr2, z6 ? 12 : 0, z6 ? bArr2.length - 12 : bArr2.length);
    }

    public byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr2.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        boolean z5 = this.f6986b;
        int length = bArr2.length;
        if (z5) {
            length += 12;
        }
        byte[] bArr4 = new byte[length + 16];
        if (z5) {
            System.arraycopy(bArr, 0, bArr4, 0, 12);
        }
        AlgorithmParameterSpec c6 = c(bArr);
        ThreadLocal threadLocal = f6984d;
        ((Cipher) threadLocal.get()).init(1, this.f6985a, c6);
        if (bArr3 != null && bArr3.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr3);
        }
        int doFinal = ((Cipher) threadLocal.get()).doFinal(bArr2, 0, bArr2.length, bArr4, this.f6986b ? 12 : 0);
        if (doFinal == bArr2.length + 16) {
            return bArr4;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr2.length)));
    }
}
