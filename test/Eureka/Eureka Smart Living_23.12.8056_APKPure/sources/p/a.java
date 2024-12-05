package p;

import p.e;

/* loaded from: classes.dex */
public class a extends j {

    /* renamed from: y0, reason: collision with root package name */
    private int f8598y0 = 0;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f8599z0 = true;
    private int A0 = 0;

    public boolean K0() {
        return this.f8599z0;
    }

    public int L0() {
        return this.f8598y0;
    }

    public int M0() {
        return this.A0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void N0() {
        for (int i6 = 0; i6 < this.f8732x0; i6++) {
            e eVar = this.f8731w0[i6];
            int i7 = this.f8598y0;
            if (i7 == 0 || i7 == 1) {
                eVar.o0(0, true);
            } else if (i7 == 2 || i7 == 3) {
                eVar.o0(1, true);
            }
        }
    }

    public void O0(boolean z5) {
        this.f8599z0 = z5;
    }

    public void P0(int i6) {
        this.f8598y0 = i6;
    }

    public void Q0(int i6) {
        this.A0 = i6;
    }

    @Override // p.e
    public void f(o.d dVar) {
        d[] dVarArr;
        boolean z5;
        o.i iVar;
        d dVar2;
        int i6;
        int i7;
        int i8;
        d[] dVarArr2 = this.J;
        dVarArr2[0] = this.B;
        dVarArr2[2] = this.C;
        dVarArr2[1] = this.D;
        dVarArr2[3] = this.E;
        int i9 = 0;
        while (true) {
            dVarArr = this.J;
            if (i9 >= dVarArr.length) {
                break;
            }
            d dVar3 = dVarArr[i9];
            dVar3.f8628g = dVar.q(dVar3);
            i9++;
        }
        int i10 = this.f8598y0;
        if (i10 < 0 || i10 >= 4) {
            return;
        }
        d dVar4 = dVarArr[i10];
        for (int i11 = 0; i11 < this.f8732x0; i11++) {
            e eVar = this.f8731w0[i11];
            if ((this.f8599z0 || eVar.g()) && ((((i7 = this.f8598y0) == 0 || i7 == 1) && eVar.y() == e.b.MATCH_CONSTRAINT && eVar.B.f8625d != null && eVar.D.f8625d != null) || (((i8 = this.f8598y0) == 2 || i8 == 3) && eVar.M() == e.b.MATCH_CONSTRAINT && eVar.C.f8625d != null && eVar.E.f8625d != null))) {
                z5 = true;
                break;
            }
        }
        z5 = false;
        boolean z6 = this.B.i() || this.D.i();
        boolean z7 = this.C.i() || this.E.i();
        int i12 = !(!z5 && (((i6 = this.f8598y0) == 0 && z6) || ((i6 == 2 && z7) || ((i6 == 1 && z6) || (i6 == 3 && z7))))) ? 4 : 5;
        for (int i13 = 0; i13 < this.f8732x0; i13++) {
            e eVar2 = this.f8731w0[i13];
            if (this.f8599z0 || eVar2.g()) {
                o.i q6 = dVar.q(eVar2.J[this.f8598y0]);
                d[] dVarArr3 = eVar2.J;
                int i14 = this.f8598y0;
                d dVar5 = dVarArr3[i14];
                dVar5.f8628g = q6;
                d dVar6 = dVar5.f8625d;
                int i15 = (dVar6 == null || dVar6.f8623b != this) ? 0 : dVar5.f8626e + 0;
                if (i14 == 0 || i14 == 2) {
                    dVar.i(dVar4.f8628g, q6, this.A0 - i15, z5);
                } else {
                    dVar.g(dVar4.f8628g, q6, this.A0 + i15, z5);
                }
                dVar.e(dVar4.f8628g, q6, this.A0 + i15, i12);
            }
        }
        int i16 = this.f8598y0;
        if (i16 == 0) {
            dVar.e(this.D.f8628g, this.B.f8628g, 0, 8);
            dVar.e(this.B.f8628g, this.N.D.f8628g, 0, 4);
            iVar = this.B.f8628g;
            dVar2 = this.N.B;
        } else if (i16 == 1) {
            dVar.e(this.B.f8628g, this.D.f8628g, 0, 8);
            dVar.e(this.B.f8628g, this.N.B.f8628g, 0, 4);
            iVar = this.B.f8628g;
            dVar2 = this.N.D;
        } else if (i16 == 2) {
            dVar.e(this.E.f8628g, this.C.f8628g, 0, 8);
            dVar.e(this.C.f8628g, this.N.E.f8628g, 0, 4);
            iVar = this.C.f8628g;
            dVar2 = this.N.C;
        } else {
            if (i16 != 3) {
                return;
            }
            dVar.e(this.C.f8628g, this.E.f8628g, 0, 8);
            dVar.e(this.C.f8628g, this.N.C.f8628g, 0, 4);
            iVar = this.C.f8628g;
            dVar2 = this.N.E;
        }
        dVar.e(iVar, dVar2.f8628g, 0, 0);
    }

    @Override // p.e
    public boolean g() {
        return true;
    }

    @Override // p.e
    public String toString() {
        String str = "[Barrier] " + r() + " {";
        for (int i6 = 0; i6 < this.f8732x0; i6++) {
            e eVar = this.f8731w0[i6];
            if (i6 > 0) {
                str = str + ", ";
            }
            str = str + eVar.r();
        }
        return str + "}";
    }
}
