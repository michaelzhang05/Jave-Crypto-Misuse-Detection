package rx;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import rx.Single;
import rx.e;
import rx.exceptions.CompositeException;
import rx.h;
import rx.schedulers.Schedulers;

/* compiled from: Completable.java */
/* loaded from: classes.dex */
public class b {
    static final b a = new b(new f(), false);

    /* renamed from: b, reason: collision with root package name */
    static final b f22368b = new b(new m(), false);

    /* renamed from: c, reason: collision with root package name */
    private final w f22369c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Completable.java */
    /* loaded from: classes2.dex */
    public static class a implements w {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.e f22370f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Completable.java */
        /* renamed from: rx.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0389a extends rx.j<Object> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ rx.c f22371f;

            C0389a(rx.c cVar) {
                this.f22371f = cVar;
            }

            @Override // rx.f
            public void onCompleted() {
                this.f22371f.onCompleted();
            }

            @Override // rx.f
            public void onError(Throwable th) {
                this.f22371f.onError(th);
            }

            @Override // rx.f
            public void onNext(Object obj) {
            }
        }

        a(rx.e eVar) {
            this.f22370f = eVar;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.c cVar) {
            C0389a c0389a = new C0389a(cVar);
            cVar.a(c0389a);
            this.f22370f.c1(c0389a);
        }
    }

    /* compiled from: Completable.java */
    /* renamed from: rx.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0390b implements w {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Single f22373f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Completable.java */
        /* renamed from: rx.b$b$a */
        /* loaded from: classes2.dex */
        public class a extends rx.i<Object> {

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ rx.c f22374g;

            a(rx.c cVar) {
                this.f22374g = cVar;
            }

            @Override // rx.i
            public void c(Object obj) {
                this.f22374g.onCompleted();
            }

            @Override // rx.i
            public void onError(Throwable th) {
                this.f22374g.onError(th);
            }
        }

        C0390b(Single single) {
            this.f22373f = single;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.c cVar) {
            a aVar = new a(cVar);
            cVar.a(aVar);
            this.f22373f.t(aVar);
        }
    }

    /* compiled from: Completable.java */
    /* loaded from: classes2.dex */
    class c implements rx.c {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f22376f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Throwable[] f22377g;

        c(CountDownLatch countDownLatch, Throwable[] thArr) {
            this.f22376f = countDownLatch;
            this.f22377g = thArr;
        }

        @Override // rx.c
        public void a(rx.k kVar) {
        }

        @Override // rx.c
        public void onCompleted() {
            this.f22376f.countDown();
        }

