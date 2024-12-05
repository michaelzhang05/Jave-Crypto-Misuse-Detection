package c.f.b;

import c.f.b.d;
import c.f.b.i;
import java.util.ArrayList;

/* compiled from: ArrayRow.java */
/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: e, reason: collision with root package name */
    public a f2454e;
    i a = null;

    /* renamed from: b, reason: collision with root package name */
    float f2451b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    boolean f2452c = false;

    /* renamed from: d, reason: collision with root package name */
    ArrayList<i> f2453d = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    boolean f2455f = false;

    /* compiled from: ArrayRow.java */
    /* loaded from: classes.dex */
    public interface a {
        int a();

        i b(int i2);

        void c();

        void clear();

        float d(int i2);

        void e(i iVar, float f2, boolean z);

        float f(i iVar);

        boolean g(i iVar);

        float h(b bVar, boolean z);

        void i(i iVar, float f2);

        float j(i iVar, boolean z);

        void k(float f2);
    }

    public b() {
    }

    private boolean u(i iVar, d dVar) {
        return iVar.n <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int a2 = this.f2454e.a();
        i iVar2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < a2; i2++) {
            float d2 = this.f2454e.d(i2);
            if (d2 < 0.0f) {
                i b2 = this.f2454e.b(i2);
                if ((zArr == null || !zArr[b2.f2482d]) && b2 != iVar && (((aVar = b2.f2489k) == i.a.SLACK || aVar == i.a.ERROR) && d2 < f2)) {
                    f2 = d2;
                    iVar2 = b2;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z) {
        if (iVar.f2486h) {
            this.f2451b += iVar.f2485g * this.f2454e.f(iVar);
            this.f2454e.j(iVar, z);
            if (z) {
                iVar.c(this);
            }
            if (d.f2460c && this.f2454e.a() == 0) {
                this.f2455f = true;
                dVar.f2467j = true;
            }
        }
    }

    public void B(d dVar, b bVar, boolean z) {
        this.f2451b += bVar.f2451b * this.f2454e.h(bVar, z);
        if (z) {
            bVar.a.c(this);
        }
        if (d.f2460c && this.a != null && this.f2454e.a() == 0) {
            this.f2455f = true;
            dVar.f2467j = true;
        }
    }

    public void C(d dVar, i iVar, boolean z) {
        if (iVar.o) {
            float f2 = this.f2454e.f(iVar);
            this.f2451b += iVar.q * f2;
            this.f2454e.j(iVar, z);
            if (z) {
                iVar.c(this);
            }
            this.f2454e.e(dVar.w.f2458d[iVar.p], f2, z);
            if (d.f2460c && this.f2454e.a() == 0) {
                this.f2455f = true;
                dVar.f2467j = true;
            }
        }
    }

    public void D(d dVar) {
        if (dVar.p.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int a2 = this.f2454e.a();
            for (int i2 = 0; i2 < a2; i2++) {
                i b2 = this.f2454e.b(i2);
                if (b2.f2483e != -1 || b2.f2486h || b2.o) {
                    this.f2453d.add(b2);
                }
            }
            int size = this.f2453d.size();
            if (size > 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    i iVar = this.f2453d.get(i3);
                    if (iVar.f2486h) {
                        A(dVar, iVar, true);
                    } else if (iVar.o) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.p[iVar.f2483e], true);
                    }
                }
                this.f2453d.clear();
            } else {
                z = true;
            }
        }
        if (d.f2460c && this.a != null && this.f2454e.a() == 0) {
            this.f2455f = true;
            dVar.f2467j = true;
        }
    }

    @Override // c.f.b.d.a
    public void a(i iVar) {
        int i2 = iVar.f2484f;
        float f2 = 1.0f;
        if (i2 != 1) {
            if (i2 == 2) {
                f2 = 1000.0f;
            } else if (i2 == 3) {
                f2 = 1000000.0f;
            } else if (i2 == 4) {
                f2 = 1.0E9f;
            } else if (i2 == 5) {
                f2 = 1.0E12f;
            }
        }
        this.f2454e.i(iVar, f2);
    }

    @Override // c.f.b.d.a
    public i b(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // c.f.b.d.a
    public void c(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.a = null;
            this.f2454e.clear();
            for (int i2 = 0; i2 < bVar.f2454e.a(); i2++) {
                this.f2454e.e(bVar.f2454e.b(i2), bVar.f2454e.d(i2), true);
            }
        }
    }

    @Override // c.f.b.d.a
    public void clear() {
        this.f2454e.clear();
        this.a = null;
        this.f2451b = 0.0f;
    }

    public b d(d dVar, int i2) {
        this.f2454e.i(dVar.o(i2, "ep"), 1.0f);
        this.f2454e.i(dVar.o(i2, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b e(i iVar, int i2) {
        this.f2454e.i(iVar, i2);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f(d dVar) {
        boolean z;
        i g2 = g(dVar);
        if (g2 == null) {
            z = true;
        } else {
            x(g2);
            z = false;
        }
        if (this.f2454e.a() == 0) {
            this.f2455f = true;
        }
        return z;
    }

    i g(d dVar) {
        boolean u;
        boolean u2;
        int a2 = this.f2454e.a();
        i iVar = null;
        i iVar2 = null;
        boolean z = false;
        boolean z2 = false;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i2 = 0; i2 < a2; i2++) {
            float d2 = this.f2454e.d(i2);
            i b2 = this.f2454e.b(i2);
            if (b2.f2489k == i.a.UNRESTRICTED) {
                if (iVar == null) {
                    u2 = u(b2, dVar);
                } else if (f2 > d2) {
                    u2 = u(b2, dVar);
                } else if (!z && u(b2, dVar)) {
                    f2 = d2;
                    iVar = b2;
                    z = true;
                }
                z = u2;
                f2 = d2;
                iVar = b2;
            } else if (iVar == null && d2 < 0.0f) {
                if (iVar2 == null) {
                    u = u(b2, dVar);
                } else if (f3 > d2) {
                    u = u(b2, dVar);
                } else if (!z2 && u(b2, dVar)) {
                    f3 = d2;
                    iVar2 = b2;
                    z2 = true;
                }
                z2 = u;
                f3 = d2;
                iVar2 = b2;
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // c.f.b.d.a
    public i getKey() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b h(i iVar, i iVar2, int i2, float f2, i iVar3, i iVar4, int i3) {
        if (iVar2 == iVar3) {
            this.f2454e.i(iVar, 1.0f);
            this.f2454e.i(iVar4, 1.0f);
            this.f2454e.i(iVar2, -2.0f);
            return this;
        }
        if (f2 == 0.5f) {
            this.f2454e.i(iVar, 1.0f);
            this.f2454e.i(iVar2, -1.0f);
            this.f2454e.i(iVar3, -1.0f);
            this.f2454e.i(iVar4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                this.f2451b = (-i2) + i3;
            }
        } else if (f2 <= 0.0f) {
            this.f2454e.i(iVar, -1.0f);
            this.f2454e.i(iVar2, 1.0f);
            this.f2451b = i2;
        } else if (f2 >= 1.0f) {
            this.f2454e.i(iVar4, -1.0f);
            this.f2454e.i(iVar3, 1.0f);
            this.f2451b = -i3;
        } else {
            float f3 = 1.0f - f2;
            this.f2454e.i(iVar, f3 * 1.0f);
            this.f2454e.i(iVar2, f3 * (-1.0f));
            this.f2454e.i(iVar3, (-1.0f) * f2);
            this.f2454e.i(iVar4, 1.0f * f2);
            if (i2 > 0 || i3 > 0) {
                this.f2451b = ((-i2) * f3) + (i3 * f2);
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b i(i iVar, int i2) {
        this.a = iVar;
        float f2 = i2;
        iVar.f2485g = f2;
        this.f2451b = f2;
        this.f2455f = true;
        return this;
    }

    @Override // c.f.b.d.a
    public boolean isEmpty() {
        return this.a == null && this.f2451b == 0.0f && this.f2454e.a() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b j(i iVar, i iVar2, float f2) {
        this.f2454e.i(iVar, -1.0f);
        this.f2454e.i(iVar2, f2);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f2454e.i(iVar, -1.0f);
        this.f2454e.i(iVar2, 1.0f);
        this.f2454e.i(iVar3, f2);
        this.f2454e.i(iVar4, -f2);
        return this;
    }

    public b l(float f2, float f3, float f4, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f2451b = 0.0f;
        if (f3 == 0.0f || f2 == f4) {
            this.f2454e.i(iVar, 1.0f);
            this.f2454e.i(iVar2, -1.0f);
            this.f2454e.i(iVar4, 1.0f);
            this.f2454e.i(iVar3, -1.0f);
        } else if (f2 == 0.0f) {
            this.f2454e.i(iVar, 1.0f);
            this.f2454e.i(iVar2, -1.0f);
        } else if (f4 == 0.0f) {
            this.f2454e.i(iVar3, 1.0f);
            this.f2454e.i(iVar4, -1.0f);
        } else {
            float f5 = (f2 / f3) / (f4 / f3);
            this.f2454e.i(iVar, 1.0f);
            this.f2454e.i(iVar2, -1.0f);
            this.f2454e.i(iVar4, f5);
            this.f2454e.i(iVar3, -f5);
        }
        return this;
    }

    public b m(i iVar, int i2) {
        if (i2 < 0) {
            this.f2451b = i2 * (-1);
            this.f2454e.i(iVar, 1.0f);
        } else {
            this.f2451b = i2;
            this.f2454e.i(iVar, -1.0f);
        }
        return this;
    }

    public b n(i iVar, i iVar2, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f2451b = i2;
        }
        if (!z) {
            this.f2454e.i(iVar, -1.0f);
            this.f2454e.i(iVar2, 1.0f);
        } else {
            this.f2454e.i(iVar, 1.0f);
            this.f2454e.i(iVar2, -1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f2451b = i2;
        }
        if (!z) {
            this.f2454e.i(iVar, -1.0f);
            this.f2454e.i(iVar2, 1.0f);
            this.f2454e.i(iVar3, 1.0f);
        } else {
            this.f2454e.i(iVar, 1.0f);
            this.f2454e.i(iVar2, -1.0f);
            this.f2454e.i(iVar3, -1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f2451b = i2;
        }
        if (!z) {
            this.f2454e.i(iVar, -1.0f);
            this.f2454e.i(iVar2, 1.0f);
            this.f2454e.i(iVar3, -1.0f);
        } else {
            this.f2454e.i(iVar, 1.0f);
            this.f2454e.i(iVar2, -1.0f);
            this.f2454e.i(iVar3, 1.0f);
        }
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f2454e.i(iVar3, 0.5f);
        this.f2454e.i(iVar4, 0.5f);
        this.f2454e.i(iVar, -0.5f);
        this.f2454e.i(iVar2, -0.5f);
        this.f2451b = -f2;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        float f2 = this.f2451b;
        if (f2 < 0.0f) {
            this.f2451b = f2 * (-1.0f);
            this.f2454e.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s() {
        i iVar = this.a;
        return iVar != null && (iVar.f2489k == i.a.UNRESTRICTED || this.f2451b >= 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t(i iVar) {
        return this.f2454e.g(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(i iVar) {
        i iVar2 = this.a;
        if (iVar2 != null) {
            this.f2454e.i(iVar2, -1.0f);
            this.a.f2483e = -1;
            this.a = null;
        }
        float j2 = this.f2454e.j(iVar, true) * (-1.0f);
        this.a = iVar;
        if (j2 == 1.0f) {
            return;
        }
        this.f2451b /= j2;
        this.f2454e.k(j2);
    }

    public void y() {
        this.a = null;
        this.f2454e.clear();
        this.f2451b = 0.0f;
        this.f2455f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String z() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.b.b.z():java.lang.String");
    }

    public b(c cVar) {
        this.f2454e = new c.f.b.a(this, cVar);
    }
}
