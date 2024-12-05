package b2;

import b2.C1963c;

/* loaded from: classes4.dex */
public class h extends g {

    /* renamed from: A, reason: collision with root package name */
    private int f15115A;

    /* renamed from: B, reason: collision with root package name */
    private C1964d f15116B;

    /* renamed from: C, reason: collision with root package name */
    private int f15117C;

    /* renamed from: D, reason: collision with root package name */
    private C1964d f15118D;

    /* renamed from: E, reason: collision with root package name */
    private C1957A f15119E;

    /* renamed from: F, reason: collision with root package name */
    private C1957A f15120F;

    /* renamed from: G, reason: collision with root package name */
    private C1963c f15121G;

    /* renamed from: H, reason: collision with root package name */
    private int f15122H;

    /* renamed from: c, reason: collision with root package name */
    private int f15123c;

    /* renamed from: d, reason: collision with root package name */
    private final C1959C f15124d;

    /* renamed from: e, reason: collision with root package name */
    private int f15125e;

    /* renamed from: f, reason: collision with root package name */
    private int f15126f;

    /* renamed from: g, reason: collision with root package name */
    private int f15127g;

    /* renamed from: h, reason: collision with root package name */
    private int f15128h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f15129i;

    /* renamed from: j, reason: collision with root package name */
    private o f15130j;

    /* renamed from: k, reason: collision with root package name */
    private o f15131k;

    /* renamed from: l, reason: collision with root package name */
    private v f15132l;

    /* renamed from: m, reason: collision with root package name */
    private v f15133m;

    /* renamed from: n, reason: collision with root package name */
    private int f15134n;

    /* renamed from: o, reason: collision with root package name */
    private C1964d f15135o;

    /* renamed from: p, reason: collision with root package name */
    private int f15136p;

    /* renamed from: q, reason: collision with root package name */
    private int f15137q;

    /* renamed from: r, reason: collision with root package name */
    private int f15138r;

    /* renamed from: s, reason: collision with root package name */
    private int f15139s;

    /* renamed from: t, reason: collision with root package name */
    private C1964d f15140t;

    /* renamed from: u, reason: collision with root package name */
    private C1962b f15141u;

    /* renamed from: v, reason: collision with root package name */
    private C1962b f15142v;

    /* renamed from: w, reason: collision with root package name */
    private C1962b f15143w;

    /* renamed from: x, reason: collision with root package name */
    private C1962b f15144x;

    /* renamed from: y, reason: collision with root package name */
    private x f15145y;

    /* renamed from: z, reason: collision with root package name */
    private int f15146z;

    public h(int i8) {
        this(null, i8);
    }

    private C1963c[] p() {
        C1963c.a aVar = new C1963c.a();
        aVar.b(this.f15121G);
        for (o oVar = this.f15130j; oVar != null; oVar = (o) oVar.f15174b) {
            oVar.e(aVar);
        }
        for (v vVar = this.f15132l; vVar != null; vVar = (v) vVar.f15225b) {
            vVar.H(aVar);
        }
        for (C1957A c1957a = this.f15119E; c1957a != null; c1957a = (C1957A) c1957a.f15306b) {
            c1957a.e(aVar);
        }
        return aVar.d();
    }

    private byte[] s(byte[] bArr, boolean z8) {
        int i8;
        C1963c[] p8 = p();
        this.f15130j = null;
        this.f15131k = null;
        this.f15132l = null;
        this.f15133m = null;
        this.f15141u = null;
        this.f15142v = null;
        this.f15143w = null;
        this.f15144x = null;
        this.f15145y = null;
        int i9 = 0;
        this.f15146z = 0;
        this.f15115A = 0;
        this.f15116B = null;
        this.f15117C = 0;
        this.f15118D = null;
        this.f15119E = null;
        this.f15120F = null;
        this.f15121G = null;
        if (z8) {
            i8 = 3;
        } else {
            i8 = 0;
        }
        this.f15122H = i8;
        C1965e c1965e = new C1965e(bArr, 0, false);
        if (z8) {
            i9 = 8;
        }
        c1965e.a(this, p8, i9 | 256);
        return t();
    }

