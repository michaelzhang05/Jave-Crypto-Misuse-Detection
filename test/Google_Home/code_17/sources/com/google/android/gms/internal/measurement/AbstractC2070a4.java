package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.a4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2070a4 {
    public static InterfaceC2236s a(C2119f3 c2119f3) {
        if (c2119f3 == null) {
            return InterfaceC2236s.f16802b0;
        }
        int i8 = AbstractC2303z3.f16918a[c2119f3.H().ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        if (i8 != 5) {
                            throw new IllegalStateException("Invalid entity: " + String.valueOf(c2119f3));
                        }
                        throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                    }
                    List L8 = c2119f3.L();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = L8.iterator();
                    while (it.hasNext()) {
                        arrayList.add(a((C2119f3) it.next()));
                    }
                    return new C2263v(c2119f3.J(), arrayList);
                }
                if (c2119f3.N()) {
                    return new C2135h(Boolean.valueOf(c2119f3.M()));
                }
                return new C2135h(null);
            }
            if (c2119f3.O()) {
                return new C2165k(Double.valueOf(c2119f3.G()));
            }
            return new C2165k(null);
        }
        if (c2119f3.P()) {
            return new C2254u(c2119f3.K());
        }
        return InterfaceC2236s.f16809i0;
    }

    public static InterfaceC2236s b(Object obj) {
        if (obj == null) {
            return InterfaceC2236s.f16803c0;
        }
        if (obj instanceof String) {
            return new C2254u((String) obj);
        }
        if (obj instanceof Double) {
            return new C2165k((Double) obj);
        }
        if (obj instanceof Long) {
            return new C2165k(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C2165k(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C2135h((Boolean) obj);
        }
        if (obj instanceof Map) {
            r rVar = new r();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                InterfaceC2236s b8 = b(map.get(obj2));
                if (obj2 != null) {
                    if (!(obj2 instanceof String)) {
                        obj2 = obj2.toString();
                    }
                    rVar.j((String) obj2, b8);
                }
            }
            return rVar;
        }
        if (obj instanceof List) {
            C2125g c2125g = new C2125g();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c2125g.l(b(it.next()));
            }
            return c2125g;
        }
        throw new IllegalArgumentException("Invalid value type");
    }
}
