package C;

import w.AbstractC3838d;
import w.InterfaceC3836b;

/* renamed from: C.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1073g implements InterfaceC3836b {

    /* renamed from: C.g$a */
    /* loaded from: classes3.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final C1073g f1130a = new C1073g();
    }

    public static C1073g a() {
        return a.f1130a;
    }

    public static String b() {
        return (String) AbstractC3838d.c(AbstractC1072f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // I5.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
