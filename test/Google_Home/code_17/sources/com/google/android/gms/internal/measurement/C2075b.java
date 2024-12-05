package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2075b {

    /* renamed from: a, reason: collision with root package name */
    private final TreeMap f16551a = new TreeMap();

    /* renamed from: b, reason: collision with root package name */
    private final TreeMap f16552b = new TreeMap();

    private static int a(V2 v22, C2245t c2245t, InterfaceC2236s interfaceC2236s) {
        InterfaceC2236s a8 = c2245t.a(v22, Collections.singletonList(interfaceC2236s));
        if (a8 instanceof C2165k) {
            return AbstractC2128g2.i(a8.z().doubleValue());
        }
        return -1;
    }

    public final void b(V2 v22, C2095d c2095d) {
        V5 v52 = new V5(c2095d);
        for (Integer num : this.f16551a.keySet()) {
            C2105e c2105e = (C2105e) c2095d.d().clone();
            int a8 = a(v22, (C2245t) this.f16551a.get(num), v52);
            if (a8 == 2 || a8 == -1) {
                c2095d.e(c2105e);
            }
        }
        Iterator it = this.f16552b.keySet().iterator();
        while (it.hasNext()) {
            a(v22, (C2245t) this.f16552b.get((Integer) it.next()), v52);
        }
    }

    public final void c(String str, int i8, C2245t c2245t, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f16552b;
        } else if ("edit".equals(str2)) {
            treeMap = this.f16551a;
        } else {
            throw new IllegalStateException("Unknown callback type: " + str2);
        }
        if (treeMap.containsKey(Integer.valueOf(i8))) {
            i8 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i8), c2245t);
    }
}
