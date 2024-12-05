package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;

/* compiled from: Delay.kt */
/* loaded from: classes2.dex */
public final class q0 {
    public static final Object a(long j2, Continuation<? super kotlin.u> continuation) {
        Continuation b2;
        Object c2;
        Object c3;
        if (j2 <= 0) {
            return kotlin.u.a;
        }
        b2 = kotlin.coroutines.intrinsics.c.b(continuation);
        m mVar = new m(b2, 1);
        mVar.w();
        if (j2 < Long.MAX_VALUE) {
            b(mVar.getContext()).o(j2, mVar);
        }
        Object t = mVar.t();
        c2 = kotlin.coroutines.intrinsics.d.c();
        if (t == c2) {
            kotlin.coroutines.j.internal.g.c(continuation);
        }
        c3 = kotlin.coroutines.intrinsics.d.c();
        return t == c3 ? t : kotlin.u.a;
    }

    public static final p0 b(CoroutineContext coroutineContext) {
        CoroutineContext.b bVar = coroutineContext.get(ContinuationInterceptor.f22100b);
        p0 p0Var = bVar instanceof p0 ? (p0) bVar : null;
        return p0Var == null ? o0.a() : p0Var;
    }
}
