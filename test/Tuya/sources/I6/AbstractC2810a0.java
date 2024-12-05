package i6;

import L5.s;
import kotlin.jvm.internal.AbstractC3159y;
import n6.C3496j;

/* renamed from: i6.a0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2810a0 {
    public static final void a(Z z8, int i8) {
        boolean z9;
        P5.d d8 = z8.d();
        if (i8 == 4) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 && (d8 instanceof C3496j) && b(i8) == b(z8.f31739c)) {
            I i9 = ((C3496j) d8).f36266d;
            P5.g context = d8.getContext();
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

    public static final void d(Z z8, P5.d dVar, boolean z9) {
        Object f8;
        c1 c1Var;
        boolean O02;
        Object h8 = z8.h();
        Throwable e8 = z8.e(h8);
        if (e8 != null) {
            s.a aVar = L5.s.f6511b;
            f8 = L5.t.a(e8);
        } else {
            s.a aVar2 = L5.s.f6511b;
            f8 = z8.f(h8);
        }
        Object b8 = L5.s.b(f8);
        if (z9) {
            AbstractC3159y.g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            C3496j c3496j = (C3496j) dVar;
            P5.d dVar2 = c3496j.f36267e;
            Object obj = c3496j.f36269g;
            P5.g context = dVar2.getContext();
            Object c8 = n6.J.c(context, obj);
            if (c8 != n6.J.f36239a) {
                c1Var = H.g(dVar2, context, c8);
            } else {
                c1Var = null;
            }
            try {
                c3496j.f36267e.resumeWith(b8);
                L5.I i8 = L5.I.f6487a;
                if (c1Var != null) {
                    if (!O02) {
                        return;
                    }
                }
                return;
            } finally {
                if (c1Var == null || c1Var.O0()) {
                    n6.J.a(context, c8);
                }
            }
        }
        dVar.resumeWith(b8);
    }

    private static final void e(Z z8) {
        AbstractC2824h0 b8 = X0.f31735a.b();
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
