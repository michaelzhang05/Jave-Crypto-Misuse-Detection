package com.mbridge.msdk.dycreator.bus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes4.dex */
final class HandlerPoster extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f19712a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19713b;

    /* renamed from: c, reason: collision with root package name */
    private final EventBus f19714c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f19715d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HandlerPoster(EventBus eventBus, Looper looper, int i8) {
        super(looper);
        this.f19714c = eventBus;
        this.f19713b = i8;
        this.f19712a = new PendingPostQueue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Subscription subscription, Object obj) {
        PendingPost a8 = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.f19712a.a(a8);
                if (!this.f19715d) {
                    this.f19715d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new EventBusException("Could not send handler message");
                    }
                }
            } finally {
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                PendingPost a8 = this.f19712a.a();
                if (a8 == null) {
                    synchronized (this) {
                        a8 = this.f19712a.a();
                        if (a8 == null) {
                            this.f19715d = false;
                            return;
                        }
                    }
                }
                this.f19714c.a(a8);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.f19713b);
            if (sendMessage(obtainMessage())) {
                this.f19715d = true;
                return;
            }
            throw new EventBusException("Could not send handler message");
        } catch (Throwable th) {
            this.f19715d = false;
            throw th;
        }
    }
}
