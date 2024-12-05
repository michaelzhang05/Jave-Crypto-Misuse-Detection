package f3;

import com.stripe.android.model.Source;
import e3.C2790d;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* loaded from: classes4.dex */
public final class l implements InterfaceC4225a {
    @Override // z2.InterfaceC4225a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.g a(JSONObject json) {
        Source a8;
        C2790d a9;
        AbstractC3255y.i(json, "json");
        String l8 = y2.e.l(json, "object");
        if (l8 == null) {
            return null;
        }
        int hashCode = l8.hashCode();
        if (hashCode != -1825227990) {
            if (hashCode != -896505829) {
                if (hashCode != 3046160 || !l8.equals("card") || (a9 = new C2828d().a(json)) == null) {
                    return null;
                }
                return new com.stripe.android.model.f(a9);
            }
            if (!l8.equals("source") || (a8 = new C2818A().a(json)) == null) {
                return null;
            }
            return new com.stripe.android.model.h(a8);
        }
        if (!l8.equals("bank_account")) {
            return null;
        }
        return new com.stripe.android.model.e(new C2827c().a(json));
    }
}
