package c3;

import a3.C1620b;
import a3.C1625g;
import b3.C1970d;
import b3.InterfaceC1968b;
import b3.InterfaceC1974h;
import h4.R0;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
final class s0 implements InterfaceC1974h.d {

    /* renamed from: a, reason: collision with root package name */
    public static final s0 f15698a = new s0();

    private s0() {
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
        return new C1620b(arguments).b(p4.h0.f37539f.b(new R0(null, 1, null), Integer.valueOf(e4.n.f31704K))).a();
    }

    @Override // b3.InterfaceC1974h
    public C1625g h(InterfaceC1968b interfaceC1968b, List list) {
        return InterfaceC1974h.d.a.e(this, interfaceC1968b, list);
    }

    @Override // b3.InterfaceC1974h.d
    public C1625g j() {
        return new C1625g(r0.f15692a, null, e4.n.f31759t0, e4.k.f31658I, false, null, 50, null);
    }
}
