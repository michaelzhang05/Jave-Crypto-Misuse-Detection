package l6;

import O5.AbstractC1349e;
import q6.AbstractC3873h;

/* loaded from: classes5.dex */
public abstract class K {
    public static final void a(S5.g gVar, Throwable th) {
        try {
            J j8 = (J) gVar.get(J.f34566m0);
            if (j8 != null) {
                j8.handleException(gVar, th);
            } else {
                AbstractC3873h.a(gVar, th);
            }
        } catch (Throwable th2) {
            AbstractC3873h.a(gVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        AbstractC1349e.a(runtimeException, th);
        return runtimeException;
    }
}
