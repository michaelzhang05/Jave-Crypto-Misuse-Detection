package androidx.compose.runtime;

import X5.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3157w;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Z;

/* loaded from: classes.dex */
public final class ActualJvm_jvmKt {
    public static final long currentThreadId() {
        return Thread.currentThread().getId();
    }

    public static final String currentThreadName() {
        return Thread.currentThread().getName();
    }

    public static final void ensureMutable(Object obj) {
    }

    public static final int identityHashCode(Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void invokeComposable(Composer composer, n nVar) {
        AbstractC3159y.g(nVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        ((n) Z.d(nVar, 2)).invoke(composer, 1);
    }

    public static final <T> T invokeComposableForResult(Composer composer, n nVar) {
        AbstractC3159y.g(nVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, T of androidx.compose.runtime.ActualJvm_jvmKt.invokeComposableForResult>");
        return (T) ((n) Z.d(nVar, 2)).invoke(composer, 1);
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m2461synchronized(Object obj, Function0 function0) {
        R r8;
        synchronized (obj) {
            try {
                r8 = (R) function0.invoke();
                AbstractC3157w.b(1);
            } catch (Throwable th) {
                AbstractC3157w.b(1);
                AbstractC3157w.a(1);
                throw th;
            }
        }
        AbstractC3157w.a(1);
        return r8;
    }
}
