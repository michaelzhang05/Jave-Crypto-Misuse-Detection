package F3;

import android.app.Application;
import android.content.Context;

/* loaded from: classes4.dex */
public final class i implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final g f2769a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f2770b;

    public i(g gVar, L5.a aVar) {
        this.f2769a = gVar;
        this.f2770b = aVar;
    }

    public static i a(g gVar, L5.a aVar) {
        return new i(gVar, aVar);
    }

    public static Context c(g gVar, Application application) {
        return (Context) x5.h.d(gVar.b(application));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return c(this.f2769a, (Application) this.f2770b.get());
    }
}
