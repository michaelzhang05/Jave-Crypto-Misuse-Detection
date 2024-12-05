package l3;

import kotlin.jvm.functions.Function1;

/* renamed from: l3.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3185o implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f33942a;

    public C3185o(I5.a aVar) {
        this.f33942a = aVar;
    }

    public static C3185o a(I5.a aVar) {
        return new C3185o(aVar);
    }

    public static C3184n c(Function1 function1) {
        return new C3184n(function1);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3184n get() {
        return c((Function1) this.f33942a.get());
    }
}
