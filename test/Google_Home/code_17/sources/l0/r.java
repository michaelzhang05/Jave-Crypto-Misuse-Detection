package L0;

import L0.F;
import java.util.List;

/* loaded from: classes3.dex */
final class r extends F.e.d.a.b.AbstractC0091e {

    /* renamed from: a, reason: collision with root package name */
    private final String f5664a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5665b;

    /* renamed from: c, reason: collision with root package name */
    private final List f5666c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.a.b.AbstractC0091e.AbstractC0092a {

        /* renamed from: a, reason: collision with root package name */
        private String f5667a;

        /* renamed from: b, reason: collision with root package name */
        private int f5668b;

        /* renamed from: c, reason: collision with root package name */
        private List f5669c;

        /* renamed from: d, reason: collision with root package name */
        private byte f5670d;

        @Override // L0.F.e.d.a.b.AbstractC0091e.AbstractC0092a
        public F.e.d.a.b.AbstractC0091e a() {
            String str;
            List list;
            if (this.f5670d == 1 && (str = this.f5667a) != null && (list = this.f5669c) != null) {
                return new r(str, this.f5668b, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5667a == null) {
                sb.append(" name");
            }
            if ((1 & this.f5670d) == 0) {
                sb.append(" importance");
            }
            if (this.f5669c == null) {
                sb.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // L0.F.e.d.a.b.AbstractC0091e.AbstractC0092a
        public F.e.d.a.b.AbstractC0091e.AbstractC0092a b(List list) {
            if (list != null) {
                this.f5669c = list;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // L0.F.e.d.a.b.AbstractC0091e.AbstractC0092a
        public F.e.d.a.b.AbstractC0091e.AbstractC0092a c(int i8) {
            this.f5668b = i8;
            this.f5670d = (byte) (this.f5670d | 1);
            return this;
        }

        @Override // L0.F.e.d.a.b.AbstractC0091e.AbstractC0092a
        public F.e.d.a.b.AbstractC0091e.AbstractC0092a d(String str) {
            if (str != null) {
                this.f5667a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @Override // L0.F.e.d.a.b.AbstractC0091e
    public List b() {
        return this.f5666c;
    }

    @Override // L0.F.e.d.a.b.AbstractC0091e
    public int c() {
        return this.f5665b;
    }

    @Override // L0.F.e.d.a.b.AbstractC0091e
    public String d() {
        return this.f5664a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.AbstractC0091e)) {
            return false;
        }
        F.e.d.a.b.AbstractC0091e abstractC0091e = (F.e.d.a.b.AbstractC0091e) obj;
        if (this.f5664a.equals(abstractC0091e.d()) && this.f5665b == abstractC0091e.c() && this.f5666c.equals(abstractC0091e.b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f5664a.hashCode() ^ 1000003) * 1000003) ^ this.f5665b) * 1000003) ^ this.f5666c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f5664a + ", importance=" + this.f5665b + ", frames=" + this.f5666c + "}";
    }

    private r(String str, int i8, List list) {
        this.f5664a = str;
        this.f5665b = i8;
        this.f5666c = list;
    }
}
