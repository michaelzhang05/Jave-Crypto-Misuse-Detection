package x2;

import S5.g;
import x5.h;

/* loaded from: classes4.dex */
public final class f implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final d f40675a;

    public f(d dVar) {
        this.f40675a = dVar;
    }

    public static f a(d dVar) {
        return new f(dVar);
    }

    public static g c(d dVar) {
        return (g) h.d(dVar.b());
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f40675a);
    }
}
