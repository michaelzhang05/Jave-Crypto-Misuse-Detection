package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzbtb extends zzbts<zzbtf> {

    /* renamed from: g */
    private final ScheduledExecutorService f13543g;

    /* renamed from: h */
    private final Clock f13544h;

    /* renamed from: i */
    private long f13545i;

    /* renamed from: j */
    private long f13546j;

    /* renamed from: k */
    private boolean f13547k;
    private ScheduledFuture<?> l;

    public zzbtb(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        super(Collections.emptySet());
        this.f13545i = -1L;
        this.f13546j = -1L;
        this.f13547k = false;
        this.f13543g = scheduledExecutorService;
        this.f13544h = clock;
    }

    public final void g0() {
        T(me.a);
    }

    private final synchronized void o0(long j2) {
        ScheduledFuture<?> scheduledFuture = this.l;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.l.cancel(true);
        }
        this.f13545i = this.f13544h.b() + j2;
        this.l = this.f13543g.schedule(new oe(this), j2, TimeUnit.MILLISECONDS);
    }

    public final synchronized void f0() {
        this.f13547k = false;
        o0(0L);
    }

    public final synchronized void i0(int i2) {
        if (i2 <= 0) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(i2);
        if (this.f13547k) {
            long j2 = this.f13546j;
            if (j2 <= 0 || millis >= j2) {
                millis = j2;
            }
            this.f13546j = millis;
            return;
        }
        long b2 = this.f13544h.b();
        long j3 = this.f13545i;
        if (b2 > j3 || j3 - this.f13544h.b() > millis) {
            o0(millis);
        }
    }

    public final synchronized void onPause() {
        if (!this.f13547k) {
            ScheduledFuture<?> scheduledFuture = this.l;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.l.cancel(true);
                this.f13546j = this.f13545i - this.f13544h.b();
            } else {
                this.f13546j = -1L;
            }
            this.f13547k = true;
        }
    }

    public final synchronized void onResume() {
        if (this.f13547k) {
            if (this.f13546j > 0 && this.l.isCancelled()) {
                o0(this.f13546j);
            }
            this.f13547k = false;
        }
    }
}
