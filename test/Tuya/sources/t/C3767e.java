package t;

import t.k;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3767e extends k {

    /* renamed from: a, reason: collision with root package name */
    private final k.b f38107a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3763a f38108b;

    /* renamed from: t.e$b */
    /* loaded from: classes3.dex */
    static final class b extends k.a {

        /* renamed from: a, reason: collision with root package name */
        private k.b f38109a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC3763a f38110b;

        @Override // t.k.a
        public k a() {
            return new C3767e(this.f38109a, this.f38110b);
        }

        @Override // t.k.a
        public k.a b(AbstractC3763a abstractC3763a) {
            this.f38110b = abstractC3763a;
            return this;
        }

        @Override // t.k.a
        public k.a c(k.b bVar) {
            this.f38109a = bVar;
            return this;
        }
    }

    @Override // t.k
    public AbstractC3763a b() {
        return this.f38108b;
    }

    @Override // t.k
    public k.b c() {
        return this.f38107a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.b bVar = this.f38107a;
        if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
            AbstractC3763a abstractC3763a = this.f38108b;
            if (abstractC3763a == null) {
                if (kVar.b() == null) {
                    return true;
                }
            } else if (abstractC3763a.equals(kVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        k.b bVar = this.f38107a;
        int i8 = 0;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        int i9 = (hashCode ^ 1000003) * 1000003;
        AbstractC3763a abstractC3763a = this.f38108b;
        if (abstractC3763a != null) {
            i8 = abstractC3763a.hashCode();
        }
        return i9 ^ i8;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f38107a + ", androidClientInfo=" + this.f38108b + "}";
    }

    private C3767e(k.b bVar, AbstractC3763a abstractC3763a) {
        this.f38107a = bVar;
        this.f38108b = abstractC3763a;
    }
}
