package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* loaded from: classes2.dex */
final class v30 implements Handler.Callback, Choreographer.FrameCallback {

    /* renamed from: f, reason: collision with root package name */
    private static final v30 f12262f = new v30();

    /* renamed from: g, reason: collision with root package name */
    public volatile long f12263g;

    /* renamed from: h, reason: collision with root package name */
    private final Handler f12264h;

    /* renamed from: i, reason: collision with root package name */
    private final HandlerThread f12265i;

    /* renamed from: j, reason: collision with root package name */
    private Choreographer f12266j;

    /* renamed from: k, reason: collision with root package name */
    private int f12267k;

    private v30() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.f12265i = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f12264h = handler;
        handler.sendEmptyMessage(0);
    }

    public static v30 a() {
        return f12262f;
    }

    public final void b() {
        this.f12264h.sendEmptyMessage(1);
    }

    public final void c() {
        this.f12264h.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        this.f12263g = j2;
        this.f12266j.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            this.f12266j = Choreographer.getInstance();
            return true;
        }
        if (i2 == 1) {
            int i3 = this.f12267k + 1;
            this.f12267k = i3;
            if (i3 == 1) {
                this.f12266j.postFrameCallback(this);
            }
            return true;
        }
        if (i2 != 2) {
            return false;
        }
        int i4 = this.f12267k - 1;
        this.f12267k = i4;
        if (i4 == 0) {
            this.f12266j.removeFrameCallback(this);
            this.f12263g = 0L;
        }
        return true;
    }
}
