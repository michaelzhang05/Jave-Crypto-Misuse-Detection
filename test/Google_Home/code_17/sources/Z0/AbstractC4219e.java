package z0;

import java.util.concurrent.Future;

/* renamed from: z0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4219e {
    public static Object a(Future future) {
        Object obj;
        boolean z8 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z8 = true;
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }
}
