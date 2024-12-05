package D2;

import android.app.Application;
import android.content.res.Resources;

/* loaded from: classes4.dex */
public final class w implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f1427a;

    public w(I5.a aVar) {
        this.f1427a = aVar;
    }

    public static w a(I5.a aVar) {
        return new w(aVar);
    }

    public static Resources c(Application application) {
        return (Resources) u5.h.d(d.f1394a.u(application));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Resources get() {
        return c((Application) this.f1427a.get());
    }
}
