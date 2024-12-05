package O1;

import com.google.crypto.tink.subtle.XChaCha20Poly1305;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.security.GeneralSecurityException;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public abstract class C {
    public static byte[] a(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        try {
            try {
                return new XChaCha20Poly1305(secretKey.getEncoded()).decrypt(Z1.e.d(bArr, bArr2, bArr4), bArr3);
            } catch (GeneralSecurityException e8) {
                throw new K1.f("XChaCha20Poly1305 decryption failed: " + e8.getMessage(), e8);
            }
        } catch (GeneralSecurityException e9) {
            throw new K1.f("Invalid XChaCha20Poly1305 key: " + e9.getMessage(), e9);
        }
    }

    public static f b(SecretKey secretKey, Z1.f fVar, byte[] bArr, byte[] bArr2) {
        try {
            try {
                byte[] encrypt = new XChaCha20Poly1305(secretKey.getEncoded()).encrypt(bArr, bArr2);
                int length = encrypt.length - Z1.e.c(128);
                int c8 = Z1.e.c(PsExtractor.AUDIO_STREAM);
                byte[] g8 = Z1.e.g(encrypt, 0, c8);
                byte[] g9 = Z1.e.g(encrypt, c8, length - c8);
                byte[] g10 = Z1.e.g(encrypt, length, Z1.e.c(128));
                fVar.b(g8);
                return new f(g9, g10);
            } catch (GeneralSecurityException e8) {
                throw new K1.f("Couldn't encrypt with XChaCha20Poly1305: " + e8.getMessage(), e8);
            }
        } catch (GeneralSecurityException e9) {
            throw new K1.f("Invalid XChaCha20Poly1305 key: " + e9.getMessage(), e9);
        }
    }
}
