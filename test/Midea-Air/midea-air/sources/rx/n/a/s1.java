package rx.n.a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.Single;
import rx.h;

/* compiled from: SingleTimeout.java */
/* loaded from: classes3.dex */
public final class s1<T> implements Single.j<T> {

    /* renamed from: f, reason: collision with root package name */
    final Single.j<T> f22843f;

    /* renamed from: g, reason: collision with root package name */
    final long f22844g;

    /* renamed from: h, reason: collision with root package name */
    final TimeUnit f22845h;

    /* renamed from: i, reason: collision with root package name */
    final rx.h f22846i;

    /* renamed from: j, reason: collision with root package name */
    final Single.j<? extends T> f22847j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleTimeout.java */
    /* loaded from: classes3.dex */
    public static final class a<T> extends rx.i<T> implements rx.m.a {

        /* renamed from: g, reason: collision with root package name */
        final rx.i<? super T> f22848g;

        /* renamed from: h, reason: collision with root package name */
        final AtomicBoolean f22849h = new AtomicBoolean();

        /* renamed from: i, reason: collision with root package name */
        final Single.j<? extends T> f22850i;

        /* compiled from: SingleTimeout.java */
        /* renamed from: rx.n.a.s1$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0408a<T> extends rx.i<T> {

            /* renamed from: g, reason: collision with root package name */
            final rx.i<? super T> f22851g;

            C0408a(rx.i<? super T> iVar) {
                this.f22851g = iVar;
            }

            @Override // rx.i
            public void c(T t) {
                this.f22851g.c(t);
            }

            @Override // rx.i
            public void onError(Throwable th) {
                this.f22851g.onError(th);
            }
        }

        a(rx.i<? super T> iVar, Single.j<? extends T> jVar) {
            this.f22848g = iVar;
            this.f22850i = jVar;
        }

        @Override // rx.i
        public void c(T t) {
            if (this.f22849h.compareAndSet(false, true)) {
                try {
                    this.f22848g.c(t);
                } finally {
                    unsubscribe();
                }
            }
        }

        @Override // rx.m.a
        public void call() {
            if (this.f22849h.compareAndSet(false, true)) {
                try {
                    Single.j<? extends T> jVar = this.f22850i;
                    if (jVar == null) {
                        this.f22848g.onError(new TimeoutException());
                    } else {
                        C0408a c0408a = new C0408a(this.f22848g);
                        this.f22848g.b(c0408a);
                        jVar.call(c0408a);
                    }
                } finally {
                    unsubscribe();
                }
            }
        }

        @Override // rx.i
        public void onError(Throwable th) {
            if (this.f22849h.compareAndSet(false, true)) {
                try {
                    this.f22848g.onError(th);
                    return;
                } finally {
                    unsubscribe();
                }
            }
            rx.q.c.j(th);
        }
    }

    public s1(Single.j<T> jVar, long j2, TimeUnit timeUnit, rx.h hVar, Single.j<? extends T> jVar2) {
        this.f22843f = jVar;
        this.f22844g = j2;
        this.f22845h = timeUnit;
        this.f22846i = hVar;
        this.f22847j = jVar2;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.i<? super T> iVar) {
        a aVar = new a(iVar, this.f22847j);
        h.a createWorker = this.f22846i.createWorker();
        aVar.b(createWorker);
        iVar.b(aVar);
        createWorker.d(aVar, this.f22844g, this.f22845h);
        this.f22843f.call(aVar);
    }
}
