package n3;

import android.content.Context;
import f3.C2660a;

/* loaded from: classes4.dex */
public final class p implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f36114a;

    public p(I5.a aVar) {
        this.f36114a = aVar;
    }

    public static p a(I5.a aVar) {
        return new p(aVar);
    }

    public static C2660a c(Context context) {
        return (C2660a) u5.h.d(o.f36110a.a(context));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2660a get() {
        return c((Context) this.f36114a.get());
    }
}
