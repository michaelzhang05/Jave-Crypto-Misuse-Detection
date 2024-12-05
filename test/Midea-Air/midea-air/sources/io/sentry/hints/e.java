package io.sentry.hints;

import io.sentry.s4;
import io.sentry.w1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: BlockingFlushHint.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public abstract class e implements g, i {
    private final CountDownLatch a = new CountDownLatch(1);

    /* renamed from: b, reason: collision with root package name */
    private final long f18952b;

    /* renamed from: c, reason: collision with root package name */
    private final w1 f18953c;

    public e(long j2, w1 w1Var) {
        this.f18952b = j2;
        this.f18953c = w1Var;
    }

    @Override // io.sentry.hints.g
    public void b() {
        this.a.countDown();
    }

    @Override // io.sentry.hints.i
    public boolean e() {
        try {
            return this.a.await(this.f18952b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            this.f18953c.b(s4.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e2);
            return false;
        }
    }
}
