package C;

import w.AbstractC3838d;
import w.InterfaceC3836b;

/* renamed from: C.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1076j implements InterfaceC3836b {

    /* renamed from: C.j$a */
    /* loaded from: classes3.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final C1076j f1133a = new C1076j();
    }

    public static C1076j a() {
        return a.f1133a;
    }

    public static AbstractC1071e c() {
        return (AbstractC1071e) AbstractC3838d.c(AbstractC1072f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC1071e get() {
        return c();
    }
}
