package c3;

import P5.AbstractC1378t;
import a3.C1625g;
import b3.C1970d;
import b3.InterfaceC1968b;
import b3.InterfaceC1974h;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
final class u0 implements InterfaceC1974h.d {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f15706a = new u0();

    private u0() {
    }

    @Override // b3.InterfaceC1974h
    public List a(InterfaceC1968b interfaceC1968b, C1970d c1970d, List list, InterfaceC1974h.a aVar) {
        return InterfaceC1974h.d.a.c(this, interfaceC1968b, c1970d, list, aVar);
    }

    @Override // b3.InterfaceC1974h.d
    public Z2.a b(boolean z8) {
        return Z2.a.b(j().c(), B2.c.a(e4.n.f31703J), false, 0, null, null, false, 60, null);
    }

    @Override // b3.InterfaceC1974h
    public boolean d(InterfaceC1968b interfaceC1968b, List list) {
        return InterfaceC1974h.d.a.a(this, interfaceC1968b, list);
    }

    @Override // b3.InterfaceC1974h
    public Z2.a e(InterfaceC1968b interfaceC1968b, C1970d c1970d, List list, boolean z8) {
        return InterfaceC1974h.d.a.d(this, interfaceC1968b, c1970d, list, z8);
    }

    @Override // b3.InterfaceC1974h.d
    public List g(C1970d metadata, InterfaceC1974h.a arguments) {
        AbstractC3255y.i(metadata, "metadata");
        AbstractC3255y.i(arguments, "arguments");
        return AbstractC1378t.m();
    }

    @Override // b3.InterfaceC1974h
    public C1625g h(InterfaceC1968b interfaceC1968b, List list) {
        return InterfaceC1974h.d.a.e(this, interfaceC1968b, list);
    }

    @Override // b3.InterfaceC1974h.d
    public C1625g j() {
        return new C1625g(t0.f15700a.getType().f25605a, e4.n.f31761u0, e4.k.f31672k, true, (String) null, (String) null, (B2.b) null, 64, (AbstractC3247p) null);
    }
}
