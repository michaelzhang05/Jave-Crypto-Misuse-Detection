package L0;

import L0.F;
import java.util.List;

/* loaded from: classes3.dex */
final class n extends F.e.d.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final List f5627a;

    /* renamed from: b, reason: collision with root package name */
    private final F.e.d.a.b.c f5628b;

    /* renamed from: c, reason: collision with root package name */
    private final F.a f5629c;

    /* renamed from: d, reason: collision with root package name */
    private final F.e.d.a.b.AbstractC0089d f5630d;

    /* renamed from: e, reason: collision with root package name */
    private final List f5631e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.a.b.AbstractC0087b {

        /* renamed from: a, reason: collision with root package name */
        private List f5632a;

        /* renamed from: b, reason: collision with root package name */
        private F.e.d.a.b.c f5633b;

        /* renamed from: c, reason: collision with root package name */
        private F.a f5634c;

        /* renamed from: d, reason: collision with root package name */
        private F.e.d.a.b.AbstractC0089d f5635d;

        /* renamed from: e, reason: collision with root package name */
        private List f5636e;

        @Override // L0.F.e.d.a.b.AbstractC0087b
        public F.e.d.a.b a() {
            List list;
            F.e.d.a.b.AbstractC0089d abstractC0089d = this.f5635d;
            if (abstractC0089d != null && (list = this.f5636e) != null) {
                return new n(this.f5632a, this.f5633b, this.f5634c, abstractC0089d, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5635d == null) {
                sb.append(" signal");
            }
            if (this.f5636e == null) {
                sb.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // L0.F.e.d.a.b.AbstractC0087b
        public F.e.d.a.b.AbstractC0087b b(F.a aVar) {
            this.f5634c = aVar;
            return this;
        }

        @Override // L0.F.e.d.a.b.AbstractC0087b
        public F.e.d.a.b.AbstractC0087b c(List list) {
            if (list != null) {
                this.f5636e = list;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        @Override // L0.F.e.d.a.b.AbstractC0087b
        public F.e.d.a.b.AbstractC0087b d(F.e.d.a.b.c cVar) {
            this.f5633b = cVar;
            return this;
        }

        @Override // L0.F.e.d.a.b.AbstractC0087b
        public F.e.d.a.b.AbstractC0087b e(F.e.d.a.b.AbstractC0089d abstractC0089d) {
            if (abstractC0089d != null) {
                this.f5635d = abstractC0089d;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        @Override // L0.F.e.d.a.b.AbstractC0087b
        public F.e.d.a.b.AbstractC0087b f(List list) {
            this.f5632a = list;
            return this;
        }
    }

    @Override // L0.F.e.d.a.b
    public F.a b() {
        return this.f5629c;
    }

    @Override // L0.F.e.d.a.b
    public List c() {
        return this.f5631e;
    }

    @Override // L0.F.e.d.a.b
    public F.e.d.a.b.c d() {
        return this.f5628b;
    }

    @Override // L0.F.e.d.a.b
    public F.e.d.a.b.AbstractC0089d e() {
        return this.f5630d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b)) {
            return false;
        }
        F.e.d.a.b bVar = (F.e.d.a.b) obj;
        List list = this.f5627a;
        if (list != null ? list.equals(bVar.f()) : bVar.f() == null) {
            F.e.d.a.b.c cVar = this.f5628b;
            if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                F.a aVar = this.f5629c;
                if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                    if (this.f5630d.equals(bVar.e()) && this.f5631e.equals(bVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // L0.F.e.d.a.b
    public List f() {
        return this.f5627a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        List list = this.f5627a;
        int i8 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i9 = (hashCode ^ 1000003) * 1000003;
        F.e.d.a.b.c cVar = this.f5628b;
        if (cVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = cVar.hashCode();
        }
        int i10 = (i9 ^ hashCode2) * 1000003;
        F.a aVar = this.f5629c;
        if (aVar != null) {
            i8 = aVar.hashCode();
        }
        return ((((i10 ^ i8) * 1000003) ^ this.f5630d.hashCode()) * 1000003) ^ this.f5631e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f5627a + ", exception=" + this.f5628b + ", appExitInfo=" + this.f5629c + ", signal=" + this.f5630d + ", binaries=" + this.f5631e + "}";
    }

    private n(List list, F.e.d.a.b.c cVar, F.a aVar, F.e.d.a.b.AbstractC0089d abstractC0089d, List list2) {
        this.f5627a = list;
        this.f5628b = cVar;
        this.f5629c = aVar;
        this.f5630d = abstractC0089d;
        this.f5631e = list2;
    }
}
