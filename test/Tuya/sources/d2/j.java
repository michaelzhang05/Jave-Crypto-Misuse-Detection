package D2;

import android.app.Application;
import x2.C3875e;

/* loaded from: classes4.dex */
public final class j implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f1406a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f1407b;

    public j(I5.a aVar, I5.a aVar2) {
        this.f1406a = aVar;
        this.f1407b = aVar2;
    }

    public static j a(I5.a aVar, I5.a aVar2) {
        return new j(aVar, aVar2);
    }

    public static C3875e c(Application application, I5.a aVar) {
        return (C3875e) u5.h.d(d.f1394a.h(application, aVar));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3875e get() {
        return c((Application) this.f1406a.get(), this.f1407b);
    }
}
