package c.b.a.a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultTaskExecutor.java */
/* loaded from: classes.dex */
public class b extends c {
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f2330b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c, reason: collision with root package name */
    private volatile Handler f2331c;

    /* compiled from: DefaultTaskExecutor.java */
    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: f, reason: collision with root package name */
        private final AtomicInteger f2332f = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f2332f.getAndIncrement())));
            return thread;
        }
    }

    private static Handler d(Looper looper) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return Handler.createAsync(looper);
        }
        if (i2 >= 16) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    @Override // c.b.a.a.c
    public void a(Runnable runnable) {
        this.f2330b.execute(runnable);
    }

    @Override // c.b.a.a.c
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // c.b.a.a.c
    public void c(Runnable runnable) {
        if (this.f2331c == null) {
            synchronized (this.a) {
                if (this.f2331c == null) {
                    this.f2331c = d(Looper.getMainLooper());
                }
            }
        }
        this.f2331c.post(runnable);
    }
}
