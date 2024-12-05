package L0;

import L0.F;

/* loaded from: classes3.dex */
final class v extends F.e.d.AbstractC0096d {

    /* renamed from: a, reason: collision with root package name */
    private final String f5704a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.AbstractC0096d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f5705a;

        @Override // L0.F.e.d.AbstractC0096d.a
        public F.e.d.AbstractC0096d a() {
            String str = this.f5705a;
            if (str != null) {
                return new v(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // L0.F.e.d.AbstractC0096d.a
        public F.e.d.AbstractC0096d.a b(String str) {
            if (str != null) {
                this.f5705a = str;
                return this;
            }
            throw new NullPointerException("Null content");
        }
    }

    @Override // L0.F.e.d.AbstractC0096d
    public String b() {
        return this.f5704a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.AbstractC0096d) {
            return this.f5704a.equals(((F.e.d.AbstractC0096d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f5704a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f5704a + "}";
    }

    private v(String str) {
        this.f5704a = str;
    }
}
