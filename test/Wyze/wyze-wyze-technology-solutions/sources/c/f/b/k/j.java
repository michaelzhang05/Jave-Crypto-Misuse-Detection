package c.f.b.k;

import c.f.b.k.e;

/* compiled from: Optimizer.java */
/* loaded from: classes.dex */
public class j {
    static boolean[] a = new boolean[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(f fVar, c.f.b.d dVar, e eVar) {
        eVar.o = -1;
        eVar.p = -1;
        e.b bVar = fVar.T[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.T[0] == e.b.MATCH_PARENT) {
            int i2 = eVar.I.f2521g;
            int R = fVar.R() - eVar.K.f2521g;
            d dVar2 = eVar.I;
            dVar2.f2523i = dVar.q(dVar2);
            d dVar3 = eVar.K;
            dVar3.f2523i = dVar.q(dVar3);
            dVar.f(eVar.I.f2523i, i2);
            dVar.f(eVar.K.f2523i, R);
            eVar.o = 2;
            eVar.y0(i2, R);
        }
        if (fVar.T[1] == bVar2 || eVar.T[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i3 = eVar.J.f2521g;
        int v = fVar.v() - eVar.L.f2521g;
        d dVar4 = eVar.J;
        dVar4.f2523i = dVar.q(dVar4);
        d dVar5 = eVar.L;
        dVar5.f2523i = dVar.q(dVar5);
        dVar.f(eVar.J.f2523i, i3);
        dVar.f(eVar.L.f2523i, v);
        if (eVar.f0 > 0 || eVar.Q() == 8) {
            d dVar6 = eVar.M;
            dVar6.f2523i = dVar.q(dVar6);
            dVar.f(eVar.M.f2523i, eVar.f0 + i3);
        }
        eVar.p = 2;
        eVar.P0(i3, v);
    }

    public static final boolean b(int i2, int i3) {
        return (i2 & i3) == i3;
    }
}
