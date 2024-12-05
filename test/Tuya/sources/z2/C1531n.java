package Z2;

import M5.AbstractC1246t;
import Y2.h;
import e4.C2623n;
import e4.C2625o;
import e4.H0;
import e4.z0;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import m4.G;

/* renamed from: Z2.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C1531n implements h.c {

    /* renamed from: a, reason: collision with root package name */
    public static final C1531n f13351a = new C1531n();

    private C1531n() {
    }

    @Override // Y2.h.c
    public W2.a a(H0 h02) {
        return h.c.a.c(this, h02);
    }

    @Override // Y2.h.c
    public List c(Y2.d metadata, H0 sharedDataSpec, X2.h transformSpecToElements) {
        AbstractC3159y.i(metadata, "metadata");
        AbstractC3159y.i(sharedDataSpec, "sharedDataSpec");
        AbstractC3159y.i(transformSpecToElements, "transformSpecToElements");
        G.b bVar = m4.G.Companion;
        return transformSpecToElements.a(AbstractC1246t.G0(sharedDataSpec.c(), AbstractC1246t.r(new z0(bVar.r(), z0.d.f30900b), new z0(bVar.n(), z0.d.f30901c), new z0(bVar.t(), z0.d.f30902d), new C2623n(), new z0(bVar.d(), z0.d.f30903e), new C2625o())), AbstractC1246t.p(bVar.r(), bVar.n(), bVar.d()));
    }

    @Override // Y2.h.c
    public X2.g d(H0 sharedDataSpec) {
        AbstractC3159y.i(sharedDataSpec, "sharedDataSpec");
        return new X2.g(C1530m.f13347a, sharedDataSpec, b4.n.f14705R, b4.k.f14666k, true, null, 32, null);
    }

    @Override // Y2.h
    public W2.a e(Y2.b bVar, Y2.d dVar, List list, boolean z8) {
        return h.c.a.e(this, bVar, dVar, list, z8);
    }

    @Override // Y2.h
    public X2.g f(Y2.b bVar, List list) {
        return h.c.a.f(this, bVar, list);
    }

    @Override // Y2.h
    public boolean h(Y2.b bVar, List list) {
        return h.c.a.a(this, bVar, list);
    }

    @Override // Y2.h
    public List i(Y2.b bVar, Y2.d dVar, List list, h.a aVar) {
        return h.c.a.d(this, bVar, dVar, list, aVar);
    }
}
