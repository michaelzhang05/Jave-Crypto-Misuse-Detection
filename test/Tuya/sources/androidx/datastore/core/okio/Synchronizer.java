package androidx.datastore.core.okio;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3157w;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class Synchronizer {
    public final <T> T withLock(Function0 block) {
        T t8;
        AbstractC3159y.i(block, "block");
        synchronized (this) {
            try {
                t8 = (T) block.invoke();
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
