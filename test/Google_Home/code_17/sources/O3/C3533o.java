package o3;

import kotlin.jvm.functions.Function1;

/* renamed from: o3.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3533o implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f35943a;

    public C3533o(L5.a aVar) {
        this.f35943a = aVar;
    }

    public static C3533o a(L5.a aVar) {
        return new C3533o(aVar);
    }

    public static C3532n c(Function1 function1) {
        return new C3532n(function1);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3532n get() {
        return c((Function1) this.f35943a.get());
    }
}
