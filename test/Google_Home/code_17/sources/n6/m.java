package n6;

import java.util.concurrent.CancellationException;
import l6.AbstractC3369m0;

/* loaded from: classes5.dex */
abstract /* synthetic */ class m {
    public static final void a(u uVar, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = AbstractC3369m0.a("Channel was consumed, consumer had failed", th);
            }
        }
        uVar.cancel(cancellationException);
    }
}
