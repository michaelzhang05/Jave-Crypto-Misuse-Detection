package Z2;

import Y2.h;
import e4.C2607f;
import e4.H0;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;

/* renamed from: Z2.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C1521d implements h.c {

    /* renamed from: a, reason: collision with root package name */
    public static final C1521d f13311a = new C1521d();

    private C1521d() {
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
        int i8;
        InterfaceC3983b a8;
        AbstractC3159y.i(sharedDataSpec, "sharedDataSpec");
        C1520c c1520c = C1520c.f13307a;
        C2607f.a aVar = C2607f.f30673e;
        if (aVar.a()) {
            i8 = b4.n.f14712Y;
        } else {
            i8 = b4.n.f14700M;
        }
        int i9 = i8;
        int i10 = b4.k.f14661f;
        if (aVar.a()) {
            a8 = AbstractC3984c.a(q3.w.f37459e);
        } else {
            a8 = AbstractC3984c.a(q3.w.f37453b);
        }
        return new X2.g(c1520c, sharedDataSpec, i9, i10, false, a8, 16, null);
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