    @Override // b2.g
    public final void a(int i8, int i9, String str, String str2, String str3, String[] strArr) {
        int i10;
        this.f15123c = i8;
        this.f15125e = i9;
        int i11 = i8 & 65535;
        this.f15126f = this.f15124d.f0(i11, str);
        if (str2 != null) {
            this.f15138r = this.f15124d.D(str2);
        }
        if (str3 == null) {
            i10 = 0;
        } else {
            i10 = this.f15124d.e(str3).f15051a;
        }
        this.f15127g = i10;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.f15128h = length;
            this.f15129i = new int[length];
            for (int i12 = 0; i12 < this.f15128h; i12++) {
                this.f15129i[i12] = this.f15124d.e(strArr[i12]).f15051a;
            }
        }
        if (this.f15122H == 1 && i11 >= 51) {
            this.f15122H = 2;
        }
    }

    @Override // b2.g
    public final AbstractC1961a b(String str, boolean z8) {
        if (z8) {
            C1962b j8 = C1962b.j(this.f15124d, str, this.f15141u);
            this.f15141u = j8;
            return j8;
        }
        C1962b j9 = C1962b.j(this.f15124d, str, this.f15142v);
        this.f15142v = j9;
        return j9;
    }

    @Override // b2.g
    public final void c(C1963c c1963c) {
        c1963c.f15098c = this.f15121G;
        this.f15121G = c1963c;
    }

    @Override // b2.g
    public final n e(int i8, String str, String str2, String str3, Object obj) {
        o oVar = new o(this.f15124d, i8, str, str2, str3, obj);
        if (this.f15130j == null) {
            this.f15130j = oVar;
        } else {
            this.f15131k.f15174b = oVar;
        }
        this.f15131k = oVar;
        return oVar;
    }

    @Override // b2.g
    public final void f(String str, String str2, String str3, int i8) {
        int i9;
        if (this.f15135o == null) {
            this.f15135o = new C1964d();
        }
        AbstractC1958B e8 = this.f15124d.e(str);
        if (e8.f15057g == 0) {
            this.f15134n++;
            this.f15135o.k(e8.f15051a);
            C1964d c1964d = this.f15135o;
            int i10 = 0;
            if (str2 == null) {
                i9 = 0;
            } else {
                i9 = this.f15124d.e(str2).f15051a;
            }
            c1964d.k(i9);
            C1964d c1964d2 = this.f15135o;
            if (str3 != null) {
                i10 = this.f15124d.D(str3);
            }
            c1964d2.k(i10);
            this.f15135o.k(i8);
            e8.f15057g = this.f15134n;
        }
    }

    @Override // b2.g
    public final u g(int i8, String str, String str2, String str3, String[] strArr) {
        v vVar = new v(this.f15124d, i8, str, str2, str3, strArr, this.f15122H);
        if (this.f15132l == null) {
            this.f15132l = vVar;
        } else {
            this.f15133m.f15225b = vVar;
        }
        this.f15133m = vVar;
        return vVar;
    }

    @Override // b2.g
    public final w h(String str, int i8, String str2) {
        int D8;
        C1959C c1959c = this.f15124d;
        int i9 = c1959c.y(str).f15051a;
        if (str2 == null) {
            D8 = 0;
        } else {
            D8 = this.f15124d.D(str2);
        }
        x xVar = new x(c1959c, i9, i8, D8);
        this.f15145y = xVar;
        return xVar;
    }

    @Override // b2.g
    public final void i(String str) {
        this.f15146z = this.f15124d.e(str).f15051a;
    }

    @Override // b2.g
    public final void j(String str) {
        if (this.f15116B == null) {
            this.f15116B = new C1964d();
        }
        this.f15115A++;
        this.f15116B.k(this.f15124d.e(str).f15051a);
    }

    @Override // b2.g
    public final void k(String str, String str2, String str3) {
        this.f15136p = this.f15124d.e(str).f15051a;
        if (str2 != null && str3 != null) {
            this.f15137q = this.f15124d.z(str2, str3);
        }
    }

    @Override // b2.g
    public final void l(String str) {
        if (this.f15118D == null) {
            this.f15118D = new C1964d();
        }
        this.f15117C++;
        this.f15118D.k(this.f15124d.e(str).f15051a);
    }

    @Override // b2.g
    public final z m(String str, String str2, String str3) {
        C1957A c1957a = new C1957A(this.f15124d, str, str2, str3);
        if (this.f15119E == null) {
            this.f15119E = c1957a;
        } else {
            this.f15120F.f15306b = c1957a;
        }
        this.f15120F = c1957a;
        return c1957a;
    }

    @Override // b2.g
    public final void n(String str, String str2) {
        if (str != null) {
            this.f15139s = this.f15124d.D(str);
        }
        if (str2 != null) {
            this.f15140t = new C1964d().a(str2, 0, Integer.MAX_VALUE);
        }
    }

    @Override // b2.g
    public final AbstractC1961a o(int i8, E e8, String str, boolean z8) {
        if (z8) {
            C1962b i9 = C1962b.i(this.f15124d, i8, e8, str, this.f15143w);
            this.f15143w = i9;
            return i9;
        }
        C1962b i10 = C1962b.i(this.f15124d, i8, e8, str, this.f15144x);
        this.f15144x = i10;
        return i10;
    }

    protected ClassLoader q() {
        return getClass().getClassLoader();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String r(String str, String str2) {
        ClassLoader q8 = q();
        try {
            Class<?> cls = Class.forName(str.replace('/', '.'), false, q8);
            try {
                Class<?> cls2 = Class.forName(str2.replace('/', '.'), false, q8);
                if (cls.isAssignableFrom(cls2)) {
                    return str;
                }
                if (cls2.isAssignableFrom(cls)) {
                    return str2;
                }
                if (cls.isInterface() || cls2.isInterface()) {
                    return "java/lang/Object";
                }
                do {
                    cls = cls.getSuperclass();
                } while (!cls.isAssignableFrom(cls2));
                return cls.getName().replace('.', '/');
            } catch (ClassNotFoundException e8) {
                throw new TypeNotPresentException(str2, e8);
            }
        } catch (ClassNotFoundException e9) {
            throw new TypeNotPresentException(str, e9);
        }
    }

    public byte[] t() {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = (this.f15128h * 2) + 24;
        int i15 = 0;
        for (o oVar = this.f15130j; oVar != null; oVar = (o) oVar.f15174b) {
            i15++;
            i14 += oVar.f();
        }
        int i16 = 0;
        for (v vVar = this.f15132l; vVar != null; vVar = (v) vVar.f15225b) {
            i16++;
            i14 += vVar.K();
        }
        C1964d c1964d = this.f15135o;
        if (c1964d != null) {
            i14 += c1964d.f15102b + 8;
            this.f15124d.D("InnerClasses");
            i8 = 1;
        } else {
            i8 = 0;
        }
        if (this.f15136p != 0) {
            i8++;
            i14 += 10;
            this.f15124d.D("EnclosingMethod");
        }
        if ((this.f15125e & 4096) != 0 && (this.f15123c & 65535) < 49) {
            i8++;
            i14 += 6;
            this.f15124d.D("Synthetic");
        }
        if (this.f15138r != 0) {
            i8++;
            i14 += 8;
            this.f15124d.D("Signature");
        }
        if (this.f15139s != 0) {
            i8++;
            i14 += 8;
            this.f15124d.D("SourceFile");
        }
        C1964d c1964d2 = this.f15140t;
        if (c1964d2 != null) {
            i8++;
            i14 += c1964d2.f15102b + 6;
            this.f15124d.D("SourceDebugExtension");
        }
        if ((this.f15125e & 131072) != 0) {
            i8++;
            i14 += 6;
            this.f15124d.D("Deprecated");
        }
        C1962b c1962b = this.f15141u;
        if (c1962b != null) {
            i8++;
            i14 += c1962b.g("RuntimeVisibleAnnotations");
        }
        C1962b c1962b2 = this.f15142v;
        if (c1962b2 != null) {
            i8++;
            i14 += c1962b2.g("RuntimeInvisibleAnnotations");
        }
        C1962b c1962b3 = this.f15143w;
        if (c1962b3 != null) {
            i8++;
            i14 += c1962b3.g("RuntimeVisibleTypeAnnotations");
        }
        C1962b c1962b4 = this.f15144x;
        if (c1962b4 != null) {
            i8++;
            i14 += c1962b4.g("RuntimeInvisibleTypeAnnotations");
        }
        if (this.f15124d.L() > 0) {
            i8++;
            i14 += this.f15124d.L();
        }
        x xVar = this.f15145y;
        if (xVar != null) {
            i8 += xVar.j();
            i14 += this.f15145y.i();
        }
        if (this.f15146z != 0) {
            i8++;
            i14 += 8;
            this.f15124d.D("NestHost");
        }
        C1964d c1964d3 = this.f15116B;
        if (c1964d3 != null) {
            i8++;
            i14 += c1964d3.f15102b + 8;
            this.f15124d.D("NestMembers");
        }
        C1964d c1964d4 = this.f15118D;
        if (c1964d4 != null) {
            i8++;
            i14 += c1964d4.f15102b + 8;
            this.f15124d.D("PermittedSubclasses");
        }
        if ((this.f15125e & 65536) == 0 && this.f15119E == null) {
            i9 = 0;
            i10 = 0;
        } else {
            i9 = 0;
            i10 = 0;
            for (C1957A c1957a = this.f15119E; c1957a != null; c1957a = (C1957A) c1957a.f15306b) {
                i10++;
                i9 += c1957a.f();
            }
            i8++;
            i14 += i9 + 8;
            this.f15124d.D("Record");
        }
        C1963c c1963c = this.f15121G;
        if (c1963c != null) {
            int d8 = i8 + c1963c.d();
            i14 += this.f15121G.a(this.f15124d);
            i8 = d8;
        }
        int Q8 = i14 + this.f15124d.Q();
        int P8 = this.f15124d.P();
        if (P8 <= 65535) {
            C1964d c1964d5 = new C1964d(Q8);
            c1964d5.i(-889275714).i(this.f15123c);
            this.f15124d.e0(c1964d5);
            if ((this.f15123c & 65535) < 49) {
                i11 = 4096;
            } else {
                i11 = 0;
            }
            c1964d5.k((~i11) & this.f15125e).k(this.f15126f).k(this.f15127g);
            c1964d5.k(this.f15128h);
            for (int i17 = 0; i17 < this.f15128h; i17++) {
                c1964d5.k(this.f15129i[i17]);
            }
            c1964d5.k(i15);
            for (o oVar2 = this.f15130j; oVar2 != null; oVar2 = (o) oVar2.f15174b) {
                oVar2.g(c1964d5);
            }
            c1964d5.k(i16);
            boolean z8 = false;
            boolean z9 = false;
            for (v vVar2 = this.f15132l; vVar2 != null; vVar2 = (v) vVar2.f15225b) {
                z8 |= vVar2.N();
                z9 |= vVar2.M();
                vVar2.R(c1964d5);
            }
            c1964d5.k(i8);
            if (this.f15135o != null) {
                C1964d k8 = c1964d5.k(this.f15124d.D("InnerClasses")).i(this.f15135o.f15102b + 2).k(this.f15134n);
                C1964d c1964d6 = this.f15135o;
                k8.h(c1964d6.f15101a, 0, c1964d6.f15102b);
            }
            if (this.f15136p != 0) {
                c1964d5.k(this.f15124d.D("EnclosingMethod")).i(4).k(this.f15136p).k(this.f15137q);
            }
            if ((this.f15125e & 4096) != 0 && (this.f15123c & 65535) < 49) {
                c1964d5.k(this.f15124d.D("Synthetic")).i(0);
            }
            if (this.f15138r != 0) {
                i12 = 2;
                c1964d5.k(this.f15124d.D("Signature")).i(2).k(this.f15138r);
            } else {
                i12 = 2;
            }
            if (this.f15139s != 0) {
                c1964d5.k(this.f15124d.D("SourceFile")).i(i12).k(this.f15139s);
            }
            C1964d c1964d7 = this.f15140t;
            if (c1964d7 != null) {
                int i18 = c1964d7.f15102b;
                i13 = 0;
                c1964d5.k(this.f15124d.D("SourceDebugExtension")).i(i18).h(this.f15140t.f15101a, 0, i18);
            } else {
                i13 = 0;
            }
            if ((this.f15125e & 131072) != 0) {
                c1964d5.k(this.f15124d.D("Deprecated")).i(i13);
            }
            C1962b.l(this.f15124d, this.f15141u, this.f15142v, this.f15143w, this.f15144x, c1964d5);
            this.f15124d.d0(c1964d5);
            x xVar2 = this.f15145y;
            if (xVar2 != null) {
                xVar2.k(c1964d5);
            }
            if (this.f15146z != 0) {
                c1964d5.k(this.f15124d.D("NestHost")).i(2).k(this.f15146z);
            }
            if (this.f15116B != null) {
                C1964d k9 = c1964d5.k(this.f15124d.D("NestMembers")).i(this.f15116B.f15102b + 2).k(this.f15115A);
                C1964d c1964d8 = this.f15116B;
                k9.h(c1964d8.f15101a, 0, c1964d8.f15102b);
            }
            if (this.f15118D != null) {
                C1964d k10 = c1964d5.k(this.f15124d.D("PermittedSubclasses")).i(this.f15118D.f15102b + 2).k(this.f15117C);
                C1964d c1964d9 = this.f15118D;
                k10.h(c1964d9.f15101a, 0, c1964d9.f15102b);
            }
            if ((this.f15125e & 65536) != 0 || this.f15119E != null) {
                c1964d5.k(this.f15124d.D("Record")).i(i9 + 2).k(i10);
                for (C1957A c1957a2 = this.f15119E; c1957a2 != null; c1957a2 = (C1957A) c1957a2.f15306b) {
                    c1957a2.g(c1964d5);
                }
            }
            C1963c c1963c2 = this.f15121G;
            if (c1963c2 != null) {
                c1963c2.g(this.f15124d, c1964d5);
            }
            if (z9) {
                return s(c1964d5.f15101a, z8);
            }
            return c1964d5.f15101a;
        }
        throw new C1966f(this.f15124d.O(), P8);
    }

    public h(C1965e c1965e, int i8) {
        super(589824);
        this.f15124d = c1965e == null ? new C1959C(this) : new C1959C(this, c1965e);
        if ((i8 & 2) != 0) {
            this.f15122H = 4;
        } else if ((i8 & 1) != 0) {
            this.f15122H = 1;
        } else {
            this.f15122H = 0;
        }
    }

    @Override // b2.g
    public final void d() {
    }
}
