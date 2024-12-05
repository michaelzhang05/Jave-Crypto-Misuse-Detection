package k6;

import i6.AbstractC2834m0;
import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
abstract /* synthetic */ class m {
    public static final void a(u uVar, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = AbstractC2834m0.a("Channel was consumed, consumer had failed", th);
            }
        }
        uVar.cancel(cancellationException);
    }
}
