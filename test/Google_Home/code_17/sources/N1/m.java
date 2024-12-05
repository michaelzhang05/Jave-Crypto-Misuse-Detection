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
public final class m extends b {

    /* renamed from: y, reason: collision with root package name */
    private static final Set f7559y;

    /* renamed from: o, reason: collision with root package name */
    private final d f7560o;

    /* renamed from: p, reason: collision with root package name */
    private final U1.d f7561p;

    /* renamed from: q, reason: collision with root package name */
    private final c f7562q;

    /* renamed from: r, reason: collision with root package name */
    private final c2.c f7563r;

    /* renamed from: s, reason: collision with root package name */
    private final c2.c f7564s;

    /* renamed from: t, reason: collision with root package name */
    private final c2.c f7565t;

    /* renamed from: u, reason: collision with root package name */
    private final int f7566u;

    /* renamed from: v, reason: collision with root package name */
    private final c2.c f7567v;

    /* renamed from: w, reason: collision with root package name */
    private final c2.c f7568w;

    /* renamed from: x, reason: collision with root package name */
    private final String f7569x;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final i f7570a;

        /* renamed from: b, reason: collision with root package name */
        private final d f7571b;

        /* renamed from: c, reason: collision with root package name */
        private h f7572c;

        /* renamed from: d, reason: collision with root package name */
        private String f7573d;

        /* renamed from: e, reason: collision with root package name */
        private Set f7574e;

        /* renamed from: f, reason: collision with root package name */
        private URI f7575f;

        /* renamed from: g, reason: collision with root package name */
        private U1.d f7576g;

        /* renamed from: h, reason: collision with root package name */
        private URI f7577h;

        /* renamed from: i, reason: collision with root package name */
        private c2.c f7578i;

        /* renamed from: j, reason: collision with root package name */
        private c2.c f7579j;

        /* renamed from: k, reason: collision with root package name */
        private List f7580k;

        /* renamed from: l, reason: collision with root package name */
        private String f7581l;

        /* renamed from: m, reason: collision with root package name */
        private U1.d f7582m;

        /* renamed from: n, reason: collision with root package name */
        private c f7583n;

        /* renamed from: o, reason: collision with root package name */
        private c2.c f7584o;

        /* renamed from: p, reason: collision with root package name */
        private c2.c f7585p;

        /* renamed from: q, reason: collision with root package name */
        private c2.c f7586q;

        /* renamed from: r, reason: collision with root package name */
        private int f7587r;

        /* renamed from: s, reason: collision with root package name */
        private c2.c f7588s;

        /* renamed from: t, reason: collision with root package name */
        private c2.c f7589t;

        /* renamed from: u, reason: collision with root package name */
        private String f7590u;

        /* renamed from: v, reason: collision with root package name */
        private Map f7591v;

        /* renamed from: w, reason: collision with root package name */
        private c2.c f7592w;

        public a(i iVar, d dVar) {
            if (!iVar.a().equals(N1.a.f7496c.a())) {
                this.f7570a = iVar;
                if (dVar != null) {
                    this.f7571b = dVar;
                    return;
                }
                throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
            }
            throw new IllegalArgumentException("The JWE algorithm \"alg\" cannot be \"none\"");
        }

        public a a(c2.c cVar) {
            this.f7584o = cVar;
            return this;
        }

        public a b(c2.c cVar) {
            this.f7585p = cVar;
            return this;
        }

        public a c(c2.c cVar) {
            this.f7589t = cVar;
            return this;
        }

        public m d() {
            return new m(this.f7570a, this.f7571b, this.f7572c, this.f7573d, this.f7574e, this.f7575f, this.f7576g, this.f7577h, this.f7578i, this.f7579j, this.f7580k, this.f7581l, this.f7582m, this.f7583n, this.f7584o, this.f7585p, this.f7586q, this.f7587r, this.f7588s, this.f7589t, this.f7590u, this.f7591v, this.f7592w);
        }

        public a e(c cVar) {
            this.f7583n = cVar;
            return this;
        }

        public a f(String str) {
            this.f7573d = str;
            return this;
        }

