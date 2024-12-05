package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class V2 {
    public static r a(C2094s2 c2094s2) {
        if (c2094s2 == null) {
            return r.f15866c0;
        }
        int M8 = c2094s2.M() - 1;
        if (M8 != 1) {
            if (M8 != 2) {
                if (M8 != 3) {
                    if (M8 == 4) {
                        List F8 = c2094s2.F();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = F8.iterator();
                        while (it.hasNext()) {
                            arrayList.add(a((C2094s2) it.next()));
                        }
                        return new C2091s(c2094s2.D(), arrayList);
                    }
                    throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                }
                if (c2094s2.H()) {
                    return new C1995g(Boolean.valueOf(c2094s2.G()));
                }
                return new C1995g(null);
            }
            if (c2094s2.J()) {
                return new C2020j(Double.valueOf(c2094s2.B()));
            }
            return new C2020j(null);
        }
        if (c2094s2.K()) {
            return new C2115v(c2094s2.E());
        }
        return r.f15873j0;
    }

    public static r b(Object obj) {
        if (obj == null) {
            return r.f15867d0;
        }
        if (obj instanceof String) {
            return new C2115v((String) obj);
        }
        if (obj instanceof Double) {
            return new C2020j((Double) obj);
        }
        if (obj instanceof Long) {
            return new C2020j(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C2020j(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C1995g((Boolean) obj);
        }
        if (obj instanceof Map) {
            C2060o c2060o = new C2060o();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                r b8 = b(map.get(obj2));
                if (obj2 != null) {
                    if (!(obj2 instanceof String)) {
                        obj2 = obj2.toString();
                    }
                    c2060o.l((String) obj2, b8);
                }
            }
            return c2060o;
        }
        if (obj instanceof List) {
            C1986f c1986f = new C1986f();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c1986f.z(c1986f.r(), b(it.next()));
            }
            return c1986f;
        }
        throw new IllegalArgumentException("Invalid value type");
    }
}
