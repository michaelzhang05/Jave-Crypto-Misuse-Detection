package n3;

import kotlin.jvm.functions.Function1;
import t5.InterfaceC3795a;

/* loaded from: classes4.dex */
public final class r implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f36117a;

    public r(I5.a aVar) {
        this.f36117a = aVar;
    }

    public static r a(I5.a aVar) {
        return new r(aVar);
    }

    public static Function1 c(InterfaceC3795a interfaceC3795a) {
        return (Function1) u5.h.d(o.f36110a.c(interfaceC3795a));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Function1 get() {
        return c(u5.d.a(this.f36117a));
    }
}
