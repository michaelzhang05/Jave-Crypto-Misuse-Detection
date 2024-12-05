package rx;

import rx.n.e.l;

/* compiled from: SingleSubscriber.java */
/* loaded from: classes2.dex */
public abstract class i<T> implements k {

    /* renamed from: f, reason: collision with root package name */
    private final l f22459f = new l();

    public final void b(k kVar) {
        this.f22459f.a(kVar);
    }

    public abstract void c(T t);

    @Override // rx.k
    public final boolean isUnsubscribed() {
        return this.f22459f.isUnsubscribed();
    }

    public abstract void onError(Throwable th);

    @Override // rx.k
    public final void unsubscribe() {
        this.f22459f.unsubscribe();
    }
}
