package j1;

/* loaded from: classes.dex */
public final class g implements f1.b {

    /* renamed from: a, reason: collision with root package name */
    private final y4.a f7074a;

    public g(y4.a aVar) {
        this.f7074a = aVar;
    }

    public static k1.f a(n1.a aVar) {
        return (k1.f) f1.d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(y4.a aVar) {
        return new g(aVar);
    }

    @Override // y4.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public k1.f get() {
        return a((n1.a) this.f7074a.get());
    }
}