        public a g(Set set) {
            this.f7574e = set;
            return this;
        }

        public a h(String str, Object obj) {
            if (!m.w().contains(str)) {
                if (this.f7591v == null) {
                    this.f7591v = new HashMap();
                }
                this.f7591v.put(str, obj);
                return this;
            }
            throw new IllegalArgumentException("The parameter name \"" + str + "\" matches a registered name");
        }

        public a i(U1.d dVar) {
            this.f7582m = dVar;
            return this;
        }

        public a j(c2.c cVar) {
            this.f7588s = cVar;
            return this;
        }

        public a k(U1.d dVar) {
            if (dVar != null && dVar.k()) {
                throw new IllegalArgumentException("The JWK must be public");
            }
            this.f7576g = dVar;
            return this;
        }

        public a l(URI uri) {
            this.f7575f = uri;
            return this;
        }

        public a m(String str) {
            this.f7581l = str;
            return this;
        }

        public a n(c2.c cVar) {
            this.f7592w = cVar;
            return this;
        }

        public a o(int i8) {
            if (i8 >= 0) {
                this.f7587r = i8;
                return this;
            }
            throw new IllegalArgumentException("The PBES2 count parameter must not be negative");
        }

        public a p(c2.c cVar) {
            this.f7586q = cVar;
            return this;
        }

        public a q(String str) {
            this.f7590u = str;
            return this;
        }

        public a r(h hVar) {
            this.f7572c = hVar;
            return this;
        }

        public a s(List list) {
            this.f7580k = list;
            return this;
        }

        public a t(c2.c cVar) {
            this.f7579j = cVar;
            return this;
        }

        public a u(c2.c cVar) {
            this.f7578i = cVar;
            return this;
        }

        public a v(URI uri) {
            this.f7577h = uri;
            return this;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("enc");
        hashSet.add("epk");
        hashSet.add("zip");
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
        hashSet.add("apu");
        hashSet.add("apv");
        hashSet.add("p2s");
        hashSet.add("p2c");
        hashSet.add("iv");
        hashSet.add("tag");
        hashSet.add("skid");
        hashSet.add("authTag");
        f7559y = DesugarCollections.unmodifiableSet(hashSet);
    }

    public m(N1.a aVar, d dVar, h hVar, String str, Set set, URI uri, U1.d dVar2, URI uri2, c2.c cVar, c2.c cVar2, List list, String str2, U1.d dVar3, c cVar3, c2.c cVar4, c2.c cVar5, c2.c cVar6, int i8, c2.c cVar7, c2.c cVar8, String str3, Map map, c2.c cVar9) {
        super(aVar, hVar, str, set, uri, dVar2, uri2, cVar, cVar2, list, str2, map, cVar9);
        if (aVar.a().equals(N1.a.f7496c.a())) {
            throw new IllegalArgumentException("The JWE algorithm cannot be \"none\"");
        }
        if (dVar != null) {
            if (dVar3 != null && dVar3.k()) {
                throw new IllegalArgumentException("Ephemeral public key should not be a private key");
            }
            this.f7560o = dVar;
            this.f7561p = dVar3;
            this.f7562q = cVar3;
            this.f7563r = cVar4;
            this.f7564s = cVar5;
            this.f7565t = cVar6;
            this.f7566u = i8;
            this.f7567v = cVar7;
            this.f7568w = cVar8;
            this.f7569x = str3;
            return;
        }
        throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
    }

    private static d A(Map map) {
        return d.d(c2.k.h(map, "enc"));
    }

    public static Set w() {
        return f7559y;
    }

    public static m x(c2.c cVar) {
        return y(cVar.c(), cVar);
    }

    public static m y(String str, c2.c cVar) {
        return z(c2.k.n(str, 20000), cVar);
    }

