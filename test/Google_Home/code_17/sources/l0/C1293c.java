package L0;

import L0.F;
import java.util.List;

/* renamed from: L0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1293c extends F.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f5506a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5507b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5508c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5509d;

    /* renamed from: e, reason: collision with root package name */
    private final long f5510e;

    /* renamed from: f, reason: collision with root package name */
    private final long f5511f;

    /* renamed from: g, reason: collision with root package name */
    private final long f5512g;

    /* renamed from: h, reason: collision with root package name */
    private final String f5513h;

    /* renamed from: i, reason: collision with root package name */
    private final List f5514i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L0.c$b */
    /* loaded from: classes3.dex */
    public static final class b extends F.a.b {

        /* renamed from: a, reason: collision with root package name */
        private int f5515a;

        /* renamed from: b, reason: collision with root package name */
        private String f5516b;

        /* renamed from: c, reason: collision with root package name */
        private int f5517c;

        /* renamed from: d, reason: collision with root package name */
        private int f5518d;

        /* renamed from: e, reason: collision with root package name */
        private long f5519e;

        /* renamed from: f, reason: collision with root package name */
        private long f5520f;

        /* renamed from: g, reason: collision with root package name */
        private long f5521g;

        /* renamed from: h, reason: collision with root package name */
        private String f5522h;

        /* renamed from: i, reason: collision with root package name */
        private List f5523i;

        /* renamed from: j, reason: collision with root package name */
        private byte f5524j;

        @Override // L0.F.a.b
        public F.a a() {
            String str;
            if (this.f5524j == 63 && (str = this.f5516b) != null) {
                return new C1293c(this.f5515a, str, this.f5517c, this.f5518d, this.f5519e, this.f5520f, this.f5521g, this.f5522h, this.f5523i);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f5524j & 1) == 0) {
                sb.append(" pid");
            }
            if (this.f5516b == null) {
                sb.append(" processName");
            }
            if ((this.f5524j & 2) == 0) {
                sb.append(" reasonCode");
            }
            if ((this.f5524j & 4) == 0) {
                sb.append(" importance");
            }
            if ((this.f5524j & 8) == 0) {
                sb.append(" pss");
            }
            if ((this.f5524j & 16) == 0) {
                sb.append(" rss");
            }
            if ((this.f5524j & 32) == 0) {
                sb.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // L0.F.a.b
        public F.a.b b(List list) {
            this.f5523i = list;
            return this;
        }

        @Override // L0.F.a.b
        public F.a.b c(int i8) {
            this.f5518d = i8;
            this.f5524j = (byte) (this.f5524j | 4);
            return this;
        }

        @Override // L0.F.a.b
        public F.a.b d(int i8) {
            this.f5515a = i8;
            this.f5524j = (byte) (this.f5524j | 1);
            return this;
        }

        @Override // L0.F.a.b
        public F.a.b e(String str) {
            if (str != null) {
                this.f5516b = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }

        @Override // L0.F.a.b
        public F.a.b f(long j8) {
            this.f5519e = j8;
            this.f5524j = (byte) (this.f5524j | 8);
            return this;
        }

        @Override // L0.F.a.b
        public F.a.b g(int i8) {
            this.f5517c = i8;
            this.f5524j = (byte) (this.f5524j | 2);
            return this;
        }

        @Override // L0.F.a.b
        public F.a.b h(long j8) {
            this.f5520f = j8;
            this.f5524j = (byte) (this.f5524j | 16);
            return this;
        }

        @Override // L0.F.a.b
        public F.a.b i(long j8) {
            this.f5521g = j8;
            this.f5524j = (byte) (this.f5524j | 32);
            return this;
        }

        @Override // L0.F.a.b
        public F.a.b j(String str) {
            this.f5522h = str;
            return this;
        }
    }

    @Override // L0.F.a
    public List b() {
        return this.f5514i;
    }

    @Override // L0.F.a
    public int c() {
        return this.f5509d;
    }

    @Override // L0.F.a
    public int d() {
        return this.f5506a;
    }

    @Override // L0.F.a
    public String e() {
        return this.f5507b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.a)) {
            return false;
        }
        F.a aVar = (F.a) obj;
        if (this.f5506a == aVar.d() && this.f5507b.equals(aVar.e()) && this.f5508c == aVar.g() && this.f5509d == aVar.c() && this.f5510e == aVar.f() && this.f5511f == aVar.h() && this.f5512g == aVar.i() && ((str = this.f5513h) != null ? str.equals(aVar.j()) : aVar.j() == null)) {
            List list = this.f5514i;
            if (list == null) {
                if (aVar.b() == null) {
                    return true;
                }
            } else if (list.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // L0.F.a
    public long f() {
        return this.f5510e;
    }

    @Override // L0.F.a
    public int g() {
        return this.f5508c;
    }

    @Override // L0.F.a
    public long h() {
        return this.f5511f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.f5506a ^ 1000003) * 1000003) ^ this.f5507b.hashCode()) * 1000003) ^ this.f5508c) * 1000003) ^ this.f5509d) * 1000003;
        long j8 = this.f5510e;
        int i8 = (hashCode2 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f5511f;
        int i9 = (i8 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f5512g;
        int i10 = (i9 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str = this.f5513h;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (i10 ^ hashCode) * 1000003;
        List list = this.f5514i;
        if (list != null) {
            i11 = list.hashCode();
        }
        return i12 ^ i11;
    }

    @Override // L0.F.a
    public long i() {
        return this.f5512g;
    }

    @Override // L0.F.a
    public String j() {
        return this.f5513h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f5506a + ", processName=" + this.f5507b + ", reasonCode=" + this.f5508c + ", importance=" + this.f5509d + ", pss=" + this.f5510e + ", rss=" + this.f5511f + ", timestamp=" + this.f5512g + ", traceFile=" + this.f5513h + ", buildIdMappingForArch=" + this.f5514i + "}";
    }

    private C1293c(int i8, String str, int i9, int i10, long j8, long j9, long j10, String str2, List list) {
        this.f5506a = i8;
        this.f5507b = str;
        this.f5508c = i9;
        this.f5509d = i10;
        this.f5510e = j8;
        this.f5511f = j9;
        this.f5512g = j10;
        this.f5513h = str2;
        this.f5514i = list;
    }
}
