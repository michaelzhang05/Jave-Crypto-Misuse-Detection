package j$.time.chrono;

import androidx.exifinterface.media.ExifInterface;
import j$.time.ZoneOffset;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3018g implements InterfaceC3016e, j$.time.temporal.m, j$.time.temporal.p, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* renamed from: a, reason: collision with root package name */
    private final transient InterfaceC3013b f33072a;

    /* renamed from: b, reason: collision with root package name */
    private final transient j$.time.k f33073b;

    private C3018g(InterfaceC3013b interfaceC3013b, j$.time.k kVar) {
        Objects.requireNonNull(interfaceC3013b, "date");
        Objects.requireNonNull(kVar, "time");
        this.f33072a = interfaceC3013b;
        this.f33073b = kVar;
    }

    static C3018g D(m mVar, j$.time.temporal.m mVar2) {
        C3018g c3018g = (C3018g) mVar2;
        AbstractC3012a abstractC3012a = (AbstractC3012a) mVar;
        if (abstractC3012a.equals(c3018g.f33072a.a())) {
            return c3018g;
        }
        throw new ClassCastException("Chronology mismatch, required: " + abstractC3012a.i() + ", actual: " + c3018g.f33072a.a().i());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C3018g F(InterfaceC3013b interfaceC3013b, j$.time.k kVar) {
        return new C3018g(interfaceC3013b, kVar);
    }

    private C3018g I(InterfaceC3013b interfaceC3013b, long j8, long j9, long j10, long j11) {
        long j12 = j8 | j9 | j10 | j11;
        j$.time.k kVar = this.f33073b;
        if (j12 == 0) {
            return K(interfaceC3013b, kVar);
        }
        long j13 = j9 / 1440;
        long j14 = j8 / 24;
        long j15 = (j9 % 1440) * 60000000000L;
        long j16 = ((j8 % 24) * 3600000000000L) + j15 + ((j10 % 86400) * com.mbridge.msdk.playercommon.exoplayer2.C.NANOS_PER_SECOND) + (j11 % 86400000000000L);
        long U8 = kVar.U();
        long j17 = j16 + U8;
        long k8 = j$.com.android.tools.r8.a.k(j17, 86400000000000L) + j14 + j13 + (j10 / 86400) + (j11 / 86400000000000L);
        long j18 = j$.com.android.tools.r8.a.j(j17, 86400000000000L);
        if (j18 != U8) {
            kVar = j$.time.k.M(j18);
        }
        return K(interfaceC3013b.e(k8, (j$.time.temporal.u) j$.time.temporal.b.DAYS), kVar);
    }

    private C3018g K(j$.time.temporal.m mVar, j$.time.k kVar) {
        InterfaceC3013b interfaceC3013b = this.f33072a;
        return (interfaceC3013b == mVar && this.f33073b == kVar) ? this : new C3018g(AbstractC3015d.D(interfaceC3013b.a(), mVar), kVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 2, this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final InterfaceC3016e z(long j8, j$.time.temporal.u uVar) {
        return D(a(), j$.time.temporal.n.b(this, j8, uVar));
    }

    @Override // j$.time.temporal.m
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final C3018g e(long j8, j$.time.temporal.u uVar) {
        boolean z8 = uVar instanceof j$.time.temporal.b;
        InterfaceC3013b interfaceC3013b = this.f33072a;
        if (!z8) {
            return D(interfaceC3013b.a(), uVar.j(this, j8));
        }
        int i8 = AbstractC3017f.f33071a[((j$.time.temporal.b) uVar).ordinal()];
        j$.time.k kVar = this.f33073b;
        switch (i8) {
            case 1:
                return I(this.f33072a, 0L, 0L, 0L, j8);
            case 2:
                C3018g K8 = K(interfaceC3013b.e(j8 / 86400000000L, (j$.time.temporal.u) j$.time.temporal.b.DAYS), kVar);
                return K8.I(K8.f33072a, 0L, 0L, 0L, (j8 % 86400000000L) * 1000);
            case 3:
                C3018g K9 = K(interfaceC3013b.e(j8 / 86400000, (j$.time.temporal.u) j$.time.temporal.b.DAYS), kVar);
                return K9.I(K9.f33072a, 0L, 0L, 0L, (j8 % 86400000) * 1000000);
            case 4:
                return H(j8);
            case 5:
                return I(this.f33072a, 0L, j8, 0L, 0L);
            case 6:
                return I(this.f33072a, j8, 0L, 0L, 0L);
            case 7:
                C3018g K10 = K(interfaceC3013b.e(j8 / 256, (j$.time.temporal.u) j$.time.temporal.b.DAYS), kVar);
                return K10.I(K10.f33072a, (j8 % 256) * 12, 0L, 0L, 0L);
            default:
                return K(interfaceC3013b.e(j8, uVar), kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C3018g H(long j8) {
        return I(this.f33072a, 0L, 0L, j8, 0L);
    }

    @Override // j$.time.temporal.m
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final C3018g d(long j8, j$.time.temporal.r rVar) {
        boolean z8 = rVar instanceof j$.time.temporal.a;
        InterfaceC3013b interfaceC3013b = this.f33072a;
        if (!z8) {
            return D(interfaceC3013b.a(), rVar.r(this, j8));
        }
        boolean E8 = ((j$.time.temporal.a) rVar).E();
        j$.time.k kVar = this.f33073b;
        return E8 ? K(interfaceC3013b, kVar.d(j8, rVar)) : K(interfaceC3013b.d(j8, rVar), kVar);
    }

    @Override // j$.time.chrono.InterfaceC3016e
    public final m a() {
        return this.f33072a.a();
    }

    @Override // j$.time.chrono.InterfaceC3016e
    public final j$.time.k b() {
        return this.f33073b;
    }

    @Override // j$.time.chrono.InterfaceC3016e
    public final InterfaceC3013b c() {
        return this.f33072a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC3016e) && AbstractC3020i.c(this, (InterfaceC3016e) obj) == 0;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar != null && rVar.m(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        return aVar.v() || aVar.E();
    }

    public final int hashCode() {
        return this.f33072a.hashCode() ^ this.f33073b.hashCode();
    }

    @Override // j$.time.temporal.o
    public final int j(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) rVar).E() ? this.f33073b.j(rVar) : this.f33072a.j(rVar) : m(rVar).a(r(rVar), rVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m l(j$.time.h hVar) {
        return K(hVar, this.f33073b);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.u(this);
        }
        if (!((j$.time.temporal.a) rVar).E()) {
            return this.f33072a.m(rVar);
        }
        j$.time.k kVar = this.f33073b;
        kVar.getClass();
        return j$.time.temporal.n.d(kVar, rVar);
    }

    @Override // j$.time.chrono.InterfaceC3016e
    public final ChronoZonedDateTime o(ZoneOffset zoneOffset) {
        return l.F(zoneOffset, null, this);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) rVar).E() ? this.f33073b.r(rVar) : this.f33072a.r(rVar) : rVar.l(this);
    }

    public final String toString() {
        return this.f33072a.toString() + ExifInterface.GPS_DIRECTION_TRUE + this.f33073b.toString();
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ Object u(j$.time.temporal.t tVar) {
        return AbstractC3020i.k(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m v(j$.time.temporal.m mVar) {
        return mVar.d(c().s(), j$.time.temporal.a.EPOCH_DAY).d(b().U(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // java.lang.Comparable
    /* renamed from: w */
    public final /* synthetic */ int compareTo(InterfaceC3016e interfaceC3016e) {
        return AbstractC3020i.c(this, interfaceC3016e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f33072a);
        objectOutput.writeObject(this.f33073b);
    }
}
