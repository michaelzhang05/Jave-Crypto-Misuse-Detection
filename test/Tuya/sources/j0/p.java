package J0;

import J0.B;

/* loaded from: classes3.dex */
final class p extends B.e.d.a.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f4613a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4614b;

    /* renamed from: c, reason: collision with root package name */
    private final C f4615c;

    /* renamed from: d, reason: collision with root package name */
    private final B.e.d.a.b.c f4616d;

    /* renamed from: e, reason: collision with root package name */
    private final int f4617e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.e.d.a.b.c.AbstractC0079a {

        /* renamed from: a, reason: collision with root package name */
        private String f4618a;

        /* renamed from: b, reason: collision with root package name */
        private String f4619b;

        /* renamed from: c, reason: collision with root package name */
        private C f4620c;

        /* renamed from: d, reason: collision with root package name */
        private B.e.d.a.b.c f4621d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f4622e;

        @Override // J0.B.e.d.a.b.c.AbstractC0079a
        public B.e.d.a.b.c a() {
            String str = "";
            if (this.f4618a == null) {
                str = " type";
            }
            if (this.f4620c == null) {
                str = str + " frames";
            }
            if (this.f4622e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new p(this.f4618a, this.f4619b, this.f4620c, this.f4621d, this.f4622e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.e.d.a.b.c.AbstractC0079a
        public B.e.d.a.b.c.AbstractC0079a b(B.e.d.a.b.c cVar) {
            this.f4621d = cVar;
            return this;
        }

        @Override // J0.B.e.d.a.b.c.AbstractC0079a
        public B.e.d.a.b.c.AbstractC0079a c(C c8) {
            if (c8 != null) {
                this.f4620c = c8;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // J0.B.e.d.a.b.c.AbstractC0079a
        public B.e.d.a.b.c.AbstractC0079a d(int i8) {
            this.f4622e = Integer.valueOf(i8);
            return this;
        }

        @Override // J0.B.e.d.a.b.c.AbstractC0079a
        public B.e.d.a.b.c.AbstractC0079a e(String str) {
            this.f4619b = str;
            return this;
        }

        @Override // J0.B.e.d.a.b.c.AbstractC0079a
        public B.e.d.a.b.c.AbstractC0079a f(String str) {
            if (str != null) {
                this.f4618a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    @Override // J0.B.e.d.a.b.c
    public B.e.d.a.b.c b() {
        return this.f4616d;
    }

    @Override // J0.B.e.d.a.b.c
    public C c() {
        return this.f4615c;
    }

    @Override // J0.B.e.d.a.b.c
    public int d() {
        return this.f4617e;
    }

    @Override // J0.B.e.d.a.b.c
    public String e() {
        return this.f4614b;
    }

    public boolean equals(Object obj) {
        String str;
        B.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.a.b.c)) {
            return false;
        }
        B.e.d.a.b.c cVar2 = (B.e.d.a.b.c) obj;
        if (this.f4613a.equals(cVar2.f()) && ((str = this.f4614b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f4615c.equals(cVar2.c()) && ((cVar = this.f4616d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f4617e == cVar2.d()) {
            return true;
        }
        return false;
    }

    @Override // J0.B.e.d.a.b.c
    public String f() {
        return this.f4613a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f4613a.hashCode() ^ 1000003) * 1000003;
        String str = this.f4614b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f4615c.hashCode()) * 1000003;
        B.e.d.a.b.c cVar = this.f4616d;
        if (cVar != null) {
            i8 = cVar.hashCode();
        }
        return ((hashCode3 ^ i8) * 1000003) ^ this.f4617e;
    }

    public String toString() {
        return "Exception{type=" + this.f4613a + ", reason=" + this.f4614b + ", frames=" + this.f4615c + ", causedBy=" + this.f4616d + ", overflowCount=" + this.f4617e + "}";
    }

    private p(String str, String str2, C c8, B.e.d.a.b.c cVar, int i8) {
        this.f4613a = str;
        this.f4614b = str2;
        this.f4615c = c8;
        this.f4616d = cVar;
        this.f4617e = i8;
    }
}
