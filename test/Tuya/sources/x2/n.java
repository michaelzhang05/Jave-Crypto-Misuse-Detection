package x2;

import r2.InterfaceC3684d;

/* loaded from: classes4.dex */
public final class n implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f39216a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f39217b;

    public n(I5.a aVar, I5.a aVar2) {
        this.f39216a = aVar;
        this.f39217b = aVar2;
    }

    public static n a(I5.a aVar, I5.a aVar2) {
        return new n(aVar, aVar2);
    }

    public static m c(InterfaceC3684d interfaceC3684d, P5.g gVar) {
        return new m(interfaceC3684d, gVar);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c((InterfaceC3684d) this.f39216a.get(), (P5.g) this.f39217b.get());
    }
}
