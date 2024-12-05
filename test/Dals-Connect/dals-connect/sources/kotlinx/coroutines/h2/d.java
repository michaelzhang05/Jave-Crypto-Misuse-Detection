package kotlinx.coroutines.h2;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.e0;

/* compiled from: RxCancellable.kt */
/* loaded from: classes2.dex */
public final class d {
    public static final void a(Throwable th, CoroutineContext coroutineContext) {
        if (th instanceof CancellationException) {
            return;
        }
        try {
            h.a.a0.a.o(th);
        } catch (Throwable th2) {
            kotlin.b.a(th, th2);
            e0.a(coroutineContext, th);
        }
    }
}
