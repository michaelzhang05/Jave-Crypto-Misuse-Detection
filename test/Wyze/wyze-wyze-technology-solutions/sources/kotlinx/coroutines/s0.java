package kotlinx.coroutines;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.j.internal.CoroutineStackFrame;

/* compiled from: DispatchedTask.kt */
/* loaded from: classes2.dex */
public abstract class s0<T> extends kotlinx.coroutines.i2.i {

    /* renamed from: h, reason: collision with root package name */
    public int f22277h;

    public s0(int i2) {
        this.f22277h = i2;
    }

    public void a(Object obj, Throwable th) {
    }

    public abstract Continuation<T> c();

    public Throwable f(Object obj) {
        w wVar = obj instanceof w ? (w) obj : null;
        if (wVar == null) {
            return null;
        }
        return wVar.f22295b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T g(Object obj) {
        return obj;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            kotlin.b.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.l.c(th);
        e0.a(c().getContext(), new k0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        Object a;
        Object a2;
        if (l0.a()) {
            if (!(this.f22277h != -1)) {
                throw new AssertionError();
            }
        }
        kotlinx.coroutines.i2.j jVar = this.f22193g;
        try {
            kotlinx.coroutines.internal.e eVar = (kotlinx.coroutines.internal.e) c();
            Continuation<T> continuation = eVar.f22213k;
            Object obj = eVar.m;
            CoroutineContext context = continuation.getContext();
            Object c2 = kotlinx.coroutines.internal.z.c(context, obj);
            d2<?> e2 = c2 != kotlinx.coroutines.internal.z.a ? b0.e(continuation, context, c2) : null;
            try {
                CoroutineContext context2 = continuation.getContext();
                Object i2 = i();
                Throwable f2 = f(i2);
                l1 l1Var = (f2 == null && t0.b(this.f22277h)) ? (l1) context2.get(l1.f22259e) : null;
                if (l1Var != null && !l1Var.b()) {
                    Throwable D = l1Var.D();
                    a(i2, D);
                    Result.a aVar = Result.f21603f;
                    if (l0.d() && (continuation instanceof CoroutineStackFrame)) {
                        D = kotlinx.coroutines.internal.u.a(D, (CoroutineStackFrame) continuation);
                    }
                    continuation.resumeWith(Result.a(kotlin.o.a(D)));
                } else if (f2 != null) {
                    Result.a aVar2 = Result.f21603f;
                    continuation.resumeWith(Result.a(kotlin.o.a(f2)));
                } else {
                    T g2 = g(i2);
                    Result.a aVar3 = Result.f21603f;
                    continuation.resumeWith(Result.a(g2));
                }
                kotlin.u uVar = kotlin.u.a;
                try {
                    Result.a aVar4 = Result.f21603f;
                    jVar.w();
                    a2 = Result.a(uVar);
                } catch (Throwable th) {
                    Result.a aVar5 = Result.f21603f;
                    a2 = Result.a(kotlin.o.a(th));
                }
                h(null, Result.b(a2));
            } finally {
                if (e2 == null || e2.t0()) {
                    kotlinx.coroutines.internal.z.a(context, c2);
                }
            }
        } catch (Throwable th2) {
            try {
                Result.a aVar6 = Result.f21603f;
                jVar.w();
                a = Result.a(kotlin.u.a);
            } catch (Throwable th3) {
                Result.a aVar7 = Result.f21603f;
                a = Result.a(kotlin.o.a(th3));
            }
            h(th2, Result.b(a));
        }
    }
}
