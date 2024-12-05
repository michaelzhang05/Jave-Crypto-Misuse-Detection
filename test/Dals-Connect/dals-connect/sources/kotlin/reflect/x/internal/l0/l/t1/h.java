package kotlin.reflect.x.internal.l0.l.t1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.x.internal.l0.l.e0;

/* compiled from: KotlinTypeRefiner.kt */
/* loaded from: classes2.dex */
public final class h {
    private static final f0<p<x>> a = new f0<>("KotlinTypeRefiner");

    public static final f0<p<x>> a() {
        return a;
    }

    public static final List<e0> b(g gVar, Iterable<? extends e0> iterable) {
        int t;
        l.f(gVar, "<this>");
        l.f(iterable, "types");
        t = u.t(iterable, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<? extends e0> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(gVar.a(it.next()));
        }
        return arrayList;
    }
}
