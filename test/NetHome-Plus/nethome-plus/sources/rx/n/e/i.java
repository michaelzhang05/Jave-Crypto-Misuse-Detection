package rx.n.e;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: RxThreadFactory.java */
/* loaded from: classes3.dex */
public final class i extends AtomicLong implements ThreadFactory {

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadFactory f23112f = new a();

    /* renamed from: g, reason: collision with root package name */
    final String f23113g;

    /* compiled from: RxThreadFactory.java */
    /* loaded from: classes3.dex */
    static class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            throw new AssertionError("No threads allowed.");
        }
    }

    public i(String str) {
        this.f23113g = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f23113g + incrementAndGet());
        thread.setDaemon(true);
        return thread;
    }
}
