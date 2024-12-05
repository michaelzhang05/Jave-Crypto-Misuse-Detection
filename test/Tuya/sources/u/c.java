package u;

import s.AbstractC3701c;
import s.C3700b;
import s.InterfaceC3703e;
import u.o;

/* loaded from: classes3.dex */
final class c extends o {

    /* renamed from: a, reason: collision with root package name */
    private final p f38431a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38432b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3701c f38433c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3703e f38434d;

    /* renamed from: e, reason: collision with root package name */
    private final C3700b f38435e;

    /* loaded from: classes3.dex */
    static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private p f38436a;

        /* renamed from: b, reason: collision with root package name */
        private String f38437b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC3701c f38438c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC3703e f38439d;

        /* renamed from: e, reason: collision with root package name */
        private C3700b f38440e;

        @Override // u.o.a
        public o a() {
            String str = "";
            if (this.f38436a == null) {
                str = " transportContext";
            }
            if (this.f38437b == null) {
                str = str + " transportName";
            }
            if (this.f38438c == null) {
                str = str + " event";
            }
            if (this.f38439d == null) {
                str = str + " transformer";
            }
            if (this.f38440e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f38436a, this.f38437b, this.f38438c, this.f38439d, this.f38440e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // u.o.a
        o.a b(C3700b c3700b) {
            if (c3700b != null) {
                this.f38440e = c3700b;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        @Override // u.o.a
        o.a c(AbstractC3701c abstractC3701c) {
            if (abstractC3701c != null) {
                this.f38438c = abstractC3701c;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        @Override // u.o.a
        o.a d(InterfaceC3703e interfaceC3703e) {
            if (interfaceC3703e != null) {
                this.f38439d = interfaceC3703e;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        @Override // u.o.a
        public o.a e(p pVar) {
            if (pVar != null) {
                this.f38436a = pVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        @Override // u.o.a
        public o.a f(String str) {
            if (str != null) {
                this.f38437b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    @Override // u.o
    public C3700b b() {
        return this.f38435e;
    }

    @Override // u.o
    AbstractC3701c c() {
        return this.f38433c;
    }

    @Override // u.o
    InterfaceC3703e e() {
        return this.f38434d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f38431a.equals(oVar.f()) && this.f38432b.equals(oVar.g()) && this.f38433c.equals(oVar.c()) && this.f38434d.equals(oVar.e()) && this.f38435e.equals(oVar.b())) {
            return true;
        }
        return false;
    }

    @Override // u.o
    public p f() {
        return this.f38431a;
    }

    @Override // u.o
    public String g() {
        return this.f38432b;
    }

    public int hashCode() {
        return ((((((((this.f38431a.hashCode() ^ 1000003) * 1000003) ^ this.f38432b.hashCode()) * 1000003) ^ this.f38433c.hashCode()) * 1000003) ^ this.f38434d.hashCode()) * 1000003) ^ this.f38435e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f38431a + ", transportName=" + this.f38432b + ", event=" + this.f38433c + ", transformer=" + this.f38434d + ", encoding=" + this.f38435e + "}";
    }

    private c(p pVar, String str, AbstractC3701c abstractC3701c, InterfaceC3703e interfaceC3703e, C3700b c3700b) {
        this.f38431a = pVar;
        this.f38432b = str;
        this.f38433c = abstractC3701c;
        this.f38434d = interfaceC3703e;
        this.f38435e = c3700b;
    }
}
