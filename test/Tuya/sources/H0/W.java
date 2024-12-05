package H0;

import android.os.Looper;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import r0.C3679j;
import r0.InterfaceC3671b;

/* loaded from: classes3.dex */
public abstract class W {

    /* renamed from: a, reason: collision with root package name */
    private static final ExecutorService f3278a = x.c("awaitEvenIfOnMainThread task continuation executor");

    public static Object f(Task task) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.f(f3278a, new InterfaceC3671b() { // from class: H0.Q
            @Override // r0.InterfaceC3671b
            public final Object a(Task task2) {
                Object i8;
                i8 = W.i(countDownLatch, task2);
                return i8;
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        }
        if (task.n()) {
            return task.j();
        }
        if (!task.l()) {
            if (task.m()) {
                throw new IllegalStateException(task.i());
            }
            throw new TimeoutException();
        }
        throw new CancellationException("Task is already canceled");
    }

    public static boolean g(CountDownLatch countDownLatch, long j8, TimeUnit timeUnit) {
        boolean z8 = false;
        try {
            long nanos = timeUnit.toNanos(j8);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z8 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z8) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static Task h(final Executor executor, final Callable callable) {
        final C3679j c3679j = new C3679j();
        executor.execute(new Runnable() { // from class: H0.S
            @Override // java.lang.Runnable
            public final void run() {
                W.k(callable, executor, c3679j);
            }
        });
        return c3679j.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object i(CountDownLatch countDownLatch, Task task) {
        countDownLatch.countDown();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object j(C3679j c3679j, Task task) {
        if (task.n()) {
            c3679j.c(task.j());
            return null;
        }
        if (task.i() != null) {
            c3679j.b(task.i());
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(Callable callable, Executor executor, final C3679j c3679j) {
        try {
            ((Task) callable.call()).f(executor, new InterfaceC3671b() { // from class: H0.V
                @Override // r0.InterfaceC3671b
                public final Object a(Task task) {
                    Object j8;
                    j8 = W.j(C3679j.this, task);
                    return j8;
                }
            });
        } catch (Exception e8) {
            c3679j.b(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void l(C3679j c3679j, Task task) {
        if (task.n()) {
            c3679j.e(task.j());
            return null;
        }
        if (task.i() != null) {
            c3679j.d(task.i());
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void m(C3679j c3679j, Task task) {
        if (task.n()) {
            c3679j.e(task.j());
            return null;
        }
        if (task.i() != null) {
            c3679j.d(task.i());
            return null;
        }
        return null;
    }

    public static Task n(Task task, Task task2) {
        final C3679j c3679j = new C3679j();
        InterfaceC3671b interfaceC3671b = new InterfaceC3671b() { // from class: H0.U
            @Override // r0.InterfaceC3671b
            public final Object a(Task task3) {
                Void l8;
                l8 = W.l(C3679j.this, task3);
                return l8;
            }
        };
        task.g(interfaceC3671b);
        task2.g(interfaceC3671b);
        return c3679j.a();
    }

    public static Task o(Executor executor, Task task, Task task2) {
        final C3679j c3679j = new C3679j();
        InterfaceC3671b interfaceC3671b = new InterfaceC3671b() { // from class: H0.T
            @Override // r0.InterfaceC3671b
            public final Object a(Task task3) {
                Void m8;
                m8 = W.m(C3679j.this, task3);
                return m8;
            }
        };
        task.f(executor, interfaceC3671b);
        task2.f(executor, interfaceC3671b);
        return c3679j.a();
    }
}
