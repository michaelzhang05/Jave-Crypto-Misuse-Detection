package androidx.work;

import L5.I;
import P5.d;
import Q5.b;
import androidx.annotation.RestrictTo;
import i6.C2839p;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.AbstractC3157w;
import x0.InterfaceFutureC3857a;

/* loaded from: classes3.dex */
public final class ListenableFutureKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <R> Object await(InterfaceFutureC3857a interfaceFutureC3857a, d dVar) {
        if (interfaceFutureC3857a.isDone()) {
            try {
                return interfaceFutureC3857a.get();
            } catch (ExecutionException e8) {
                Throwable cause = e8.getCause();
                if (cause == null) {
                    throw e8;
                }
                throw cause;
            }
        }
        C2839p c2839p = new C2839p(b.c(dVar), 1);
        c2839p.B();
        interfaceFutureC3857a.addListener(new ListenableFutureKt$await$2$1(c2839p, interfaceFutureC3857a), DirectExecutor.INSTANCE);
        c2839p.j(new ListenableFutureKt$await$2$2(interfaceFutureC3857a));
        Object y8 = c2839p.y();
        if (y8 == b.e()) {
            h.c(dVar);
        }
        return y8;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private static final <R> Object await$$forInline(InterfaceFutureC3857a interfaceFutureC3857a, d dVar) {
        if (interfaceFutureC3857a.isDone()) {
            try {
                return interfaceFutureC3857a.get();
            } catch (ExecutionException e8) {
                Throwable cause = e8.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw e8;
            }
        }
        AbstractC3157w.c(0);
        C2839p c2839p = new C2839p(b.c(dVar), 1);
        c2839p.B();
        interfaceFutureC3857a.addListener(new ListenableFutureKt$await$2$1(c2839p, interfaceFutureC3857a), DirectExecutor.INSTANCE);
        c2839p.j(new ListenableFutureKt$await$2$2(interfaceFutureC3857a));
        I i8 = I.f6487a;
        Object y8 = c2839p.y();
        if (y8 == b.e()) {
            h.c(dVar);
        }
        AbstractC3157w.c(1);
        return y8;
    }
}
