package i6;

import L5.AbstractC1221e;
import L5.s;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC3159y;
import n6.C3496j;
import p6.AbstractRunnableC3619h;
import p6.InterfaceC3620i;

/* loaded from: classes5.dex */
public abstract class Z extends AbstractRunnableC3619h {

    /* renamed from: c, reason: collision with root package name */
    public int f31739c;

    public Z(int i8) {
        this.f31739c = i8;
    }

    public abstract void c(Object obj, Throwable th);

    public abstract P5.d d();

    public Throwable e(Object obj) {
        C2804C c2804c;
        if (obj instanceof C2804C) {
            c2804c = (C2804C) obj;
        } else {
            c2804c = null;
        }
        if (c2804c == null) {
            return null;
        }
        return c2804c.f31678a;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC1221e.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        AbstractC3159y.f(th);
        K.a(d().getContext(), new P("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        Object b8;
        c1 c1Var;
        InterfaceC2855x0 interfaceC2855x0;
        Object b9;
        InterfaceC3620i interfaceC3620i = this.f37119b;
        try {
            P5.d d8 = d();
            AbstractC3159y.g(d8, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C3496j c3496j = (C3496j) d8;
            P5.d dVar = c3496j.f36267e;
            Object obj = c3496j.f36269g;
            P5.g context = dVar.getContext();
            Object c8 = n6.J.c(context, obj);
            if (c8 != n6.J.f36239a) {
                c1Var = H.g(dVar, context, c8);
            } else {
                c1Var = null;
            }
            try {
                P5.g context2 = dVar.getContext();
                Object h8 = h();
                Throwable e8 = e(h8);
                if (e8 == null && AbstractC2810a0.b(this.f31739c)) {
                    interfaceC2855x0 = (InterfaceC2855x0) context2.get(InterfaceC2855x0.f31809n0);
                } else {
                    interfaceC2855x0 = null;
                }
                if (interfaceC2855x0 != null && !interfaceC2855x0.isActive()) {
                    CancellationException m8 = interfaceC2855x0.m();
                    c(h8, m8);
                    s.a aVar = L5.s.f6511b;
                    dVar.resumeWith(L5.s.b(L5.t.a(m8)));
                } else if (e8 != null) {
                    s.a aVar2 = L5.s.f6511b;
                    dVar.resumeWith(L5.s.b(L5.t.a(e8)));
                } else {
                    s.a aVar3 = L5.s.f6511b;
                    dVar.resumeWith(L5.s.b(f(h8)));
                }
                L5.I i8 = L5.I.f6487a;
                if (c1Var == null || c1Var.O0()) {
                    n6.J.a(context, c8);
                }
                try {
                    interfaceC3620i.a();
                    b9 = L5.s.b(L5.I.f6487a);
                } catch (Throwable th) {
                    s.a aVar4 = L5.s.f6511b;
                    b9 = L5.s.b(L5.t.a(th));
                }
                g(null, L5.s.e(b9));
            } catch (Throwable th2) {
                if (c1Var == null || c1Var.O0()) {
                    n6.J.a(context, c8);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                s.a aVar5 = L5.s.f6511b;
                interfaceC3620i.a();
                b8 = L5.s.b(L5.I.f6487a);
            } catch (Throwable th4) {
                s.a aVar6 = L5.s.f6511b;
                b8 = L5.s.b(L5.t.a(th4));
            }
            g(th3, L5.s.e(b8));
        }
    }

    public Object f(Object obj) {
        return obj;
    }
}
