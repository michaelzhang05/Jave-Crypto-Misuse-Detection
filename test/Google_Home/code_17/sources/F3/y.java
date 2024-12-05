package f3;

import androidx.autofill.HintConstants;
import e3.C2779C;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* loaded from: classes4.dex */
public final class y implements InterfaceC4225a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f31953b = new a(null);

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    @Override // z2.InterfaceC4225a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2779C a(JSONObject json) {
        com.stripe.android.model.a aVar;
        AbstractC3255y.i(json, "json");
        JSONObject optJSONObject = json.optJSONObject("address");
        if (optJSONObject != null) {
            aVar = new C2826b().a(optJSONObject);
        } else {
            aVar = null;
        }
        return new C2779C(aVar, y2.e.l(json, "name"), y2.e.l(json, HintConstants.AUTOFILL_HINT_PHONE));
    }
}
