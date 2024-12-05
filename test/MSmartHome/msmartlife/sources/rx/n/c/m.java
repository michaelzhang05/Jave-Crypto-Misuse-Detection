package rx.n.c;

import rx.h;

/* compiled from: SleepingAction.java */
/* loaded from: classes3.dex */
class m implements rx.m.a {

    /* renamed from: f, reason: collision with root package name */
    private final rx.m.a f23074f;

    /* renamed from: g, reason: collision with root package name */
    private final h.a f23075g;

    /* renamed from: h, reason: collision with root package name */
    private final long f23076h;

    public m(rx.m.a aVar, h.a aVar2, long j2) {
        this.f23074f = aVar;
        this.f23075g = aVar2;
        this.f23076h = j2;
    }

    @Override // rx.m.a
    public void call() {
        if (this.f23075g.isUnsubscribed()) {
            return;
        }
        long b2 = this.f23076h - this.f23075g.b();
        if (b2 > 0) {
            try {
                Thread.sleep(b2);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                rx.exceptions.a.c(e2);
            }
        }
        if (this.f23075g.isUnsubscribed()) {
            return;
        }
        this.f23074f.call();
    }
}
