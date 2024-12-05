package c3;

import P5.AbstractC1378t;
import a3.C1625g;
import a3.C1626h;
import b3.C1970d;
import b3.InterfaceC1968b;
import b3.InterfaceC1974h;
import h4.H0;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: c3.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C2014A implements InterfaceC1974h.c {

    /* renamed from: a, reason: collision with root package name */
    public static final C2014A f15573a = new C2014A();

    private C2014A() {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b3.InterfaceC1974h.c
    public List f(C1970d metadata, H0 sharedDataSpec, C1626h transformSpecToElements) {
        List m8;
        AbstractC3255y.i(metadata, "metadata");
        AbstractC3255y.i(sharedDataSpec, "sharedDataSpec");
        AbstractC3255y.i(transformSpecToElements, "transformSpecToElements");
        p4.G g8 = null;
        Object[] objArr = 0;
        if (C2042z.f15721a.c(metadata)) {
            m8 = AbstractC1378t.e(new h4.N(g8, 0, 3, (AbstractC3247p) (objArr == true ? 1 : 0)));
        } else {
            m8 = AbstractC1378t.m();
        }
        return C1626h.b(transformSpecToElements, AbstractC1378t.G0(sharedDataSpec.b(), m8), null, 2, null);
    }

    @Override // b3.InterfaceC1974h
    public C1625g h(InterfaceC1968b interfaceC1968b, List list) {
        return InterfaceC1974h.c.a.f(this, interfaceC1968b, list);
    }

    @Override // b3.InterfaceC1974h.c
    public C1625g i(H0 sharedDataSpec) {
        AbstractC3255y.i(sharedDataSpec, "sharedDataSpec");
        return new C1625g(C2042z.f15721a, sharedDataSpec, e4.n.f31717X, e4.k.f31677p, false, null, 48, null);
    }
}
