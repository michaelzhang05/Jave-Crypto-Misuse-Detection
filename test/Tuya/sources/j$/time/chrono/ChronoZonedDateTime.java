package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.InterfaceC2863b;

/* loaded from: classes2.dex */
public interface ChronoZonedDateTime<D extends InterfaceC2863b> extends j$.time.temporal.m, Comparable<ChronoZonedDateTime<?>> {
    long C();

    m a();

    j$.time.k b();

    InterfaceC2863b c();

    ZoneOffset g();

    ChronoZonedDateTime h(ZoneId zoneId);

    ZoneId p();

    Instant toInstant();

    InterfaceC2866e x();
}
