package androidx.core.provider;

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

/* loaded from: classes.dex */
abstract class h {

    /* loaded from: classes.dex */
    private static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private String f2214a;

        /* renamed from: b, reason: collision with root package name */
        private int f2215b;

        /* renamed from: androidx.core.provider.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0030a extends Thread {

            /* renamed from: a, reason: collision with root package name */
            private final int f2216a;

            C0030a(Runnable runnable, String str, int i6) {
                super(runnable, str);
                this.f2216a = i6;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f2216a);
                super.run();
            }
        }

        a(String str, int i6) {
            this.f2214a = str;
            this.f2215b = i6;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0030a(runnable, this.f2214a, this.f2215b);
        }
    }

    /* loaded from: classes.dex */
    private static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private Callable f2217a;

        /* renamed from: b, reason: collision with root package name */
        private androidx.core.util.a f2218b;

        /* renamed from: c, reason: collision with root package name */
        private Handler f2219c;

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.core.util.a f2220a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f2221b;

            a(androidx.core.util.a aVar, Object obj) {
                this.f2220a = aVar;
                this.f2221b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f2220a.a(this.f2221b);
            }
        }

        b(Handler handler, Callable callable, androidx.core.util.a aVar) {
            this.f2217a = callable;
            this.f2218b = aVar;
            this.f2219c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f2217a.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f2219c.post(new a(this.f2218b, obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ThreadPoolExecutor a(String str, int i6, int i7) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i7, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i6));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Executor executor, Callable callable, androidx.core.util.a aVar) {
        executor.execute(new b(androidx.core.provider.b.a(), callable, aVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object c(ExecutorService executorService, Callable callable, int i6) {
        try {
            return executorService.submit(callable).get(i6, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e6) {
            throw e6;
        } catch (ExecutionException e7) {
            throw new RuntimeException(e7);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
