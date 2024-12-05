package rx.q;

import java.util.concurrent.ScheduledExecutorService;
import rx.Single;
import rx.b;
import rx.e;
import rx.n.a.k1;
import rx.n.a.t1;

/* compiled from: RxJavaHooks.java */
/* loaded from: classes3.dex */
public final class c {
    static volatile rx.m.b<Throwable> a;

    /* renamed from: b, reason: collision with root package name */
    static volatile rx.m.e<e.a, e.a> f23207b;

    /* renamed from: c, reason: collision with root package name */
    static volatile rx.m.e<Single.j, Single.j> f23208c;

    /* renamed from: d, reason: collision with root package name */
    static volatile rx.m.e<b.w, b.w> f23209d;

    /* renamed from: e, reason: collision with root package name */
    static volatile rx.m.f<rx.e, e.a, e.a> f23210e;

    /* renamed from: f, reason: collision with root package name */
    static volatile rx.m.f<Single, Single.j, Single.j> f23211f;

    /* renamed from: g, reason: collision with root package name */
    static volatile rx.m.f<rx.b, b.w, b.w> f23212g;

    /* renamed from: h, reason: collision with root package name */
    static volatile rx.m.e<rx.h, rx.h> f23213h;

    /* renamed from: i, reason: collision with root package name */
    static volatile rx.m.e<rx.h, rx.h> f23214i;

    /* renamed from: j, reason: collision with root package name */
    static volatile rx.m.e<rx.h, rx.h> f23215j;

