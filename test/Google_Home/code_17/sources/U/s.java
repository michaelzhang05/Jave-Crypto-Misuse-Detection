package u;

import s.AbstractC3983d;
import s.C3982c;

/* loaded from: classes3.dex */
final class s implements s.i {

    /* renamed from: a, reason: collision with root package name */
    private final p f39898a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39899b;

    /* renamed from: c, reason: collision with root package name */
    private final C3982c f39900c;

    /* renamed from: d, reason: collision with root package name */
    private final s.h f39901d;

    /* renamed from: e, reason: collision with root package name */
    private final t f39902e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(p pVar, String str, C3982c c3982c, s.h hVar, t tVar) {
        this.f39898a = pVar;
        this.f39899b = str;
        this.f39900c = c3982c;
        this.f39901d = hVar;
        this.f39902e = tVar;
    }

    @Override // s.i
    public void a(AbstractC3983d abstractC3983d, s.k kVar) {
        this.f39902e.a(o.a().e(this.f39898a).c(abstractC3983d).f(this.f39899b).d(this.f39901d).b(this.f39900c).a(), kVar);
    }

    @Override // s.i
    public void b(AbstractC3983d abstractC3983d) {
        a(abstractC3983d, new s.k() { // from class: u.r
            @Override // s.k
            public final void a(Exception exc) {
                s.e(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p d() {
        return this.f39898a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Exception exc) {
    }
}
