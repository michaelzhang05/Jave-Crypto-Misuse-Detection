package G2;

import A2.C0947e;
import android.app.Application;

/* loaded from: classes4.dex */
public final class j implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f2948a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f2949b;

    public j(L5.a aVar, L5.a aVar2) {
        this.f2948a = aVar;
        this.f2949b = aVar2;
    }

    public static j a(L5.a aVar, L5.a aVar2) {
        return new j(aVar, aVar2);
    }

    public static C0947e c(Application application, L5.a aVar) {
        return (C0947e) x5.h.d(d.f2936a.h(application, aVar));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0947e get() {
        return c((Application) this.f2948a.get(), this.f2949b);
    }
}
