package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class y extends AbstractC3015d {

    /* renamed from: d, reason: collision with root package name */
    static final j$.time.h f33108d = j$.time.h.P(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* renamed from: a, reason: collision with root package name */
    private final transient j$.time.h f33109a;

    /* renamed from: b, reason: collision with root package name */
    private transient z f33110b;

    /* renamed from: c, reason: collision with root package name */
    private transient int f33111c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(j$.time.h hVar) {
        if (hVar.M(f33108d)) {
            throw new RuntimeException("JapaneseDate before Meiji 6 is not supported");
        }
        z i8 = z.i(hVar);
        this.f33110b = i8;
        this.f33111c = (hVar.L() - i8.n().L()) + 1;
        this.f33109a = hVar;
    }

    private y L(j$.time.h hVar) {
        return hVar.equals(this.f33109a) ? this : new y(hVar);
    }

    private y M(z zVar, int i8) {
        w.f33106d.getClass();
        if (!(zVar instanceof z)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int L8 = (zVar.n().L() + i8) - 1;
        if (i8 != 1 && (L8 < -999999999 || L8 > 999999999 || L8 < zVar.n().L() || zVar != z.i(j$.time.h.P(L8, 1, 1)))) {
            throw new RuntimeException("Invalid yearOfEra value");
        }
        return L(this.f33109a.a0(L8));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 4, this);
    }

    @Override // j$.time.chrono.AbstractC3015d
    public final n E() {
        return this.f33110b;
    }

    @Override // j$.time.chrono.AbstractC3015d
    /* renamed from: F */
    public final InterfaceC3013b z(long j8, j$.time.temporal.u uVar) {
        return (y) super.z(j8, uVar);
    }

    @Override // j$.time.chrono.AbstractC3015d
    final InterfaceC3013b G(long j8) {
        return L(this.f33109a.T(j8));
    }

    @Override // j$.time.chrono.AbstractC3015d
    final InterfaceC3013b H(long j8) {
        return L(this.f33109a.U(j8));
    }

    @Override // j$.time.chrono.AbstractC3015d
    final InterfaceC3013b I(long j8) {
        return L(this.f33109a.V(j8));
    }

    @Override // j$.time.chrono.AbstractC3015d
    /* renamed from: J */
    public final InterfaceC3013b l(j$.time.temporal.p pVar) {
        return (y) super.l(pVar);
    }

    @Override // j$.time.chrono.AbstractC3015d, j$.time.temporal.m
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final y d(long j8, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (y) super.d(j8, rVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        if (r(aVar) == j8) {
            return this;
        }
        int[] iArr = x.f33107a;
        int i8 = iArr[aVar.ordinal()];
        j$.time.h hVar = this.f33109a;
        if (i8 == 3 || i8 == 8 || i8 == 9) {
            int a8 = w.f33106d.m(aVar).a(j8, aVar);
            int i9 = iArr[aVar.ordinal()];
            if (i9 == 3) {
                return M(this.f33110b, a8);
            }
            if (i9 == 8) {
                return M(z.y(a8), this.f33111c);
            }
            if (i9 == 9) {
                return L(hVar.a0(a8));
            }
        }
        return L(hVar.d(j8, rVar));
    }

    @Override // j$.time.chrono.InterfaceC3013b
    public final m a() {
        return w.f33106d;
    }

    @Override // j$.time.chrono.AbstractC3015d, j$.time.chrono.InterfaceC3013b, j$.time.temporal.m
    public final InterfaceC3013b e(long j8, j$.time.temporal.u uVar) {
        return (y) super.e(j8, uVar);
    }

    @Override // j$.time.chrono.AbstractC3015d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j8, j$.time.temporal.u uVar) {
        return (y) super.e(j8, uVar);
    }

    @Override // j$.time.chrono.AbstractC3015d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.f33109a.equals(((y) obj).f33109a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC3015d, j$.time.chrono.InterfaceC3013b, j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || rVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || rVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || rVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return rVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) rVar).v() : rVar != null && rVar.m(this);
    }

    @Override // j$.time.chrono.AbstractC3015d, j$.time.chrono.InterfaceC3013b
    public final int hashCode() {
        w.f33106d.getClass();
        return this.f33109a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.AbstractC3015d, j$.time.temporal.m
    public final j$.time.temporal.m l(j$.time.h hVar) {
        return (y) super.l(hVar);
    }

    @Override // j$.time.chrono.AbstractC3015d, j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        int O8;
        long j8;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.u(this);
        }
        if (!f(rVar)) {
            throw new RuntimeException(j$.time.d.a("Unsupported field: ", rVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i8 = x.f33107a[aVar.ordinal()];
        j$.time.h hVar = this.f33109a;
        if (i8 != 1) {
            z zVar = this.f33110b;
            if (i8 != 2) {
                if (i8 != 3) {
                    return w.f33106d.m(aVar);
                }
                int L8 = zVar.n().L();
                z q8 = zVar.q();
                j8 = q8 != null ? (q8.n().L() - L8) + 1 : 999999999 - L8;
                return j$.time.temporal.w.j(1L, j8);
            }
            z q9 = zVar.q();
            O8 = (q9 == null || q9.n().L() != hVar.L()) ? hVar.N() ? 366 : 365 : q9.n().J() - 1;
            if (this.f33111c == 1) {
                O8 -= zVar.n().J() - 1;
            }
        } else {
            O8 = hVar.O();
        }
        j8 = O8;
        return j$.time.temporal.w.j(1L, j8);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.l(this);
        }
        int i8 = x.f33107a[((j$.time.temporal.a) rVar).ordinal()];
        int i9 = this.f33111c;
        z zVar = this.f33110b;
        j$.time.h hVar = this.f33109a;
        switch (i8) {
            case 2:
                return i9 == 1 ? (hVar.J() - zVar.n().J()) + 1 : hVar.J();
            case 3:
                return i9;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new RuntimeException(j$.time.d.a("Unsupported field: ", rVar));
            case 8:
                return zVar.getValue();
            default:
                return hVar.r(rVar);
        }
    }

    @Override // j$.time.chrono.AbstractC3015d, j$.time.chrono.InterfaceC3013b
    public final long s() {
        return this.f33109a.s();
    }

    @Override // j$.time.chrono.AbstractC3015d, j$.time.chrono.InterfaceC3013b
    public final InterfaceC3016e t(j$.time.k kVar) {
        return C3018g.F(this, kVar);
    }

    @Override // j$.time.chrono.AbstractC3015d, j$.time.temporal.m
    public final j$.time.temporal.m z(long j8, j$.time.temporal.u uVar) {
        return (y) super.z(j8, uVar);
    }
}
