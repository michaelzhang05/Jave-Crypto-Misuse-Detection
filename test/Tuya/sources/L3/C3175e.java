package l3;

import kotlin.jvm.functions.Function1;

/* renamed from: l3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3175e implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f33898a;

    public C3175e(I5.a aVar) {
        this.f33898a = aVar;
    }

    public static C3175e a(I5.a aVar) {
        return new C3175e(aVar);
    }

    public static C3174d c(Function1 function1) {
        return new C3174d(function1);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3174d get() {
        return c((Function1) this.f33898a.get());
    }
}
