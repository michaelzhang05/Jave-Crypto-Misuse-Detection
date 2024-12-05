package com.google.firebase.installations;

import com.google.firebase.installations.g;

/* loaded from: classes3.dex */
final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    private final String f18290a;

    /* renamed from: b, reason: collision with root package name */
    private final long f18291b;

    /* renamed from: c, reason: collision with root package name */
    private final long f18292c;

    /* loaded from: classes3.dex */
    static final class b extends g.a {

        /* renamed from: a, reason: collision with root package name */
        private String f18293a;

        /* renamed from: b, reason: collision with root package name */
        private Long f18294b;

        /* renamed from: c, reason: collision with root package name */
        private Long f18295c;

        @Override // com.google.firebase.installations.g.a
        public g a() {
            String str = "";
            if (this.f18293a == null) {
                str = " token";
            }
            if (this.f18294b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f18295c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f18293a, this.f18294b.longValue(), this.f18295c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.g.a
        public g.a b(String str) {
            if (str != null) {
                this.f18293a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        @Override // com.google.firebase.installations.g.a
        public g.a c(long j8) {
            this.f18295c = Long.valueOf(j8);
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a d(long j8) {
            this.f18294b = Long.valueOf(j8);
            return this;
        }
    }

    @Override // com.google.firebase.installations.g
    public String b() {
        return this.f18290a;
    }

    @Override // com.google.firebase.installations.g
    public long c() {
        return this.f18292c;
    }

    @Override // com.google.firebase.installations.g
    public long d() {
        return this.f18291b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f18290a.equals(gVar.b()) && this.f18291b == gVar.d() && this.f18292c == gVar.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f18290a.hashCode() ^ 1000003) * 1000003;
        long j8 = this.f18291b;
        long j9 = this.f18292c;
        return ((hashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f18290a + ", tokenExpirationTimestamp=" + this.f18291b + ", tokenCreationTimestamp=" + this.f18292c + "}";
    }

    private a(String str, long j8, long j9) {
        this.f18290a = str;
        this.f18291b = j8;
        this.f18292c = j9;
    }
}
