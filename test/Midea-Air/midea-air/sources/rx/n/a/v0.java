package rx.n.a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.e;
import rx.h;

/* compiled from: OperatorSampleWithTime.java */
/* loaded from: classes3.dex */
public final class v0<T> implements e.b<T, T> {

    /* renamed from: f, reason: collision with root package name */
    final long f22881f;

    /* renamed from: g, reason: collision with root package name */
    final TimeUnit f22882g;

    /* renamed from: h, reason: collision with root package name */
    final rx.h f22883h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorSampleWithTime.java */
    /* loaded from: classes3.dex */
    public static final class a<T> extends rx.j<T> implements rx.m.a {

        /* renamed from: f, reason: collision with root package name */
        private static final Object f22884f = new Object();

        /* renamed from: g, reason: collision with root package name */
        private final rx.j<? super T> f22885g;

        /* renamed from: h, reason: collision with root package name */
        final AtomicReference<Object> f22886h = new AtomicReference<>(f22884f);

        public a(rx.j<? super T> jVar) {
            this.f22885g = jVar;
        }

        private void c() {
            AtomicReference<Object> atomicReference = this.f22886h;
            Object obj = f22884f;
            Object andSet = atomicReference.getAndSet(obj);
            if (andSet != obj) {
                try {
                    this.f22885g.onNext(andSet);
                } catch (Throwable th) {
                    rx.exceptions.a.f(th, this);
                }
            }
        }

        @Override // rx.m.a
        public void call() {
            c();
        }

        @Override // rx.f
        public void onCompleted() {
            c();
            this.f22885g.onCompleted();
            unsubscribe();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            this.f22885g.onError(th);
            unsubscribe();
        }

        @Override // rx.f
        public void onNext(T t) {
            this.f22886h.set(t);
        }

        @Override // rx.j
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public v0(long j2, TimeUnit timeUnit, rx.h hVar) {
        this.f22881f = j2;
        this.f22882g = timeUnit;
        this.f22883h = hVar;
    }

    @Override // rx.m.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rx.j<? super T> call(rx.j<? super T> jVar) {
        rx.p.e eVar = new rx.p.e(jVar);
        h.a createWorker = this.f22883h.createWorker();
        jVar.add(createWorker);
        a aVar = new a(eVar);
        jVar.add(aVar);
        long j2 = this.f22881f;
        createWorker.e(aVar, j2, j2, this.f22882g);
        return aVar;
    }
}
