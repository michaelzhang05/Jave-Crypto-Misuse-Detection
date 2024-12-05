package L0;

import L0.F;

/* renamed from: L0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1295e extends F.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f5531a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5532b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L0.e$b */
    /* loaded from: classes3.dex */
    public static final class b extends F.c.a {

        /* renamed from: a, reason: collision with root package name */
        private String f5533a;

        /* renamed from: b, reason: collision with root package name */
        private String f5534b;

        @Override // L0.F.c.a
        public F.c a() {
            String str;
            String str2 = this.f5533a;
            if (str2 != null && (str = this.f5534b) != null) {
                return new C1295e(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5533a == null) {
                sb.append(" key");
            }
            if (this.f5534b == null) {
                sb.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // L0.F.c.a
        public F.c.a b(String str) {
            if (str != null) {
                this.f5533a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        @Override // L0.F.c.a
        public F.c.a c(String str) {
            if (str != null) {
                this.f5534b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    @Override // L0.F.c
    public String b() {
        return this.f5531a;
    }

    @Override // L0.F.c
    public String c() {
        return this.f5532b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.c)) {
            return false;
        }
        F.c cVar = (F.c) obj;
        if (this.f5531a.equals(cVar.b()) && this.f5532b.equals(cVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5531a.hashCode() ^ 1000003) * 1000003) ^ this.f5532b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f5531a + ", value=" + this.f5532b + "}";
    }

    private C1295e(String str, String str2) {
        this.f5531a = str;
        this.f5532b = str2;
    }
}
