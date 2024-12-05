package A2;

import u2.InterfaceC4057d;

/* loaded from: classes4.dex */
public final class n implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f211a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f212b;

    public n(L5.a aVar, L5.a aVar2) {
        this.f211a = aVar;
        this.f212b = aVar2;
    }

    public static n a(L5.a aVar, L5.a aVar2) {
        return new n(aVar, aVar2);
    }

    public static m c(InterfaceC4057d interfaceC4057d, S5.g gVar) {
        return new m(interfaceC4057d, gVar);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c((InterfaceC4057d) this.f211a.get(), (S5.g) this.f212b.get());
    }
}
