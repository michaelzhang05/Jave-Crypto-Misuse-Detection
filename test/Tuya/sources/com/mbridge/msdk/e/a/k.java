package com.mbridge.msdk.e.a;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes4.dex */
public final class k extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<p<?>> f18808a;

    /* renamed from: b, reason: collision with root package name */
    private final j f18809b;

    /* renamed from: c, reason: collision with root package name */
    private final b f18810c;

    /* renamed from: d, reason: collision with root package name */
    private final t f18811d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f18812e = false;

    public k(BlockingQueue<p<?>> blockingQueue, j jVar, b bVar, t tVar) {
        this.f18808a = blockingQueue;
        this.f18809b = jVar;
        this.f18810c = bVar;
        this.f18811d = tVar;
    }

    public final void a() {
        this.f18812e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                p<?> take = this.f18808a.take();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                take.b(3);
                try {
                    try {
                        if (take.m()) {
                            take.c("network-discard-cancelled");
                            take.v();
                        } else {
                            TrafficStats.setThreadStatsTag(take.h());
                            m a8 = this.f18809b.a(take);
                            if (a8.f18817e && take.u()) {
                                take.c("not-modified");
                                take.v();
                            } else {
                                r<?> a9 = take.a(a8);
                                if (take.p() && a9.f18855b != null) {
                                    this.f18810c.a(take.j(), a9.f18855b);
                                }
                                take.t();
                                this.f18811d.a(take, a9);
                                take.a(a9);
                            }
                        }
                    } catch (Throwable th) {
                        take.b(4);
                        throw th;
                        break;
                    }
                } catch (z e8) {
                    e8.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.f18811d.a(take, e8);
                    take.v();
                } catch (Exception e9) {
                    aa.a(e9, "Unhandled exception %s", e9.toString());
                    y yVar = new y(e9);
                    yVar.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.f18811d.a(take, yVar);
                    take.v();
                }
                take.b(4);
            } catch (InterruptedException unused) {
                if (this.f18812e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                aa.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
