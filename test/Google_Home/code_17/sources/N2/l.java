package N2;

import Q2.b;

/* loaded from: classes4.dex */
public final class l implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f7717a;

    public l(L5.a aVar) {
        this.f7717a = aVar;
    }

    public static l a(L5.a aVar) {
        return new l(aVar);
    }

    public static k c(b.a aVar) {
        return new k(aVar);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c((b.a) this.f7717a.get());
    }
}
