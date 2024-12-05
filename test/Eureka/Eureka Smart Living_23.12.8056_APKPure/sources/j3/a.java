package j3;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import u3.i;
import u3.p;
import u3.q;
import u3.r;

/* loaded from: classes.dex */
public final class a implements g3.a {

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f7089b = new C0108a();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f7090a;

    /* renamed from: j3.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0108a extends ThreadLocal {
        C0108a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) i.f9460b.a("AES/GCM-SIV/NoPadding");
            } catch (GeneralSecurityException e6) {
                throw new IllegalStateException(e6);
            }
        }
    }

    public a(byte[] bArr) {
        r.a(bArr.length);
        this.f7090a = new SecretKeySpec(bArr, "AES");
    }

    private static AlgorithmParameterSpec c(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    private static AlgorithmParameterSpec d(byte[] bArr, int i6, int i7) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, i6, i7);
        } catch (ClassNotFoundException unused) {
            if (q.b()) {
                return new IvParameterSpec(bArr, i6, i7);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // g3.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 12 + 16];
        byte[] c6 = p.c(12);
        System.arraycopy(c6, 0, bArr3, 0, 12);
        AlgorithmParameterSpec c7 = c(c6);
        ThreadLocal threadLocal = f7089b;
        ((Cipher) threadLocal.get()).init(1, this.f7090a, c7);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr2);
        }
        int doFinal = ((Cipher) threadLocal.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (doFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr.length)));
    }

    @Override // g3.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec d6 = d(bArr, 0, 12);
        ThreadLocal threadLocal = f7089b;
        ((Cipher) threadLocal.get()).init(2, this.f7090a, d6);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr2);
        }
        return ((Cipher) threadLocal.get()).doFinal(bArr, 12, bArr.length - 12);
    }
}
