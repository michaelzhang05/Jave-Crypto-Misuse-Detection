package J3;

import android.app.Application;
import android.content.Context;

/* loaded from: classes4.dex */
public final class j implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f4924a;

    public j(L5.a aVar) {
        this.f4924a = aVar;
    }

    public static j a(L5.a aVar) {
        return new j(aVar);
    }

    public static Context c(Application application) {
        return (Context) x5.h.d(g.f4920a.c(application));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return c((Application) this.f4924a.get());
    }
}
