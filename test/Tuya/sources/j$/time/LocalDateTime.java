package j$.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import j$.time.chrono.AbstractC2870i;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.InterfaceC2863b;
import j$.time.chrono.InterfaceC2866e;
import j$.time.format.DateTimeFormatter;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class LocalDateTime implements j$.time.temporal.m, j$.time.temporal.p, InterfaceC2866e, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final LocalDateTime f31843c = O(h.f31979d, k.f31987e);

    /* renamed from: d, reason: collision with root package name */
    public static final LocalDateTime f31844d = O(h.f31980e, k.f31988f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* renamed from: a, reason: collision with root package name */
    private final h f31845a;

    /* renamed from: b, reason: collision with root package name */
    private final k f31846b;

    private LocalDateTime(h hVar, k kVar) {
        this.f31845a = hVar;
        this.f31846b = kVar;
    }

    private int D(LocalDateTime localDateTime) {
        int D8 = this.f31845a.D(localDateTime.f31845a);
        return D8 == 0 ? this.f31846b.compareTo(localDateTime.f31846b) : D8;
    }

    public static LocalDateTime E(j$.time.temporal.o oVar) {
        if (oVar instanceof LocalDateTime) {
            return (LocalDateTime) oVar;
        }
        if (oVar instanceof ZonedDateTime) {
            return ((ZonedDateTime) oVar).H();
        }
        if (oVar instanceof OffsetDateTime) {
            return ((OffsetDateTime) oVar).toLocalDateTime();
        }
        try {
            return new LocalDateTime(h.F(oVar), k.F(oVar));
        } catch (c e8) {
            throw new RuntimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + oVar + " of type " + oVar.getClass().getName(), e8);
        }
    }

    public static LocalDateTime M(int i8) {
        return new LocalDateTime(h.P(i8, 12, 31), k.K(0));
    }

    public static LocalDateTime N(int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        return new LocalDateTime(h.P(i8, i9, i10), k.L(i11, i12, i13, i14));
    }

    public static LocalDateTime O(h hVar, k kVar) {
        Objects.requireNonNull(hVar, "date");
        Objects.requireNonNull(kVar, "time");
        return new LocalDateTime(hVar, kVar);
    }

    public static LocalDateTime P(long j8, int i8, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
        long j9 = i8;
        j$.time.temporal.a.NANO_OF_SECOND.D(j9);
        return new LocalDateTime(h.R(j$.com.android.tools.r8.a.k(j8 + zoneOffset.J(), 86400)), k.M((((int) j$.com.android.tools.r8.a.j(r5, r7)) * C.NANOS_PER_SECOND) + j9));
    }

    private LocalDateTime S(h hVar, long j8, long j9, long j10, long j11) {
        long j12 = j8 | j9 | j10 | j11;
        k kVar = this.f31846b;
        if (j12 == 0) {
            return W(hVar, kVar);
        }
        long j13 = j8 / 24;
        long j14 = j13 + (j9 / 1440) + (j10 / 86400) + (j11 / 86400000000000L);
        long j15 = 1;
        long j16 = ((j8 % 24) * 3600000000000L) + ((j9 % 1440) * 60000000000L) + ((j10 % 86400) * C.NANOS_PER_SECOND) + (j11 % 86400000000000L);
        long U7 = kVar.U();
        long j17 = (j16 * j15) + U7;
        long k8 = j$.com.android.tools.r8.a.k(j17, 86400000000000L) + (j14 * j15);
        long j18 = j$.com.android.tools.r8.a.j(j17, 86400000000000L);
        if (j18 != U7) {
            kVar = k.M(j18);
        }
        return W(hVar.T(k8), kVar);
    }

    private LocalDateTime W(h hVar, k kVar) {
        return (this.f31845a == hVar && this.f31846b == kVar) ? this : new LocalDateTime(hVar, kVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 5, this);
    }

    public final int F() {
        return this.f31845a.H();
    }

    public final int G() {
        return this.f31845a.K();
    }

    public final int H() {
        return this.f31846b.I();
    }

    public final int I() {
        return this.f31846b.J();
    }

    public final int J() {
        return this.f31845a.L();
    }

    public final boolean K(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return D(localDateTime) > 0;
        }
        long s8 = this.f31845a.s();
        long s9 = localDateTime.f31845a.s();
        return s8 > s9 || (s8 == s9 && this.f31846b.U() > localDateTime.f31846b.U());
    }

    public final boolean L(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return D(localDateTime) < 0;
        }
        long s8 = this.f31845a.s();
        long s9 = localDateTime.f31845a.s();
        return s8 < s9 || (s8 == s9 && this.f31846b.U() < localDateTime.f31846b.U());
    }

    @Override // j$.time.temporal.m
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime e(long j8, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (LocalDateTime) uVar.j(this, j8);
        }
        int i8 = i.f31984a[((j$.time.temporal.b) uVar).ordinal()];
        k kVar = this.f31846b;
        h hVar = this.f31845a;
        switch (i8) {
            case 1:
                return S(this.f31845a, 0L, 0L, 0L, j8);
            case 2:
                LocalDateTime W7 = W(hVar.T(j8 / 86400000000L), kVar);
                return W7.S(W7.f31845a, 0L, 0L, 0L, (j8 % 86400000000L) * 1000);
            case 3:
                LocalDateTime W8 = W(hVar.T(j8 / 86400000), kVar);
                return W8.S(W8.f31845a, 0L, 0L, 0L, (j8 % 86400000) * 1000000);
            case 4:
                return R(j8);
            case 5:
                return S(this.f31845a, 0L, j8, 0L, 0L);
            case 6:
                return S(this.f31845a, j8, 0L, 0L, 0L);
            case 7:
                LocalDateTime W9 = W(hVar.T(j8 / 256), kVar);
                return W9.S(W9.f31845a, (j8 % 256) * 12, 0L, 0L, 0L);
            default:
                return W(hVar.e(j8, uVar), kVar);
        }
    }

    public final LocalDateTime R(long j8) {
        return S(this.f31845a, 0L, 0L, j8, 0L);
    }

    public final h T() {
        return this.f31845a;
    }

    @Override // j$.time.temporal.m
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j8, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (LocalDateTime) rVar.r(this, j8);
        }
        boolean E8 = ((j$.time.temporal.a) rVar).E();
        k kVar = this.f31846b;
        h hVar = this.f31845a;
        return E8 ? W(hVar, kVar.d(j8, rVar)) : W(hVar.d(j8, rVar), kVar);
    }

    public final LocalDateTime V(h hVar) {
        return W(hVar, this.f31846b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void X(DataOutput dataOutput) {
        this.f31845a.b0(dataOutput);
        this.f31846b.Y(dataOutput);
    }

    @Override // j$.time.chrono.InterfaceC2866e
    public final j$.time.chrono.m a() {
        return ((h) c()).a();
    }

    @Override // j$.time.chrono.InterfaceC2866e
    public final k b() {
        return this.f31846b;
    }

    @Override // j$.time.chrono.InterfaceC2866e
    public final InterfaceC2863b c() {
        return this.f31845a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        return this.f31845a.equals(localDateTime.f31845a) && this.f31846b.equals(localDateTime.f31846b);
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar != null && rVar.m(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        return aVar.v() || aVar.E();
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    public final int hashCode() {
        return this.f31845a.hashCode() ^ this.f31846b.hashCode();
    }

    @Override // j$.time.temporal.o
    public final int j(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) rVar).E() ? this.f31846b.j(rVar) : this.f31845a.j(rVar) : j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m l(h hVar) {
        return W(hVar, this.f31846b);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.u(this);
        }
        if (!((j$.time.temporal.a) rVar).E()) {
            return this.f31845a.m(rVar);
        }
        k kVar = this.f31846b;
        kVar.getClass();
        return j$.time.temporal.n.d(kVar, rVar);
    }

    @Override // j$.time.chrono.InterfaceC2866e
    public final ChronoZonedDateTime o(ZoneOffset zoneOffset) {
        return ZonedDateTime.E(this, zoneOffset, null);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) rVar).E() ? this.f31846b.r(rVar) : this.f31845a.r(rVar) : rVar.l(this);
    }

    public final String toString() {
        return this.f31845a.toString() + ExifInterface.GPS_DIRECTION_TRUE + this.f31846b.toString();
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.n.f() ? this.f31845a : AbstractC2870i.k(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m v(j$.time.temporal.m mVar) {
        return mVar.d(((h) c()).s(), j$.time.temporal.a.EPOCH_DAY).d(b().U(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // java.lang.Comparable
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC2866e interfaceC2866e) {
        return interfaceC2866e instanceof LocalDateTime ? D((LocalDateTime) interfaceC2866e) : AbstractC2870i.c(this, interfaceC2866e);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m z(long j8, j$.time.temporal.u uVar) {
        return j8 == Long.MIN_VALUE ? e(Long.MAX_VALUE, uVar).e(1L, uVar) : e(-j8, uVar);
    }
}
