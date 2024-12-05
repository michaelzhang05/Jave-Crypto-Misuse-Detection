package c.h.h;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: RequestExecutor.java */
/* loaded from: classes.dex */
class g {

    /* compiled from: RequestExecutor.java */
    /* loaded from: classes.dex */
    private static class a implements ThreadFactory {

        /* renamed from: f, reason: collision with root package name */
        private String f2701f;

        /* renamed from: g, reason: collision with root package name */
        private int f2702g;

        /* compiled from: RequestExecutor.java */
        /* renamed from: c.h.h.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0058a extends Thread {

            /* renamed from: f, reason: collision with root package name */
            private final int f2703f;

            C0058a(Runnable runnable, String str, int i2) {
                super(runnable, str);
                this.f2703f = i2;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f2703f);
                super.run();
            }
        }

        a(String str, int i2) {
            this.f2701f = str;
            this.f2702g = i2;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0058a(runnable, this.f2701f, this.f2702g);
        }
    }

    /* compiled from: RequestExecutor.java */
    /* loaded from: classes.dex */
    private static class b<T> implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private Callable<T> f2704f;

        /* renamed from: g, reason: collision with root package name */
        private c.h.j.a<T> f2705g;

        /* renamed from: h, reason: collision with root package name */
        private Handler f2706h;

        /* compiled from: RequestExecutor.java */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ c.h.j.a f2707f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Object f2708g;

            a(c.h.j.a aVar, Object obj) {
                this.f2707f = aVar;
                this.f2708g = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f2707f.a(this.f2708g);
            }
        }

        b(Handler handler, Callable<T> callable, c.h.j.a<T> aVar) {
            this.f2704f = callable;
            this.f2705g = aVar;
            this.f2706h = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t;
            try {
                t = this.f2704f.call();
            } catch (Exception unused) {
                t = null;
            }
            this.f2706h.post(new a(this.f2705g, t));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ThreadPoolExecutor a(String str, int i2, int i3) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i3, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void b(Executor executor, Callable<T> callable, c.h.j.a<T> aVar) {
        executor.execute(new b(c.h.h.b.a(), callable, aVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T c(ExecutorService executorService, Callable<T> callable, int i2) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i2, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            throw e2;
        } catch (ExecutionException e3) {
            throw new RuntimeException(e3);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
