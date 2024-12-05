package G2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class h implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f2946a;

    public h(L5.a aVar) {
        this.f2946a = aVar;
    }

    public static h a(L5.a aVar) {
        return new h(aVar);
    }

    public static Function0 c(L5.a aVar) {
        return (Function0) x5.h.d(d.f2936a.e(aVar));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Function0 get() {
        return c(this.f2946a);
    }
}
