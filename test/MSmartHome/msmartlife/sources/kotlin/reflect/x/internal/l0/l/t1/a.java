package kotlin.reflect.x.internal.l0.l.t1;

import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.l.d1;
import kotlin.reflect.x.internal.l0.l.t1.f;
import kotlin.reflect.x.internal.l0.l.t1.g;

/* compiled from: ClassicTypeCheckerState.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final d1 a(boolean z, boolean z2, b bVar, f fVar, g gVar) {
        l.f(bVar, "typeSystemContext");
        l.f(fVar, "kotlinTypePreparator");
        l.f(gVar, "kotlinTypeRefiner");
        return new d1(z, z2, true, bVar, fVar, gVar);
    }

    public static /* synthetic */ d1 b(boolean z, boolean z2, b bVar, f fVar, g gVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            bVar = q.a;
        }
        if ((i2 & 8) != 0) {
            fVar = f.a.a;
        }
        if ((i2 & 16) != 0) {
            gVar = g.a.a;
        }
        return a(z, z2, bVar, fVar, gVar);
    }
}
