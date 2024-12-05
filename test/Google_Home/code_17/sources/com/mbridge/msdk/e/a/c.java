package com.mbridge.msdk.e.a;

import android.os.Process;
import com.mbridge.msdk.e.a.b;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes4.dex */
public final class c extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<p<?>> f19843a;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue<p<?>> f19844b;

    /* renamed from: c, reason: collision with root package name */
    private final b f19845c;

    /* renamed from: d, reason: collision with root package name */
    private final t f19846d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f19847e = false;

    /* renamed from: f, reason: collision with root package name */
    private final ab f19848f;

    public c(BlockingQueue<p<?>> blockingQueue, BlockingQueue<p<?>> blockingQueue2, b bVar, t tVar) {
        this.f19843a = blockingQueue;
        this.f19844b = blockingQueue2;
        this.f19845c = bVar;
        this.f19846d = tVar;
        this.f19848f = new ab(this, blockingQueue2, tVar);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        this.f19845c.a();
        while (true) {
            try {
                final p<?> take = this.f19843a.take();
                take.b(1);
                try {
                    if (take.m()) {
                        take.c("cache-discard-canceled");
                    } else {
                        b.a a8 = this.f19845c.a(take.j());
                        if (a8 == null) {
                            if (!this.f19848f.b(take)) {
                                this.f19844b.put(take);
                            }
                        } else {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (a8.a(currentTimeMillis)) {
                                take.a(a8);
                                if (!this.f19848f.b(take)) {
                                    this.f19844b.put(take);
                                }
                            } else {
                                r<?> a9 = take.a(new m(200, a8.f19835a, false, 0L, a8.f19842h));
                                s k8 = take.k();
                                if (k8 != null && !k8.a(a9, take)) {
                                    this.f19845c.a(take.j(), true);
                                    take.a((b.a) null);
                                    if (!this.f19848f.b(take)) {
                                        this.f19844b.put(take);
                                    }
                                }
                                if (!a9.a()) {
                                    this.f19845c.a(take.j(), true);
                                    take.a((b.a) null);
                                    if (!this.f19848f.b(take)) {
                                        this.f19844b.put(take);
                                    }
                                } else if (a8.f19840f < currentTimeMillis) {
                                    take.a(a8);
                                    a9.f19912d = true;
                                    if (!this.f19848f.b(take)) {
                                        this.f19846d.a(take, a9, new Runnable() { // from class: com.mbridge.msdk.e.a.c.1
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                try {
                                                    c.this.f19844b.put(take);
                                                } catch (InterruptedException unused) {
                                                    Thread.currentThread().interrupt();
                                                }
                                            }
                                        });
                                    } else {
                                        this.f19846d.a(take, a9);
                                    }
                                } else {
                                    this.f19846d.a(take, a9);
                                }
                            }
                        }
                    }
                    take.b(2);
                } catch (Throwable th) {
                    take.b(2);
                    throw th;
                    break;
                }
            } catch (InterruptedException unused) {
                if (this.f19847e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                aa.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void a() {
        this.f19847e = true;
        interrupt();
    }
}
