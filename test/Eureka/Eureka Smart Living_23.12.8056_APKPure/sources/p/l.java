package p;

import p.e;
import q.b;

/* loaded from: classes.dex */
public abstract class l extends j {

    /* renamed from: y0, reason: collision with root package name */
    private int f8734y0 = 0;

    /* renamed from: z0, reason: collision with root package name */
    private int f8735z0 = 0;
    private int A0 = 0;
    private int B0 = 0;
    private int C0 = 0;
    private int D0 = 0;
    private int E0 = 0;
    private int F0 = 0;
    private boolean G0 = false;
    private int H0 = 0;
    private int I0 = 0;
    protected b.a J0 = new b.a();
    b.InterfaceC0132b K0 = null;

    public void K0(boolean z5) {
        int i6 = this.C0;
        if (i6 > 0 || this.D0 > 0) {
            if (z5) {
                this.E0 = this.D0;
                this.F0 = i6;
            } else {
                this.E0 = i6;
                this.F0 = this.D0;
            }
        }
    }

    public void L0() {
        for (int i6 = 0; i6 < this.f8732x0; i6++) {
            e eVar = this.f8731w0[i6];
            if (eVar != null) {
                eVar.q0(true);
            }
        }
    }

    public int M0() {
        return this.I0;
    }

    public int N0() {
        return this.H0;
    }

    public int O0() {
        return this.f8735z0;
    }

    public int P0() {
        return this.E0;
    }

    public int Q0() {
        return this.F0;
    }

    public int R0() {
        return this.f8734y0;
    }

    public abstract void S0(int i6, int i7, int i8, int i9);

    /* JADX INFO: Access modifiers changed from: protected */
    public void T0(e eVar, e.b bVar, int i6, e.b bVar2, int i7) {
        while (this.K0 == null && G() != null) {
            this.K0 = ((f) G()).U0();
        }
        b.a aVar = this.J0;
        aVar.f8897a = bVar;
        aVar.f8898b = bVar2;
        aVar.f8899c = i6;
        aVar.f8900d = i7;
        this.K0.b(eVar, aVar);
        eVar.E0(this.J0.f8901e);
        eVar.h0(this.J0.f8902f);
        eVar.g0(this.J0.f8904h);
        eVar.b0(this.J0.f8903g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean U0() {
        e eVar = this.N;
        b.InterfaceC0132b U0 = eVar != null ? ((f) eVar).U0() : null;
        if (U0 == null) {
            return false;
        }
        int i6 = 0;
        while (true) {
            if (i6 >= this.f8732x0) {
                return true;
            }
            e eVar2 = this.f8731w0[i6];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b s5 = eVar2.s(0);
                e.b s6 = eVar2.s(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (!(s5 == bVar && eVar2.f8663l != 1 && s6 == bVar && eVar2.f8665m != 1)) {
                    if (s5 == bVar) {
                        s5 = e.b.WRAP_CONTENT;
                    }
                    if (s6 == bVar) {
                        s6 = e.b.WRAP_CONTENT;
                    }
                    b.a aVar = this.J0;
                    aVar.f8897a = s5;
                    aVar.f8898b = s6;
                    aVar.f8899c = eVar2.P();
                    this.J0.f8900d = eVar2.v();
                    U0.b(eVar2, this.J0);
                    eVar2.E0(this.J0.f8901e);
                    eVar2.h0(this.J0.f8902f);
                    eVar2.b0(this.J0.f8903g);
                }
            }
            i6++;
        }
    }

    public boolean V0() {
        return this.G0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void W0(boolean z5) {
        this.G0 = z5;
    }

    public void X0(int i6, int i7) {
        this.H0 = i6;
        this.I0 = i7;
    }

    public void Y0(int i6) {
        this.A0 = i6;
        this.f8734y0 = i6;
        this.B0 = i6;
        this.f8735z0 = i6;
        this.C0 = i6;
        this.D0 = i6;
    }

    public void Z0(int i6) {
        this.f8735z0 = i6;
    }

    public void a1(int i6) {
        this.D0 = i6;
    }

    @Override // p.j, p.i
    public void b(f fVar) {
        L0();
    }

    public void b1(int i6) {
        this.A0 = i6;
        this.E0 = i6;
    }

    public void c1(int i6) {
        this.B0 = i6;
        this.F0 = i6;
    }

    public void d1(int i6) {
        this.C0 = i6;
        this.E0 = i6;
        this.F0 = i6;
    }

    public void e1(int i6) {
        this.f8734y0 = i6;
    }
}
