package rx.t;

import java.util.concurrent.atomic.AtomicReference;
import rx.k;

/* compiled from: BooleanSubscription.java */
/* loaded from: classes3.dex */
public final class a implements k {

    /* renamed from: f, reason: collision with root package name */
    static final rx.m.a f23270f = new C0430a();

    /* renamed from: g, reason: collision with root package name */
    final AtomicReference<rx.m.a> f23271g;

    /* compiled from: BooleanSubscription.java */
    /* renamed from: rx.t.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0430a implements rx.m.a {
        C0430a() {
        }

        @Override // rx.m.a
        public void call() {
        }
    }

    public a() {
        this.f23271g = new AtomicReference<>();
    }

    public static a a() {
        return new a();
    }

    public static a b(rx.m.a aVar) {
        return new a(aVar);
    }

    @Override // rx.k
    public boolean isUnsubscribed() {
        return this.f23271g.get() == f23270f;
    }

    @Override // rx.k
    public void unsubscribe() {
        rx.m.a andSet;
        rx.m.a aVar = this.f23271g.get();
        rx.m.a aVar2 = f23270f;
        if (aVar == aVar2 || (andSet = this.f23271g.getAndSet(aVar2)) == null || andSet == aVar2) {
            return;
        }
        andSet.call();
    }

    private a(rx.m.a aVar) {
        this.f23271g = new AtomicReference<>(aVar);
    }
}
