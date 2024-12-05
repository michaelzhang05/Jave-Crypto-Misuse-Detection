package L0;

import L0.F;
import java.util.List;

/* loaded from: classes3.dex */
final class m extends F.e.d.a {

    /* renamed from: a, reason: collision with root package name */
    private final F.e.d.a.b f5612a;

    /* renamed from: b, reason: collision with root package name */
    private final List f5613b;

    /* renamed from: c, reason: collision with root package name */
    private final List f5614c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f5615d;

    /* renamed from: e, reason: collision with root package name */
    private final F.e.d.a.c f5616e;

    /* renamed from: f, reason: collision with root package name */
    private final List f5617f;

    /* renamed from: g, reason: collision with root package name */
    private final int f5618g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.a.AbstractC0084a {

        /* renamed from: a, reason: collision with root package name */
        private F.e.d.a.b f5619a;

        /* renamed from: b, reason: collision with root package name */
        private List f5620b;

        /* renamed from: c, reason: collision with root package name */
        private List f5621c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f5622d;

        /* renamed from: e, reason: collision with root package name */
        private F.e.d.a.c f5623e;

        /* renamed from: f, reason: collision with root package name */
        private List f5624f;

        /* renamed from: g, reason: collision with root package name */
        private int f5625g;

        /* renamed from: h, reason: collision with root package name */
        private byte f5626h;

        @Override // L0.F.e.d.a.AbstractC0084a
        public F.e.d.a a() {
            F.e.d.a.b bVar;
            if (this.f5626h == 1 && (bVar = this.f5619a) != null) {
                return new m(bVar, this.f5620b, this.f5621c, this.f5622d, this.f5623e, this.f5624f, this.f5625g);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5619a == null) {
                sb.append(" execution");
            }
            if ((1 & this.f5626h) == 0) {
                sb.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // L0.F.e.d.a.AbstractC0084a
        public F.e.d.a.AbstractC0084a b(List list) {
            this.f5624f = list;
            return this;
        }

        @Override // L0.F.e.d.a.AbstractC0084a
        public F.e.d.a.AbstractC0084a c(Boolean bool) {
            this.f5622d = bool;
            return this;
        }

        @Override // L0.F.e.d.a.AbstractC0084a
        public F.e.d.a.AbstractC0084a d(F.e.d.a.c cVar) {
            this.f5623e = cVar;
            return this;
        }

        @Override // L0.F.e.d.a.AbstractC0084a
        public F.e.d.a.AbstractC0084a e(List list) {
            this.f5620b = list;
            return this;
        }

        @Override // L0.F.e.d.a.AbstractC0084a
        public F.e.d.a.AbstractC0084a f(F.e.d.a.b bVar) {
            if (bVar != null) {
                this.f5619a = bVar;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        @Override // L0.F.e.d.a.AbstractC0084a
        public F.e.d.a.AbstractC0084a g(List list) {
            this.f5621c = list;
            return this;
        }

        @Override // L0.F.e.d.a.AbstractC0084a
        public F.e.d.a.AbstractC0084a h(int i8) {
            this.f5625g = i8;
            this.f5626h = (byte) (this.f5626h | 1);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(F.e.d.a aVar) {
            this.f5619a = aVar.f();
            this.f5620b = aVar.e();
            this.f5621c = aVar.g();
            this.f5622d = aVar.c();
            this.f5623e = aVar.d();
            this.f5624f = aVar.b();
            this.f5625g = aVar.h();
            this.f5626h = (byte) 1;
        }
    }

    @Override // L0.F.e.d.a
    public List b() {
        return this.f5617f;
    }

    @Override // L0.F.e.d.a
    public Boolean c() {
        return this.f5615d;
    }

    @Override // L0.F.e.d.a
    public F.e.d.a.c d() {
        return this.f5616e;
    }

    @Override // L0.F.e.d.a
    public List e() {
        return this.f5613b;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        F.e.d.a.c cVar;
        List list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a)) {
            return false;
        }
        F.e.d.a aVar = (F.e.d.a) obj;
        if (this.f5612a.equals(aVar.f()) && ((list = this.f5613b) != null ? list.equals(aVar.e()) : aVar.e() == null) && ((list2 = this.f5614c) != null ? list2.equals(aVar.g()) : aVar.g() == null) && ((bool = this.f5615d) != null ? bool.equals(aVar.c()) : aVar.c() == null) && ((cVar = this.f5616e) != null ? cVar.equals(aVar.d()) : aVar.d() == null) && ((list3 = this.f5617f) != null ? list3.equals(aVar.b()) : aVar.b() == null) && this.f5618g == aVar.h()) {
            return true;
        }
        return false;
    }

    @Override // L0.F.e.d.a
    public F.e.d.a.b f() {
        return this.f5612a;
    }

    @Override // L0.F.e.d.a
    public List g() {
        return this.f5614c;
    }

    @Override // L0.F.e.d.a
    public int h() {
        return this.f5618g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (this.f5612a.hashCode() ^ 1000003) * 1000003;
        List list = this.f5613b;
        int i8 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i9 = (hashCode5 ^ hashCode) * 1000003;
        List list2 = this.f5614c;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i10 = (i9 ^ hashCode2) * 1000003;
        Boolean bool = this.f5615d;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i11 = (i10 ^ hashCode3) * 1000003;
        F.e.d.a.c cVar = this.f5616e;
        if (cVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = cVar.hashCode();
        }
        int i12 = (i11 ^ hashCode4) * 1000003;
        List list3 = this.f5617f;
        if (list3 != null) {
            i8 = list3.hashCode();
        }
        return ((i12 ^ i8) * 1000003) ^ this.f5618g;
    }

    @Override // L0.F.e.d.a
    public F.e.d.a.AbstractC0084a i() {
        return new b(this);
    }

    public String toString() {
        return "Application{execution=" + this.f5612a + ", customAttributes=" + this.f5613b + ", internalKeys=" + this.f5614c + ", background=" + this.f5615d + ", currentProcessDetails=" + this.f5616e + ", appProcessDetails=" + this.f5617f + ", uiOrientation=" + this.f5618g + "}";
    }

    private m(F.e.d.a.b bVar, List list, List list2, Boolean bool, F.e.d.a.c cVar, List list3, int i8) {
        this.f5612a = bVar;
        this.f5613b = list;
        this.f5614c = list2;
        this.f5615d = bool;
        this.f5616e = cVar;
        this.f5617f = list3;
        this.f5618g = i8;
    }
}
