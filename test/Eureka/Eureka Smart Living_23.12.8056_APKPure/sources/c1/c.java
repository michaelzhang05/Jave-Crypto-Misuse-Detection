package c1;

import c1.a;

/* loaded from: classes.dex */
final class c extends c1.a {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f3899a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3900b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3901c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3902d;

    /* renamed from: e, reason: collision with root package name */
    private final String f3903e;

    /* renamed from: f, reason: collision with root package name */
    private final String f3904f;

    /* renamed from: g, reason: collision with root package name */
    private final String f3905g;

    /* renamed from: h, reason: collision with root package name */
    private final String f3906h;

    /* renamed from: i, reason: collision with root package name */
    private final String f3907i;

    /* renamed from: j, reason: collision with root package name */
    private final String f3908j;

    /* renamed from: k, reason: collision with root package name */
    private final String f3909k;

    /* renamed from: l, reason: collision with root package name */
    private final String f3910l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends a.AbstractC0069a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f3911a;

        /* renamed from: b, reason: collision with root package name */
        private String f3912b;

        /* renamed from: c, reason: collision with root package name */
        private String f3913c;

        /* renamed from: d, reason: collision with root package name */
        private String f3914d;

        /* renamed from: e, reason: collision with root package name */
        private String f3915e;

        /* renamed from: f, reason: collision with root package name */
        private String f3916f;

        /* renamed from: g, reason: collision with root package name */
        private String f3917g;

        /* renamed from: h, reason: collision with root package name */
        private String f3918h;

        /* renamed from: i, reason: collision with root package name */
        private String f3919i;

        /* renamed from: j, reason: collision with root package name */
        private String f3920j;

        /* renamed from: k, reason: collision with root package name */
        private String f3921k;

        /* renamed from: l, reason: collision with root package name */
        private String f3922l;

        @Override // c1.a.AbstractC0069a
        public c1.a a() {
            return new c(this.f3911a, this.f3912b, this.f3913c, this.f3914d, this.f3915e, this.f3916f, this.f3917g, this.f3918h, this.f3919i, this.f3920j, this.f3921k, this.f3922l);
        }

        @Override // c1.a.AbstractC0069a
        public a.AbstractC0069a b(String str) {
            this.f3922l = str;
            return this;
        }

        @Override // c1.a.AbstractC0069a
        public a.AbstractC0069a c(String str) {
            this.f3920j = str;
            return this;
        }

        @Override // c1.a.AbstractC0069a
        public a.AbstractC0069a d(String str) {
            this.f3914d = str;
            return this;
        }

        @Override // c1.a.AbstractC0069a
        public a.AbstractC0069a e(String str) {
            this.f3918h = str;
            return this;
        }

        @Override // c1.a.AbstractC0069a
        public a.AbstractC0069a f(String str) {
            this.f3913c = str;
            return this;
        }

        @Override // c1.a.AbstractC0069a
        public a.AbstractC0069a g(String str) {
            this.f3919i = str;
            return this;
        }

        @Override // c1.a.AbstractC0069a
        public a.AbstractC0069a h(String str) {
            this.f3917g = str;
            return this;
        }

        @Override // c1.a.AbstractC0069a
        public a.AbstractC0069a i(String str) {
            this.f3921k = str;
            return this;
        }

        @Override // c1.a.AbstractC0069a
        public a.AbstractC0069a j(String str) {
            this.f3912b = str;
            return this;
        }

        @Override // c1.a.AbstractC0069a
        public a.AbstractC0069a k(String str) {
            this.f3916f = str;
            return this;
        }

        @Override // c1.a.AbstractC0069a
        public a.AbstractC0069a l(String str) {
            this.f3915e = str;
            return this;
        }

        @Override // c1.a.AbstractC0069a
        public a.AbstractC0069a m(Integer num) {
            this.f3911a = num;
            return this;
        }
    }

    private c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f3899a = num;
        this.f3900b = str;
        this.f3901c = str2;
        this.f3902d = str3;
        this.f3903e = str4;
        this.f3904f = str5;
        this.f3905g = str6;
        this.f3906h = str7;
        this.f3907i = str8;
        this.f3908j = str9;
        this.f3909k = str10;
        this.f3910l = str11;
    }

    @Override // c1.a
    public String b() {
        return this.f3910l;
    }

    @Override // c1.a
    public String c() {
        return this.f3908j;
    }

    @Override // c1.a
    public String d() {
        return this.f3902d;
    }

    @Override // c1.a
    public String e() {
        return this.f3906h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c1.a)) {
            return false;
        }
        c1.a aVar = (c1.a) obj;
        Integer num = this.f3899a;
        if (num != null ? num.equals(aVar.m()) : aVar.m() == null) {
            String str = this.f3900b;
            if (str != null ? str.equals(aVar.j()) : aVar.j() == null) {
                String str2 = this.f3901c;
                if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                    String str3 = this.f3902d;
                    if (str3 != null ? str3.equals(aVar.d()) : aVar.d() == null) {
                        String str4 = this.f3903e;
                        if (str4 != null ? str4.equals(aVar.l()) : aVar.l() == null) {
                            String str5 = this.f3904f;
                            if (str5 != null ? str5.equals(aVar.k()) : aVar.k() == null) {
                                String str6 = this.f3905g;
                                if (str6 != null ? str6.equals(aVar.h()) : aVar.h() == null) {
                                    String str7 = this.f3906h;
                                    if (str7 != null ? str7.equals(aVar.e()) : aVar.e() == null) {
                                        String str8 = this.f3907i;
                                        if (str8 != null ? str8.equals(aVar.g()) : aVar.g() == null) {
                                            String str9 = this.f3908j;
                                            if (str9 != null ? str9.equals(aVar.c()) : aVar.c() == null) {
                                                String str10 = this.f3909k;
                                                if (str10 != null ? str10.equals(aVar.i()) : aVar.i() == null) {
                                                    String str11 = this.f3910l;
                                                    String b6 = aVar.b();
                                                    if (str11 == null) {
                                                        if (b6 == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(b6)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // c1.a
    public String f() {
        return this.f3901c;
    }

    @Override // c1.a
    public String g() {
        return this.f3907i;
    }

    @Override // c1.a
    public String h() {
        return this.f3905g;
    }

    public int hashCode() {
        Integer num = this.f3899a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f3900b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f3901c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f3902d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f3903e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f3904f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f3905g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f3906h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f3907i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f3908j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f3909k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f3910l;
        return hashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    @Override // c1.a
    public String i() {
        return this.f3909k;
    }

    @Override // c1.a
    public String j() {
        return this.f3900b;
    }

    @Override // c1.a
    public String k() {
        return this.f3904f;
    }

    @Override // c1.a
    public String l() {
        return this.f3903e;
    }

    @Override // c1.a
    public Integer m() {
        return this.f3899a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f3899a + ", model=" + this.f3900b + ", hardware=" + this.f3901c + ", device=" + this.f3902d + ", product=" + this.f3903e + ", osBuild=" + this.f3904f + ", manufacturer=" + this.f3905g + ", fingerprint=" + this.f3906h + ", locale=" + this.f3907i + ", country=" + this.f3908j + ", mccMnc=" + this.f3909k + ", applicationBuild=" + this.f3910l + "}";
    }
}
