package h3;

import java.util.Objects;

/* loaded from: classes.dex */
public final class a0 extends c {

    /* renamed from: a, reason: collision with root package name */
    private final a f6826a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f6827b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f6828c = new a("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final a f6829d = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f6830a;

        private a(String str) {
            this.f6830a = str;
        }

        public String toString() {
            return this.f6830a;
        }
    }

    private a0(a aVar) {
        this.f6826a = aVar;
    }

    public static a0 a(a aVar) {
        return new a0(aVar);
    }

    public a b() {
        return this.f6826a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a0) && ((a0) obj).b() == b();
    }

    public int hashCode() {
        return Objects.hashCode(this.f6826a);
    }

    public String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f6826a + ")";
    }
}
