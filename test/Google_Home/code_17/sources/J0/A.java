package J0;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public abstract class A {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4616a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicLong f4617b;

        /* renamed from: J0.A$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0070a extends AbstractRunnableC1270e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f4618a;

            C0070a(Runnable runnable) {
                this.f4618a = runnable;
            }

            @Override // J0.AbstractRunnableC1270e
            public void a() {
                this.f4618a.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f4616a = str;
            this.f4617b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C0070a(runnable));
            newThread.setName(this.f4616a + this.f4617b.getAndIncrement());
            return newThread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends AbstractRunnableC1270e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4620a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExecutorService f4621b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f4622c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TimeUnit f4623d;

        b(String str, ExecutorService executorService, long j8, TimeUnit timeUnit) {
            this.f4620a = str;
            this.f4621b = executorService;
            this.f4622c = j8;
            this.f4623d = timeUnit;
        }

        @Override // J0.AbstractRunnableC1270e
        public void a() {
            try {
                G0.h.f().b("Executing shutdown hook for " + this.f4620a);
                this.f4621b.shutdown();
                if (!this.f4621b.awaitTermination(this.f4622c, this.f4623d)) {
                    G0.h.f().b(this.f4620a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f4621b.shutdownNow();
                }
            } catch (InterruptedException unused) {
                G0.h.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f4620a));
                this.f4621b.shutdownNow();
            }
        }
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    private static void b(String str, ExecutorService executorService, long j8, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j8, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static Executor c(Executor executor) {
        return E0.k.a(executor);
    }

    public static ExecutorService d(String str) {
        ExecutorService f8 = f(e(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, f8);
        return f8;
    }

    public static ThreadFactory e(String str) {
        return new a(str, new AtomicLong(1L));
    }

    private static ExecutorService f(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
