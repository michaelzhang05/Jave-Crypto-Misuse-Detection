package J3;

import android.content.Context;
import m2.r;

/* loaded from: classes4.dex */
public final class h implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f4923a;

    public h(L5.a aVar) {
        this.f4923a = aVar;
    }

    public static h a(L5.a aVar) {
        return new h(aVar);
    }

    public static r c(Context context) {
        return (r) x5.h.d(g.f4920a.a(context));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Context) this.f4923a.get());
    }
}
