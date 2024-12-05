package r4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final r4.a f9125a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile r4.a f9126b;

    /* renamed from: r4.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0137b implements r4.a {
        private C0137b() {
        }

        @Override // r4.a
        public ExecutorService a(ThreadFactory threadFactory, c cVar) {
            return b(1, threadFactory, cVar);
        }

        public ExecutorService b(int i6, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i6, i6, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0137b c0137b = new C0137b();
        f9125a = c0137b;
        f9126b = c0137b;
    }

    public static r4.a a() {
        return f9126b;
    }
}
