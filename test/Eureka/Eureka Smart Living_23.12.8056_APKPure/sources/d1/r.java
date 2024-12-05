package d1;

/* loaded from: classes.dex */
final class r implements b1.f {

    /* renamed from: a, reason: collision with root package name */
    private final o f6458a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6459b;

    /* renamed from: c, reason: collision with root package name */
    private final b1.b f6460c;

    /* renamed from: d, reason: collision with root package name */
    private final b1.e f6461d;

    /* renamed from: e, reason: collision with root package name */
    private final s f6462e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(o oVar, String str, b1.b bVar, b1.e eVar, s sVar) {
        this.f6458a = oVar;
        this.f6459b = str;
        this.f6460c = bVar;
        this.f6461d = eVar;
        this.f6462e = sVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Exception exc) {
    }

    @Override // b1.f
    public void a(b1.c cVar) {
        d(cVar, new b1.h() { // from class: d1.q
            @Override // b1.h
            public final void a(Exception exc) {
                r.c(exc);
            }
        });
    }

    public void d(b1.c cVar, b1.h hVar) {
        this.f6462e.a(n.a().e(this.f6458a).c(cVar).f(this.f6459b).d(this.f6461d).b(this.f6460c).a(), hVar);
    }
}
