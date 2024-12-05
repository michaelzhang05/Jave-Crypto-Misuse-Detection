package androidx.work;

import O5.I;
import S5.d;
import T5.b;
import androidx.annotation.RestrictTo;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.AbstractC3253w;
import l6.C3374p;
import z0.InterfaceFutureC4218d;

/* loaded from: classes3.dex */
public final class ListenableFutureKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <R> Object await(InterfaceFutureC4218d interfaceFutureC4218d, d dVar) {
        if (interfaceFutureC4218d.isDone()) {
            try {
                return interfaceFutureC4218d.get();
            } catch (ExecutionException e8) {
                Throwable cause = e8.getCause();
                if (cause == null) {
                    throw e8;
                }
                throw cause;
            }
        }
        C3374p c3374p = new C3374p(b.c(dVar), 1);
        c3374p.C();
        interfaceFutureC4218d.addListener(new ListenableFutureKt$await$2$1(c3374p, interfaceFutureC4218d), DirectExecutor.INSTANCE);
        c3374p.i(new ListenableFutureKt$await$2$2(interfaceFutureC4218d));
        Object y8 = c3374p.y();
        if (y8 == b.e()) {
            h.c(dVar);
        }
        return y8;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private static final <R> Object await$$forInline(InterfaceFutureC4218d interfaceFutureC4218d, d dVar) {
        if (interfaceFutureC4218d.isDone()) {
            try {
                return interfaceFutureC4218d.get();
            } catch (ExecutionException e8) {
                Throwable cause = e8.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw e8;
            }
        }
        AbstractC3253w.c(0);
        C3374p c3374p = new C3374p(b.c(dVar), 1);
        c3374p.C();
        interfaceFutureC4218d.addListener(new ListenableFutureKt$await$2$1(c3374p, interfaceFutureC4218d), DirectExecutor.INSTANCE);
        c3374p.i(new ListenableFutureKt$await$2$2(interfaceFutureC4218d));
        I i8 = I.f8278a;
        Object y8 = c3374p.y();
        if (y8 == b.e()) {
            h.c(dVar);
        }
        AbstractC3253w.c(1);
        return y8;
    }
}
