package M7;

import J7.o;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.portalconfig.GBCConsentValue;
import com.inmobi.cmp.model.ChoiceError;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class l implements j {

    /* renamed from: a, reason: collision with root package name */
    public ChoiceCmpCallback f7081a;

    /* renamed from: b, reason: collision with root package name */
    public c f7082b;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f7083c;

    public l(ChoiceCmpCallback choiceCmpCallback, c coreUiLabelsResolver) {
        AbstractC3159y.i(coreUiLabelsResolver, "coreUiLabelsResolver");
        this.f7081a = choiceCmpCallback;
        this.f7082b = coreUiLabelsResolver;
    }

    @Override // M7.j
    public Object a(String jsonString) {
        AbstractC3159y.i(jsonString, "jsonString");
        try {
            this.f7083c = new JSONObject(jsonString);
            return new E6.f(c(), a(), b(), this.f7082b.a(jsonString), null, d(), 16);
        } catch (JSONException unused) {
            ChoiceCmpCallback choiceCmpCallback = this.f7081a;
            if (choiceCmpCallback != null) {
                choiceCmpCallback.onCmpError(ChoiceError.UNKNOWN_CONFIG);
            }
            return new E6.f(null, null, null, null, null, null, 63);
        }
    }

    public final E6.e b() {
        JSONObject jSONObject = this.f7083c;
        if (jSONObject == null) {
            AbstractC3159y.y("json");
            jSONObject = null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("nonIabVendorsInfo");
        JSONArray optJSONArray = jSONObject2.optJSONArray("nonIabVendorList");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            int i8 = 0;
            while (i8 < length) {
                int i9 = i8 + 1;
                JSONObject nonIABVendor = optJSONArray.getJSONObject(i8);
                int optInt = nonIABVendor.optInt("vendorId");
                String optString = nonIABVendor.optString("pCode");
                String a8 = d.a(optString, "nonIABVendor.optString(\"pCode\")", nonIABVendor, "name", "nonIABVendor.optString(\"name\")");
                String optString2 = nonIABVendor.optString("description", "");
                AbstractC3159y.h(optString2, "nonIABVendor.optString(\"description\", EMPTY)");
                String optString3 = nonIABVendor.optString("privacyPolicyUrl", "");
                AbstractC3159y.h(optString3, "nonIABVendor.optString(\"privacyPolicyUrl\", EMPTY)");
                AbstractC3159y.h(nonIABVendor, "nonIABVendor");
                arrayList.add(new E6.d(optInt, optString, a8, optString2, optString3, i.a(nonIABVendor, "nonIabPurposeConsentIds"), i.a(nonIABVendor, "nonIabPurposeLegitimateInterestIds")));
                i8 = i9;
            }
        }
        String optString4 = jSONObject2.optString("updateAt");
        return new E6.e(arrayList, optString4, d.a(optString4, "nonIabVendors.optString(\"updateAt\")", jSONObject2, "nonIabVendorsHash", "nonIabVendors.optString(\"nonIabVendorsHash\")"));
    }

    public final E6.g c() {
        JSONObject jSONObject = this.f7083c;
        if (jSONObject == null) {
            AbstractC3159y.y("json");
            jSONObject = null;
        }
        JSONObject premiumProperties = jSONObject.getJSONObject("premiumProperties");
        AbstractC3159y.h(premiumProperties, "premiumProperties");
        return new E6.g(i.a(premiumProperties, "vendorBlacklist"), i.a(premiumProperties, "vendorWhitelist"), i.a(premiumProperties, "googleWhitelist"));
    }

    public final J7.n d() {
        JSONObject jSONObject = this.f7083c;
        J7.n nVar = null;
        ArrayList arrayList = null;
        if (jSONObject == null) {
            AbstractC3159y.y("json");
            jSONObject = null;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("premiumUiLabels");
        if (optJSONObject != null) {
            JSONArray optJSONArray = optJSONObject.optJSONArray("initScreenCustomLinks");
            if (optJSONArray != null) {
                arrayList = new ArrayList();
                int length = optJSONArray.length();
                int i8 = 0;
                while (i8 < length) {
                    int i9 = i8 + 1;
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i8);
                    String optString = optJSONObject2.optString("label");
                    arrayList.add(new o(optString, d.a(optString, "initScreenCustomLink.optString(\"label\")", optJSONObject2, "link", "initScreenCustomLink.optString(\"link\")")));
                    i8 = i9;
                }
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            String optString2 = optJSONObject.optString("uspDnsTitle");
            List b8 = i.b(optJSONObject, "uspDnsText");
            String optString3 = optJSONObject.optString("uspDeleteDataLinkText");
            String optString4 = optJSONObject.optString("uspAccessDataLinkText");
            String optString5 = optJSONObject.optString("uspPrivacyPolicyLinkText");
            AbstractC3159y.h(optString2, "optString(\"uspDnsTitle\")");
            AbstractC3159y.h(optString5, "optString(\"uspPrivacyPolicyLinkText\")");
            AbstractC3159y.h(optString3, "optString(\"uspDeleteDataLinkText\")");
            AbstractC3159y.h(optString4, "optString(\"uspAccessDataLinkText\")");
            nVar = new J7.n(null, null, optString2, b8, null, optString5, optString3, optString4, null, arrayList, 275);
        }
        if (nVar == null) {
            return new J7.n(null, null, null, null, null, null, null, null, null, null, 1023);
        }
        return nVar;
    }

    public final E6.a a() {
        String str;
        E6.c cVar;
        String str2;
        List list;
        List list2;
        List list3;
        JSONObject jSONObject = this.f7083c;
        if (jSONObject == null) {
            AbstractC3159y.y("json");
            jSONObject = null;
        }
        JSONObject coreConfig = jSONObject.getJSONObject("coreConfig");
        String optString = coreConfig.optString("inmobiAccountId");
        AbstractC3159y.h(optString, "coreConfig.optString(\"inmobiAccountId\")");
        AbstractC3159y.h(coreConfig, "coreConfig");
        List b8 = i.b(coreConfig, "privacyMode");
        List b9 = i.b(coreConfig, "uspJurisdiction");
        String optString2 = coreConfig.optString("uspLspact");
        String a8 = d.a(optString2, "coreConfig.optString(\"uspLspact\")", coreConfig, "hashCode", "coreConfig.optString(\"hashCode\")");
        String optString3 = coreConfig.optString("publisherCountryCode");
        String a9 = d.a(optString3, "coreConfig.optString(\"publisherCountryCode\")", coreConfig, "publisherName", "coreConfig.optString(\"publisherName\")");
        List a10 = i.a(coreConfig, "vendorPurposeIds");
        List a11 = i.a(coreConfig, "vendorFeaturesIds");
        List a12 = i.a(coreConfig, "vendorPurposeLegitimateInterestIds");
        List a13 = i.a(coreConfig, "vendorSpecialFeaturesIds");
        List a14 = i.a(coreConfig, "vendorSpecialPurposesIds");
        boolean optBoolean = coreConfig.optBoolean("googleEnabled");
        String optString4 = coreConfig.optString("consentScope");
        String a15 = d.a(optString4, "coreConfig.optString(\"consentScope\")", coreConfig, "lang_", "coreConfig.optString(\"lang_\")");
        String optString5 = coreConfig.optString("displayUi");
        AbstractC3159y.h(optString5, "coreConfig.optString(\"displayUi\")");
        boolean optBoolean2 = coreConfig.optBoolean("initScreenRejectButtonShowing");
        String optString6 = coreConfig.optString("publisherLogo");
        AbstractC3159y.h(optString6, "coreConfig.optString(\"publisherLogo\")");
        List a16 = i.a(coreConfig, "publisherPurposeIds");
        List a17 = i.a(coreConfig, "publisherPurposeLegitimateInterestIds");
        List a18 = i.a(coreConfig, "publisherSpecialPurposesIds");
        List a19 = i.a(coreConfig, "publisherFeaturesIds");
        List a20 = i.a(coreConfig, "publisherSpecialFeaturesIds");
        List a21 = i.a(coreConfig, "publisherConsentRestrictionIds");
        List a22 = i.a(coreConfig, "publisherLIRestrictionIds");
        List a23 = i.a(coreConfig, "stacks");
        int optInt = coreConfig.optInt("vendorListUpdateFreq");
        String optString7 = coreConfig.optString("thirdPartyStorageType");
        AbstractC3159y.h(optString7, "coreConfig.optString(\"thirdPartyStorageType\")");
        boolean optBoolean3 = coreConfig.optBoolean("suppressCcpaLinks", false);
        String optString8 = coreConfig.optString("uspDeleteDataLink");
        String a24 = d.a(optString8, "coreConfig.optString(\"uspDeleteDataLink\")", coreConfig, "uspAccessDataLink", "coreConfig.optString(\"uspAccessDataLink\")");
        String optString9 = coreConfig.optString("uspPrivacyPolicyLink");
        AbstractC3159y.h(optString9, "coreConfig.optString(\"uspPrivacyPolicyLink\")");
        int optInt2 = coreConfig.optInt("gvlVersion", 2);
        Integer valueOf = Integer.valueOf(coreConfig.optInt("totalVendors"));
        String optString10 = coreConfig.optString("gdprEncodingMode");
        String optString11 = coreConfig.optString("mspaJurisdiction");
        boolean optBoolean4 = coreConfig.optBoolean("isCoveredTransaction", false);
        String optString12 = coreConfig.optString("mspaSignalMode");
        boolean optBoolean5 = coreConfig.optBoolean("ccpaViaUsp", true);
        List a25 = i.a(coreConfig, "mspaOptOutPurposeIds");
        List a26 = i.a(coreConfig, "mspaSensitiveDataPurposeIds");
        String optString13 = coreConfig.optString("cmpVersion");
        List b10 = i.b(coreConfig, "consentLocations");
        boolean optBoolean6 = coreConfig.optBoolean("mspaAutoPopUp", false);
        JSONObject optJSONObject = coreConfig.optJSONObject("gbcConfig");
        if (optJSONObject == null) {
            str = a24;
            cVar = new E6.c(false, null, null, 7);
            str2 = optString8;
            list3 = a11;
            list2 = a12;
            list = a13;
        } else {
            str = a24;
            boolean optBoolean7 = optJSONObject.optBoolean("enabled", false);
            List b11 = i.b(optJSONObject, "locations");
            str2 = optString8;
            JSONArray optJSONArray = optJSONObject.optJSONArray("applicablePurposes");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray == null) {
                list3 = a11;
                list2 = a12;
                list = a13;
            } else {
                list = a13;
                int length = optJSONArray.length();
                list2 = a12;
                int i8 = 0;
                while (i8 < length) {
                    int i9 = i8 + 1;
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i8);
                    int i10 = length;
                    int optInt3 = jSONObject2.optInt("id");
                    List list4 = a11;
                    String optString14 = jSONObject2.optString("defaultValue");
                    AbstractC3159y.h(optString14, "gbcPurpose.optString(\"defaultValue\")");
                    arrayList.add(new E6.b(optInt3, GBCConsentValue.valueOf(optString14)));
                    i8 = i9;
                    optJSONArray = optJSONArray;
                    length = i10;
                    a11 = list4;
                }
                list3 = a11;
            }
            cVar = new E6.c(optBoolean7, b11, arrayList);
        }
        return new E6.a(optString, b8, b9, optString2, a8, optString3, a9, a10, list3, list2, list, a14, optBoolean, optString4, a15, optString5, optBoolean2, optString6, a16, a17, a18, a19, a20, a21, a22, a23, optInt, optString7, optBoolean3, str2, str, optString9, optInt2, valueOf, optString10, optString11, optBoolean4, optString12, optBoolean5, a25, a26, optString13, b10, optBoolean6, cVar);
    }
}
