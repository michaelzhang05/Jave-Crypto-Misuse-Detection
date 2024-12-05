package A2;

import android.content.Context;

/* loaded from: classes4.dex */
public final class g implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f98a;

    public g(I5.a aVar) {
        this.f98a = aVar;
    }

    public static g a(I5.a aVar) {
        return new g(aVar);
    }

    public static f c(Context context) {
        return new f(context);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get() {
        return c((Context) this.f98a.get());
    }
}
