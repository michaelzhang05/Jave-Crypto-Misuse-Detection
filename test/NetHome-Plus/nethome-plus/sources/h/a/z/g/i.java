package h.a.z.g;

import java.util.concurrent.Callable;

/* compiled from: ScheduledDirectTask.java */
/* loaded from: classes2.dex */
public final class i extends a implements Callable<Void> {
    public i(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void call() throws Exception {
        this.f18168i = Thread.currentThread();
        try {
            this.f18167h.run();
            return null;
        } finally {
            lazySet(a.f18165f);
            this.f18168i = null;
        }
    }
}
