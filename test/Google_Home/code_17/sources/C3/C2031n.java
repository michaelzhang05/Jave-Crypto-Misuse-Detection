package c3;

import P5.AbstractC1378t;
import a3.C1625g;
import a3.C1626h;
import b3.C1970d;
import b3.InterfaceC1968b;
import b3.InterfaceC1974h;
import h4.C2943n;
import h4.C2945o;
import h4.H0;
import h4.z0;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import p4.G;

/* renamed from: c3.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C2031n implements InterfaceC1974h.c {

    /* renamed from: a, reason: collision with root package name */
    public static final C2031n f15675a = new C2031n();

    private C2031n() {
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
        AbstractC3255y.i(metadata, "metadata");
        AbstractC3255y.i(sharedDataSpec, "sharedDataSpec");
        AbstractC3255y.i(transformSpecToElements, "transformSpecToElements");
        G.b bVar = p4.G.Companion;
        return transformSpecToElements.a(AbstractC1378t.G0(sharedDataSpec.b(), AbstractC1378t.r(new z0(bVar.r(), z0.d.f32821b), new z0(bVar.n(), z0.d.f32822c), new z0(bVar.t(), z0.d.f32823d), new C2943n(), new z0(bVar.d(), z0.d.f32824e), new C2945o())), AbstractC1378t.p(bVar.r(), bVar.n(), bVar.d()));
    }

    @Override // b3.InterfaceC1974h
    public C1625g h(InterfaceC1968b interfaceC1968b, List list) {
        return InterfaceC1974h.c.a.f(this, interfaceC1968b, list);
    }

    @Override // b3.InterfaceC1974h.c
    public C1625g i(H0 sharedDataSpec) {
        AbstractC3255y.i(sharedDataSpec, "sharedDataSpec");
        return new C1625g(C2030m.f15671a, sharedDataSpec, e4.n.f31711R, e4.k.f31672k, true, null, 32, null);
    }
}
