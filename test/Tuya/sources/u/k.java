package u;

import java.util.concurrent.Executor;
import w.AbstractC3838d;
import w.InterfaceC3836b;

/* loaded from: classes3.dex */
public final class k implements InterfaceC3836b {

    /* loaded from: classes3.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final k f38463a = new k();
    }

    public static k a() {
        return a.f38463a;
    }

    public static Executor b() {
        return (Executor) AbstractC3838d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // I5.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
