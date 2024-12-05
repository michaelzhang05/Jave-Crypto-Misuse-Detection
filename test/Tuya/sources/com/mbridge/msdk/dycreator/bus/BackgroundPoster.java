package com.mbridge.msdk.dycreator.bus;

import android.util.Log;

/* loaded from: classes4.dex */
final class BackgroundPoster implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f18634a = new PendingPostQueue();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f18635b;

    /* renamed from: c, reason: collision with root package name */
    private final EventBus f18636c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BackgroundPoster(EventBus eventBus) {
        this.f18636c = eventBus;
    }

    public final void enqueue(Subscription subscription, Object obj) {
        PendingPost a8 = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.f18634a.a(a8);
                if (!this.f18635b) {
                    this.f18635b = true;
                    EventBus.f18637a.execute(this);
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
                    PendingPost a8 = this.f18634a.a(1000);
                    if (a8 == null) {
                        synchronized (this) {
                            a8 = this.f18634a.a();
                            if (a8 == null) {
                                this.f18635b = false;
                                this.f18635b = false;
                                return;
                            }
                        }
                    }
                    this.f18636c.a(a8);
                } catch (InterruptedException e8) {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e8);
                    this.f18635b = false;
                    return;
                }
            } catch (Throwable th) {
                this.f18635b = false;
                throw th;
            }
        }
    }
}