    /* renamed from: k, reason: collision with root package name */
    static volatile rx.m.e<rx.m.a, rx.m.a> f23216k;
    static volatile rx.m.e<rx.k, rx.k> l;
    static volatile rx.m.e<rx.k, rx.k> m;
    static volatile rx.m.d<? extends ScheduledExecutorService> n;
    static volatile rx.m.e<Throwable, Throwable> o;
    static volatile rx.m.e<Throwable, Throwable> p;
    static volatile rx.m.e<Throwable, Throwable> q;
    static volatile rx.m.e<e.b, e.b> r;
    static volatile rx.m.e<e.b, e.b> s;
    static volatile rx.m.e<b.x, b.x> t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxJavaHooks.java */
    /* loaded from: classes3.dex */
    public static class a implements rx.m.e<Throwable, Throwable> {
        a() {
        }

        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Throwable call(Throwable th) {
            return rx.q.f.c().g().c(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxJavaHooks.java */
    /* loaded from: classes3.dex */
    public static class b implements rx.m.e<e.b, e.b> {
        b() {
        }

        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e.b call(e.b bVar) {
            return rx.q.f.c().g().b(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxJavaHooks.java */
    /* renamed from: rx.q.c$c, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0425c implements rx.m.e<Throwable, Throwable> {
        C0425c() {
        }

        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Throwable call(Throwable th) {
            return rx.q.f.c().a().c(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxJavaHooks.java */
    /* loaded from: classes3.dex */
    public static class d implements rx.m.e<b.x, b.x> {
        d() {
        }

        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b.x call(b.x xVar) {
            return rx.q.f.c().a().b(xVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxJavaHooks.java */
    /* loaded from: classes3.dex */
    public static class e implements rx.m.e<e.a, e.a> {
        e() {
        }

        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e.a call(e.a aVar) {
            return rx.q.f.c().d().onCreate(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxJavaHooks.java */
    /* loaded from: classes3.dex */
    public static class f implements rx.m.e<Single.j, Single.j> {
        f() {
        }

        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Single.j call(Single.j jVar) {
            return rx.q.f.c().g().a(jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxJavaHooks.java */
    /* loaded from: classes3.dex */
    public static class g implements rx.m.e<b.w, b.w> {
        g() {
        }

        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b.w call(b.w wVar) {
            return rx.q.f.c().a().a(wVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxJavaHooks.java */
    /* loaded from: classes3.dex */
    public static class h implements rx.m.b<Throwable> {
        h() {
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            rx.q.f.c().b().a(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxJavaHooks.java */
    /* loaded from: classes3.dex */
    public static class i implements rx.m.f<rx.e, e.a, e.a> {
        i() {
        }

        @Override // rx.m.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e.a a(rx.e eVar, e.a aVar) {
            return rx.q.f.c().d().onSubscribeStart(eVar, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxJavaHooks.java */
    /* loaded from: classes3.dex */
    public static class j implements rx.m.e<rx.k, rx.k> {
        j() {
        }

        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.k call(rx.k kVar) {
            return rx.q.f.c().d().onSubscribeReturn(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxJavaHooks.java */
    /* loaded from: classes3.dex */
    public static class k implements rx.m.f<Single, Single.j, Single.j> {
        k() {
        }

        @Override // rx.m.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Single.j a(Single single, Single.j jVar) {
            rx.q.h g2 = rx.q.f.c().g();
            return g2 == rx.q.i.f() ? jVar : new k1(g2.e(single, new t1(jVar)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxJavaHooks.java */
    /* loaded from: classes3.dex */
    public static class l implements rx.m.e<rx.k, rx.k> {
        l() {
        }

        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.k call(rx.k kVar) {
            return rx.q.f.c().g().d(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxJavaHooks.java */
    /* loaded from: classes3.dex */
    public static class m implements rx.m.f<rx.b, b.w, b.w> {
        m() {
        }

        @Override // rx.m.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b.w a(rx.b bVar, b.w wVar) {
            return rx.q.f.c().a().d(bVar, wVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxJavaHooks.java */
    /* loaded from: classes3.dex */
    public static class n implements rx.m.e<rx.m.a, rx.m.a> {
        n() {
        }

        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.m.a call(rx.m.a aVar) {
            return rx.q.f.c().f().k(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxJavaHooks.java */
    /* loaded from: classes3.dex */
    public static class o implements rx.m.e<Throwable, Throwable> {
        o() {
        }

        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Throwable call(Throwable th) {
            return rx.q.f.c().d().onSubscribeError(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxJavaHooks.java */
    /* loaded from: classes3.dex */
    public static class p implements rx.m.e<e.b, e.b> {
        p() {
        }

        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e.b call(e.b bVar) {
            return rx.q.f.c().d().onLift(bVar);
        }
    }

    static {
        b();
    }

    public static rx.m.d<? extends ScheduledExecutorService> a() {
        return n;
    }

    static void b() {
        a = new h();
        f23210e = new i();
        l = new j();
        f23211f = new k();
        m = new l();
        f23212g = new m();
        f23216k = new n();
        o = new o();
        r = new p();
        p = new a();
        s = new b();
        q = new C0425c();
        t = new d();
        c();
    }

    static void c() {
        f23207b = new e();
        f23208c = new f();
        f23209d = new g();
    }

    public static Throwable d(Throwable th) {
        rx.m.e<Throwable, Throwable> eVar = q;
        return eVar != null ? eVar.call(th) : th;
    }

    public static <T> b.w e(rx.b bVar, b.w wVar) {
        rx.m.f<rx.b, b.w, b.w> fVar = f23212g;
        return fVar != null ? fVar.a(bVar, wVar) : wVar;
    }

    public static rx.h f(rx.h hVar) {
        rx.m.e<rx.h, rx.h> eVar = f23213h;
        return eVar != null ? eVar.call(hVar) : hVar;
    }

    public static b.w g(b.w wVar) {
        rx.m.e<b.w, b.w> eVar = f23209d;
        return eVar != null ? eVar.call(wVar) : wVar;
    }

    public static <T> e.a<T> h(e.a<T> aVar) {
        rx.m.e<e.a, e.a> eVar = f23207b;
        return eVar != null ? eVar.call(aVar) : aVar;
    }

    public static <T> Single.j<T> i(Single.j<T> jVar) {
        rx.m.e<Single.j, Single.j> eVar = f23208c;
        return eVar != null ? eVar.call(jVar) : jVar;
    }

    public static void j(Throwable th) {
        rx.m.b<Throwable> bVar = a;
        if (bVar != null) {
            try {
                bVar.call(th);
                return;
            } catch (Throwable th2) {
                System.err.println("The onError handler threw an Exception. It shouldn't. => " + th2.getMessage());
                th2.printStackTrace();
                u(th2);
            }
        }
        u(th);
    }

    public static rx.h k(rx.h hVar) {
        rx.m.e<rx.h, rx.h> eVar = f23214i;
        return eVar != null ? eVar.call(hVar) : hVar;
    }

    public static rx.h l(rx.h hVar) {
        rx.m.e<rx.h, rx.h> eVar = f23215j;
        return eVar != null ? eVar.call(hVar) : hVar;
    }

    public static Throwable m(Throwable th) {
        rx.m.e<Throwable, Throwable> eVar = o;
        return eVar != null ? eVar.call(th) : th;
    }

    public static <T, R> e.b<R, T> n(e.b<R, T> bVar) {
        rx.m.e<e.b, e.b> eVar = r;
        return eVar != null ? eVar.call(bVar) : bVar;
    }

    public static rx.k o(rx.k kVar) {
        rx.m.e<rx.k, rx.k> eVar = l;
        return eVar != null ? eVar.call(kVar) : kVar;
    }

    public static <T> e.a<T> p(rx.e<T> eVar, e.a<T> aVar) {
        rx.m.f<rx.e, e.a, e.a> fVar = f23210e;
        return fVar != null ? fVar.a(eVar, aVar) : aVar;
    }

    public static rx.m.a q(rx.m.a aVar) {
        rx.m.e<rx.m.a, rx.m.a> eVar = f23216k;
        return eVar != null ? eVar.call(aVar) : aVar;
    }

    public static Throwable r(Throwable th) {
        rx.m.e<Throwable, Throwable> eVar = p;
        return eVar != null ? eVar.call(th) : th;
    }

    public static rx.k s(rx.k kVar) {
        rx.m.e<rx.k, rx.k> eVar = m;
        return eVar != null ? eVar.call(kVar) : kVar;
    }

    public static <T> Single.j<T> t(Single<T> single, Single.j<T> jVar) {
        rx.m.f<Single, Single.j, Single.j> fVar = f23211f;
        return fVar != null ? fVar.a(single, jVar) : jVar;
    }

    static void u(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
