package Q2;

import S5.g;
import u2.InterfaceC4057d;
import x5.h;

/* loaded from: classes4.dex */
public final class f implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f9135a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f9136b;

    public f(L5.a aVar, L5.a aVar2) {
        this.f9135a = aVar;
        this.f9136b = aVar2;
    }

    public static f a(L5.a aVar, L5.a aVar2) {
        return new f(aVar, aVar2);
    }

    public static R3.a c(InterfaceC4057d interfaceC4057d, g gVar) {
        return (R3.a) h.d(e.f9133a.a(interfaceC4057d, gVar));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public R3.a get() {
        return c((InterfaceC4057d) this.f9135a.get(), (g) this.f9136b.get());
    }
}
