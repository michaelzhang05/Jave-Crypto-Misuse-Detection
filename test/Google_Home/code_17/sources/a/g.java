package A;

import w.InterfaceC4117b;

/* loaded from: classes3.dex */
public final class g implements InterfaceC4117b {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f64a;

    public g(L5.a aVar) {
        this.f64a = aVar;
    }

    public static B.f a(E.a aVar) {
        return (B.f) w.d.d(f.a(aVar));
    }

    public static g b(L5.a aVar) {
        return new g(aVar);
    }

    @Override // L5.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public B.f get() {
        return a((E.a) this.f64a.get());
    }
}
