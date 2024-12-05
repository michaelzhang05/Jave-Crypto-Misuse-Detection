package R1;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: R1.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1412c {
    private static byte[] a(Cipher cipher) {
        GCMParameterSpec b8 = b(cipher);
        byte[] iv = b8.getIV();
        f(iv, b8.getTLen());
        return iv;
    }

    private static GCMParameterSpec b(Cipher cipher) {
        AlgorithmParameters parameters = cipher.getParameters();
        if (parameters != null) {
            try {
                return (GCMParameterSpec) parameters.getParameterSpec(GCMParameterSpec.class);
            } catch (InvalidParameterSpecException e8) {
                throw new N1.f(e8.getMessage(), e8);
            }
        }
        throw new N1.f("AES GCM ciphers are expected to make use of algorithm parameters");
    }

    public static byte[] c(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, Provider provider) {
        Cipher cipher;
        SecretKey a8 = c2.l.a(secretKey);
        try {
            if (provider != null) {
                cipher = Cipher.getInstance("AES/GCM/NoPadding", provider);
            } else {
                cipher = Cipher.getInstance("AES/GCM/NoPadding");
            }
            cipher.init(2, a8, new GCMParameterSpec(128, bArr));
            cipher.updateAAD(bArr3);
            try {
                return cipher.doFinal(c2.e.d(bArr2, bArr4));
            } catch (BadPaddingException | IllegalBlockSizeException e8) {
                throw new N1.f("AES/GCM/NoPadding decryption failed: " + e8.getMessage(), e8);
            }
        } catch (NoClassDefFoundError unused) {
            return t.c(a8, bArr, bArr2, bArr3, bArr4);
        } catch (InvalidAlgorithmParameterException e9) {
            e = e9;
            throw new N1.f("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        } catch (InvalidKeyException e10) {
            e = e10;
            throw new N1.f("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        } catch (NoSuchAlgorithmException e11) {
            e = e11;
            throw new N1.f("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        } catch (NoSuchPaddingException e12) {
            e = e12;
            throw new N1.f("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        }
    }

    public static f d(SecretKey secretKey, c2.f fVar, byte[] bArr, byte[] bArr2, Provider provider) {
        Cipher cipher;
        SecretKey a8 = c2.l.a(secretKey);
        byte[] bArr3 = (byte[]) fVar.a();
        try {
            if (provider != null) {
                cipher = Cipher.getInstance("AES/GCM/NoPadding", provider);
            } else {
                cipher = Cipher.getInstance("AES/GCM/NoPadding");
            }
            cipher.init(1, a8, new GCMParameterSpec(128, bArr3));
            cipher.updateAAD(bArr2);
            try {
                byte[] doFinal = cipher.doFinal(bArr);
                int length = doFinal.length - c2.e.c(128);
                byte[] g8 = c2.e.g(doFinal, 0, length);
                byte[] g9 = c2.e.g(doFinal, length, c2.e.c(128));
                fVar.b(a(cipher));
                return new f(g8, g9);
            } catch (BadPaddingException | IllegalBlockSizeException e8) {
                throw new N1.f("Couldn't encrypt with AES/GCM/NoPadding: " + e8.getMessage(), e8);
            }
        } catch (NoClassDefFoundError unused) {
            return t.d(a8, bArr3, bArr, bArr2);
        } catch (InvalidAlgorithmParameterException e9) {
            e = e9;
            throw new N1.f("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        } catch (InvalidKeyException e10) {
            e = e10;
            throw new N1.f("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        } catch (NoSuchAlgorithmException e11) {
            e = e11;
            throw new N1.f("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        } catch (NoSuchPaddingException e12) {
            e = e12;
            throw new N1.f("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        }
    }

    public static byte[] e(SecureRandom secureRandom) {
        byte[] bArr = new byte[12];
        secureRandom.nextBytes(bArr);
        return bArr;
    }

    private static void f(byte[] bArr, int i8) {
        if (c2.e.f(bArr) == 96) {
            if (i8 == 128) {
                return;
            } else {
                throw new N1.f(String.format("Authentication tag length of %d bits is required, got %d", 128, Integer.valueOf(i8)));
            }
        }
        throw new N1.f(String.format("IV length of %d bits is required, got %d", 96, Integer.valueOf(c2.e.f(bArr))));
    }
}
