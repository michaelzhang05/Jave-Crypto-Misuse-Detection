package u2;

import r2.InterfaceC3684d;
import u5.h;

/* loaded from: classes4.dex */
public final class c implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final C3801a f38488a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f38489b;

    public c(C3801a c3801a, I5.a aVar) {
        this.f38488a = c3801a;
        this.f38489b = aVar;
    }

    public static c a(C3801a c3801a, I5.a aVar) {
        return new c(c3801a, aVar);
    }

    public static InterfaceC3684d c(C3801a c3801a, boolean z8) {
        return (InterfaceC3684d) h.d(c3801a.b(z8));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC3684d get() {
        return c(this.f38488a, ((Boolean) this.f38489b.get()).booleanValue());
    }
}
