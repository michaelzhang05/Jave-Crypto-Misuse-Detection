package kotlin.reflect.x.internal.l0.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.u;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.b.k;
import kotlin.reflect.x.internal.l0.f.b;

/* compiled from: CompanionObjectMapping.kt */
/* loaded from: classes2.dex */
public final class c {
    public static final c a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final Set<b> f19665b;

    static {
        int t;
        List l0;
        List l02;
        List l03;
        Set<i> set = i.f19682g;
        t = u.t(set, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(k.c((i) it.next()));
        }
        kotlin.reflect.x.internal.l0.f.c l = k.a.f19716h.l();
        l.e(l, "string.toSafe()");
        l0 = b0.l0(arrayList, l);
        kotlin.reflect.x.internal.l0.f.c l2 = k.a.f19718j.l();
        l.e(l2, "_boolean.toSafe()");
        l02 = b0.l0(l0, l2);
        kotlin.reflect.x.internal.l0.f.c l3 = k.a.s.l();
        l.e(l3, "_enum.toSafe()");
        l03 = b0.l0(l02, l3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = l03.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(b.m((kotlin.reflect.x.internal.l0.f.c) it2.next()));
        }
        f19665b = linkedHashSet;
    }

    private c() {
    }

    public final Set<b> a() {
        return f19665b;
    }

    public final Set<b> b() {
        return f19665b;
    }
}
