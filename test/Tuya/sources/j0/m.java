package J0;

import J0.B;

/* loaded from: classes3.dex */
final class m extends B.e.d.a {

    /* renamed from: a, reason: collision with root package name */
    private final B.e.d.a.b f4585a;

    /* renamed from: b, reason: collision with root package name */
    private final C f4586b;

    /* renamed from: c, reason: collision with root package name */
    private final C f4587c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f4588d;

    /* renamed from: e, reason: collision with root package name */
    private final int f4589e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.e.d.a.AbstractC0075a {

        /* renamed from: a, reason: collision with root package name */
        private B.e.d.a.b f4590a;

        /* renamed from: b, reason: collision with root package name */
        private C f4591b;

        /* renamed from: c, reason: collision with root package name */
        private C f4592c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f4593d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f4594e;

        @Override // J0.B.e.d.a.AbstractC0075a
        public B.e.d.a a() {
            String str = "";
            if (this.f4590a == null) {
                str = " execution";
            }
            if (this.f4594e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new m(this.f4590a, this.f4591b, this.f4592c, this.f4593d, this.f4594e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.e.d.a.AbstractC0075a
        public B.e.d.a.AbstractC0075a b(Boolean bool) {
            this.f4593d = bool;
            return this;
        }

        @Override // J0.B.e.d.a.AbstractC0075a
        public B.e.d.a.AbstractC0075a c(C c8) {
            this.f4591b = c8;
            return this;
        }

        @Override // J0.B.e.d.a.AbstractC0075a
        public B.e.d.a.AbstractC0075a d(B.e.d.a.b bVar) {
            if (bVar != null) {
                this.f4590a = bVar;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        @Override // J0.B.e.d.a.AbstractC0075a
        public B.e.d.a.AbstractC0075a e(C c8) {
            this.f4592c = c8;
            return this;
        }

        @Override // J0.B.e.d.a.AbstractC0075a
        public B.e.d.a.AbstractC0075a f(int i8) {
            this.f4594e = Integer.valueOf(i8);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(B.e.d.a aVar) {
            this.f4590a = aVar.d();
            this.f4591b = aVar.c();
            this.f4592c = aVar.e();
            this.f4593d = aVar.b();
            this.f4594e = Integer.valueOf(aVar.f());
        }
    }

    @Override // J0.B.e.d.a
    public Boolean b() {
        return this.f4588d;
    }

    @Override // J0.B.e.d.a
    public C c() {
        return this.f4586b;
    }

    @Override // J0.B.e.d.a
    public B.e.d.a.b d() {
        return this.f4585a;
    }

    @Override // J0.B.e.d.a
    public C e() {
        return this.f4587c;
    }

    public boolean equals(Object obj) {
        C c8;
        C c9;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.a)) {
            return false;
        }
        B.e.d.a aVar = (B.e.d.a) obj;
        if (this.f4585a.equals(aVar.d()) && ((c8 = this.f4586b) != null ? c8.equals(aVar.c()) : aVar.c() == null) && ((c9 = this.f4587c) != null ? c9.equals(aVar.e()) : aVar.e() == null) && ((bool = this.f4588d) != null ? bool.equals(aVar.b()) : aVar.b() == null) && this.f4589e == aVar.f()) {
            return true;
        }
        return false;
    }

    @Override // J0.B.e.d.a
    public int f() {
        return this.f4589e;
    }

    @Override // J0.B.e.d.a
    public B.e.d.a.AbstractC0075a g() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f4585a.hashCode() ^ 1000003) * 1000003;
        C c8 = this.f4586b;
        int i8 = 0;
        if (c8 == null) {
            hashCode = 0;
        } else {
            hashCode = c8.hashCode();
        }
        int i9 = (hashCode3 ^ hashCode) * 1000003;
        C c9 = this.f4587c;
        if (c9 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c9.hashCode();
        }
        int i10 = (i9 ^ hashCode2) * 1000003;
        Boolean bool = this.f4588d;
        if (bool != null) {
            i8 = bool.hashCode();
        }
        return ((i10 ^ i8) * 1000003) ^ this.f4589e;
    }

    public String toString() {
        return "Application{execution=" + this.f4585a + ", customAttributes=" + this.f4586b + ", internalKeys=" + this.f4587c + ", background=" + this.f4588d + ", uiOrientation=" + this.f4589e + "}";
    }

    private m(B.e.d.a.b bVar, C c8, C c9, Boolean bool, int i8) {
        this.f4585a = bVar;
        this.f4586b = c8;
        this.f4587c = c9;
        this.f4588d = bool;
        this.f4589e = i8;
    }
}
