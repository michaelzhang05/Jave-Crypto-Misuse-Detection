package com.google.firebase.messaging;

import androidx.core.app.NotificationCompat;
import f1.C2657a;
import f1.C2658b;

/* renamed from: com.google.firebase.messaging.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2376a implements T0.a {

    /* renamed from: a, reason: collision with root package name */
    public static final T0.a f17402a = new C2376a();

    /* renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0380a implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final C0380a f17403a = new C0380a();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f17404b = S0.c.a("projectNumber").b(V0.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f17405c = S0.c.a("messageId").b(V0.a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f17406d = S0.c.a("instanceId").b(V0.a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f17407e = S0.c.a("messageType").b(V0.a.b().c(4).a()).a();

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f17408f = S0.c.a("sdkPlatform").b(V0.a.b().c(5).a()).a();

        /* renamed from: g, reason: collision with root package name */
        private static final S0.c f17409g = S0.c.a("packageName").b(V0.a.b().c(6).a()).a();

        /* renamed from: h, reason: collision with root package name */
        private static final S0.c f17410h = S0.c.a("collapseKey").b(V0.a.b().c(7).a()).a();

        /* renamed from: i, reason: collision with root package name */
        private static final S0.c f17411i = S0.c.a("priority").b(V0.a.b().c(8).a()).a();

        /* renamed from: j, reason: collision with root package name */
        private static final S0.c f17412j = S0.c.a("ttl").b(V0.a.b().c(9).a()).a();

        /* renamed from: k, reason: collision with root package name */
        private static final S0.c f17413k = S0.c.a("topic").b(V0.a.b().c(10).a()).a();

        /* renamed from: l, reason: collision with root package name */
        private static final S0.c f17414l = S0.c.a("bulkId").b(V0.a.b().c(11).a()).a();

        /* renamed from: m, reason: collision with root package name */
        private static final S0.c f17415m = S0.c.a(NotificationCompat.CATEGORY_EVENT).b(V0.a.b().c(12).a()).a();

        /* renamed from: n, reason: collision with root package name */
        private static final S0.c f17416n = S0.c.a("analyticsLabel").b(V0.a.b().c(13).a()).a();

        /* renamed from: o, reason: collision with root package name */
        private static final S0.c f17417o = S0.c.a("campaignId").b(V0.a.b().c(14).a()).a();

        /* renamed from: p, reason: collision with root package name */
        private static final S0.c f17418p = S0.c.a("composerLabel").b(V0.a.b().c(15).a()).a();

        private C0380a() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C2657a c2657a, S0.e eVar) {
            eVar.d(f17404b, c2657a.l());
            eVar.a(f17405c, c2657a.h());
            eVar.a(f17406d, c2657a.g());
            eVar.a(f17407e, c2657a.i());
            eVar.a(f17408f, c2657a.m());
            eVar.a(f17409g, c2657a.j());
            eVar.a(f17410h, c2657a.d());
            eVar.c(f17411i, c2657a.k());
            eVar.c(f17412j, c2657a.o());
            eVar.a(f17413k, c2657a.n());
            eVar.d(f17414l, c2657a.b());
            eVar.a(f17415m, c2657a.f());
            eVar.a(f17416n, c2657a.a());
            eVar.d(f17417o, c2657a.c());
            eVar.a(f17418p, c2657a.e());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$b */
    /* loaded from: classes3.dex */
    private static final class b implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final b f17419a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f17420b = S0.c.a("messagingClientEvent").b(V0.a.b().c(1).a()).a();

        private b() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C2658b c2658b, S0.e eVar) {
            eVar.a(f17420b, c2658b.a());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$c */
    /* loaded from: classes3.dex */
    private static final class c implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final c f17421a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f17422b = S0.c.d("messagingClientEventExtension");

        private c() {
        }

        @Override // S0.d
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.a.a(obj);
            b(null, (S0.e) obj2);
        }

        public void b(I i8, S0.e eVar) {
            throw null;
        }
    }

    private C2376a() {
    }

    @Override // T0.a
    public void a(T0.b bVar) {
        bVar.a(I.class, c.f17421a);
        bVar.a(C2658b.class, b.f17419a);
        bVar.a(C2657a.class, C0380a.f17403a);
    }
}
