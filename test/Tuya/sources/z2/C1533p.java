package Z2;

import M5.AbstractC1246t;
import Y2.h;
import e4.H0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import m4.G;

/* renamed from: Z2.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C1533p implements h.c {

    /* renamed from: a, reason: collision with root package name */
    public static final C1533p f13359a = new C1533p();

    private C1533p() {
    }

    @Override // Y2.h.c
    public W2.a a(H0 h02) {
        return h.c.a.c(this, h02);
    }

    @Override // Y2.h.c
    public List c(Y2.d metadata, H0 sharedDataSpec, X2.h transformSpecToElements) {
        List m8;
        AbstractC3159y.i(metadata, "metadata");
        AbstractC3159y.i(sharedDataSpec, "sharedDataSpec");
        AbstractC3159y.i(transformSpecToElements, "transformSpecToElements");
        ArrayList c8 = sharedDataSpec.c();
        if (metadata.Y()) {
            G.b bVar = m4.G.Companion;
            m8 = AbstractC1246t.p(bVar.r(), bVar.n());
        } else {
            m8 = AbstractC1246t.m();
        }
        return transformSpecToElements.a(c8, m8);
    }

    @Override // Y2.h.c
    public X2.g d(H0 sharedDataSpec) {
        AbstractC3159y.i(sharedDataSpec, "sharedDataSpec");
        return new X2.g(C1532o.f13355a, sharedDataSpec, b4.n.f14706S, b4.k.f14665j, false, null, 48, null);
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
