package O1;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f7738a;

    /* renamed from: b, reason: collision with root package name */
    private final SecretKey f7739b;

    /* renamed from: c, reason: collision with root package name */
    private final SecretKey f7740c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7741d;

    public j(SecretKey secretKey) {
        this.f7738a = secretKey;
        byte[] encoded = secretKey.getEncoded();
        if (encoded.length == 32) {
            this.f7739b = new SecretKeySpec(encoded, 0, 16, "HMACSHA256");
            this.f7740c = new SecretKeySpec(encoded, 16, 16, "AES");
            this.f7741d = 16;
        } else if (encoded.length == 48) {
            this.f7739b = new SecretKeySpec(encoded, 0, 24, "HMACSHA384");
            this.f7740c = new SecretKeySpec(encoded, 24, 24, "AES");
            this.f7741d = 24;
        } else {
            if (encoded.length == 64) {
                this.f7739b = new SecretKeySpec(encoded, 0, 32, "HMACSHA512");
                this.f7740c = new SecretKeySpec(encoded, 32, 32, "AES");
                this.f7741d = 32;
                return;
            }
            throw new K1.u("Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits");
        }
    }

    public SecretKey a() {
        return this.f7740c;
    }

    public SecretKey b() {
        return this.f7739b;
    }

    public int c() {
        return this.f7741d;
    }
}
