package e3;

import L5.x;
import M5.Q;
import M5.a0;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: e3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2583e {
    private final Map a(Map map, String str, C2582d c2582d) {
        Map map2;
        Object obj = map.get(str);
        Map map3 = null;
        if (obj instanceof Map) {
            map2 = (Map) obj;
        } else {
            map2 = null;
        }
        if (map2 != null) {
            if (c2582d != null) {
                map3 = c2582d.e();
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

    public final Map b(Map params, C2582d c2582d) {
        Object obj;
        Map a8;
        AbstractC3159y.i(params, "params");
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
        if (str != null && (a8 = a(params, str, c2582d)) != null) {
            return a8;
        }
        return params;
    }
}
