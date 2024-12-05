package l1;

/* loaded from: classes.dex */
public final class g implements f1.b {

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final g f7290a = new g();
    }

    public static g a() {
        return a.f7290a;
    }

    public static String b() {
        return (String) f1.d.c(f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // y4.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
