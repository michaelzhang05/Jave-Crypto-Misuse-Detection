package j$.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import j$.time.chrono.AbstractC2870i;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.InterfaceC2863b;
import j$.time.chrono.InterfaceC2866e;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class ZonedDateTime implements j$.time.temporal.m, ChronoZonedDateTime<h>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* renamed from: a, reason: collision with root package name */
    private final LocalDateTime f31856a;

    /* renamed from: b, reason: collision with root package name */
    private final ZoneOffset f31857b;

    /* renamed from: c, reason: collision with root package name */
    private final ZoneId f31858c;

    private ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f31856a = localDateTime;
        this.f31857b = zoneOffset;
        this.f31858c = zoneId;
    }

    private static ZonedDateTime D(long j8, int i8, ZoneId zoneId) {
        ZoneOffset d8 = zoneId.D().d(Instant.H(j8, i8));
        return new ZonedDateTime(LocalDateTime.P(j8, i8, d8), zoneId, d8);
    }

    public static ZonedDateTime E(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Object requireNonNull;
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        j$.time.zone.f D8 = zoneId.D();
        List g8 = D8.g(localDateTime);
        if (g8.size() != 1) {
            if (g8.size() == 0) {
                j$.time.zone.b f8 = D8.f(localDateTime);
                localDateTime = localDateTime.R(f8.m().m());
                zoneOffset = f8.r();
            } else if (zoneOffset == null || !g8.contains(zoneOffset)) {
                requireNonNull = Objects.requireNonNull((ZoneOffset) g8.get(0), TypedValues.CycleType.S_WAVE_OFFSET);
            }
            return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
        }
        requireNonNull = g8.get(0);
        zoneOffset = (ZoneOffset) requireNonNull;
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZonedDateTime G(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.f31843c;
        h hVar = h.f31979d;
        LocalDateTime O8 = LocalDateTime.O(h.P(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.T(objectInput));
        ZoneOffset O9 = ZoneOffset.O(objectInput);
        ZoneId zoneId = (ZoneId) s.a(objectInput);
        Objects.requireNonNull(O8, "localDateTime");
        Objects.requireNonNull(O9, TypedValues.CycleType.S_WAVE_OFFSET);
        Objects.requireNonNull(zoneId, "zone");
        if (!(zoneId instanceof ZoneOffset) || O9.equals(zoneId)) {
            return new ZonedDateTime(O8, zoneId, O9);
        }
        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
    }

    public static ZonedDateTime now() {
        String id = TimeZone.getDefault().getID();
        Objects.requireNonNull(id, "zoneId");
        Map map = ZoneId.f31849a;
        Objects.requireNonNull(map, "aliasMap");
        Object obj = (String) map.get(id);
        if (obj == null) {
            obj = Objects.requireNonNull(id, "defaultObj");
        }
        a aVar = new a(ZoneId.of((String) obj));
        Objects.requireNonNull(aVar, "clock");
        return ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), aVar.c());
    }

    public static ZonedDateTime now(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        a aVar = zoneId == ZoneOffset.UTC ? a.f31859b : new a(zoneId);
        Objects.requireNonNull(aVar, "clock");
        aVar.getClass();
        return ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), aVar.c());
    }

    public static ZonedDateTime of(int i8, int i9, int i10, int i11, int i12, int i13, int i14, ZoneId zoneId) {
        return E(LocalDateTime.N(i8, i9, i10, i11, i12, i13, i14), zoneId, null);
    }

    public static ZonedDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return D(instant.E(), instant.F(), zoneId);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 6, this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long C() {
        return AbstractC2870i.o(this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime e(long j8, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (ZonedDateTime) uVar.j(this, j8);
        }
        j$.time.temporal.b bVar = (j$.time.temporal.b) uVar;
        int compareTo = bVar.compareTo(j$.time.temporal.b.DAYS);
        ZoneOffset zoneOffset = this.f31857b;
        ZoneId zoneId = this.f31858c;
        LocalDateTime localDateTime = this.f31856a;
        if (compareTo >= 0 && bVar != j$.time.temporal.b.FOREVER) {
            return E(localDateTime.e(j8, uVar), zoneId, zoneOffset);
        }
        LocalDateTime e8 = localDateTime.e(j8, uVar);
        Objects.requireNonNull(e8, "localDateTime");
        Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId.D().g(e8).contains(zoneOffset)) {
            return new ZonedDateTime(e8, zoneId, zoneOffset);
        }
        e8.getClass();
        return D(AbstractC2870i.n(e8, zoneOffset), e8.H(), zoneId);
    }

    public final LocalDateTime H() {
        return this.f31856a;
    }

    @Override // j$.time.temporal.m
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime l(h hVar) {
        return E(LocalDateTime.O(hVar, this.f31856a.b()), this.f31858c, this.f31857b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void J(DataOutput dataOutput) {
        this.f31856a.X(dataOutput);
        this.f31857b.P(dataOutput);
        this.f31858c.H(dataOutput);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.m a() {
        return ((h) c()).a();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final k b() {
        return this.f31856a.b();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC2863b c() {
        return this.f31856a.T();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j8, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (ZonedDateTime) rVar.r(this, j8);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i8 = y.f32053a[aVar.ordinal()];
        LocalDateTime localDateTime = this.f31856a;
        ZoneId zoneId = this.f31858c;
        if (i8 == 1) {
            return D(j8, localDateTime.H(), zoneId);
        }
        ZoneOffset zoneOffset = this.f31857b;
        if (i8 != 2) {
            return E(localDateTime.d(j8, rVar), zoneId, zoneOffset);
        }
        ZoneOffset M8 = ZoneOffset.M(aVar.z(j8));
        return (M8.equals(zoneOffset) || !zoneId.D().g(localDateTime).contains(M8)) ? this : new ZonedDateTime(localDateTime, zoneId, M8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedDateTime)) {
            return false;
        }
        ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
        return this.f31856a.equals(zonedDateTime.f31856a) && this.f31857b.equals(zonedDateTime.f31857b) && this.f31858c.equals(zonedDateTime.f31858c);
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return (rVar instanceof j$.time.temporal.a) || (rVar != null && rVar.m(this));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset g() {
        return this.f31857b;
    }

    public int getDayOfMonth() {
        return this.f31856a.F();
    }

    public int getMonthValue() {
        return this.f31856a.G();
    }

    public int getYear() {
        return this.f31856a.J();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime h(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f31858c.equals(zoneId) ? this : E(this.f31856a, zoneId, this.f31857b);
    }

    public final int hashCode() {
        return (this.f31856a.hashCode() ^ this.f31857b.hashCode()) ^ Integer.rotateLeft(this.f31858c.hashCode(), 3);
    }

    @Override // j$.time.temporal.o
    public final int j(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return AbstractC2870i.e(this, rVar);
        }
        int i8 = y.f32053a[((j$.time.temporal.a) rVar).ordinal()];
        if (i8 != 1) {
            return i8 != 2 ? this.f31856a.j(rVar) : this.f31857b.J();
        }
        throw new RuntimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? (rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) rVar).j() : this.f31856a.m(rVar) : rVar.u(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId p() {
        return this.f31858c;
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.l(this);
        }
        int i8 = y.f32053a[((j$.time.temporal.a) rVar).ordinal()];
        return i8 != 1 ? i8 != 2 ? this.f31856a.r(rVar) : this.f31857b.J() : AbstractC2870i.o(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.H(C(), b().I());
    }

    public final String toString() {
        String localDateTime = this.f31856a.toString();
        ZoneOffset zoneOffset = this.f31857b;
        String str = localDateTime + zoneOffset.toString();
        ZoneId zoneId = this.f31858c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.n.f() ? this.f31856a.T() : AbstractC2870i.l(this, tVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        return AbstractC2870i.d(this, chronoZonedDateTime);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC2866e x() {
        return this.f31856a;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m z(long j8, j$.time.temporal.u uVar) {
        return j8 == Long.MIN_VALUE ? e(Long.MAX_VALUE, uVar).e(1L, uVar) : e(-j8, uVar);
    }
}
