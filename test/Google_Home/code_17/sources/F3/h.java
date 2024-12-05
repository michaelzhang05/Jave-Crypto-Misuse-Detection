package F3;

import android.content.Context;
import m2.r;

/* loaded from: classes4.dex */
public final class h implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final g f2767a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f2768b;

    public h(g gVar, L5.a aVar) {
        this.f2767a = gVar;
        this.f2768b = aVar;
    }

    public static h a(g gVar, L5.a aVar) {
        return new h(gVar, aVar);
    }

    public static r c(g gVar, Context context) {
        return (r) x5.h.d(gVar.a(context));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f2767a, (Context) this.f2768b.get());
    }
}
