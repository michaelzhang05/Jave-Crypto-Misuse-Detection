package R1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f9607a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f9608b = {0, 0, 0, 0};

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f9609c = {69, 110, 99, 114, 121, 112, 116, 105, 111, 110};

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f9610d = {73, 110, 116, 101, 103, 114, 105, 116, 121};

    public static SecretKey a(SecretKey secretKey, N1.d dVar, byte[] bArr, byte[] bArr2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(f9607a);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(c2.i.a(length / 2));
            byteArrayOutputStream.write(dVar.toString().getBytes(c2.m.f15571a));
            if (bArr != null) {
                byteArrayOutputStream.write(c2.i.a(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(f9608b);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(c2.i.a(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(f9608b);
            }
            byteArrayOutputStream.write(f9609c);
            try {
                byte[] digest = MessageDigest.getInstance("SHA-" + length).digest(byteArrayOutputStream.toByteArray());
                int length2 = digest.length / 2;
                byte[] bArr3 = new byte[length2];
                System.arraycopy(digest, 0, bArr3, 0, length2);
                return new SecretKeySpec(bArr3, "AES");
            } catch (NoSuchAlgorithmException e8) {
                throw new N1.f(e8.getMessage(), e8);
            }
        } catch (IOException e9) {
            throw new N1.f(e9.getMessage(), e9);
        }
    }

    public static SecretKey b(SecretKey secretKey, N1.d dVar, byte[] bArr, byte[] bArr2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(f9607a);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(c2.i.a(length));
            byteArrayOutputStream.write(dVar.toString().getBytes(c2.m.f15571a));
            if (bArr != null) {
                byteArrayOutputStream.write(c2.i.a(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(f9608b);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(c2.i.a(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(f9608b);
            }
            byteArrayOutputStream.write(f9610d);
            try {
                return new SecretKeySpec(MessageDigest.getInstance("SHA-" + length).digest(byteArrayOutputStream.toByteArray()), "HMACSHA" + length);
            } catch (NoSuchAlgorithmException e8) {
                throw new N1.f(e8.getMessage(), e8);
            }
        } catch (IOException e9) {
            throw new N1.f(e9.getMessage(), e9);
        }
    }
}
