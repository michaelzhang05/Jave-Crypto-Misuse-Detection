package p6;

import i6.Q;

/* renamed from: p6.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3622k extends AbstractRunnableC3619h {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f37121c;

    public C3622k(Runnable runnable, long j8, InterfaceC3620i interfaceC3620i) {
        super(j8, interfaceC3620i);
        this.f37121c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f37121c.run();
        } finally {
            this.f37119b.a();
        }
    }

    public String toString() {
        return "Task[" + Q.a(this.f37121c) + '@' + Q.b(this.f37121c) + ", " + this.f37118a + ", " + this.f37119b + ']';
    }
}
