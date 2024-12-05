package androidx.collection.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3253w;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class Lock {
    public final <T> T synchronizedImpl(Function0 block) {
        T t8;
        AbstractC3255y.i(block, "block");
        synchronized (this) {
            try {
                t8 = (T) block.invoke();
                AbstractC3253w.b(1);
            } catch (Throwable th) {
                AbstractC3253w.b(1);
                AbstractC3253w.a(1);
                throw th;
            }
        }
        AbstractC3253w.a(1);
        return t8;
    }
}
