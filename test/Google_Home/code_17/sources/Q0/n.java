package q0;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class n implements o {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f38077a = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ n(m mVar) {
    }

    @Override // q0.InterfaceC3823g
    public final void a(Object obj) {
        this.f38077a.countDown();
    }

    public final void b() {
        this.f38077a.await();
    }

    @Override // q0.InterfaceC3820d
    public final void c() {
        this.f38077a.countDown();
    }

    @Override // q0.InterfaceC3822f
    public final void d(Exception exc) {
        this.f38077a.countDown();
    }

    public final boolean e(long j8, TimeUnit timeUnit) {
        return this.f38077a.await(j8, timeUnit);
    }
}
