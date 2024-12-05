package c3;

import androidx.autofill.HintConstants;
import b3.C1858C;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* loaded from: classes4.dex */
public final class y implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f14978b = new a(null);

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    @Override // w2.InterfaceC3845a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1858C a(JSONObject json) {
        com.stripe.android.model.a aVar;
        AbstractC3159y.i(json, "json");
        JSONObject optJSONObject = json.optJSONObject("address");
        if (optJSONObject != null) {
            aVar = new C1916b().a(optJSONObject);
        } else {
            aVar = null;
        }
        return new C1858C(aVar, v2.e.l(json, "name"), v2.e.l(json, HintConstants.AUTOFILL_HINT_PHONE));
    }
}
