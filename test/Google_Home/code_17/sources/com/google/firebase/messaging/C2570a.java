package com.google.firebase.messaging;

import androidx.core.app.NotificationCompat;
import h1.C2895a;
import h1.C2896b;

/* renamed from: com.google.firebase.messaging.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2570a implements V0.a {

    /* renamed from: a, reason: collision with root package name */
    public static final V0.a f18425a = new C2570a();

    /* renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0375a implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final C0375a f18426a = new C0375a();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f18427b = U0.c.a("projectNumber").b(X0.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f18428c = U0.c.a("messageId").b(X0.a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        private static final U0.c f18429d = U0.c.a("instanceId").b(X0.a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        private static final U0.c f18430e = U0.c.a("messageType").b(X0.a.b().c(4).a()).a();

        /* renamed from: f, reason: collision with root package name */
        private static final U0.c f18431f = U0.c.a("sdkPlatform").b(X0.a.b().c(5).a()).a();

        /* renamed from: g, reason: collision with root package name */
        private static final U0.c f18432g = U0.c.a("packageName").b(X0.a.b().c(6).a()).a();

        /* renamed from: h, reason: collision with root package name */
        private static final U0.c f18433h = U0.c.a("collapseKey").b(X0.a.b().c(7).a()).a();

        /* renamed from: i, reason: collision with root package name */
        private static final U0.c f18434i = U0.c.a("priority").b(X0.a.b().c(8).a()).a();

        /* renamed from: j, reason: collision with root package name */
        private static final U0.c f18435j = U0.c.a("ttl").b(X0.a.b().c(9).a()).a();

        /* renamed from: k, reason: collision with root package name */
        private static final U0.c f18436k = U0.c.a("topic").b(X0.a.b().c(10).a()).a();

        /* renamed from: l, reason: collision with root package name */
        private static final U0.c f18437l = U0.c.a("bulkId").b(X0.a.b().c(11).a()).a();

        /* renamed from: m, reason: collision with root package name */
        private static final U0.c f18438m = U0.c.a(NotificationCompat.CATEGORY_EVENT).b(X0.a.b().c(12).a()).a();

        /* renamed from: n, reason: collision with root package name */
        private static final U0.c f18439n = U0.c.a("analyticsLabel").b(X0.a.b().c(13).a()).a();

        /* renamed from: o, reason: collision with root package name */
        private static final U0.c f18440o = U0.c.a("campaignId").b(X0.a.b().c(14).a()).a();

        /* renamed from: p, reason: collision with root package name */
        private static final U0.c f18441p = U0.c.a("composerLabel").b(X0.a.b().c(15).a()).a();

        private C0375a() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C2895a c2895a, U0.e eVar) {
            eVar.b(f18427b, c2895a.l());
            eVar.g(f18428c, c2895a.h());
            eVar.g(f18429d, c2895a.g());
            eVar.g(f18430e, c2895a.i());
            eVar.g(f18431f, c2895a.m());
            eVar.g(f18432g, c2895a.j());
            eVar.g(f18433h, c2895a.d());
            eVar.c(f18434i, c2895a.k());
            eVar.c(f18435j, c2895a.o());
            eVar.g(f18436k, c2895a.n());
            eVar.b(f18437l, c2895a.b());
            eVar.g(f18438m, c2895a.f());
            eVar.g(f18439n, c2895a.a());
            eVar.b(f18440o, c2895a.c());
            eVar.g(f18441p, c2895a.e());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$b */
    /* loaded from: classes4.dex */
    private static final class b implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final b f18442a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f18443b = U0.c.a("messagingClientEvent").b(X0.a.b().c(1).a()).a();

        private b() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C2896b c2896b, U0.e eVar) {
            eVar.g(f18443b, c2896b.a());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$c */
    /* loaded from: classes4.dex */
    private static final class c implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final c f18444a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f18445b = U0.c.d("messagingClientEventExtension");

        private c() {
        }

        @Override // U0.d
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.a.a(obj);
            b(null, (U0.e) obj2);
        }

        public void b(K k8, U0.e eVar) {
            throw null;
        }
    }

    private C2570a() {
    }

    @Override // V0.a
    public void a(V0.b bVar) {
        bVar.a(K.class, c.f18444a);
        bVar.a(C2896b.class, b.f18442a);
        bVar.a(C2895a.class, C0375a.f18426a);
    }
}
