package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;

@zzard
/* loaded from: classes2.dex */
public final class zzazg {
    private HandlerThread a = null;

    /* renamed from: b, reason: collision with root package name */
    private Handler f13118b = null;

    /* renamed from: c, reason: collision with root package name */
    private int f13119c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final Object f13120d = new Object();

    public final Handler a() {
        return this.f13118b;
    }

    public final Looper b() {
        Looper looper;
        synchronized (this.f13120d) {
            if (this.f13119c == 0) {
                if (this.a == null) {
                    zzawz.m("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.a = handlerThread;
                    handlerThread.start();
                    this.f13118b = new zzdbh(this.a.getLooper());
                    zzawz.m("Looper thread started.");
                } else {
                    zzawz.m("Resuming the looper thread");
                    this.f13120d.notifyAll();
                }
            } else {
                Preconditions.k(this.a, "Invalid state: mHandlerThread should already been initialized.");
            }
            this.f13119c++;
            looper = this.a.getLooper();
        }
        return looper;
    }
}
