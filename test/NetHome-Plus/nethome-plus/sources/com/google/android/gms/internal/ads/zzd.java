package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes2.dex */
public final class zzd extends Thread {

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f14633f = zzag.f12695b;

    /* renamed from: g, reason: collision with root package name */
    private final BlockingQueue<zzr<?>> f14634g;

    /* renamed from: h, reason: collision with root package name */
    private final BlockingQueue<zzr<?>> f14635h;

    /* renamed from: i, reason: collision with root package name */
    private final zzb f14636i;

    /* renamed from: j, reason: collision with root package name */
    private final zzab f14637j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f14638k = false;
    private final vy l = new vy(this);

    public zzd(BlockingQueue<zzr<?>> blockingQueue, BlockingQueue<zzr<?>> blockingQueue2, zzb zzbVar, zzab zzabVar) {
        this.f14634g = blockingQueue;
        this.f14635h = blockingQueue2;
        this.f14636i = zzbVar;
        this.f14637j = zzabVar;
    }

    private final void a() throws InterruptedException {
        zzr<?> take = this.f14634g.take();
        take.H("cache-queue-take");
        take.B(1);
        try {
            take.n();
            zzc g0 = this.f14636i.g0(take.L());
            if (g0 == null) {
                take.H("cache-miss");
                if (!vy.c(this.l, take)) {
                    this.f14635h.put(take);
                }
                return;
            }
            if (g0.a()) {
                take.H("cache-hit-expired");
                take.o(g0);
                if (!vy.c(this.l, take)) {
                    this.f14635h.put(take);
                }
                return;
            }
            take.H("cache-hit");
            zzy<?> x = take.x(new zzp(g0.a, g0.f13775g));
            take.H("cache-hit-parsed");
            if (!(g0.f13774f < System.currentTimeMillis())) {
                this.f14637j.c(take, x);
            } else {
                take.H("cache-hit-refresh-needed");
                take.o(g0);
                x.f15799d = true;
                if (!vy.c(this.l, take)) {
                    this.f14637j.b(take, x, new ny(this, take));
                } else {
                    this.f14637j.c(take, x);
                }
            }
        } finally {
            take.B(2);
        }
    }

    public final void b() {
        this.f14638k = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f14633f) {
            zzag.c("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f14636i.f0();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f14638k) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzag.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
