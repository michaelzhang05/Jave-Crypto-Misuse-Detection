package a0;

import android.os.Process;

/* renamed from: a0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1548c extends Thread {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1548c(ThreadGroup threadGroup, String str) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
