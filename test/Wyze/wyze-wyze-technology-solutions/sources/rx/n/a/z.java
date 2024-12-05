package rx.n.a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import rx.e;

/* compiled from: OnSubscribeRefCount.java */
/* loaded from: classes3.dex */
public final class z<T> implements e.a<T> {

    /* renamed from: f, reason: collision with root package name */
    private final rx.o.b<? extends T> f22946f;

    /* renamed from: g, reason: collision with root package name */
    volatile rx.t.b f22947g = new rx.t.b();

    /* renamed from: h, reason: collision with root package name */
    final AtomicInteger f22948h = new AtomicInteger(0);

    /* renamed from: i, reason: collision with root package name */
    final ReentrantLock f22949i = new ReentrantLock();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeRefCount.java */
    /* loaded from: classes3.dex */
    public class a implements rx.m.b<rx.k> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.j f22950f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f22951g;

        a(rx.j jVar, AtomicBoolean atomicBoolean) {
            this.f22950f = jVar;
            this.f22951g = atomicBoolean;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.k kVar) {
            try {
                z.this.f22947g.a(kVar);
                z zVar = z.this;
                zVar.d(this.f22950f, zVar.f22947g);
            } finally {
                z.this.f22949i.unlock();
                this.f22951g.set(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeRefCount.java */
    /* loaded from: classes3.dex */
    public class b extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.j f22953f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ rx.t.b f22954g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(rx.j jVar, rx.j jVar2, rx.t.b bVar) {
            super(jVar);
            this.f22953f = jVar2;
            this.f22954g = bVar;
        }

        void c() {
            z.this.f22949i.lock();
            try {
                if (z.this.f22947g == this.f22954g) {
                    if (z.this.f22946f instanceof rx.k) {
                        ((rx.k) z.this.f22946f).unsubscribe();
                    }
                    z.this.f22947g.unsubscribe();
                    z.this.f22947g = new rx.t.b();
                    z.this.f22948h.set(0);
                }
            } finally {
                z.this.f22949i.unlock();
            }
        }

        @Override // rx.f
        public void onCompleted() {
            c();
            this.f22953f.onCompleted();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            c();
            this.f22953f.onError(th);
        }

        @Override // rx.f
        public void onNext(T t) {
            this.f22953f.onNext(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeRefCount.java */
    /* loaded from: classes3.dex */
    public class c implements rx.m.a {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.t.b f22956f;

        c(rx.t.b bVar) {
            this.f22956f = bVar;
        }

        @Override // rx.m.a
        public void call() {
            z.this.f22949i.lock();
            try {
                if (z.this.f22947g == this.f22956f && z.this.f22948h.decrementAndGet() == 0) {
                    if (z.this.f22946f instanceof rx.k) {
                        ((rx.k) z.this.f22946f).unsubscribe();
                    }
                    z.this.f22947g.unsubscribe();
                    z.this.f22947g = new rx.t.b();
                }
            } finally {
                z.this.f22949i.unlock();
            }
        }
    }

    public z(rx.o.b<? extends T> bVar) {
        this.f22946f = bVar;
    }

    private rx.k c(rx.t.b bVar) {
        return rx.t.e.a(new c(bVar));
    }

    private rx.m.b<rx.k> e(rx.j<? super T> jVar, AtomicBoolean atomicBoolean) {
        return new a(jVar, atomicBoolean);
    }

    @Override // rx.m.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void call(rx.j<? super T> jVar) {
        boolean z;
        this.f22949i.lock();
        if (this.f22948h.incrementAndGet() == 1) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            try {
                this.f22946f.i1(e(jVar, atomicBoolean));
                if (z) {
                    return;
                } else {
                    return;
                }
            } finally {
                if (atomicBoolean.get()) {
                }
            }
        }
        try {
            d(jVar, this.f22947g);
        } finally {
            this.f22949i.unlock();
        }
    }

    void d(rx.j<? super T> jVar, rx.t.b bVar) {
        jVar.add(c(bVar));
        this.f22946f.c1(new b(jVar, jVar, bVar));
    }
}
