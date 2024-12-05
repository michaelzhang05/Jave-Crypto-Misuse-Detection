package androidx.datastore.core;

import O5.AbstractC1349e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3253w;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class CloseableKt {
    public static final <T extends Closeable, R> R use(T t8, Function1 block) {
        AbstractC3255y.i(t8, "<this>");
        AbstractC3255y.i(block, "block");
        try {
            R r8 = (R) block.invoke(t8);
            AbstractC3253w.b(1);
            try {
                t8.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            if (th == null) {
                AbstractC3253w.a(1);
                return r8;
            }
            throw th;
        } catch (Throwable th2) {
            AbstractC3253w.b(1);
            try {
                t8.close();
            } catch (Throwable th3) {
                AbstractC1349e.a(th2, th3);
            }
            throw th2;
        }
    }
}