    public static m z(Map map, c2.c cVar) {
        N1.a g8 = e.g(map);
        if (g8 instanceof i) {
            a n8 = new a((i) g8, A(map)).n(cVar);
            for (String str : map.keySet()) {
                if (!"alg".equals(str) && !"enc".equals(str)) {
                    if ("typ".equals(str)) {
                        String h8 = c2.k.h(map, str);
                        if (h8 != null) {
                            n8 = n8.r(new h(h8));
                        }
                    } else if ("cty".equals(str)) {
                        n8 = n8.f(c2.k.h(map, str));
                    } else if ("crit".equals(str)) {
                        List j8 = c2.k.j(map, str);
                        if (j8 != null) {
                            n8 = n8.g(new HashSet(j8));
                        }
                    } else if ("jku".equals(str)) {
                        n8 = n8.l(c2.k.k(map, str));
                    } else if ("jwk".equals(str)) {
                        n8 = n8.k(b.s(c2.k.f(map, str)));
                    } else if ("x5u".equals(str)) {
                        n8 = n8.v(c2.k.k(map, str));
                    } else if ("x5t".equals(str)) {
                        n8 = n8.u(c2.c.f(c2.k.h(map, str)));
                    } else if ("x5t#S256".equals(str)) {
                        n8 = n8.t(c2.c.f(c2.k.h(map, str)));
                    } else if ("x5c".equals(str)) {
                        n8 = n8.s(c2.n.b(c2.k.e(map, str)));
                    } else if ("kid".equals(str)) {
                        n8 = n8.m(c2.k.h(map, str));
                    } else if ("epk".equals(str)) {
                        n8 = n8.i(U1.d.m(c2.k.f(map, str)));
                    } else if ("zip".equals(str)) {
                        String h9 = c2.k.h(map, str);
                        if (h9 != null) {
                            n8 = n8.e(new c(h9));
                        }
                    } else if ("apu".equals(str)) {
                        n8 = n8.a(c2.c.f(c2.k.h(map, str)));
                    } else if ("apv".equals(str)) {
                        n8 = n8.b(c2.c.f(c2.k.h(map, str)));
                    } else if ("p2s".equals(str)) {
                        n8 = n8.p(c2.c.f(c2.k.h(map, str)));
                    } else if ("p2c".equals(str)) {
                        n8 = n8.o(c2.k.d(map, str));
                    } else if ("iv".equals(str)) {
                        n8 = n8.j(c2.c.f(c2.k.h(map, str)));
                    } else if ("tag".equals(str)) {
                        n8 = n8.c(c2.c.f(c2.k.h(map, str)));
                    } else if ("skid".equals(str)) {
                        n8 = n8.q(c2.k.h(map, str));
                    } else {
                        n8 = n8.h(str, map.get(str));
                    }
                }
            }
            return n8.d();
        }
        throw new ParseException("The algorithm \"alg\" header parameter must be for encryption", 0);
    }

    @Override // N1.b, N1.e
    public Map i() {
        Map i8 = super.i();
        d dVar = this.f7560o;
        if (dVar != null) {
            i8.put("enc", dVar.toString());
        }
        U1.d dVar2 = this.f7561p;
        if (dVar2 != null) {
            i8.put("epk", dVar2.n());
        }
        c cVar = this.f7562q;
        if (cVar != null) {
            i8.put("zip", cVar.toString());
        }
        c2.c cVar2 = this.f7563r;
        if (cVar2 != null) {
            i8.put("apu", cVar2.toString());
        }
        c2.c cVar3 = this.f7564s;
        if (cVar3 != null) {
            i8.put("apv", cVar3.toString());
        }
        c2.c cVar4 = this.f7565t;
        if (cVar4 != null) {
            i8.put("p2s", cVar4.toString());
        }
        int i9 = this.f7566u;
        if (i9 > 0) {
            i8.put("p2c", Integer.valueOf(i9));
        }
        c2.c cVar5 = this.f7567v;
        if (cVar5 != null) {
            i8.put("iv", cVar5.toString());
        }
        c2.c cVar6 = this.f7568w;
        if (cVar6 != null) {
            i8.put("tag", cVar6.toString());
        }
        String str = this.f7569x;
        if (str != null) {
            i8.put("skid", str);
        }
        return i8;
    }

    public i t() {
        return (i) super.a();
    }

    public c u() {
        return this.f7562q;
    }

    public d v() {
        return this.f7560o;
    }
}
