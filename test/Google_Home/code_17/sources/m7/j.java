package M7;

import B5.t;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f7355a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7356b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7357c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7358d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7359e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7360f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7361g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7362h;

    /* renamed from: i, reason: collision with root package name */
    public final String f7363i;

    /* renamed from: j, reason: collision with root package name */
    public final String f7364j;

    /* renamed from: k, reason: collision with root package name */
    public final String f7365k;

    /* renamed from: l, reason: collision with root package name */
    public final String f7366l;

    /* renamed from: m, reason: collision with root package name */
    public final String f7367m;

    /* renamed from: n, reason: collision with root package name */
    public final String f7368n;

    /* renamed from: o, reason: collision with root package name */
    public final String f7369o;

    /* renamed from: p, reason: collision with root package name */
    public final String f7370p;

    public j(String titleText, String bodyText, String legitimateInterestLink, String purposesLabel, String consentLabel, String specialPurposesAndFeaturesLabel, String agreeToAllButtonText, String saveAndExitButtonText, String legalDescriptionTextLabel, String otherPreferencesText, String noneLabel, String someLabel, String allLabel, String closeLabel, String backLabel, String showPartners) {
        AbstractC3255y.i(titleText, "titleText");
        AbstractC3255y.i(bodyText, "bodyText");
        AbstractC3255y.i(legitimateInterestLink, "legitimateInterestLink");
        AbstractC3255y.i(purposesLabel, "purposesLabel");
        AbstractC3255y.i(consentLabel, "consentLabel");
        AbstractC3255y.i(specialPurposesAndFeaturesLabel, "specialPurposesAndFeaturesLabel");
        AbstractC3255y.i(agreeToAllButtonText, "agreeToAllButtonText");
        AbstractC3255y.i(saveAndExitButtonText, "saveAndExitButtonText");
        AbstractC3255y.i(legalDescriptionTextLabel, "legalDescriptionTextLabel");
        AbstractC3255y.i(otherPreferencesText, "otherPreferencesText");
        AbstractC3255y.i(noneLabel, "noneLabel");
        AbstractC3255y.i(someLabel, "someLabel");
        AbstractC3255y.i(allLabel, "allLabel");
        AbstractC3255y.i(closeLabel, "closeLabel");
        AbstractC3255y.i(backLabel, "backLabel");
        AbstractC3255y.i(showPartners, "showPartners");
        this.f7355a = titleText;
        this.f7356b = bodyText;
        this.f7357c = legitimateInterestLink;
        this.f7358d = purposesLabel;
        this.f7359e = consentLabel;
        this.f7360f = specialPurposesAndFeaturesLabel;
        this.f7361g = agreeToAllButtonText;
        this.f7362h = saveAndExitButtonText;
        this.f7363i = legalDescriptionTextLabel;
        this.f7364j = otherPreferencesText;
        this.f7365k = noneLabel;
        this.f7366l = someLabel;
        this.f7367m = allLabel;
        this.f7368n = closeLabel;
        this.f7369o = backLabel;
        this.f7370p = showPartners;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (AbstractC3255y.d(this.f7355a, jVar.f7355a) && AbstractC3255y.d(this.f7356b, jVar.f7356b) && AbstractC3255y.d(this.f7357c, jVar.f7357c) && AbstractC3255y.d(this.f7358d, jVar.f7358d) && AbstractC3255y.d(this.f7359e, jVar.f7359e) && AbstractC3255y.d(this.f7360f, jVar.f7360f) && AbstractC3255y.d(this.f7361g, jVar.f7361g) && AbstractC3255y.d(this.f7362h, jVar.f7362h) && AbstractC3255y.d(this.f7363i, jVar.f7363i) && AbstractC3255y.d(this.f7364j, jVar.f7364j) && AbstractC3255y.d(this.f7365k, jVar.f7365k) && AbstractC3255y.d(this.f7366l, jVar.f7366l) && AbstractC3255y.d(this.f7367m, jVar.f7367m) && AbstractC3255y.d(this.f7368n, jVar.f7368n) && AbstractC3255y.d(this.f7369o, jVar.f7369o) && AbstractC3255y.d(this.f7370p, jVar.f7370p)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f7370p.hashCode() + t.a(this.f7369o, t.a(this.f7368n, t.a(this.f7367m, t.a(this.f7366l, t.a(this.f7365k, t.a(this.f7364j, t.a(this.f7363i, t.a(this.f7362h, t.a(this.f7361g, t.a(this.f7360f, t.a(this.f7359e, t.a(this.f7358d, t.a(this.f7357c, t.a(this.f7356b, this.f7355a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        return "OptionsScreen(titleText=" + this.f7355a + ", bodyText=" + this.f7356b + ", legitimateInterestLink=" + this.f7357c + ", purposesLabel=" + this.f7358d + ", consentLabel=" + this.f7359e + ", specialPurposesAndFeaturesLabel=" + this.f7360f + ", agreeToAllButtonText=" + this.f7361g + ", saveAndExitButtonText=" + this.f7362h + ", legalDescriptionTextLabel=" + this.f7363i + ", otherPreferencesText=" + this.f7364j + ", noneLabel=" + this.f7365k + ", someLabel=" + this.f7366l + ", allLabel=" + this.f7367m + ", closeLabel=" + this.f7368n + ", backLabel=" + this.f7369o + ", showPartners=" + this.f7370p + ')';
    }
}
