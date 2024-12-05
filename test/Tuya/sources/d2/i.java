package D2;

import android.app.Application;

/* loaded from: classes4.dex */
public final class i implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f1405a;

    public i(I5.a aVar) {
        this.f1405a = aVar;
    }

    public static i a(I5.a aVar) {
        return new i(aVar);
    }

    public static j2.r c(Application application) {
        return (j2.r) u5.h.d(d.f1394a.f(application));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j2.r get() {
        return c((Application) this.f1405a.get());
    }
}
