package C3;

import android.app.Application;
import android.content.Context;

/* loaded from: classes4.dex */
public final class i implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final g f1259a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f1260b;

    public i(g gVar, I5.a aVar) {
        this.f1259a = gVar;
        this.f1260b = aVar;
    }

    public static i a(g gVar, I5.a aVar) {
        return new i(gVar, aVar);
    }

    public static Context c(g gVar, Application application) {
        return (Context) u5.h.d(gVar.b(application));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return c(this.f1259a, (Application) this.f1260b.get());
    }
}
