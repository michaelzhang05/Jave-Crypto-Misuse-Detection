package A3;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class V implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f297a;

    public V(L5.a aVar) {
        this.f297a = aVar;
    }

    public static V a(L5.a aVar) {
        return new V(aVar);
    }

    public static Function0 c(L5.a aVar) {
        return (Function0) x5.h.d(M.f283a.j(aVar));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Function0 get() {
        return c(this.f297a);
    }
}
