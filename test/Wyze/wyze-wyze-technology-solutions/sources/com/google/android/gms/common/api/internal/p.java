package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
abstract class p implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zaak f10647f;

    private p(zaak zaakVar) {
        this.f10647f = zaakVar;
    }

    protected abstract void a();

    @Override // java.lang.Runnable
    public void run() {
        Lock lock;
        Lock lock2;
        zabe zabeVar;
        lock = this.f10647f.f10674b;
        lock.lock();
        try {
            if (Thread.interrupted()) {
                return;
            }
            a();
        } catch (RuntimeException e2) {
            zabeVar = this.f10647f.a;
            zabeVar.k(e2);
        } finally {
            lock2 = this.f10647f.f10674b;
            lock2.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ p(zaak zaakVar, g gVar) {
        this(zaakVar);
    }
}
