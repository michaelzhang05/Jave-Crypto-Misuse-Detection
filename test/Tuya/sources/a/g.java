package A;

import w.AbstractC3838d;
import w.InterfaceC3836b;

/* loaded from: classes3.dex */
public final class g implements InterfaceC3836b {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f64a;

    public g(I5.a aVar) {
        this.f64a = aVar;
    }

    public static B.f a(E.a aVar) {
        return (B.f) AbstractC3838d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(I5.a aVar) {
        return new g(aVar);
    }

    @Override // I5.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public B.f get() {
        return a((E.a) this.f64a.get());
    }
}
