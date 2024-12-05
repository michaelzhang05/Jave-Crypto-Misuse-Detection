package com.mbridge.msdk.e.a;

import android.os.Process;
import com.mbridge.msdk.e.a.b;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes4.dex */
public final class c extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<p<?>> f18788a;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue<p<?>> f18789b;

    /* renamed from: c, reason: collision with root package name */
    private final b f18790c;

    /* renamed from: d, reason: collision with root package name */
    private final t f18791d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f18792e = false;

    /* renamed from: f, reason: collision with root package name */
    private final ab f18793f;

    public c(BlockingQueue<p<?>> blockingQueue, BlockingQueue<p<?>> blockingQueue2, b bVar, t tVar) {
        this.f18788a = blockingQueue;
        this.f18789b = blockingQueue2;
        this.f18790c = bVar;
        this.f18791d = tVar;
        this.f18793f = new ab(this, blockingQueue2, tVar);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        this.f18790c.a();
        while (true) {
            try {
                final p<?> take = this.f18788a.take();
                take.b(1);
                try {
                    if (take.m()) {
                        take.c("cache-discard-canceled");
                    } else {
                        b.a a8 = this.f18790c.a(take.j());
                        if (a8 == null) {
                            if (!this.f18793f.b(take)) {
                                this.f18789b.put(take);
                            }
                        } else {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (a8.a(currentTimeMillis)) {
                                take.a(a8);
                                if (!this.f18793f.b(take)) {
                                    this.f18789b.put(take);
                                }
                            } else {
                                r<?> a9 = take.a(new m(200, a8.f18780a, false, 0L, a8.f18787h));
                                s k8 = take.k();
                                if (k8 != null && !k8.a(a9, take)) {
                                    this.f18790c.a(take.j(), true);
                                    take.a((b.a) null);
                                    if (!this.f18793f.b(take)) {
                                        this.f18789b.put(take);
                                    }
                                }
                                if (!a9.a()) {
                                    this.f18790c.a(take.j(), true);
                                    take.a((b.a) null);
                                    if (!this.f18793f.b(take)) {
                                        this.f18789b.put(take);
                                    }
                                } else if (a8.f18785f < currentTimeMillis) {
                                    take.a(a8);
                                    a9.f18857d = true;
                                    if (!this.f18793f.b(take)) {
                                        this.f18791d.a(take, a9, new Runnable() { // from class: com.mbridge.msdk.e.a.c.1
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                try {
                                                    c.this.f18789b.put(take);
                                                } catch (InterruptedException unused) {
                                                    Thread.currentThread().interrupt();
                                                }
                                            }
                                        });
                                    } else {
                                        this.f18791d.a(take, a9);
                                    }
                                } else {
                                    this.f18791d.a(take, a9);
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
                if (this.f18792e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                aa.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void a() {
        this.f18792e = true;
        interrupt();
    }
}
