package kotlinx.coroutines;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: DispatchedTask.kt */
/* loaded from: classes2.dex */
public final class t0 {
    public static final <T> void a(s0<? super T> s0Var, int i2) {
        if (l0.a()) {
            if (!(i2 != -1)) {
                throw new AssertionError();
            }
        }
        Continuation<? super T> c2 = s0Var.c();
        boolean z = i2 == 4;
        if (!z && (c2 instanceof kotlinx.coroutines.internal.e) && b(i2) == b(s0Var.f22277h)) {
            c0 c0Var = ((kotlinx.coroutines.internal.e) c2).f22212j;
            CoroutineContext context = c2.getContext();
            if (c0Var.t0(context)) {
                c0Var.s0(context, s0Var);
                return;
            } else {
                e(s0Var);
                return;
            }
        }
        d(s0Var, c2, z);
    }

    public static final boolean b(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static final boolean c(int i2) {
        return i2 == 2;
    }

    public static final <T> void d(s0<? super T> s0Var, Continuation<? super T> continuation, boolean z) {
        Object g2;
        boolean t0;
        Object i2 = s0Var.i();
        Throwable f2 = s0Var.f(i2);
        if (f2 != null) {
            Result.a aVar = Result.f21603f;
            g2 = kotlin.o.a(f2);
        } else {
            Result.a aVar2 = Result.f21603f;
            g2 = s0Var.g(i2);
        }
        Object a = Result.a(g2);
        if (z) {
            kotlinx.coroutines.internal.e eVar = (kotlinx.coroutines.internal.e) continuation;
            Continuation<T> continuation2 = eVar.f22213k;
            Object obj = eVar.m;
            CoroutineContext context = continuation2.getContext();
            Object c2 = kotlinx.coroutines.internal.z.c(context, obj);
            d2<?> e2 = c2 != kotlinx.coroutines.internal.z.a ? b0.e(continuation2, context, c2) : null;
            try {
                eVar.f22213k.resumeWith(a);
                kotlin.u uVar = kotlin.u.a;
                if (e2 != null) {
                    if (!t0) {
                        return;
                    }
                }
                return;
            } finally {
                if (e2 == null || e2.t0()) {
                    kotlinx.coroutines.internal.z.a(context, c2);
                }
            }
        }
        continuation.resumeWith(a);
    }

    private static final void e(s0<?> s0Var) {
        y0 a = b2.a.a();
        if (a.A0()) {
            a.w0(s0Var);
            return;
        }
        a.y0(true);
        try {
            d(s0Var, s0Var.c(), true);
            do {
            } while (a.C0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
