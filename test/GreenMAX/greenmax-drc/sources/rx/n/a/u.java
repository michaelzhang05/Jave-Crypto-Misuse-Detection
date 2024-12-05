package rx.n.a;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import rx.e;

/* compiled from: OnSubscribeFromIterable.java */
/* loaded from: classes3.dex */
public final class u<T> implements e.a<T> {

    /* renamed from: f, reason: collision with root package name */
    final Iterable<? extends T> f22864f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeFromIterable.java */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicLong implements rx.g {

        /* renamed from: f, reason: collision with root package name */
        private final rx.j<? super T> f22865f;

        /* renamed from: g, reason: collision with root package name */
        private final Iterator<? extends T> f22866g;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(rx.j<? super T> jVar, Iterator<? extends T> it) {
            this.f22865f = jVar;
            this.f22866g = it;
        }

        void a() {
            rx.j<? super T> jVar = this.f22865f;
            Iterator<? extends T> it = this.f22866g;
            while (!jVar.isUnsubscribed()) {
                try {
                    jVar.onNext(it.next());
                    if (jVar.isUnsubscribed()) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (jVar.isUnsubscribed()) {
                                return;
                            }
                            jVar.onCompleted();
                            return;
                        }
                    } catch (Throwable th) {
                        rx.exceptions.a.f(th, jVar);
                        return;
                    }
                } catch (Throwable th2) {
                    rx.exceptions.a.f(th2, jVar);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
        
            r9 = rx.n.a.a.c(r8, r4);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void b(long r9) {
            /*
                r8 = this;
                rx.j<? super T> r0 = r8.f22865f
                java.util.Iterator<? extends T> r1 = r8.f22866g
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L3e
                boolean r6 = r0.isUnsubscribed()
                if (r6 == 0) goto L12
                return
            L12:
                java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L39
                r0.onNext(r6)
                boolean r6 = r0.isUnsubscribed()
                if (r6 == 0) goto L20
                return
            L20:
                boolean r6 = r1.hasNext()     // Catch: java.lang.Throwable -> L34
                if (r6 != 0) goto L30
                boolean r9 = r0.isUnsubscribed()
                if (r9 != 0) goto L2f
                r0.onCompleted()
            L2f:
                return
            L30:
                r6 = 1
                long r4 = r4 + r6
                goto L7
            L34:
                r9 = move-exception
                rx.exceptions.a.f(r9, r0)
                return
            L39:
                r9 = move-exception
                rx.exceptions.a.f(r9, r0)
                return
            L3e:
                long r9 = r8.get()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L7
                long r9 = rx.n.a.a.c(r8, r4)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.n.a.u.a.b(long):void");
        }

        @Override // rx.g
        public void request(long j2) {
            if (get() == Long.MAX_VALUE) {
                return;
            }
            if (j2 == Long.MAX_VALUE && compareAndSet(0L, Long.MAX_VALUE)) {
                a();
            } else {
                if (j2 <= 0 || rx.n.a.a.b(this, j2) != 0) {
                    return;
                }
                b(j2);
            }
        }
    }

    public u(Iterable<? extends T> iterable) {
        if (iterable != null) {
            this.f22864f = iterable;
            return;
        }
        throw new NullPointerException("iterable must not be null");
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.j<? super T> jVar) {
        try {
            Iterator<? extends T> it = this.f22864f.iterator();
            boolean hasNext = it.hasNext();
            if (jVar.isUnsubscribed()) {
                return;
            }
            if (!hasNext) {
                jVar.onCompleted();
            } else {
                jVar.setProducer(new a(jVar, it));
            }
        } catch (Throwable th) {
            rx.exceptions.a.f(th, jVar);
        }
    }
}
