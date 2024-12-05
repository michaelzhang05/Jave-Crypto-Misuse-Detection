package rx.t;

import rx.k;

/* compiled from: SerialSubscription.java */
/* loaded from: classes3.dex */
public final class d implements k {

    /* renamed from: f, reason: collision with root package name */
    final rx.n.d.a f23275f = new rx.n.d.a();

    public k a() {
        return this.f23275f.a();
    }

    public void b(k kVar) {
        if (kVar != null) {
            this.f23275f.c(kVar);
            return;
        }
        throw new IllegalArgumentException("Subscription can not be null");
    }

    @Override // rx.k
    public boolean isUnsubscribed() {
        return this.f23275f.isUnsubscribed();
    }

    @Override // rx.k
    public void unsubscribe() {
        this.f23275f.unsubscribe();
    }
}
