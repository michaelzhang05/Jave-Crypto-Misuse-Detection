package t;

import java.util.Arrays;
import t.t;

/* loaded from: classes3.dex */
final class j extends t {

    /* renamed from: a, reason: collision with root package name */
    private final long f39433a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f39434b;

    /* renamed from: c, reason: collision with root package name */
    private final p f39435c;

    /* renamed from: d, reason: collision with root package name */
    private final long f39436d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f39437e;

    /* renamed from: f, reason: collision with root package name */
    private final String f39438f;

    /* renamed from: g, reason: collision with root package name */
    private final long f39439g;

    /* renamed from: h, reason: collision with root package name */
    private final w f39440h;

    /* renamed from: i, reason: collision with root package name */
    private final q f39441i;

    /* loaded from: classes3.dex */
    static final class b extends t.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f39442a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f39443b;

        /* renamed from: c, reason: collision with root package name */
        private p f39444c;

        /* renamed from: d, reason: collision with root package name */
        private Long f39445d;

        /* renamed from: e, reason: collision with root package name */
        private byte[] f39446e;

        /* renamed from: f, reason: collision with root package name */
        private String f39447f;

        /* renamed from: g, reason: collision with root package name */
        private Long f39448g;

        /* renamed from: h, reason: collision with root package name */
        private w f39449h;

        /* renamed from: i, reason: collision with root package name */
        private q f39450i;

        @Override // t.t.a
        public t a() {
            String str = "";
            if (this.f39442a == null) {
                str = " eventTimeMs";
            }
            if (this.f39445d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f39448g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new j(this.f39442a.longValue(), this.f39443b, this.f39444c, this.f39445d.longValue(), this.f39446e, this.f39447f, this.f39448g.longValue(), this.f39449h, this.f39450i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // t.t.a
        public t.a b(p pVar) {
            this.f39444c = pVar;
            return this;
        }

        @Override // t.t.a
        public t.a c(Integer num) {
            this.f39443b = num;
            return this;
        }

        @Override // t.t.a
        public t.a d(long j8) {
            this.f39442a = Long.valueOf(j8);
            return this;
        }

        @Override // t.t.a
        public t.a e(long j8) {
            this.f39445d = Long.valueOf(j8);
            return this;
        }

        @Override // t.t.a
        public t.a f(q qVar) {
            this.f39450i = qVar;
            return this;
        }

        @Override // t.t.a
        public t.a g(w wVar) {
            this.f39449h = wVar;
            return this;
        }

        @Override // t.t.a
        t.a h(byte[] bArr) {
            this.f39446e = bArr;
            return this;
        }

        @Override // t.t.a
        t.a i(String str) {
            this.f39447f = str;
            return this;
        }

        @Override // t.t.a
        public t.a j(long j8) {
            this.f39448g = Long.valueOf(j8);
            return this;
        }
    }

    @Override // t.t
    public p b() {
        return this.f39435c;
    }

    @Override // t.t
    public Integer c() {
        return this.f39434b;
    }

    @Override // t.t
    public long d() {
        return this.f39433a;
    }

    @Override // t.t
    public long e() {
        return this.f39436d;
    }

    public boolean equals(Object obj) {
        Integer num;
        p pVar;
        byte[] h8;
        String str;
        w wVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f39433a == tVar.d() && ((num = this.f39434b) != null ? num.equals(tVar.c()) : tVar.c() == null) && ((pVar = this.f39435c) != null ? pVar.equals(tVar.b()) : tVar.b() == null) && this.f39436d == tVar.e()) {
            byte[] bArr = this.f39437e;
            if (tVar instanceof j) {
                h8 = ((j) tVar).f39437e;
            } else {
                h8 = tVar.h();
            }
            if (Arrays.equals(bArr, h8) && ((str = this.f39438f) != null ? str.equals(tVar.i()) : tVar.i() == null) && this.f39439g == tVar.j() && ((wVar = this.f39440h) != null ? wVar.equals(tVar.g()) : tVar.g() == null)) {
                q qVar = this.f39441i;
                if (qVar == null) {
                    if (tVar.f() == null) {
                        return true;
                    }
                } else if (qVar.equals(tVar.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // t.t
    public q f() {
        return this.f39441i;
    }

    @Override // t.t
    public w g() {
        return this.f39440h;
    }

    @Override // t.t
    public byte[] h() {
        return this.f39437e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j8 = this.f39433a;
        int i8 = (((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f39434b;
        int i9 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = (i8 ^ hashCode) * 1000003;
        p pVar = this.f39435c;
        if (pVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = pVar.hashCode();
        }
        long j9 = this.f39436d;
        int hashCode5 = (((((i10 ^ hashCode2) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f39437e)) * 1000003;
        String str = this.f39438f;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        long j10 = this.f39439g;
        int i11 = (((hashCode5 ^ hashCode3) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        w wVar = this.f39440h;
        if (wVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = wVar.hashCode();
        }
        int i12 = (i11 ^ hashCode4) * 1000003;
        q qVar = this.f39441i;
        if (qVar != null) {
            i9 = qVar.hashCode();
        }
        return i12 ^ i9;
    }

    @Override // t.t
    public String i() {
        return this.f39438f;
    }

    @Override // t.t
    public long j() {
        return this.f39439g;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f39433a + ", eventCode=" + this.f39434b + ", complianceData=" + this.f39435c + ", eventUptimeMs=" + this.f39436d + ", sourceExtension=" + Arrays.toString(this.f39437e) + ", sourceExtensionJsonProto3=" + this.f39438f + ", timezoneOffsetSeconds=" + this.f39439g + ", networkConnectionInfo=" + this.f39440h + ", experimentIds=" + this.f39441i + "}";
    }

    private j(long j8, Integer num, p pVar, long j9, byte[] bArr, String str, long j10, w wVar, q qVar) {
        this.f39433a = j8;
        this.f39434b = num;
        this.f39435c = pVar;
        this.f39436d = j9;
        this.f39437e = bArr;
        this.f39438f = str;
        this.f39439g = j10;
        this.f39440h = wVar;
        this.f39441i = qVar;
    }
}
