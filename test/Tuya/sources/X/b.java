package X;

import android.os.Process;

/* loaded from: classes3.dex */
final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f12168a;

    public b(Runnable runnable, int i8) {
        this.f12168a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f12168a.run();
    }
}
