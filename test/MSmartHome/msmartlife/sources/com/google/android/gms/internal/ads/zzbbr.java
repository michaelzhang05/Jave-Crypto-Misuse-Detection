package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@zzard
/* loaded from: classes2.dex */
public class zzbbr<T> implements zzbbh<T> {

    /* renamed from: g, reason: collision with root package name */
    private T f13159g;

    /* renamed from: h, reason: collision with root package name */
    private Throwable f13160h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13161i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13162j;

    /* renamed from: f, reason: collision with root package name */
    private final Object f13158f = new Object();

    /* renamed from: k, reason: collision with root package name */
    private final c7 f13163k = new c7();

    private final boolean e() {
        return this.f13160h != null || this.f13161i;
    }

    public final void b(T t) {
        synchronized (this.f13158f) {
            if (this.f13162j) {
                return;
            }
            if (e()) {
                zzk.zzlk().h(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.set");
                return;
            }
            this.f13161i = true;
            this.f13159g = t;
            this.f13158f.notifyAll();
            this.f13163k.b();
        }
    }

    public final void c(Throwable th) {
        synchronized (this.f13158f) {
            if (this.f13162j) {
                return;
            }
            if (e()) {
                zzk.zzlk().h(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.setException");
                return;
            }
            this.f13160h = th;
            this.f13158f.notifyAll();
            this.f13163k.b();
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (!z) {
            return false;
        }
        synchronized (this.f13158f) {
            if (e()) {
                return false;
            }
            this.f13162j = true;
            this.f13161i = true;
            this.f13158f.notifyAll();
            this.f13163k.b();
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void f(Runnable runnable, Executor executor) {
        this.f13163k.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public T get() throws CancellationException, ExecutionException, InterruptedException {
        T t;
        synchronized (this.f13158f) {
            while (!e()) {
                this.f13158f.wait();
            }
            if (this.f13160h == null) {
                if (!this.f13162j) {
                    t = this.f13159g;
                } else {
                    throw new CancellationException("SettableFuture was cancelled.");
                }
            } else {
                throw new ExecutionException(this.f13160h);
            }
        }
        return t;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        boolean z;
        synchronized (this.f13158f) {
            z = this.f13162j;
        }
        return z;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        boolean e2;
        synchronized (this.f13158f) {
            e2 = e();
        }
        return e2;
    }

    @Override // java.util.concurrent.Future
    public T get(long j2, TimeUnit timeUnit) throws CancellationException, ExecutionException, InterruptedException, TimeoutException {
        T t;
        synchronized (this.f13158f) {
            long millis = timeUnit.toMillis(j2);
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = millis + currentTimeMillis;
            while (!e() && currentTimeMillis < j3) {
                this.f13158f.wait(j3 - currentTimeMillis);
                currentTimeMillis = System.currentTimeMillis();
            }
            if (!this.f13162j) {
                if (this.f13160h == null) {
                    if (this.f13161i) {
                        t = this.f13159g;
                    } else {
                        throw new TimeoutException("SettableFuture timed out.");
                    }
                } else {
                    throw new ExecutionException(this.f13160h);
                }
            } else {
                throw new CancellationException("SettableFuture was cancelled.");
            }
        }
        return t;
    }
}