        @Override // rx.c
        public void onError(Throwable th) {
            this.f22377g[0] = th;
            this.f22376f.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Completable.java */
    /* loaded from: classes2.dex */
    public class d implements w {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.h f22379f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f22380g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ TimeUnit f22381h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f22382i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Completable.java */
        /* loaded from: classes2.dex */
        public class a implements rx.c {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ rx.t.b f22384f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ h.a f22385g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ rx.c f22386h;

            /* compiled from: Completable.java */
            /* renamed from: rx.b$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            class C0391a implements rx.m.a {
                C0391a() {
                }

                @Override // rx.m.a
                public void call() {
                    try {
                        a.this.f22386h.onCompleted();
                    } finally {
                        a.this.f22385g.unsubscribe();
                    }
                }
            }

            /* compiled from: Completable.java */
            /* renamed from: rx.b$d$a$b, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            class C0392b implements rx.m.a {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Throwable f22389f;

                C0392b(Throwable th) {
                    this.f22389f = th;
                }

                @Override // rx.m.a
                public void call() {
                    try {
                        a.this.f22386h.onError(this.f22389f);
                    } finally {
                        a.this.f22385g.unsubscribe();
                    }
                }
            }

            a(rx.t.b bVar, h.a aVar, rx.c cVar) {
                this.f22384f = bVar;
                this.f22385g = aVar;
                this.f22386h = cVar;
            }

            @Override // rx.c
            public void a(rx.k kVar) {
                this.f22384f.a(kVar);
                this.f22386h.a(this.f22384f);
            }

            @Override // rx.c
            public void onCompleted() {
                rx.t.b bVar = this.f22384f;
                h.a aVar = this.f22385g;
                C0391a c0391a = new C0391a();
                d dVar = d.this;
                bVar.a(aVar.d(c0391a, dVar.f22380g, dVar.f22381h));
            }

            @Override // rx.c
            public void onError(Throwable th) {
                if (d.this.f22382i) {
                    rx.t.b bVar = this.f22384f;
                    h.a aVar = this.f22385g;
                    C0392b c0392b = new C0392b(th);
                    d dVar = d.this;
                    bVar.a(aVar.d(c0392b, dVar.f22380g, dVar.f22381h));
                    return;
                }
                this.f22386h.onError(th);
            }
        }

        d(rx.h hVar, long j2, TimeUnit timeUnit, boolean z) {
            this.f22379f = hVar;
            this.f22380g = j2;
            this.f22381h = timeUnit;
            this.f22382i = z;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.c cVar) {
            rx.t.b bVar = new rx.t.b();
            h.a createWorker = this.f22379f.createWorker();
            bVar.a(createWorker);
            b.this.P(new a(bVar, createWorker, cVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Completable.java */
    /* loaded from: classes2.dex */
    public class e implements w {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.m.a f22391f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ rx.m.a f22392g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ rx.m.b f22393h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ rx.m.b f22394i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ rx.m.a f22395j;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Completable.java */
        /* loaded from: classes2.dex */
        public class a implements rx.c {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ rx.c f22397f;

            /* compiled from: Completable.java */
            /* renamed from: rx.b$e$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            class C0393a implements rx.m.a {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ rx.k f22399f;

                C0393a(rx.k kVar) {
                    this.f22399f = kVar;
                }

                @Override // rx.m.a
                public void call() {
                    try {
                        e.this.f22395j.call();
                    } catch (Throwable th) {
                        rx.q.c.j(th);
                    }
                    this.f22399f.unsubscribe();
                }
            }

            a(rx.c cVar) {
                this.f22397f = cVar;
            }

            @Override // rx.c
            public void a(rx.k kVar) {
                try {
                    e.this.f22394i.call(kVar);
                    this.f22397f.a(rx.t.e.a(new C0393a(kVar)));
                } catch (Throwable th) {
                    kVar.unsubscribe();
                    this.f22397f.a(rx.t.e.c());
                    this.f22397f.onError(th);
                }
            }

            @Override // rx.c
            public void onCompleted() {
                try {
                    e.this.f22391f.call();
                    this.f22397f.onCompleted();
                    try {
                        e.this.f22392g.call();
                    } catch (Throwable th) {
                        rx.q.c.j(th);
                    }
                } catch (Throwable th2) {
                    this.f22397f.onError(th2);
                }
            }

            @Override // rx.c
            public void onError(Throwable th) {
                try {
                    e.this.f22393h.call(th);
                } catch (Throwable th2) {
                    th = new CompositeException(Arrays.asList(th, th2));
                }
                this.f22397f.onError(th);
                try {
                    e.this.f22392g.call();
                } catch (Throwable th3) {
                    rx.q.c.j(th3);
                }
            }
        }

        e(rx.m.a aVar, rx.m.a aVar2, rx.m.b bVar, rx.m.b bVar2, rx.m.a aVar3) {
            this.f22391f = aVar;
            this.f22392g = aVar2;
            this.f22393h = bVar;
            this.f22394i = bVar2;
            this.f22395j = aVar3;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.c cVar) {
            b.this.P(new a(cVar));
        }
    }

    /* compiled from: Completable.java */
    /* loaded from: classes2.dex */
    static class f implements w {
        f() {
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.c cVar) {
            cVar.a(rx.t.e.c());
            cVar.onCompleted();
        }
    }

    /* compiled from: Completable.java */
    /* loaded from: classes2.dex */
    class g implements rx.m.b<Throwable> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.m.a f22401f;

        g(rx.m.a aVar) {
            this.f22401f = aVar;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            this.f22401f.call();
        }
    }

    /* compiled from: Completable.java */
    /* loaded from: classes2.dex */
    class h implements w {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.h f22403f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Completable.java */
        /* loaded from: classes2.dex */
        public class a implements rx.c {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ h.a f22405f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ rx.c f22406g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ rx.n.e.l f22407h;

            /* compiled from: Completable.java */
            /* renamed from: rx.b$h$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            class C0394a implements rx.m.a {
                C0394a() {
                }

                @Override // rx.m.a
                public void call() {
                    try {
                        a.this.f22406g.onCompleted();
                    } finally {
                        a.this.f22407h.unsubscribe();
                    }
                }
            }

            /* compiled from: Completable.java */
            /* renamed from: rx.b$h$a$b, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            class C0395b implements rx.m.a {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Throwable f22410f;

                C0395b(Throwable th) {
                    this.f22410f = th;
                }

                @Override // rx.m.a
                public void call() {
                    try {
                        a.this.f22406g.onError(this.f22410f);
                    } finally {
                        a.this.f22407h.unsubscribe();
                    }
                }
            }

            a(h.a aVar, rx.c cVar, rx.n.e.l lVar) {
                this.f22405f = aVar;
                this.f22406g = cVar;
                this.f22407h = lVar;
            }

            @Override // rx.c
            public void a(rx.k kVar) {
                this.f22407h.a(kVar);
            }

            @Override // rx.c
            public void onCompleted() {
                this.f22405f.c(new C0394a());
            }

            @Override // rx.c
            public void onError(Throwable th) {
                this.f22405f.c(new C0395b(th));
            }
        }

        h(rx.h hVar) {
            this.f22403f = hVar;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.c cVar) {
            rx.n.e.l lVar = new rx.n.e.l();
            h.a createWorker = this.f22403f.createWorker();
            lVar.a(createWorker);
            cVar.a(lVar);
            b.this.P(new a(createWorker, cVar, lVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Completable.java */
    /* loaded from: classes2.dex */
    public class i implements w {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.m.e f22412f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Completable.java */
        /* loaded from: classes2.dex */
        public class a implements rx.c {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ rx.c f22414f;

            a(rx.c cVar) {
                this.f22414f = cVar;
            }

            @Override // rx.c
            public void a(rx.k kVar) {
                this.f22414f.a(kVar);
            }

            @Override // rx.c
            public void onCompleted() {
                this.f22414f.onCompleted();
            }

            @Override // rx.c
            public void onError(Throwable th) {
                boolean z = false;
                try {
                    z = ((Boolean) i.this.f22412f.call(th)).booleanValue();
                } catch (Throwable th2) {
                    rx.exceptions.a.e(th2);
                    th = new CompositeException(Arrays.asList(th, th2));
                }
                if (z) {
                    this.f22414f.onCompleted();
                } else {
                    this.f22414f.onError(th);
                }
            }
        }

        i(rx.m.e eVar) {
            this.f22412f = eVar;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.c cVar) {
            b.this.P(new a(cVar));
        }
    }

    /* compiled from: Completable.java */
    /* loaded from: classes2.dex */
    class j implements w {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.m.e f22416f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Completable.java */
        /* loaded from: classes2.dex */
        public class a implements rx.c {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ rx.c f22418f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ rx.t.d f22419g;

            /* compiled from: Completable.java */
            /* renamed from: rx.b$j$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            class C0396a implements rx.c {
                C0396a() {
                }

                @Override // rx.c
                public void a(rx.k kVar) {
                    a.this.f22419g.b(kVar);
                }

                @Override // rx.c
                public void onCompleted() {
                    a.this.f22418f.onCompleted();
                }

                @Override // rx.c
                public void onError(Throwable th) {
                    a.this.f22418f.onError(th);
                }
            }

            a(rx.c cVar, rx.t.d dVar) {
                this.f22418f = cVar;
                this.f22419g = dVar;
            }

            @Override // rx.c
            public void a(rx.k kVar) {
                this.f22419g.b(kVar);
            }

            @Override // rx.c
            public void onCompleted() {
                this.f22418f.onCompleted();
            }

            @Override // rx.c
            public void onError(Throwable th) {
                try {
                    b bVar = (b) j.this.f22416f.call(th);
                    if (bVar == null) {
                        this.f22418f.onError(new CompositeException(Arrays.asList(th, new NullPointerException("The completable returned is null"))));
                    } else {
                        bVar.P(new C0396a());
                    }
                } catch (Throwable th2) {
                    this.f22418f.onError(new CompositeException(Arrays.asList(th, th2)));
                }
            }
        }

        j(rx.m.e eVar) {
            this.f22416f = eVar;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.c cVar) {
            rx.t.d dVar = new rx.t.d();
            cVar.a(dVar);
            b.this.P(new a(cVar, dVar));
        }
    }

    /* compiled from: Completable.java */
    /* loaded from: classes2.dex */
    class k implements rx.c {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.t.c f22422f;

        k(rx.t.c cVar) {
            this.f22422f = cVar;
        }

        @Override // rx.c
        public void a(rx.k kVar) {
            this.f22422f.a(kVar);
        }

        @Override // rx.c
        public void onCompleted() {
            this.f22422f.unsubscribe();
        }

        @Override // rx.c
        public void onError(Throwable th) {
            rx.q.c.j(th);
            this.f22422f.unsubscribe();
            b.l(th);
        }
    }

    /* compiled from: Completable.java */
    /* loaded from: classes2.dex */
    class l implements rx.c {

        /* renamed from: f, reason: collision with root package name */
        boolean f22424f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ rx.m.a f22425g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ rx.t.c f22426h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ rx.m.b f22427i;

        l(rx.m.a aVar, rx.t.c cVar, rx.m.b bVar) {
            this.f22425g = aVar;
            this.f22426h = cVar;
            this.f22427i = bVar;
        }

        @Override // rx.c
        public void a(rx.k kVar) {
            this.f22426h.a(kVar);
        }

        void b(Throwable th) {
            try {
                this.f22427i.call(th);
            } finally {
                try {
                } finally {
                }
            }
        }

        @Override // rx.c
        public void onCompleted() {
            if (this.f22424f) {
                return;
            }
            this.f22424f = true;
            try {
                this.f22425g.call();
                this.f22426h.unsubscribe();
            } catch (Throwable th) {
                b(th);
            }
        }

        @Override // rx.c
        public void onError(Throwable th) {
            if (!this.f22424f) {
                this.f22424f = true;
                b(th);
            } else {
                rx.q.c.j(th);
                b.l(th);
            }
        }
    }

    /* compiled from: Completable.java */
    /* loaded from: classes2.dex */
    static class m implements w {
        m() {
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.c cVar) {
            cVar.a(rx.t.e.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Completable.java */
    /* loaded from: classes2.dex */
    public class n implements rx.c {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.j f22429f;

        n(rx.j jVar) {
            this.f22429f = jVar;
        }

        @Override // rx.c
        public void a(rx.k kVar) {
            this.f22429f.add(kVar);
        }

        @Override // rx.c
        public void onCompleted() {
            this.f22429f.onCompleted();
        }

        @Override // rx.c
        public void onError(Throwable th) {
            this.f22429f.onError(th);
        }
    }

    /* compiled from: Completable.java */
    /* loaded from: classes2.dex */
    class o implements w {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.h f22431f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Completable.java */
        /* loaded from: classes2.dex */
        public class a implements rx.m.a {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ rx.c f22433f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ h.a f22434g;

            a(rx.c cVar, h.a aVar) {
                this.f22433f = cVar;
                this.f22434g = aVar;
            }

            @Override // rx.m.a
            public void call() {
                try {
                    b.this.P(this.f22433f);
                } finally {
                    this.f22434g.unsubscribe();
                }
            }
        }

        o(rx.h hVar) {
            this.f22431f = hVar;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.c cVar) {
            h.a createWorker = this.f22431f.createWorker();
            createWorker.c(new a(cVar, createWorker));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Completable.java */
    /* loaded from: classes2.dex */
    public class p<T> implements e.a<T> {
        p() {
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.j<? super T> jVar) {
            b.this.Q(jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Completable.java */
    /* loaded from: classes2.dex */
    public class q<T> implements Single.j<T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.m.d f22437f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Completable.java */
        /* loaded from: classes2.dex */
        public class a implements rx.c {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ rx.i f22439f;

            a(rx.i iVar) {
                this.f22439f = iVar;
            }

            @Override // rx.c
            public void a(rx.k kVar) {
                this.f22439f.b(kVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // rx.c
            public void onCompleted() {
                try {
                    Object call = q.this.f22437f.call();
                    if (call == null) {
                        this.f22439f.onError(new NullPointerException("The value supplied is null"));
                    } else {
                        this.f22439f.c(call);
                    }
                } catch (Throwable th) {
                    this.f22439f.onError(th);
                }
            }

            @Override // rx.c
            public void onError(Throwable th) {
                this.f22439f.onError(th);
            }
        }

        q(rx.m.d dVar) {
            this.f22437f = dVar;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.i<? super T> iVar) {
            b.this.P(new a(iVar));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Completable.java */
    /* loaded from: classes2.dex */
    class r<T> implements rx.m.d<T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f22441f;

        r(Object obj) {
            this.f22441f = obj;
        }

        @Override // rx.m.d, java.util.concurrent.Callable
        public T call() {
            return (T) this.f22441f;
        }
    }

    /* compiled from: Completable.java */
    /* loaded from: classes2.dex */
    static class s implements w {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.m.d f22443f;

        s(rx.m.d dVar) {
            this.f22443f = dVar;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.c cVar) {
            try {
                b bVar = (b) this.f22443f.call();
                if (bVar == null) {
                    cVar.a(rx.t.e.c());
                    cVar.onError(new NullPointerException("The completable returned is null"));
                } else {
                    bVar.P(cVar);
                }
            } catch (Throwable th) {
                cVar.a(rx.t.e.c());
                cVar.onError(th);
            }
        }
    }

    /* compiled from: Completable.java */
    /* loaded from: classes2.dex */
    static class t implements w {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Throwable f22444f;

        t(Throwable th) {
            this.f22444f = th;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.c cVar) {
            cVar.a(rx.t.e.c());
            cVar.onError(this.f22444f);
        }
    }

    /* compiled from: Completable.java */
    /* loaded from: classes2.dex */
    static class u implements w {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.m.a f22445f;

        u(rx.m.a aVar) {
            this.f22445f = aVar;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.c cVar) {
            rx.t.a aVar = new rx.t.a();
            cVar.a(aVar);
            try {
                this.f22445f.call();
                if (aVar.isUnsubscribed()) {
                    return;
                }
                cVar.onCompleted();
            } catch (Throwable th) {
                if (aVar.isUnsubscribed()) {
                    return;
                }
                cVar.onError(th);
            }
        }
    }

    /* compiled from: Completable.java */
    /* loaded from: classes2.dex */
    static class v implements w {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Callable f22446f;

        v(Callable callable) {
            this.f22446f = callable;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.c cVar) {
            rx.t.a aVar = new rx.t.a();
            cVar.a(aVar);
            try {
                this.f22446f.call();
                if (aVar.isUnsubscribed()) {
                    return;
                }
                cVar.onCompleted();
            } catch (Throwable th) {
                if (aVar.isUnsubscribed()) {
                    return;
                }
                cVar.onError(th);
            }
        }
    }

    /* compiled from: Completable.java */
    /* loaded from: classes2.dex */
    public interface w extends rx.m.b<rx.c> {
    }

    /* compiled from: Completable.java */
    /* loaded from: classes2.dex */
    public interface x extends rx.m.e<rx.c, rx.c> {
    }

    protected b(w wVar) {
        this.f22369c = rx.q.c.g(wVar);
    }

    static <T> T D(T t2) {
        t2.getClass();
        return t2;
    }

    static NullPointerException L(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    private <T> void R(rx.j<T> jVar, boolean z) {
        D(jVar);
        if (z) {
            try {
                jVar.onStart();
            } catch (NullPointerException e2) {
                throw e2;
            } catch (Throwable th) {
                rx.exceptions.a.e(th);
                Throwable m2 = rx.q.c.m(th);
                rx.q.c.j(m2);
                throw L(m2);
            }
        }
        P(new n(jVar));
        rx.q.c.o(jVar);
    }

    public static b e() {
        b bVar = a;
        w g2 = rx.q.c.g(bVar.f22369c);
        return g2 == bVar.f22369c ? bVar : new b(g2, false);
    }

    public static b f(b... bVarArr) {
        D(bVarArr);
        if (bVarArr.length == 0) {
            return e();
        }
        if (bVarArr.length == 1) {
            return bVarArr[0];
        }
        return h(new rx.n.a.d(bVarArr));
    }

    public static b h(w wVar) {
        D(wVar);
        try {
            return new b(wVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            rx.q.c.j(th);
            throw L(th);
        }
    }

    public static b i(rx.m.d<? extends b> dVar) {
        D(dVar);
        return h(new s(dVar));
    }

    static void l(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public static b s(Throwable th) {
        D(th);
        return h(new t(th));
    }

    public static b t(rx.m.a aVar) {
        D(aVar);
        return h(new u(aVar));
    }

    public static b u(Callable<?> callable) {
        D(callable);
        return h(new v(callable));
    }

    public static b v(rx.e<?> eVar) {
        D(eVar);
        return h(new a(eVar));
    }

    public static b w(Single<?> single) {
        D(single);
        return h(new C0390b(single));
    }

    public static b x(b... bVarArr) {
        D(bVarArr);
        return h(new rx.n.a.f(bVarArr));
    }

    public static b y() {
        b bVar = f22368b;
        w g2 = rx.q.c.g(bVar.f22369c);
        return g2 == bVar.f22369c ? bVar : new b(g2, false);
    }

    public final b A() {
        return B(rx.n.e.m.a());
    }

    public final b B(rx.m.e<? super Throwable, Boolean> eVar) {
        D(eVar);
        return h(new i(eVar));
    }

    public final b C(rx.m.e<? super Throwable, ? extends b> eVar) {
        D(eVar);
        return h(new j(eVar));
    }

    public final b E() {
        return v(M().s0());
    }

    public final b F(rx.m.e<? super rx.e<? extends Throwable>, ? extends rx.e<?>> eVar) {
        return v(M().t0(eVar));
    }

    public final b G(b bVar) {
        D(bVar);
        return f(bVar, this);
    }

    public final rx.k H() {
        rx.t.c cVar = new rx.t.c();
        P(new k(cVar));
        return cVar;
    }

    public final rx.k I(rx.m.a aVar, rx.m.b<? super Throwable> bVar) {
        D(aVar);
        D(bVar);
        rx.t.c cVar = new rx.t.c();
        P(new l(aVar, cVar, bVar));
        return cVar;
    }

    public final void J(rx.c cVar) {
        if (!(cVar instanceof rx.p.b)) {
            cVar = new rx.p.b(cVar);
        }
        P(cVar);
    }

    public final b K(rx.h hVar) {
        D(hVar);
        return h(new o(hVar));
    }

    public final <T> rx.e<T> M() {
        return rx.e.b1(new p());
    }

    public final <T> Single<T> N(rx.m.d<? extends T> dVar) {
        D(dVar);
        return Single.b(new q(dVar));
    }

    public final <T> Single<T> O(T t2) {
        D(t2);
        return N(new r(t2));
    }

    public final void P(rx.c cVar) {
        D(cVar);
        try {
            rx.q.c.e(this, this.f22369c).call(cVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            rx.exceptions.a.e(th);
            Throwable d2 = rx.q.c.d(th);
            rx.q.c.j(d2);
            throw L(d2);
        }
    }

    public final <T> void Q(rx.j<T> jVar) {
        R(jVar, true);
    }

    public final b a(b bVar) {
        return g(bVar);
    }

    public final <T> rx.e<T> b(rx.e<T> eVar) {
        D(eVar);
        return eVar.s(M());
    }

    public final <T> Single<T> c(Single<T> single) {
        D(single);
        return single.d(M());
    }

    public final void d() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = new Throwable[1];
        P(new c(countDownLatch, thArr));
        if (countDownLatch.getCount() == 0) {
            if (thArr[0] != null) {
                rx.exceptions.a.c(thArr[0]);
            }
        } else {
            try {
                countDownLatch.await();
                if (thArr[0] != null) {
                    rx.exceptions.a.c(thArr[0]);
                }
            } catch (InterruptedException e2) {
                throw rx.exceptions.a.c(e2);
            }
        }
    }

    public final b g(b bVar) {
        D(bVar);
        return f(this, bVar);
    }

    public final b j(long j2, TimeUnit timeUnit) {
        return k(j2, timeUnit, Schedulers.computation(), false);
    }

    public final b k(long j2, TimeUnit timeUnit, rx.h hVar, boolean z) {
        D(timeUnit);
        D(hVar);
        return h(new d(hVar, j2, timeUnit, z));
    }

    public final b m(rx.m.a aVar) {
        return o(rx.m.c.a(), rx.m.c.a(), aVar, rx.m.c.a(), rx.m.c.a());
    }

    public final b n(rx.m.b<? super Throwable> bVar) {
        return o(rx.m.c.a(), bVar, rx.m.c.a(), rx.m.c.a(), rx.m.c.a());
    }

    protected final b o(rx.m.b<? super rx.k> bVar, rx.m.b<? super Throwable> bVar2, rx.m.a aVar, rx.m.a aVar2, rx.m.a aVar3) {
        D(bVar);
        D(bVar2);
        D(aVar);
        D(aVar2);
        D(aVar3);
        return h(new e(aVar, aVar2, bVar2, bVar, aVar3));
    }

    public final b p(rx.m.b<? super rx.k> bVar) {
        return o(bVar, rx.m.c.a(), rx.m.c.a(), rx.m.c.a(), rx.m.c.a());
    }

    public final b q(rx.m.a aVar) {
        return o(rx.m.c.a(), new g(aVar), aVar, rx.m.c.a(), rx.m.c.a());
    }

    public final b r(rx.m.a aVar) {
        return o(rx.m.c.a(), rx.m.c.a(), rx.m.c.a(), rx.m.c.a(), aVar);
    }

    public final b z(rx.h hVar) {
        D(hVar);
        return h(new h(hVar));
    }

    protected b(w wVar, boolean z) {
        this.f22369c = z ? rx.q.c.g(wVar) : wVar;
    }
}
