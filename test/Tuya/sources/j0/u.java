package J0;

import J0.B;

/* loaded from: classes3.dex */
final class u extends B.e.d.AbstractC0086d {

    /* renamed from: a, reason: collision with root package name */
    private final String f4657a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.e.d.AbstractC0086d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f4658a;

        @Override // J0.B.e.d.AbstractC0086d.a
        public B.e.d.AbstractC0086d a() {
            String str = "";
            if (this.f4658a == null) {
                str = " content";
            }
            if (str.isEmpty()) {
                return new u(this.f4658a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.e.d.AbstractC0086d.a
        public B.e.d.AbstractC0086d.a b(String str) {
            if (str != null) {
                this.f4658a = str;
                return this;
            }
            throw new NullPointerException("Null content");
        }
    }

    @Override // J0.B.e.d.AbstractC0086d
    public String b() {
        return this.f4657a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof B.e.d.AbstractC0086d) {
            return this.f4657a.equals(((B.e.d.AbstractC0086d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f4657a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f4657a + "}";
    }

    private u(String str) {
        this.f4657a = str;
    }
}
