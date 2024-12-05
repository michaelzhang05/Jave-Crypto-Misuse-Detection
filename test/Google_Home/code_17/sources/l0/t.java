package L0;

import L0.F;

/* loaded from: classes3.dex */
final class t extends F.e.d.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f5682a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5683b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5684c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5685d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.a.c.AbstractC0095a {

        /* renamed from: a, reason: collision with root package name */
        private String f5686a;

        /* renamed from: b, reason: collision with root package name */
        private int f5687b;

        /* renamed from: c, reason: collision with root package name */
        private int f5688c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f5689d;

        /* renamed from: e, reason: collision with root package name */
        private byte f5690e;

        @Override // L0.F.e.d.a.c.AbstractC0095a
        public F.e.d.a.c a() {
            String str;
            if (this.f5690e == 7 && (str = this.f5686a) != null) {
                return new t(str, this.f5687b, this.f5688c, this.f5689d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5686a == null) {
                sb.append(" processName");
            }
            if ((this.f5690e & 1) == 0) {
                sb.append(" pid");
            }
            if ((this.f5690e & 2) == 0) {
                sb.append(" importance");
            }
            if ((this.f5690e & 4) == 0) {
                sb.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // L0.F.e.d.a.c.AbstractC0095a
        public F.e.d.a.c.AbstractC0095a b(boolean z8) {
            this.f5689d = z8;
            this.f5690e = (byte) (this.f5690e | 4);
            return this;
        }

        @Override // L0.F.e.d.a.c.AbstractC0095a
        public F.e.d.a.c.AbstractC0095a c(int i8) {
            this.f5688c = i8;
            this.f5690e = (byte) (this.f5690e | 2);
            return this;
        }

        @Override // L0.F.e.d.a.c.AbstractC0095a
        public F.e.d.a.c.AbstractC0095a d(int i8) {
            this.f5687b = i8;
            this.f5690e = (byte) (this.f5690e | 1);
            return this;
        }

        @Override // L0.F.e.d.a.c.AbstractC0095a
        public F.e.d.a.c.AbstractC0095a e(String str) {
            if (str != null) {
                this.f5686a = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }
    }

    @Override // L0.F.e.d.a.c
    public int b() {
        return this.f5684c;
    }

    @Override // L0.F.e.d.a.c
    public int c() {
        return this.f5683b;
    }

    @Override // L0.F.e.d.a.c
    public String d() {
        return this.f5682a;
    }

    @Override // L0.F.e.d.a.c
    public boolean e() {
        return this.f5685d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.c)) {
            return false;
        }
        F.e.d.a.c cVar = (F.e.d.a.c) obj;
        if (this.f5682a.equals(cVar.d()) && this.f5683b == cVar.c() && this.f5684c == cVar.b() && this.f5685d == cVar.e()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i8;
        int hashCode = (((((this.f5682a.hashCode() ^ 1000003) * 1000003) ^ this.f5683b) * 1000003) ^ this.f5684c) * 1000003;
        if (this.f5685d) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        return hashCode ^ i8;
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f5682a + ", pid=" + this.f5683b + ", importance=" + this.f5684c + ", defaultProcess=" + this.f5685d + "}";
    }

    private t(String str, int i8, int i9, boolean z8) {
        this.f5682a = str;
        this.f5683b = i8;
        this.f5684c = i9;
        this.f5685d = z8;
    }
}
