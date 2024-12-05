package G2;

import android.app.Application;
import android.content.Context;

/* loaded from: classes4.dex */
public final class f implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f2944a;

    public f(L5.a aVar) {
        this.f2944a = aVar;
    }

    public static Context a(Application application) {
        return (Context) x5.h.d(d.f2936a.c(application));
    }

    public static f b(L5.a aVar) {
        return new f(aVar);
    }

    @Override // L5.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return a((Application) this.f2944a.get());
    }
}
