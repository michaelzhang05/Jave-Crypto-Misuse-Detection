package J0;

import J0.B;

/* loaded from: classes3.dex */
final class v extends B.e.AbstractC0087e {

    /* renamed from: a, reason: collision with root package name */
    private final int f4659a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4660b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4661c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4662d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.e.AbstractC0087e.a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f4663a;

        /* renamed from: b, reason: collision with root package name */
        private String f4664b;

        /* renamed from: c, reason: collision with root package name */
        private String f4665c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f4666d;

        @Override // J0.B.e.AbstractC0087e.a
        public B.e.AbstractC0087e a() {
            String str = "";
            if (this.f4663a == null) {
                str = " platform";
            }
            if (this.f4664b == null) {
                str = str + " version";
            }
            if (this.f4665c == null) {
                str = str + " buildVersion";
            }
            if (this.f4666d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new v(this.f4663a.intValue(), this.f4664b, this.f4665c, this.f4666d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.e.AbstractC0087e.a
        public B.e.AbstractC0087e.a b(String str) {
            if (str != null) {
                this.f4665c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // J0.B.e.AbstractC0087e.a
        public B.e.AbstractC0087e.a c(boolean z8) {
            this.f4666d = Boolean.valueOf(z8);
            return this;
        }

        @Override // J0.B.e.AbstractC0087e.a
        public B.e.AbstractC0087e.a d(int i8) {
            this.f4663a = Integer.valueOf(i8);
            return this;
        }

        @Override // J0.B.e.AbstractC0087e.a
        public B.e.AbstractC0087e.a e(String str) {
            if (str != null) {
                this.f4664b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    @Override // J0.B.e.AbstractC0087e
    public String b() {
        return this.f4661c;
    }

    @Override // J0.B.e.AbstractC0087e
    public int c() {
        return this.f4659a;
    }

    @Override // J0.B.e.AbstractC0087e
    public String d() {
        return this.f4660b;
    }

    @Override // J0.B.e.AbstractC0087e
    public boolean e() {
        return this.f4662d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.AbstractC0087e)) {
            return false;
        }
        B.e.AbstractC0087e abstractC0087e = (B.e.AbstractC0087e) obj;
        if (this.f4659a == abstractC0087e.c() && this.f4660b.equals(abstractC0087e.d()) && this.f4661c.equals(abstractC0087e.b()) && this.f4662d == abstractC0087e.e()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i8;
        int hashCode = (((((this.f4659a ^ 1000003) * 1000003) ^ this.f4660b.hashCode()) * 1000003) ^ this.f4661c.hashCode()) * 1000003;
        if (this.f4662d) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        return hashCode ^ i8;
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f4659a + ", version=" + this.f4660b + ", buildVersion=" + this.f4661c + ", jailbroken=" + this.f4662d + "}";
    }

    private v(int i8, String str, String str2, boolean z8) {
        this.f4659a = i8;
        this.f4660b = str;
        this.f4661c = str2;
        this.f4662d = z8;
    }
}
