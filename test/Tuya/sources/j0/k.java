package J0;

import J0.B;

/* loaded from: classes3.dex */
final class k extends B.e.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f4557a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4558b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4559c;

    /* renamed from: d, reason: collision with root package name */
    private final long f4560d;

    /* renamed from: e, reason: collision with root package name */
    private final long f4561e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f4562f;

    /* renamed from: g, reason: collision with root package name */
    private final int f4563g;

    /* renamed from: h, reason: collision with root package name */
    private final String f4564h;

    /* renamed from: i, reason: collision with root package name */
    private final String f4565i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.e.c.a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f4566a;

        /* renamed from: b, reason: collision with root package name */
        private String f4567b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f4568c;

        /* renamed from: d, reason: collision with root package name */
        private Long f4569d;

        /* renamed from: e, reason: collision with root package name */
        private Long f4570e;

        /* renamed from: f, reason: collision with root package name */
        private Boolean f4571f;

        /* renamed from: g, reason: collision with root package name */
        private Integer f4572g;

        /* renamed from: h, reason: collision with root package name */
        private String f4573h;

        /* renamed from: i, reason: collision with root package name */
        private String f4574i;

        @Override // J0.B.e.c.a
        public B.e.c a() {
            String str = "";
            if (this.f4566a == null) {
                str = " arch";
            }
            if (this.f4567b == null) {
                str = str + " model";
            }
            if (this.f4568c == null) {
                str = str + " cores";
            }
            if (this.f4569d == null) {
                str = str + " ram";
            }
            if (this.f4570e == null) {
                str = str + " diskSpace";
            }
            if (this.f4571f == null) {
                str = str + " simulator";
            }
            if (this.f4572g == null) {
                str = str + " state";
            }
            if (this.f4573h == null) {
                str = str + " manufacturer";
            }
            if (this.f4574i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new k(this.f4566a.intValue(), this.f4567b, this.f4568c.intValue(), this.f4569d.longValue(), this.f4570e.longValue(), this.f4571f.booleanValue(), this.f4572g.intValue(), this.f4573h, this.f4574i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.e.c.a
        public B.e.c.a b(int i8) {
            this.f4566a = Integer.valueOf(i8);
            return this;
        }

        @Override // J0.B.e.c.a
        public B.e.c.a c(int i8) {
            this.f4568c = Integer.valueOf(i8);
            return this;
        }

        @Override // J0.B.e.c.a
        public B.e.c.a d(long j8) {
            this.f4570e = Long.valueOf(j8);
            return this;
        }

        @Override // J0.B.e.c.a
        public B.e.c.a e(String str) {
            if (str != null) {
                this.f4573h = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        @Override // J0.B.e.c.a
        public B.e.c.a f(String str) {
            if (str != null) {
                this.f4567b = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        @Override // J0.B.e.c.a
        public B.e.c.a g(String str) {
            if (str != null) {
                this.f4574i = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        @Override // J0.B.e.c.a
        public B.e.c.a h(long j8) {
            this.f4569d = Long.valueOf(j8);
            return this;
        }

        @Override // J0.B.e.c.a
        public B.e.c.a i(boolean z8) {
            this.f4571f = Boolean.valueOf(z8);
            return this;
        }

        @Override // J0.B.e.c.a
        public B.e.c.a j(int i8) {
            this.f4572g = Integer.valueOf(i8);
            return this;
        }
    }

    @Override // J0.B.e.c
    public int b() {
        return this.f4557a;
    }

    @Override // J0.B.e.c
    public int c() {
        return this.f4559c;
    }

    @Override // J0.B.e.c
    public long d() {
        return this.f4561e;
    }

    @Override // J0.B.e.c
    public String e() {
        return this.f4564h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.c)) {
            return false;
        }
        B.e.c cVar = (B.e.c) obj;
        if (this.f4557a == cVar.b() && this.f4558b.equals(cVar.f()) && this.f4559c == cVar.c() && this.f4560d == cVar.h() && this.f4561e == cVar.d() && this.f4562f == cVar.j() && this.f4563g == cVar.i() && this.f4564h.equals(cVar.e()) && this.f4565i.equals(cVar.g())) {
            return true;
        }
        return false;
    }

    @Override // J0.B.e.c
    public String f() {
        return this.f4558b;
    }

    @Override // J0.B.e.c
    public String g() {
        return this.f4565i;
    }

    @Override // J0.B.e.c
    public long h() {
        return this.f4560d;
    }

    public int hashCode() {
        int i8;
        int hashCode = (((((this.f4557a ^ 1000003) * 1000003) ^ this.f4558b.hashCode()) * 1000003) ^ this.f4559c) * 1000003;
        long j8 = this.f4560d;
        int i9 = (hashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f4561e;
        int i10 = (i9 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        if (this.f4562f) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        return ((((((i10 ^ i8) * 1000003) ^ this.f4563g) * 1000003) ^ this.f4564h.hashCode()) * 1000003) ^ this.f4565i.hashCode();
    }

    @Override // J0.B.e.c
    public int i() {
        return this.f4563g;
    }

    @Override // J0.B.e.c
    public boolean j() {
        return this.f4562f;
    }

    public String toString() {
        return "Device{arch=" + this.f4557a + ", model=" + this.f4558b + ", cores=" + this.f4559c + ", ram=" + this.f4560d + ", diskSpace=" + this.f4561e + ", simulator=" + this.f4562f + ", state=" + this.f4563g + ", manufacturer=" + this.f4564h + ", modelClass=" + this.f4565i + "}";
    }

    private k(int i8, String str, int i9, long j8, long j9, boolean z8, int i10, String str2, String str3) {
        this.f4557a = i8;
        this.f4558b = str;
        this.f4559c = i9;
        this.f4560d = j8;
        this.f4561e = j9;
        this.f4562f = z8;
        this.f4563g = i10;
        this.f4564h = str2;
        this.f4565i = str3;
    }
}
