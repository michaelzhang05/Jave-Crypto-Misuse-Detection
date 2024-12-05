package u;

import s.AbstractC3983d;
import s.C3982c;
import u.o;

/* loaded from: classes3.dex */
final class c extends o {

    /* renamed from: a, reason: collision with root package name */
    private final p f39858a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39859b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3983d f39860c;

    /* renamed from: d, reason: collision with root package name */
    private final s.h f39861d;

    /* renamed from: e, reason: collision with root package name */
    private final C3982c f39862e;

    /* loaded from: classes3.dex */
    static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private p f39863a;

        /* renamed from: b, reason: collision with root package name */
        private String f39864b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC3983d f39865c;

        /* renamed from: d, reason: collision with root package name */
        private s.h f39866d;

        /* renamed from: e, reason: collision with root package name */
        private C3982c f39867e;

        @Override // u.o.a
        public o a() {
            String str = "";
            if (this.f39863a == null) {
                str = " transportContext";
            }
            if (this.f39864b == null) {
                str = str + " transportName";
            }
            if (this.f39865c == null) {
                str = str + " event";
            }
            if (this.f39866d == null) {
                str = str + " transformer";
            }
            if (this.f39867e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f39863a, this.f39864b, this.f39865c, this.f39866d, this.f39867e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // u.o.a
        o.a b(C3982c c3982c) {
            if (c3982c != null) {
                this.f39867e = c3982c;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        @Override // u.o.a
        o.a c(AbstractC3983d abstractC3983d) {
            if (abstractC3983d != null) {
                this.f39865c = abstractC3983d;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        @Override // u.o.a
        o.a d(s.h hVar) {
            if (hVar != null) {
                this.f39866d = hVar;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        @Override // u.o.a
        public o.a e(p pVar) {
            if (pVar != null) {
                this.f39863a = pVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        @Override // u.o.a
        public o.a f(String str) {
            if (str != null) {
                this.f39864b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    @Override // u.o
    public C3982c b() {
        return this.f39862e;
    }

    @Override // u.o
    AbstractC3983d c() {
        return this.f39860c;
    }

    @Override // u.o
    s.h e() {
        return this.f39861d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f39858a.equals(oVar.f()) && this.f39859b.equals(oVar.g()) && this.f39860c.equals(oVar.c()) && this.f39861d.equals(oVar.e()) && this.f39862e.equals(oVar.b())) {
            return true;
        }
        return false;
    }

    @Override // u.o
    public p f() {
        return this.f39858a;
    }

    @Override // u.o
    public String g() {
        return this.f39859b;
    }

    public int hashCode() {
        return ((((((((this.f39858a.hashCode() ^ 1000003) * 1000003) ^ this.f39859b.hashCode()) * 1000003) ^ this.f39860c.hashCode()) * 1000003) ^ this.f39861d.hashCode()) * 1000003) ^ this.f39862e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f39858a + ", transportName=" + this.f39859b + ", event=" + this.f39860c + ", transformer=" + this.f39861d + ", encoding=" + this.f39862e + "}";
    }

    private c(p pVar, String str, AbstractC3983d abstractC3983d, s.h hVar, C3982c c3982c) {
        this.f39858a = pVar;
        this.f39859b = str;
        this.f39860c = abstractC3983d;
        this.f39861d = hVar;
        this.f39862e = c3982c;
    }
}
