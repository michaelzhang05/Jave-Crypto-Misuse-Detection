package u;

import s.AbstractC3701c;
import s.C3700b;
import s.InterfaceC3703e;

/* loaded from: classes3.dex */
final class s implements s.f {

    /* renamed from: a, reason: collision with root package name */
    private final p f38470a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38471b;

    /* renamed from: c, reason: collision with root package name */
    private final C3700b f38472c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3703e f38473d;

    /* renamed from: e, reason: collision with root package name */
    private final t f38474e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(p pVar, String str, C3700b c3700b, InterfaceC3703e interfaceC3703e, t tVar) {
        this.f38470a = pVar;
        this.f38471b = str;
        this.f38472c = c3700b;
        this.f38473d = interfaceC3703e;
        this.f38474e = tVar;
    }

    @Override // s.f
    public void a(AbstractC3701c abstractC3701c, s.h hVar) {
        this.f38474e.a(o.a().e(this.f38470a).c(abstractC3701c).f(this.f38471b).d(this.f38473d).b(this.f38472c).a(), hVar);
    }

    @Override // s.f
    public void b(AbstractC3701c abstractC3701c) {
        a(abstractC3701c, new s.h() { // from class: u.r
            @Override // s.h
            public final void a(Exception exc) {
                s.e(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p d() {
        return this.f38470a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Exception exc) {
    }
}
