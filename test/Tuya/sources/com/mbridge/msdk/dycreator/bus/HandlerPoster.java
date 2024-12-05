package com.mbridge.msdk.dycreator.bus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes4.dex */
final class HandlerPoster extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f18657a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18658b;

    /* renamed from: c, reason: collision with root package name */
    private final EventBus f18659c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f18660d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HandlerPoster(EventBus eventBus, Looper looper, int i8) {
        super(looper);
        this.f18659c = eventBus;
        this.f18658b = i8;
        this.f18657a = new PendingPostQueue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Subscription subscription, Object obj) {
        PendingPost a8 = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.f18657a.a(a8);
                if (!this.f18660d) {
                    this.f18660d = true;
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
                PendingPost a8 = this.f18657a.a();
                if (a8 == null) {
                    synchronized (this) {
                        a8 = this.f18657a.a();
                        if (a8 == null) {
                            this.f18660d = false;
                            return;
                        }
                    }
                }
                this.f18659c.a(a8);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.f18658b);
            if (sendMessage(obtainMessage())) {
                this.f18660d = true;
                return;
            }
            throw new EventBusException("Could not send handler message");
        } catch (Throwable th) {
            this.f18660d = false;
            throw th;
        }
    }
}
