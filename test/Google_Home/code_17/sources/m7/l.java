package M7;

import B5.t;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f7386a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7387b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7388c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7389d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7390e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7391f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7392g;

    public l(String title, String bodyText, String searchBarHint, String partnersLabel, String showAllVendorsMenu, String showIABVendorsMenu, String backLabel) {
        AbstractC3255y.i(title, "title");
        AbstractC3255y.i(bodyText, "bodyText");
        AbstractC3255y.i(searchBarHint, "searchBarHint");
        AbstractC3255y.i(partnersLabel, "partnersLabel");
        AbstractC3255y.i(showAllVendorsMenu, "showAllVendorsMenu");
        AbstractC3255y.i(showIABVendorsMenu, "showIABVendorsMenu");
        AbstractC3255y.i(backLabel, "backLabel");
        this.f7386a = title;
        this.f7387b = bodyText;
        this.f7388c = searchBarHint;
        this.f7389d = partnersLabel;
        this.f7390e = showAllVendorsMenu;
        this.f7391f = showIABVendorsMenu;
        this.f7392g = backLabel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (AbstractC3255y.d(this.f7386a, lVar.f7386a) && AbstractC3255y.d(this.f7387b, lVar.f7387b) && AbstractC3255y.d(this.f7388c, lVar.f7388c) && AbstractC3255y.d(this.f7389d, lVar.f7389d) && AbstractC3255y.d(this.f7390e, lVar.f7390e) && AbstractC3255y.d(this.f7391f, lVar.f7391f) && AbstractC3255y.d(this.f7392g, lVar.f7392g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f7392g.hashCode() + t.a(this.f7391f, t.a(this.f7390e, t.a(this.f7389d, t.a(this.f7388c, t.a(this.f7387b, this.f7386a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("PartnerScreen(title=");
        a8.append(this.f7386a);
        a8.append(", bodyText=");
        a8.append(this.f7387b);
        a8.append(", searchBarHint=");
        a8.append(this.f7388c);
        a8.append(", partnersLabel=");
        a8.append(this.f7389d);
        a8.append(", showAllVendorsMenu=");
        a8.append(this.f7390e);
        a8.append(", showIABVendorsMenu=");
        a8.append(this.f7391f);
        a8.append(", backLabel=");
        a8.append(this.f7392g);
        a8.append(')');
        return a8.toString();
    }
}
