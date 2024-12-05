package com.google.firebase.installations;

import com.google.firebase.installations.g;

/* loaded from: classes.dex */
final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    private final String f5769a;

    /* renamed from: b, reason: collision with root package name */
    private final long f5770b;

    /* renamed from: c, reason: collision with root package name */
    private final long f5771c;

    /* loaded from: classes.dex */
    static final class b extends g.a {

        /* renamed from: a, reason: collision with root package name */
        private String f5772a;

        /* renamed from: b, reason: collision with root package name */
        private Long f5773b;

        /* renamed from: c, reason: collision with root package name */
        private Long f5774c;

        @Override // com.google.firebase.installations.g.a
        public g a() {
            String str = "";
            if (this.f5772a == null) {
                str = " token";
            }
            if (this.f5773b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f5774c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f5772a, this.f5773b.longValue(), this.f5774c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.g.a
        public g.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f5772a = str;
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a c(long j6) {
            this.f5774c = Long.valueOf(j6);
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a d(long j6) {
            this.f5773b = Long.valueOf(j6);
            return this;
        }
    }

    private a(String str, long j6, long j7) {
        this.f5769a = str;
        this.f5770b = j6;
        this.f5771c = j7;
    }

    @Override // com.google.firebase.installations.g
    public String b() {
        return this.f5769a;
    }

    @Override // com.google.firebase.installations.g
    public long c() {
        return this.f5771c;
    }

    @Override // com.google.firebase.installations.g
    public long d() {
        return this.f5770b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f5769a.equals(gVar.b()) && this.f5770b == gVar.d() && this.f5771c == gVar.c();
    }

    public int hashCode() {
        int hashCode = (this.f5769a.hashCode() ^ 1000003) * 1000003;
        long j6 = this.f5770b;
        long j7 = this.f5771c;
        return ((hashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f5769a + ", tokenExpirationTimestamp=" + this.f5770b + ", tokenCreationTimestamp=" + this.f5771c + "}";
    }
}
