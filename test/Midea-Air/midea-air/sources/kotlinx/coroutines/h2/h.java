package kotlinx.coroutines.h2;

import h.a.s;
import h.a.t;
import h.a.v;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.b0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.l1;

/* compiled from: RxSingle.kt */
/* loaded from: classes2.dex */
public final class h {
    public static final <T> s<T> b(CoroutineContext coroutineContext, Function2<? super h0, ? super Continuation<? super T>, ? extends Object> function2) {
        if (coroutineContext.get(l1.f22259e) == null) {
            return d(e1.f22147f, coroutineContext, function2);
        }
        throw new IllegalArgumentException(l.m("Single context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had ", coroutineContext).toString());
    }

    public static /* synthetic */ s c(CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f22103f;
        }
        return b(coroutineContext, function2);
    }

    private static final <T> s<T> d(final h0 h0Var, final CoroutineContext coroutineContext, final Function2<? super h0, ? super Continuation<? super T>, ? extends Object> function2) {
        return s.c(new v() { // from class: kotlinx.coroutines.h2.b
            @Override // h.a.v
            public final void a(t tVar) {
                h.e(h0.this, coroutineContext, function2, tVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(h0 h0Var, CoroutineContext coroutineContext, Function2 function2, t tVar) {
        g gVar = new g(b0.c(h0Var, coroutineContext), tVar);
        tVar.b(new c(gVar));
        gVar.s0(j0.DEFAULT, gVar, function2);
    }
}
