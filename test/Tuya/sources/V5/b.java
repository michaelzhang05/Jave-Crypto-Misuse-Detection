package V5;

import L5.AbstractC1221e;
import java.io.Closeable;

/* loaded from: classes5.dex */
public abstract class b {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC1221e.a(th, th2);
            }
        }
    }
}
