package l6;

import O5.AbstractC1349e;
import O5.s;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC3255y;
import q6.C3875j;
import s6.AbstractRunnableC4013h;
import s6.InterfaceC4014i;

/* loaded from: classes5.dex */
public abstract class Z extends AbstractRunnableC4013h {

    /* renamed from: c, reason: collision with root package name */
    public int f34591c;

    public Z(int i8) {
        this.f34591c = i8;
    }

    public abstract void c(Object obj, Throwable th);

    public abstract S5.d d();

    public Throwable e(Object obj) {
        C3339C c3339c;
        if (obj instanceof C3339C) {
            c3339c = (C3339C) obj;
        } else {
            c3339c = null;
        }
        if (c3339c == null) {
            return null;
        }
        return c3339c.f34530a;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC1349e.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        AbstractC3255y.f(th);
        K.a(d().getContext(), new P("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object l();

    @Override // java.lang.Runnable
    public final void run() {
        Object b8;
        c1 c1Var;
        InterfaceC3390x0 interfaceC3390x0;
        Object b9;
        InterfaceC4014i interfaceC4014i = this.f39318b;
        try {
            S5.d d8 = d();
            AbstractC3255y.g(d8, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C3875j c3875j = (C3875j) d8;
            S5.d dVar = c3875j.f38395e;
            Object obj = c3875j.f38397g;
            S5.g context = dVar.getContext();
            Object c8 = q6.J.c(context, obj);
            if (c8 != q6.J.f38367a) {
                c1Var = H.g(dVar, context, c8);
            } else {
                c1Var = null;
            }
            try {
                S5.g context2 = dVar.getContext();
                Object l8 = l();
                Throwable e8 = e(l8);
                if (e8 == null && AbstractC3345a0.b(this.f34591c)) {
                    interfaceC3390x0 = (InterfaceC3390x0) context2.get(InterfaceC3390x0.f34661n0);
                } else {
                    interfaceC3390x0 = null;
                }
                if (interfaceC3390x0 != null && !interfaceC3390x0.isActive()) {
                    CancellationException o8 = interfaceC3390x0.o();
                    c(l8, o8);
                    s.a aVar = O5.s.f8302b;
                    dVar.resumeWith(O5.s.b(O5.t.a(o8)));
                } else if (e8 != null) {
                    s.a aVar2 = O5.s.f8302b;
                    dVar.resumeWith(O5.s.b(O5.t.a(e8)));
                } else {
                    s.a aVar3 = O5.s.f8302b;
                    dVar.resumeWith(O5.s.b(f(l8)));
                }
                O5.I i8 = O5.I.f8278a;
                if (c1Var == null || c1Var.N0()) {
                    q6.J.a(context, c8);
                }
                try {
                    interfaceC4014i.a();
                    b9 = O5.s.b(O5.I.f8278a);
                } catch (Throwable th) {
                    s.a aVar4 = O5.s.f8302b;
                    b9 = O5.s.b(O5.t.a(th));
                }
                g(null, O5.s.e(b9));
            } catch (Throwable th2) {
                if (c1Var == null || c1Var.N0()) {
                    q6.J.a(context, c8);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                s.a aVar5 = O5.s.f8302b;
                interfaceC4014i.a();
                b8 = O5.s.b(O5.I.f8278a);
            } catch (Throwable th4) {
                s.a aVar6 = O5.s.f8302b;
                b8 = O5.s.b(O5.t.a(th4));
            }
            g(th3, O5.s.e(b8));
        }
    }

    public Object f(Object obj) {
        return obj;
    }
}
