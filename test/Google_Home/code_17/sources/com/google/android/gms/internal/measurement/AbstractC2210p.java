package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC2210p {
    public static InterfaceC2236s a(InterfaceC2183m interfaceC2183m, InterfaceC2236s interfaceC2236s, V2 v22, List list) {
        if (interfaceC2183m.f(interfaceC2236s.A())) {
            InterfaceC2236s c8 = interfaceC2183m.c(interfaceC2236s.A());
            if (c8 instanceof AbstractC2192n) {
                return ((AbstractC2192n) c8).a(v22, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", interfaceC2236s.A()));
        }
        if ("hasOwnProperty".equals(interfaceC2236s.A())) {
            AbstractC2128g2.g("hasOwnProperty", 1, list);
            if (interfaceC2183m.f(v22.b((InterfaceC2236s) list.get(0)).A())) {
                return InterfaceC2236s.f16807g0;
            }
            return InterfaceC2236s.f16808h0;
        }
        throw new IllegalArgumentException(String.format("Object has no function %s", interfaceC2236s.A()));
    }

    public static Iterator b(Map map) {
        return new C2201o(map.keySet().iterator());
    }
}
