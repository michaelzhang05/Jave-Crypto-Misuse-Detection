package A3;

import android.content.Context;

/* loaded from: classes4.dex */
public final class T implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f294a;

    public T(L5.a aVar) {
        this.f294a = aVar;
    }

    public static T a(L5.a aVar) {
        return new T(aVar);
    }

    public static m2.r c(Context context) {
        return (m2.r) x5.h.d(M.f283a.h(context));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m2.r get() {
        return c((Context) this.f294a.get());
    }
}
