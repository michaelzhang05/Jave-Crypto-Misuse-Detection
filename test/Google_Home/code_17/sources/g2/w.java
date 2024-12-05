package G2;

import android.app.Application;
import android.content.res.Resources;

/* loaded from: classes4.dex */
public final class w implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f2969a;

    public w(L5.a aVar) {
        this.f2969a = aVar;
    }

    public static w a(L5.a aVar) {
        return new w(aVar);
    }

    public static Resources c(Application application) {
        return (Resources) x5.h.d(d.f2936a.u(application));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Resources get() {
        return c((Application) this.f2969a.get());
    }
}
