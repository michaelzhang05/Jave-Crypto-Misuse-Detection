package x2;

import S5.g;
import x5.h;

/* loaded from: classes4.dex */
public final class e implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final d f40674a;

    public e(d dVar) {
        this.f40674a = dVar;
    }

    public static e a(d dVar) {
        return new e(dVar);
    }

    public static g c(d dVar) {
        return (g) h.d(dVar.a());
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f40674a);
    }
}
