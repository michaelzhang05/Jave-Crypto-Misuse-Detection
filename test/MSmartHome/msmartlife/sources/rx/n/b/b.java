package rx.n.b;

import java.util.concurrent.atomic.AtomicInteger;
import rx.g;
import rx.j;

/* compiled from: SingleDelayedProducer.java */
/* loaded from: classes3.dex */
public final class b<T> extends AtomicInteger implements g {

    /* renamed from: f, reason: collision with root package name */
    final j<? super T> f22976f;

    /* renamed from: g, reason: collision with root package name */
    T f22977g;

    public b(j<? super T> jVar) {
        this.f22976f = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void a(j<? super T> jVar, T t) {
        if (jVar.isUnsubscribed()) {
            return;
        }
        try {
            jVar.onNext(t);
            if (jVar.isUnsubscribed()) {
                return;
            }
            jVar.onCompleted();
        } catch (Throwable th) {
            rx.exceptions.a.g(th, jVar, t);
        }
    }

    public void b(T t) {
        do {
            int i2 = get();
            if (i2 == 0) {
                this.f22977g = t;
            } else {
                if (i2 == 2 && compareAndSet(2, 3)) {
                    a(this.f22976f, t);
                    return;
                }
                return;
            }
        } while (!compareAndSet(0, 1));
    }

    @Override // rx.g
    public void request(long j2) {
        if (j2 >= 0) {
            if (j2 == 0) {
                return;
            }
            do {
                int i2 = get();
                if (i2 != 0) {
                    if (i2 == 1 && compareAndSet(1, 3)) {
                        a(this.f22976f, this.f22977g);
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
            return;
        }
        throw new IllegalArgumentException("n >= 0 required");
    }
}
