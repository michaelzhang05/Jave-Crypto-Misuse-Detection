package h3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f6862a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6863b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6864c;

    /* renamed from: d, reason: collision with root package name */
    private final c f6865d;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f6866a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f6867b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f6868c;

        /* renamed from: d, reason: collision with root package name */
        private c f6869d;

        private b() {
            this.f6866a = null;
            this.f6867b = null;
            this.f6868c = null;
            this.f6869d = c.f6872d;
        }

        public i a() {
            Integer num = this.f6866a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f6867b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f6869d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f6868c != null) {
                return new i(num.intValue(), this.f6867b.intValue(), this.f6868c.intValue(), this.f6869d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i6) {
            if (i6 != 12 && i6 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i6)));
            }
            this.f6867b = Integer.valueOf(i6);
            return this;
        }

        public b c(int i6) {
            if (i6 != 16 && i6 != 24 && i6 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i6)));
            }
            this.f6866a = Integer.valueOf(i6);
            return this;
        }

        public b d(int i6) {
            if (i6 < 0 || i6 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", Integer.valueOf(i6)));
            }
            this.f6868c = Integer.valueOf(i6);
            return this;
        }

        public b e(c cVar) {
            this.f6869d = cVar;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f6870b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f6871c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f6872d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f6873a;

        private c(String str) {
            this.f6873a = str;
        }

        public String toString() {
            return this.f6873a;
        }
    }

    private i(int i6, int i7, int i8, c cVar) {
        this.f6862a = i6;
        this.f6863b = i7;
        this.f6864c = i8;
        this.f6865d = cVar;
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f6863b;
    }

    public int c() {
        return this.f6862a;
    }

    public int d() {
        return this.f6864c;
    }

    public c e() {
        return this.f6865d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.c() == c() && iVar.b() == b() && iVar.d() == d() && iVar.e() == e();
    }

    public boolean f() {
        return this.f6865d != c.f6872d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f6862a), Integer.valueOf(this.f6863b), Integer.valueOf(this.f6864c), this.f6865d);
    }

    public String toString() {
        return "AesEax Parameters (variant: " + this.f6865d + ", " + this.f6863b + "-byte IV, " + this.f6864c + "-byte tag, and " + this.f6862a + "-byte key)";
    }
}
