package c3;

import b3.C1869d;
import com.stripe.android.model.Source;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* loaded from: classes4.dex */
public final class l implements InterfaceC3845a {
    @Override // w2.InterfaceC3845a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.g a(JSONObject json) {
        Source a8;
        C1869d a9;
        AbstractC3159y.i(json, "json");
        String l8 = v2.e.l(json, "object");
        if (l8 == null) {
            return null;
        }
        int hashCode = l8.hashCode();
        if (hashCode != -1825227990) {
            if (hashCode != -896505829) {
                if (hashCode != 3046160 || !l8.equals("card") || (a9 = new C1918d().a(json)) == null) {
                    return null;
                }
                return new com.stripe.android.model.f(a9);
            }
            if (!l8.equals("source") || (a8 = new C1908A().a(json)) == null) {
                return null;
            }
            return new com.stripe.android.model.h(a8);
        }
        if (!l8.equals("bank_account")) {
            return null;
        }
        return new com.stripe.android.model.e(new C1917c().a(json));
    }
}
