package o;

import java.util.Arrays;
import java.util.HashMap;
import o.i;
import p.d;

/* loaded from: classes.dex */
public class d {

    /* renamed from: q, reason: collision with root package name */
    private static int f8133q = 1000;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f8134r = true;

    /* renamed from: s, reason: collision with root package name */
    public static long f8135s;

    /* renamed from: t, reason: collision with root package name */
    public static long f8136t;

    /* renamed from: c, reason: collision with root package name */
    private a f8139c;

    /* renamed from: f, reason: collision with root package name */
    o.b[] f8142f;

    /* renamed from: m, reason: collision with root package name */
    final c f8149m;

    /* renamed from: p, reason: collision with root package name */
    private a f8152p;

    /* renamed from: a, reason: collision with root package name */
    int f8137a = 0;

    /* renamed from: b, reason: collision with root package name */
    private HashMap f8138b = null;

    /* renamed from: d, reason: collision with root package name */
    private int f8140d = 32;

    /* renamed from: e, reason: collision with root package name */
    private int f8141e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8143g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8144h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean[] f8145i = new boolean[32];

    /* renamed from: j, reason: collision with root package name */
    int f8146j = 1;

    /* renamed from: k, reason: collision with root package name */
    int f8147k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f8148l = 32;

    /* renamed from: n, reason: collision with root package name */
    private i[] f8150n = new i[f8133q];

    /* renamed from: o, reason: collision with root package name */
    private int f8151o = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        void a(i iVar);

        i b(d dVar, boolean[] zArr);

        void c(a aVar);

        void clear();

        i getKey();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends o.b {
        public b(c cVar) {
            this.f8127e = new j(this, cVar);
        }
    }

    public d() {
        this.f8142f = null;
        this.f8142f = new o.b[32];
        C();
        c cVar = new c();
        this.f8149m = cVar;
        this.f8139c = new h(cVar);
        this.f8152p = f8134r ? new b(cVar) : new o.b(cVar);
    }

    private final int B(a aVar, boolean z5) {
        for (int i6 = 0; i6 < this.f8146j; i6++) {
            this.f8145i[i6] = false;
        }
        boolean z6 = false;
        int i7 = 0;
        while (!z6) {
            i7++;
            if (i7 >= this.f8146j * 2) {
                return i7;
            }
            if (aVar.getKey() != null) {
                this.f8145i[aVar.getKey().f8169c] = true;
            }
            i b6 = aVar.b(this, this.f8145i);
            if (b6 != null) {
                boolean[] zArr = this.f8145i;
                int i8 = b6.f8169c;
                if (zArr[i8]) {
                    return i7;
                }
                zArr[i8] = true;
            }
            if (b6 != null) {
                float f6 = Float.MAX_VALUE;
                int i9 = -1;
                for (int i10 = 0; i10 < this.f8147k; i10++) {
                    o.b bVar = this.f8142f[i10];
                    if (bVar.f8123a.f8176j != i.a.UNRESTRICTED && !bVar.f8128f && bVar.t(b6)) {
                        float f7 = bVar.f8127e.f(b6);
                        if (f7 < 0.0f) {
                            float f8 = (-bVar.f8124b) / f7;
                            if (f8 < f6) {
                                i9 = i10;
                                f6 = f8;
                            }
                        }
                    }
                }
                if (i9 > -1) {
                    o.b bVar2 = this.f8142f[i9];
                    bVar2.f8123a.f8170d = -1;
                    bVar2.y(b6);
                    i iVar = bVar2.f8123a;
                    iVar.f8170d = i9;
                    iVar.g(bVar2);
                }
            } else {
                z6 = true;
            }
        }
        return i7;
    }

    private void C() {
        int i6 = 0;
        if (f8134r) {
            while (true) {
                o.b[] bVarArr = this.f8142f;
                if (i6 >= bVarArr.length) {
                    return;
                }
                o.b bVar = bVarArr[i6];
                if (bVar != null) {
                    this.f8149m.f8129a.a(bVar);
                }
                this.f8142f[i6] = null;
                i6++;
            }
        } else {
            while (true) {
                o.b[] bVarArr2 = this.f8142f;
                if (i6 >= bVarArr2.length) {
                    return;
                }
                o.b bVar2 = bVarArr2[i6];
                if (bVar2 != null) {
                    this.f8149m.f8130b.a(bVar2);
                }
                this.f8142f[i6] = null;
                i6++;
            }
        }
    }

