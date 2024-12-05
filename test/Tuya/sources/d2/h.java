package D2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class h implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f1404a;

    public h(I5.a aVar) {
        this.f1404a = aVar;
    }

    public static h a(I5.a aVar) {
        return new h(aVar);
    }

    public static Function0 c(I5.a aVar) {
        return (Function0) u5.h.d(d.f1394a.e(aVar));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Function0 get() {
        return c(this.f1404a);
    }
}
