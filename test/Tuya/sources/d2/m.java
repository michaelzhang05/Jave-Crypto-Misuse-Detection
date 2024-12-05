package D2;

import r2.InterfaceC3684d;

/* loaded from: classes4.dex */
public final class m implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f1410a;

    public m(I5.a aVar) {
        this.f1410a = aVar;
    }

    public static m a(I5.a aVar) {
        return new m(aVar);
    }

    public static InterfaceC3684d c(boolean z8) {
        return (InterfaceC3684d) u5.h.d(d.f1394a.k(z8));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC3684d get() {
        return c(((Boolean) this.f1410a.get()).booleanValue());
    }
}
