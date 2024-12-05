package x3;

import kotlin.jvm.functions.Function0;

/* renamed from: x3.V, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3899V implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f39302a;

    public C3899V(I5.a aVar) {
        this.f39302a = aVar;
    }

    public static C3899V a(I5.a aVar) {
        return new C3899V(aVar);
    }

    public static Function0 c(I5.a aVar) {
        return (Function0) u5.h.d(AbstractC3891M.f39288a.j(aVar));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Function0 get() {
        return c(this.f39302a);
    }
}
