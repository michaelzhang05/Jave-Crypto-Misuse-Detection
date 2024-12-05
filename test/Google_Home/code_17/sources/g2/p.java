package G2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class p implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f2955a;

    public p(L5.a aVar) {
        this.f2955a = aVar;
    }

    public static p a(L5.a aVar) {
        return new p(aVar);
    }

    public static Function0 c(L5.a aVar) {
        return (Function0) x5.h.d(d.f2936a.n(aVar));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Function0 get() {
        return c(this.f2955a);
    }
}
