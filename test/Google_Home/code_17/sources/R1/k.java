package R1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public class k implements T1.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f9598a;

    /* renamed from: b, reason: collision with root package name */
    private final T1.b f9599b = new T1.b();

    public k(String str) {
        if (str != null) {
            this.f9598a = str;
            return;
        }
        throw new IllegalArgumentException("The JCA hash algorithm must not be null");
    }

    public static byte[] g(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return c2.e.d(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    public static int h(int i8, int i9) {
        return ((i9 + i8) - 1) / i8;
    }

    public static byte[] k(c2.c cVar) {
        byte[] bArr;
        if (cVar != null) {
            bArr = cVar.a();
        } else {
            bArr = null;
        }
        return l(bArr);
    }

    public static byte[] l(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        return c2.e.d(c2.i.a(bArr.length), bArr);
    }

    public static byte[] m(int i8) {
        return c2.i.a(i8);
    }

    public static byte[] n() {
        return new byte[0];
    }

    public static byte[] o(String str) {
        byte[] bArr;
        if (str != null) {
            bArr = str.getBytes(c2.m.f15571a);
        } else {
            bArr = null;
        }
        return l(bArr);
    }

    private MessageDigest p() {
        Provider a8 = d().a();
        try {
            if (a8 == null) {
                return MessageDigest.getInstance(this.f9598a);
            }
            return MessageDigest.getInstance(this.f9598a, a8);
        } catch (NoSuchAlgorithmException e8) {
            throw new N1.f("Couldn't get message digest for KDF: " + e8.getMessage(), e8);
        }
    }

    @Override // T1.a
    public T1.b d() {
        return this.f9599b;
    }

    public SecretKey i(SecretKey secretKey, int i8, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        MessageDigest p8 = p();
        for (int i9 = 1; i9 <= h(c2.e.e(p8.getDigestLength()), i8); i9++) {
            p8.update(c2.i.a(i9));
            p8.update(secretKey.getEncoded());
            if (bArr != null) {
                p8.update(bArr);
            }
            try {
                byteArrayOutputStream.write(p8.digest());
            } catch (IOException e8) {
                throw new N1.f("Couldn't write derived key: " + e8.getMessage(), e8);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int c8 = c2.e.c(i8);
        if (byteArray.length == c8) {
            return new SecretKeySpec(byteArray, "AES");
        }
        return new SecretKeySpec(c2.e.g(byteArray, 0, c8), "AES");
    }

    public SecretKey j(SecretKey secretKey, int i8, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return i(secretKey, i8, g(bArr, bArr2, bArr3, bArr4, bArr5));
    }
}
