package rx.n.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.e;

/* compiled from: OperatorEagerConcatMap.java */
/* loaded from: classes3.dex */
public final class p0<T, R> implements e.b<R, T> {

    /* renamed from: f, reason: collision with root package name */
    final rx.m.e<? super T, ? extends rx.e<? extends R>> f22749f;

    /* renamed from: g, reason: collision with root package name */
    final int f22750g;

    /* renamed from: h, reason: collision with root package name */
    private final int f22751h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorEagerConcatMap.java */
    /* loaded from: classes3.dex */
    public static final class a<T> extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        final c<?, T> f22752f;

        /* renamed from: g, reason: collision with root package name */
        final Queue<Object> f22753g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f22754h;

        /* renamed from: i, reason: collision with root package name */
        Throwable f22755i;

        public a(c<?, T> cVar, int i2) {
            Queue<Object> eVar;
            this.f22752f = cVar;
            if (rx.n.e.o.z.b()) {
                eVar = new rx.n.e.o.s<>(i2);
            } else {
                eVar = new rx.n.e.n.e<>(i2);
            }
            this.f22753g = eVar;
            request(i2);
        }

        void c(long j2) {
            request(j2);
        }

        @Override // rx.f
        public void onCompleted() {
            this.f22754h = true;
            this.f22752f.d();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            this.f22755i = th;
            this.f22754h = true;
            this.f22752f.d();
        }

        @Override // rx.f
        public void onNext(T t) {
            this.f22753g.offer(h.g(t));
            this.f22752f.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorEagerConcatMap.java */
    /* loaded from: classes3.dex */
    public static final class b extends AtomicLong implements rx.g {

        /* renamed from: f, reason: collision with root package name */
        final c<?, ?> f22756f;

        public b(c<?, ?> cVar) {
            this.f22756f = cVar;
        }

        @Override // rx.g
        public void request(long j2) {
            if (j2 < 0) {
                throw new IllegalStateException("n >= 0 required but it was " + j2);
            }
            if (j2 > 0) {
                rx.n.a.a.b(this, j2);
                this.f22756f.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorEagerConcatMap.java */
    /* loaded from: classes3.dex */
    public static final class c<T, R> extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        final rx.m.e<? super T, ? extends rx.e<? extends R>> f22757f;

        /* renamed from: g, reason: collision with root package name */
        final int f22758g;

        /* renamed from: h, reason: collision with root package name */
        final rx.j<? super R> f22759h;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f22761j;

        /* renamed from: k, reason: collision with root package name */
        Throwable f22762k;
        volatile boolean l;
        private b n;

        /* renamed from: i, reason: collision with root package name */
        final Queue<a<R>> f22760i = new LinkedList();
        final AtomicInteger m = new AtomicInteger();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OperatorEagerConcatMap.java */
        /* loaded from: classes3.dex */
        public class a implements rx.m.a {
            a() {
            }

            @Override // rx.m.a
            public void call() {
                c.this.l = true;
                if (c.this.m.getAndIncrement() == 0) {
                    c.this.c();
                }
            }
        }

        public c(rx.m.e<? super T, ? extends rx.e<? extends R>> eVar, int i2, int i3, rx.j<? super R> jVar) {
            this.f22757f = eVar;
            this.f22758g = i2;
            this.f22759h = jVar;
            request(i3 == Integer.MAX_VALUE ? Long.MAX_VALUE : i3);
        }

        void c() {
            ArrayList arrayList;
            synchronized (this.f22760i) {
                arrayList = new ArrayList(this.f22760i);
                this.f22760i.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((rx.k) it.next()).unsubscribe();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x0087, code lost:
        
            if (r12 == 0) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0090, code lost:
        
            if (r8 == Long.MAX_VALUE) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0092, code lost:
        
            rx.n.a.a.c(r0, r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0095, code lost:
        
            if (r6 != false) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0097, code lost:
        
            r7.c(r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x009a, code lost:
        
            if (r6 == false) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x009c, code lost:
        
            r4 = r17;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void d() {
            /*
                Method dump skipped, instructions count: 198
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.n.a.p0.c.d():void");
        }

        void e() {
            this.n = new b(this);
            add(rx.t.e.a(new a()));
            this.f22759h.add(this);
            this.f22759h.setProducer(this.n);
        }

        @Override // rx.f
        public void onCompleted() {
            this.f22761j = true;
            d();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            this.f22762k = th;
            this.f22761j = true;
            d();
        }

        @Override // rx.f
        public void onNext(T t) {
            try {
                rx.e<? extends R> call = this.f22757f.call(t);
                if (this.l) {
                    return;
                }
                a<R> aVar = new a<>(this, this.f22758g);
                synchronized (this.f22760i) {
                    if (this.l) {
                        return;
                    }
                    this.f22760i.add(aVar);
                    if (this.l) {
                        return;
                    }
                    call.c1(aVar);
                    d();
                }
            } catch (Throwable th) {
                rx.exceptions.a.g(th, this.f22759h, t);
            }
        }
    }

    public p0(rx.m.e<? super T, ? extends rx.e<? extends R>> eVar, int i2, int i3) {
        this.f22749f = eVar;
        this.f22750g = i2;
        this.f22751h = i3;
    }

    @Override // rx.m.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rx.j<? super T> call(rx.j<? super R> jVar) {
        c cVar = new c(this.f22749f, this.f22750g, this.f22751h, jVar);
        cVar.e();
        return cVar;
    }
}
