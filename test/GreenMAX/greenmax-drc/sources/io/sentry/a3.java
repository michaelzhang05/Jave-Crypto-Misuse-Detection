package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* compiled from: NoOpSentryExecutorService.java */
/* loaded from: classes2.dex */
final class a3 implements b2 {
    private static final a3 a = new a3();

    private a3() {
    }

    public static b2 c() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object d() throws Exception {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object e() throws Exception {
        return null;
    }

    @Override // io.sentry.b2
    public void a(long j2) {
    }

    @Override // io.sentry.b2
    public Future<?> b(Runnable runnable, long j2) {
        return new FutureTask(new Callable() { // from class: io.sentry.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                a3.d();
                return null;
            }
        });
    }

    @Override // io.sentry.b2
    public boolean isClosed() {
        return false;
    }

    @Override // io.sentry.b2
    public Future<?> submit(Runnable runnable) {
        return new FutureTask(new Callable() { // from class: io.sentry.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                a3.e();
                return null;
            }
        });
    }
}
