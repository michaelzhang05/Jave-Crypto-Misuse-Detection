package K1;

/* loaded from: classes4.dex */
public final class p extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final p f5824d = new p("HS256", x.REQUIRED);

    /* renamed from: e, reason: collision with root package name */
    public static final p f5825e;

    /* renamed from: f, reason: collision with root package name */
    public static final p f5826f;

    /* renamed from: g, reason: collision with root package name */
    public static final p f5827g;

    /* renamed from: h, reason: collision with root package name */
    public static final p f5828h;

    /* renamed from: i, reason: collision with root package name */
    public static final p f5829i;

    /* renamed from: j, reason: collision with root package name */
    public static final p f5830j;

    /* renamed from: k, reason: collision with root package name */
    public static final p f5831k;

    /* renamed from: l, reason: collision with root package name */
    public static final p f5832l;

    /* renamed from: m, reason: collision with root package name */
    public static final p f5833m;

    /* renamed from: n, reason: collision with root package name */
    public static final p f5834n;

    /* renamed from: o, reason: collision with root package name */
    public static final p f5835o;

    /* renamed from: p, reason: collision with root package name */
    public static final p f5836p;

    /* renamed from: q, reason: collision with root package name */
    public static final p f5837q;

    static {
        x xVar = x.OPTIONAL;
        f5825e = new p("HS384", xVar);
        f5826f = new p("HS512", xVar);
        x xVar2 = x.RECOMMENDED;
        f5827g = new p("RS256", xVar2);
        f5828h = new p("RS384", xVar);
        f5829i = new p("RS512", xVar);
        f5830j = new p("ES256", xVar2);
        f5831k = new p("ES256K", xVar);
        f5832l = new p("ES384", xVar);
        f5833m = new p("ES512", xVar);
        f5834n = new p("PS256", xVar);
        f5835o = new p("PS384", xVar);
        f5836p = new p("PS512", xVar);
        f5837q = new p("EdDSA", xVar);
    }

    public p(String str, x xVar) {
        super(str, xVar);
    }

    public static p c(String str) {
        p pVar = f5824d;
        if (str.equals(pVar.a())) {
            return pVar;
        }
        p pVar2 = f5825e;
        if (str.equals(pVar2.a())) {
            return pVar2;
        }
        p pVar3 = f5826f;
        if (str.equals(pVar3.a())) {
            return pVar3;
        }
        p pVar4 = f5827g;
        if (str.equals(pVar4.a())) {
            return pVar4;
        }
        p pVar5 = f5828h;
        if (str.equals(pVar5.a())) {
            return pVar5;
        }
        p pVar6 = f5829i;
        if (str.equals(pVar6.a())) {
            return pVar6;
        }
        p pVar7 = f5830j;
        if (str.equals(pVar7.a())) {
            return pVar7;
        }
        p pVar8 = f5831k;
        if (str.equals(pVar8.a())) {
            return pVar8;
        }
        p pVar9 = f5832l;
        if (str.equals(pVar9.a())) {
            return pVar9;
        }
        p pVar10 = f5833m;
        if (str.equals(pVar10.a())) {
            return pVar10;
        }
        p pVar11 = f5834n;
        if (str.equals(pVar11.a())) {
            return pVar11;
        }
        p pVar12 = f5835o;
        if (str.equals(pVar12.a())) {
            return pVar12;
        }
        p pVar13 = f5836p;
        if (str.equals(pVar13.a())) {
            return pVar13;
        }
        p pVar14 = f5837q;
        if (str.equals(pVar14.a())) {
            return pVar14;
        }
        return new p(str);
    }

    public p(String str) {
        super(str, null);
    }
}
