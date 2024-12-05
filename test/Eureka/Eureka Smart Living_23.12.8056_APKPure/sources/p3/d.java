package p3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d extends q {

    /* renamed from: a, reason: collision with root package name */
    private final int f8818a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8819b;

    /* renamed from: c, reason: collision with root package name */
    private final c f8820c;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f8821a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f8822b;

        /* renamed from: c, reason: collision with root package name */
        private c f8823c;

        private b() {
            this.f8821a = null;
            this.f8822b = null;
            this.f8823c = c.f8827e;
        }

        public d a() {
            Integer num = this.f8821a;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.f8822b == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.f8823c != null) {
                return new d(num.intValue(), this.f8822b.intValue(), this.f8823c);
            }
            throw new GeneralSecurityException("variant not set");
        }

        public b b(int i6) {
            if (i6 != 16 && i6 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i6 * 8)));
            }
            this.f8821a = Integer.valueOf(i6);
            return this;
        }

        public b c(int i6) {
            if (i6 >= 10 && 16 >= i6) {
                this.f8822b = Integer.valueOf(i6);
                return this;
            }
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i6);
        }

        public b d(c cVar) {
            this.f8823c = cVar;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f8824b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f8825c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f8826d = new c("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final c f8827e = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f8828a;

        private c(String str) {
            this.f8828a = str;
        }

        public String toString() {
            return this.f8828a;
        }
    }

    private d(int i6, int i7, c cVar) {
        this.f8818a = i6;
        this.f8819b = i7;
        this.f8820c = cVar;
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f8819b;
    }

    public int c() {
        return this.f8818a;
    }

    public int d() {
        c cVar = this.f8820c;
        if (cVar == c.f8827e) {
            return b();
        }
        if (cVar == c.f8824b || cVar == c.f8825c || cVar == c.f8826d) {
            return b() + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public c e() {
        return this.f8820c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.c() == c() && dVar.d() == d() && dVar.e() == e();
    }

    public boolean f() {
        return this.f8820c != c.f8827e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f8818a), Integer.valueOf(this.f8819b), this.f8820c);
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.f8820c + ", " + this.f8819b + "-byte tags, and " + this.f8818a + "-byte key)";
    }
}
