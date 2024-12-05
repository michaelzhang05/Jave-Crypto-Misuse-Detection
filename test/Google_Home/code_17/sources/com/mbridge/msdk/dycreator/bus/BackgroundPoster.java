package com.mbridge.msdk.dycreator.bus;

import android.util.Log;

/* loaded from: classes4.dex */
final class BackgroundPoster implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f19689a = new PendingPostQueue();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f19690b;

    /* renamed from: c, reason: collision with root package name */
    private final EventBus f19691c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BackgroundPoster(EventBus eventBus) {
        this.f19691c = eventBus;
    }

    public final void enqueue(Subscription subscription, Object obj) {
        PendingPost a8 = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.f19689a.a(a8);
                if (!this.f19690b) {
                    this.f19690b = true;
                    EventBus.f19692a.execute(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                try {
                    PendingPost a8 = this.f19689a.a(1000);
                    if (a8 == null) {
                        synchronized (this) {
                            a8 = this.f19689a.a();
                            if (a8 == null) {
                                this.f19690b = false;
                                this.f19690b = false;
                                return;
                            }
                        }
                    }
                    this.f19691c.a(a8);
                } catch (InterruptedException e8) {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e8);
                    this.f19690b = false;
                    return;
                }
            } catch (Throwable th) {
                this.f19690b = false;
                throw th;
            }
        }
    }
}
