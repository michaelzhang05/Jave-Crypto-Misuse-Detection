package c3;

import P5.AbstractC1378t;
import a3.C1625g;
import a3.C1626h;
import b3.C1970d;
import b3.InterfaceC1968b;
import b3.InterfaceC1974h;
import h4.H0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import p4.G;

/* loaded from: classes4.dex */
final class k0 implements InterfaceC1974h.c {

    /* renamed from: a, reason: collision with root package name */
    public static final k0 f15666a = new k0();

    private k0() {
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
    public List f(C1970d metadata, H0 sharedDataSpec, C1626h transformSpecToElements) {
        List m8;
        AbstractC3255y.i(metadata, "metadata");
        AbstractC3255y.i(sharedDataSpec, "sharedDataSpec");
        AbstractC3255y.i(transformSpecToElements, "transformSpecToElements");
        ArrayList b8 = sharedDataSpec.b();
        if (metadata.Y()) {
            G.b bVar = p4.G.Companion;
            m8 = AbstractC1378t.p(bVar.r(), bVar.n());
        } else {
            m8 = AbstractC1378t.m();
        }
        return transformSpecToElements.a(b8, m8);
    }

    @Override // b3.InterfaceC1974h
    public C1625g h(InterfaceC1968b interfaceC1968b, List list) {
        return InterfaceC1974h.c.a.f(this, interfaceC1968b, list);
    }

    @Override // b3.InterfaceC1974h.c
    public C1625g i(H0 sharedDataSpec) {
        AbstractC3255y.i(sharedDataSpec, "sharedDataSpec");
        return new C1625g(j0.f15660a, sharedDataSpec, e4.n.f31751p0, e4.k.f31683v, false, null, 48, null);
    }
}
