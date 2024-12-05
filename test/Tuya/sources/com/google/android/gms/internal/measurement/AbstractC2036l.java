package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC2036l {
    public static r a(InterfaceC2052n interfaceC2052n, r rVar, T1 t12, List list) {
        if (interfaceC2052n.a(rVar.g())) {
            r p8 = interfaceC2052n.p(rVar.g());
            if (p8 instanceof AbstractC2028k) {
                return ((AbstractC2028k) p8).b(t12, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", rVar.g()));
        }
        if ("hasOwnProperty".equals(rVar.g())) {
            AbstractC2110u2.h("hasOwnProperty", 1, list);
            if (interfaceC2052n.a(t12.b((r) list.get(0)).g())) {
                return r.f15871h0;
            }
            return r.f15872i0;
        }
        throw new IllegalArgumentException(String.format("Object has no function %s", rVar.g()));
    }

    public static Iterator b(Map map) {
        return new C2044m(map.keySet().iterator());
    }
}
