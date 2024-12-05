package d1;

import d1.i;
import java.util.Map;

/* loaded from: classes.dex */
final class b extends i {

    /* renamed from: a, reason: collision with root package name */
    private final String f6407a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f6408b;

    /* renamed from: c, reason: collision with root package name */
    private final h f6409c;

    /* renamed from: d, reason: collision with root package name */
    private final long f6410d;

    /* renamed from: e, reason: collision with root package name */
    private final long f6411e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f6412f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d1.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0095b extends i.a {

        /* renamed from: a, reason: collision with root package name */
        private String f6413a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f6414b;

        /* renamed from: c, reason: collision with root package name */
        private h f6415c;

        /* renamed from: d, reason: collision with root package name */
        private Long f6416d;

        /* renamed from: e, reason: collision with root package name */
        private Long f6417e;

        /* renamed from: f, reason: collision with root package name */
        private Map f6418f;

        @Override // d1.i.a
        public i d() {
            String str = "";
            if (this.f6413a == null) {
                str = " transportName";
            }
            if (this.f6415c == null) {
                str = str + " encodedPayload";
            }
            if (this.f6416d == null) {
                str = str + " eventMillis";
            }
            if (this.f6417e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f6418f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f6413a, this.f6414b, this.f6415c, this.f6416d.longValue(), this.f6417e.longValue(), this.f6418f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // d1.i.a
        protected Map e() {
            Map map = this.f6418f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // d1.i.a
        public i.a f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f6418f = map;
            return this;
        }

        @Override // d1.i.a
        public i.a g(Integer num) {
            this.f6414b = num;
            return this;
        }

        @Override // d1.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f6415c = hVar;
            return this;
        }

        @Override // d1.i.a
        public i.a i(long j6) {
            this.f6416d = Long.valueOf(j6);
            return this;
        }

        @Override // d1.i.a
        public i.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f6413a = str;
            return this;
        }

        @Override // d1.i.a
        public i.a k(long j6) {
            this.f6417e = Long.valueOf(j6);
            return this;
        }
    }

    private b(String str, Integer num, h hVar, long j6, long j7, Map map) {
        this.f6407a = str;
        this.f6408b = num;
        this.f6409c = hVar;
        this.f6410d = j6;
        this.f6411e = j7;
        this.f6412f = map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // d1.i
    public Map c() {
        return this.f6412f;
    }

    @Override // d1.i
    public Integer d() {
        return this.f6408b;
    }

    @Override // d1.i
    public h e() {
        return this.f6409c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f6407a.equals(iVar.j()) && ((num = this.f6408b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f6409c.equals(iVar.e()) && this.f6410d == iVar.f() && this.f6411e == iVar.k() && this.f6412f.equals(iVar.c());
    }

    @Override // d1.i
    public long f() {
        return this.f6410d;
    }

    public int hashCode() {
        int hashCode = (this.f6407a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f6408b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f6409c.hashCode()) * 1000003;
        long j6 = this.f6410d;
        int i6 = (hashCode2 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j7 = this.f6411e;
        return ((i6 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ this.f6412f.hashCode();
    }

    @Override // d1.i
    public String j() {
        return this.f6407a;
    }

    @Override // d1.i
    public long k() {
        return this.f6411e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f6407a + ", code=" + this.f6408b + ", encodedPayload=" + this.f6409c + ", eventMillis=" + this.f6410d + ", uptimeMillis=" + this.f6411e + ", autoMetadata=" + this.f6412f + "}";
    }
}
