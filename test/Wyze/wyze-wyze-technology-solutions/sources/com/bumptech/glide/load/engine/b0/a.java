package com.bumptech.glide.load.engine.b0;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: GlideExecutor.java */
/* loaded from: classes.dex */
public final class a implements ExecutorService {

    /* renamed from: f, reason: collision with root package name */
    private static final long f8486f = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: g, reason: collision with root package name */
    private static volatile int f8487g;

    /* renamed from: h, reason: collision with root package name */
    private final ExecutorService f8488h;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GlideExecutor.java */
    /* renamed from: com.bumptech.glide.load.engine.b0.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class ThreadFactoryC0109a implements ThreadFactory {

        /* renamed from: f, reason: collision with root package name */
        private final String f8489f;

        /* renamed from: g, reason: collision with root package name */
        final b f8490g;

        /* renamed from: h, reason: collision with root package name */
        final boolean f8491h;

        /* renamed from: i, reason: collision with root package name */
        private int f8492i;

        /* compiled from: GlideExecutor.java */
        /* renamed from: com.bumptech.glide.load.engine.b0.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0110a extends Thread {
            C0110a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                if (ThreadFactoryC0109a.this.f8491h) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    ThreadFactoryC0109a.this.f8490g.a(th);
                }
            }
        }

        ThreadFactoryC0109a(String str, b bVar, boolean z) {
            this.f8489f = str;
            this.f8490g = bVar;
            this.f8491h = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            C0110a c0110a;
            c0110a = new C0110a(runnable, "glide-" + this.f8489f + "-thread-" + this.f8492i);
            this.f8492i = this.f8492i + 1;
            return c0110a;
        }
    }

    /* compiled from: GlideExecutor.java */
    /* loaded from: classes.dex */
    public interface b {
        public static final b a = new C0111a();

        /* renamed from: b, reason: collision with root package name */
        public static final b f8494b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f8495c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f8496d;

        /* compiled from: GlideExecutor.java */
        /* renamed from: com.bumptech.glide.load.engine.b0.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0111a implements b {
            C0111a() {
            }

            @Override // com.bumptech.glide.load.engine.b0.a.b
            public void a(Throwable th) {
            }
        }

        /* compiled from: GlideExecutor.java */
        /* renamed from: com.bumptech.glide.load.engine.b0.a$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0112b implements b {
            C0112b() {
            }

            @Override // com.bumptech.glide.load.engine.b0.a.b
            public void a(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }

        /* compiled from: GlideExecutor.java */
        /* loaded from: classes.dex */
        class c implements b {
            c() {
            }

            @Override // com.bumptech.glide.load.engine.b0.a.b
            public void a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            C0112b c0112b = new C0112b();
            f8494b = c0112b;
            f8495c = new c();
            f8496d = c0112b;
        }

        void a(Throwable th);
    }

    a(ExecutorService executorService) {
        this.f8488h = executorService;
    }

    public static int a() {
        if (f8487g == 0) {
            f8487g = Math.min(4, com.bumptech.glide.load.engine.b0.b.a());
        }
        return f8487g;
    }

    public static a b() {
        return c(a() >= 4 ? 2 : 1, b.f8496d);
    }

    public static a c(int i2, b bVar) {
        return new a(new ThreadPoolExecutor(0, i2, f8486f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC0109a("animation", bVar, true)));
    }

    public static a d() {
        return e(1, "disk-cache", b.f8496d);
    }

    public static a e(int i2, String str, b bVar) {
        return new a(new ThreadPoolExecutor(i2, i2, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC0109a(str, bVar, true)));
    }

    public static a f() {
        return g(a(), "source", b.f8496d);
    }

    public static a g(int i2, String str, b bVar) {
        return new a(new ThreadPoolExecutor(i2, i2, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC0109a(str, bVar, false)));
    }

    public static a h() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f8486f, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ThreadFactoryC0109a("source-unlimited", b.f8496d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j2, TimeUnit timeUnit) throws InterruptedException {
        return this.f8488h.awaitTermination(j2, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f8488h.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f8488h.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.f8488h.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f8488h.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f8488h.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f8488h.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f8488h.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f8488h.submit(runnable);
    }

    public String toString() {
        return this.f8488h.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws InterruptedException {
        return this.f8488h.invokeAll(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.f8488h.invokeAny(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f8488h.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f8488h.submit(callable);
    }
}
