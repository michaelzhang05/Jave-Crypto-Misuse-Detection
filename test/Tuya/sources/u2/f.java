package u2;

import P5.g;
import u5.h;

/* loaded from: classes4.dex */
public final class f implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final d f38491a;

    public f(d dVar) {
        this.f38491a = dVar;
    }

    public static f a(d dVar) {
        return new f(dVar);
    }

    public static g c(d dVar) {
        return (g) h.d(dVar.b());
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f38491a);
    }
}
