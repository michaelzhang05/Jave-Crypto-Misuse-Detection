package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* loaded from: classes2.dex */
public final class r extends AbstractC3015d {
    private static final long serialVersionUID = -5207853542612002020L;

    /* renamed from: a, reason: collision with root package name */
    private final transient p f33098a;

    /* renamed from: b, reason: collision with root package name */
    private final transient int f33099b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f33100c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f33101d;

    private r(p pVar, int i8, int i9, int i10) {
        pVar.z(i8, i9, i10);
        this.f33098a = pVar;
        this.f33099b = i8;
        this.f33100c = i9;
        this.f33101d = i10;
    }

    private r(p pVar, long j8) {
        int[] D8 = pVar.D((int) j8);
        this.f33098a = pVar;
        this.f33099b = D8[0];
        this.f33100c = D8[1];
        this.f33101d = D8[2];
    }

    private int K() {
        return this.f33098a.v(this.f33099b, this.f33100c) + this.f33101d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r L(p pVar, int i8, int i9, int i10) {
        return new r(pVar, i8, i9, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r M(p pVar, long j8) {
        return new r(pVar, j8);
    }

    private r P(int i8, int i9, int i10) {
        p pVar = this.f33098a;
        int E8 = pVar.E(i8, i9);
        if (i10 > E8) {
            i10 = E8;
        }
        return new r(pVar, i8, i9, i10);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 6, this);
    }

    @Override // j$.time.chrono.AbstractC3015d
    public final n E() {
        return s.AH;
    }

    @Override // j$.time.chrono.AbstractC3015d
    /* renamed from: F */
    public final InterfaceC3013b z(long j8, j$.time.temporal.u uVar) {
        return (r) super.z(j8, uVar);
    }

    @Override // j$.time.chrono.AbstractC3015d
    final InterfaceC3013b I(long j8) {
        if (j8 == 0) {
            return this;
        }
        long j9 = this.f33099b + ((int) j8);
        int i8 = (int) j9;
        if (j9 == i8) {
            return P(i8, this.f33100c, this.f33101d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.AbstractC3015d
    /* renamed from: J */
    public final InterfaceC3013b l(j$.time.temporal.p pVar) {
        return (r) super.l(pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC3015d
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final r G(long j8) {
        return new r(this.f33098a, s() + j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC3015d
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final r H(long j8) {
        if (j8 == 0) {
            return this;
        }
        long j9 = (this.f33099b * 12) + (this.f33100c - 1) + j8;
        return P(this.f33098a.r(j$.com.android.tools.r8.a.k(j9, 12L)), ((int) j$.com.android.tools.r8.a.j(j9, 12L)) + 1, this.f33101d);
    }

    @Override // j$.time.chrono.AbstractC3015d, j$.time.temporal.m
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final r d(long j8, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (r) super.d(j8, rVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        p pVar = this.f33098a;
        pVar.H(aVar).b(j8, aVar);
        int i8 = (int) j8;
        int i9 = q.f33097a[aVar.ordinal()];
        int i10 = this.f33101d;
        int i11 = this.f33100c;
        int i12 = this.f33099b;
        switch (i9) {
            case 1:
                return P(i12, i11, i8);
            case 2:
                return G(Math.min(i8, pVar.F(i12)) - K());
            case 3:
                return G((j8 - r(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return G(j8 - (((int) j$.com.android.tools.r8.a.j(s() + 3, 7)) + 1));
            case 5:
                return G(j8 - r(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return G(j8 - r(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new r(pVar, j8);
            case 8:
                return G((j8 - r(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return P(i12, i8, i10);
            case 10:
                return H(j8 - (((i12 * 12) + i11) - 1));
            case 11:
                if (i12 < 1) {
                    i8 = 1 - i8;
                }
                return P(i8, i11, i10);
            case 12:
                return P(i8, i11, i10);
            case 13:
                return P(1 - i12, i11, i10);
            default:
                throw new RuntimeException(j$.time.d.a("Unsupported field: ", rVar));
        }
    }

    @Override // j$.time.chrono.InterfaceC3013b
    public final m a() {
        return this.f33098a;
    }

    @Override // j$.time.chrono.AbstractC3015d, j$.time.chrono.InterfaceC3013b, j$.time.temporal.m
    public final InterfaceC3013b e(long j8, j$.time.temporal.u uVar) {
        return (r) super.e(j8, uVar);
    }

    @Override // j$.time.chrono.AbstractC3015d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j8, j$.time.temporal.u uVar) {
        return (r) super.e(j8, uVar);
    }

    @Override // j$.time.chrono.AbstractC3015d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f33099b == rVar.f33099b && this.f33100c == rVar.f33100c && this.f33101d == rVar.f33101d && this.f33098a.equals(rVar.f33098a);
    }

    @Override // j$.time.chrono.AbstractC3015d, j$.time.chrono.InterfaceC3013b
    public final int hashCode() {
        int hashCode = this.f33098a.i().hashCode();
        int i8 = this.f33099b;
        return (hashCode ^ (i8 & (-2048))) ^ (((i8 << 11) + (this.f33100c << 6)) + this.f33101d);
    }

    @Override // j$.time.chrono.AbstractC3015d, j$.time.temporal.m
    public final j$.time.temporal.m l(j$.time.h hVar) {
        return (r) super.l(hVar);
    }

    @Override // j$.time.chrono.AbstractC3015d, j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        int E8;
        long j8;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.u(this);
        }
        if (!AbstractC3020i.h(this, rVar)) {
            throw new RuntimeException(j$.time.d.a("Unsupported field: ", rVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i8 = q.f33097a[aVar.ordinal()];
        int i9 = this.f33099b;
        p pVar = this.f33098a;
        if (i8 == 1) {
            E8 = pVar.E(i9, this.f33100c);
        } else {
            if (i8 != 2) {
                if (i8 != 3) {
                    return pVar.H(aVar);
                }
                j8 = 5;
                return j$.time.temporal.w.j(1L, j8);
            }
            E8 = pVar.F(i9);
        }
        j8 = E8;
        return j$.time.temporal.w.j(1L, j8);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.l(this);
        }
        int i8 = q.f33097a[((j$.time.temporal.a) rVar).ordinal()];
        int i9 = this.f33100c;
        int i10 = this.f33101d;
        int i11 = this.f33099b;
        switch (i8) {
            case 1:
                return i10;
            case 2:
                return K();
            case 3:
                return ((i10 - 1) / 7) + 1;
            case 4:
                return ((int) j$.com.android.tools.r8.a.j(s() + 3, 7)) + 1;
            case 5:
                return ((i10 - 1) % 7) + 1;
            case 6:
                return ((K() - 1) % 7) + 1;
            case 7:
                return s();
            case 8:
                return ((K() - 1) / 7) + 1;
            case 9:
                return i9;
            case 10:
                return ((i11 * 12) + i9) - 1;
            case 11:
                return i11;
            case 12:
                return i11;
            case 13:
                return i11 <= 1 ? 0 : 1;
            default:
                throw new RuntimeException(j$.time.d.a("Unsupported field: ", rVar));
        }
    }

    @Override // j$.time.chrono.AbstractC3015d, j$.time.chrono.InterfaceC3013b
    public final long s() {
        return this.f33098a.z(this.f33099b, this.f33100c, this.f33101d);
    }

    @Override // j$.time.chrono.AbstractC3015d, j$.time.chrono.InterfaceC3013b
    public final InterfaceC3016e t(j$.time.k kVar) {
        return C3018g.F(this, kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f33098a);
        objectOutput.writeInt(j$.time.temporal.n.a(this, j$.time.temporal.a.YEAR));
        objectOutput.writeByte(j$.time.temporal.n.a(this, j$.time.temporal.a.MONTH_OF_YEAR));
        objectOutput.writeByte(j$.time.temporal.n.a(this, j$.time.temporal.a.DAY_OF_MONTH));
    }

    @Override // j$.time.chrono.AbstractC3015d, j$.time.temporal.m
    public final j$.time.temporal.m z(long j8, j$.time.temporal.u uVar) {
        return (r) super.z(j8, uVar);
    }
}
