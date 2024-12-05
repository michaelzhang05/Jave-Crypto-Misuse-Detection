package L0;

import L0.F;

/* loaded from: classes3.dex */
final class x extends F.e.d.AbstractC0097e.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f5715a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5716b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.AbstractC0097e.b.a {

        /* renamed from: a, reason: collision with root package name */
        private String f5717a;

        /* renamed from: b, reason: collision with root package name */
        private String f5718b;

        @Override // L0.F.e.d.AbstractC0097e.b.a
        public F.e.d.AbstractC0097e.b a() {
            String str;
            String str2 = this.f5717a;
            if (str2 != null && (str = this.f5718b) != null) {
                return new x(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5717a == null) {
                sb.append(" rolloutId");
            }
            if (this.f5718b == null) {
                sb.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // L0.F.e.d.AbstractC0097e.b.a
        public F.e.d.AbstractC0097e.b.a b(String str) {
            if (str != null) {
                this.f5717a = str;
                return this;
            }
            throw new NullPointerException("Null rolloutId");
        }

        @Override // L0.F.e.d.AbstractC0097e.b.a
        public F.e.d.AbstractC0097e.b.a c(String str) {
            if (str != null) {
                this.f5718b = str;
                return this;
            }
            throw new NullPointerException("Null variantId");
        }
    }

    @Override // L0.F.e.d.AbstractC0097e.b
    public String b() {
        return this.f5715a;
    }

    @Override // L0.F.e.d.AbstractC0097e.b
    public String c() {
        return this.f5716b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.AbstractC0097e.b)) {
            return false;
        }
        F.e.d.AbstractC0097e.b bVar = (F.e.d.AbstractC0097e.b) obj;
        if (this.f5715a.equals(bVar.b()) && this.f5716b.equals(bVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5715a.hashCode() ^ 1000003) * 1000003) ^ this.f5716b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f5715a + ", variantId=" + this.f5716b + "}";
    }

    private x(String str, String str2) {
        this.f5715a = str;
        this.f5716b = str2;
    }
}
