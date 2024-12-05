package u3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import l3.b;

/* loaded from: classes.dex */
public final class n implements s3.a {

    /* renamed from: e, reason: collision with root package name */
    public static final b.EnumC0114b f9475e = b.EnumC0114b.f7403b;

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal f9476a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9477b;

    /* renamed from: c, reason: collision with root package name */
    private final Key f9478c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9479d;

    /* loaded from: classes.dex */
    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mac initialValue() {
            try {
                Mac mac = (Mac) i.f9461c.a(n.this.f9477b);
                mac.init(n.this.f9478c);
                return mac;
            } catch (GeneralSecurityException e6) {
                throw new IllegalStateException(e6);
            }
        }
    }

    public n(String str, Key key) {
        int i6;
        a aVar = new a();
        this.f9476a = aVar;
        if (!f9475e.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f9477b = str;
        this.f9478c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.hashCode();
        char c6 = 65535;
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    c6 = 0;
                    break;
                }
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    c6 = 1;
                    break;
                }
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    c6 = 2;
                    break;
                }
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    c6 = 3;
                    break;
                }
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    c6 = 4;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                i6 = 20;
                break;
            case 1:
                i6 = 28;
                break;
            case 2:
                i6 = 32;
                break;
            case 3:
                i6 = 48;
                break;
            case 4:
                i6 = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        this.f9479d = i6;
        aVar.get();
    }

    @Override // s3.a
    public byte[] a(byte[] bArr, int i6) {
        if (i6 > this.f9479d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.f9476a.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.f9476a.get()).doFinal(), i6);
    }
}
