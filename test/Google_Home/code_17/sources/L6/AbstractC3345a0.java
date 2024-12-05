package l6;

import O5.s;
import kotlin.jvm.internal.AbstractC3255y;
import q6.C3875j;

/* renamed from: l6.a0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3345a0 {
    public static final void a(Z z8, int i8) {
        boolean z9;
        S5.d d8 = z8.d();
        if (i8 == 4) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 && (d8 instanceof C3875j) && b(i8) == b(z8.f34591c)) {
            I i9 = ((C3875j) d8).f38394d;
            S5.g context = d8.getContext();
            if (i9.isDispatchNeeded(context)) {
                i9.dispatch(context, z8);
                return;
            } else {
                e(z8);
                return;
            }
        }
        d(z8, d8, z9);
    }

    public static final boolean b(int i8) {
        if (i8 == 1 || i8 == 2) {
            return true;
        }
        return false;
    }

    public static final boolean c(int i8) {
        if (i8 == 2) {
            return true;
        }
        return false;
    }

    public static final void d(Z z8, S5.d dVar, boolean z9) {
        Object f8;
        c1 c1Var;
        boolean N02;
        Object l8 = z8.l();
        Throwable e8 = z8.e(l8);
        if (e8 != null) {
            s.a aVar = O5.s.f8302b;
            f8 = O5.t.a(e8);
        } else {
            s.a aVar2 = O5.s.f8302b;
            f8 = z8.f(l8);
        }
        Object b8 = O5.s.b(f8);
        if (z9) {
            AbstractC3255y.g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            C3875j c3875j = (C3875j) dVar;
            S5.d dVar2 = c3875j.f38395e;
            Object obj = c3875j.f38397g;
            S5.g context = dVar2.getContext();
            Object c8 = q6.J.c(context, obj);
            if (c8 != q6.J.f38367a) {
                c1Var = H.g(dVar2, context, c8);
            } else {
                c1Var = null;
            }
            try {
                c3875j.f38395e.resumeWith(b8);
                O5.I i8 = O5.I.f8278a;
                if (c1Var != null) {
                    if (!N02) {
                        return;
                    }
                }
                return;
            } finally {
                if (c1Var == null || c1Var.N0()) {
                    q6.J.a(context, c8);
                }
            }
        }
        dVar.resumeWith(b8);
    }

    private static final void e(Z z8) {
        AbstractC3359h0 b8 = X0.f34587a.b();
        if (b8.L()) {
            b8.H(z8);
            return;
        }
        b8.J(true);
        try {
            d(z8, z8.d(), true);
            do {
            } while (b8.O());
        } finally {
            try {
            } finally {
            }
        }
    }
}
