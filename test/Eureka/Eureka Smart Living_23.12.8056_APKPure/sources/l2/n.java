package l2;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class n implements o {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f7373a = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ n(m mVar) {
    }

    @Override // l2.c
    public final void a() {
        this.f7373a.countDown();
    }

    public final void b() {
        this.f7373a.await();
    }

    @Override // l2.e
    public final void c(Exception exc) {
        this.f7373a.countDown();
    }

    @Override // l2.f
    public final void d(Object obj) {
        this.f7373a.countDown();
    }

    public final boolean e(long j6, TimeUnit timeUnit) {
        return this.f7373a.await(j6, timeUnit);
    }
}
