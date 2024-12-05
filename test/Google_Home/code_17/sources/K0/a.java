package K0;

/* loaded from: classes3.dex */
public final class a implements V0.a {

    /* renamed from: a, reason: collision with root package name */
    public static final V0.a f4982a = new a();

    /* renamed from: K0.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0076a implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final C0076a f4983a = new C0076a();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f4984b = U0.c.d("rolloutId");

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f4985c = U0.c.d("parameterKey");

        /* renamed from: d, reason: collision with root package name */
        private static final U0.c f4986d = U0.c.d("parameterValue");

        /* renamed from: e, reason: collision with root package name */
        private static final U0.c f4987e = U0.c.d("variantId");

        /* renamed from: f, reason: collision with root package name */
        private static final U0.c f4988f = U0.c.d("templateVersion");

        private C0076a() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(i iVar, U0.e eVar) {
            eVar.g(f4984b, iVar.e());
            eVar.g(f4985c, iVar.c());
            eVar.g(f4986d, iVar.d());
            eVar.g(f4987e, iVar.g());
            eVar.b(f4988f, iVar.f());
        }
    }

    private a() {
    }

    @Override // V0.a
    public void a(V0.b bVar) {
        C0076a c0076a = C0076a.f4983a;
        bVar.a(i.class, c0076a);
        bVar.a(b.class, c0076a);
    }
}
