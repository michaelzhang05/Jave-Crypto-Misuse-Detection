package n1;

/* loaded from: classes.dex */
public final class d implements f1.b {

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f7960a = new d();
    }

    public static d a() {
        return a.f7960a;
    }

    public static n1.a c() {
        return (n1.a) f1.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // y4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public n1.a get() {
        return c();
    }
}
