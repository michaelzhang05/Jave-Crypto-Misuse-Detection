package androidx.activity.contextaware;

import O5.I;
import S5.d;
import T5.b;
import android.content.Context;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3253w;
import l6.C3374p;

/* loaded from: classes.dex */
public final class ContextAwareKt {
    public static final <R> Object withContextAvailable(ContextAware contextAware, Function1 function1, d dVar) {
        Context peekAvailableContext = contextAware.peekAvailableContext();
        if (peekAvailableContext != null) {
            return function1.invoke(peekAvailableContext);
        }
        C3374p c3374p = new C3374p(b.c(dVar), 1);
        c3374p.C();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(c3374p, function1);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        c3374p.i(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        Object y8 = c3374p.y();
        if (y8 == b.e()) {
            h.c(dVar);
        }
        return y8;
    }

    private static final <R> Object withContextAvailable$$forInline(ContextAware contextAware, Function1 function1, d dVar) {
        Context peekAvailableContext = contextAware.peekAvailableContext();
        if (peekAvailableContext != null) {
            return function1.invoke(peekAvailableContext);
        }
        AbstractC3253w.c(0);
        C3374p c3374p = new C3374p(b.c(dVar), 1);
        c3374p.C();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(c3374p, function1);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        c3374p.i(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        I i8 = I.f8278a;
        Object y8 = c3374p.y();
        if (y8 == b.e()) {
            h.c(dVar);
        }
        AbstractC3253w.c(1);
        return y8;
    }
}
