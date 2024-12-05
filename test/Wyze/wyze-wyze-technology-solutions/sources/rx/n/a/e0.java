package rx.n.a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import rx.e;
import rx.h;

/* compiled from: OnSubscribeTimeoutTimedWithFallback.java */
/* loaded from: classes3.dex */
public final class e0<T> implements e.a<T> {

    /* renamed from: f, reason: collision with root package name */
    final rx.e<T> f22540f;

    /* renamed from: g, reason: collision with root package name */
    final long f22541g;

    /* renamed from: h, reason: collision with root package name */
    final TimeUnit f22542h;

    /* renamed from: i, reason: collision with root package name */
    final rx.h f22543i;

    /* renamed from: j, reason: collision with root package name */
    final rx.e<? extends T> f22544j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeTimeoutTimedWithFallback.java */
    /* loaded from: classes3.dex */
    public static final class a<T> extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        final rx.j<? super T> f22545f;

        /* renamed from: g, reason: collision with root package name */
        final rx.n.b.a f22546g;

        a(rx.j<? super T> jVar, rx.n.b.a aVar) {
            this.f22545f = jVar;
            this.f22546g = aVar;
        }

        @Override // rx.f
        public void onCompleted() {
            this.f22545f.onCompleted();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            this.f22545f.onError(th);
        }

        @Override // rx.f
        public void onNext(T t) {
            this.f22545f.onNext(t);
        }

        @Override // rx.j
        public void setProducer(rx.g gVar) {
            this.f22546g.c(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeTimeoutTimedWithFallback.java */
    /* loaded from: classes3.dex */
    public static final class b<T> extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        final rx.j<? super T> f22547f;

        /* renamed from: g, reason: collision with root package name */
        final long f22548g;

        /* renamed from: h, reason: collision with root package name */
        final TimeUnit f22549h;

        /* renamed from: i, reason: collision with root package name */
        final h.a f22550i;

        /* renamed from: j, reason: collision with root package name */
        final rx.e<? extends T> f22551j;

        /* renamed from: k, reason: collision with root package name */
        final rx.n.b.a f22552k = new rx.n.b.a();
        final AtomicLong l = new AtomicLong();
        final rx.n.d.a m;
        final rx.n.d.a n;
        long o;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OnSubscribeTimeoutTimedWithFallback.java */
        /* loaded from: classes3.dex */
        public final class a implements rx.m.a {

            /* renamed from: f, reason: collision with root package name */
            final long f22553f;

            a(long j2) {
                this.f22553f = j2;
            }

            @Override // rx.m.a
            public void call() {
                b.this.c(this.f22553f);
            }
        }

        b(rx.j<? super T> jVar, long j2, TimeUnit timeUnit, h.a aVar, rx.e<? extends T> eVar) {
            this.f22547f = jVar;
            this.f22548g = j2;
            this.f22549h = timeUnit;
            this.f22550i = aVar;
            this.f22551j = eVar;
            rx.n.d.a aVar2 = new rx.n.d.a();
            this.m = aVar2;
            this.n = new rx.n.d.a(this);
            add(aVar);
            add(aVar2);
        }

        void c(long j2) {
            if (this.l.compareAndSet(j2, Long.MAX_VALUE)) {
                unsubscribe();
                if (this.f22551j == null) {
                    this.f22547f.onError(new TimeoutException());
                    return;
                }
                long j3 = this.o;
                if (j3 != 0) {
                    this.f22552k.b(j3);
                }
                a aVar = new a(this.f22547f, this.f22552k);
                if (this.n.b(aVar)) {
                    this.f22551j.E0(aVar);
                }
            }
        }

        void d(long j2) {
            this.m.b(this.f22550i.d(new a(j2), this.f22548g, this.f22549h));
        }

        @Override // rx.f
        public void onCompleted() {
            if (this.l.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.m.unsubscribe();
                this.f22547f.onCompleted();
                this.f22550i.unsubscribe();
            }
        }

        @Override // rx.f
        public void onError(Throwable th) {
            if (this.l.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.m.unsubscribe();
                this.f22547f.onError(th);
                this.f22550i.unsubscribe();
                return;
            }
            rx.q.c.j(th);
        }

        @Override // rx.f
        public void onNext(T t) {
            long j2 = this.l.get();
            if (j2 != Long.MAX_VALUE) {
                long j3 = j2 + 1;
                if (this.l.compareAndSet(j2, j3)) {
                    rx.k kVar = this.m.get();
                    if (kVar != null) {
                        kVar.unsubscribe();
                    }
                    this.o++;
                    this.f22547f.onNext(t);
                    d(j3);
                }
            }
        }

        @Override // rx.j
        public void setProducer(rx.g gVar) {
            this.f22552k.c(gVar);
        }
    }

    public e0(rx.e<T> eVar, long j2, TimeUnit timeUnit, rx.h hVar, rx.e<? extends T> eVar2) {
        this.f22540f = eVar;
        this.f22541g = j2;
        this.f22542h = timeUnit;
        this.f22543i = hVar;
        this.f22544j = eVar2;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.j<? super T> jVar) {
        b bVar = new b(jVar, this.f22541g, this.f22542h, this.f22543i.createWorker(), this.f22544j);
        jVar.add(bVar.n);
        jVar.setProducer(bVar.f22552k);
        bVar.d(0L);
        this.f22540f.E0(bVar);
    }
}
