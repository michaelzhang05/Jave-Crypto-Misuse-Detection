package e3;

import P5.Q;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: e3.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2799m {
    public static final O5.r a(Map cardPaymentMethodCreateParams) {
        Map map;
        Object obj;
        Map map2;
        AbstractC3255y.i(cardPaymentMethodCreateParams, "cardPaymentMethodCreateParams");
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
        return O5.x.a("billing_address", Q.k(O5.x.a("country_code", map2.get("country")), O5.x.a("postal_code", map2.get("postal_code"))));
    }
}
