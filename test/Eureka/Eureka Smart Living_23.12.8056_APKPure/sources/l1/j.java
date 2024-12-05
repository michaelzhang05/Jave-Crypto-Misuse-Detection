package l1;

/* loaded from: classes.dex */
public final class j implements f1.b {

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final j f7296a = new j();
    }

    public static j a() {
        return a.f7296a;
    }

    public static e c() {
        return (e) f1.d.c(f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // y4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c();
    }
}
