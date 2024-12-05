package L0;

import L0.F;

/* loaded from: classes3.dex */
final class z extends F.e.AbstractC0098e {

    /* renamed from: a, reason: collision with root package name */
    private final int f5721a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5722b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5723c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5724d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.AbstractC0098e.a {

        /* renamed from: a, reason: collision with root package name */
        private int f5725a;

        /* renamed from: b, reason: collision with root package name */
        private String f5726b;

        /* renamed from: c, reason: collision with root package name */
        private String f5727c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f5728d;

        /* renamed from: e, reason: collision with root package name */
        private byte f5729e;

        @Override // L0.F.e.AbstractC0098e.a
        public F.e.AbstractC0098e a() {
            String str;
            String str2;
            if (this.f5729e == 3 && (str = this.f5726b) != null && (str2 = this.f5727c) != null) {
                return new z(this.f5725a, str, str2, this.f5728d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f5729e & 1) == 0) {
                sb.append(" platform");
            }
            if (this.f5726b == null) {
                sb.append(" version");
            }
            if (this.f5727c == null) {
                sb.append(" buildVersion");
            }
            if ((this.f5729e & 2) == 0) {
                sb.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // L0.F.e.AbstractC0098e.a
        public F.e.AbstractC0098e.a b(String str) {
            if (str != null) {
                this.f5727c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // L0.F.e.AbstractC0098e.a
        public F.e.AbstractC0098e.a c(boolean z8) {
            this.f5728d = z8;
            this.f5729e = (byte) (this.f5729e | 2);
            return this;
        }

        @Override // L0.F.e.AbstractC0098e.a
        public F.e.AbstractC0098e.a d(int i8) {
            this.f5725a = i8;
            this.f5729e = (byte) (this.f5729e | 1);
            return this;
        }

        @Override // L0.F.e.AbstractC0098e.a
        public F.e.AbstractC0098e.a e(String str) {
            if (str != null) {
                this.f5726b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    @Override // L0.F.e.AbstractC0098e
    public String b() {
        return this.f5723c;
    }

    @Override // L0.F.e.AbstractC0098e
    public int c() {
        return this.f5721a;
    }

    @Override // L0.F.e.AbstractC0098e
    public String d() {
        return this.f5722b;
    }

    @Override // L0.F.e.AbstractC0098e
    public boolean e() {
        return this.f5724d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.AbstractC0098e)) {
            return false;
        }
        F.e.AbstractC0098e abstractC0098e = (F.e.AbstractC0098e) obj;
        if (this.f5721a == abstractC0098e.c() && this.f5722b.equals(abstractC0098e.d()) && this.f5723c.equals(abstractC0098e.b()) && this.f5724d == abstractC0098e.e()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i8;
        int hashCode = (((((this.f5721a ^ 1000003) * 1000003) ^ this.f5722b.hashCode()) * 1000003) ^ this.f5723c.hashCode()) * 1000003;
        if (this.f5724d) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        return hashCode ^ i8;
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f5721a + ", version=" + this.f5722b + ", buildVersion=" + this.f5723c + ", jailbroken=" + this.f5724d + "}";
    }

    private z(int i8, String str, String str2, boolean z8) {
        this.f5721a = i8;
        this.f5722b = str;
        this.f5723c = str2;
        this.f5724d = z8;
    }
}
