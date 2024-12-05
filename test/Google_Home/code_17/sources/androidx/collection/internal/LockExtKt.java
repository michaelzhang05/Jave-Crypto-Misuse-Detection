package androidx.collection.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3253w;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class LockExtKt {
    /* renamed from: synchronized, reason: not valid java name */
    public static final <T> T m134synchronized(Lock lock, Function0 block) {
        T t8;
        AbstractC3255y.i(lock, "<this>");
        AbstractC3255y.i(block, "block");
        synchronized (lock) {
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