    private i a(i.a aVar, String str) {
        i iVar = (i) this.f8149m.f8131c.b();
        if (iVar == null) {
            iVar = new i(aVar, str);
        } else {
            iVar.d();
        }
        iVar.f(aVar, str);
        int i6 = this.f8151o;
        int i7 = f8133q;
        if (i6 >= i7) {
            int i8 = i7 * 2;
            f8133q = i8;
            this.f8150n = (i[]) Arrays.copyOf(this.f8150n, i8);
        }
        i[] iVarArr = this.f8150n;
        int i9 = this.f8151o;
        this.f8151o = i9 + 1;
        iVarArr[i9] = iVar;
        return iVar;
    }

    private final void l(o.b bVar) {
        o.b bVar2;
        f fVar;
        if (f8134r) {
            bVar2 = this.f8142f[this.f8147k];
            if (bVar2 != null) {
                fVar = this.f8149m.f8129a;
                fVar.a(bVar2);
            }
        } else {
            bVar2 = this.f8142f[this.f8147k];
            if (bVar2 != null) {
                fVar = this.f8149m.f8130b;
                fVar.a(bVar2);
            }
        }
        o.b[] bVarArr = this.f8142f;
        int i6 = this.f8147k;
        bVarArr[i6] = bVar;
        i iVar = bVar.f8123a;
        iVar.f8170d = i6;
        this.f8147k = i6 + 1;
        iVar.g(bVar);
    }

    private void n() {
        for (int i6 = 0; i6 < this.f8147k; i6++) {
            o.b bVar = this.f8142f[i6];
            bVar.f8123a.f8172f = bVar.f8124b;
        }
    }

    public static o.b s(d dVar, i iVar, i iVar2, float f6) {
        return dVar.r().j(iVar, iVar2, f6);
    }

    private int u(a aVar) {
        float f6;
        boolean z5;
        int i6 = 0;
        while (true) {
            f6 = 0.0f;
            if (i6 >= this.f8147k) {
                z5 = false;
                break;
            }
            o.b bVar = this.f8142f[i6];
            if (bVar.f8123a.f8176j != i.a.UNRESTRICTED && bVar.f8124b < 0.0f) {
                z5 = true;
                break;
            }
            i6++;
        }
        if (!z5) {
            return 0;
        }
        boolean z6 = false;
        int i7 = 0;
        while (!z6) {
            i7++;
            float f7 = Float.MAX_VALUE;
            int i8 = 0;
            int i9 = -1;
            int i10 = -1;
            int i11 = 0;
            while (i8 < this.f8147k) {
                o.b bVar2 = this.f8142f[i8];
                if (bVar2.f8123a.f8176j != i.a.UNRESTRICTED && !bVar2.f8128f && bVar2.f8124b < f6) {
                    int i12 = 1;
                    while (i12 < this.f8146j) {
                        i iVar = this.f8149m.f8132d[i12];
                        float f8 = bVar2.f8127e.f(iVar);
                        if (f8 > f6) {
                            for (int i13 = 0; i13 < 9; i13++) {
                                float f9 = iVar.f8174h[i13] / f8;
                                if ((f9 < f7 && i13 == i11) || i13 > i11) {
                                    i11 = i13;
                                    f7 = f9;
                                    i9 = i8;
                                    i10 = i12;
                                }
                            }
                        }
                        i12++;
                        f6 = 0.0f;
                    }
                }
                i8++;
                f6 = 0.0f;
            }
            if (i9 != -1) {
                o.b bVar3 = this.f8142f[i9];
                bVar3.f8123a.f8170d = -1;
                bVar3.y(this.f8149m.f8132d[i10]);
                i iVar2 = bVar3.f8123a;
                iVar2.f8170d = i9;
                iVar2.g(bVar3);
            } else {
                z6 = true;
            }
            if (i7 > this.f8146j / 2) {
                z6 = true;
            }
            f6 = 0.0f;
        }
        return i7;
    }

    public static e w() {
        return null;
    }

    private void y() {
        int i6 = this.f8140d * 2;
        this.f8140d = i6;
        this.f8142f = (o.b[]) Arrays.copyOf(this.f8142f, i6);
        c cVar = this.f8149m;
        cVar.f8132d = (i[]) Arrays.copyOf(cVar.f8132d, this.f8140d);
        int i7 = this.f8140d;
        this.f8145i = new boolean[i7];
        this.f8141e = i7;
        this.f8148l = i7;
    }

