package g.a.a.a;

import h.a.i;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.e;
import rx.g;
import rx.j;
import rx.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FlowableV2ToObservableV1.java */
/* loaded from: classes2.dex */
public final class c<T> implements e.a<T> {

    /* renamed from: f, reason: collision with root package name */
    final k.a.a<T> f17941f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableV2ToObservableV1.java */
    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicReference<k.a.c> implements i<T>, k, g {

        /* renamed from: f, reason: collision with root package name */
        final j<? super T> f17942f;

        /* renamed from: g, reason: collision with root package name */
        final AtomicLong f17943g = new AtomicLong();

        a(j<? super T> jVar) {
            this.f17942f = jVar;
        }

        @Override // k.a.b
        public void a() {
            this.f17942f.onCompleted();
        }

        @Override // k.a.b
        public void b(k.a.c cVar) {
            h.a.z.i.b.i(this, this.f17943g, cVar);
        }

        @Override // rx.k
        public boolean isUnsubscribed() {
            return h.a.z.i.b.CANCELLED == get();
        }

        @Override // k.a.b
        public void onError(Throwable th) {
            this.f17942f.onError(th);
        }

        @Override // k.a.b
        public void onNext(T t) {
            this.f17942f.onNext(t);
        }

        @Override // rx.g
        public void request(long j2) {
            if (j2 != 0) {
                h.a.z.i.b.f(this, this.f17943g, j2);
            }
        }

        @Override // rx.k
        public void unsubscribe() {
            h.a.z.i.b.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(k.a.a<T> aVar) {
        this.f17941f = aVar;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(j<? super T> jVar) {
        a aVar = new a(jVar);
        jVar.add(aVar);
        jVar.setProducer(aVar);
        this.f17941f.b(aVar);
    }
}
