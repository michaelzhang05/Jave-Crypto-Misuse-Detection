package b3;

import M5.Q;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: b3.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1878m {
    public static final L5.r a(Map cardPaymentMethodCreateParams) {
        Map map;
        Object obj;
        Map map2;
        AbstractC3159y.i(cardPaymentMethodCreateParams, "cardPaymentMethodCreateParams");
        Object obj2 = cardPaymentMethodCreateParams.get("billing_details");
        if (obj2 instanceof Map) {
            map = (Map) obj2;
        } else {
            map = null;
        }
        if (map != null) {
            obj = map.get("address");
        } else {
            obj = null;
        }
        if (obj instanceof Map) {
            map2 = (Map) obj;
        } else {
            map2 = null;
        }
        if (map2 == null) {
            return null;
        }
        return L5.x.a("billing_address", Q.k(L5.x.a("country_code", map2.get("country")), L5.x.a("postal_code", map2.get("postal_code"))));
    }
}