    void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        c cVar;
        int i6 = 0;
        while (true) {
            cVar = this.f8149m;
            i[] iVarArr = cVar.f8132d;
            if (i6 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i6];
            if (iVar != null) {
                iVar.d();
            }
            i6++;
        }
        cVar.f8131c.c(this.f8150n, this.f8151o);
        this.f8151o = 0;
        Arrays.fill(this.f8149m.f8132d, (Object) null);
        HashMap hashMap = this.f8138b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f8137a = 0;
        this.f8139c.clear();
        this.f8146j = 1;
        for (int i7 = 0; i7 < this.f8147k; i7++) {
            this.f8142f[i7].f8125c = false;
        }
        C();
        this.f8147k = 0;
        this.f8152p = f8134r ? new b(this.f8149m) : new o.b(this.f8149m);
    }

    public void b(p.e eVar, p.e eVar2, float f6, int i6) {
        d.b bVar = d.b.LEFT;
        i q6 = q(eVar.m(bVar));
        d.b bVar2 = d.b.TOP;
        i q7 = q(eVar.m(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i q8 = q(eVar.m(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i q9 = q(eVar.m(bVar4));
        i q10 = q(eVar2.m(bVar));
        i q11 = q(eVar2.m(bVar2));
        i q12 = q(eVar2.m(bVar3));
        i q13 = q(eVar2.m(bVar4));
        o.b r5 = r();
        double d6 = f6;
        double d7 = i6;
        r5.q(q7, q9, q11, q13, (float) (Math.sin(d6) * d7));
        d(r5);
        o.b r6 = r();
        r6.q(q6, q8, q10, q12, (float) (Math.cos(d6) * d7));
        d(r6);
    }

    public void c(i iVar, i iVar2, int i6, float f6, i iVar3, i iVar4, int i7, int i8) {
        o.b r5 = r();
        r5.h(iVar, iVar2, i6, f6, iVar3, iVar4, i7);
        if (i8 != 8) {
            r5.d(this, i8);
        }
        d(r5);
    }

    public void d(o.b bVar) {
        i w5;
        if (bVar == null) {
            return;
        }
        boolean z5 = true;
        if (this.f8147k + 1 >= this.f8148l || this.f8146j + 1 >= this.f8141e) {
            y();
        }
        boolean z6 = false;
        if (!bVar.f8128f) {
            bVar.D(this);
            if (bVar.u()) {
                return;
            }
            bVar.r();
            if (bVar.f(this)) {
                i p6 = p();
                bVar.f8123a = p6;
                l(bVar);
                this.f8152p.c(bVar);
                B(this.f8152p, true);
                if (p6.f8170d == -1) {
                    if (bVar.f8123a == p6 && (w5 = bVar.w(p6)) != null) {
                        bVar.y(w5);
                    }
                    if (!bVar.f8128f) {
                        bVar.f8123a.g(bVar);
                    }
                    this.f8147k--;
                }
            } else {
                z5 = false;
            }
            if (!bVar.s()) {
                return;
            } else {
                z6 = z5;
            }
        }
        if (z6) {
            return;
        }
        l(bVar);
    }

    public o.b e(i iVar, i iVar2, int i6, int i7) {
        if (i7 == 8 && iVar2.f8173g && iVar.f8170d == -1) {
            iVar.e(this, iVar2.f8172f + i6);
            return null;
        }
        o.b r5 = r();
        r5.n(iVar, iVar2, i6);
        if (i7 != 8) {
            r5.d(this, i7);
        }
        d(r5);
        return r5;
    }

    public void f(i iVar, int i6) {
        o.b r5;
        int i7 = iVar.f8170d;
        if (i7 == -1) {
            iVar.e(this, i6);
            return;
        }
        if (i7 != -1) {
            o.b bVar = this.f8142f[i7];
            if (!bVar.f8128f) {
                if (bVar.f8127e.k() == 0) {
                    bVar.f8128f = true;
                } else {
                    r5 = r();
                    r5.m(iVar, i6);
                }
            }
            bVar.f8124b = i6;
            return;
        }
        r5 = r();
        r5.i(iVar, i6);
        d(r5);
    }

    public void g(i iVar, i iVar2, int i6, boolean z5) {
        o.b r5 = r();
        i t5 = t();
        t5.f8171e = 0;
        r5.o(iVar, iVar2, t5, i6);
        d(r5);
    }

    public void h(i iVar, i iVar2, int i6, int i7) {
        o.b r5 = r();
        i t5 = t();
        t5.f8171e = 0;
        r5.o(iVar, iVar2, t5, i6);
        if (i7 != 8) {
            m(r5, (int) (r5.f8127e.f(t5) * (-1.0f)), i7);
        }
        d(r5);
    }

    public void i(i iVar, i iVar2, int i6, boolean z5) {
        o.b r5 = r();
        i t5 = t();
        t5.f8171e = 0;
        r5.p(iVar, iVar2, t5, i6);
        d(r5);
    }

    public void j(i iVar, i iVar2, int i6, int i7) {
        o.b r5 = r();
        i t5 = t();
        t5.f8171e = 0;
        r5.p(iVar, iVar2, t5, i6);
        if (i7 != 8) {
            m(r5, (int) (r5.f8127e.f(t5) * (-1.0f)), i7);
        }
        d(r5);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f6, int i6) {
        o.b r5 = r();
        r5.k(iVar, iVar2, iVar3, iVar4, f6);
        if (i6 != 8) {
            r5.d(this, i6);
        }
        d(r5);
    }

    void m(o.b bVar, int i6, int i7) {
        bVar.e(o(i7, null), i6);
    }

    public i o(int i6, String str) {
        if (this.f8146j + 1 >= this.f8141e) {
            y();
        }
        i a6 = a(i.a.ERROR, str);
        int i7 = this.f8137a + 1;
        this.f8137a = i7;
        this.f8146j++;
        a6.f8169c = i7;
        a6.f8171e = i6;
        this.f8149m.f8132d[i7] = a6;
        this.f8139c.a(a6);
        return a6;
    }

    public i p() {
        if (this.f8146j + 1 >= this.f8141e) {
            y();
        }
        i a6 = a(i.a.SLACK, null);
        int i6 = this.f8137a + 1;
        this.f8137a = i6;
        this.f8146j++;
        a6.f8169c = i6;
        this.f8149m.f8132d[i6] = a6;
        return a6;
    }

    public i q(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f8146j + 1 >= this.f8141e) {
            y();
        }
        if (obj instanceof p.d) {
            p.d dVar = (p.d) obj;
            iVar = dVar.f();
            if (iVar == null) {
                dVar.m(this.f8149m);
                iVar = dVar.f();
            }
            int i6 = iVar.f8169c;
            if (i6 == -1 || i6 > this.f8137a || this.f8149m.f8132d[i6] == null) {
                if (i6 != -1) {
                    iVar.d();
                }
                int i7 = this.f8137a + 1;
                this.f8137a = i7;
                this.f8146j++;
                iVar.f8169c = i7;
                iVar.f8176j = i.a.UNRESTRICTED;
                this.f8149m.f8132d[i7] = iVar;
            }
        }
        return iVar;
    }

    public o.b r() {
        o.b bVar;
        if (f8134r) {
            bVar = (o.b) this.f8149m.f8129a.b();
            if (bVar == null) {
                bVar = new b(this.f8149m);
                f8136t++;
            }
            bVar.z();
        } else {
            bVar = (o.b) this.f8149m.f8130b.b();
            if (bVar == null) {
                bVar = new o.b(this.f8149m);
                f8135s++;
            }
            bVar.z();
        }
        i.b();
        return bVar;
    }

    public i t() {
        if (this.f8146j + 1 >= this.f8141e) {
            y();
        }
        i a6 = a(i.a.SLACK, null);
        int i6 = this.f8137a + 1;
        this.f8137a = i6;
        this.f8146j++;
        a6.f8169c = i6;
        this.f8149m.f8132d[i6] = a6;
        return a6;
    }

    public c v() {
        return this.f8149m;
    }

    public int x(Object obj) {
        i f6 = ((p.d) obj).f();
        if (f6 != null) {
            return (int) (f6.f8172f + 0.5f);
        }
        return 0;
    }

    public void z() {
        if (this.f8143g || this.f8144h) {
            boolean z5 = false;
            int i6 = 0;
            while (true) {
                if (i6 >= this.f8147k) {
                    z5 = true;
                    break;
                } else if (!this.f8142f[i6].f8128f) {
                    break;
                } else {
                    i6++;
                }
            }
            if (z5) {
                n();
                return;
            }
        }
        A(this.f8139c);
    }
}
