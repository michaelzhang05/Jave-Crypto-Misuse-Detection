package B;

import B.f;
import java.util.Set;

/* loaded from: classes3.dex */
final class c extends f.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f645a;

    /* renamed from: b, reason: collision with root package name */
    private final long f646b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f647c;

    /* loaded from: classes3.dex */
    static final class b extends f.b.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f648a;

        /* renamed from: b, reason: collision with root package name */
        private Long f649b;

        /* renamed from: c, reason: collision with root package name */
        private Set f650c;

        @Override // B.f.b.a
        public f.b a() {
            String str = "";
            if (this.f648a == null) {
                str = " delta";
            }
            if (this.f649b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f650c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f648a.longValue(), this.f649b.longValue(), this.f650c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // B.f.b.a
        public f.b.a b(long j8) {
            this.f648a = Long.valueOf(j8);
            return this;
        }

        @Override // B.f.b.a
        public f.b.a c(Set set) {
            if (set != null) {
                this.f650c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        @Override // B.f.b.a
        public f.b.a d(long j8) {
            this.f649b = Long.valueOf(j8);
            return this;
        }
    }

    @Override // B.f.b
    long b() {
        return this.f645a;
    }

    @Override // B.f.b
    Set c() {
        return this.f647c;
    }

    @Override // B.f.b
    long d() {
        return this.f646b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        if (this.f645a == bVar.b() && this.f646b == bVar.d() && this.f647c.equals(bVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j8 = this.f645a;
        int i8 = (((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003;
        long j9 = this.f646b;
        return this.f647c.hashCode() ^ ((i8 ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f645a + ", maxAllowedDelay=" + this.f646b + ", flags=" + this.f647c + "}";
    }

    private c(long j8, long j9, Set set) {
        this.f645a = j8;
        this.f646b = j9;
        this.f647c = set;
    }
}
