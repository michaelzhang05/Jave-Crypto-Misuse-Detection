package com.google.firebase.messaging;

/* loaded from: classes.dex */
public final class a implements e4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e4.a f5829a = new a();

    /* renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0092a implements d4.d {

        /* renamed from: a, reason: collision with root package name */
        static final C0092a f5830a = new C0092a();

        /* renamed from: b, reason: collision with root package name */
        private static final d4.c f5831b = d4.c.a("projectNumber").b(g4.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final d4.c f5832c = d4.c.a("messageId").b(g4.a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        private static final d4.c f5833d = d4.c.a("instanceId").b(g4.a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        private static final d4.c f5834e = d4.c.a("messageType").b(g4.a.b().c(4).a()).a();

        /* renamed from: f, reason: collision with root package name */
        private static final d4.c f5835f = d4.c.a("sdkPlatform").b(g4.a.b().c(5).a()).a();

        /* renamed from: g, reason: collision with root package name */
        private static final d4.c f5836g = d4.c.a("packageName").b(g4.a.b().c(6).a()).a();

        /* renamed from: h, reason: collision with root package name */
        private static final d4.c f5837h = d4.c.a("collapseKey").b(g4.a.b().c(7).a()).a();

        /* renamed from: i, reason: collision with root package name */
        private static final d4.c f5838i = d4.c.a("priority").b(g4.a.b().c(8).a()).a();

        /* renamed from: j, reason: collision with root package name */
        private static final d4.c f5839j = d4.c.a("ttl").b(g4.a.b().c(9).a()).a();

        /* renamed from: k, reason: collision with root package name */
        private static final d4.c f5840k = d4.c.a("topic").b(g4.a.b().c(10).a()).a();

        /* renamed from: l, reason: collision with root package name */
        private static final d4.c f5841l = d4.c.a("bulkId").b(g4.a.b().c(11).a()).a();

        /* renamed from: m, reason: collision with root package name */
        private static final d4.c f5842m = d4.c.a("event").b(g4.a.b().c(12).a()).a();

        /* renamed from: n, reason: collision with root package name */
        private static final d4.c f5843n = d4.c.a("analyticsLabel").b(g4.a.b().c(13).a()).a();

        /* renamed from: o, reason: collision with root package name */
        private static final d4.c f5844o = d4.c.a("campaignId").b(g4.a.b().c(14).a()).a();

        /* renamed from: p, reason: collision with root package name */
        private static final d4.c f5845p = d4.c.a("composerLabel").b(g4.a.b().c(15).a()).a();

        private C0092a() {
        }

        @Override // d4.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(q4.a aVar, d4.e eVar) {
            eVar.e(f5831b, aVar.l());
            eVar.c(f5832c, aVar.h());
            eVar.c(f5833d, aVar.g());
            eVar.c(f5834e, aVar.i());
            eVar.c(f5835f, aVar.m());
            eVar.c(f5836g, aVar.j());
            eVar.c(f5837h, aVar.d());
            eVar.d(f5838i, aVar.k());
            eVar.d(f5839j, aVar.o());
            eVar.c(f5840k, aVar.n());
            eVar.e(f5841l, aVar.b());
            eVar.c(f5842m, aVar.f());
            eVar.c(f5843n, aVar.a());
            eVar.e(f5844o, aVar.c());
            eVar.c(f5845p, aVar.e());
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements d4.d {

        /* renamed from: a, reason: collision with root package name */
        static final b f5846a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final d4.c f5847b = d4.c.a("messagingClientEvent").b(g4.a.b().c(1).a()).a();

        private b() {
        }

        @Override // d4.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(q4.b bVar, d4.e eVar) {
            eVar.c(f5847b, bVar.a());
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements d4.d {

        /* renamed from: a, reason: collision with root package name */
        static final c f5848a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final d4.c f5849b = d4.c.d("messagingClientEventExtension");

        private c() {
        }

        @Override // d4.d
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            androidx.appcompat.app.f0.a(obj);
            b(null, (d4.e) obj2);
        }

        public void b(i0 i0Var, d4.e eVar) {
            throw null;
        }
    }

    private a() {
    }

    @Override // e4.a
    public void a(e4.b bVar) {
        bVar.a(i0.class, c.f5848a);
        bVar.a(q4.b.class, b.f5846a);
        bVar.a(q4.a.class, C0092a.f5830a);
    }
}
