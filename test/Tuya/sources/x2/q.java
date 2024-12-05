package x2;

import M5.AbstractC1246t;
import M5.Q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import t2.C3786g;
import y6.AbstractC4007i;
import y6.C4000b;

/* loaded from: classes4.dex */
public abstract class q {
    public static final Map a(AbstractC4007i abstractC4007i) {
        AbstractC3159y.i(abstractC4007i, "<this>");
        if (abstractC4007i instanceof y6.v) {
            return b((y6.v) abstractC4007i);
        }
        String simpleName = abstractC4007i.getClass().getSimpleName();
        AbstractC3159y.h(simpleName, "getSimpleName(...)");
        throw new C3786g(simpleName);
    }

    public static final Map b(y6.v vVar) {
        AbstractC3159y.i(vVar, "<this>");
        ArrayList arrayList = new ArrayList(vVar.size());
        for (Map.Entry<String, AbstractC4007i> entry : vVar.entrySet()) {
            arrayList.add(L5.x.a(entry.getKey(), c(entry.getValue())));
        }
        return Q.w(arrayList);
    }

    public static final Object c(AbstractC4007i abstractC4007i) {
        AbstractC3159y.i(abstractC4007i, "<this>");
        if (AbstractC3159y.d(abstractC4007i, y6.t.INSTANCE)) {
            return null;
        }
        if (abstractC4007i instanceof C4000b) {
            return d((C4000b) abstractC4007i);
        }
        if (abstractC4007i instanceof y6.v) {
            return b((y6.v) abstractC4007i);
        }
        if (abstractC4007i instanceof y6.x) {
            return new g6.j("^\"|\"$").f(((y6.x) abstractC4007i).a(), "");
        }
        throw new L5.p();
    }

    public static final List d(C4000b c4000b) {
        AbstractC3159y.i(c4000b, "<this>");
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(c4000b, 10));
        Iterator<AbstractC4007i> it = c4000b.iterator();
        while (it.hasNext()) {
            arrayList.add(c(it.next()));
        }
        return arrayList;
    }
}
