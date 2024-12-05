package J7;

import M5.AbstractC1246t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f5689a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5690b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5691c;

    /* renamed from: d, reason: collision with root package name */
    public final List f5692d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5693e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5694f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5695g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5696h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5697i;

    /* renamed from: j, reason: collision with root package name */
    public final List f5698j;

    public n(String linksTitle, String nonIabVendorsLabel, String uspDnsTitle, List uspDnsText, String uspDoNotSellToggleText, String uspPrivacyPolicyLinkText, String uspDeleteDataLinkText, String uspAccessDataLinkText, String uspAcceptButton, List initScreenCustomLinks) {
        AbstractC3159y.i(linksTitle, "linksTitle");
        AbstractC3159y.i(nonIabVendorsLabel, "nonIabVendorsLabel");
        AbstractC3159y.i(uspDnsTitle, "uspDnsTitle");
        AbstractC3159y.i(uspDnsText, "uspDnsText");
        AbstractC3159y.i(uspDoNotSellToggleText, "uspDoNotSellToggleText");
        AbstractC3159y.i(uspPrivacyPolicyLinkText, "uspPrivacyPolicyLinkText");
        AbstractC3159y.i(uspDeleteDataLinkText, "uspDeleteDataLinkText");
        AbstractC3159y.i(uspAccessDataLinkText, "uspAccessDataLinkText");
        AbstractC3159y.i(uspAcceptButton, "uspAcceptButton");
        AbstractC3159y.i(initScreenCustomLinks, "initScreenCustomLinks");
        this.f5689a = linksTitle;
        this.f5690b = nonIabVendorsLabel;
        this.f5691c = uspDnsTitle;
        this.f5692d = uspDnsText;
        this.f5693e = uspDoNotSellToggleText;
        this.f5694f = uspPrivacyPolicyLinkText;
        this.f5695g = uspDeleteDataLinkText;
        this.f5696h = uspAccessDataLinkText;
        this.f5697i = uspAcceptButton;
        this.f5698j = initScreenCustomLinks;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (AbstractC3159y.d(this.f5689a, nVar.f5689a) && AbstractC3159y.d(this.f5690b, nVar.f5690b) && AbstractC3159y.d(this.f5691c, nVar.f5691c) && AbstractC3159y.d(this.f5692d, nVar.f5692d) && AbstractC3159y.d(this.f5693e, nVar.f5693e) && AbstractC3159y.d(this.f5694f, nVar.f5694f) && AbstractC3159y.d(this.f5695g, nVar.f5695g) && AbstractC3159y.d(this.f5696h, nVar.f5696h) && AbstractC3159y.d(this.f5697i, nVar.f5697i) && AbstractC3159y.d(this.f5698j, nVar.f5698j)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5698j.hashCode() + t.a(this.f5697i, t.a(this.f5696h, t.a(this.f5695g, t.a(this.f5694f, t.a(this.f5693e, C6.l.a(this.f5692d, t.a(this.f5691c, t.a(this.f5690b, this.f5689a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("PremiumUiLabels(linksTitle=");
        a8.append(this.f5689a);
        a8.append(", nonIabVendorsLabel=");
        a8.append(this.f5690b);
        a8.append(", uspDnsTitle=");
        a8.append(this.f5691c);
        a8.append(", uspDnsText=");
        a8.append(this.f5692d);
        a8.append(", uspDoNotSellToggleText=");
        a8.append(this.f5693e);
        a8.append(", uspPrivacyPolicyLinkText=");
        a8.append(this.f5694f);
        a8.append(", uspDeleteDataLinkText=");
        a8.append(this.f5695g);
        a8.append(", uspAccessDataLinkText=");
        a8.append(this.f5696h);
        a8.append(", uspAcceptButton=");
        a8.append(this.f5697i);
        a8.append(", initScreenCustomLinks=");
        a8.append(this.f5698j);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ n(String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, String str8, List list2, int i8) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : str2, (i8 & 4) != 0 ? "" : str3, (i8 & 8) != 0 ? AbstractC1246t.m() : list, (i8 & 16) != 0 ? "" : str4, (i8 & 32) != 0 ? "" : str5, (i8 & 64) != 0 ? "" : str6, (i8 & 128) != 0 ? "" : str7, (i8 & 256) == 0 ? str8 : "", (i8 & 512) != 0 ? new ArrayList() : list2);
    }
}
