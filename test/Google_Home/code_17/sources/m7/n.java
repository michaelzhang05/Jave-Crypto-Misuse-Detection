package M7;

import B5.t;
import P5.AbstractC1378t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f7395a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7396b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7397c;

    /* renamed from: d, reason: collision with root package name */
    public final List f7398d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7399e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7400f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7401g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7402h;

    /* renamed from: i, reason: collision with root package name */
    public final String f7403i;

    /* renamed from: j, reason: collision with root package name */
    public final List f7404j;

    public n(String linksTitle, String nonIabVendorsLabel, String uspDnsTitle, List uspDnsText, String uspDoNotSellToggleText, String uspPrivacyPolicyLinkText, String uspDeleteDataLinkText, String uspAccessDataLinkText, String uspAcceptButton, List initScreenCustomLinks) {
        AbstractC3255y.i(linksTitle, "linksTitle");
        AbstractC3255y.i(nonIabVendorsLabel, "nonIabVendorsLabel");
        AbstractC3255y.i(uspDnsTitle, "uspDnsTitle");
        AbstractC3255y.i(uspDnsText, "uspDnsText");
        AbstractC3255y.i(uspDoNotSellToggleText, "uspDoNotSellToggleText");
        AbstractC3255y.i(uspPrivacyPolicyLinkText, "uspPrivacyPolicyLinkText");
        AbstractC3255y.i(uspDeleteDataLinkText, "uspDeleteDataLinkText");
        AbstractC3255y.i(uspAccessDataLinkText, "uspAccessDataLinkText");
        AbstractC3255y.i(uspAcceptButton, "uspAcceptButton");
        AbstractC3255y.i(initScreenCustomLinks, "initScreenCustomLinks");
        this.f7395a = linksTitle;
        this.f7396b = nonIabVendorsLabel;
        this.f7397c = uspDnsTitle;
        this.f7398d = uspDnsText;
        this.f7399e = uspDoNotSellToggleText;
        this.f7400f = uspPrivacyPolicyLinkText;
        this.f7401g = uspDeleteDataLinkText;
        this.f7402h = uspAccessDataLinkText;
        this.f7403i = uspAcceptButton;
        this.f7404j = initScreenCustomLinks;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (AbstractC3255y.d(this.f7395a, nVar.f7395a) && AbstractC3255y.d(this.f7396b, nVar.f7396b) && AbstractC3255y.d(this.f7397c, nVar.f7397c) && AbstractC3255y.d(this.f7398d, nVar.f7398d) && AbstractC3255y.d(this.f7399e, nVar.f7399e) && AbstractC3255y.d(this.f7400f, nVar.f7400f) && AbstractC3255y.d(this.f7401g, nVar.f7401g) && AbstractC3255y.d(this.f7402h, nVar.f7402h) && AbstractC3255y.d(this.f7403i, nVar.f7403i) && AbstractC3255y.d(this.f7404j, nVar.f7404j)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f7404j.hashCode() + t.a(this.f7403i, t.a(this.f7402h, t.a(this.f7401g, t.a(this.f7400f, t.a(this.f7399e, F6.l.a(this.f7398d, t.a(this.f7397c, t.a(this.f7396b, this.f7395a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("PremiumUiLabels(linksTitle=");
        a8.append(this.f7395a);
        a8.append(", nonIabVendorsLabel=");
        a8.append(this.f7396b);
        a8.append(", uspDnsTitle=");
        a8.append(this.f7397c);
        a8.append(", uspDnsText=");
        a8.append(this.f7398d);
        a8.append(", uspDoNotSellToggleText=");
        a8.append(this.f7399e);
        a8.append(", uspPrivacyPolicyLinkText=");
        a8.append(this.f7400f);
        a8.append(", uspDeleteDataLinkText=");
        a8.append(this.f7401g);
        a8.append(", uspAccessDataLinkText=");
        a8.append(this.f7402h);
        a8.append(", uspAcceptButton=");
        a8.append(this.f7403i);
        a8.append(", initScreenCustomLinks=");
        a8.append(this.f7404j);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ n(String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, String str8, List list2, int i8) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : str2, (i8 & 4) != 0 ? "" : str3, (i8 & 8) != 0 ? AbstractC1378t.m() : list, (i8 & 16) != 0 ? "" : str4, (i8 & 32) != 0 ? "" : str5, (i8 & 64) != 0 ? "" : str6, (i8 & 128) != 0 ? "" : str7, (i8 & 256) == 0 ? str8 : "", (i8 & 512) != 0 ? new ArrayList() : list2);
    }
}
