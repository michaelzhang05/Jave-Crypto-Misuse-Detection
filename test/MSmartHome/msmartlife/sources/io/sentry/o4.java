package io.sentry;

import java.time.Instant;

/* compiled from: SentryInstantDate.java */
/* loaded from: classes2.dex */
public final class o4 extends f4 {

    /* renamed from: f, reason: collision with root package name */
    private final Instant f19054f;

    public o4() {
        this(Instant.now());
    }

    @Override // io.sentry.f4
    public long r() {
        return a1.m(this.f19054f.getEpochSecond()) + this.f19054f.getNano();
    }

    public o4(Instant instant) {
        this.f19054f = instant;
    }
}
