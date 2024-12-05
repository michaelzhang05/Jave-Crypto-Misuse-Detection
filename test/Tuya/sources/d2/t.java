package D2;

import x2.C3875e;
import x2.InterfaceC3873c;

/* loaded from: classes4.dex */
public final class t implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f1417a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f1418b;

    public t(I5.a aVar, I5.a aVar2) {
        this.f1417a = aVar;
        this.f1418b = aVar2;
    }

    public static t a(I5.a aVar, I5.a aVar2) {
        return new t(aVar, aVar2);
    }

    public static k3.i c(C3875e c3875e, InterfaceC3873c interfaceC3873c) {
        return (k3.i) u5.h.d(d.f1394a.r(c3875e, interfaceC3873c));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k3.i get() {
        return c((C3875e) this.f1417a.get(), (InterfaceC3873c) this.f1418b.get());
    }
}
