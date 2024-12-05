package rx.n.a;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.e;
import rx.exceptions.MissingBackpressureException;
import rx.n.a.u;

/* compiled from: OnSubscribeFlattenIterable.java */
/* loaded from: classes3.dex */
public final class r<T, R> implements e.a<R> {

    /* renamed from: f, reason: collision with root package name */
    final rx.e<? extends T> f22800f;

    /* renamed from: g, reason: collision with root package name */
    final rx.m.e<? super T, ? extends Iterable<? extends R>> f22801g;

    /* renamed from: h, reason: collision with root package name */
    final int f22802h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeFlattenIterable.java */
    /* loaded from: classes3.dex */
    public class a implements rx.g {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ b f22803f;

        a(b bVar) {
            this.f22803f = bVar;
        }

        @Override // rx.g
        public void request(long j2) {
            this.f22803f.e(j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeFlattenIterable.java */
    /* loaded from: classes3.dex */
    public static final class b<T, R> extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        final rx.j<? super R> f22805f;

        /* renamed from: g, reason: collision with root package name */
        final rx.m.e<? super T, ? extends Iterable<? extends R>> f22806g;

        /* renamed from: h, reason: collision with root package name */
        final long f22807h;

        /* renamed from: i, reason: collision with root package name */
        final Queue<Object> f22808i;
        volatile boolean m;
        long n;
        Iterator<? extends R> o;

        /* renamed from: j, reason: collision with root package name */
        final AtomicReference<Throwable> f22809j = new AtomicReference<>();
        final AtomicInteger l = new AtomicInteger();

        /* renamed from: k, reason: collision with root package name */
        final AtomicLong f22810k = new AtomicLong();

        public b(rx.j<? super R> jVar, rx.m.e<? super T, ? extends Iterable<? extends R>> eVar, int i2) {
            this.f22805f = jVar;
            this.f22806g = eVar;
            if (i2 == Integer.MAX_VALUE) {
                this.f22807h = Long.MAX_VALUE;
                this.f22808i = new rx.n.e.n.g(rx.n.e.h.f23108f);
            } else {
                this.f22807h = i2 - (i2 >> 2);
                if (rx.n.e.o.z.b()) {
                    this.f22808i = new rx.n.e.o.s(i2);
                } else {
                    this.f22808i = new rx.n.e.n.e(i2);
                }
            }
            request(i2);
        }

        boolean c(boolean z, boolean z2, rx.j<?> jVar, Queue<?> queue) {
            if (jVar.isUnsubscribed()) {
                queue.clear();
                this.o = null;
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.f22809j.get() == null) {
                if (!z2) {
                    return false;
                }
                jVar.onCompleted();
                return true;
            }
            Throwable i2 = rx.n.e.e.i(this.f22809j);
            unsubscribe();
            queue.clear();
            this.o = null;
            jVar.onError(i2);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00d8 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0010 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x00cf A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void d() {
            /*
                Method dump skipped, instructions count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.n.a.r.b.d():void");
        }

        void e(long j2) {
            if (j2 > 0) {
                rx.n.a.a.b(this.f22810k, j2);
                d();
            } else {
                if (j2 >= 0) {
                    return;
                }
                throw new IllegalStateException("n >= 0 required but it was " + j2);
            }
        }

        @Override // rx.f
        public void onCompleted() {
            this.m = true;
            d();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            if (rx.n.e.e.d(this.f22809j, th)) {
                this.m = true;
                d();
            } else {
                rx.q.c.j(th);
            }
        }

        @Override // rx.f
        public void onNext(T t) {
            if (!this.f22808i.offer(h.g(t))) {
                unsubscribe();
                onError(new MissingBackpressureException());
            } else {
                d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeFlattenIterable.java */
    /* loaded from: classes3.dex */
    public static final class c<T, R> implements e.a<R> {

        /* renamed from: f, reason: collision with root package name */
        final T f22811f;

        /* renamed from: g, reason: collision with root package name */
        final rx.m.e<? super T, ? extends Iterable<? extends R>> f22812g;

        public c(T t, rx.m.e<? super T, ? extends Iterable<? extends R>> eVar) {
            this.f22811f = t;
            this.f22812g = eVar;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.j<? super R> jVar) {
            try {
                Iterator<? extends R> it = this.f22812g.call(this.f22811f).iterator();
                if (!it.hasNext()) {
                    jVar.onCompleted();
                } else {
                    jVar.setProducer(new u.a(jVar, it));
                }
            } catch (Throwable th) {
                rx.exceptions.a.g(th, jVar, this.f22811f);
            }
        }
    }

    protected r(rx.e<? extends T> eVar, rx.m.e<? super T, ? extends Iterable<? extends R>> eVar2, int i2) {
        this.f22800f = eVar;
        this.f22801g = eVar2;
        this.f22802h = i2;
    }

    public static <T, R> rx.e<R> b(rx.e<? extends T> eVar, rx.m.e<? super T, ? extends Iterable<? extends R>> eVar2, int i2) {
        if (eVar instanceof rx.n.e.j) {
            return rx.e.b1(new c(((rx.n.e.j) eVar).h1(), eVar2));
        }
        return rx.e.b1(new r(eVar, eVar2, i2));
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.j<? super R> jVar) {
        b bVar = new b(jVar, this.f22801g, this.f22802h);
        jVar.add(bVar);
        jVar.setProducer(new a(bVar));
        this.f22800f.c1(bVar);
    }
}
