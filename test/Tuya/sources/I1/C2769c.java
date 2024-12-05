package i1;

/* renamed from: i1.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2769c implements T0.a {

    /* renamed from: a, reason: collision with root package name */
    public static final T0.a f31437a = new C2769c();

    /* renamed from: i1.c$a */
    /* loaded from: classes3.dex */
    private static final class a implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final a f31438a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f31439b = S0.c.d("packageName");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f31440c = S0.c.d("versionName");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f31441d = S0.c.d("appBuildVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f31442e = S0.c.d("deviceManufacturer");

        private a() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C2767a c2767a, S0.e eVar) {
            eVar.a(f31439b, c2767a.c());
            eVar.a(f31440c, c2767a.d());
            eVar.a(f31441d, c2767a.a());
            eVar.a(f31442e, c2767a.b());
        }
    }

    /* renamed from: i1.c$b */
    /* loaded from: classes3.dex */
    private static final class b implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final b f31443a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f31444b = S0.c.d("appId");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f31445c = S0.c.d("deviceModel");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f31446d = S0.c.d("sessionSdkVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f31447e = S0.c.d("osVersion");

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f31448f = S0.c.d("logEnvironment");

        /* renamed from: g, reason: collision with root package name */
        private static final S0.c f31449g = S0.c.d("androidAppInfo");

        private b() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C2768b c2768b, S0.e eVar) {
            eVar.a(f31444b, c2768b.b());
            eVar.a(f31445c, c2768b.c());
            eVar.a(f31446d, c2768b.f());
            eVar.a(f31447e, c2768b.e());
            eVar.a(f31448f, c2768b.d());
            eVar.a(f31449g, c2768b.a());
        }
    }

    /* renamed from: i1.c$c, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0757c implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final C0757c f31450a = new C0757c();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f31451b = S0.c.d("performance");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f31452c = S0.c.d("crashlytics");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f31453d = S0.c.d("sessionSamplingRate");

        private C0757c() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C2771e c2771e, S0.e eVar) {
            eVar.a(f31451b, c2771e.b());
            eVar.a(f31452c, c2771e.a());
            eVar.b(f31453d, c2771e.c());
        }
    }

    /* renamed from: i1.c$d */
    /* loaded from: classes3.dex */
    private static final class d implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final d f31454a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f31455b = S0.c.d("eventType");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f31456c = S0.c.d("sessionData");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f31457d = S0.c.d("applicationInfo");

        private d() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p pVar, S0.e eVar) {
            eVar.a(f31455b, pVar.b());
            eVar.a(f31456c, pVar.c());
            eVar.a(f31457d, pVar.a());
        }
    }

    /* renamed from: i1.c$e */
    /* loaded from: classes3.dex */
    private static final class e implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final e f31458a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f31459b = S0.c.d("sessionId");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f31460c = S0.c.d("firstSessionId");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f31461d = S0.c.d("sessionIndex");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f31462e = S0.c.d("eventTimestampUs");

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f31463f = S0.c.d("dataCollectionStatus");

        /* renamed from: g, reason: collision with root package name */
        private static final S0.c f31464g = S0.c.d("firebaseInstallationId");

        private e() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s sVar, S0.e eVar) {
            eVar.a(f31459b, sVar.e());
            eVar.a(f31460c, sVar.d());
            eVar.c(f31461d, sVar.f());
            eVar.d(f31462e, sVar.b());
            eVar.a(f31463f, sVar.a());
            eVar.a(f31464g, sVar.c());
        }
    }

    private C2769c() {
    }

    @Override // T0.a
    public void a(T0.b bVar) {
        bVar.a(p.class, d.f31454a);
        bVar.a(s.class, e.f31458a);
        bVar.a(C2771e.class, C0757c.f31450a);
        bVar.a(C2768b.class, b.f31443a);
        bVar.a(C2767a.class, a.f31438a);
    }
}
