package kotlinx.coroutines.h2;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.l;
import kotlin.u;
import kotlinx.coroutines.b0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.l1;

/* compiled from: RxCompletable.kt */
/* loaded from: classes2.dex */
public final class f {
    public static final h.a.b b(CoroutineContext coroutineContext, Function2<? super h0, ? super Continuation<? super u>, ? extends Object> function2) {
        if (coroutineContext.get(l1.f22259e) == null) {
            return d(e1.f22147f, coroutineContext, function2);
        }
        throw new IllegalArgumentException(l.m("Completable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had ", coroutineContext).toString());
    }

    public static /* synthetic */ h.a.b c(CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f22103f;
        }
        return b(coroutineContext, function2);
    }

    private static final h.a.b d(final h0 h0Var, final CoroutineContext coroutineContext, final Function2<? super h0, ? super Continuation<? super u>, ? extends Object> function2) {
        return h.a.b.c(new h.a.e() { // from class: kotlinx.coroutines.h2.a
            @Override // h.a.e
            public final void a(h.a.c cVar) {
                f.e(h0.this, coroutineContext, function2, cVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(h0 h0Var, CoroutineContext coroutineContext, Function2 function2, h.a.c cVar) {
        e eVar = new e(b0.c(h0Var, coroutineContext), cVar);
        cVar.b(new c(eVar));
        eVar.s0(j0.DEFAULT, eVar, function2);
    }
}
