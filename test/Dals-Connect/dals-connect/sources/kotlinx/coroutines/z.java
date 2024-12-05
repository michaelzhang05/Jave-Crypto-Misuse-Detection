package kotlinx.coroutines;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.j.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;

/* compiled from: CompletionState.kt */
/* loaded from: classes2.dex */
public final class z {
    public static final <T> Object a(Object obj, Continuation<? super T> continuation) {
        if (obj instanceof w) {
            Result.a aVar = Result.f21603f;
            Throwable th = ((w) obj).f22295b;
            if (l0.d() && (continuation instanceof CoroutineStackFrame)) {
                th = kotlinx.coroutines.internal.u.j(th, (CoroutineStackFrame) continuation);
            }
            return Result.a(kotlin.o.a(th));
        }
        Result.a aVar2 = Result.f21603f;
        return Result.a(obj);
    }

    public static final <T> Object b(Object obj, Function1<? super Throwable, kotlin.u> function1) {
        Throwable b2 = Result.b(obj);
        if (b2 == null) {
            return function1 != null ? new x(obj, function1) : obj;
        }
        return new w(b2, false, 2, null);
    }

    public static final <T> Object c(Object obj, l<?> lVar) {
        Throwable b2 = Result.b(obj);
        if (b2 != null) {
            if (l0.d() && (lVar instanceof CoroutineStackFrame)) {
                b2 = kotlinx.coroutines.internal.u.j(b2, (CoroutineStackFrame) lVar);
            }
            obj = new w(b2, false, 2, null);
        }
        return obj;
    }

    public static /* synthetic */ Object d(Object obj, Function1 function1, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            function1 = null;
        }
        return b(obj, function1);
    }
}
