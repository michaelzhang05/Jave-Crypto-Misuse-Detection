package D2;

import android.content.Context;

/* loaded from: classes4.dex */
public final class g implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f1800a;

    public g(L5.a aVar) {
        this.f1800a = aVar;
    }

    public static g a(L5.a aVar) {
        return new g(aVar);
    }

    public static f c(Context context) {
        return new f(context);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get() {
        return c((Context) this.f1800a.get());
    }
}
