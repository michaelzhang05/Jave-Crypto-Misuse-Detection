package androidx.lifecycle.viewmodel.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3157w;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class SynchronizedObject_jvmKt {
    public static final <T> T synchronizedImpl(SynchronizedObject lock, Function0 action) {
        T t8;
        AbstractC3159y.i(lock, "lock");
        AbstractC3159y.i(action, "action");
        synchronized (lock) {
            try {
                t8 = (T) action.invoke();
                AbstractC3157w.b(1);
            } catch (Throwable th) {
                AbstractC3157w.b(1);
                AbstractC3157w.a(1);
                throw th;
            }
        }
        AbstractC3157w.a(1);
        return t8;
    }
}
