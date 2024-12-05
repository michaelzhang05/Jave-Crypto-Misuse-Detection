package rx.n.a;

import java.util.concurrent.atomic.AtomicInteger;
import rx.e;

/* compiled from: OnSubscribeAutoConnect.java */
/* loaded from: classes3.dex */
public final class i<T> extends AtomicInteger implements e.a<T> {

    /* renamed from: f, reason: collision with root package name */
    final rx.o.b<? extends T> f22622f;

    /* renamed from: g, reason: collision with root package name */
    final int f22623g;

    /* renamed from: h, reason: collision with root package name */
    final rx.m.b<? super rx.k> f22624h;

    public i(rx.o.b<? extends T> bVar, int i2, rx.m.b<? super rx.k> bVar2) {
        if (i2 > 0) {
            this.f22622f = bVar;
            this.f22623g = i2;
            this.f22624h = bVar2;
            return;
        }
        throw new IllegalArgumentException("numberOfSubscribers > 0 required");
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.j<? super T> jVar) {
        this.f22622f.c1(rx.p.f.c(jVar));
        if (incrementAndGet() == this.f22623g) {
            this.f22622f.i1(this.f22624h);
        }
    }
}
