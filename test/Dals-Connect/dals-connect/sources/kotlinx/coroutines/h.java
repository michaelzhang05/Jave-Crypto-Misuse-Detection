package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class h {
    public static final l1 a(h0 h0Var, CoroutineContext coroutineContext, j0 j0Var, Function2<? super h0, ? super Continuation<? super kotlin.u>, ? extends Object> function2) {
        return i.a(h0Var, coroutineContext, j0Var, function2);
    }

    public static final <T> Object c(CoroutineContext coroutineContext, Function2<? super h0, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return i.c(coroutineContext, function2, continuation);
    }
}
