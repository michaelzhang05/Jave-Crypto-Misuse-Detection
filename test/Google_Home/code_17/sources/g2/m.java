package G2;

import u2.InterfaceC4057d;

/* loaded from: classes4.dex */
public final class m implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f2952a;

    public m(L5.a aVar) {
        this.f2952a = aVar;
    }

    public static m a(L5.a aVar) {
        return new m(aVar);
    }

    public static InterfaceC4057d c(boolean z8) {
        return (InterfaceC4057d) x5.h.d(d.f2936a.k(z8));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC4057d get() {
        return c(((Boolean) this.f2952a.get()).booleanValue());
    }
}
