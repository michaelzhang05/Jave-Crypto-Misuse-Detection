package rx.n.a;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.a;
import rx.e;
import rx.n.e.c;

/* compiled from: OperatorOnBackpressureBuffer.java */
/* loaded from: classes3.dex */
public class s0<T> implements e.b<T, T> {

    /* renamed from: f, reason: collision with root package name */
    private final Long f22834f = null;

    /* renamed from: g, reason: collision with root package name */
    private final rx.m.a f22835g = null;

    /* renamed from: h, reason: collision with root package name */
    private final a.d f22836h = rx.a.f22365b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorOnBackpressureBuffer.java */
    /* loaded from: classes3.dex */
    public static final class a<T> extends rx.j<T> implements c.a {

        /* renamed from: g, reason: collision with root package name */
        private final AtomicLong f22838g;

        /* renamed from: h, reason: collision with root package name */
        private final rx.j<? super T> f22839h;

        /* renamed from: j, reason: collision with root package name */
        private final rx.n.e.c f22841j;

        /* renamed from: k, reason: collision with root package name */
        private final rx.m.a f22842k;
        private final a.d l;

        /* renamed from: f, reason: collision with root package name */
        private final ConcurrentLinkedQueue<Object> f22837f = new ConcurrentLinkedQueue<>();

        /* renamed from: i, reason: collision with root package name */
        private final AtomicBoolean f22840i = new AtomicBoolean(false);

        public a(rx.j<? super T> jVar, Long l, rx.m.a aVar, a.d dVar) {
            this.f22839h = jVar;
            this.f22838g = l != null ? new AtomicLong(l.longValue()) : null;
            this.f22842k = aVar;
            this.f22841j = new rx.n.e.c(this);
            this.l = dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private boolean c() {
            /*
                r6 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r6.f22838g
                r1 = 1
                if (r0 != 0) goto L6
                return r1
            L6:
                java.util.concurrent.atomic.AtomicLong r0 = r6.f22838g
                long r2 = r0.get()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 > 0) goto L4a
                r0 = 0
                rx.a$d r4 = r6.l     // Catch: rx.exceptions.MissingBackpressureException -> L23
                boolean r4 = r4.a()     // Catch: rx.exceptions.MissingBackpressureException -> L23
                if (r4 == 0) goto L34
                java.lang.Object r4 = r6.poll()     // Catch: rx.exceptions.MissingBackpressureException -> L23
                if (r4 == 0) goto L34
                r4 = 1
                goto L35
            L23:
                r4 = move-exception
                java.util.concurrent.atomic.AtomicBoolean r5 = r6.f22840i
                boolean r5 = r5.compareAndSet(r0, r1)
                if (r5 == 0) goto L34
                r6.unsubscribe()
                rx.j<? super T> r5 = r6.f22839h
                r5.onError(r4)
            L34:
                r4 = 0
            L35:
                rx.m.a r5 = r6.f22842k
                if (r5 == 0) goto L47
                r5.call()     // Catch: java.lang.Throwable -> L3d
                goto L47
            L3d:
                r1 = move-exception
                rx.exceptions.a.e(r1)
                rx.n.e.c r2 = r6.f22841j
                r2.c(r1)
                return r0
            L47:
                if (r4 != 0) goto L4a
                return r0
            L4a:
                java.util.concurrent.atomic.AtomicLong r0 = r6.f22838g
                r4 = 1
                long r4 = r2 - r4
                boolean r0 = r0.compareAndSet(r2, r4)
                if (r0 == 0) goto L6
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.n.a.s0.a.c():boolean");
        }

        @Override // rx.n.e.c.a
        public boolean a(Object obj) {
            return h.a(this.f22839h, obj);
        }

        @Override // rx.n.e.c.a
        public void b(Throwable th) {
            if (th != null) {
                this.f22839h.onError(th);
            } else {
                this.f22839h.onCompleted();
            }
        }

        protected rx.g d() {
            return this.f22841j;
        }

        @Override // rx.f
        public void onCompleted() {
            if (this.f22840i.get()) {
                return;
            }
            this.f22841j.b();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            if (this.f22840i.get()) {
                return;
            }
            this.f22841j.c(th);
        }

        @Override // rx.f
        public void onNext(T t) {
            if (c()) {
                this.f22837f.offer(h.g(t));
                this.f22841j.a();
            }
        }

        @Override // rx.j
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.n.e.c.a
        public Object peek() {
            return this.f22837f.peek();
        }

        @Override // rx.n.e.c.a
        public Object poll() {
            Object poll = this.f22837f.poll();
            AtomicLong atomicLong = this.f22838g;
            if (atomicLong != null && poll != null) {
                atomicLong.incrementAndGet();
            }
            return poll;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorOnBackpressureBuffer.java */
    /* loaded from: classes3.dex */
    public static final class b {
        static final s0<?> a = new s0<>();
    }

    s0() {
    }

    public static <T> s0<T> b() {
        return (s0<T>) b.a;
    }

    @Override // rx.m.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rx.j<? super T> call(rx.j<? super T> jVar) {
        a aVar = new a(jVar, this.f22834f, this.f22835g, this.f22836h);
        jVar.add(aVar);
        jVar.setProducer(aVar.d());
        return aVar;
    }
}
