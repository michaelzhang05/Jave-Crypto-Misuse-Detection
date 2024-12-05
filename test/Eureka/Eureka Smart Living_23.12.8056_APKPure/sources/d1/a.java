package d1;

import androidx.appcompat.app.f0;

/* loaded from: classes.dex */
public final class a implements e4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e4.a f6385a = new a();

    /* renamed from: d1.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0094a implements d4.d {

        /* renamed from: a, reason: collision with root package name */
        static final C0094a f6386a = new C0094a();

        /* renamed from: b, reason: collision with root package name */
        private static final d4.c f6387b = d4.c.a("window").b(g4.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final d4.c f6388c = d4.c.a("logSourceMetrics").b(g4.a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        private static final d4.c f6389d = d4.c.a("globalMetrics").b(g4.a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        private static final d4.c f6390e = d4.c.a("appNamespace").b(g4.a.b().c(4).a()).a();

        private C0094a() {
        }

        @Override // d4.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(g1.a aVar, d4.e eVar) {
            eVar.c(f6387b, aVar.d());
            eVar.c(f6388c, aVar.c());
            eVar.c(f6389d, aVar.b());
            eVar.c(f6390e, aVar.a());
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements d4.d {

        /* renamed from: a, reason: collision with root package name */
        static final b f6391a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final d4.c f6392b = d4.c.a("storageMetrics").b(g4.a.b().c(1).a()).a();

        private b() {
        }

        @Override // d4.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(g1.b bVar, d4.e eVar) {
            eVar.c(f6392b, bVar.a());
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements d4.d {

        /* renamed from: a, reason: collision with root package name */
        static final c f6393a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final d4.c f6394b = d4.c.a("eventsDroppedCount").b(g4.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final d4.c f6395c = d4.c.a("reason").b(g4.a.b().c(3).a()).a();

        private c() {
        }

        @Override // d4.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(g1.c cVar, d4.e eVar) {
            eVar.e(f6394b, cVar.a());
            eVar.c(f6395c, cVar.b());
        }
    }

    /* loaded from: classes.dex */
    private static final class d implements d4.d {

        /* renamed from: a, reason: collision with root package name */
        static final d f6396a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final d4.c f6397b = d4.c.a("logSource").b(g4.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final d4.c f6398c = d4.c.a("logEventDropped").b(g4.a.b().c(2).a()).a();

        private d() {
        }

        @Override // d4.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(g1.d dVar, d4.e eVar) {
            eVar.c(f6397b, dVar.b());
            eVar.c(f6398c, dVar.a());
        }
    }

    /* loaded from: classes.dex */
    private static final class e implements d4.d {

        /* renamed from: a, reason: collision with root package name */
        static final e f6399a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final d4.c f6400b = d4.c.d("clientMetrics");

        private e() {
        }

        @Override // d4.d
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            f0.a(obj);
            b(null, (d4.e) obj2);
        }

        public void b(l lVar, d4.e eVar) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    private static final class f implements d4.d {

        /* renamed from: a, reason: collision with root package name */
        static final f f6401a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final d4.c f6402b = d4.c.a("currentCacheSizeBytes").b(g4.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final d4.c f6403c = d4.c.a("maxCacheSizeBytes").b(g4.a.b().c(2).a()).a();

        private f() {
        }

        @Override // d4.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(g1.e eVar, d4.e eVar2) {
            eVar2.e(f6402b, eVar.a());
            eVar2.e(f6403c, eVar.b());
        }
    }

    /* loaded from: classes.dex */
    private static final class g implements d4.d {

        /* renamed from: a, reason: collision with root package name */
        static final g f6404a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final d4.c f6405b = d4.c.a("startMs").b(g4.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final d4.c f6406c = d4.c.a("endMs").b(g4.a.b().c(2).a()).a();

        private g() {
        }

        @Override // d4.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(g1.f fVar, d4.e eVar) {
            eVar.e(f6405b, fVar.b());
            eVar.e(f6406c, fVar.a());
        }
    }

    private a() {
    }

    @Override // e4.a
    public void a(e4.b bVar) {
        bVar.a(l.class, e.f6399a);
        bVar.a(g1.a.class, C0094a.f6386a);
        bVar.a(g1.f.class, g.f6404a);
        bVar.a(g1.d.class, d.f6396a);
        bVar.a(g1.c.class, c.f6393a);
        bVar.a(g1.b.class, b.f6391a);
        bVar.a(g1.e.class, f.f6401a);
    }
}
