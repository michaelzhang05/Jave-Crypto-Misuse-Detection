package W;

import android.os.Process;

/* loaded from: classes3.dex */
final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f11330a;

    public b(Runnable runnable, int i8) {
        this.f11330a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f11330a.run();
    }
}
