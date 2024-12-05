package rx.n.a;

import java.util.concurrent.atomic.AtomicInteger;
import rx.e;

/* compiled from: OnSubscribeSwitchIfEmpty.java */
/* loaded from: classes3.dex */
public final class c0<T> implements e.a<T> {

    /* renamed from: f, reason: collision with root package name */
    final rx.e<? extends T> f22513f;

    /* renamed from: g, reason: collision with root package name */
    final rx.e<? extends T> f22514g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeSwitchIfEmpty.java */
    /* loaded from: classes3.dex */
    public static final class a<T> extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        private final rx.n.b.a f22515f;

        /* renamed from: g, reason: collision with root package name */
        private final rx.j<? super T> f22516g;

        a(rx.j<? super T> jVar, rx.n.b.a aVar) {
            this.f22516g = jVar;
            this.f22515f = aVar;
        }

        @Override // rx.f
        public void onCompleted() {
            this.f22516g.onCompleted();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            this.f22516g.onError(th);
        }

        @Override // rx.f
        public void onNext(T t) {
            this.f22516g.onNext(t);
            this.f22515f.b(1L);
        }

        @Override // rx.j
        public void setProducer(rx.g gVar) {
            this.f22515f.c(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeSwitchIfEmpty.java */
    /* loaded from: classes3.dex */
    public static final class b<T> extends rx.j<T> {

        /* renamed from: g, reason: collision with root package name */
        private final rx.j<? super T> f22518g;

        /* renamed from: h, reason: collision with root package name */
        private final rx.t.d f22519h;

        /* renamed from: i, reason: collision with root package name */
        private final rx.n.b.a f22520i;

        /* renamed from: j, reason: collision with root package name */
        private final rx.e<? extends T> f22521j;
        volatile boolean l;

        /* renamed from: f, reason: collision with root package name */
        private boolean f22517f = true;

        /* renamed from: k, reason: collision with root package name */
        final AtomicInteger f22522k = new AtomicInteger();

        b(rx.j<? super T> jVar, rx.t.d dVar, rx.n.b.a aVar, rx.e<? extends T> eVar) {
            this.f22518g = jVar;
            this.f22519h = dVar;
            this.f22520i = aVar;
            this.f22521j = eVar;
        }

        void c(rx.e<? extends T> eVar) {
            if (this.f22522k.getAndIncrement() != 0) {
                return;
            }
            while (!this.f22518g.isUnsubscribed()) {
                if (!this.l) {
                    if (eVar == null) {
                        a aVar = new a(this.f22518g, this.f22520i);
                        this.f22519h.b(aVar);
                        this.l = true;
                        this.f22521j.c1(aVar);
                    } else {
                        this.l = true;
                        eVar.c1(this);
                        eVar = null;
                    }
                }
                if (this.f22522k.decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // rx.f
        public void onCompleted() {
            if (!this.f22517f) {
                this.f22518g.onCompleted();
            } else {
                if (this.f22518g.isUnsubscribed()) {
                    return;
                }
                this.l = false;
                c(null);
            }
        }

        @Override // rx.f
        public void onError(Throwable th) {
            this.f22518g.onError(th);
        }

        @Override // rx.f
        public void onNext(T t) {
            this.f22517f = false;
            this.f22518g.onNext(t);
            this.f22520i.b(1L);
        }

        @Override // rx.j
        public void setProducer(rx.g gVar) {
            this.f22520i.c(gVar);
        }
    }

    public c0(rx.e<? extends T> eVar, rx.e<? extends T> eVar2) {
        this.f22513f = eVar;
        this.f22514g = eVar2;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.j<? super T> jVar) {
        rx.t.d dVar = new rx.t.d();
        rx.n.b.a aVar = new rx.n.b.a();
        b bVar = new b(jVar, dVar, aVar, this.f22514g);
        dVar.b(bVar);
        jVar.add(dVar);
        jVar.setProducer(aVar);
        bVar.c(this.f22513f);
    }
}
