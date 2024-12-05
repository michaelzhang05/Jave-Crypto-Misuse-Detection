package P7;

import M7.r;
import com.inmobi.cmp.model.ChoiceError;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONException;
import org.json.JSONObject;
import y5.C4209b;

/* loaded from: classes5.dex */
public final class m implements j {

    /* renamed from: a, reason: collision with root package name */
    public c f8908a;

    /* renamed from: b, reason: collision with root package name */
    public JSONObject f8909b;

    public m(c coreUiLabelsResolver) {
        AbstractC3255y.i(coreUiLabelsResolver, "coreUiLabelsResolver");
        this.f8908a = coreUiLabelsResolver;
    }

    @Override // P7.j
    public Object a(String jsonString) {
        AbstractC3255y.i(jsonString, "jsonString");
        try {
            this.f8909b = new JSONObject(jsonString);
            return new r(this.f8908a.a(jsonString), b(), a());
        } catch (JSONException unused) {
            C4209b.b(C4209b.f41007a, ChoiceError.INVALID_JSON_FORMAT, null, null, null, null, 30);
            return new r(null, null, null, 7);
        }
    }

    public final M7.n b() {
        JSONObject jSONObject = this.f8909b;
        if (jSONObject == null) {
            AbstractC3255y.y("json");
            jSONObject = null;
        }
        JSONObject premiumUiLabels = jSONObject.getJSONObject("premiumUiLabels");
        String optString = premiumUiLabels.optString("linksTitle");
        String a8 = d.a(optString, "premiumUiLabels.optString(\"linksTitle\")", premiumUiLabels, "nonIabVendorsLabel", "premiumUiLabels.optString(\"nonIabVendorsLabel\")");
        String optString2 = premiumUiLabels.optString("uspDnsTitle");
        AbstractC3255y.h(optString2, "premiumUiLabels.optString(\"uspDnsTitle\")");
        AbstractC3255y.h(premiumUiLabels, "premiumUiLabels");
        List b8 = i.b(premiumUiLabels, "uspDnsText");
        String optString3 = premiumUiLabels.optString("uspDoNotSellToggleText");
        String a9 = d.a(optString3, "premiumUiLabels.optStrin…\"uspDoNotSellToggleText\")", premiumUiLabels, "uspPrivacyPolicyLinkText", "premiumUiLabels.optStrin…spPrivacyPolicyLinkText\")");
        String optString4 = premiumUiLabels.optString("uspDeleteDataLinkText");
        String a10 = d.a(optString4, "premiumUiLabels.optString(\"uspDeleteDataLinkText\")", premiumUiLabels, "uspAccessDataLinkText", "premiumUiLabels.optString(\"uspAccessDataLinkText\")");
        String optString5 = premiumUiLabels.optString("uspAcceptButton");
        AbstractC3255y.h(optString5, "premiumUiLabels.optString(\"uspAcceptButton\")");
        return new M7.n(optString, a8, optString2, b8, optString3, a9, optString4, a10, optString5, null, 512);
    }

    public final M7.i a() {
        JSONObject jSONObject = this.f8909b;
        if (jSONObject == null) {
            AbstractC3255y.y("json");
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
        AbstractC3255y.h(mobileUiLabels, "mobileUiLabels");
        List b8 = i.b(mobileUiLabels, "summaryScreenBodyRejectService");
        List b9 = i.b(mobileUiLabels, "summaryScreenBodyTextReject");
        AbstractC3255y.h(optString, "optString(\"doneLabel\")");
        AbstractC3255y.h(optString2, "optString(\"searchLabel\")");
        AbstractC3255y.h(optString3, "optString(\"cancelLabel\")");
        AbstractC3255y.h(optString7, "optString(\"showVendorsLabel\")");
        AbstractC3255y.h(optString8, "optString(\"showIabLabel\")");
        AbstractC3255y.h(optString4, "optString(\"consentLabel\")");
        AbstractC3255y.h(optString5, "optString(\"flexPurposesLabel\")");
        AbstractC3255y.h(optString6, "optString(\"cookieAccessBodyText\")");
        AbstractC3255y.h(optString9, "optString(\"noneLabel\")");
        AbstractC3255y.h(optString10, "optString(\"someLabel\")");
        AbstractC3255y.h(optString11, "optString(\"allLabel\")");
        AbstractC3255y.h(optString12, "optString(\"closeLabel\")");
        AbstractC3255y.h(optString13, "optString(\"allVendorsLabel\")");
        return new M7.i(optString, optString2, optString3, optString7, optString8, optString4, optString5, optString6, optString9, optString10, optString11, optString12, optString13, b8, b9);
    }
}
