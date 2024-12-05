package L0;

import L0.F;

/* loaded from: classes3.dex */
final class A extends F.e.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f5310a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f5311a;

        @Override // L0.F.e.f.a
        public F.e.f a() {
            String str = this.f5311a;
            if (str != null) {
                return new A(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // L0.F.e.f.a
        public F.e.f.a b(String str) {
            if (str != null) {
                this.f5311a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
    }

    @Override // L0.F.e.f
    public String b() {
        return this.f5310a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.f) {
            return this.f5310a.equals(((F.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f5310a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f5310a + "}";
    }

    private A(String str) {
        this.f5310a = str;
    }
}
