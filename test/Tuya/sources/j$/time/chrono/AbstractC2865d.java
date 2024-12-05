package j$.time.chrono;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.chrono.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2865d implements InterfaceC2863b, j$.time.temporal.m, j$.time.temporal.p, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InterfaceC2863b D(m mVar, j$.time.temporal.m mVar2) {
        InterfaceC2863b interfaceC2863b = (InterfaceC2863b) mVar2;
        AbstractC2862a abstractC2862a = (AbstractC2862a) mVar;
        if (abstractC2862a.equals(interfaceC2863b.a())) {
            return interfaceC2863b;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + abstractC2862a.i() + ", actual: " + interfaceC2863b.a().i());
    }

    @Override // java.lang.Comparable
    /* renamed from: A */
    public final /* synthetic */ int compareTo(InterfaceC2863b interfaceC2863b) {
        return AbstractC2870i.b(this, interfaceC2863b);
    }

    public n E() {
        return a().B(j$.time.temporal.n.a(this, j$.time.temporal.a.ERA));
    }

    @Override // j$.time.temporal.m
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public InterfaceC2863b z(long j8, j$.time.temporal.u uVar) {
        return D(a(), j$.time.temporal.n.b(this, j8, uVar));
    }

    abstract InterfaceC2863b G(long j8);

    abstract InterfaceC2863b H(long j8);

    abstract InterfaceC2863b I(long j8);

    @Override // j$.time.temporal.m
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public InterfaceC2863b l(j$.time.temporal.p pVar) {
        return D(a(), pVar.v(this));
    }

    @Override // j$.time.temporal.m
    public InterfaceC2863b d(long j8, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            throw new RuntimeException(j$.time.d.a("Unsupported field: ", rVar));
        }
        return D(a(), rVar.r(this, j8));
    }

    @Override // j$.time.temporal.m
    public InterfaceC2863b e(long j8, j$.time.temporal.u uVar) {
        boolean z8 = uVar instanceof j$.time.temporal.b;
        if (!z8) {
            if (!z8) {
                return D(a(), uVar.j(this, j8));
            }
            throw new RuntimeException("Unsupported unit: " + uVar);
        }
        switch (AbstractC2864c.f31876a[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return G(j8);
            case 2:
                return G(j$.com.android.tools.r8.a.l(j8, 7));
            case 3:
                return H(j8);
            case 4:
                return I(j8);
            case 5:
                return I(j$.com.android.tools.r8.a.l(j8, 10));
            case 6:
                return I(j$.com.android.tools.r8.a.l(j8, 100));
            case 7:
                return I(j$.com.android.tools.r8.a.l(j8, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.f(r(aVar), j8), (j$.time.temporal.r) aVar);
            default:
                throw new RuntimeException("Unsupported unit: " + uVar);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC2863b) && AbstractC2870i.b(this, (InterfaceC2863b) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC2863b, j$.time.temporal.o
    public /* synthetic */ boolean f(j$.time.temporal.r rVar) {
        return AbstractC2870i.h(this, rVar);
    }

    @Override // j$.time.chrono.InterfaceC2863b
    public int hashCode() {
        long s8 = s();
        return ((AbstractC2862a) a()).hashCode() ^ ((int) (s8 ^ (s8 >>> 32)));
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int j(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public /* synthetic */ j$.time.temporal.w m(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.chrono.InterfaceC2863b
    public long s() {
        return r(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.chrono.InterfaceC2863b
    public InterfaceC2866e t(j$.time.k kVar) {
        return C2868g.F(this, kVar);
    }

    @Override // j$.time.chrono.InterfaceC2863b
    public String toString() {
        long r8 = r(j$.time.temporal.a.YEAR_OF_ERA);
        long r9 = r(j$.time.temporal.a.MONTH_OF_YEAR);
        long r10 = r(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(((AbstractC2862a) a()).i());
        sb.append(" ");
        sb.append(E());
        sb.append(" ");
        sb.append(r8);
        sb.append(r9 < 10 ? "-0" : "-");
        sb.append(r9);
        sb.append(r10 < 10 ? "-0" : "-");
        sb.append(r10);
        return sb.toString();
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ Object u(j$.time.temporal.t tVar) {
        return AbstractC2870i.j(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final /* synthetic */ j$.time.temporal.m v(j$.time.temporal.m mVar) {
        return AbstractC2870i.a(this, mVar);
    }
}
