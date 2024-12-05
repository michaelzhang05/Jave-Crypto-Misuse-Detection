package n3;

import f3.C2660a;
import kotlin.jvm.functions.Function1;
import t5.InterfaceC3795a;

/* loaded from: classes4.dex */
public final class q implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f36115a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f36116b;

    public q(I5.a aVar, I5.a aVar2) {
        this.f36115a = aVar;
        this.f36116b = aVar2;
    }

    public static q a(I5.a aVar, I5.a aVar2) {
        return new q(aVar, aVar2);
    }

    public static Function1 c(InterfaceC3795a interfaceC3795a, C2660a c2660a) {
        return (Function1) u5.h.d(o.f36110a.b(interfaceC3795a, c2660a));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Function1 get() {
        return c(u5.d.a(this.f36115a), (C2660a) this.f36116b.get());
    }
}
