package n1;

/* loaded from: classes.dex */
public final class c implements f1.b {

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final c f7959a = new c();
    }

    public static c a() {
        return a.f7959a;
    }

    public static n1.a b() {
        return (n1.a) f1.d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // y4.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n1.a get() {
        return b();
    }
}
