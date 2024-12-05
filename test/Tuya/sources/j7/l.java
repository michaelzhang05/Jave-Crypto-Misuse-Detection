package J7;

import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f5680a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5681b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5682c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5683d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5684e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5685f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5686g;

    public l(String title, String bodyText, String searchBarHint, String partnersLabel, String showAllVendorsMenu, String showIABVendorsMenu, String backLabel) {
        AbstractC3159y.i(title, "title");
        AbstractC3159y.i(bodyText, "bodyText");
        AbstractC3159y.i(searchBarHint, "searchBarHint");
        AbstractC3159y.i(partnersLabel, "partnersLabel");
        AbstractC3159y.i(showAllVendorsMenu, "showAllVendorsMenu");
        AbstractC3159y.i(showIABVendorsMenu, "showIABVendorsMenu");
        AbstractC3159y.i(backLabel, "backLabel");
        this.f5680a = title;
        this.f5681b = bodyText;
        this.f5682c = searchBarHint;
        this.f5683d = partnersLabel;
        this.f5684e = showAllVendorsMenu;
        this.f5685f = showIABVendorsMenu;
        this.f5686g = backLabel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (AbstractC3159y.d(this.f5680a, lVar.f5680a) && AbstractC3159y.d(this.f5681b, lVar.f5681b) && AbstractC3159y.d(this.f5682c, lVar.f5682c) && AbstractC3159y.d(this.f5683d, lVar.f5683d) && AbstractC3159y.d(this.f5684e, lVar.f5684e) && AbstractC3159y.d(this.f5685f, lVar.f5685f) && AbstractC3159y.d(this.f5686g, lVar.f5686g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5686g.hashCode() + t.a(this.f5685f, t.a(this.f5684e, t.a(this.f5683d, t.a(this.f5682c, t.a(this.f5681b, this.f5680a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("PartnerScreen(title=");
        a8.append(this.f5680a);
        a8.append(", bodyText=");
        a8.append(this.f5681b);
        a8.append(", searchBarHint=");
        a8.append(this.f5682c);
        a8.append(", partnersLabel=");
        a8.append(this.f5683d);
        a8.append(", showAllVendorsMenu=");
        a8.append(this.f5684e);
        a8.append(", showIABVendorsMenu=");
        a8.append(this.f5685f);
        a8.append(", backLabel=");
        a8.append(this.f5686g);
        a8.append(')');
        return a8.toString();
    }
}
