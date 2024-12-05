package kotlin.reflect.x.internal.l0.b.q;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;
import kotlin.collections.o0;
import kotlin.collections.u;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.x.internal.l0.l.f1;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.x1.a;

/* compiled from: mappingUtil.kt */
/* loaded from: classes2.dex */
public final class j {
    public static final f1 a(e eVar, e eVar2) {
        int t;
        int t2;
        List F0;
        Map q;
        l.f(eVar, "from");
        l.f(eVar2, "to");
        eVar.w().size();
        eVar2.w().size();
        f1.a aVar = f1.f21236c;
        List<e1> w = eVar.w();
        l.e(w, "from.declaredTypeParameters");
        t = u.t(w, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<T> it = w.iterator();
        while (it.hasNext()) {
            arrayList.add(((e1) it.next()).g());
        }
        List<e1> w2 = eVar2.w();
        l.e(w2, "to.declaredTypeParameters");
        t2 = u.t(w2, 10);
        ArrayList arrayList2 = new ArrayList(t2);
        Iterator<T> it2 = w2.iterator();
        while (it2.hasNext()) {
            m0 s = ((e1) it2.next()).s();
            l.e(s, "it.defaultType");
            arrayList2.add(a.a(s));
        }
        F0 = b0.F0(arrayList, arrayList2);
        q = o0.q(F0);
        return f1.a.e(aVar, q, false, 2, null);
    }
}
