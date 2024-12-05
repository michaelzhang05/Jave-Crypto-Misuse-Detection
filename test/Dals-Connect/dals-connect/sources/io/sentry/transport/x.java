package io.sentry.transport;

import io.sentry.s4;
import io.sentry.w1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: QueuedThreadPoolExecutor.java */
/* loaded from: classes2.dex */
final class x extends ThreadPoolExecutor {

    /* renamed from: f, reason: collision with root package name */
    private final int f19276f;

    /* renamed from: g, reason: collision with root package name */
    private final w1 f19277g;

    /* renamed from: h, reason: collision with root package name */
    private final z f19278h;

    /* compiled from: QueuedThreadPoolExecutor.java */
    /* loaded from: classes2.dex */
    static final class a<T> implements Future<T> {
        a() {
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            throw new CancellationException();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get(long j2, TimeUnit timeUnit) {
            throw new CancellationException();
        }
    }

    public x(int i2, int i3, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, w1 w1Var) {
        super(i2, i2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler);
        this.f19278h = new z();
        this.f19276f = i3;
        this.f19277g = w1Var;
    }

    private boolean a() {
        return this.f19278h.b() < this.f19276f;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        try {
            super.afterExecute(runnable, th);
        } finally {
            this.f19278h.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(long j2) {
        try {
            this.f19278h.d(j2, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            this.f19277g.b(s4.ERROR, "Failed to wait till idle", e2);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        if (a()) {
            this.f19278h.c();
            return super.submit(runnable);
        }
        this.f19277g.c(s4.WARNING, "Submit cancelled", new Object[0]);
        return new a();
    }
}
