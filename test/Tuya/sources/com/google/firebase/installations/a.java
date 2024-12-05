package com.google.firebase.installations;

import com.google.firebase.installations.g;

/* loaded from: classes3.dex */
final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    private final String f17256a;

    /* renamed from: b, reason: collision with root package name */
    private final long f17257b;

    /* renamed from: c, reason: collision with root package name */
    private final long f17258c;

    /* loaded from: classes3.dex */
    static final class b extends g.a {

        /* renamed from: a, reason: collision with root package name */
        private String f17259a;

        /* renamed from: b, reason: collision with root package name */
        private Long f17260b;

        /* renamed from: c, reason: collision with root package name */
        private Long f17261c;

        @Override // com.google.firebase.installations.g.a
        public g a() {
            String str = "";
            if (this.f17259a == null) {
                str = " token";
            }
            if (this.f17260b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f17261c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f17259a, this.f17260b.longValue(), this.f17261c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.g.a
        public g.a b(String str) {
            if (str != null) {
                this.f17259a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        @Override // com.google.firebase.installations.g.a
        public g.a c(long j8) {
            this.f17261c = Long.valueOf(j8);
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a d(long j8) {
            this.f17260b = Long.valueOf(j8);
            return this;
        }
    }

    @Override // com.google.firebase.installations.g
    public String b() {
        return this.f17256a;
    }

    @Override // com.google.firebase.installations.g
    public long c() {
        return this.f17258c;
    }

    @Override // com.google.firebase.installations.g
    public long d() {
        return this.f17257b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f17256a.equals(gVar.b()) && this.f17257b == gVar.d() && this.f17258c == gVar.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f17256a.hashCode() ^ 1000003) * 1000003;
        long j8 = this.f17257b;
        long j9 = this.f17258c;
        return ((hashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f17256a + ", tokenExpirationTimestamp=" + this.f17257b + ", tokenCreationTimestamp=" + this.f17258c + "}";
    }

    private a(String str, long j8, long j9) {
        this.f17256a = str;
        this.f17257b = j8;
        this.f17258c = j9;
    }
}
