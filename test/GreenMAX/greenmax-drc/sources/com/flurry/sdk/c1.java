package com.flurry.sdk;

import com.flurry.sdk.g2;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class c1<T extends g2> {
    private final z0<Object, T> a = new z0<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<T, Object> f9771b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    final HashMap<T, Future<?>> f9772c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final ThreadPoolExecutor f9773d;

    /* loaded from: classes2.dex */
    final class b extends ThreadPoolExecutor.DiscardPolicy {

        /* loaded from: classes2.dex */
        final class a extends f2 {

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ g2 f9779h;

            a(g2 g2Var) {
                this.f9779h = g2Var;
            }

            @Override // com.flurry.sdk.f2
            public final void a() {
            }
        }

        b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.ThreadPoolExecutor.DiscardPolicy, java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            super.rejectedExecution(runnable, threadPoolExecutor);
            g2 a2 = c1.a(runnable);
            if (a2 == null) {
                return;
            }
            synchronized (c1.this.f9772c) {
                c1.this.f9772c.remove(a2);
            }
            c1.this.b(a2);
            new a(a2).run();
        }
    }

    public c1(String str, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        a aVar = new a(timeUnit, blockingQueue);
        this.f9773d = aVar;
        aVar.setRejectedExecutionHandler(new b());
        aVar.setThreadFactory(new z1(str));
    }

    static /* synthetic */ g2 a(Runnable runnable) {
        if (runnable instanceof b1) {
            return (g2) ((b1) runnable).a();
        }
        if (runnable instanceof g2) {
            return (g2) runnable;
        }
        d1.c(6, "TrackedThreadPoolExecutor", "Unknown runnable class: " + runnable.getClass().getName());
        return null;
    }

    private synchronized void d(Object obj, T t) {
        List<T> b2;
        z0<Object, T> z0Var = this.a;
        if (obj != null && (b2 = z0Var.b(obj, false)) != null) {
            b2.remove(t);
            if (b2.size() == 0) {
                z0Var.a.remove(obj);
            }
        }
        this.f9771b.remove(t);
    }

    private synchronized void e(Object obj, T t) {
        this.a.c(obj, t);
        this.f9771b.put(t, obj);
    }

    final synchronized void b(T t) {
        d(this.f9771b.get(t), t);
    }

    public final synchronized void c(Object obj, T t) {
        if (obj == null) {
            return;
        }
        e(obj, t);
        this.f9773d.submit(t);
    }

    /* loaded from: classes2.dex */
    final class a extends ThreadPoolExecutor {

        /* renamed from: com.flurry.sdk.c1$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        final class C0159a extends f2 {

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ g2 f9775h;

            C0159a(g2 g2Var) {
                this.f9775h = g2Var;
            }

            @Override // com.flurry.sdk.f2
            public final void a() {
            }
        }

        /* loaded from: classes2.dex */
        final class b extends f2 {

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ g2 f9777h;

            b(g2 g2Var) {
                this.f9777h = g2Var;
            }

            @Override // com.flurry.sdk.f2
            public final void a() {
            }
        }

        a(TimeUnit timeUnit, BlockingQueue blockingQueue) {
            super(0, 5, 5000L, timeUnit, blockingQueue);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.ThreadPoolExecutor
        protected final void afterExecute(Runnable runnable, Throwable th) {
            super.afterExecute(runnable, th);
            g2 a = c1.a(runnable);
            if (a == null) {
                return;
            }
            synchronized (c1.this.f9772c) {
                c1.this.f9772c.remove(a);
            }
            c1.this.b(a);
            new b(a).run();
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        protected final void beforeExecute(Thread thread, Runnable runnable) {
            super.beforeExecute(thread, runnable);
            g2 a = c1.a(runnable);
            if (a == null) {
                return;
            }
            new C0159a(a).run();
        }

        @Override // java.util.concurrent.AbstractExecutorService
        protected final <V> RunnableFuture<V> newTaskFor(Runnable runnable, V v) {
            b1 b1Var = new b1(runnable, v);
            synchronized (c1.this.f9772c) {
                c1.this.f9772c.put((g2) runnable, b1Var);
            }
            return b1Var;
        }

        @Override // java.util.concurrent.AbstractExecutorService
        protected final <V> RunnableFuture<V> newTaskFor(Callable<V> callable) {
            throw new UnsupportedOperationException("Callable not supported");
        }
    }
}
