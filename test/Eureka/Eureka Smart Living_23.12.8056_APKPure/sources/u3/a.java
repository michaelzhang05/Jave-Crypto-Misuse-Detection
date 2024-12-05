package u3;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import l3.b;

/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: d, reason: collision with root package name */
    public static final b.EnumC0114b f9419d = b.EnumC0114b.f7403b;

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadLocal f9420e = new C0142a();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f9421a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9422b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9423c;

    /* renamed from: u3.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0142a extends ThreadLocal {
        C0142a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) i.f9460b.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e6) {
                throw new IllegalStateException(e6);
            }
        }
    }

    public a(byte[] bArr, int i6) {
        if (!f9419d.a()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        r.a(bArr.length);
        this.f9421a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f9420e.get()).getBlockSize();
        this.f9423c = blockSize;
        if (i6 < 12 || i6 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f9422b = i6;
    }

    private void c(byte[] bArr, int i6, int i7, byte[] bArr2, int i8, byte[] bArr3, boolean z5) {
        Cipher cipher = (Cipher) f9420e.get();
        byte[] bArr4 = new byte[this.f9423c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f9422b);
        cipher.init(z5 ? 1 : 2, this.f9421a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i6, i7, bArr2, i8) != i7) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    @Override // u3.l
    public byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i6 = this.f9422b;
        if (length > Integer.MAX_VALUE - i6) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.f9422b));
        }
        byte[] bArr2 = new byte[bArr.length + i6];
        byte[] c6 = p.c(i6);
        System.arraycopy(c6, 0, bArr2, 0, this.f9422b);
        c(bArr, 0, bArr.length, bArr2, this.f9422b, c6, true);
        return bArr2;
    }

    @Override // u3.l
    public byte[] b(byte[] bArr) {
        int length = bArr.length;
        int i6 = this.f9422b;
        if (length < i6) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i6];
        System.arraycopy(bArr, 0, bArr2, 0, i6);
        int length2 = bArr.length;
        int i7 = this.f9422b;
        byte[] bArr3 = new byte[length2 - i7];
        c(bArr, i7, bArr.length - i7, bArr3, 0, bArr2, false);
        return bArr3;
    }
}
