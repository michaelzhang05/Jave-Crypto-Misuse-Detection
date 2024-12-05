package H0;

import android.os.Process;

/* renamed from: H0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC1171e implements Runnable {
    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
