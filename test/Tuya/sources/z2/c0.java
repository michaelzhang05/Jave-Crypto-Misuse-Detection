package Z2;

import M5.AbstractC1246t;
import Y2.h;
import e4.H0;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
final class c0 implements h.c {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f13310a = new c0();

    private c0() {
    }

    @Override // Y2.h.c
    public W2.a a(H0 h02) {
        return h.c.a.c(this, h02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y2.h.c
    public List c(Y2.d metadata, H0 sharedDataSpec, X2.h transformSpecToElements) {
        List m8;
        AbstractC3159y.i(metadata, "metadata");
        AbstractC3159y.i(sharedDataSpec, "sharedDataSpec");
        AbstractC3159y.i(transformSpecToElements, "transformSpecToElements");
        m4.G g8 = null;
        Object[] objArr = 0;
        if (metadata.Y()) {
            m8 = AbstractC1246t.e(new e4.u0(g8, b4.n.f14761x0, 1, (AbstractC3151p) (objArr == true ? 1 : 0)));
        } else {
            m8 = AbstractC1246t.m();
        }
        return X2.h.b(transformSpecToElements, AbstractC1246t.G0(sharedDataSpec.c(), m8), null, 2, null);
    }

    @Override // Y2.h.c
    public X2.g d(H0 sharedDataSpec) {
        AbstractC3159y.i(sharedDataSpec, "sharedDataSpec");
        return new X2.g(b0.f13304a, sharedDataSpec, b4.n.f14737l0, b4.k.f14645B, false, null, 48, null);
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
