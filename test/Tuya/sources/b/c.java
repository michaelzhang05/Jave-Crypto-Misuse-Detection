package B;

import B.f;
import java.util.Set;

/* loaded from: classes3.dex */
final class c extends f.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f520a;

    /* renamed from: b, reason: collision with root package name */
    private final long f521b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f522c;

    /* loaded from: classes3.dex */
    static final class b extends f.b.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f523a;

        /* renamed from: b, reason: collision with root package name */
        private Long f524b;

        /* renamed from: c, reason: collision with root package name */
        private Set f525c;

        @Override // B.f.b.a
        public f.b a() {
            String str = "";
            if (this.f523a == null) {
                str = " delta";
            }
            if (this.f524b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f525c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f523a.longValue(), this.f524b.longValue(), this.f525c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // B.f.b.a
        public f.b.a b(long j8) {
            this.f523a = Long.valueOf(j8);
            return this;
        }

        @Override // B.f.b.a
        public f.b.a c(Set set) {
            if (set != null) {
                this.f525c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        @Override // B.f.b.a
        public f.b.a d(long j8) {
            this.f524b = Long.valueOf(j8);
            return this;
        }
    }

    @Override // B.f.b
    long b() {
        return this.f520a;
    }

    @Override // B.f.b
    Set c() {
        return this.f522c;
    }

    @Override // B.f.b
    long d() {
        return this.f521b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        if (this.f520a == bVar.b() && this.f521b == bVar.d() && this.f522c.equals(bVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j8 = this.f520a;
        int i8 = (((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003;
        long j9 = this.f521b;
        return this.f522c.hashCode() ^ ((i8 ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f520a + ", maxAllowedDelay=" + this.f521b + ", flags=" + this.f522c + "}";
    }

    private c(long j8, long j9, Set set) {
        this.f520a = j8;
        this.f521b = j9;
        this.f522c = set;
    }
}
