package kotlin.reflect.x.internal.l0.e.z;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.e.q;
import kotlin.reflect.x.internal.l0.e.t;

/* compiled from: TypeTable.kt */
/* loaded from: classes2.dex */
public final class g {
    private final List<q> a;

    public g(t tVar) {
        int t;
        l.f(tVar, "typeTable");
        List<q> C = tVar.C();
        if (tVar.D()) {
            int z = tVar.z();
            List<q> C2 = tVar.C();
            l.e(C2, "typeTable.typeList");
            t = u.t(C2, 10);
            ArrayList arrayList = new ArrayList(t);
            int i2 = 0;
            for (Object obj : C2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    kotlin.collections.t.s();
                }
                q qVar = (q) obj;
                if (i2 >= z) {
                    qVar = qVar.c().O(true).a();
                }
                arrayList.add(qVar);
                i2 = i3;
            }
            C = arrayList;
        }
        l.e(C, "run {\n        val origin… else originalTypes\n    }");
        this.a = C;
    }

    public final q a(int i2) {
        return this.a.get(i2);
    }
}
