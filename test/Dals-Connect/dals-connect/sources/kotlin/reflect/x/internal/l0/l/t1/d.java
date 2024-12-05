package kotlin.reflect.x.internal.l0.l.t1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.r;
import kotlin.collections.u;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.l.b0;
import kotlin.reflect.x.internal.l0.l.f0;
import kotlin.reflect.x.internal.l0.l.g0;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.q1;
import kotlin.reflect.x.internal.l0.l.u1.j;
import kotlin.reflect.x.internal.l0.l.u1.k;
import kotlin.reflect.x.internal.l0.l.w;
import kotlin.reflect.x.internal.l0.l.y;

/* compiled from: IntersectionType.kt */
/* loaded from: classes2.dex */
public final class d {
    public static final q1 a(List<? extends q1> list) {
        int t;
        int t2;
        m0 W0;
        l.f(list, "types");
        int size = list.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types".toString());
        }
        if (size != 1) {
            t = u.t(list, 10);
            ArrayList arrayList = new ArrayList(t);
            boolean z = false;
            boolean z2 = false;
            for (q1 q1Var : list) {
                z = z || g0.a(q1Var);
                if (q1Var instanceof m0) {
                    W0 = (m0) q1Var;
                } else if (q1Var instanceof y) {
                    if (w.a(q1Var)) {
                        return q1Var;
                    }
                    W0 = ((y) q1Var).W0();
                    z2 = true;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList.add(W0);
            }
            if (z) {
                return k.d(j.y0, list.toString());
            }
            if (!z2) {
                return w.a.c(arrayList);
            }
            t2 = u.t(list, 10);
            ArrayList arrayList2 = new ArrayList(t2);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(b0.d((q1) it.next()));
            }
            w wVar = w.a;
            return f0.d(wVar.c(arrayList), wVar.c(arrayList2));
        }
        return (q1) r.n0(list);
    }
}
