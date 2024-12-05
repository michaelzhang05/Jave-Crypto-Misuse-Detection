package G2;

import android.app.Application;

/* loaded from: classes4.dex */
public final class i implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f2947a;

    public i(L5.a aVar) {
        this.f2947a = aVar;
    }

    public static i a(L5.a aVar) {
        return new i(aVar);
    }

    public static m2.r c(Application application) {
        return (m2.r) x5.h.d(d.f2936a.f(application));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m2.r get() {
        return c((Application) this.f2947a.get());
    }
}
