package M7;

import B5.t;
import P5.AbstractC1378t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f7340a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7341b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7342c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7343d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7344e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7345f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7346g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7347h;

    /* renamed from: i, reason: collision with root package name */
    public final String f7348i;

    /* renamed from: j, reason: collision with root package name */
    public final String f7349j;

    /* renamed from: k, reason: collision with root package name */
    public final String f7350k;

    /* renamed from: l, reason: collision with root package name */
    public final String f7351l;

    /* renamed from: m, reason: collision with root package name */
    public final String f7352m;

    /* renamed from: n, reason: collision with root package name */
    public final List f7353n;

    /* renamed from: o, reason: collision with root package name */
    public final List f7354o;

    public i(String doneLabel, String searchLabel, String cancelLabel, String showVendorsLabel, String showIabLabel, String consentLabel, String flexPurposesLabel, String cookieAccessBodyText, String noneLabel, String someLabel, String allLabel, String closeLabel, String allVendorsLabel, List summaryScreenBodyRejectService, List summaryScreenBodyTextReject) {
        AbstractC3255y.i(doneLabel, "doneLabel");
        AbstractC3255y.i(searchLabel, "searchLabel");
        AbstractC3255y.i(cancelLabel, "cancelLabel");
        AbstractC3255y.i(showVendorsLabel, "showVendorsLabel");
        AbstractC3255y.i(showIabLabel, "showIabLabel");
        AbstractC3255y.i(consentLabel, "consentLabel");
        AbstractC3255y.i(flexPurposesLabel, "flexPurposesLabel");
        AbstractC3255y.i(cookieAccessBodyText, "cookieAccessBodyText");
        AbstractC3255y.i(noneLabel, "noneLabel");
        AbstractC3255y.i(someLabel, "someLabel");
        AbstractC3255y.i(allLabel, "allLabel");
        AbstractC3255y.i(closeLabel, "closeLabel");
        AbstractC3255y.i(allVendorsLabel, "allVendorsLabel");
        AbstractC3255y.i(summaryScreenBodyRejectService, "summaryScreenBodyRejectService");
        AbstractC3255y.i(summaryScreenBodyTextReject, "summaryScreenBodyTextReject");
        this.f7340a = doneLabel;
        this.f7341b = searchLabel;
        this.f7342c = cancelLabel;
        this.f7343d = showVendorsLabel;
        this.f7344e = showIabLabel;
        this.f7345f = consentLabel;
        this.f7346g = flexPurposesLabel;
        this.f7347h = cookieAccessBodyText;
        this.f7348i = noneLabel;
        this.f7349j = someLabel;
        this.f7350k = allLabel;
        this.f7351l = closeLabel;
        this.f7352m = allVendorsLabel;
        this.f7353n = summaryScreenBodyRejectService;
        this.f7354o = summaryScreenBodyTextReject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (AbstractC3255y.d(this.f7340a, iVar.f7340a) && AbstractC3255y.d(this.f7341b, iVar.f7341b) && AbstractC3255y.d(this.f7342c, iVar.f7342c) && AbstractC3255y.d(this.f7343d, iVar.f7343d) && AbstractC3255y.d(this.f7344e, iVar.f7344e) && AbstractC3255y.d(this.f7345f, iVar.f7345f) && AbstractC3255y.d(this.f7346g, iVar.f7346g) && AbstractC3255y.d(this.f7347h, iVar.f7347h) && AbstractC3255y.d(this.f7348i, iVar.f7348i) && AbstractC3255y.d(this.f7349j, iVar.f7349j) && AbstractC3255y.d(this.f7350k, iVar.f7350k) && AbstractC3255y.d(this.f7351l, iVar.f7351l) && AbstractC3255y.d(this.f7352m, iVar.f7352m) && AbstractC3255y.d(this.f7353n, iVar.f7353n) && AbstractC3255y.d(this.f7354o, iVar.f7354o)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f7354o.hashCode() + F6.l.a(this.f7353n, t.a(this.f7352m, t.a(this.f7351l, t.a(this.f7350k, t.a(this.f7349j, t.a(this.f7348i, t.a(this.f7347h, t.a(this.f7346g, t.a(this.f7345f, t.a(this.f7344e, t.a(this.f7343d, t.a(this.f7342c, t.a(this.f7341b, this.f7340a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        return "MobileUiLabels(doneLabel=" + this.f7340a + ", searchLabel=" + this.f7341b + ", cancelLabel=" + this.f7342c + ", showVendorsLabel=" + this.f7343d + ", showIabLabel=" + this.f7344e + ", consentLabel=" + this.f7345f + ", flexPurposesLabel=" + this.f7346g + ", cookieAccessBodyText=" + this.f7347h + ", noneLabel=" + this.f7348i + ", someLabel=" + this.f7349j + ", allLabel=" + this.f7350k + ", closeLabel=" + this.f7351l + ", allVendorsLabel=" + this.f7352m + ", summaryScreenBodyRejectService=" + this.f7353n + ", summaryScreenBodyTextReject=" + this.f7354o + ')';
    }

    public /* synthetic */ i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, List list2, int i8) {
        this((i8 & 1) != 0 ? "" : null, (i8 & 2) != 0 ? "" : null, (i8 & 4) != 0 ? "" : null, (i8 & 8) != 0 ? "" : null, (i8 & 16) != 0 ? "" : null, (i8 & 32) != 0 ? "" : null, (i8 & 64) != 0 ? "" : null, (i8 & 128) != 0 ? "" : null, (i8 & 256) != 0 ? "" : null, (i8 & 512) != 0 ? "" : null, (i8 & 1024) != 0 ? "" : null, (i8 & 2048) != 0 ? "" : null, (i8 & 4096) == 0 ? null : "", (i8 & 8192) != 0 ? AbstractC1378t.m() : null, (i8 & 16384) != 0 ? AbstractC1378t.m() : null);
    }
}
