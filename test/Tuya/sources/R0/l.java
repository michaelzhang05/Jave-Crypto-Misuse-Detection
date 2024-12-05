package r0;

import R.AbstractC1319p;
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

/* loaded from: classes3.dex */
public abstract class l {
    public static Object a(Task task) {
        AbstractC1319p.j();
        AbstractC1319p.h();
        AbstractC1319p.m(task, "Task must not be null");
        if (task.m()) {
            return h(task);
        }
        n nVar = new n(null);
        i(task, nVar);
        nVar.a();
        return h(task);
    }

    public static Object b(Task task, long j8, TimeUnit timeUnit) {
        AbstractC1319p.j();
        AbstractC1319p.h();
        AbstractC1319p.m(task, "Task must not be null");
        AbstractC1319p.m(timeUnit, "TimeUnit must not be null");
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
        AbstractC1319p.m(executor, "Executor must not be null");
        AbstractC1319p.m(callable, "Callback must not be null");
        I i8 = new I();
        executor.execute(new J(i8, callable));
        return i8;
    }

    public static Task d(Exception exc) {
        I i8 = new I();
        i8.q(exc);
        return i8;
    }

    public static Task e(Object obj) {
        I i8 = new I();
        i8.r(obj);
        return i8;
    }

    public static Task f(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (((Task) it.next()) == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            I i8 = new I();
            p pVar = new p(collection.size(), i8);
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                i((Task) it2.next(), pVar);
            }
            return i8;
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
        Executor executor = k.f37524b;
        task.e(executor, oVar);
        task.d(executor, oVar);
        task.a(executor, oVar);
    }
}
