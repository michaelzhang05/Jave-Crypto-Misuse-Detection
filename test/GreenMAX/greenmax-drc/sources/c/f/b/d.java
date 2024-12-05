package c.f.b;

import c.f.b.i;
import c.f.b.k.d;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: LinearSystem.java */
/* loaded from: classes.dex */
public class d {
    public static boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f2459b = true;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2460c = true;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f2461d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f2462e = false;

    /* renamed from: f, reason: collision with root package name */
    private static int f2463f = 1000;

    /* renamed from: g, reason: collision with root package name */
    public static e f2464g;

    /* renamed from: h, reason: collision with root package name */
    public static long f2465h;

    /* renamed from: i, reason: collision with root package name */
    public static long f2466i;
    private a m;
    c.f.b.b[] p;
    final c w;
    private a z;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2467j = false;

    /* renamed from: k, reason: collision with root package name */
    int f2468k = 0;
    private HashMap<String, i> l = null;
    private int n = 32;
    private int o = 32;
    public boolean q = false;
    public boolean r = false;
    private boolean[] s = new boolean[32];
    int t = 1;
    int u = 0;
    private int v = 32;
    private i[] x = new i[f2463f];
    private int y = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinearSystem.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(i iVar);

        i b(d dVar, boolean[] zArr);

        void c(a aVar);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinearSystem.java */
    /* loaded from: classes.dex */
    public class b extends c.f.b.b {
        public b(c cVar) {
            this.f2454e = new j(this, cVar);
        }
    }

    public d() {
        this.p = null;
        this.p = new c.f.b.b[32];
        C();
        c cVar = new c();
        this.w = cVar;
        this.m = new h(cVar);
        if (f2462e) {
            this.z = new b(cVar);
        } else {
            this.z = new c.f.b.b(cVar);
        }
    }

    private final int B(a aVar, boolean z) {
        if (f2464g != null) {
            throw null;
        }
        for (int i2 = 0; i2 < this.t; i2++) {
            this.s[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            if (f2464g == null) {
                i3++;
                if (i3 >= this.t * 2) {
                    return i3;
                }
                if (aVar.getKey() != null) {
                    this.s[aVar.getKey().f2482d] = true;
                }
                i b2 = aVar.b(this, this.s);
                if (b2 != null) {
                    boolean[] zArr = this.s;
                    int i4 = b2.f2482d;
                    if (zArr[i4]) {
                        return i3;
                    }
                    zArr[i4] = true;
                }
                if (b2 != null) {
                    float f2 = Float.MAX_VALUE;
                    int i5 = -1;
                    for (int i6 = 0; i6 < this.u; i6++) {
                        c.f.b.b bVar = this.p[i6];
                        if (bVar.a.f2489k != i.a.UNRESTRICTED && !bVar.f2455f && bVar.t(b2)) {
                            float f3 = bVar.f2454e.f(b2);
                            if (f3 < 0.0f) {
                                float f4 = (-bVar.f2451b) / f3;
                                if (f4 < f2) {
                                    i5 = i6;
                                    f2 = f4;
                                }
                            }
                        }
                    }
                    if (i5 > -1) {
                        c.f.b.b bVar2 = this.p[i5];
                        bVar2.a.f2483e = -1;
                        if (f2464g == null) {
                            bVar2.x(b2);
                            i iVar = bVar2.a;
                            iVar.f2483e = i5;
                            iVar.g(this, bVar2);
                        } else {
                            throw null;
                        }
                    } else {
                        continue;
                    }
                } else {
                    z2 = true;
                }
            } else {
                throw null;
            }
        }
        return i3;
    }

    private void C() {
        int i2 = 0;
        if (f2462e) {
            while (i2 < this.u) {
                c.f.b.b bVar = this.p[i2];
                if (bVar != null) {
                    this.w.a.a(bVar);
                }
                this.p[i2] = null;
                i2++;
            }
            return;
        }
        while (i2 < this.u) {
            c.f.b.b bVar2 = this.p[i2];
            if (bVar2 != null) {
                this.w.f2456b.a(bVar2);
            }
            this.p[i2] = null;
            i2++;
        }
    }

    private i a(i.a aVar, String str) {
        i b2 = this.w.f2457c.b();
        if (b2 == null) {
            b2 = new i(aVar, str);
            b2.f(aVar, str);
        } else {
            b2.d();
            b2.f(aVar, str);
        }
        int i2 = this.y;
        int i3 = f2463f;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            f2463f = i4;
            this.x = (i[]) Arrays.copyOf(this.x, i4);
        }
        i[] iVarArr = this.x;
        int i5 = this.y;
        this.y = i5 + 1;
        iVarArr[i5] = b2;
        return b2;
    }

