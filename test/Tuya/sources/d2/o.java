package D2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class o implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f1412a;

    public o(I5.a aVar) {
        this.f1412a = aVar;
    }

    public static o a(I5.a aVar) {
        return new o(aVar);
    }

    public static Function0 c(I5.a aVar) {
        return (Function0) u5.h.d(d.f1394a.m(aVar));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Function0 get() {
        return c(this.f1412a);
    }
}