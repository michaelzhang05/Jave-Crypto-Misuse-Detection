package D2;

import android.app.Application;
import android.content.Context;

/* loaded from: classes4.dex */
public final class f implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f1402a;

    public f(I5.a aVar) {
        this.f1402a = aVar;
    }

    public static Context a(Application application) {
        return (Context) u5.h.d(d.f1394a.c(application));
    }

    public static f b(I5.a aVar) {
        return new f(aVar);
    }

    @Override // I5.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return a((Application) this.f1402a.get());
    }
}
