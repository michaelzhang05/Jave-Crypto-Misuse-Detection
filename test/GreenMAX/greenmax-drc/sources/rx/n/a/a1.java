package rx.n.a;

import android.R;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import rx.e;
import rx.exceptions.CompositeException;

/* compiled from: OperatorSwitch.java */
/* loaded from: classes3.dex */
public final class a1<T> implements e.b<T, rx.e<? extends T>> {

    /* renamed from: f, reason: collision with root package name */
    final boolean f22476f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorSwitch.java */
    /* loaded from: classes3.dex */
    public static final class a {
        static final a1<Object> a = new a1<>(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorSwitch.java */
    /* loaded from: classes3.dex */
    public static final class b {
        static final a1<Object> a = new a1<>(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorSwitch.java */
    /* loaded from: classes3.dex */
    public static final class c<T> extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        private final long f22477f;

        /* renamed from: g, reason: collision with root package name */
        private final d<T> f22478g;

        c(long j2, d<T> dVar) {
            this.f22477f = j2;
            this.f22478g = dVar;
        }

        @Override // rx.f
        public void onCompleted() {
            this.f22478g.f(this.f22477f);
        }

        @Override // rx.f
        public void onError(Throwable th) {
            this.f22478g.i(th, this.f22477f);
        }

        @Override // rx.f
        public void onNext(T t) {
            this.f22478g.h(t, this);
        }

        @Override // rx.j
        public void setProducer(rx.g gVar) {
            this.f22478g.k(gVar, this.f22477f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorSwitch.java */
    /* loaded from: classes3.dex */
    public static final class d<T> extends rx.j<rx.e<? extends T>> {

        /* renamed from: f, reason: collision with root package name */
        static final Throwable f22479f = new Throwable("Terminal error");

        /* renamed from: g, reason: collision with root package name */
        final rx.j<? super T> f22480g;

        /* renamed from: i, reason: collision with root package name */
        final boolean f22482i;
        boolean l;
        boolean m;
        long n;
        rx.g o;
        volatile boolean p;
        Throwable q;
        boolean r;

        /* renamed from: h, reason: collision with root package name */
        final rx.t.d f22481h = new rx.t.d();

        /* renamed from: j, reason: collision with root package name */
        final AtomicLong f22483j = new AtomicLong();

        /* renamed from: k, reason: collision with root package name */
        final rx.n.e.n.g<Object> f22484k = new rx.n.e.n.g<>(rx.n.e.h.f23108f);

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OperatorSwitch.java */
        /* loaded from: classes3.dex */
        public class a implements rx.m.a {
            a() {
            }

            @Override // rx.m.a
            public void call() {
                d.this.e();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OperatorSwitch.java */
        /* loaded from: classes3.dex */
        public class b implements rx.g {
            b() {
            }

            @Override // rx.g
            public void request(long j2) {
                if (j2 > 0) {
                    d.this.d(j2);
                } else {
                    if (j2 >= 0) {
                        return;
                    }
                    throw new IllegalArgumentException("n >= 0 expected but it was " + j2);
                }
            }
        }

        d(rx.j<? super T> jVar, boolean z) {
            this.f22480g = jVar;
            this.f22482i = z;
        }

        protected boolean c(boolean z, boolean z2, Throwable th, rx.n.e.n.g<Object> gVar, rx.j<? super T> jVar, boolean z3) {
            if (this.f22482i) {
                if (!z || z2 || !z3) {
                    return false;
                }
                if (th != null) {
                    jVar.onError(th);
                } else {
                    jVar.onCompleted();
                }
                return true;
            }
            if (th != null) {
                gVar.clear();
                jVar.onError(th);
                return true;
            }
            if (!z || z2 || !z3) {
                return false;
            }
            jVar.onCompleted();
            return true;
        }

        void d(long j2) {
            rx.g gVar;
            synchronized (this) {
                gVar = this.o;
                this.n = rx.n.a.a.a(this.n, j2);
            }
            if (gVar != null) {
                gVar.request(j2);
            }
            g();
        }

        void e() {
            synchronized (this) {
                this.o = null;
            }
        }

        void f(long j2) {
            synchronized (this) {
                if (this.f22483j.get() != j2) {
                    return;
                }
                this.r = false;
                this.o = null;
                g();
            }
        }

        void g() {
            Throwable th;
            Throwable th2;
            synchronized (this) {
                if (this.l) {
                    this.m = true;
                    return;
                }
                this.l = true;
                boolean z = this.r;
                long j2 = this.n;
                Throwable th3 = this.q;
                if (th3 != null && th3 != (th2 = f22479f) && !this.f22482i) {
                    this.q = th2;
                }
                rx.n.e.n.g<Object> gVar = this.f22484k;
                AtomicLong atomicLong = this.f22483j;
                rx.j<? super T> jVar = this.f22480g;
                long j3 = j2;
                Throwable th4 = th3;
                boolean z2 = this.p;
                while (true) {
                    long j4 = 0;
                    while (j4 != j3) {
                        if (jVar.isUnsubscribed()) {
                            return;
                        }
                        boolean isEmpty = gVar.isEmpty();
                        if (c(z2, z, th4, gVar, jVar, isEmpty)) {
                            return;
                        }
                        if (isEmpty) {
                            break;
                        }
                        c cVar = (c) gVar.poll();
                        R.bool boolVar = (Object) h.e(gVar.poll());
                        if (atomicLong.get() == cVar.f22477f) {
                            jVar.onNext(boolVar);
                            j4++;
                        }
                    }
                    if (j4 == j3) {
                        if (jVar.isUnsubscribed()) {
                            return;
                        }
                        if (c(this.p, z, th4, gVar, jVar, gVar.isEmpty())) {
                            return;
                        }
                    }
                    synchronized (this) {
                        long j5 = this.n;
                        if (j5 != Long.MAX_VALUE) {
                            j5 -= j4;
                            this.n = j5;
                        }
                        j3 = j5;
                        if (!this.m) {
                            this.l = false;
                            return;
                        }
                        this.m = false;
                        z2 = this.p;
                        z = this.r;
                        th4 = this.q;
                        if (th4 != null && th4 != (th = f22479f) && !this.f22482i) {
                            this.q = th;
                        }
                    }
                }
            }
        }

        void h(T t, c<T> cVar) {
            synchronized (this) {
                if (this.f22483j.get() != ((c) cVar).f22477f) {
                    return;
                }
                this.f22484k.M(cVar, h.g(t));
                g();
            }
        }

        void i(Throwable th, long j2) {
            boolean z;
            synchronized (this) {
                if (this.f22483j.get() == j2) {
                    z = n(th);
                    this.r = false;
                    this.o = null;
                } else {
                    z = true;
                }
            }
            if (z) {
                g();
            } else {
                m(th);
            }
        }

        void j() {
            this.f22480g.add(this.f22481h);
            this.f22480g.add(rx.t.e.a(new a()));
            this.f22480g.setProducer(new b());
        }

        void k(rx.g gVar, long j2) {
            synchronized (this) {
                if (this.f22483j.get() != j2) {
                    return;
                }
                long j3 = this.n;
                this.o = gVar;
                gVar.request(j3);
            }
        }

        @Override // rx.f
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void onNext(rx.e<? extends T> eVar) {
            c cVar;
            long incrementAndGet = this.f22483j.incrementAndGet();
            rx.k a2 = this.f22481h.a();
            if (a2 != null) {
                a2.unsubscribe();
            }
            synchronized (this) {
                cVar = new c(incrementAndGet, this);
                this.r = true;
                this.o = null;
            }
            this.f22481h.b(cVar);
            eVar.c1(cVar);
        }

        void m(Throwable th) {
            rx.q.c.j(th);
        }

        boolean n(Throwable th) {
            Throwable th2 = this.q;
            if (th2 == f22479f) {
                return false;
            }
            if (th2 == null) {
                this.q = th;
            } else if (th2 instanceof CompositeException) {
                ArrayList arrayList = new ArrayList(((CompositeException) th2).b());
                arrayList.add(th);
                this.q = new CompositeException(arrayList);
            } else {
                this.q = new CompositeException(th2, th);
            }
            return true;
        }

        @Override // rx.f
        public void onCompleted() {
            this.p = true;
            g();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            boolean n;
            synchronized (this) {
                n = n(th);
            }
            if (n) {
                this.p = true;
                g();
            } else {
                m(th);
            }
        }
    }

    a1(boolean z) {
        this.f22476f = z;
    }

    public static <T> a1<T> b(boolean z) {
        if (z) {
            return (a1<T>) b.a;
        }
        return (a1<T>) a.a;
    }

    @Override // rx.m.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rx.j<? super rx.e<? extends T>> call(rx.j<? super T> jVar) {
        d dVar = new d(jVar, this.f22476f);
        jVar.add(dVar);
        dVar.j();
        return dVar;
    }
}
