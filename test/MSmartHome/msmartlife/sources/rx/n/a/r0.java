package rx.n.a;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import rx.e;
import rx.exceptions.MissingBackpressureException;
import rx.h;

/* compiled from: OperatorObserveOn.java */
/* loaded from: classes3.dex */
public final class r0<T> implements e.b<T, T> {

    /* renamed from: f, reason: collision with root package name */
    private final rx.h f22813f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f22814g;

    /* renamed from: h, reason: collision with root package name */
    private final int f22815h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorObserveOn.java */
    /* loaded from: classes3.dex */
    public static final class a<T> extends rx.j<T> implements rx.m.a {

        /* renamed from: f, reason: collision with root package name */
        final rx.j<? super T> f22816f;

        /* renamed from: g, reason: collision with root package name */
        final h.a f22817g;

        /* renamed from: h, reason: collision with root package name */
        final boolean f22818h;

        /* renamed from: i, reason: collision with root package name */
        final Queue<Object> f22819i;

        /* renamed from: j, reason: collision with root package name */
        final int f22820j;

        /* renamed from: k, reason: collision with root package name */
        volatile boolean f22821k;
        final AtomicLong l = new AtomicLong();
        final AtomicLong m = new AtomicLong();
        Throwable n;
        long o;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OperatorObserveOn.java */
        /* renamed from: rx.n.a.r0$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0406a implements rx.g {
            C0406a() {
            }

            @Override // rx.g
            public void request(long j2) {
                if (j2 > 0) {
                    rx.n.a.a.b(a.this.l, j2);
                    a.this.e();
                }
            }
        }

        public a(rx.h hVar, rx.j<? super T> jVar, boolean z, int i2) {
            this.f22816f = jVar;
            this.f22817g = hVar.createWorker();
            this.f22818h = z;
            i2 = i2 <= 0 ? rx.n.e.h.f23108f : i2;
            this.f22820j = i2 - (i2 >> 2);
            if (rx.n.e.o.z.b()) {
                this.f22819i = new rx.n.e.o.s(i2);
            } else {
                this.f22819i = new rx.n.e.n.e(i2);
            }
            request(i2);
        }

        boolean c(boolean z, boolean z2, rx.j<? super T> jVar, Queue<Object> queue) {
            if (jVar.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.f22818h) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.n;
                try {
                    if (th != null) {
                        jVar.onError(th);
                    } else {
                        jVar.onCompleted();
                    }
                    return false;
                } finally {
                }
            }
            Throwable th2 = this.n;
            if (th2 != null) {
                queue.clear();
                try {
                    jVar.onError(th2);
                    return true;
                } finally {
                }
            }
            if (!z2) {
                return false;
            }
            try {
                jVar.onCompleted();
                return true;
            } finally {
            }
        }

        @Override // rx.m.a
        public void call() {
            long j2 = this.o;
            Queue<Object> queue = this.f22819i;
            rx.j<? super T> jVar = this.f22816f;
            long j3 = 1;
            do {
                long j4 = this.l.get();
                while (j4 != j2) {
                    boolean z = this.f22821k;
                    Object poll = queue.poll();
                    boolean z2 = poll == null;
                    if (c(z, z2, jVar, queue)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    jVar.onNext((Object) h.e(poll));
                    j2++;
                    if (j2 == this.f22820j) {
                        j4 = rx.n.a.a.c(this.l, j2);
                        request(j2);
                        j2 = 0;
                    }
                }
                if (j4 == j2 && c(this.f22821k, queue.isEmpty(), jVar, queue)) {
                    return;
                }
                this.o = j2;
                j3 = this.m.addAndGet(-j3);
            } while (j3 != 0);
        }

        void d() {
            rx.j<? super T> jVar = this.f22816f;
            jVar.setProducer(new C0406a());
            jVar.add(this.f22817g);
            jVar.add(this);
        }

        protected void e() {
            if (this.m.getAndIncrement() == 0) {
                this.f22817g.c(this);
            }
        }

        @Override // rx.f
        public void onCompleted() {
            if (isUnsubscribed() || this.f22821k) {
                return;
            }
            this.f22821k = true;
            e();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            if (!isUnsubscribed() && !this.f22821k) {
                this.n = th;
                this.f22821k = true;
                e();
                return;
            }
            rx.q.c.j(th);
        }

        @Override // rx.f
        public void onNext(T t) {
            if (isUnsubscribed() || this.f22821k) {
                return;
            }
            if (!this.f22819i.offer(h.g(t))) {
                onError(new MissingBackpressureException());
            } else {
                e();
            }
        }
    }

    public r0(rx.h hVar, boolean z, int i2) {
        this.f22813f = hVar;
        this.f22814g = z;
        this.f22815h = i2 <= 0 ? rx.n.e.h.f23108f : i2;
    }

    @Override // rx.m.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rx.j<? super T> call(rx.j<? super T> jVar) {
        rx.h hVar = this.f22813f;
        if ((hVar instanceof rx.n.c.f) || (hVar instanceof rx.n.c.n)) {
            return jVar;
        }
        a aVar = new a(hVar, jVar, this.f22814g, this.f22815h);
        aVar.d();
        return aVar;
    }
}
