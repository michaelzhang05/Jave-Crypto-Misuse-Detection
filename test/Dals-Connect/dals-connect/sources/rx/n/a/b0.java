package rx.n.a;

import java.util.concurrent.TimeUnit;
import rx.e;
import rx.h;

/* compiled from: OnSubscribeSkipTimed.java */
/* loaded from: classes3.dex */
public final class b0<T> implements e.a<T> {

    /* renamed from: f, reason: collision with root package name */
    final long f22495f;

    /* renamed from: g, reason: collision with root package name */
    final TimeUnit f22496g;

    /* renamed from: h, reason: collision with root package name */
    final rx.h f22497h;

    /* renamed from: i, reason: collision with root package name */
    final rx.e<T> f22498i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeSkipTimed.java */
    /* loaded from: classes3.dex */
    public static final class a<T> extends rx.j<T> implements rx.m.a {

        /* renamed from: f, reason: collision with root package name */
        final rx.j<? super T> f22499f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f22500g;

        a(rx.j<? super T> jVar) {
            this.f22499f = jVar;
        }

        @Override // rx.m.a
        public void call() {
            this.f22500g = true;
        }

        @Override // rx.f
        public void onCompleted() {
            try {
                this.f22499f.onCompleted();
            } finally {
                unsubscribe();
            }
        }

        @Override // rx.f
        public void onError(Throwable th) {
            try {
                this.f22499f.onError(th);
            } finally {
                unsubscribe();
            }
        }

        @Override // rx.f
        public void onNext(T t) {
            if (this.f22500g) {
                this.f22499f.onNext(t);
            }
        }
    }

    public b0(rx.e<T> eVar, long j2, TimeUnit timeUnit, rx.h hVar) {
        this.f22498i = eVar;
        this.f22495f = j2;
        this.f22496g = timeUnit;
        this.f22497h = hVar;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.j<? super T> jVar) {
        h.a createWorker = this.f22497h.createWorker();
        a aVar = new a(jVar);
        aVar.add(createWorker);
        jVar.add(aVar);
        createWorker.d(aVar, this.f22495f, this.f22496g);
        this.f22498i.c1(aVar);
    }
}
