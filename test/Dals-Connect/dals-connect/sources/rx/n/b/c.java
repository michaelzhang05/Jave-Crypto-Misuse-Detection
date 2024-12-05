package rx.n.b;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.g;
import rx.j;

/* compiled from: SingleProducer.java */
/* loaded from: classes3.dex */
public final class c<T> extends AtomicBoolean implements g {

    /* renamed from: f, reason: collision with root package name */
    final j<? super T> f22978f;

    /* renamed from: g, reason: collision with root package name */
    final T f22979g;

    public c(j<? super T> jVar, T t) {
        this.f22978f = jVar;
        this.f22979g = t;
    }

    @Override // rx.g
    public void request(long j2) {
        if (j2 >= 0) {
            if (j2 != 0 && compareAndSet(false, true)) {
                j<? super T> jVar = this.f22978f;
                if (jVar.isUnsubscribed()) {
                    return;
                }
                T t = this.f22979g;
                try {
                    jVar.onNext(t);
                    if (jVar.isUnsubscribed()) {
                        return;
                    }
                    jVar.onCompleted();
                    return;
                } catch (Throwable th) {
                    rx.exceptions.a.g(th, jVar, t);
                    return;
                }
            }
            return;
        }
        throw new IllegalArgumentException("n >= 0 required");
    }
}
