package c.l.b;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ModernAsyncTask.java */
/* loaded from: classes.dex */
abstract class c<Params, Progress, Result> {

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadFactory f2799f;

    /* renamed from: g, reason: collision with root package name */
    private static final BlockingQueue<Runnable> f2800g;

    /* renamed from: h, reason: collision with root package name */
    public static final Executor f2801h;

    /* renamed from: i, reason: collision with root package name */
    private static f f2802i;

    /* renamed from: j, reason: collision with root package name */
    private static volatile Executor f2803j;

    /* renamed from: k, reason: collision with root package name */
    private final h<Params, Result> f2804k;
    private final FutureTask<Result> l;
    private volatile g m = g.PENDING;
    final AtomicBoolean n = new AtomicBoolean();
    final AtomicBoolean o = new AtomicBoolean();

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    static class a implements ThreadFactory {

        /* renamed from: f, reason: collision with root package name */
        private final AtomicInteger f2805f = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f2805f.getAndIncrement());
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    class b extends h<Params, Result> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            c.this.o.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) c.this.b(this.f2813f);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: c.l.b.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0070c extends FutureTask<Result> {
        C0070c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                c.this.m(get());
            } catch (InterruptedException e2) {
                Log.w("AsyncTask", e2);
            } catch (CancellationException unused) {
                c.this.m(null);
            } catch (ExecutionException e3) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e3.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class d {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.values().length];
            a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    public static class e<Data> {
        final c a;

        /* renamed from: b, reason: collision with root package name */
        final Data[] f2808b;

        e(c cVar, Data... dataArr) {
            this.a = cVar;
            this.f2808b = dataArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    public static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i2 = message.what;
            if (i2 == 1) {
                eVar.a.d(eVar.f2808b[0]);
            } else {
                if (i2 != 2) {
                    return;
                }
                eVar.a.k(eVar.f2808b);
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    private static abstract class h<Params, Result> implements Callable<Result> {

        /* renamed from: f, reason: collision with root package name */
        Params[] f2813f;

        h() {
        }
    }

    static {
        a aVar = new a();
        f2799f = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f2800g = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f2801h = threadPoolExecutor;
        f2803j = threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c() {
        b bVar = new b();
        this.f2804k = bVar;
        this.l = new C0070c(bVar);
    }

    private static Handler e() {
        f fVar;
        synchronized (c.class) {
            if (f2802i == null) {
                f2802i = new f();
            }
            fVar = f2802i;
        }
        return fVar;
    }

    public final boolean a(boolean z) {
        this.n.set(true);
        return this.l.cancel(z);
    }

    protected abstract Result b(Params... paramsArr);

    public final c<Params, Progress, Result> c(Executor executor, Params... paramsArr) {
        if (this.m != g.PENDING) {
            int i2 = d.a[this.m.ordinal()];
            if (i2 == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (i2 != 2) {
                throw new IllegalStateException("We should never reach this state");
            }
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        this.m = g.RUNNING;
        j();
        this.f2804k.f2813f = paramsArr;
        executor.execute(this.l);
        return this;
    }

    void d(Result result) {
        if (f()) {
            h(result);
        } else {
            i(result);
        }
        this.m = g.FINISHED;
    }

    public final boolean f() {
        return this.n.get();
    }

    protected void g() {
    }

    protected void h(Result result) {
        g();
    }

    protected void i(Result result) {
    }

    protected void j() {
    }

    protected void k(Progress... progressArr) {
    }

    Result l(Result result) {
        e().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    void m(Result result) {
        if (this.o.get()) {
            return;
        }
        l(result);
    }
}
