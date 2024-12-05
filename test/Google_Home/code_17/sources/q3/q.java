package q3;

import i3.C2978a;
import kotlin.jvm.functions.Function1;
import w5.InterfaceC4149a;

/* loaded from: classes4.dex */
public final class q implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f38243a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f38244b;

    public q(L5.a aVar, L5.a aVar2) {
        this.f38243a = aVar;
        this.f38244b = aVar2;
    }

    public static q a(L5.a aVar, L5.a aVar2) {
        return new q(aVar, aVar2);
    }

    public static Function1 c(InterfaceC4149a interfaceC4149a, C2978a c2978a) {
        return (Function1) x5.h.d(o.f38238a.b(interfaceC4149a, c2978a));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Function1 get() {
        return c(x5.d.a(this.f38243a), (C2978a) this.f38244b.get());
    }
}
