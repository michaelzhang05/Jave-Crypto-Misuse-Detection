package h3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f6899a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6900b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6901c;

    /* renamed from: d, reason: collision with root package name */
    private final c f6902d;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f6903a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f6904b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f6905c;

        /* renamed from: d, reason: collision with root package name */
        private c f6906d;

        private b() {
            this.f6903a = null;
            this.f6904b = null;
            this.f6905c = null;
            this.f6906d = c.f6909d;
        }

        public q a() {
            Integer num = this.f6903a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f6906d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f6904b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f6905c != null) {
                return new q(num.intValue(), this.f6904b.intValue(), this.f6905c.intValue(), this.f6906d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i6) {
            if (i6 <= 0) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", Integer.valueOf(i6)));
            }
            this.f6904b = Integer.valueOf(i6);
            return this;
        }

        public b c(int i6) {
            if (i6 != 16 && i6 != 24 && i6 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i6)));
            }
            this.f6903a = Integer.valueOf(i6);
            return this;
        }

        public b d(int i6) {
            if (i6 != 12 && i6 != 13 && i6 != 14 && i6 != 15 && i6 != 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be one of the following: 12, 13, 14, 15 or 16 bytes", Integer.valueOf(i6)));
            }
            this.f6905c = Integer.valueOf(i6);
            return this;
        }

        public b e(c cVar) {
            this.f6906d = cVar;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f6907b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f6908c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f6909d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f6910a;

        private c(String str) {
            this.f6910a = str;
        }

        public String toString() {
            return this.f6910a;
        }
    }

    private q(int i6, int i7, int i8, c cVar) {
        this.f6899a = i6;
        this.f6900b = i7;
        this.f6901c = i8;
        this.f6902d = cVar;
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f6900b;
    }

    public int c() {
        return this.f6899a;
    }

    public int d() {
        return this.f6901c;
    }

    public c e() {
        return this.f6902d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.c() == c() && qVar.b() == b() && qVar.d() == d() && qVar.e() == e();
    }

    public boolean f() {
        return this.f6902d != c.f6909d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f6899a), Integer.valueOf(this.f6900b), Integer.valueOf(this.f6901c), this.f6902d);
    }

    public String toString() {
        return "AesGcm Parameters (variant: " + this.f6902d + ", " + this.f6900b + "-byte IV, " + this.f6901c + "-byte tag, and " + this.f6899a + "-byte key)";
    }
}
