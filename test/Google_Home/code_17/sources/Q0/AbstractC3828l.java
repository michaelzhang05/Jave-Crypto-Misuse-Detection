package q0;

import Q.AbstractC1400p;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: q0.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3828l {
    public static Object a(Task task) {
        AbstractC1400p.j();
        AbstractC1400p.h();
        AbstractC1400p.m(task, "Task must not be null");
        if (task.m()) {
            return h(task);
        }
        n nVar = new n(null);
        i(task, nVar);
        nVar.b();
        return h(task);
    }

    public static Object b(Task task, long j8, TimeUnit timeUnit) {
        AbstractC1400p.j();
        AbstractC1400p.h();
        AbstractC1400p.m(task, "Task must not be null");
        AbstractC1400p.m(timeUnit, "TimeUnit must not be null");
        if (task.m()) {
            return h(task);
        }
        n nVar = new n(null);
        i(task, nVar);
        if (nVar.e(j8, timeUnit)) {
            return h(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static Task c(Executor executor, Callable callable) {
        AbstractC1400p.m(executor, "Executor must not be null");
        AbstractC1400p.m(callable, "Callback must not be null");
        C3815I c3815i = new C3815I();
        executor.execute(new RunnableC3816J(c3815i, callable));
        return c3815i;
    }

    public static Task d(Exception exc) {
        C3815I c3815i = new C3815I();
        c3815i.q(exc);
        return c3815i;
    }

    public static Task e(Object obj) {
        C3815I c3815i = new C3815I();
        c3815i.r(obj);
        return c3815i;
    }

    public static Task f(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (((Task) it.next()) == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            C3815I c3815i = new C3815I();
            p pVar = new p(collection.size(), c3815i);
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                i((Task) it2.next(), pVar);
            }
            return c3815i;
        }
        return e(null);
    }

    public static Task g(Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return f(Arrays.asList(taskArr));
        }
        return e(null);
    }

    private static Object h(Task task) {
        if (task.n()) {
            return task.j();
        }
        if (task.l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.i());
    }

    private static void i(Task task, o oVar) {
        Executor executor = AbstractC3827k.f38076b;
        task.e(executor, oVar);
        task.d(executor, oVar);
        task.a(executor, oVar);
    }
}
