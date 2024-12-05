package J7;

import M5.AbstractC1246t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import y5.t;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f5634a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5635b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5636c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5637d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5638e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5639f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5640g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5641h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5642i;

    /* renamed from: j, reason: collision with root package name */
    public final String f5643j;

    /* renamed from: k, reason: collision with root package name */
    public final String f5644k;

    /* renamed from: l, reason: collision with root package name */
    public final String f5645l;

    /* renamed from: m, reason: collision with root package name */
    public final String f5646m;

    /* renamed from: n, reason: collision with root package name */
    public final List f5647n;

    /* renamed from: o, reason: collision with root package name */
    public final List f5648o;

    public i(String doneLabel, String searchLabel, String cancelLabel, String showVendorsLabel, String showIabLabel, String consentLabel, String flexPurposesLabel, String cookieAccessBodyText, String noneLabel, String someLabel, String allLabel, String closeLabel, String allVendorsLabel, List summaryScreenBodyRejectService, List summaryScreenBodyTextReject) {
        AbstractC3159y.i(doneLabel, "doneLabel");
        AbstractC3159y.i(searchLabel, "searchLabel");
        AbstractC3159y.i(cancelLabel, "cancelLabel");
        AbstractC3159y.i(showVendorsLabel, "showVendorsLabel");
        AbstractC3159y.i(showIabLabel, "showIabLabel");
        AbstractC3159y.i(consentLabel, "consentLabel");
        AbstractC3159y.i(flexPurposesLabel, "flexPurposesLabel");
        AbstractC3159y.i(cookieAccessBodyText, "cookieAccessBodyText");
        AbstractC3159y.i(noneLabel, "noneLabel");
        AbstractC3159y.i(someLabel, "someLabel");
        AbstractC3159y.i(allLabel, "allLabel");
        AbstractC3159y.i(closeLabel, "closeLabel");
        AbstractC3159y.i(allVendorsLabel, "allVendorsLabel");
        AbstractC3159y.i(summaryScreenBodyRejectService, "summaryScreenBodyRejectService");
        AbstractC3159y.i(summaryScreenBodyTextReject, "summaryScreenBodyTextReject");
        this.f5634a = doneLabel;
        this.f5635b = searchLabel;
        this.f5636c = cancelLabel;
        this.f5637d = showVendorsLabel;
        this.f5638e = showIabLabel;
        this.f5639f = consentLabel;
        this.f5640g = flexPurposesLabel;
        this.f5641h = cookieAccessBodyText;
        this.f5642i = noneLabel;
        this.f5643j = someLabel;
        this.f5644k = allLabel;
        this.f5645l = closeLabel;
        this.f5646m = allVendorsLabel;
        this.f5647n = summaryScreenBodyRejectService;
        this.f5648o = summaryScreenBodyTextReject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (AbstractC3159y.d(this.f5634a, iVar.f5634a) && AbstractC3159y.d(this.f5635b, iVar.f5635b) && AbstractC3159y.d(this.f5636c, iVar.f5636c) && AbstractC3159y.d(this.f5637d, iVar.f5637d) && AbstractC3159y.d(this.f5638e, iVar.f5638e) && AbstractC3159y.d(this.f5639f, iVar.f5639f) && AbstractC3159y.d(this.f5640g, iVar.f5640g) && AbstractC3159y.d(this.f5641h, iVar.f5641h) && AbstractC3159y.d(this.f5642i, iVar.f5642i) && AbstractC3159y.d(this.f5643j, iVar.f5643j) && AbstractC3159y.d(this.f5644k, iVar.f5644k) && AbstractC3159y.d(this.f5645l, iVar.f5645l) && AbstractC3159y.d(this.f5646m, iVar.f5646m) && AbstractC3159y.d(this.f5647n, iVar.f5647n) && AbstractC3159y.d(this.f5648o, iVar.f5648o)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5648o.hashCode() + C6.l.a(this.f5647n, t.a(this.f5646m, t.a(this.f5645l, t.a(this.f5644k, t.a(this.f5643j, t.a(this.f5642i, t.a(this.f5641h, t.a(this.f5640g, t.a(this.f5639f, t.a(this.f5638e, t.a(this.f5637d, t.a(this.f5636c, t.a(this.f5635b, this.f5634a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        return "MobileUiLabels(doneLabel=" + this.f5634a + ", searchLabel=" + this.f5635b + ", cancelLabel=" + this.f5636c + ", showVendorsLabel=" + this.f5637d + ", showIabLabel=" + this.f5638e + ", consentLabel=" + this.f5639f + ", flexPurposesLabel=" + this.f5640g + ", cookieAccessBodyText=" + this.f5641h + ", noneLabel=" + this.f5642i + ", someLabel=" + this.f5643j + ", allLabel=" + this.f5644k + ", closeLabel=" + this.f5645l + ", allVendorsLabel=" + this.f5646m + ", summaryScreenBodyRejectService=" + this.f5647n + ", summaryScreenBodyTextReject=" + this.f5648o + ')';
    }

    public /* synthetic */ i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, List list2, int i8) {
        this((i8 & 1) != 0 ? "" : null, (i8 & 2) != 0 ? "" : null, (i8 & 4) != 0 ? "" : null, (i8 & 8) != 0 ? "" : null, (i8 & 16) != 0 ? "" : null, (i8 & 32) != 0 ? "" : null, (i8 & 64) != 0 ? "" : null, (i8 & 128) != 0 ? "" : null, (i8 & 256) != 0 ? "" : null, (i8 & 512) != 0 ? "" : null, (i8 & 1024) != 0 ? "" : null, (i8 & 2048) != 0 ? "" : null, (i8 & 4096) == 0 ? null : "", (i8 & 8192) != 0 ? AbstractC1246t.m() : null, (i8 & 16384) != 0 ? AbstractC1246t.m() : null);
    }
}
