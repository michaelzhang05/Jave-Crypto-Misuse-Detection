package J0;

import android.os.Looper;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import q0.C3826j;
import q0.InterfaceC3818b;

/* loaded from: classes3.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ExecutorService f4654a = A.d("awaitEvenIfOnMainThread task continuation executor");

    public static Object f(Task task) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.f(f4654a, new InterfaceC3818b() { // from class: J0.V
            @Override // q0.InterfaceC3818b
            public final Object a(Task task2) {
                Object i8;
                i8 = a0.i(countDownLatch, task2);
                return i8;
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(2750L, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
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
        final C3826j c3826j = new C3826j();
        executor.execute(new Runnable() { // from class: J0.W
            @Override // java.lang.Runnable
            public final void run() {
                a0.k(callable, executor, c3826j);
            }
        });
        return c3826j.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object i(CountDownLatch countDownLatch, Task task) {
        countDownLatch.countDown();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object j(C3826j c3826j, Task task) {
        if (task.n()) {
            c3826j.c(task.j());
            return null;
        }
        if (task.i() != null) {
            c3826j.b(task.i());
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(Callable callable, Executor executor, final C3826j c3826j) {
        try {
            ((Task) callable.call()).f(executor, new InterfaceC3818b() { // from class: J0.Z
                @Override // q0.InterfaceC3818b
                public final Object a(Task task) {
                    Object j8;
                    j8 = a0.j(C3826j.this, task);
                    return j8;
                }
            });
        } catch (Exception e8) {
            c3826j.b(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void l(C3826j c3826j, Task task) {
        if (task.n()) {
            c3826j.e(task.j());
            return null;
        }
        if (task.i() != null) {
            c3826j.d(task.i());
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void m(C3826j c3826j, Task task) {
        if (task.n()) {
            c3826j.e(task.j());
            return null;
        }
        if (task.i() != null) {
            c3826j.d(task.i());
            return null;
        }
        return null;
    }

    public static Task n(Task task, Task task2) {
        final C3826j c3826j = new C3826j();
        InterfaceC3818b interfaceC3818b = new InterfaceC3818b() { // from class: J0.Y
            @Override // q0.InterfaceC3818b
            public final Object a(Task task3) {
                Void l8;
                l8 = a0.l(C3826j.this, task3);
                return l8;
            }
        };
        task.g(interfaceC3818b);
        task2.g(interfaceC3818b);
        return c3826j.a();
    }

    public static Task o(Executor executor, Task task, Task task2) {
        final C3826j c3826j = new C3826j();
        InterfaceC3818b interfaceC3818b = new InterfaceC3818b() { // from class: J0.X
            @Override // q0.InterfaceC3818b
            public final Object a(Task task3) {
                Void m8;
                m8 = a0.m(C3826j.this, task3);
                return m8;
            }
        };
        task.f(executor, interfaceC3818b);
        task2.f(executor, interfaceC3818b);
        return c3826j.a();
    }
}
