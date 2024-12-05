package u;

import x.C4152a;
import x.C4153b;
import x.C4154c;
import x.C4155d;
import x.C4156e;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4044a implements V0.a {

    /* renamed from: a, reason: collision with root package name */
    public static final V0.a f39816a = new C4044a();

    /* renamed from: u.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0891a implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final C0891a f39817a = new C0891a();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f39818b = U0.c.a("window").b(X0.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f39819c = U0.c.a("logSourceMetrics").b(X0.a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        private static final U0.c f39820d = U0.c.a("globalMetrics").b(X0.a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        private static final U0.c f39821e = U0.c.a("appNamespace").b(X0.a.b().c(4).a()).a();

        private C0891a() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C4152a c4152a, U0.e eVar) {
            eVar.g(f39818b, c4152a.d());
            eVar.g(f39819c, c4152a.c());
            eVar.g(f39820d, c4152a.b());
            eVar.g(f39821e, c4152a.a());
        }
    }

    /* renamed from: u.a$b */
    /* loaded from: classes3.dex */
    private static final class b implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final b f39822a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f39823b = U0.c.a("storageMetrics").b(X0.a.b().c(1).a()).a();

        private b() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C4153b c4153b, U0.e eVar) {
            eVar.g(f39823b, c4153b.a());
        }
    }

    /* renamed from: u.a$c */
    /* loaded from: classes3.dex */
    private static final class c implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final c f39824a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f39825b = U0.c.a("eventsDroppedCount").b(X0.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f39826c = U0.c.a("reason").b(X0.a.b().c(3).a()).a();

        private c() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C4154c c4154c, U0.e eVar) {
            eVar.b(f39825b, c4154c.a());
            eVar.g(f39826c, c4154c.b());
        }
    }

    /* renamed from: u.a$d */
    /* loaded from: classes3.dex */
    private static final class d implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final d f39827a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f39828b = U0.c.a("logSource").b(X0.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f39829c = U0.c.a("logEventDropped").b(X0.a.b().c(2).a()).a();

        private d() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C4155d c4155d, U0.e eVar) {
            eVar.g(f39828b, c4155d.b());
            eVar.g(f39829c, c4155d.a());
        }
    }

    /* renamed from: u.a$e */
    /* loaded from: classes3.dex */
    private static final class e implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final e f39830a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f39831b = U0.c.d("clientMetrics");

        private e() {
        }

        @Override // U0.d
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.a.a(obj);
            b(null, (U0.e) obj2);
        }

        public void b(m mVar, U0.e eVar) {
            throw null;
        }
    }

    /* renamed from: u.a$f */
    /* loaded from: classes3.dex */
    private static final class f implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final f f39832a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f39833b = U0.c.a("currentCacheSizeBytes").b(X0.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f39834c = U0.c.a("maxCacheSizeBytes").b(X0.a.b().c(2).a()).a();

        private f() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C4156e c4156e, U0.e eVar) {
            eVar.b(f39833b, c4156e.a());
            eVar.b(f39834c, c4156e.b());
        }
    }

    /* renamed from: u.a$g */
    /* loaded from: classes3.dex */
    private static final class g implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final g f39835a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f39836b = U0.c.a("startMs").b(X0.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f39837c = U0.c.a("endMs").b(X0.a.b().c(2).a()).a();

        private g() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(x.f fVar, U0.e eVar) {
            eVar.b(f39836b, fVar.b());
            eVar.b(f39837c, fVar.a());
        }
    }

    private C4044a() {
    }

    @Override // V0.a
    public void a(V0.b bVar) {
        bVar.a(m.class, e.f39830a);
        bVar.a(C4152a.class, C0891a.f39817a);
        bVar.a(x.f.class, g.f39835a);
        bVar.a(C4155d.class, d.f39827a);
        bVar.a(C4154c.class, c.f39824a);
        bVar.a(C4153b.class, b.f39822a);
        bVar.a(C4156e.class, f.f39832a);
    }
}
