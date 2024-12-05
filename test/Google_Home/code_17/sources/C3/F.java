package c3;

import a3.C1625g;
import a3.C1626h;
import b3.C1970d;
import b3.InterfaceC1968b;
import b3.InterfaceC1974h;
import h4.H0;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
final class F implements InterfaceC1974h.c {

    /* renamed from: a, reason: collision with root package name */
    public static final F f15583a = new F();

    private F() {
    }

    @Override // b3.InterfaceC1974h
    public List a(InterfaceC1968b interfaceC1968b, C1970d c1970d, List list, InterfaceC1974h.a aVar) {
        return InterfaceC1974h.c.a.d(this, interfaceC1968b, c1970d, list, aVar);
    }

    @Override // b3.InterfaceC1974h.c
    public Z2.a c(H0 h02) {
        return InterfaceC1974h.c.a.c(this, h02);
    }

    @Override // b3.InterfaceC1974h
    public boolean d(InterfaceC1968b interfaceC1968b, List list) {
        return InterfaceC1974h.c.a.a(this, interfaceC1968b, list);
    }

    @Override // b3.InterfaceC1974h
    public Z2.a e(InterfaceC1968b interfaceC1968b, C1970d c1970d, List list, boolean z8) {
        return InterfaceC1974h.c.a.e(this, interfaceC1968b, c1970d, list, z8);
    }

    @Override // b3.InterfaceC1974h.c
    public List f(C1970d c1970d, H0 h02, C1626h c1626h) {
        return InterfaceC1974h.c.a.b(this, c1970d, h02, c1626h);
    }

    @Override // b3.InterfaceC1974h
    public C1625g h(InterfaceC1968b interfaceC1968b, List list) {
        return InterfaceC1974h.c.a.f(this, interfaceC1968b, list);
    }

    @Override // b3.InterfaceC1974h.c
    public C1625g i(H0 sharedDataSpec) {
        AbstractC3255y.i(sharedDataSpec, "sharedDataSpec");
        return new C1625g(E.f15580a, sharedDataSpec, e4.n.f31721a0, e4.k.f31679r, false, null, 32, null);
    }
}
