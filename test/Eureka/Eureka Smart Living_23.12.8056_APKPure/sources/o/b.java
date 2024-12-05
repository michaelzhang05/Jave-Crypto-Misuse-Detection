package o;

import java.util.ArrayList;
import java.util.Iterator;
import o.d;
import o.i;

/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: e, reason: collision with root package name */
    public a f8127e;

    /* renamed from: a, reason: collision with root package name */
    i f8123a = null;

    /* renamed from: b, reason: collision with root package name */
    float f8124b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    boolean f8125c = false;

    /* renamed from: d, reason: collision with root package name */
    ArrayList f8126d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    boolean f8128f = false;

    /* loaded from: classes.dex */
    public interface a {
        float a(int i6);

        void b(i iVar, float f6, boolean z5);

        boolean c(i iVar);

        void clear();

        float d(b bVar, boolean z5);

        void e(i iVar, float f6);

        float f(i iVar);

        i g(int i6);

        void h(float f6);

        float i(i iVar, boolean z5);

        void j();

        int k();
    }

    public b() {
    }

    private boolean v(i iVar, d dVar) {
        return iVar.f8179m <= 1;
    }

    private i x(boolean[] zArr, i iVar) {
        i.a aVar;
        int k6 = this.f8127e.k();
        i iVar2 = null;
        float f6 = 0.0f;
        for (int i6 = 0; i6 < k6; i6++) {
            float a6 = this.f8127e.a(i6);
            if (a6 < 0.0f) {
                i g6 = this.f8127e.g(i6);
                if ((zArr == null || !zArr[g6.f8169c]) && g6 != iVar && (((aVar = g6.f8176j) == i.a.SLACK || aVar == i.a.ERROR) && a6 < f6)) {
                    f6 = a6;
                    iVar2 = g6;
                }
            }
        }
        return iVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String A() {
        /*
            r10 = this;
            o.i r0 = r10.f8123a
            java.lang.String r1 = ""
            if (r0 != 0) goto L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L21
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            o.i r1 = r10.f8123a
            r0.append(r1)
        L21:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f8124b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f8124b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L53
        L52:
            r1 = 0
        L53:
            o.b$a r5 = r10.f8127e
            int r5 = r5.k()
        L59:
            if (r2 >= r5) goto Ld2
            o.b$a r6 = r10.f8127e
            o.i r6 = r6.g(r2)
            if (r6 != 0) goto L64
            goto Lcf
        L64:
            o.b$a r7 = r10.f8127e
            float r7 = r7.a(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L6f
            goto Lcf
        L6f:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L86
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto Lab
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto La2
        L86:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r8 <= 0) goto L9a
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto Lab
        L9a:
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        La2:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r9
        Lab:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto Lb7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto Lc4
        Lb7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        Lc4:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = 1
        Lcf:
            int r2 = r2 + 1
            goto L59
        Ld2:
            if (r1 != 0) goto Le5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Le5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.b.A():java.lang.String");
    }

    public void B(d dVar, i iVar, boolean z5) {
        if (iVar.f8173g) {
            this.f8124b += iVar.f8172f * this.f8127e.f(iVar);
            this.f8127e.i(iVar, z5);
            if (z5) {
                iVar.c(this);
            }
        }
    }

    public void C(b bVar, boolean z5) {
        this.f8124b += bVar.f8124b * this.f8127e.d(bVar, z5);
        if (z5) {
            bVar.f8123a.c(this);
        }
    }

    public void D(d dVar) {
        if (dVar.f8142f.length == 0) {
            return;
        }
        boolean z5 = false;
        while (!z5) {
            int k6 = this.f8127e.k();
            for (int i6 = 0; i6 < k6; i6++) {
                i g6 = this.f8127e.g(i6);
                if (g6.f8170d != -1 || g6.f8173g) {
                    this.f8126d.add(g6);
                }
            }
            if (this.f8126d.size() > 0) {
                Iterator it = this.f8126d.iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    if (iVar.f8173g) {
                        B(dVar, iVar, true);
                    } else {
                        C(dVar.f8142f[iVar.f8170d], true);
                    }
                }
                this.f8126d.clear();
            } else {
                z5 = true;
            }
        }
    }

    @Override // o.d.a
    public void a(i iVar) {
        int i6 = iVar.f8171e;
        float f6 = 1.0f;
        if (i6 != 1) {
            if (i6 == 2) {
                f6 = 1000.0f;
            } else if (i6 == 3) {
                f6 = 1000000.0f;
            } else if (i6 == 4) {
                f6 = 1.0E9f;
            } else if (i6 == 5) {
                f6 = 1.0E12f;
            }
        }
        this.f8127e.e(iVar, f6);
    }

    @Override // o.d.a
    public i b(d dVar, boolean[] zArr) {
        return x(zArr, null);
    }

    @Override // o.d.a
    public void c(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f8123a = null;
            this.f8127e.clear();
            for (int i6 = 0; i6 < bVar.f8127e.k(); i6++) {
                this.f8127e.b(bVar.f8127e.g(i6), bVar.f8127e.a(i6), true);
            }
        }
    }

    @Override // o.d.a
    public void clear() {
        this.f8127e.clear();
        this.f8123a = null;
        this.f8124b = 0.0f;
    }

    public b d(d dVar, int i6) {
        this.f8127e.e(dVar.o(i6, "ep"), 1.0f);
        this.f8127e.e(dVar.o(i6, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b e(i iVar, int i6) {
        this.f8127e.e(iVar, i6);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f(d dVar) {
        boolean z5;
        i g6 = g(dVar);
        if (g6 == null) {
            z5 = true;
        } else {
            y(g6);
            z5 = false;
        }
        if (this.f8127e.k() == 0) {
            this.f8128f = true;
        }
        return z5;
    }

    i g(d dVar) {
        int k6 = this.f8127e.k();
        i iVar = null;
        i iVar2 = null;
        boolean z5 = false;
        boolean z6 = false;
        float f6 = 0.0f;
        float f7 = 0.0f;
        for (int i6 = 0; i6 < k6; i6++) {
            float a6 = this.f8127e.a(i6);
            i g6 = this.f8127e.g(i6);
            if (g6.f8176j == i.a.UNRESTRICTED) {
                if (iVar == null || f6 > a6) {
                    z5 = v(g6, dVar);
                    f6 = a6;
                    iVar = g6;
                } else if (!z5 && v(g6, dVar)) {
                    f6 = a6;
                    iVar = g6;
                    z5 = true;
                }
            } else if (iVar == null && a6 < 0.0f) {
                if (iVar2 == null || f7 > a6) {
                    z6 = v(g6, dVar);
                    f7 = a6;
                    iVar2 = g6;
                } else if (!z6 && v(g6, dVar)) {
                    f7 = a6;
                    iVar2 = g6;
                    z6 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // o.d.a
    public i getKey() {
        return this.f8123a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b h(i iVar, i iVar2, int i6, float f6, i iVar3, i iVar4, int i7) {
        float f7;
        int i8;
        if (iVar2 == iVar3) {
            this.f8127e.e(iVar, 1.0f);
            this.f8127e.e(iVar4, 1.0f);
            this.f8127e.e(iVar2, -2.0f);
            return this;
        }
        if (f6 == 0.5f) {
            this.f8127e.e(iVar, 1.0f);
            this.f8127e.e(iVar2, -1.0f);
            this.f8127e.e(iVar3, -1.0f);
            this.f8127e.e(iVar4, 1.0f);
            if (i6 > 0 || i7 > 0) {
                i8 = (-i6) + i7;
                f7 = i8;
            }
            return this;
        }
        if (f6 <= 0.0f) {
            this.f8127e.e(iVar, -1.0f);
            this.f8127e.e(iVar2, 1.0f);
            f7 = i6;
        } else {
            if (f6 < 1.0f) {
                float f8 = 1.0f - f6;
                this.f8127e.e(iVar, f8 * 1.0f);
                this.f8127e.e(iVar2, f8 * (-1.0f));
                this.f8127e.e(iVar3, (-1.0f) * f6);
                this.f8127e.e(iVar4, 1.0f * f6);
                if (i6 > 0 || i7 > 0) {
                    f7 = ((-i6) * f8) + (i7 * f6);
                }
                return this;
            }
            this.f8127e.e(iVar4, -1.0f);
            this.f8127e.e(iVar3, 1.0f);
            i8 = -i7;
            f7 = i8;
        }
        this.f8124b = f7;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b i(i iVar, int i6) {
        this.f8123a = iVar;
        float f6 = i6;
        iVar.f8172f = f6;
        this.f8124b = f6;
        this.f8128f = true;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b j(i iVar, i iVar2, float f6) {
        this.f8127e.e(iVar, -1.0f);
        this.f8127e.e(iVar2, f6);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f6) {
        this.f8127e.e(iVar, -1.0f);
        this.f8127e.e(iVar2, 1.0f);
        this.f8127e.e(iVar3, f6);
        this.f8127e.e(iVar4, -f6);
        return this;
    }

    public b l(float f6, float f7, float f8, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f8124b = 0.0f;
        if (f7 == 0.0f || f6 == f8) {
            this.f8127e.e(iVar, 1.0f);
            this.f8127e.e(iVar2, -1.0f);
            this.f8127e.e(iVar4, 1.0f);
            this.f8127e.e(iVar3, -1.0f);
        } else if (f6 == 0.0f) {
            this.f8127e.e(iVar, 1.0f);
            this.f8127e.e(iVar2, -1.0f);
        } else if (f8 == 0.0f) {
            this.f8127e.e(iVar3, 1.0f);
            this.f8127e.e(iVar4, -1.0f);
        } else {
            float f9 = (f6 / f7) / (f8 / f7);
            this.f8127e.e(iVar, 1.0f);
            this.f8127e.e(iVar2, -1.0f);
            this.f8127e.e(iVar4, f9);
            this.f8127e.e(iVar3, -f9);
        }
        return this;
    }

    public b m(i iVar, int i6) {
        a aVar;
        float f6;
        if (i6 < 0) {
            this.f8124b = i6 * (-1);
            aVar = this.f8127e;
            f6 = 1.0f;
        } else {
            this.f8124b = i6;
            aVar = this.f8127e;
            f6 = -1.0f;
        }
        aVar.e(iVar, f6);
        return this;
    }

    public b n(i iVar, i iVar2, int i6) {
        boolean z5 = false;
        if (i6 != 0) {
            if (i6 < 0) {
                i6 *= -1;
                z5 = true;
            }
            this.f8124b = i6;
        }
        if (z5) {
            this.f8127e.e(iVar, 1.0f);
            this.f8127e.e(iVar2, -1.0f);
        } else {
            this.f8127e.e(iVar, -1.0f);
            this.f8127e.e(iVar2, 1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i6) {
        boolean z5 = false;
        if (i6 != 0) {
            if (i6 < 0) {
                i6 *= -1;
                z5 = true;
            }
            this.f8124b = i6;
        }
        if (z5) {
            this.f8127e.e(iVar, 1.0f);
            this.f8127e.e(iVar2, -1.0f);
            this.f8127e.e(iVar3, -1.0f);
        } else {
            this.f8127e.e(iVar, -1.0f);
            this.f8127e.e(iVar2, 1.0f);
            this.f8127e.e(iVar3, 1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i6) {
        boolean z5 = false;
        if (i6 != 0) {
            if (i6 < 0) {
                i6 *= -1;
                z5 = true;
            }
            this.f8124b = i6;
        }
        if (z5) {
            this.f8127e.e(iVar, 1.0f);
            this.f8127e.e(iVar2, -1.0f);
            this.f8127e.e(iVar3, 1.0f);
        } else {
            this.f8127e.e(iVar, -1.0f);
            this.f8127e.e(iVar2, 1.0f);
            this.f8127e.e(iVar3, -1.0f);
        }
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f6) {
        this.f8127e.e(iVar3, 0.5f);
        this.f8127e.e(iVar4, 0.5f);
        this.f8127e.e(iVar, -0.5f);
        this.f8127e.e(iVar2, -0.5f);
        this.f8124b = -f6;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        float f6 = this.f8124b;
        if (f6 < 0.0f) {
            this.f8124b = f6 * (-1.0f);
            this.f8127e.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s() {
        i iVar = this.f8123a;
        return iVar != null && (iVar.f8176j == i.a.UNRESTRICTED || this.f8124b >= 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t(i iVar) {
        return this.f8127e.c(iVar);
    }

    public String toString() {
        return A();
    }

    public boolean u() {
        return this.f8123a == null && this.f8124b == 0.0f && this.f8127e.k() == 0;
    }

    public i w(i iVar) {
        return x(null, iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(i iVar) {
        i iVar2 = this.f8123a;
        if (iVar2 != null) {
            this.f8127e.e(iVar2, -1.0f);
            this.f8123a = null;
        }
        float i6 = this.f8127e.i(iVar, true) * (-1.0f);
        this.f8123a = iVar;
        if (i6 == 1.0f) {
            return;
        }
        this.f8124b /= i6;
        this.f8127e.h(i6);
    }

    public void z() {
        this.f8123a = null;
        this.f8127e.clear();
        this.f8124b = 0.0f;
        this.f8128f = false;
    }

    public b(c cVar) {
        this.f8127e = new o.a(this, cVar);
    }
}
