package K1;

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
    private static final Set f5780y;

    /* renamed from: o, reason: collision with root package name */
    private final d f5781o;

    /* renamed from: p, reason: collision with root package name */
    private final R1.d f5782p;

    /* renamed from: q, reason: collision with root package name */
    private final c f5783q;

    /* renamed from: r, reason: collision with root package name */
    private final Z1.c f5784r;

    /* renamed from: s, reason: collision with root package name */
    private final Z1.c f5785s;

    /* renamed from: t, reason: collision with root package name */
    private final Z1.c f5786t;

    /* renamed from: u, reason: collision with root package name */
    private final int f5787u;

    /* renamed from: v, reason: collision with root package name */
    private final Z1.c f5788v;

    /* renamed from: w, reason: collision with root package name */
    private final Z1.c f5789w;

    /* renamed from: x, reason: collision with root package name */
    private final String f5790x;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final i f5791a;

        /* renamed from: b, reason: collision with root package name */
        private final d f5792b;

        /* renamed from: c, reason: collision with root package name */
        private h f5793c;

        /* renamed from: d, reason: collision with root package name */
        private String f5794d;

        /* renamed from: e, reason: collision with root package name */
        private Set f5795e;

        /* renamed from: f, reason: collision with root package name */
        private URI f5796f;

        /* renamed from: g, reason: collision with root package name */
        private R1.d f5797g;

        /* renamed from: h, reason: collision with root package name */
        private URI f5798h;

        /* renamed from: i, reason: collision with root package name */
        private Z1.c f5799i;

        /* renamed from: j, reason: collision with root package name */
        private Z1.c f5800j;

        /* renamed from: k, reason: collision with root package name */
        private List f5801k;

        /* renamed from: l, reason: collision with root package name */
        private String f5802l;

        /* renamed from: m, reason: collision with root package name */
        private R1.d f5803m;

        /* renamed from: n, reason: collision with root package name */
        private c f5804n;

        /* renamed from: o, reason: collision with root package name */
        private Z1.c f5805o;

        /* renamed from: p, reason: collision with root package name */
        private Z1.c f5806p;

        /* renamed from: q, reason: collision with root package name */
        private Z1.c f5807q;

        /* renamed from: r, reason: collision with root package name */
        private int f5808r;

        /* renamed from: s, reason: collision with root package name */
        private Z1.c f5809s;

        /* renamed from: t, reason: collision with root package name */
        private Z1.c f5810t;

        /* renamed from: u, reason: collision with root package name */
        private String f5811u;

        /* renamed from: v, reason: collision with root package name */
        private Map f5812v;

        /* renamed from: w, reason: collision with root package name */
        private Z1.c f5813w;

        public a(i iVar, d dVar) {
            if (!iVar.a().equals(K1.a.f5717c.a())) {
                this.f5791a = iVar;
                if (dVar != null) {
                    this.f5792b = dVar;
                    return;
                }
                throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
            }
            throw new IllegalArgumentException("The JWE algorithm \"alg\" cannot be \"none\"");
        }

        public a a(Z1.c cVar) {
            this.f5805o = cVar;
            return this;
        }

        public a b(Z1.c cVar) {
            this.f5806p = cVar;
            return this;
        }

        public a c(Z1.c cVar) {
            this.f5810t = cVar;
            return this;
        }

        public m d() {
            return new m(this.f5791a, this.f5792b, this.f5793c, this.f5794d, this.f5795e, this.f5796f, this.f5797g, this.f5798h, this.f5799i, this.f5800j, this.f5801k, this.f5802l, this.f5803m, this.f5804n, this.f5805o, this.f5806p, this.f5807q, this.f5808r, this.f5809s, this.f5810t, this.f5811u, this.f5812v, this.f5813w);
        }

        public a e(c cVar) {
            this.f5804n = cVar;
            return this;
        }

        public a f(String str) {
            this.f5794d = str;
            return this;
        }

        public a g(Set set) {
            this.f5795e = set;
            return this;
        }

        public a h(String str, Object obj) {
            if (!m.w().contains(str)) {
                if (this.f5812v == null) {
                    this.f5812v = new HashMap();
                }
                this.f5812v.put(str, obj);
                return this;
            }
            throw new IllegalArgumentException("The parameter name \"" + str + "\" matches a registered name");
        }

        public a i(R1.d dVar) {
            this.f5803m = dVar;
            return this;
        }

        public a j(Z1.c cVar) {
            this.f5809s = cVar;
            return this;
        }

        public a k(R1.d dVar) {
            if (dVar != null && dVar.l()) {
                throw new IllegalArgumentException("The JWK must be public");
            }
            this.f5797g = dVar;
            return this;
        }

        public a l(URI uri) {
            this.f5796f = uri;
            return this;
        }

        public a m(String str) {
            this.f5802l = str;
            return this;
        }

        public a n(Z1.c cVar) {
            this.f5813w = cVar;
            return this;
        }

        public a o(int i8) {
            if (i8 >= 0) {
                this.f5808r = i8;
                return this;
            }
            throw new IllegalArgumentException("The PBES2 count parameter must not be negative");
        }

        public a p(Z1.c cVar) {
            this.f5807q = cVar;
            return this;
        }

        public a q(String str) {
            this.f5811u = str;
            return this;
        }

        public a r(h hVar) {
            this.f5793c = hVar;
            return this;
        }

        public a s(List list) {
            this.f5801k = list;
            return this;
        }

        public a t(Z1.c cVar) {
            this.f5800j = cVar;
            return this;
        }

        public a u(Z1.c cVar) {
            this.f5799i = cVar;
            return this;
        }

        public a v(URI uri) {
            this.f5798h = uri;
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
        f5780y = DesugarCollections.unmodifiableSet(hashSet);
    }

    public m(K1.a aVar, d dVar, h hVar, String str, Set set, URI uri, R1.d dVar2, URI uri2, Z1.c cVar, Z1.c cVar2, List list, String str2, R1.d dVar3, c cVar3, Z1.c cVar4, Z1.c cVar5, Z1.c cVar6, int i8, Z1.c cVar7, Z1.c cVar8, String str3, Map map, Z1.c cVar9) {
        super(aVar, hVar, str, set, uri, dVar2, uri2, cVar, cVar2, list, str2, map, cVar9);
        if (aVar.a().equals(K1.a.f5717c.a())) {
            throw new IllegalArgumentException("The JWE algorithm cannot be \"none\"");
        }
        if (dVar != null) {
            if (dVar3 != null && dVar3.l()) {
                throw new IllegalArgumentException("Ephemeral public key should not be a private key");
            }
            this.f5781o = dVar;
            this.f5782p = dVar3;
            this.f5783q = cVar3;
            this.f5784r = cVar4;
            this.f5785s = cVar5;
            this.f5786t = cVar6;
            this.f5787u = i8;
            this.f5788v = cVar7;
            this.f5789w = cVar8;
            this.f5790x = str3;
            return;
        }
        throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
    }

    public static m A(Map map, Z1.c cVar) {
        K1.a g8 = e.g(map);
        if (g8 instanceof i) {
            a n8 = new a((i) g8, B(map)).n(cVar);
            for (String str : map.keySet()) {
                if (!"alg".equals(str) && !"enc".equals(str)) {
                    if ("typ".equals(str)) {
                        String h8 = Z1.k.h(map, str);
                        if (h8 != null) {
                            n8 = n8.r(new h(h8));
                        }
                    } else if ("cty".equals(str)) {
                        n8 = n8.f(Z1.k.h(map, str));
                    } else if ("crit".equals(str)) {
                        List j8 = Z1.k.j(map, str);
                        if (j8 != null) {
                            n8 = n8.g(new HashSet(j8));
                        }
                    } else if ("jku".equals(str)) {
                        n8 = n8.l(Z1.k.k(map, str));
                    } else if ("jwk".equals(str)) {
                        n8 = n8.k(b.r(Z1.k.f(map, str)));
                    } else if ("x5u".equals(str)) {
                        n8 = n8.v(Z1.k.k(map, str));
                    } else if ("x5t".equals(str)) {
                        n8 = n8.u(Z1.c.f(Z1.k.h(map, str)));
                    } else if ("x5t#S256".equals(str)) {
                        n8 = n8.t(Z1.c.f(Z1.k.h(map, str)));
                    } else if ("x5c".equals(str)) {
                        n8 = n8.s(Z1.n.b(Z1.k.e(map, str)));
                    } else if ("kid".equals(str)) {
                        n8 = n8.m(Z1.k.h(map, str));
                    } else if ("epk".equals(str)) {
                        n8 = n8.i(R1.d.m(Z1.k.f(map, str)));
                    } else if ("zip".equals(str)) {
                        String h9 = Z1.k.h(map, str);
                        if (h9 != null) {
                            n8 = n8.e(new c(h9));
                        }
                    } else if ("apu".equals(str)) {
                        n8 = n8.a(Z1.c.f(Z1.k.h(map, str)));
                    } else if ("apv".equals(str)) {
                        n8 = n8.b(Z1.c.f(Z1.k.h(map, str)));
                    } else if ("p2s".equals(str)) {
                        n8 = n8.p(Z1.c.f(Z1.k.h(map, str)));
                    } else if ("p2c".equals(str)) {
                        n8 = n8.o(Z1.k.d(map, str));
                    } else if ("iv".equals(str)) {
                        n8 = n8.j(Z1.c.f(Z1.k.h(map, str)));
                    } else if ("tag".equals(str)) {
                        n8 = n8.c(Z1.c.f(Z1.k.h(map, str)));
                    } else if ("skid".equals(str)) {
                        n8 = n8.q(Z1.k.h(map, str));
                    } else {
                        n8 = n8.h(str, map.get(str));
                    }
                }
            }
            return n8.d();
        }
        throw new ParseException("The algorithm \"alg\" header parameter must be for encryption", 0);
    }

    private static d B(Map map) {
        return d.d(Z1.k.h(map, "enc"));
    }

    public static Set w() {
        return f5780y;
    }

    public static m x(Z1.c cVar) {
        return y(cVar.c(), cVar);
    }

    public static m y(String str, Z1.c cVar) {
        return A(Z1.k.n(str, 20000), cVar);
    }

    @Override // K1.b, K1.e
    public Map j() {
        Map j8 = super.j();
        d dVar = this.f5781o;
        if (dVar != null) {
            j8.put("enc", dVar.toString());
        }
        R1.d dVar2 = this.f5782p;
        if (dVar2 != null) {
            j8.put("epk", dVar2.n());
        }
        c cVar = this.f5783q;
        if (cVar != null) {
            j8.put("zip", cVar.toString());
        }
        Z1.c cVar2 = this.f5784r;
        if (cVar2 != null) {
            j8.put("apu", cVar2.toString());
        }
        Z1.c cVar3 = this.f5785s;
        if (cVar3 != null) {
            j8.put("apv", cVar3.toString());
        }
        Z1.c cVar4 = this.f5786t;
        if (cVar4 != null) {
            j8.put("p2s", cVar4.toString());
        }
        int i8 = this.f5787u;
        if (i8 > 0) {
            j8.put("p2c", Integer.valueOf(i8));
        }
        Z1.c cVar5 = this.f5788v;
        if (cVar5 != null) {
            j8.put("iv", cVar5.toString());
        }
        Z1.c cVar6 = this.f5789w;
        if (cVar6 != null) {
            j8.put("tag", cVar6.toString());
        }
        String str = this.f5790x;
        if (str != null) {
            j8.put("skid", str);
        }
        return j8;
    }

    public i t() {
        return (i) super.a();
    }

    public c u() {
        return this.f5783q;
    }

    public d v() {
        return this.f5781o;
    }
}
