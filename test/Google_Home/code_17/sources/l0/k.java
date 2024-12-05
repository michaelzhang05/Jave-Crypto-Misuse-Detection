package L0;

import L0.F;

/* loaded from: classes3.dex */
final class k extends F.e.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f5580a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5581b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5582c;

    /* renamed from: d, reason: collision with root package name */
    private final long f5583d;

    /* renamed from: e, reason: collision with root package name */
    private final long f5584e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f5585f;

    /* renamed from: g, reason: collision with root package name */
    private final int f5586g;

    /* renamed from: h, reason: collision with root package name */
    private final String f5587h;

    /* renamed from: i, reason: collision with root package name */
    private final String f5588i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.c.a {

        /* renamed from: a, reason: collision with root package name */
        private int f5589a;

        /* renamed from: b, reason: collision with root package name */
        private String f5590b;

        /* renamed from: c, reason: collision with root package name */
        private int f5591c;

        /* renamed from: d, reason: collision with root package name */
        private long f5592d;

        /* renamed from: e, reason: collision with root package name */
        private long f5593e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f5594f;

        /* renamed from: g, reason: collision with root package name */
        private int f5595g;

        /* renamed from: h, reason: collision with root package name */
        private String f5596h;

        /* renamed from: i, reason: collision with root package name */
        private String f5597i;

        /* renamed from: j, reason: collision with root package name */
        private byte f5598j;

        @Override // L0.F.e.c.a
        public F.e.c a() {
            String str;
            String str2;
            String str3;
            if (this.f5598j == 63 && (str = this.f5590b) != null && (str2 = this.f5596h) != null && (str3 = this.f5597i) != null) {
                return new k(this.f5589a, str, this.f5591c, this.f5592d, this.f5593e, this.f5594f, this.f5595g, str2, str3);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f5598j & 1) == 0) {
                sb.append(" arch");
            }
            if (this.f5590b == null) {
                sb.append(" model");
            }
            if ((this.f5598j & 2) == 0) {
                sb.append(" cores");
            }
            if ((this.f5598j & 4) == 0) {
                sb.append(" ram");
            }
            if ((this.f5598j & 8) == 0) {
                sb.append(" diskSpace");
            }
            if ((this.f5598j & 16) == 0) {
                sb.append(" simulator");
            }
            if ((this.f5598j & 32) == 0) {
                sb.append(" state");
            }
            if (this.f5596h == null) {
                sb.append(" manufacturer");
            }
            if (this.f5597i == null) {
                sb.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // L0.F.e.c.a
        public F.e.c.a b(int i8) {
            this.f5589a = i8;
            this.f5598j = (byte) (this.f5598j | 1);
            return this;
        }

        @Override // L0.F.e.c.a
        public F.e.c.a c(int i8) {
            this.f5591c = i8;
            this.f5598j = (byte) (this.f5598j | 2);
            return this;
        }

        @Override // L0.F.e.c.a
        public F.e.c.a d(long j8) {
            this.f5593e = j8;
            this.f5598j = (byte) (this.f5598j | 8);
            return this;
        }

        @Override // L0.F.e.c.a
        public F.e.c.a e(String str) {
            if (str != null) {
                this.f5596h = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        @Override // L0.F.e.c.a
        public F.e.c.a f(String str) {
            if (str != null) {
                this.f5590b = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        @Override // L0.F.e.c.a
        public F.e.c.a g(String str) {
            if (str != null) {
                this.f5597i = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        @Override // L0.F.e.c.a
        public F.e.c.a h(long j8) {
            this.f5592d = j8;
            this.f5598j = (byte) (this.f5598j | 4);
            return this;
        }

        @Override // L0.F.e.c.a
        public F.e.c.a i(boolean z8) {
            this.f5594f = z8;
            this.f5598j = (byte) (this.f5598j | 16);
            return this;
        }

        @Override // L0.F.e.c.a
        public F.e.c.a j(int i8) {
            this.f5595g = i8;
            this.f5598j = (byte) (this.f5598j | 32);
            return this;
        }
    }

    @Override // L0.F.e.c
    public int b() {
        return this.f5580a;
    }

    @Override // L0.F.e.c
    public int c() {
        return this.f5582c;
    }

    @Override // L0.F.e.c
    public long d() {
        return this.f5584e;
    }

    @Override // L0.F.e.c
    public String e() {
        return this.f5587h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.c)) {
            return false;
        }
        F.e.c cVar = (F.e.c) obj;
        if (this.f5580a == cVar.b() && this.f5581b.equals(cVar.f()) && this.f5582c == cVar.c() && this.f5583d == cVar.h() && this.f5584e == cVar.d() && this.f5585f == cVar.j() && this.f5586g == cVar.i() && this.f5587h.equals(cVar.e()) && this.f5588i.equals(cVar.g())) {
            return true;
        }
        return false;
    }

    @Override // L0.F.e.c
    public String f() {
        return this.f5581b;
    }

    @Override // L0.F.e.c
    public String g() {
        return this.f5588i;
    }

    @Override // L0.F.e.c
    public long h() {
        return this.f5583d;
    }

    public int hashCode() {
        int i8;
        int hashCode = (((((this.f5580a ^ 1000003) * 1000003) ^ this.f5581b.hashCode()) * 1000003) ^ this.f5582c) * 1000003;
        long j8 = this.f5583d;
        int i9 = (hashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f5584e;
        int i10 = (i9 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        if (this.f5585f) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        return ((((((i10 ^ i8) * 1000003) ^ this.f5586g) * 1000003) ^ this.f5587h.hashCode()) * 1000003) ^ this.f5588i.hashCode();
    }

    @Override // L0.F.e.c
    public int i() {
        return this.f5586g;
    }

    @Override // L0.F.e.c
    public boolean j() {
        return this.f5585f;
    }

    public String toString() {
        return "Device{arch=" + this.f5580a + ", model=" + this.f5581b + ", cores=" + this.f5582c + ", ram=" + this.f5583d + ", diskSpace=" + this.f5584e + ", simulator=" + this.f5585f + ", state=" + this.f5586g + ", manufacturer=" + this.f5587h + ", modelClass=" + this.f5588i + "}";
    }

    private k(int i8, String str, int i9, long j8, long j9, boolean z8, int i10, String str2, String str3) {
        this.f5580a = i8;
        this.f5581b = str;
        this.f5582c = i9;
        this.f5583d = j8;
        this.f5584e = j9;
        this.f5585f = z8;
        this.f5586g = i10;
        this.f5587h = str2;
        this.f5588i = str3;
    }
}
