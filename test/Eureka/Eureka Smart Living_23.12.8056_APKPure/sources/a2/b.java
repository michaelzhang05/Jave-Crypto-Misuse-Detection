package a2;

import android.os.Process;

/* loaded from: classes.dex */
final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f35a;

    public b(Runnable runnable, int i6) {
        this.f35a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f35a.run();
    }
}
