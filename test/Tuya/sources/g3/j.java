package G3;

import android.app.Application;
import android.content.Context;

/* loaded from: classes4.dex */
public final class j implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f3205a;

    public j(I5.a aVar) {
        this.f3205a = aVar;
    }

    public static j a(I5.a aVar) {
        return new j(aVar);
    }

    public static Context c(Application application) {
        return (Context) u5.h.d(g.f3201a.c(application));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return c((Application) this.f3205a.get());
    }
}
