package R1;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f9594a;

    /* renamed from: b, reason: collision with root package name */
    private final SecretKey f9595b;

    /* renamed from: c, reason: collision with root package name */
    private final SecretKey f9596c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9597d;

    public j(SecretKey secretKey) {
        this.f9594a = secretKey;
        byte[] encoded = secretKey.getEncoded();
        if (encoded.length == 32) {
            this.f9595b = new SecretKeySpec(encoded, 0, 16, "HMACSHA256");
            this.f9596c = new SecretKeySpec(encoded, 16, 16, "AES");
            this.f9597d = 16;
        } else if (encoded.length == 48) {
            this.f9595b = new SecretKeySpec(encoded, 0, 24, "HMACSHA384");
            this.f9596c = new SecretKeySpec(encoded, 24, 24, "AES");
            this.f9597d = 24;
        } else {
            if (encoded.length == 64) {
                this.f9595b = new SecretKeySpec(encoded, 0, 32, "HMACSHA512");
                this.f9596c = new SecretKeySpec(encoded, 32, 32, "AES");
                this.f9597d = 32;
                return;
            }
            throw new N1.u("Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits");
        }
    }

    public SecretKey a() {
        return this.f9596c;
    }

    public SecretKey b() {
        return this.f9595b;
    }

    public int c() {
        return this.f9597d;
    }
}
