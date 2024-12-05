package C3;

import android.content.Context;
import j2.r;

/* loaded from: classes4.dex */
public final class h implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final g f1257a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f1258b;

    public h(g gVar, I5.a aVar) {
        this.f1257a = gVar;
        this.f1258b = aVar;
    }

    public static h a(g gVar, I5.a aVar) {
        return new h(gVar, aVar);
    }

    public static r c(g gVar, Context context) {
        return (r) u5.h.d(gVar.a(context));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f1257a, (Context) this.f1258b.get());
    }
}
