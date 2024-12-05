package kotlinx.coroutines;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.Sequence;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
/* loaded from: classes2.dex */
public final class d0 {
    private static final List<CoroutineExceptionHandler> a;

    static {
        Sequence a2;
        List<CoroutineExceptionHandler> A;
        a2 = kotlin.sequences.l.a(defpackage.a.a());
        A = kotlin.sequences.n.A(a2);
        a = A;
    }

    public static final void a(CoroutineContext coroutineContext, Throwable th) {
        Iterator<CoroutineExceptionHandler> it = a.iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(coroutineContext, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e0.b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
