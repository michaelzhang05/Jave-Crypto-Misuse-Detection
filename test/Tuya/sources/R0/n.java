package r0;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class n implements o {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f37525a = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ n(m mVar) {
    }

    public final void a() {
        this.f37525a.await();
    }

    @Override // r0.InterfaceC3676g
    public final void b(Object obj) {
        this.f37525a.countDown();
    }

    @Override // r0.InterfaceC3673d
    public final void c() {
        this.f37525a.countDown();
    }

    @Override // r0.InterfaceC3675f
    public final void d(Exception exc) {
        this.f37525a.countDown();
    }

    public final boolean e(long j8, TimeUnit timeUnit) {
        return this.f37525a.await(j8, timeUnit);
    }
}
