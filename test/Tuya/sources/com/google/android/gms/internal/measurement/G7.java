package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class G7 {

    /* renamed from: a, reason: collision with root package name */
    final TreeMap f15336a = new TreeMap();

    /* renamed from: b, reason: collision with root package name */
    final TreeMap f15337b = new TreeMap();

    private static final int c(T1 t12, C2076q c2076q, r rVar) {
        r b8 = c2076q.b(t12, Collections.singletonList(rVar));
        if (b8 instanceof C2020j) {
            return AbstractC2110u2.b(b8.f().doubleValue());
        }
        return -1;
    }

    public final void a(String str, int i8, C2076q c2076q, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f15337b;
        } else if ("edit".equals(str2)) {
            treeMap = this.f15336a;
        } else {
            throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
        }
        if (treeMap.containsKey(Integer.valueOf(i8))) {
            i8 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i8), c2076q);
    }

    public final void b(T1 t12, C1959c c1959c) {
        C2104t4 c2104t4 = new C2104t4(c1959c);
        for (Integer num : this.f15336a.keySet()) {
            C1950b clone = c1959c.b().clone();
            int c8 = c(t12, (C2076q) this.f15336a.get(num), c2104t4);
            if (c8 == 2 || c8 == -1) {
                c1959c.f(clone);
            }
        }
        Iterator it = this.f15337b.keySet().iterator();
        while (it.hasNext()) {
            c(t12, (C2076q) this.f15337b.get((Integer) it.next()), c2104t4);
        }
    }
}
