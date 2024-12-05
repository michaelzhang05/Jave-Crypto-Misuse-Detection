package e1;

import e1.AbstractC2775f;

/* renamed from: e1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2771b extends AbstractC2775f {

    /* renamed from: a, reason: collision with root package name */
    private final String f31251a;

    /* renamed from: b, reason: collision with root package name */
    private final long f31252b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC2775f.b f31253c;

    /* renamed from: e1.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0719b extends AbstractC2775f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f31254a;

        /* renamed from: b, reason: collision with root package name */
        private Long f31255b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC2775f.b f31256c;

        @Override // e1.AbstractC2775f.a
        public AbstractC2775f a() {
            String str = "";
            if (this.f31255b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C2771b(this.f31254a, this.f31255b.longValue(), this.f31256c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // e1.AbstractC2775f.a
        public AbstractC2775f.a b(AbstractC2775f.b bVar) {
            this.f31256c = bVar;
            return this;
        }

        @Override // e1.AbstractC2775f.a
        public AbstractC2775f.a c(String str) {
            this.f31254a = str;
            return this;
        }

        @Override // e1.AbstractC2775f.a
        public AbstractC2775f.a d(long j8) {
            this.f31255b = Long.valueOf(j8);
            return this;
        }
    }

    @Override // e1.AbstractC2775f
    public AbstractC2775f.b b() {
        return this.f31253c;
    }

    @Override // e1.AbstractC2775f
    public String c() {
        return this.f31251a;
    }

    @Override // e1.AbstractC2775f
    public long d() {
        return this.f31252b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2775f)) {
            return false;
        }
        AbstractC2775f abstractC2775f = (AbstractC2775f) obj;
        String str = this.f31251a;
        if (str != null ? str.equals(abstractC2775f.c()) : abstractC2775f.c() == null) {
            if (this.f31252b == abstractC2775f.d()) {
                AbstractC2775f.b bVar = this.f31253c;
                if (bVar == null) {
                    if (abstractC2775f.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(abstractC2775f.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f31251a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j8 = this.f31252b;
        int i9 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        AbstractC2775f.b bVar = this.f31253c;
        if (bVar != null) {
            i8 = bVar.hashCode();
        }
        return i9 ^ i8;
    }

    public String toString() {
        return "TokenResult{token=" + this.f31251a + ", tokenExpirationTimestamp=" + this.f31252b + ", responseCode=" + this.f31253c + "}";
    }

    private C2771b(String str, long j8, AbstractC2775f.b bVar) {
        this.f31251a = str;
        this.f31252b = j8;
        this.f31253c = bVar;
    }
}
