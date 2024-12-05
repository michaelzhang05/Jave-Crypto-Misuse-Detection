package p;

import p.d;
import p.e;
import t3.b0;

/* loaded from: classes.dex */
public class h extends e {

    /* renamed from: w0, reason: collision with root package name */
    protected float f8726w0 = -1.0f;

    /* renamed from: x0, reason: collision with root package name */
    protected int f8727x0 = -1;

    /* renamed from: y0, reason: collision with root package name */
    protected int f8728y0 = -1;

    /* renamed from: z0, reason: collision with root package name */
    private d f8729z0 = this.C;
    private int A0 = 0;
    private int B0 = 0;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8730a;

        static {
            int[] iArr = new int[d.b.values().length];
            f8730a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8730a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8730a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8730a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8730a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8730a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8730a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8730a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8730a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public h() {
        this.K.clear();
        this.K.add(this.f8729z0);
        int length = this.J.length;
        for (int i6 = 0; i6 < length; i6++) {
            this.J[i6] = this.f8729z0;
        }
    }

    @Override // p.e
    public void J0(o.d dVar) {
        if (G() == null) {
            return;
        }
        int x5 = dVar.x(this.f8729z0);
        if (this.A0 == 1) {
            F0(x5);
            G0(0);
            h0(G().v());
            E0(0);
            return;
        }
        F0(0);
        G0(x5);
        E0(G().P());
        h0(0);
    }

    public int K0() {
        return this.A0;
    }

    public int L0() {
        return this.f8727x0;
    }

    public int M0() {
        return this.f8728y0;
    }

    public float N0() {
        return this.f8726w0;
    }

    public void O0(int i6) {
        if (i6 > -1) {
            this.f8726w0 = -1.0f;
            this.f8727x0 = i6;
            this.f8728y0 = -1;
        }
    }

    public void P0(int i6) {
        if (i6 > -1) {
            this.f8726w0 = -1.0f;
            this.f8727x0 = -1;
            this.f8728y0 = i6;
        }
    }

    public void Q0(float f6) {
        if (f6 > -1.0f) {
            this.f8726w0 = f6;
            this.f8727x0 = -1;
            this.f8728y0 = -1;
        }
    }

    public void R0(int i6) {
        if (this.A0 == i6) {
            return;
        }
        this.A0 = i6;
        this.K.clear();
        this.f8729z0 = this.A0 == 1 ? this.B : this.C;
        this.K.add(this.f8729z0);
        int length = this.J.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.J[i7] = this.f8729z0;
        }
    }

    @Override // p.e
    public void f(o.d dVar) {
        f fVar = (f) G();
        if (fVar == null) {
            return;
        }
        d m6 = fVar.m(d.b.LEFT);
        d m7 = fVar.m(d.b.RIGHT);
        e eVar = this.N;
        boolean z5 = eVar != null && eVar.M[0] == e.b.WRAP_CONTENT;
        if (this.A0 == 0) {
            m6 = fVar.m(d.b.TOP);
            m7 = fVar.m(d.b.BOTTOM);
            e eVar2 = this.N;
            z5 = eVar2 != null && eVar2.M[1] == e.b.WRAP_CONTENT;
        }
        if (this.f8727x0 != -1) {
            o.i q6 = dVar.q(this.f8729z0);
            dVar.e(q6, dVar.q(m6), this.f8727x0, 8);
            if (z5) {
                dVar.h(dVar.q(m7), q6, 0, 5);
                return;
            }
            return;
        }
        if (this.f8728y0 == -1) {
            if (this.f8726w0 != -1.0f) {
                dVar.d(o.d.s(dVar, dVar.q(this.f8729z0), dVar.q(m7), this.f8726w0));
                return;
            }
            return;
        }
        o.i q7 = dVar.q(this.f8729z0);
        o.i q8 = dVar.q(m7);
        dVar.e(q7, q8, -this.f8728y0, 8);
        if (z5) {
            dVar.h(q7, dVar.q(m6), 0, 5);
            dVar.h(q8, q7, 0, 5);
        }
    }

    @Override // p.e
    public boolean g() {
        return true;
    }

    @Override // p.e
    public d m(d.b bVar) {
        switch (a.f8730a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.A0 == 1) {
                    return this.f8729z0;
                }
                break;
            case 3:
            case 4:
                if (this.A0 == 0) {
                    return this.f8729z0;
                }
                break;
            case b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
