package p3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l extends q {

    /* renamed from: a, reason: collision with root package name */
    private final int f8847a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8848b;

    /* renamed from: c, reason: collision with root package name */
    private final d f8849c;

    /* renamed from: d, reason: collision with root package name */
    private final c f8850d;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f8851a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f8852b;

        /* renamed from: c, reason: collision with root package name */
        private c f8853c;

        /* renamed from: d, reason: collision with root package name */
        private d f8854d;

        private b() {
            this.f8851a = null;
            this.f8852b = null;
            this.f8853c = null;
            this.f8854d = d.f8864e;
        }

        private static void f(int i6, c cVar) {
            if (i6 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i6)));
            }
            if (cVar == c.f8855b) {
                if (i6 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i6)));
                }
                return;
            }
            if (cVar == c.f8856c) {
                if (i6 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i6)));
                }
                return;
            }
            if (cVar == c.f8857d) {
                if (i6 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i6)));
                }
            } else if (cVar == c.f8858e) {
                if (i6 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i6)));
                }
            } else {
                if (cVar != c.f8859f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (i6 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i6)));
                }
            }
        }

        public l a() {
            Integer num = this.f8851a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.f8852b == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f8853c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f8854d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f8851a));
            }
            f(this.f8852b.intValue(), this.f8853c);
            return new l(this.f8851a.intValue(), this.f8852b.intValue(), this.f8854d, this.f8853c);
        }

        public b b(c cVar) {
            this.f8853c = cVar;
            return this;
        }

        public b c(int i6) {
            this.f8851a = Integer.valueOf(i6);
            return this;
        }

        public b d(int i6) {
            this.f8852b = Integer.valueOf(i6);
            return this;
        }

        public b e(d dVar) {
            this.f8854d = dVar;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f8855b = new c("SHA1");

        /* renamed from: c, reason: collision with root package name */
        public static final c f8856c = new c("SHA224");

        /* renamed from: d, reason: collision with root package name */
        public static final c f8857d = new c("SHA256");

        /* renamed from: e, reason: collision with root package name */
        public static final c f8858e = new c("SHA384");

        /* renamed from: f, reason: collision with root package name */
        public static final c f8859f = new c("SHA512");

        /* renamed from: a, reason: collision with root package name */
        private final String f8860a;

        private c(String str) {
            this.f8860a = str;
        }

        public String toString() {
            return this.f8860a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f8861b = new d("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final d f8862c = new d("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final d f8863d = new d("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final d f8864e = new d("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f8865a;

        private d(String str) {
            this.f8865a = str;
        }

        public String toString() {
            return this.f8865a;
        }
    }

    private l(int i6, int i7, d dVar, c cVar) {
        this.f8847a = i6;
        this.f8848b = i7;
        this.f8849c = dVar;
        this.f8850d = cVar;
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f8848b;
    }

    public c c() {
        return this.f8850d;
    }

    public int d() {
        return this.f8847a;
    }

    public int e() {
        d dVar = this.f8849c;
        if (dVar == d.f8864e) {
            return b();
        }
        if (dVar == d.f8861b || dVar == d.f8862c || dVar == d.f8863d) {
            return b() + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.d() == d() && lVar.e() == e() && lVar.f() == f() && lVar.c() == c();
    }

    public d f() {
        return this.f8849c;
    }

    public boolean g() {
        return this.f8849c != d.f8864e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f8847a), Integer.valueOf(this.f8848b), this.f8849c, this.f8850d);
    }

    public String toString() {
        return "HMAC Parameters (variant: " + this.f8849c + ", hashType: " + this.f8850d + ", " + this.f8848b + "-byte tags, and " + this.f8847a + "-byte key)";
    }
}
