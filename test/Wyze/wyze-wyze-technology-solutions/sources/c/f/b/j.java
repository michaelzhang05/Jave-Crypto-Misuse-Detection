package c.f.b;

import c.f.b.b;
import java.util.Arrays;

/* compiled from: SolverVariableValues.java */
/* loaded from: classes.dex */
public class j implements b.a {
    private static float a = 0.001f;

    /* renamed from: b, reason: collision with root package name */
    private final int f2496b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f2497c = 16;

    /* renamed from: d, reason: collision with root package name */
    private int f2498d = 16;

    /* renamed from: e, reason: collision with root package name */
    int[] f2499e = new int[16];

    /* renamed from: f, reason: collision with root package name */
    int[] f2500f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    int[] f2501g = new int[16];

    /* renamed from: h, reason: collision with root package name */
    float[] f2502h = new float[16];

    /* renamed from: i, reason: collision with root package name */
    int[] f2503i = new int[16];

    /* renamed from: j, reason: collision with root package name */
    int[] f2504j = new int[16];

    /* renamed from: k, reason: collision with root package name */
    int f2505k = 0;
    int l = -1;
    private final b m;
    protected final c n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(b bVar, c cVar) {
        this.m = bVar;
        this.n = cVar;
        clear();
    }

    private void l(i iVar, int i2) {
        int[] iArr;
        int i3 = iVar.f2482d % this.f2498d;
        int[] iArr2 = this.f2499e;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            iArr2[i3] = i2;
        } else {
            while (true) {
                iArr = this.f2500f;
                if (iArr[i4] == -1) {
                    break;
                } else {
                    i4 = iArr[i4];
                }
            }
            iArr[i4] = i2;
        }
        this.f2500f[i2] = -1;
    }

    private void m(int i2, i iVar, float f2) {
        this.f2501g[i2] = iVar.f2482d;
        this.f2502h[i2] = f2;
        this.f2503i[i2] = -1;
        this.f2504j[i2] = -1;
        iVar.a(this.m);
        iVar.n++;
        this.f2505k++;
    }

    private int n() {
        for (int i2 = 0; i2 < this.f2497c; i2++) {
            if (this.f2501g[i2] == -1) {
                return i2;
            }
        }
        return -1;
    }

    private void o() {
        int i2 = this.f2497c * 2;
        this.f2501g = Arrays.copyOf(this.f2501g, i2);
        this.f2502h = Arrays.copyOf(this.f2502h, i2);
        this.f2503i = Arrays.copyOf(this.f2503i, i2);
        this.f2504j = Arrays.copyOf(this.f2504j, i2);
        this.f2500f = Arrays.copyOf(this.f2500f, i2);
        for (int i3 = this.f2497c; i3 < i2; i3++) {
            this.f2501g[i3] = -1;
            this.f2500f[i3] = -1;
        }
        this.f2497c = i2;
    }

    private void q(int i2, i iVar, float f2) {
        int n = n();
        m(n, iVar, f2);
        if (i2 != -1) {
            this.f2503i[n] = i2;
            int[] iArr = this.f2504j;
            iArr[n] = iArr[i2];
            iArr[i2] = n;
        } else {
            this.f2503i[n] = -1;
            if (this.f2505k > 0) {
                this.f2504j[n] = this.l;
                this.l = n;
            } else {
                this.f2504j[n] = -1;
            }
        }
        int[] iArr2 = this.f2504j;
        if (iArr2[n] != -1) {
            this.f2503i[iArr2[n]] = n;
        }
        l(iVar, n);
    }

    private void r(i iVar) {
        int[] iArr;
        int i2 = iVar.f2482d;
        int i3 = i2 % this.f2498d;
        int[] iArr2 = this.f2499e;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            return;
        }
        if (this.f2501g[i4] == i2) {
            int[] iArr3 = this.f2500f;
            iArr2[i3] = iArr3[i4];
            iArr3[i4] = -1;
            return;
        }
        while (true) {
            iArr = this.f2500f;
            if (iArr[i4] == -1 || this.f2501g[iArr[i4]] == i2) {
                break;
            } else {
                i4 = iArr[i4];
            }
        }
        int i5 = iArr[i4];
        if (i5 == -1 || this.f2501g[i5] != i2) {
            return;
        }
        iArr[i4] = iArr[i5];
        iArr[i5] = -1;
    }

    @Override // c.f.b.b.a
    public int a() {
        return this.f2505k;
    }

    @Override // c.f.b.b.a
    public i b(int i2) {
        int i3 = this.f2505k;
        if (i3 == 0) {
            return null;
        }
        int i4 = this.l;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2 && i4 != -1) {
                return this.n.f2458d[this.f2501g[i4]];
            }
            i4 = this.f2504j[i4];
            if (i4 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // c.f.b.b.a
    public void c() {
        int i2 = this.f2505k;
        int i3 = this.l;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f2502h;
            fArr[i3] = fArr[i3] * (-1.0f);
            i3 = this.f2504j[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    @Override // c.f.b.b.a
    public void clear() {
        int i2 = this.f2505k;
        for (int i3 = 0; i3 < i2; i3++) {
            i b2 = b(i3);
            if (b2 != null) {
                b2.c(this.m);
            }
        }
        for (int i4 = 0; i4 < this.f2497c; i4++) {
            this.f2501g[i4] = -1;
            this.f2500f[i4] = -1;
        }
        for (int i5 = 0; i5 < this.f2498d; i5++) {
            this.f2499e[i5] = -1;
        }
        this.f2505k = 0;
        this.l = -1;
    }

    @Override // c.f.b.b.a
    public float d(int i2) {
        int i3 = this.f2505k;
        int i4 = this.l;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2) {
                return this.f2502h[i4];
            }
            i4 = this.f2504j[i4];
            if (i4 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // c.f.b.b.a
    public void e(i iVar, float f2, boolean z) {
        float f3 = a;
        if (f2 <= (-f3) || f2 >= f3) {
            int p = p(iVar);
            if (p == -1) {
                i(iVar, f2);
                return;
            }
            float[] fArr = this.f2502h;
            fArr[p] = fArr[p] + f2;
            float f4 = fArr[p];
            float f5 = a;
            if (f4 <= (-f5) || fArr[p] >= f5) {
                return;
            }
            fArr[p] = 0.0f;
            j(iVar, z);
        }
    }

    @Override // c.f.b.b.a
    public float f(i iVar) {
        int p = p(iVar);
        if (p != -1) {
            return this.f2502h[p];
        }
        return 0.0f;
    }

    @Override // c.f.b.b.a
    public boolean g(i iVar) {
        return p(iVar) != -1;
    }

    @Override // c.f.b.b.a
    public float h(b bVar, boolean z) {
        float f2 = f(bVar.a);
        j(bVar.a, z);
        j jVar = (j) bVar.f2454e;
        int a2 = jVar.a();
        int i2 = 0;
        int i3 = 0;
        while (i2 < a2) {
            int[] iArr = jVar.f2501g;
            if (iArr[i3] != -1) {
                e(this.n.f2458d[iArr[i3]], jVar.f2502h[i3] * f2, z);
                i2++;
            }
            i3++;
        }
        return f2;
    }

    @Override // c.f.b.b.a
    public void i(i iVar, float f2) {
        float f3 = a;
        if (f2 > (-f3) && f2 < f3) {
            j(iVar, true);
            return;
        }
        if (this.f2505k == 0) {
            m(0, iVar, f2);
            l(iVar, 0);
            this.l = 0;
            return;
        }
        int p = p(iVar);
        if (p != -1) {
            this.f2502h[p] = f2;
            return;
        }
        if (this.f2505k + 1 >= this.f2497c) {
            o();
        }
        int i2 = this.f2505k;
        int i3 = this.l;
        int i4 = -1;
        for (int i5 = 0; i5 < i2; i5++) {
            int[] iArr = this.f2501g;
            int i6 = iArr[i3];
            int i7 = iVar.f2482d;
            if (i6 == i7) {
                this.f2502h[i3] = f2;
                return;
            }
            if (iArr[i3] < i7) {
                i4 = i3;
            }
            i3 = this.f2504j[i3];
            if (i3 == -1) {
                break;
            }
        }
        q(i4, iVar, f2);
    }

    @Override // c.f.b.b.a
    public float j(i iVar, boolean z) {
        int p = p(iVar);
        if (p == -1) {
            return 0.0f;
        }
        r(iVar);
        float f2 = this.f2502h[p];
        if (this.l == p) {
            this.l = this.f2504j[p];
        }
        this.f2501g[p] = -1;
        int[] iArr = this.f2503i;
        if (iArr[p] != -1) {
            int[] iArr2 = this.f2504j;
            iArr2[iArr[p]] = iArr2[p];
        }
        int[] iArr3 = this.f2504j;
        if (iArr3[p] != -1) {
            iArr[iArr3[p]] = iArr[p];
        }
        this.f2505k--;
        iVar.n--;
        if (z) {
            iVar.c(this.m);
        }
        return f2;
    }

    @Override // c.f.b.b.a
    public void k(float f2) {
        int i2 = this.f2505k;
        int i3 = this.l;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f2502h;
            fArr[i3] = fArr[i3] / f2;
            i3 = this.f2504j[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    public int p(i iVar) {
        int[] iArr;
        if (this.f2505k != 0 && iVar != null) {
            int i2 = iVar.f2482d;
            int i3 = this.f2499e[i2 % this.f2498d];
            if (i3 == -1) {
                return -1;
            }
            if (this.f2501g[i3] == i2) {
                return i3;
            }
            while (true) {
                iArr = this.f2500f;
                if (iArr[i3] == -1 || this.f2501g[iArr[i3]] == i2) {
                    break;
                }
                i3 = iArr[i3];
            }
            if (iArr[i3] != -1 && this.f2501g[iArr[i3]] == i2) {
                return iArr[i3];
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i2 = this.f2505k;
        for (int i3 = 0; i3 < i2; i3++) {
            i b2 = b(i3);
            if (b2 != null) {
                String str2 = str + b2 + " = " + d(i3) + " ";
                int p = p(b2);
                String str3 = str2 + "[p: ";
                String str4 = (this.f2503i[p] != -1 ? str3 + this.n.f2458d[this.f2501g[this.f2503i[p]]] : str3 + "none") + ", n: ";
                str = (this.f2504j[p] != -1 ? str4 + this.n.f2458d[this.f2501g[this.f2504j[p]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
