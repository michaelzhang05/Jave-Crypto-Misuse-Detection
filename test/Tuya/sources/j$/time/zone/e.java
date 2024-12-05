package j$.time.zone;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.t;
import j$.time.k;
import j$.time.m;
import j$.time.temporal.p;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* renamed from: a, reason: collision with root package name */
    private final m f32062a;

    /* renamed from: b, reason: collision with root package name */
    private final byte f32063b;

    /* renamed from: c, reason: collision with root package name */
    private final j$.time.e f32064c;

    /* renamed from: d, reason: collision with root package name */
    private final k f32065d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f32066e;

    /* renamed from: f, reason: collision with root package name */
    private final d f32067f;

    /* renamed from: g, reason: collision with root package name */
    private final ZoneOffset f32068g;

    /* renamed from: h, reason: collision with root package name */
    private final ZoneOffset f32069h;

    /* renamed from: i, reason: collision with root package name */
    private final ZoneOffset f32070i;

    e(m mVar, int i8, j$.time.e eVar, k kVar, boolean z8, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f32062a = mVar;
        this.f32063b = (byte) i8;
        this.f32064c = eVar;
        this.f32065d = kVar;
        this.f32066e = z8;
        this.f32067f = dVar;
        this.f32068g = zoneOffset;
        this.f32069h = zoneOffset2;
        this.f32070i = zoneOffset3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e b(DataInput dataInput) {
        int readInt = dataInput.readInt();
        m G8 = m.G(readInt >>> 28);
        int i8 = ((264241152 & readInt) >>> 22) - 32;
        int i9 = (3670016 & readInt) >>> 19;
        j$.time.e D8 = i9 == 0 ? null : j$.time.e.D(i9);
        int i10 = (507904 & readInt) >>> 14;
        d dVar = d.values()[(readInt & 12288) >>> 12];
        int i11 = (readInt & 4080) >>> 4;
        int i12 = (readInt & 12) >>> 2;
        int i13 = readInt & 3;
        k N8 = i10 == 31 ? k.N(dataInput.readInt()) : k.K(i10 % 24);
        ZoneOffset M8 = ZoneOffset.M(i11 == 255 ? dataInput.readInt() : (i11 - 128) * TypedValues.Custom.TYPE_INT);
        ZoneOffset M9 = i12 == 3 ? ZoneOffset.M(dataInput.readInt()) : ZoneOffset.M((i12 * 1800) + M8.J());
        ZoneOffset M10 = i13 == 3 ? ZoneOffset.M(dataInput.readInt()) : ZoneOffset.M((i13 * 1800) + M8.J());
        boolean z8 = i10 == 24;
        Objects.requireNonNull(G8, "month");
        Objects.requireNonNull(N8, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        Objects.requireNonNull(M8, "standardOffset");
        Objects.requireNonNull(M9, "offsetBefore");
        Objects.requireNonNull(M10, "offsetAfter");
        if (i8 < -28 || i8 > 31 || i8 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z8 && !N8.equals(k.f31989g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (N8.I() == 0) {
            return new e(G8, i8, D8, N8, z8, dVar, M8, M9, M10);
        }
        throw new IllegalArgumentException("Time's nano-of-second must be zero");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final b a(int i8) {
        j$.time.h Q8;
        p pVar;
        int J8;
        ZoneOffset zoneOffset;
        j$.time.e eVar = this.f32064c;
        m mVar = this.f32062a;
        byte b8 = this.f32063b;
        if (b8 < 0) {
            t.f31909d.getClass();
            Q8 = j$.time.h.Q(i8, mVar, mVar.E(t.m(i8)) + 1 + b8);
            if (eVar != null) {
                final int value = eVar.getValue();
                final int i9 = 1;
                pVar = new p() { // from class: j$.time.temporal.q
                    @Override // j$.time.temporal.p
                    public final m v(m mVar2) {
                        switch (i9) {
                            case 0:
                                int j8 = mVar2.j(a.DAY_OF_WEEK);
                                int i10 = value;
                                if (j8 == i10) {
                                    return mVar2;
                                }
                                return mVar2.e(j8 - i10 >= 0 ? 7 - r0 : -r0, b.DAYS);
                            default:
                                int j9 = mVar2.j(a.DAY_OF_WEEK);
                                int i11 = value;
                                if (j9 == i11) {
                                    return mVar2;
                                }
                                return mVar2.z(i11 - j9 >= 0 ? 7 - r1 : -r1, b.DAYS);
                        }
                    }
                };
                Q8 = Q8.l(pVar);
            }
        } else {
            Q8 = j$.time.h.Q(i8, mVar, b8);
            if (eVar != null) {
                final int value2 = eVar.getValue();
                final int i10 = 0;
                pVar = new p() { // from class: j$.time.temporal.q
                    @Override // j$.time.temporal.p
                    public final m v(m mVar2) {
                        switch (i10) {
                            case 0:
                                int j8 = mVar2.j(a.DAY_OF_WEEK);
                                int i102 = value2;
                                if (j8 == i102) {
                                    return mVar2;
                                }
                                return mVar2.e(j8 - i102 >= 0 ? 7 - r0 : -r0, b.DAYS);
                            default:
                                int j9 = mVar2.j(a.DAY_OF_WEEK);
                                int i11 = value2;
                                if (j9 == i11) {
                                    return mVar2;
                                }
                                return mVar2.z(i11 - j9 >= 0 ? 7 - r1 : -r1, b.DAYS);
                        }
                    }
                };
                Q8 = Q8.l(pVar);
            }
        }
        if (this.f32066e) {
            Q8 = Q8.T(1L);
        }
        LocalDateTime O8 = LocalDateTime.O(Q8, this.f32065d);
        d dVar = this.f32067f;
        dVar.getClass();
        int i11 = c.f32060a[dVar.ordinal()];
        ZoneOffset zoneOffset2 = this.f32069h;
        if (i11 != 1) {
            if (i11 == 2) {
                J8 = zoneOffset2.J();
                zoneOffset = this.f32068g;
            }
            return new b(O8, zoneOffset2, this.f32070i);
        }
        J8 = zoneOffset2.J();
        zoneOffset = ZoneOffset.UTC;
        O8 = O8.R(J8 - zoneOffset.J());
        return new b(O8, zoneOffset2, this.f32070i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(DataOutput dataOutput) {
        k kVar = this.f32065d;
        boolean z8 = this.f32066e;
        int V7 = z8 ? 86400 : kVar.V();
        int J8 = this.f32068g.J();
        ZoneOffset zoneOffset = this.f32069h;
        int J9 = zoneOffset.J() - J8;
        ZoneOffset zoneOffset2 = this.f32070i;
        int J10 = zoneOffset2.J() - J8;
        int H8 = V7 % 3600 == 0 ? z8 ? 24 : kVar.H() : 31;
        int i8 = J8 % TypedValues.Custom.TYPE_INT == 0 ? (J8 / TypedValues.Custom.TYPE_INT) + 128 : 255;
        int i9 = (J9 == 0 || J9 == 1800 || J9 == 3600) ? J9 / 1800 : 3;
        int i10 = (J10 == 0 || J10 == 1800 || J10 == 3600) ? J10 / 1800 : 3;
        j$.time.e eVar = this.f32064c;
        dataOutput.writeInt((this.f32062a.getValue() << 28) + ((this.f32063b + 32) << 22) + ((eVar == null ? 0 : eVar.getValue()) << 19) + (H8 << 14) + (this.f32067f.ordinal() << 12) + (i8 << 4) + (i9 << 2) + i10);
        if (H8 == 31) {
            dataOutput.writeInt(V7);
        }
        if (i8 == 255) {
            dataOutput.writeInt(J8);
        }
        if (i9 == 3) {
            dataOutput.writeInt(zoneOffset.J());
        }
        if (i10 == 3) {
            dataOutput.writeInt(zoneOffset2.J());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f32062a == eVar.f32062a && this.f32063b == eVar.f32063b && this.f32064c == eVar.f32064c && this.f32067f == eVar.f32067f && this.f32065d.equals(eVar.f32065d) && this.f32066e == eVar.f32066e && this.f32068g.equals(eVar.f32068g) && this.f32069h.equals(eVar.f32069h) && this.f32070i.equals(eVar.f32070i);
    }

    public final int hashCode() {
        int V7 = ((this.f32065d.V() + (this.f32066e ? 1 : 0)) << 15) + (this.f32062a.ordinal() << 11) + ((this.f32063b + 32) << 5);
        j$.time.e eVar = this.f32064c;
        return ((this.f32068g.hashCode() ^ (this.f32067f.ordinal() + (V7 + ((eVar == null ? 7 : eVar.ordinal()) << 2)))) ^ this.f32069h.hashCode()) ^ this.f32070i.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TransitionRule["
            r0.<init>(r1)
            j$.time.ZoneOffset r1 = r6.f32069h
            j$.time.ZoneOffset r2 = r6.f32070i
            int r3 = r1.compareTo(r2)
            if (r3 <= 0) goto L14
            java.lang.String r3 = "Gap "
            goto L16
        L14:
            java.lang.String r3 = "Overlap "
        L16:
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = " to "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ", "
            r0.append(r1)
            r1 = 32
            j$.time.m r2 = r6.f32062a
            byte r3 = r6.f32063b
            j$.time.e r4 = r6.f32064c
            if (r4 == 0) goto L6d
            r5 = -1
            if (r3 != r5) goto L4a
            java.lang.String r1 = r4.name()
            r0.append(r1)
            java.lang.String r1 = " on or before last day of "
        L3f:
            r0.append(r1)
            java.lang.String r1 = r2.name()
            r0.append(r1)
            goto L7a
        L4a:
            if (r3 >= 0) goto L61
            java.lang.String r1 = r4.name()
            r0.append(r1)
            java.lang.String r1 = " on or before last day minus "
            r0.append(r1)
            int r1 = -r3
            int r1 = r1 + (-1)
            r0.append(r1)
            java.lang.String r1 = " of "
            goto L3f
        L61:
            java.lang.String r4 = r4.name()
            r0.append(r4)
            java.lang.String r4 = " on or after "
            r0.append(r4)
        L6d:
            java.lang.String r2 = r2.name()
            r0.append(r2)
            r0.append(r1)
            r0.append(r3)
        L7a:
            java.lang.String r1 = " at "
            r0.append(r1)
            boolean r1 = r6.f32066e
            if (r1 == 0) goto L86
            java.lang.String r1 = "24:00"
            goto L8c
        L86:
            j$.time.k r1 = r6.f32065d
            java.lang.String r1 = r1.toString()
        L8c:
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            j$.time.zone.d r1 = r6.f32067f
            r0.append(r1)
            java.lang.String r1 = ", standard offset "
            r0.append(r1)
            j$.time.ZoneOffset r1 = r6.f32068g
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.e.toString():java.lang.String");
    }
}
