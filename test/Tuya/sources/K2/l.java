package K2;

import N2.b;

/* loaded from: classes4.dex */
public final class l implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f5938a;

    public l(I5.a aVar) {
        this.f5938a = aVar;
    }

    public static l a(I5.a aVar) {
        return new l(aVar);
    }

    public static k c(b.a aVar) {
        return new k(aVar);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c((b.a) this.f5938a.get());
    }
}
