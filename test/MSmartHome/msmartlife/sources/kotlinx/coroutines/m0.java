package kotlinx.coroutines;

import kotlin.Result;
import kotlin.coroutines.Continuation;

/* compiled from: DebugStrings.kt */
/* loaded from: classes2.dex */
public final class m0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(Continuation<?> continuation) {
        Object a;
        if (continuation instanceof kotlinx.coroutines.internal.e) {
            return continuation.toString();
        }
        try {
            Result.a aVar = Result.f21603f;
            a = Result.a(continuation + '@' + b(continuation));
        } catch (Throwable th) {
            Result.a aVar2 = Result.f21603f;
            a = Result.a(kotlin.o.a(th));
        }
        if (Result.b(a) != null) {
            a = ((Object) continuation.getClass().getName()) + '@' + b(continuation);
        }
        return (String) a;
    }
}
