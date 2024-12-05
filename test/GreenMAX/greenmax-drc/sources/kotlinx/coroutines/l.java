package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* compiled from: CancellableContinuation.kt */
/* loaded from: classes2.dex */
public interface l<T> extends Continuation<T> {
    boolean b();

    void d(Function1<? super Throwable, kotlin.u> function1);

    void e(c0 c0Var, T t);
}
