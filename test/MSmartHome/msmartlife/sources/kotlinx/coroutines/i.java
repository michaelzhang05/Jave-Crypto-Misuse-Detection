package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.common.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class i {
    public static final l1 a(h0 h0Var, CoroutineContext coroutineContext, j0 j0Var, Function2<? super h0, ? super Continuation<? super kotlin.u>, ? extends Object> function2) {
        c z1Var;
        CoroutineContext c2 = b0.c(h0Var, coroutineContext);
        if (j0Var.i()) {
            z1Var = new t1(c2, function2);
        } else {
            z1Var = new z1(c2, true);
        }
        z1Var.s0(j0Var, z1Var, function2);
        return z1Var;
    }

    public static /* synthetic */ l1 b(h0 h0Var, CoroutineContext coroutineContext, j0 j0Var, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f22103f;
        }
        if ((i2 & 2) != 0) {
            j0Var = j0.DEFAULT;
        }
        return h.a(h0Var, coroutineContext, j0Var, function2);
    }

    public static final <T> Object c(CoroutineContext coroutineContext, Function2<? super h0, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        Object t0;
        Object c2;
        CoroutineContext context = continuation.getContext();
        CoroutineContext plus = context.plus(coroutineContext);
        o1.c(plus);
        if (plus == context) {
            kotlinx.coroutines.internal.t tVar = new kotlinx.coroutines.internal.t(plus, continuation);
            t0 = kotlinx.coroutines.g2.b.b(tVar, tVar, function2);
        } else {
            ContinuationInterceptor.b bVar = ContinuationInterceptor.f22100b;
            if (kotlin.jvm.internal.l.a(plus.get(bVar), context.get(bVar))) {
                d2 d2Var = new d2(plus, continuation);
                Object c3 = kotlinx.coroutines.internal.z.c(plus, null);
                try {
                    Object b2 = kotlinx.coroutines.g2.b.b(d2Var, d2Var, function2);
                    kotlinx.coroutines.internal.z.a(plus, c3);
                    t0 = b2;
                } catch (Throwable th) {
                    kotlinx.coroutines.internal.z.a(plus, c3);
                    throw th;
                }
            } else {
                r0 r0Var = new r0(plus, continuation);
                kotlinx.coroutines.g2.a.c(function2, r0Var, r0Var, null, 4, null);
                t0 = r0Var.t0();
            }
        }
        c2 = kotlin.coroutines.intrinsics.d.c();
        if (t0 == c2) {
            kotlin.coroutines.j.internal.g.c(continuation);
        }
        return t0;
    }
}
