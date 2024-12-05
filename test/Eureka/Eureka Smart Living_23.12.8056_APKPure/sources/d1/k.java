package d1;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k implements f1.b {

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final k f6451a = new k();
    }

    public static k a() {
        return a.f6451a;
    }

    public static Executor b() {
        return (Executor) f1.d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // y4.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
