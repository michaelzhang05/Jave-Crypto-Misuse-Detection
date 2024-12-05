package f0;

import f0.a;
import f5.h;

/* loaded from: classes.dex */
public final class d extends a {
    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // f0.a
    public Object a(a.b bVar) {
        h.e(bVar, "key");
        return b().get(bVar);
    }

    public final void c(a.b bVar, Object obj) {
        h.e(bVar, "key");
        b().put(bVar, obj);
    }

    public d(a aVar) {
        h.e(aVar, "initialExtras");
        b().putAll(aVar.b());
    }

    public /* synthetic */ d(a aVar, int i6, f5.f fVar) {
        this((i6 & 1) != 0 ? a.C0099a.f6575b : aVar);
    }
}