    private final void l(c.f.b.b bVar) {
        int i2;
        if (f2460c && bVar.f2455f) {
            bVar.a.e(this, bVar.f2451b);
        } else {
            c.f.b.b[] bVarArr = this.p;
            int i3 = this.u;
            bVarArr[i3] = bVar;
            i iVar = bVar.a;
            iVar.f2483e = i3;
            this.u = i3 + 1;
            iVar.g(this, bVar);
        }
        if (f2460c && this.f2467j) {
            int i4 = 0;
            while (i4 < this.u) {
                if (this.p[i4] == null) {
                    System.out.println("WTF");
                }
                c.f.b.b[] bVarArr2 = this.p;
                if (bVarArr2[i4] != null && bVarArr2[i4].f2455f) {
                    c.f.b.b bVar2 = bVarArr2[i4];
                    bVar2.a.e(this, bVar2.f2451b);
                    if (f2462e) {
                        this.w.a.a(bVar2);
                    } else {
                        this.w.f2456b.a(bVar2);
                    }
                    this.p[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.u;
                        if (i5 >= i2) {
                            break;
                        }
                        c.f.b.b[] bVarArr3 = this.p;
                        int i7 = i5 - 1;
                        bVarArr3[i7] = bVarArr3[i5];
                        if (bVarArr3[i7].a.f2483e == i5) {
                            bVarArr3[i7].a.f2483e = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.p[i6] = null;
                    }
                    this.u = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.f2467j = false;
        }
    }

    private void n() {
        for (int i2 = 0; i2 < this.u; i2++) {
            c.f.b.b bVar = this.p[i2];
            bVar.a.f2485g = bVar.f2451b;
        }
    }

    public static c.f.b.b s(d dVar, i iVar, i iVar2, float f2) {
        return dVar.r().j(iVar, iVar2, f2);
    }

    private int u(a aVar) throws Exception {
        boolean z;
        int i2 = 0;
        while (true) {
            if (i2 >= this.u) {
                z = false;
                break;
            }
            c.f.b.b[] bVarArr = this.p;
            if (bVarArr[i2].a.f2489k != i.a.UNRESTRICTED && bVarArr[i2].f2451b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            if (f2464g == null) {
                i3++;
                float f2 = Float.MAX_VALUE;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                for (int i7 = 0; i7 < this.u; i7++) {
                    c.f.b.b bVar = this.p[i7];
                    if (bVar.a.f2489k != i.a.UNRESTRICTED && !bVar.f2455f && bVar.f2451b < 0.0f) {
                        int i8 = 9;
                        if (f2461d) {
                            int a2 = bVar.f2454e.a();
                            int i9 = 0;
                            while (i9 < a2) {
                                i b2 = bVar.f2454e.b(i9);
                                float f3 = bVar.f2454e.f(b2);
                                if (f3 > 0.0f) {
                                    int i10 = 0;
                                    while (i10 < i8) {
                                        float f4 = b2.f2487i[i10] / f3;
                                        if ((f4 < f2 && i10 == i6) || i10 > i6) {
                                            i5 = b2.f2482d;
                                            i6 = i10;
                                            i4 = i7;
                                            f2 = f4;
                                        }
                                        i10++;
                                        i8 = 9;
                                    }
                                }
                                i9++;
                                i8 = 9;
                            }
                        } else {
                            for (int i11 = 1; i11 < this.t; i11++) {
                                i iVar = this.w.f2458d[i11];
                                float f5 = bVar.f2454e.f(iVar);
                                if (f5 > 0.0f) {
                                    for (int i12 = 0; i12 < 9; i12++) {
                                        float f6 = iVar.f2487i[i12] / f5;
                                        if ((f6 < f2 && i12 == i6) || i12 > i6) {
                                            i5 = i11;
                                            i6 = i12;
                                            i4 = i7;
                                            f2 = f6;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i4 != -1) {
                    c.f.b.b bVar2 = this.p[i4];
                    bVar2.a.f2483e = -1;
                    if (f2464g == null) {
                        bVar2.x(this.w.f2458d[i5]);
                        i iVar2 = bVar2.a;
                        iVar2.f2483e = i4;
                        iVar2.g(this, bVar2);
                    } else {
                        throw null;
                    }
                } else {
                    z2 = true;
                }
                if (i3 > this.t / 2) {
                    z2 = true;
                }
            } else {
                throw null;
            }
        }
        return i3;
    }

    public static e w() {
        return f2464g;
    }

    private void y() {
        int i2 = this.n * 2;
        this.n = i2;
        this.p = (c.f.b.b[]) Arrays.copyOf(this.p, i2);
        c cVar = this.w;
        cVar.f2458d = (i[]) Arrays.copyOf(cVar.f2458d, this.n);
        int i3 = this.n;
        this.s = new boolean[i3];
        this.o = i3;
        this.v = i3;
        if (f2464g != null) {
            throw null;
        }
    }

    void A(a aVar) throws Exception {
        if (f2464g == null) {
            u(aVar);
            B(aVar, false);
            n();
            return;
        }
        throw null;
    }

    public void D() {
        c cVar;
        int i2 = 0;
        while (true) {
            cVar = this.w;
            i[] iVarArr = cVar.f2458d;
            if (i2 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i2];
            if (iVar != null) {
                iVar.d();
            }
            i2++;
        }
        cVar.f2457c.c(this.x, this.y);
        this.y = 0;
        Arrays.fill(this.w.f2458d, (Object) null);
        HashMap<String, i> hashMap = this.l;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f2468k = 0;
        this.m.clear();
        this.t = 1;
        for (int i3 = 0; i3 < this.u; i3++) {
            c.f.b.b[] bVarArr = this.p;
            if (bVarArr[i3] != null) {
                bVarArr[i3].f2452c = false;
            }
        }
        C();
        this.u = 0;
        if (f2462e) {
            this.z = new b(this.w);
        } else {
            this.z = new c.f.b.b(this.w);
        }
    }

    public void b(c.f.b.k.e eVar, c.f.b.k.e eVar2, float f2, int i2) {
        d.b bVar = d.b.LEFT;
        i q = q(eVar.m(bVar));
        d.b bVar2 = d.b.TOP;
        i q2 = q(eVar.m(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i q3 = q(eVar.m(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i q4 = q(eVar.m(bVar4));
        i q5 = q(eVar2.m(bVar));
        i q6 = q(eVar2.m(bVar2));
        i q7 = q(eVar2.m(bVar3));
        i q8 = q(eVar2.m(bVar4));
        c.f.b.b r = r();
        double d2 = f2;
        double sin = Math.sin(d2);
        double d3 = i2;
        Double.isNaN(d3);
        r.q(q2, q4, q6, q8, (float) (sin * d3));
        d(r);
        c.f.b.b r2 = r();
        double cos = Math.cos(d2);
        Double.isNaN(d3);
        r2.q(q, q3, q5, q7, (float) (cos * d3));
        d(r2);
    }

    public void c(i iVar, i iVar2, int i2, float f2, i iVar3, i iVar4, int i3, int i4) {
        c.f.b.b r = r();
        r.h(iVar, iVar2, i2, f2, iVar3, iVar4, i3);
        if (i4 != 8) {
            r.d(this, i4);
        }
        d(r);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(c.f.b.b r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            c.f.b.e r0 = c.f.b.d.f2464g
            r1 = 0
            if (r0 != 0) goto L95
            int r0 = r6.u
            r2 = 1
            int r0 = r0 + r2
            int r3 = r6.v
            if (r0 >= r3) goto L17
            int r0 = r6.t
            int r0 = r0 + r2
            int r3 = r6.o
            if (r0 < r3) goto L1a
        L17:
            r6.y()
        L1a:
            r0 = 0
            boolean r3 = r7.f2455f
            if (r3 != 0) goto L8f
            r7.D(r6)
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L29
            return
        L29:
            r7.r()
            boolean r3 = r7.f(r6)
            if (r3 == 0) goto L86
            c.f.b.i r3 = r6.p()
            r7.a = r3
            int r4 = r6.u
            r6.l(r7)
            int r5 = r6.u
            int r4 = r4 + r2
            if (r5 != r4) goto L86
            c.f.b.d$a r0 = r6.z
            r0.c(r7)
            c.f.b.d$a r0 = r6.z
            r6.B(r0, r2)
            int r0 = r3.f2483e
            r4 = -1
            if (r0 != r4) goto L87
            c.f.b.i r0 = r7.a
            if (r0 != r3) goto L64
            c.f.b.i r0 = r7.v(r3)
            if (r0 == 0) goto L64
            c.f.b.e r3 = c.f.b.d.f2464g
            if (r3 != 0) goto L63
            r7.x(r0)
            goto L64
        L63:
            throw r1
        L64:
            boolean r0 = r7.f2455f
            if (r0 != 0) goto L6d
            c.f.b.i r0 = r7.a
            r0.g(r6, r7)
        L6d:
            boolean r0 = c.f.b.d.f2462e
            if (r0 == 0) goto L79
            c.f.b.c r0 = r6.w
            c.f.b.f<c.f.b.b> r0 = r0.a
            r0.a(r7)
            goto L80
        L79:
            c.f.b.c r0 = r6.w
            c.f.b.f<c.f.b.b> r0 = r0.f2456b
            r0.a(r7)
        L80:
            int r0 = r6.u
            int r0 = r0 - r2
            r6.u = r0
            goto L87
        L86:
            r2 = 0
        L87:
            boolean r0 = r7.s()
            if (r0 != 0) goto L8e
            return
        L8e:
            r0 = r2
        L8f:
            if (r0 != 0) goto L94
            r6.l(r7)
        L94:
            return
        L95:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.b.d.d(c.f.b.b):void");
    }

    public c.f.b.b e(i iVar, i iVar2, int i2, int i3) {
        if (f2459b && i3 == 8 && iVar2.f2486h && iVar.f2483e == -1) {
            iVar.e(this, iVar2.f2485g + i2);
            return null;
        }
        c.f.b.b r = r();
        r.n(iVar, iVar2, i2);
        if (i3 != 8) {
            r.d(this, i3);
        }
        d(r);
        return r;
    }

    public void f(i iVar, int i2) {
        if (f2459b && iVar.f2483e == -1) {
            float f2 = i2;
            iVar.e(this, f2);
            for (int i3 = 0; i3 < this.f2468k + 1; i3++) {
                i iVar2 = this.w.f2458d[i3];
                if (iVar2 != null && iVar2.o && iVar2.p == iVar.f2482d) {
                    iVar2.e(this, iVar2.q + f2);
                }
            }
            return;
        }
        int i4 = iVar.f2483e;
        if (i4 != -1) {
            c.f.b.b bVar = this.p[i4];
            if (bVar.f2455f) {
                bVar.f2451b = i2;
                return;
            }
            if (bVar.f2454e.a() == 0) {
                bVar.f2455f = true;
                bVar.f2451b = i2;
                return;
            } else {
                c.f.b.b r = r();
                r.m(iVar, i2);
                d(r);
                return;
            }
        }
        c.f.b.b r2 = r();
        r2.i(iVar, i2);
        d(r2);
    }

    public void g(i iVar, i iVar2, int i2, boolean z) {
        c.f.b.b r = r();
        i t = t();
        t.f2484f = 0;
        r.o(iVar, iVar2, t, i2);
        d(r);
    }

    public void h(i iVar, i iVar2, int i2, int i3) {
        c.f.b.b r = r();
        i t = t();
        t.f2484f = 0;
        r.o(iVar, iVar2, t, i2);
        if (i3 != 8) {
            m(r, (int) (r.f2454e.f(t) * (-1.0f)), i3);
        }
        d(r);
    }

    public void i(i iVar, i iVar2, int i2, boolean z) {
        c.f.b.b r = r();
        i t = t();
        t.f2484f = 0;
        r.p(iVar, iVar2, t, i2);
        d(r);
    }

    public void j(i iVar, i iVar2, int i2, int i3) {
        c.f.b.b r = r();
        i t = t();
        t.f2484f = 0;
        r.p(iVar, iVar2, t, i2);
        if (i3 != 8) {
            m(r, (int) (r.f2454e.f(t) * (-1.0f)), i3);
        }
        d(r);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f2, int i2) {
        c.f.b.b r = r();
        r.k(iVar, iVar2, iVar3, iVar4, f2);
        if (i2 != 8) {
            r.d(this, i2);
        }
        d(r);
    }

    void m(c.f.b.b bVar, int i2, int i3) {
        bVar.e(o(i3, null), i2);
    }

    public i o(int i2, String str) {
        if (f2464g == null) {
            if (this.t + 1 >= this.o) {
                y();
            }
            i a2 = a(i.a.ERROR, str);
            int i3 = this.f2468k + 1;
            this.f2468k = i3;
            this.t++;
            a2.f2482d = i3;
            a2.f2484f = i2;
            this.w.f2458d[i3] = a2;
            this.m.a(a2);
            return a2;
        }
        throw null;
    }

    public i p() {
        if (f2464g == null) {
            if (this.t + 1 >= this.o) {
                y();
            }
            i a2 = a(i.a.SLACK, null);
            int i2 = this.f2468k + 1;
            this.f2468k = i2;
            this.t++;
            a2.f2482d = i2;
            this.w.f2458d[i2] = a2;
            return a2;
        }
        throw null;
    }

    public i q(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.t + 1 >= this.o) {
            y();
        }
        if (obj instanceof c.f.b.k.d) {
            c.f.b.k.d dVar = (c.f.b.k.d) obj;
            iVar = dVar.h();
            if (iVar == null) {
                dVar.r(this.w);
                iVar = dVar.h();
            }
            int i2 = iVar.f2482d;
            if (i2 == -1 || i2 > this.f2468k || this.w.f2458d[i2] == null) {
                if (i2 != -1) {
                    iVar.d();
                }
                int i3 = this.f2468k + 1;
                this.f2468k = i3;
                this.t++;
                iVar.f2482d = i3;
                iVar.f2489k = i.a.UNRESTRICTED;
                this.w.f2458d[i3] = iVar;
            }
        }
        return iVar;
    }

    public c.f.b.b r() {
        c.f.b.b b2;
        if (f2462e) {
            b2 = this.w.a.b();
            if (b2 == null) {
                b2 = new b(this.w);
                f2466i++;
            } else {
                b2.y();
            }
        } else {
            b2 = this.w.f2456b.b();
            if (b2 == null) {
                b2 = new c.f.b.b(this.w);
                f2465h++;
            } else {
                b2.y();
            }
        }
        i.b();
        return b2;
    }

    public i t() {
        if (f2464g == null) {
            if (this.t + 1 >= this.o) {
                y();
            }
            i a2 = a(i.a.SLACK, null);
            int i2 = this.f2468k + 1;
            this.f2468k = i2;
            this.t++;
            a2.f2482d = i2;
            this.w.f2458d[i2] = a2;
            return a2;
        }
        throw null;
    }

    public c v() {
        return this.w;
    }

    public int x(Object obj) {
        i h2 = ((c.f.b.k.d) obj).h();
        if (h2 != null) {
            return (int) (h2.f2485g + 0.5f);
        }
        return 0;
    }

    public void z() throws Exception {
        if (f2464g != null) {
            throw null;
        }
        if (this.m.isEmpty()) {
            n();
            return;
        }
        if (!this.q && !this.r) {
            A(this.m);
            return;
        }
        if (f2464g != null) {
            throw null;
        }
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= this.u) {
                z = true;
                break;
            } else if (!this.p[i2].f2455f) {
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            A(this.m);
        } else {
            if (f2464g == null) {
                n();
                return;
            }
            throw null;
        }
    }
}
