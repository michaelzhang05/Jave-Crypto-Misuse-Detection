package kotlinx.coroutines.g2;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.d;
import kotlin.coroutines.j.internal.CoroutineStackFrame;
import kotlin.coroutines.j.internal.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.g0;
import kotlin.o;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.internal.u;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.s1;
import kotlinx.coroutines.w;

/* compiled from: Undispatched.kt */
/* loaded from: classes2.dex */
public final class b {
    public static final <R, T> void a(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, Continuation<? super T> continuation) {
        Object c2;
        Continuation a = g.a(continuation);
        try {
            CoroutineContext context = continuation.getContext();
            Object c3 = z.c(context, null);
            try {
                if (function2 != null) {
                    Object invoke = ((Function2) g0.e(function2, 2)).invoke(r, a);
                    c2 = d.c();
                    if (invoke != c2) {
                        Result.a aVar = Result.f21603f;
                        a.resumeWith(Result.a(invoke));
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } finally {
                z.a(context, c3);
            }
        } catch (Throwable th) {
            Result.a aVar2 = Result.f21603f;
            a.resumeWith(Result.a(o.a(th)));
        }
    }

    public static final <T, R> Object b(t<? super T> tVar, R r, Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        Object wVar;
        Object c2;
        Throwable j2;
        Object c3;
        Object c4;
        try {
        } catch (Throwable th) {
            wVar = new w(th, false, 2, null);
        }
        if (function2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        }
        wVar = ((Function2) g0.e(function2, 2)).invoke(r, tVar);
        c2 = d.c();
        if (wVar == c2) {
            c4 = d.c();
            return c4;
        }
        Object M = tVar.M(wVar);
        if (M == s1.f22278b) {
            c3 = d.c();
            return c3;
        }
        if (M instanceof w) {
            Throwable th2 = ((w) M).f22295b;
            Continuation<? super T> continuation = tVar.f22240h;
            if (!l0.d() || !(continuation instanceof CoroutineStackFrame)) {
                throw th2;
            }
            j2 = u.j(th2, (CoroutineStackFrame) continuation);
            throw j2;
        }
        return s1.h(M);
    }
}
