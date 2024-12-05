package N1;

/* loaded from: classes4.dex */
public final class p extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final p f7603d = new p("HS256", x.REQUIRED);

    /* renamed from: e, reason: collision with root package name */
    public static final p f7604e;

    /* renamed from: f, reason: collision with root package name */
    public static final p f7605f;

    /* renamed from: g, reason: collision with root package name */
    public static final p f7606g;

    /* renamed from: h, reason: collision with root package name */
    public static final p f7607h;

    /* renamed from: i, reason: collision with root package name */
    public static final p f7608i;

    /* renamed from: j, reason: collision with root package name */
    public static final p f7609j;

    /* renamed from: k, reason: collision with root package name */
    public static final p f7610k;

    /* renamed from: l, reason: collision with root package name */
    public static final p f7611l;

    /* renamed from: m, reason: collision with root package name */
    public static final p f7612m;

    /* renamed from: n, reason: collision with root package name */
    public static final p f7613n;

    /* renamed from: o, reason: collision with root package name */
    public static final p f7614o;

    /* renamed from: p, reason: collision with root package name */
    public static final p f7615p;

    /* renamed from: q, reason: collision with root package name */
    public static final p f7616q;

    static {
        x xVar = x.OPTIONAL;
        f7604e = new p("HS384", xVar);
        f7605f = new p("HS512", xVar);
        x xVar2 = x.RECOMMENDED;
        f7606g = new p("RS256", xVar2);
        f7607h = new p("RS384", xVar);
        f7608i = new p("RS512", xVar);
        f7609j = new p("ES256", xVar2);
        f7610k = new p("ES256K", xVar);
        f7611l = new p("ES384", xVar);
        f7612m = new p("ES512", xVar);
        f7613n = new p("PS256", xVar);
        f7614o = new p("PS384", xVar);
        f7615p = new p("PS512", xVar);
        f7616q = new p("EdDSA", xVar);
    }

    public p(String str, x xVar) {
        super(str, xVar);
    }

    public static p c(String str) {
        p pVar = f7603d;
        if (str.equals(pVar.a())) {
            return pVar;
        }
        p pVar2 = f7604e;
        if (str.equals(pVar2.a())) {
            return pVar2;
        }
        p pVar3 = f7605f;
        if (str.equals(pVar3.a())) {
            return pVar3;
        }
        p pVar4 = f7606g;
        if (str.equals(pVar4.a())) {
            return pVar4;
        }
        p pVar5 = f7607h;
        if (str.equals(pVar5.a())) {
            return pVar5;
        }
        p pVar6 = f7608i;
        if (str.equals(pVar6.a())) {
            return pVar6;
        }
        p pVar7 = f7609j;
        if (str.equals(pVar7.a())) {
            return pVar7;
        }
        p pVar8 = f7610k;
        if (str.equals(pVar8.a())) {
            return pVar8;
        }
        p pVar9 = f7611l;
        if (str.equals(pVar9.a())) {
            return pVar9;
        }
        p pVar10 = f7612m;
        if (str.equals(pVar10.a())) {
            return pVar10;
        }
        p pVar11 = f7613n;
        if (str.equals(pVar11.a())) {
            return pVar11;
        }
        p pVar12 = f7614o;
        if (str.equals(pVar12.a())) {
            return pVar12;
        }
        p pVar13 = f7615p;
        if (str.equals(pVar13.a())) {
            return pVar13;
        }
        p pVar14 = f7616q;
        if (str.equals(pVar14.a())) {
            return pVar14;
        }
        return new p(str);
    }

    public p(String str) {
        super(str, null);
    }
}
