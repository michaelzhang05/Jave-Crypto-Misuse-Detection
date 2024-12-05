package c3;

import a3.C1620b;
import a3.C1625g;
import b3.C1970d;
import b3.InterfaceC1968b;
import b3.InterfaceC1974h;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
final class o0 implements InterfaceC1974h.d {

    /* renamed from: a, reason: collision with root package name */
    public static final o0 f15682a = new o0();

    private o0() {
    }

    @Override // b3.InterfaceC1974h
    public List a(InterfaceC1968b interfaceC1968b, C1970d c1970d, List list, InterfaceC1974h.a aVar) {
        return InterfaceC1974h.d.a.c(this, interfaceC1968b, c1970d, list, aVar);
    }

    @Override // b3.InterfaceC1974h.d
    public Z2.a b(boolean z8) {
        return InterfaceC1974h.d.a.b(this, z8);
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
        return new C1620b(arguments).a();
    }

    @Override // b3.InterfaceC1974h
    public C1625g h(InterfaceC1968b interfaceC1968b, List list) {
        return InterfaceC1974h.d.a.e(this, interfaceC1968b, list);
    }

    @Override // b3.InterfaceC1974h.d
    public C1625g j() {
        return new C1625g(n0.f15676a, null, e4.n.f31755r0, e4.k.f31656G, false, null, 50, null);
    }
}
