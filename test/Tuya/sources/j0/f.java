package J0;

import J0.B;

/* loaded from: classes3.dex */
final class f extends B.d {

    /* renamed from: a, reason: collision with root package name */
    private final C f4513a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4514b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.d.a {

        /* renamed from: a, reason: collision with root package name */
        private C f4515a;

        /* renamed from: b, reason: collision with root package name */
        private String f4516b;

        @Override // J0.B.d.a
        public B.d a() {
            String str = "";
            if (this.f4515a == null) {
                str = " files";
            }
            if (str.isEmpty()) {
                return new f(this.f4515a, this.f4516b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.d.a
        public B.d.a b(C c8) {
            if (c8 != null) {
                this.f4515a = c8;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        @Override // J0.B.d.a
        public B.d.a c(String str) {
            this.f4516b = str;
            return this;
        }
    }

    @Override // J0.B.d
    public C b() {
        return this.f4513a;
    }

    @Override // J0.B.d
    public String c() {
        return this.f4514b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.d)) {
            return false;
        }
        B.d dVar = (B.d) obj;
        if (this.f4513a.equals(dVar.b())) {
            String str = this.f4514b;
            if (str == null) {
                if (dVar.c() == null) {
                    return true;
                }
            } else if (str.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f4513a.hashCode() ^ 1000003) * 1000003;
        String str = this.f4514b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "FilesPayload{files=" + this.f4513a + ", orgId=" + this.f4514b + "}";
    }

    private f(C c8, String str) {
        this.f4513a = c8;
        this.f4514b = str;
    }
}
