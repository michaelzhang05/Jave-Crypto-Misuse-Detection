package rx.p;

import rx.exceptions.CompositeException;
import rx.exceptions.OnCompletedFailedException;
import rx.exceptions.OnErrorFailedException;
import rx.k;

/* compiled from: SafeCompletableSubscriber.java */
/* loaded from: classes3.dex */
public final class b implements rx.c, k {

    /* renamed from: f, reason: collision with root package name */
    final rx.c f23194f;

    /* renamed from: g, reason: collision with root package name */
    k f23195g;

    /* renamed from: h, reason: collision with root package name */
    boolean f23196h;

    public b(rx.c cVar) {
        this.f23194f = cVar;
    }

    @Override // rx.c
    public void a(k kVar) {
        this.f23195g = kVar;
        try {
            this.f23194f.a(this);
        } catch (Throwable th) {
            rx.exceptions.a.e(th);
            kVar.unsubscribe();
            onError(th);
        }
    }

    @Override // rx.k
    public boolean isUnsubscribed() {
        return this.f23196h || this.f23195g.isUnsubscribed();
    }

    @Override // rx.c
    public void onCompleted() {
        if (this.f23196h) {
            return;
        }
        this.f23196h = true;
        try {
            this.f23194f.onCompleted();
        } catch (Throwable th) {
            rx.exceptions.a.e(th);
            throw new OnCompletedFailedException(th);
        }
    }

    @Override // rx.c
    public void onError(Throwable th) {
        if (this.f23196h) {
            rx.q.c.j(th);
            return;
        }
        this.f23196h = true;
        try {
            this.f23194f.onError(th);
        } catch (Throwable th2) {
            rx.exceptions.a.e(th2);
            throw new OnErrorFailedException(new CompositeException(th, th2));
        }
    }

    @Override // rx.k
    public void unsubscribe() {
        this.f23195g.unsubscribe();
    }
}
