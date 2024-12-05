package C;

import android.content.Context;
import w.AbstractC3838d;
import w.InterfaceC3836b;

/* renamed from: C.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1074h implements InterfaceC3836b {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f1131a;

    public C1074h(I5.a aVar) {
        this.f1131a = aVar;
    }

    public static C1074h a(I5.a aVar) {
        return new C1074h(aVar);
    }

    public static String c(Context context) {
        return (String) AbstractC3838d.c(AbstractC1072f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.f1131a.get());
    }
}
