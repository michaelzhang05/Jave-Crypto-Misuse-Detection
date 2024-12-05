package h3;

import O5.x;
import P5.Q;
import P5.a0;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: h3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2903e {
    private final Map a(Map map, String str, C2902d c2902d) {
        Map map2;
        Object obj = map.get(str);
        Map map3 = null;
        if (obj instanceof Map) {
            map2 = (Map) obj;
        } else {
            map2 = null;
        }
        if (map2 != null) {
            if (c2902d != null) {
                map3 = c2902d.g();
            }
            if (map3 == null) {
                map3 = Q.h();
            }
            Map q8 = Q.q(map, Q.e(x.a(str, Q.q(map2, map3))));
            if (q8 != null) {
                return q8;
            }
            return map;
        }
        return map;
    }

    public final Map b(Map params, C2902d c2902d) {
        Object obj;
        Map a8;
        AbstractC3255y.i(params, "params");
        Iterator it = a0.i("source_data", "payment_method_data").iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (params.containsKey((String) obj)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        String str = (String) obj;
        if (str != null && (a8 = a(params, str, c2902d)) != null) {
            return a8;
        }
        return params;
    }
}
