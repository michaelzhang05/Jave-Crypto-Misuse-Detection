package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class s0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ r0 f10659f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(r0 r0Var) {
        this.f10659f = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        Lock lock2;
        lock = this.f10659f.r;
        lock.lock();
        try {
            this.f10659f.y();
        } finally {
            lock2 = this.f10659f.r;
            lock2.unlock();
        }
    }
}
