package q3;

import kotlin.jvm.functions.Function1;
import w5.InterfaceC4149a;

/* loaded from: classes4.dex */
public final class r implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f38245a;

    public r(L5.a aVar) {
        this.f38245a = aVar;
    }

    public static r a(L5.a aVar) {
        return new r(aVar);
    }

    public static Function1 c(InterfaceC4149a interfaceC4149a) {
        return (Function1) x5.h.d(o.f38238a.c(interfaceC4149a));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Function1 get() {
        return c(x5.d.a(this.f38245a));
    }
}
