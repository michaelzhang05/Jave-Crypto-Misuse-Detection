package G2;

import A2.C0947e;
import A2.InterfaceC0945c;

/* loaded from: classes4.dex */
public final class t implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f2959a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f2960b;

    public t(L5.a aVar, L5.a aVar2) {
        this.f2959a = aVar;
        this.f2960b = aVar2;
    }

    public static t a(L5.a aVar, L5.a aVar2) {
        return new t(aVar, aVar2);
    }

    public static n3.i c(C0947e c0947e, InterfaceC0945c interfaceC0945c) {
        return (n3.i) x5.h.d(d.f2936a.r(c0947e, interfaceC0945c));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public n3.i get() {
        return c((C0947e) this.f2959a.get(), (InterfaceC0945c) this.f2960b.get());
    }
}
