package E;

import w.AbstractC3838d;
import w.InterfaceC3836b;

/* loaded from: classes3.dex */
public final class c implements InterfaceC3836b {

    /* loaded from: classes3.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final c f1902a = new c();
    }

    public static c a() {
        return a.f1902a;
    }

    public static E.a b() {
        return (E.a) AbstractC3838d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // I5.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public E.a get() {
        return b();
    }
}
