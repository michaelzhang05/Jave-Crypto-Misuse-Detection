package M7;

import J7.r;
import com.inmobi.cmp.model.ChoiceError;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONException;
import org.json.JSONObject;
import v5.C3832b;

/* loaded from: classes5.dex */
public final class m implements j {

    /* renamed from: a, reason: collision with root package name */
    public c f7084a;

    /* renamed from: b, reason: collision with root package name */
    public JSONObject f7085b;

    public m(c coreUiLabelsResolver) {
        AbstractC3159y.i(coreUiLabelsResolver, "coreUiLabelsResolver");
        this.f7084a = coreUiLabelsResolver;
    }

    @Override // M7.j
    public Object a(String jsonString) {
        AbstractC3159y.i(jsonString, "jsonString");
        try {
            this.f7085b = new JSONObject(jsonString);
            return new r(this.f7084a.a(jsonString), b(), a());
        } catch (JSONException unused) {
            C3832b.b(C3832b.f38876a, ChoiceError.INVALID_JSON_FORMAT, null, null, null, null, 30);
            return new r(null, null, null, 7);
        }
    }

    public final J7.n b() {
        JSONObject jSONObject = this.f7085b;
        if (jSONObject == null) {
            AbstractC3159y.y("json");
            jSONObject = null;
        }
        JSONObject premiumUiLabels = jSONObject.getJSONObject("premiumUiLabels");
        String optString = premiumUiLabels.optString("linksTitle");
        String a8 = d.a(optString, "premiumUiLabels.optString(\"linksTitle\")", premiumUiLabels, "nonIabVendorsLabel", "premiumUiLabels.optString(\"nonIabVendorsLabel\")");
        String optString2 = premiumUiLabels.optString("uspDnsTitle");
        AbstractC3159y.h(optString2, "premiumUiLabels.optString(\"uspDnsTitle\")");
        AbstractC3159y.h(premiumUiLabels, "premiumUiLabels");
        List b8 = i.b(premiumUiLabels, "uspDnsText");
        String optString3 = premiumUiLabels.optString("uspDoNotSellToggleText");
        String a9 = d.a(optString3, "premiumUiLabels.optStrin…\"uspDoNotSellToggleText\")", premiumUiLabels, "uspPrivacyPolicyLinkText", "premiumUiLabels.optStrin…spPrivacyPolicyLinkText\")");
        String optString4 = premiumUiLabels.optString("uspDeleteDataLinkText");
        String a10 = d.a(optString4, "premiumUiLabels.optString(\"uspDeleteDataLinkText\")", premiumUiLabels, "uspAccessDataLinkText", "premiumUiLabels.optString(\"uspAccessDataLinkText\")");
        String optString5 = premiumUiLabels.optString("uspAcceptButton");
        AbstractC3159y.h(optString5, "premiumUiLabels.optString(\"uspAcceptButton\")");
        return new J7.n(optString, a8, optString2, b8, optString3, a9, optString4, a10, optString5, null, 512);
    }

    public final J7.i a() {
        JSONObject jSONObject = this.f7085b;
        if (jSONObject == null) {
            AbstractC3159y.y("json");
            jSONObject = null;
        }
        JSONObject mobileUiLabels = jSONObject.getJSONObject("mobileUiLabels");
        String optString = mobileUiLabels.optString("doneLabel");
        String optString2 = mobileUiLabels.optString("searchLabel");
        String optString3 = mobileUiLabels.optString("cancelLabel");
        String optString4 = mobileUiLabels.optString("consentLabel");
        String optString5 = mobileUiLabels.optString("flexPurposesLabel");
        String optString6 = mobileUiLabels.optString("cookieAccessBodyText");
        String optString7 = mobileUiLabels.optString("showVendorsLabel");
        String optString8 = mobileUiLabels.optString("showIabLabel");
        String optString9 = mobileUiLabels.optString("noneLabel");
        String optString10 = mobileUiLabels.optString("someLabel");
        String optString11 = mobileUiLabels.optString("allLabel");
        String optString12 = mobileUiLabels.optString("closeLabel");
        String optString13 = mobileUiLabels.optString("allVendorsLabel");
        AbstractC3159y.h(mobileUiLabels, "mobileUiLabels");
        List b8 = i.b(mobileUiLabels, "summaryScreenBodyRejectService");
        List b9 = i.b(mobileUiLabels, "summaryScreenBodyTextReject");
        AbstractC3159y.h(optString, "optString(\"doneLabel\")");
        AbstractC3159y.h(optString2, "optString(\"searchLabel\")");
        AbstractC3159y.h(optString3, "optString(\"cancelLabel\")");
        AbstractC3159y.h(optString7, "optString(\"showVendorsLabel\")");
        AbstractC3159y.h(optString8, "optString(\"showIabLabel\")");
        AbstractC3159y.h(optString4, "optString(\"consentLabel\")");
        AbstractC3159y.h(optString5, "optString(\"flexPurposesLabel\")");
        AbstractC3159y.h(optString6, "optString(\"cookieAccessBodyText\")");
        AbstractC3159y.h(optString9, "optString(\"noneLabel\")");
        AbstractC3159y.h(optString10, "optString(\"someLabel\")");
        AbstractC3159y.h(optString11, "optString(\"allLabel\")");
        AbstractC3159y.h(optString12, "optString(\"closeLabel\")");
        AbstractC3159y.h(optString13, "optString(\"allVendorsLabel\")");
        return new J7.i(optString, optString2, optString3, optString7, optString8, optString4, optString5, optString6, optString9, optString10, optString11, optString12, optString13, b8, b9);
    }
}
