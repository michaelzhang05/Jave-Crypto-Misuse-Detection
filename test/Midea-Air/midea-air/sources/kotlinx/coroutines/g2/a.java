package kotlinx.coroutines.g2;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.o;
import kotlin.u;
import kotlinx.coroutines.internal.f;

/* compiled from: Cancellable.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final void a(Continuation<? super u> continuation, Continuation<?> continuation2) {
        Continuation b2;
        try {
            b2 = c.b(continuation);
            Result.a aVar = Result.f21603f;
            f.c(b2, Result.a(u.a), null, 2, null);
        } catch (Throwable th) {
            Result.a aVar2 = Result.f21603f;
            continuation2.resumeWith(Result.a(o.a(th)));
        }
    }

    public static final <R, T> void b(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, Continuation<? super T> continuation, Function1<? super Throwable, u> function1) {
        Continuation<u> a;
        Continuation b2;
        try {
            a = c.a(function2, r, continuation);
            b2 = c.b(a);
            Result.a aVar = Result.f21603f;
            f.b(b2, Result.a(u.a), function1);
        } catch (Throwable th) {
            Result.a aVar2 = Result.f21603f;
            continuation.resumeWith(Result.a(o.a(th)));
        }
    }

    public static /* synthetic */ void c(Function2 function2, Object obj, Continuation continuation, Function1 function1, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        b(function2, obj, continuation, function1);
    }
}
