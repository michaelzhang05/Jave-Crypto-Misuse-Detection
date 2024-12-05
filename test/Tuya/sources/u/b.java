package u;

import java.util.Map;
import u.i;

/* loaded from: classes3.dex */
final class b extends i {

    /* renamed from: a, reason: collision with root package name */
    private final String f38419a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f38420b;

    /* renamed from: c, reason: collision with root package name */
    private final h f38421c;

    /* renamed from: d, reason: collision with root package name */
    private final long f38422d;

    /* renamed from: e, reason: collision with root package name */
    private final long f38423e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f38424f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0887b extends i.a {

        /* renamed from: a, reason: collision with root package name */
        private String f38425a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f38426b;

        /* renamed from: c, reason: collision with root package name */
        private h f38427c;

        /* renamed from: d, reason: collision with root package name */
        private Long f38428d;

        /* renamed from: e, reason: collision with root package name */
        private Long f38429e;

        /* renamed from: f, reason: collision with root package name */
        private Map f38430f;

        @Override // u.i.a
        public i d() {
            String str = "";
            if (this.f38425a == null) {
                str = " transportName";
            }
            if (this.f38427c == null) {
                str = str + " encodedPayload";
            }
            if (this.f38428d == null) {
                str = str + " eventMillis";
            }
            if (this.f38429e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f38430f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f38425a, this.f38426b, this.f38427c, this.f38428d.longValue(), this.f38429e.longValue(), this.f38430f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // u.i.a
        protected Map e() {
            Map map = this.f38430f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u.i.a
        public i.a f(Map map) {
            if (map != null) {
                this.f38430f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        @Override // u.i.a
        public i.a g(Integer num) {
            this.f38426b = num;
            return this;
        }

        @Override // u.i.a
        public i.a h(h hVar) {
            if (hVar != null) {
                this.f38427c = hVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        @Override // u.i.a
        public i.a i(long j8) {
            this.f38428d = Long.valueOf(j8);
            return this;
        }

        @Override // u.i.a
        public i.a j(String str) {
            if (str != null) {
                this.f38425a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        @Override // u.i.a
        public i.a k(long j8) {
            this.f38429e = Long.valueOf(j8);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u.i
    public Map c() {
        return this.f38424f;
    }

    @Override // u.i
    public Integer d() {
        return this.f38420b;
    }

    @Override // u.i
    public h e() {
        return this.f38421c;
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
        if (this.f38419a.equals(iVar.j()) && ((num = this.f38420b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f38421c.equals(iVar.e()) && this.f38422d == iVar.f() && this.f38423e == iVar.k() && this.f38424f.equals(iVar.c())) {
            return true;
        }
        return false;
    }

    @Override // u.i
    public long f() {
        return this.f38422d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f38419a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f38420b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f38421c.hashCode()) * 1000003;
        long j8 = this.f38422d;
        int i8 = (hashCode3 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f38423e;
        return ((i8 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ this.f38424f.hashCode();
    }

    @Override // u.i
    public String j() {
        return this.f38419a;
    }

    @Override // u.i
    public long k() {
        return this.f38423e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f38419a + ", code=" + this.f38420b + ", encodedPayload=" + this.f38421c + ", eventMillis=" + this.f38422d + ", uptimeMillis=" + this.f38423e + ", autoMetadata=" + this.f38424f + "}";
    }

    private b(String str, Integer num, h hVar, long j8, long j9, Map map) {
        this.f38419a = str;
        this.f38420b = num;
        this.f38421c = hVar;
        this.f38422d = j8;
        this.f38423e = j9;
        this.f38424f = map;
    }
}
