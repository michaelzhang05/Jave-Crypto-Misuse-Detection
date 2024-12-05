package G;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class c extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f2887a;

    /* renamed from: b, reason: collision with root package name */
    private final long f2888b;

    /* renamed from: c, reason: collision with root package name */
    final CountDownLatch f2889c = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    boolean f2890d = false;

    public c(a aVar, long j8) {
        this.f2887a = new WeakReference(aVar);
        this.f2888b = j8;
        start();
    }

    private final void a() {
        a aVar = (a) this.f2887a.get();
        if (aVar != null) {
            aVar.c();
            this.f2890d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (!this.f2889c.await(this.f2888b, TimeUnit.MILLISECONDS)) {
                a();
            }
        } catch (InterruptedException unused) {
            a();
        }
    }
}
