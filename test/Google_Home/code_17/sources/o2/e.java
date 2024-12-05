package O2;

import android.content.Context;

/* loaded from: classes4.dex */
public final class e implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f7905a;

    public e(L5.a aVar) {
        this.f7905a = aVar;
    }

    public static e a(L5.a aVar) {
        return new e(aVar);
    }

    public static d c(Context context) {
        return new d(context);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c((Context) this.f7905a.get());
    }
}
