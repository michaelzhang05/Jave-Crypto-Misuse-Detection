package l2;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class l {
    public static Object a(i iVar) {
        v1.n.f();
        v1.n.i(iVar, "Task must not be null");
        if (iVar.l()) {
            return f(iVar);
        }
        n nVar = new n(null);
        g(iVar, nVar);
        nVar.b();
        return f(iVar);
    }

    public static Object b(i iVar, long j6, TimeUnit timeUnit) {
        v1.n.f();
        v1.n.i(iVar, "Task must not be null");
        v1.n.i(timeUnit, "TimeUnit must not be null");
        if (iVar.l()) {
            return f(iVar);
        }
        n nVar = new n(null);
        g(iVar, nVar);
        if (nVar.e(j6, timeUnit)) {
            return f(iVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static i c(Executor executor, Callable callable) {
        v1.n.i(executor, "Executor must not be null");
        v1.n.i(callable, "Callback must not be null");
        h0 h0Var = new h0();
        executor.execute(new i0(h0Var, callable));
        return h0Var;
    }

    public static i d(Exception exc) {
        h0 h0Var = new h0();
        h0Var.o(exc);
        return h0Var;
    }

    public static i e(Object obj) {
        h0 h0Var = new h0();
        h0Var.p(obj);
        return h0Var;
    }

    private static Object f(i iVar) {
        if (iVar.m()) {
            return iVar.i();
        }
        if (iVar.k()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(iVar.h());
    }

    private static void g(i iVar, o oVar) {
        Executor executor = k.f7372b;
        iVar.e(executor, oVar);
        iVar.d(executor, oVar);
        iVar.a(executor, oVar);
    }
}
