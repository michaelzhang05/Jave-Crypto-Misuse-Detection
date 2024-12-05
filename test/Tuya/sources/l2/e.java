package L2;

import android.content.Context;

/* loaded from: classes4.dex */
public final class e implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f6114a;

    public e(I5.a aVar) {
        this.f6114a = aVar;
    }

    public static e a(I5.a aVar) {
        return new e(aVar);
    }

    public static d c(Context context) {
        return new d(context);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c((Context) this.f6114a.get());
    }
}
