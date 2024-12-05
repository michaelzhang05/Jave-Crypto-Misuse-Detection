package o3;

import kotlin.jvm.functions.Function1;

/* renamed from: o3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3523e implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f35899a;

    public C3523e(L5.a aVar) {
        this.f35899a = aVar;
    }

    public static C3523e a(L5.a aVar) {
        return new C3523e(aVar);
    }

    public static C3522d c(Function1 function1) {
        return new C3522d(function1);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3522d get() {
        return c((Function1) this.f35899a.get());
    }
}
