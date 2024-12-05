package io.sentry.android.core.internal.util;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: Debouncer.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public class n {
    private final long a;

    /* renamed from: b, reason: collision with root package name */
    private final io.sentry.transport.q f18716b;

    /* renamed from: d, reason: collision with root package name */
    private final int f18718d;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicInteger f18717c = new AtomicInteger(0);

    /* renamed from: e, reason: collision with root package name */
    private final AtomicLong f18719e = new AtomicLong(0);

    public n(io.sentry.transport.q qVar, long j2, int i2) {
        this.f18716b = qVar;
        this.a = j2;
        this.f18718d = i2 <= 0 ? 1 : i2;
    }

    public boolean a() {
        long a = this.f18716b.a();
        if (this.f18719e.get() != 0 && this.f18719e.get() + this.a > a) {
            if (this.f18717c.incrementAndGet() < this.f18718d) {
                return false;
            }
            this.f18717c.set(0);
            return true;
        }
        this.f18717c.set(0);
        this.f18719e.set(a);
        return false;
    }
}
