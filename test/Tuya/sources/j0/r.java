package J0;

import J0.B;

/* loaded from: classes3.dex */
final class r extends B.e.d.a.b.AbstractC0082e {

    /* renamed from: a, reason: collision with root package name */
    private final String f4629a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4630b;

    /* renamed from: c, reason: collision with root package name */
    private final C f4631c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.e.d.a.b.AbstractC0082e.AbstractC0083a {

        /* renamed from: a, reason: collision with root package name */
        private String f4632a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f4633b;

        /* renamed from: c, reason: collision with root package name */
        private C f4634c;

        @Override // J0.B.e.d.a.b.AbstractC0082e.AbstractC0083a
        public B.e.d.a.b.AbstractC0082e a() {
            String str = "";
            if (this.f4632a == null) {
                str = " name";
            }
            if (this.f4633b == null) {
                str = str + " importance";
            }
            if (this.f4634c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new r(this.f4632a, this.f4633b.intValue(), this.f4634c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.e.d.a.b.AbstractC0082e.AbstractC0083a
        public B.e.d.a.b.AbstractC0082e.AbstractC0083a b(C c8) {
            if (c8 != null) {
                this.f4634c = c8;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // J0.B.e.d.a.b.AbstractC0082e.AbstractC0083a
        public B.e.d.a.b.AbstractC0082e.AbstractC0083a c(int i8) {
            this.f4633b = Integer.valueOf(i8);
            return this;
        }

        @Override // J0.B.e.d.a.b.AbstractC0082e.AbstractC0083a
        public B.e.d.a.b.AbstractC0082e.AbstractC0083a d(String str) {
            if (str != null) {
                this.f4632a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @Override // J0.B.e.d.a.b.AbstractC0082e
    public C b() {
        return this.f4631c;
    }

    @Override // J0.B.e.d.a.b.AbstractC0082e
    public int c() {
        return this.f4630b;
    }

    @Override // J0.B.e.d.a.b.AbstractC0082e
    public String d() {
        return this.f4629a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.a.b.AbstractC0082e)) {
            return false;
        }
        B.e.d.a.b.AbstractC0082e abstractC0082e = (B.e.d.a.b.AbstractC0082e) obj;
        if (this.f4629a.equals(abstractC0082e.d()) && this.f4630b == abstractC0082e.c() && this.f4631c.equals(abstractC0082e.b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f4629a.hashCode() ^ 1000003) * 1000003) ^ this.f4630b) * 1000003) ^ this.f4631c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f4629a + ", importance=" + this.f4630b + ", frames=" + this.f4631c + "}";
    }

    private r(String str, int i8, C c8) {
        this.f4629a = str;
        this.f4630b = i8;
        this.f4631c = c8;
    }
}
