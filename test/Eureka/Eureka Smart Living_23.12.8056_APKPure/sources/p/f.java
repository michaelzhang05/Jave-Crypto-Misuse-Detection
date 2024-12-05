package p;

import java.util.ArrayList;
import java.util.Arrays;
import p.e;
import q.b;

/* loaded from: classes.dex */
public class f extends m {
    int C0;
    int D0;
    int E0;
    int F0;

    /* renamed from: x0, reason: collision with root package name */
    q.b f8695x0 = new q.b(this);

    /* renamed from: y0, reason: collision with root package name */
    public q.e f8696y0 = new q.e(this);

    /* renamed from: z0, reason: collision with root package name */
    protected b.InterfaceC0132b f8697z0 = null;
    private boolean A0 = false;
    protected o.d B0 = new o.d();
    int G0 = 0;
    int H0 = 0;
    c[] I0 = new c[4];
    c[] J0 = new c[4];
    public boolean K0 = false;
    public boolean L0 = false;
    public boolean M0 = false;
    public int N0 = 0;
    public int O0 = 0;
    private int P0 = 263;
    public boolean Q0 = false;
    private boolean R0 = false;
    private boolean S0 = false;
    int T0 = 0;

    private void P0(e eVar) {
        int i6 = this.G0 + 1;
        c[] cVarArr = this.J0;
        if (i6 >= cVarArr.length) {
            this.J0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.J0[this.G0] = new c(eVar, 0, a1());
        this.G0++;
    }

    private void Q0(e eVar) {
        int i6 = this.H0 + 1;
        c[] cVarArr = this.I0;
        if (i6 >= cVarArr.length) {
            this.I0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.I0[this.H0] = new c(eVar, 1, a1());
        this.H0++;
    }

    private void e1() {
        this.G0 = 0;
        this.H0 = 0;
    }

    @Override // p.e
    public void I0(boolean z5, boolean z6) {
        super.I0(z5, z6);
        int size = this.f8736w0.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((e) this.f8736w0.get(i6)).I0(z5, z6);
        }
    }

    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [boolean] */
    @Override // p.m
    public void K0() {
        boolean z5;
        ?? r11;
        boolean z6;
        this.S = 0;
        this.T = 0;
        int max = Math.max(0, P());
        int max2 = Math.max(0, v());
        this.R0 = false;
        this.S0 = false;
        boolean z7 = d1(64) || d1(128);
        o.d dVar = this.B0;
        dVar.f8143g = false;
        dVar.f8144h = false;
        if (this.P0 != 0 && z7) {
            dVar.f8144h = true;
        }
        e.b[] bVarArr = this.M;
        e.b bVar = bVarArr[1];
        e.b bVar2 = bVarArr[0];
        ArrayList arrayList = this.f8736w0;
        e.b y5 = y();
        e.b bVar3 = e.b.WRAP_CONTENT;
        boolean z8 = y5 == bVar3 || M() == bVar3;
        e1();
        int size = this.f8736w0.size();
        for (int i6 = 0; i6 < size; i6++) {
            e eVar = (e) this.f8736w0.get(i6);
            if (eVar instanceof m) {
                ((m) eVar).K0();
            }
        }
        int i7 = 0;
        boolean z9 = true;
        boolean z10 = false;
        while (z9) {
            int i8 = i7 + 1;
            try {
                this.B0.D();
                e1();
                l(this.B0);
                for (int i9 = 0; i9 < size; i9++) {
                    ((e) this.f8736w0.get(i9)).l(this.B0);
                }
                z9 = O0(this.B0);
                if (z9) {
                    this.B0.z();
                }
            } catch (Exception e6) {
                e6.printStackTrace();
                System.out.println("EXCEPTION : " + e6);
            }
            o.d dVar2 = this.B0;
            if (z9) {
                i1(dVar2, k.f8733a);
            } else {
                J0(dVar2);
                for (int i10 = 0; i10 < size; i10++) {
                    ((e) this.f8736w0.get(i10)).J0(this.B0);
                }
            }
            if (z8 && i8 < 8 && k.f8733a[2]) {
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < size; i13++) {
                    e eVar2 = (e) this.f8736w0.get(i13);
                    i11 = Math.max(i11, eVar2.S + eVar2.P());
                    i12 = Math.max(i12, eVar2.T + eVar2.v());
                }
                int max3 = Math.max(this.Z, i11);
                int max4 = Math.max(this.f8642a0, i12);
                e.b bVar4 = e.b.WRAP_CONTENT;
                if (bVar2 != bVar4 || P() >= max3) {
                    z5 = false;
                } else {
                    E0(max3);
                    this.M[0] = bVar4;
                    z5 = true;
                    z10 = true;
                }
                if (bVar == bVar4 && v() < max4) {
                    h0(max4);
                    this.M[1] = bVar4;
                    z5 = true;
                    z10 = true;
                }
            } else {
                z5 = false;
            }
            int max5 = Math.max(this.Z, P());
            if (max5 > P()) {
                E0(max5);
                this.M[0] = e.b.FIXED;
                z5 = true;
                z10 = true;
            }
            int max6 = Math.max(this.f8642a0, v());
            if (max6 > v()) {
                h0(max6);
                r11 = 1;
                this.M[1] = e.b.FIXED;
                z5 = true;
                z6 = true;
            } else {
                r11 = 1;
                z6 = z10;
            }
            if (!z6) {
                e.b bVar5 = this.M[0];
                e.b bVar6 = e.b.WRAP_CONTENT;
                if (bVar5 == bVar6 && max > 0 && P() > max) {
                    this.R0 = r11;
                    this.M[0] = e.b.FIXED;
                    E0(max);
                    z5 = true;
                    z6 = true;
                }
                if (this.M[r11] == bVar6 && max2 > 0 && v() > max2) {
                    this.S0 = r11;
                    this.M[r11] = e.b.FIXED;
                    h0(max2);
                    z9 = true;
                    z10 = true;
                    i7 = i8;
                }
            }
            z9 = z5;
            z10 = z6;
            i7 = i8;
        }
        this.f8736w0 = arrayList;
        if (z10) {
            e.b[] bVarArr2 = this.M;
            bVarArr2[0] = bVar2;
            bVarArr2[1] = bVar;
        }
        a0(this.B0.v());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N0(e eVar, int i6) {
        if (i6 == 0) {
            P0(eVar);
        } else if (i6 == 1) {
            Q0(eVar);
        }
    }

    public boolean O0(o.d dVar) {
        f(dVar);
        int size = this.f8736w0.size();
        boolean z5 = false;
        for (int i6 = 0; i6 < size; i6++) {
            e eVar = (e) this.f8736w0.get(i6);
            eVar.o0(0, false);
            eVar.o0(1, false);
            if (eVar instanceof a) {
                z5 = true;
            }
        }
        if (z5) {
            for (int i7 = 0; i7 < size; i7++) {
                e eVar2 = (e) this.f8736w0.get(i7);
                if (eVar2 instanceof a) {
                    ((a) eVar2).N0();
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            e eVar3 = (e) this.f8736w0.get(i8);
            if (eVar3.e()) {
                eVar3.f(dVar);
            }
        }
        for (int i9 = 0; i9 < size; i9++) {
            e eVar4 = (e) this.f8736w0.get(i9);
            if (eVar4 instanceof f) {
                e.b[] bVarArr = eVar4.M;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                e.b bVar3 = e.b.WRAP_CONTENT;
                if (bVar == bVar3) {
                    eVar4.l0(e.b.FIXED);
                }
                if (bVar2 == bVar3) {
                    eVar4.A0(e.b.FIXED);
                }
                eVar4.f(dVar);
                if (bVar == bVar3) {
                    eVar4.l0(bVar);
                }
                if (bVar2 == bVar3) {
                    eVar4.A0(bVar2);
                }
            } else {
                k.a(this, dVar, eVar4);
                if (!eVar4.e()) {
                    eVar4.f(dVar);
                }
            }
        }
        if (this.G0 > 0) {
            b.a(this, dVar, 0);
        }
        if (this.H0 > 0) {
            b.a(this, dVar, 1);
        }
        return true;
    }

    public boolean R0(boolean z5) {
        return this.f8696y0.f(z5);
    }

    public boolean S0(boolean z5) {
        return this.f8696y0.g(z5);
    }

    public boolean T0(boolean z5, int i6) {
        return this.f8696y0.h(z5, i6);
    }

    public b.InterfaceC0132b U0() {
        return this.f8697z0;
    }

    public int V0() {
        return this.P0;
    }

    public boolean W0() {
        return false;
    }

    public void X0() {
        this.f8696y0.j();
    }

    @Override // p.m, p.e
    public void Y() {
        this.B0.D();
        this.C0 = 0;
        this.E0 = 0;
        this.D0 = 0;
        this.F0 = 0;
        this.Q0 = false;
        super.Y();
    }

    public void Y0() {
        this.f8696y0.k();
    }

    public boolean Z0() {
        return this.S0;
    }

    public boolean a1() {
        return this.A0;
    }

    public boolean b1() {
        return this.R0;
    }

    public long c1(int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        this.C0 = i13;
        this.D0 = i14;
        return this.f8695x0.d(this, i6, i13, i14, i7, i8, i9, i10, i11, i12);
    }

    public boolean d1(int i6) {
        return (this.P0 & i6) == i6;
    }

    public void f1(b.InterfaceC0132b interfaceC0132b) {
        this.f8697z0 = interfaceC0132b;
        this.f8696y0.n(interfaceC0132b);
    }

    public void g1(int i6) {
        this.P0 = i6;
        o.d.f8134r = k.b(i6, 256);
    }

    public void h1(boolean z5) {
        this.A0 = z5;
    }

    public void i1(o.d dVar, boolean[] zArr) {
        zArr[2] = false;
        J0(dVar);
        int size = this.f8736w0.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((e) this.f8736w0.get(i6)).J0(dVar);
        }
    }

    public void j1() {
        this.f8695x0.e(this);
    }
}
