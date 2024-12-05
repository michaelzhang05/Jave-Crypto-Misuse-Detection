package h3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class v extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f6925a;

    /* renamed from: b, reason: collision with root package name */
    private final c f6926b;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f6927a;

        /* renamed from: b, reason: collision with root package name */
        private c f6928b;

        private b() {
            this.f6927a = null;
            this.f6928b = c.f6931d;
        }

        public v a() {
            Integer num = this.f6927a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f6928b != null) {
                return new v(num.intValue(), this.f6928b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        public b b(int i6) {
            if (i6 != 16 && i6 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i6)));
            }
            this.f6927a = Integer.valueOf(i6);
            return this;
        }

        public b c(c cVar) {
            this.f6928b = cVar;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f6929b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f6930c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f6931d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f6932a;

        private c(String str) {
            this.f6932a = str;
        }

        public String toString() {
            return this.f6932a;
        }
    }

    private v(int i6, c cVar) {
        this.f6925a = i6;
        this.f6926b = cVar;
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f6925a;
    }

    public c c() {
        return this.f6926b;
    }

    public boolean d() {
        return this.f6926b != c.f6931d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return vVar.b() == b() && vVar.c() == c();
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f6925a), this.f6926b);
    }

    public String toString() {
        return "AesGcmSiv Parameters (variant: " + this.f6926b + ", " + this.f6925a + "-byte key)";
    }
}
