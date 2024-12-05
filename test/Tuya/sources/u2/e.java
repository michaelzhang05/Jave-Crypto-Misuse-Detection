package u2;

import P5.g;
import u5.h;

/* loaded from: classes4.dex */
public final class e implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final d f38490a;

    public e(d dVar) {
        this.f38490a = dVar;
    }

    public static e a(d dVar) {
        return new e(dVar);
    }

    public static g c(d dVar) {
        return (g) h.d(dVar.a());
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f38490a);
    }
}
