package N1;

import j$.util.DesugarCollections;
import java.net.URI;
import java.text.ParseException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class q extends b {

    /* renamed from: p, reason: collision with root package name */
    private static final Set f7617p;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f7618o;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("jku");
        hashSet.add("jwk");
        hashSet.add("x5u");
        hashSet.add("x5t");
        hashSet.add("x5t#S256");
        hashSet.add("x5c");
        hashSet.add("kid");
        hashSet.add("typ");
        hashSet.add("cty");
        hashSet.add("crit");
        hashSet.add("b64");
        f7617p = DesugarCollections.unmodifiableSet(hashSet);
    }

    public q(p pVar, h hVar, String str, Set set, URI uri, U1.d dVar, URI uri2, c2.c cVar, c2.c cVar2, List list, String str2, boolean z8, Map map, c2.c cVar3) {
        super(pVar, hVar, str, set, uri, dVar, uri2, cVar, cVar2, list, str2, map, cVar3);
        if (!pVar.a().equals(N1.a.f7496c.a())) {
            this.f7618o = z8;
            return;
        }
        throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
    }

    public static Set u() {
        return f7617p;
    }

    public static q w(c2.c cVar) {
        return x(cVar.c(), cVar);
    }

    public static q x(String str, c2.c cVar) {
        return y(c2.k.n(str, 20000), cVar);
    }

    public static q y(Map map, c2.c cVar) {
        N1.a g8 = e.g(map);
        if (g8 instanceof p) {
            a i8 = new a((p) g8).i(cVar);
            for (String str : map.keySet()) {
                if (!"alg".equals(str)) {
                    if ("typ".equals(str)) {
                        String h8 = c2.k.h(map, str);
                        if (h8 != null) {
                            i8 = i8.j(new h(h8));
                        }
                    } else if ("cty".equals(str)) {
                        i8 = i8.c(c2.k.h(map, str));
                    } else if ("crit".equals(str)) {
                        List j8 = c2.k.j(map, str);
                        if (j8 != null) {
                            i8 = i8.d(new HashSet(j8));
                        }
                    } else if ("jku".equals(str)) {
                        i8 = i8.g(c2.k.k(map, str));
                    } else if ("jwk".equals(str)) {
                        i8 = i8.f(b.s(c2.k.f(map, str)));
                    } else if ("x5u".equals(str)) {
                        i8 = i8.n(c2.k.k(map, str));
                    } else if ("x5t".equals(str)) {
                        i8 = i8.m(c2.c.f(c2.k.h(map, str)));
                    } else if ("x5t#S256".equals(str)) {
                        i8 = i8.l(c2.c.f(c2.k.h(map, str)));
                    } else if ("x5c".equals(str)) {
                        i8 = i8.k(c2.n.b(c2.k.e(map, str)));
                    } else if ("kid".equals(str)) {
                        i8 = i8.h(c2.k.h(map, str));
                    } else if ("b64".equals(str)) {
                        i8 = i8.a(c2.k.b(map, str));
                    } else {
                        i8 = i8.e(str, map.get(str));
                    }
                }
            }
            return i8.b();
        }
        throw new ParseException("Not a JWS header", 0);
    }

    @Override // N1.b, N1.e
    public Map i() {
        Map i8 = super.i();
        if (!v()) {
            i8.put("b64", Boolean.FALSE);
        }
        return i8;
    }

    @Override // N1.b
    public /* bridge */ /* synthetic */ U1.d j() {
        return super.j();
    }

    @Override // N1.b
    public /* bridge */ /* synthetic */ URI k() {
        return super.k();
    }

    @Override // N1.b
    public /* bridge */ /* synthetic */ String m() {
        return super.m();
    }

    @Override // N1.b
    public /* bridge */ /* synthetic */ List n() {
        return super.n();
    }

    @Override // N1.b
    public /* bridge */ /* synthetic */ c2.c o() {
        return super.o();
    }

    @Override // N1.b
    public /* bridge */ /* synthetic */ c2.c q() {
        return super.q();
    }

    @Override // N1.b
    public /* bridge */ /* synthetic */ URI r() {
        return super.r();
    }

    public p t() {
        return (p) super.a();
    }

    public boolean v() {
        return this.f7618o;
    }

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final p f7619a;

        /* renamed from: b, reason: collision with root package name */
        private h f7620b;

        /* renamed from: c, reason: collision with root package name */
        private String f7621c;

        /* renamed from: d, reason: collision with root package name */
        private Set f7622d;

        /* renamed from: e, reason: collision with root package name */
        private URI f7623e;

        /* renamed from: f, reason: collision with root package name */
        private U1.d f7624f;

        /* renamed from: g, reason: collision with root package name */
        private URI f7625g;

        /* renamed from: h, reason: collision with root package name */
        private c2.c f7626h;

        /* renamed from: i, reason: collision with root package name */
        private c2.c f7627i;

        /* renamed from: j, reason: collision with root package name */
        private List f7628j;

        /* renamed from: k, reason: collision with root package name */
        private String f7629k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f7630l;

        /* renamed from: m, reason: collision with root package name */
        private Map f7631m;

        /* renamed from: n, reason: collision with root package name */
        private c2.c f7632n;

        public a(p pVar) {
            this.f7630l = true;
            if (!pVar.a().equals(N1.a.f7496c.a())) {
                this.f7619a = pVar;
                return;
            }
            throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
        }

        public a a(boolean z8) {
            this.f7630l = z8;
            return this;
        }

        public q b() {
            return new q(this.f7619a, this.f7620b, this.f7621c, this.f7622d, this.f7623e, this.f7624f, this.f7625g, this.f7626h, this.f7627i, this.f7628j, this.f7629k, this.f7630l, this.f7631m, this.f7632n);
        }

        public a c(String str) {
            this.f7621c = str;
            return this;
        }

        public a d(Set set) {
            this.f7622d = set;
            return this;
        }

        public a e(String str, Object obj) {
            if (!q.u().contains(str)) {
                if (this.f7631m == null) {
                    this.f7631m = new HashMap();
                }
                this.f7631m.put(str, obj);
                return this;
            }
            throw new IllegalArgumentException("The parameter name \"" + str + "\" matches a registered name");
        }

        public a f(U1.d dVar) {
            if (dVar != null && dVar.k()) {
                throw new IllegalArgumentException("The JWK must be public");
            }
            this.f7624f = dVar;
            return this;
        }

        public a g(URI uri) {
            this.f7623e = uri;
            return this;
        }

        public a h(String str) {
            this.f7629k = str;
            return this;
        }

        public a i(c2.c cVar) {
            this.f7632n = cVar;
            return this;
        }

        public a j(h hVar) {
            this.f7620b = hVar;
            return this;
        }

        public a k(List list) {
            this.f7628j = list;
            return this;
        }

        public a l(c2.c cVar) {
            this.f7627i = cVar;
            return this;
        }

        public a m(c2.c cVar) {
            this.f7626h = cVar;
            return this;
        }

        public a n(URI uri) {
            this.f7625g = uri;
            return this;
        }

        public a(q qVar) {
            this(qVar.t());
            this.f7620b = qVar.f();
            this.f7621c = qVar.b();
            this.f7622d = qVar.c();
            this.f7623e = qVar.k();
            this.f7624f = qVar.j();
            this.f7625g = qVar.r();
            this.f7626h = qVar.q();
            this.f7627i = qVar.o();
            this.f7628j = qVar.n();
            this.f7629k = qVar.m();
            this.f7630l = qVar.v();
            this.f7631m = qVar.e();
        }
    }
}
