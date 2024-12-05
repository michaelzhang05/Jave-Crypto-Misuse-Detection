package E;

import w.AbstractC3838d;
import w.InterfaceC3836b;

/* loaded from: classes3.dex */
public final class d implements InterfaceC3836b {

    /* loaded from: classes3.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f1903a = new d();
    }

    public static d a() {
        return a.f1903a;
    }

    public static E.a c() {
        return (E.a) AbstractC3838d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public E.a get() {
        return c();
    }
}
