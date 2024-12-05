package J0;

import J0.B;

/* loaded from: classes3.dex */
final class n extends B.e.d.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final C f4595a;

    /* renamed from: b, reason: collision with root package name */
    private final B.e.d.a.b.c f4596b;

    /* renamed from: c, reason: collision with root package name */
    private final B.a f4597c;

    /* renamed from: d, reason: collision with root package name */
    private final B.e.d.a.b.AbstractC0080d f4598d;

    /* renamed from: e, reason: collision with root package name */
    private final C f4599e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.e.d.a.b.AbstractC0078b {

        /* renamed from: a, reason: collision with root package name */
        private C f4600a;

        /* renamed from: b, reason: collision with root package name */
        private B.e.d.a.b.c f4601b;

        /* renamed from: c, reason: collision with root package name */
        private B.a f4602c;

        /* renamed from: d, reason: collision with root package name */
        private B.e.d.a.b.AbstractC0080d f4603d;

        /* renamed from: e, reason: collision with root package name */
        private C f4604e;

        @Override // J0.B.e.d.a.b.AbstractC0078b
        public B.e.d.a.b a() {
            String str = "";
            if (this.f4603d == null) {
                str = " signal";
            }
            if (this.f4604e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new n(this.f4600a, this.f4601b, this.f4602c, this.f4603d, this.f4604e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.e.d.a.b.AbstractC0078b
        public B.e.d.a.b.AbstractC0078b b(B.a aVar) {
            this.f4602c = aVar;
            return this;
        }

        @Override // J0.B.e.d.a.b.AbstractC0078b
        public B.e.d.a.b.AbstractC0078b c(C c8) {
            if (c8 != null) {
                this.f4604e = c8;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        @Override // J0.B.e.d.a.b.AbstractC0078b
        public B.e.d.a.b.AbstractC0078b d(B.e.d.a.b.c cVar) {
            this.f4601b = cVar;
            return this;
        }

        @Override // J0.B.e.d.a.b.AbstractC0078b
        public B.e.d.a.b.AbstractC0078b e(B.e.d.a.b.AbstractC0080d abstractC0080d) {
            if (abstractC0080d != null) {
                this.f4603d = abstractC0080d;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        @Override // J0.B.e.d.a.b.AbstractC0078b
        public B.e.d.a.b.AbstractC0078b f(C c8) {
            this.f4600a = c8;
            return this;
        }
    }

    @Override // J0.B.e.d.a.b
    public B.a b() {
        return this.f4597c;
    }

    @Override // J0.B.e.d.a.b
    public C c() {
        return this.f4599e;
    }

    @Override // J0.B.e.d.a.b
    public B.e.d.a.b.c d() {
        return this.f4596b;
    }

    @Override // J0.B.e.d.a.b
    public B.e.d.a.b.AbstractC0080d e() {
        return this.f4598d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.a.b)) {
            return false;
        }
        B.e.d.a.b bVar = (B.e.d.a.b) obj;
        C c8 = this.f4595a;
        if (c8 != null ? c8.equals(bVar.f()) : bVar.f() == null) {
            B.e.d.a.b.c cVar = this.f4596b;
            if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                B.a aVar = this.f4597c;
                if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                    if (this.f4598d.equals(bVar.e()) && this.f4599e.equals(bVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // J0.B.e.d.a.b
    public C f() {
        return this.f4595a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        C c8 = this.f4595a;
        int i8 = 0;
        if (c8 == null) {
            hashCode = 0;
        } else {
            hashCode = c8.hashCode();
        }
        int i9 = (hashCode ^ 1000003) * 1000003;
        B.e.d.a.b.c cVar = this.f4596b;
        if (cVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = cVar.hashCode();
        }
        int i10 = (i9 ^ hashCode2) * 1000003;
        B.a aVar = this.f4597c;
        if (aVar != null) {
            i8 = aVar.hashCode();
        }
        return ((((i10 ^ i8) * 1000003) ^ this.f4598d.hashCode()) * 1000003) ^ this.f4599e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f4595a + ", exception=" + this.f4596b + ", appExitInfo=" + this.f4597c + ", signal=" + this.f4598d + ", binaries=" + this.f4599e + "}";
    }

    private n(C c8, B.e.d.a.b.c cVar, B.a aVar, B.e.d.a.b.AbstractC0080d abstractC0080d, C c9) {
        this.f4595a = c8;
        this.f4596b = cVar;
        this.f4597c = aVar;
        this.f4598d = abstractC0080d;
        this.f4599e = c9;
    }
}
