package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes2.dex */
public final class zzn extends Thread {

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue<zzr<?>> f15313f;

    /* renamed from: g, reason: collision with root package name */
    private final zzm f15314g;

    /* renamed from: h, reason: collision with root package name */
    private final zzb f15315h;

    /* renamed from: i, reason: collision with root package name */
    private final zzab f15316i;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f15317j = false;

    public zzn(BlockingQueue<zzr<?>> blockingQueue, zzm zzmVar, zzb zzbVar, zzab zzabVar) {
        this.f15313f = blockingQueue;
        this.f15314g = zzmVar;
        this.f15315h = zzbVar;
        this.f15316i = zzabVar;
    }

    private final void a() throws InterruptedException {
        zzr<?> take = this.f15313f.take();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        take.B(3);
        try {
            take.H("network-queue-take");
            take.n();
            TrafficStats.setThreadStatsTag(take.J());
            zzp a = this.f15314g.a(take);
            take.H("network-http-complete");
            if (a.f15378e && take.S()) {
                take.I("not-modified");
                take.T();
                return;
            }
            zzy<?> x = take.x(a);
            take.H("network-parse-complete");
            if (take.O() && x.f15797b != null) {
                this.f15315h.h0(take.L(), x.f15797b);
                take.H("network-cache-written");
            }
            take.R();
            this.f15316i.c(take, x);
            take.D(x);
        } catch (Exception e2) {
            zzag.e(e2, "Unhandled exception %s", e2.toString());
            zzaf zzafVar = new zzaf(e2);
            zzafVar.a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f15316i.a(take, zzafVar);
            take.T();
        } catch (zzaf e3) {
            e3.a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f15316i.a(take, e3);
            take.T();
        } finally {
            take.B(4);
        }
    }

    public final void b() {
        this.f15317j = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f15317j) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzag.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
