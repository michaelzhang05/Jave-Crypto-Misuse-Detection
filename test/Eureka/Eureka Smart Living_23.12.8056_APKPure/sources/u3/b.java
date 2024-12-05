package u3;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import l3.b;

/* loaded from: classes.dex */
public final class b implements g3.a {

    /* renamed from: e, reason: collision with root package name */
    public static final b.EnumC0114b f9424e = b.EnumC0114b.f7402a;

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadLocal f9425f = new a();

    /* renamed from: g, reason: collision with root package name */
    private static final ThreadLocal f9426g = new C0143b();

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f9427a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f9428b;

    /* renamed from: c, reason: collision with root package name */
    private final SecretKeySpec f9429c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9430d;

    /* loaded from: classes.dex */
    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) i.f9460b.a("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e6) {
                throw new IllegalStateException(e6);
            }
        }
    }

    /* renamed from: u3.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0143b extends ThreadLocal {
        C0143b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) i.f9460b.a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e6) {
                throw new IllegalStateException(e6);
            }
        }
    }

    public b(byte[] bArr, int i6) {
        if (!f9424e.a()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i6 != 12 && i6 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f9430d = i6;
        r.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f9429c = secretKeySpec;
        Cipher cipher = (Cipher) f9425f.get();
        cipher.init(1, secretKeySpec);
        byte[] c6 = c(cipher.doFinal(new byte[16]));
        this.f9427a = c6;
        this.f9428b = c(c6);
    }

    private static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i6 = 0;
        while (i6 < 15) {
            int i7 = i6 + 1;
            bArr2[i6] = (byte) (((bArr[i6] << 1) ^ ((bArr[i7] & 255) >>> 7)) & 255);
            i6 = i7;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    private byte[] d(Cipher cipher, int i6, byte[] bArr, int i7, int i8) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i6;
        if (i8 == 0) {
            return cipher.doFinal(f(bArr2, this.f9427a));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i9 = 0;
        while (i8 - i9 > 16) {
            for (int i10 = 0; i10 < 16; i10++) {
                doFinal[i10] = (byte) (doFinal[i10] ^ bArr[(i7 + i9) + i10]);
            }
            doFinal = cipher.doFinal(doFinal);
            i9 += 16;
        }
        return cipher.doFinal(f(doFinal, e(Arrays.copyOfRange(bArr, i9 + i7, i7 + i8))));
    }

    private byte[] e(byte[] bArr) {
        if (bArr.length == 16) {
            return f(bArr, this.f9427a);
        }
        byte[] copyOf = Arrays.copyOf(this.f9428b, 16);
        for (int i6 = 0; i6 < bArr.length; i6++) {
            copyOf[i6] = (byte) (copyOf[i6] ^ bArr[i6]);
        }
        copyOf[bArr.length] = (byte) (copyOf[bArr.length] ^ 128);
        return copyOf;
    }

    private static byte[] f(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i6 = 0; i6 < length; i6++) {
            bArr3[i6] = (byte) (bArr[i6] ^ bArr2[i6]);
        }
        return bArr3;
    }

    @Override // g3.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i6 = this.f9430d;
        if (length > (Integer.MAX_VALUE - i6) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + i6 + 16];
        byte[] c6 = p.c(i6);
        System.arraycopy(c6, 0, bArr3, 0, this.f9430d);
        Cipher cipher = (Cipher) f9425f.get();
        cipher.init(1, this.f9429c);
        byte[] d6 = d(cipher, 0, c6, 0, c6.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] d7 = d(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = (Cipher) f9426g.get();
        cipher2.init(1, this.f9429c, new IvParameterSpec(d6));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f9430d);
        byte[] d8 = d(cipher, 2, bArr3, this.f9430d, bArr.length);
        int length2 = bArr.length + this.f9430d;
        for (int i7 = 0; i7 < 16; i7++) {
            bArr3[length2 + i7] = (byte) ((d7[i7] ^ d6[i7]) ^ d8[i7]);
        }
        return bArr3;
    }

    @Override // g3.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = (bArr.length - this.f9430d) - 16;
        if (length < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) f9425f.get();
        cipher.init(1, this.f9429c);
        byte[] d6 = d(cipher, 0, bArr, 0, this.f9430d);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        byte[] d7 = d(cipher, 1, bArr3, 0, bArr3.length);
        byte[] d8 = d(cipher, 2, bArr, this.f9430d, length);
        int length2 = bArr.length - 16;
        byte b6 = 0;
        for (int i6 = 0; i6 < 16; i6++) {
            b6 = (byte) (b6 | (((bArr[length2 + i6] ^ d7[i6]) ^ d6[i6]) ^ d8[i6]));
        }
        if (b6 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f9426g.get();
        cipher2.init(1, this.f9429c, new IvParameterSpec(d6));
        return cipher2.doFinal(bArr, this.f9430d, length);
    }
}
