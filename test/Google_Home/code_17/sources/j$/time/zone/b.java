package j$.time.zone;

import j$.time.Duration;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC3020i;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* renamed from: a, reason: collision with root package name */
    private final long f33250a;

    /* renamed from: b, reason: collision with root package name */
    private final LocalDateTime f33251b;

    /* renamed from: c, reason: collision with root package name */
    private final ZoneOffset f33252c;

    /* renamed from: d, reason: collision with root package name */
    private final ZoneOffset f33253d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(long j8, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f33250a = j8;
        this.f33251b = LocalDateTime.P(j8, 0, zoneOffset);
        this.f33252c = zoneOffset;
        this.f33253d = zoneOffset2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        localDateTime.getClass();
        this.f33250a = AbstractC3020i.n(localDateTime, zoneOffset);
        this.f33251b = localDateTime;
        this.f33252c = zoneOffset;
        this.f33253d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public final long C() {
        return this.f33250a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void D(DataOutput dataOutput) {
        a.c(this.f33250a, dataOutput);
        a.d(this.f33252c, dataOutput);
        a.d(this.f33253d, dataOutput);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f33250a, ((b) obj).f33250a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f33250a == bVar.f33250a && this.f33252c.equals(bVar.f33252c) && this.f33253d.equals(bVar.f33253d);
    }

    public final int hashCode() {
        return (this.f33251b.hashCode() ^ this.f33252c.hashCode()) ^ Integer.rotateLeft(this.f33253d.hashCode(), 16);
    }

    public final LocalDateTime j() {
        return this.f33251b.R(this.f33253d.J() - this.f33252c.J());
    }

    public final LocalDateTime l() {
        return this.f33251b;
    }

    public final Duration m() {
        return Duration.r(this.f33253d.J() - this.f33252c.J());
    }

    public final ZoneOffset r() {
        return this.f33253d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(z() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f33251b);
        sb.append(this.f33252c);
        sb.append(" to ");
        sb.append(this.f33253d);
        sb.append(']');
        return sb.toString();
    }

    public final ZoneOffset u() {
        return this.f33252c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List v() {
        return z() ? Collections.emptyList() : j$.com.android.tools.r8.a.h(new Object[]{this.f33252c, this.f33253d});
    }

    public final boolean z() {
        return this.f33253d.J() > this.f33252c.J();
    }
}
