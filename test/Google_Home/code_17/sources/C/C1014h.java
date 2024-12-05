package C;

import android.content.Context;
import w.InterfaceC4117b;

/* renamed from: C.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1014h implements InterfaceC4117b {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f1142a;

    public C1014h(L5.a aVar) {
        this.f1142a = aVar;
    }

    public static C1014h a(L5.a aVar) {
        return new C1014h(aVar);
    }

    public static String c(Context context) {
        return (String) w.d.d(AbstractC1012f.b(context));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.f1142a.get());
    }
}
