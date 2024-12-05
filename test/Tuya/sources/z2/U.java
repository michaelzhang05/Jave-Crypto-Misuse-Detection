package Z2;

import Y2.h;
import e4.H0;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
final class U implements h.c {

    /* renamed from: a, reason: collision with root package name */
    public static final U f13287a = new U();

    private U() {
    }

    @Override // Y2.h.c
    public W2.a a(H0 h02) {
        return h.c.a.c(this, h02);
    }

    @Override // Y2.h.c
    public List c(Y2.d dVar, H0 h02, X2.h hVar) {
        return h.c.a.b(this, dVar, h02, hVar);
    }

    @Override // Y2.h.c
    public X2.g d(H0 sharedDataSpec) {
        AbstractC3159y.i(sharedDataSpec, "sharedDataSpec");
        return new X2.g(T.f13284a, sharedDataSpec, b4.n.f14729h0, b4.k.f14679x, false, null, 48, null);
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
