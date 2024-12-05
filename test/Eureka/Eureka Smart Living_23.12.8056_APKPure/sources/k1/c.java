package k1;

import java.util.Set;
import k1.f;

/* loaded from: classes.dex */
final class c extends f.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f7098a;

    /* renamed from: b, reason: collision with root package name */
    private final long f7099b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f7100c;

    /* loaded from: classes.dex */
    static final class b extends f.b.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f7101a;

        /* renamed from: b, reason: collision with root package name */
        private Long f7102b;

        /* renamed from: c, reason: collision with root package name */
        private Set f7103c;

        @Override // k1.f.b.a
        public f.b a() {
            String str = "";
            if (this.f7101a == null) {
                str = " delta";
            }
            if (this.f7102b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f7103c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f7101a.longValue(), this.f7102b.longValue(), this.f7103c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // k1.f.b.a
        public f.b.a b(long j6) {
            this.f7101a = Long.valueOf(j6);
            return this;
        }

        @Override // k1.f.b.a
        public f.b.a c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f7103c = set;
            return this;
        }

        @Override // k1.f.b.a
        public f.b.a d(long j6) {
            this.f7102b = Long.valueOf(j6);
            return this;
        }
    }

    private c(long j6, long j7, Set set) {
        this.f7098a = j6;
        this.f7099b = j7;
        this.f7100c = set;
    }

    @Override // k1.f.b
    long b() {
        return this.f7098a;
    }

    @Override // k1.f.b
    Set c() {
        return this.f7100c;
    }

    @Override // k1.f.b
    long d() {
        return this.f7099b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        return this.f7098a == bVar.b() && this.f7099b == bVar.d() && this.f7100c.equals(bVar.c());
    }

    public int hashCode() {
        long j6 = this.f7098a;
        int i6 = (((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003;
        long j7 = this.f7099b;
        return this.f7100c.hashCode() ^ ((i6 ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f7098a + ", maxAllowedDelay=" + this.f7099b + ", flags=" + this.f7100c + "}";
    }
}
