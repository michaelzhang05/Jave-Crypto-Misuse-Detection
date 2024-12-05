package androidx.activity.contextaware;

import L5.I;
import P5.d;
import Q5.b;
import android.content.Context;
import i6.C2839p;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3157w;

/* loaded from: classes.dex */
public final class ContextAwareKt {
    public static final <R> Object withContextAvailable(ContextAware contextAware, Function1 function1, d dVar) {
        Context peekAvailableContext = contextAware.peekAvailableContext();
        if (peekAvailableContext != null) {
            return function1.invoke(peekAvailableContext);
        }
        C2839p c2839p = new C2839p(b.c(dVar), 1);
        c2839p.B();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(c2839p, function1);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        c2839p.j(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        Object y8 = c2839p.y();
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
        AbstractC3157w.c(0);
        C2839p c2839p = new C2839p(b.c(dVar), 1);
        c2839p.B();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(c2839p, function1);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        c2839p.j(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        I i8 = I.f6487a;
        Object y8 = c2839p.y();
        if (y8 == b.e()) {
            h.c(dVar);
        }
        AbstractC3157w.c(1);
        return y8;
    }
}
