package com.facebook.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* compiled from: LockOnGetVariable.java */
/* loaded from: classes.dex */
public class q<T> {
    private T a;

    /* renamed from: b, reason: collision with root package name */
    private CountDownLatch f9206b = new CountDownLatch(1);

    /* compiled from: LockOnGetVariable.java */
    /* loaded from: classes.dex */
    class a implements Callable<Void> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Callable f9207f;

        a(Callable callable) {
            this.f9207f = callable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            try {
                q.this.a = this.f9207f.call();
                q.this.f9206b.countDown();
                return null;
            } catch (Throwable th) {
                q.this.f9206b.countDown();
                throw th;
            }
        }
    }

    public q(Callable<T> callable) {
        com.facebook.f.m().execute(new FutureTask(new a(callable)));
    }
}
