package e.h.a.k0;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FileDownloadExecutors.java */
/* loaded from: classes2.dex */
public class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FileDownloadExecutors.java */
    /* loaded from: classes2.dex */
    public static class a implements ThreadFactory {

        /* renamed from: f, reason: collision with root package name */
        private static final AtomicInteger f17887f = new AtomicInteger(1);

        /* renamed from: g, reason: collision with root package name */
        private final String f17888g;

        /* renamed from: i, reason: collision with root package name */
        private final AtomicInteger f17890i = new AtomicInteger(1);

        /* renamed from: h, reason: collision with root package name */
        private final ThreadGroup f17889h = Thread.currentThread().getThreadGroup();

        a(String str) {
            this.f17888g = f.D(str);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.f17889h, runnable, this.f17888g + this.f17890i.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    public static ThreadPoolExecutor a(int i2, String str) {
        return b(i2, new LinkedBlockingQueue(), str);
    }

    public static ThreadPoolExecutor b(int i2, LinkedBlockingQueue<Runnable> linkedBlockingQueue, String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i2, 15L, TimeUnit.SECONDS, linkedBlockingQueue, new a(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static ThreadPoolExecutor c(String str) {
        return new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new SynchronousQueue(), new a(str));
    }
}
