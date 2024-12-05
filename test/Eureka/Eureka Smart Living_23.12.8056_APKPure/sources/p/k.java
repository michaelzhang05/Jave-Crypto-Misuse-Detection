package p;

import p.e;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    static boolean[] f8733a = new boolean[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(f fVar, o.d dVar, e eVar) {
        eVar.f8659j = -1;
        eVar.f8661k = -1;
        e.b bVar = fVar.M[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.M[0] == e.b.MATCH_PARENT) {
            int i6 = eVar.B.f8626e;
            int P = fVar.P() - eVar.D.f8626e;
            d dVar2 = eVar.B;
            dVar2.f8628g = dVar.q(dVar2);
            d dVar3 = eVar.D;
            dVar3.f8628g = dVar.q(dVar3);
            dVar.f(eVar.B.f8628g, i6);
            dVar.f(eVar.D.f8628g, P);
            eVar.f8659j = 2;
            eVar.k0(i6, P);
        }
        if (fVar.M[1] == bVar2 || eVar.M[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i7 = eVar.C.f8626e;
        int v5 = fVar.v() - eVar.E.f8626e;
        d dVar4 = eVar.C;
        dVar4.f8628g = dVar.q(dVar4);
        d dVar5 = eVar.E;
        dVar5.f8628g = dVar.q(dVar5);
        dVar.f(eVar.C.f8628g, i7);
        dVar.f(eVar.E.f8628g, v5);
        if (eVar.Y > 0 || eVar.O() == 8) {
            d dVar6 = eVar.F;
            dVar6.f8628g = dVar.q(dVar6);
            dVar.f(eVar.F.f8628g, eVar.Y + i7);
        }
        eVar.f8661k = 2;
        eVar.z0(i7, v5);
    }

    public static final boolean b(int i6, int i7) {
        return (i6 & i7) == i7;
    }
}
