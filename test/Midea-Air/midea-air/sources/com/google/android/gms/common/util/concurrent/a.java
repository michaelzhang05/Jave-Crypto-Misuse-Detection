package com.google.android.gms.common.util.concurrent;

import android.os.Process;

/* loaded from: classes2.dex */
final class a implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final Runnable f11012f;

    /* renamed from: g, reason: collision with root package name */
    private final int f11013g;

    public a(Runnable runnable, int i2) {
        this.f11012f = runnable;
        this.f11013g = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f11013g);
        this.f11012f.run();
    }
}
