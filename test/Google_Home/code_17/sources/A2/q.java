package A2;

import P5.AbstractC1378t;
import P5.Q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;
import w2.C4140g;

/* loaded from: classes4.dex */
public abstract class q {
    public static final Map a(B6.i iVar) {
        AbstractC3255y.i(iVar, "<this>");
        if (iVar instanceof B6.v) {
            return b((B6.v) iVar);
        }
        String simpleName = iVar.getClass().getSimpleName();
        AbstractC3255y.h(simpleName, "getSimpleName(...)");
        throw new C4140g(simpleName);
    }

    public static final Map b(B6.v vVar) {
        AbstractC3255y.i(vVar, "<this>");
        ArrayList arrayList = new ArrayList(vVar.size());
        for (Map.Entry<String, B6.i> entry : vVar.entrySet()) {
            arrayList.add(O5.x.a(entry.getKey(), c(entry.getValue())));
        }
        return Q.w(arrayList);
    }

    public static final Object c(B6.i iVar) {
        AbstractC3255y.i(iVar, "<this>");
        if (AbstractC3255y.d(iVar, B6.t.INSTANCE)) {
            return null;
        }
        if (iVar instanceof B6.b) {
            return d((B6.b) iVar);
        }
        if (iVar instanceof B6.v) {
            return b((B6.v) iVar);
        }
        if (iVar instanceof B6.x) {
            return new j6.j("^\"|\"$").f(((B6.x) iVar).c(), "");
        }
        throw new O5.p();
    }

    public static final List d(B6.b bVar) {
        AbstractC3255y.i(bVar, "<this>");
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(bVar, 10));
        Iterator<B6.i> it = bVar.iterator();
        while (it.hasNext()) {
            arrayList.add(c(it.next()));
        }
        return arrayList;
    }
}
