package M7;

import B5.t;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f7329a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7330b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7331c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7332d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7333e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7334f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7335g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7336h;

    /* renamed from: i, reason: collision with root package name */
    public final String f7337i;

    /* renamed from: j, reason: collision with root package name */
    public final String f7338j;

    /* renamed from: k, reason: collision with root package name */
    public final String f7339k;

    public h(String title, String body, String objected, String accept, String objectAllButton, String searchBarHint, String purposesLabel, String partnersLabel, String showAllVendorsMenu, String showIABVendorsMenu, String backLabel) {
        AbstractC3255y.i(title, "title");
        AbstractC3255y.i(body, "body");
        AbstractC3255y.i(objected, "objected");
        AbstractC3255y.i(accept, "accept");
        AbstractC3255y.i(objectAllButton, "objectAllButton");
        AbstractC3255y.i(searchBarHint, "searchBarHint");
        AbstractC3255y.i(purposesLabel, "purposesLabel");
        AbstractC3255y.i(partnersLabel, "partnersLabel");
        AbstractC3255y.i(showAllVendorsMenu, "showAllVendorsMenu");
        AbstractC3255y.i(showIABVendorsMenu, "showIABVendorsMenu");
        AbstractC3255y.i(backLabel, "backLabel");
        this.f7329a = title;
        this.f7330b = body;
        this.f7331c = objected;
        this.f7332d = accept;
        this.f7333e = objectAllButton;
        this.f7334f = searchBarHint;
        this.f7335g = purposesLabel;
        this.f7336h = partnersLabel;
        this.f7337i = showAllVendorsMenu;
        this.f7338j = showIABVendorsMenu;
        this.f7339k = backLabel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (AbstractC3255y.d(this.f7329a, hVar.f7329a) && AbstractC3255y.d(this.f7330b, hVar.f7330b) && AbstractC3255y.d(this.f7331c, hVar.f7331c) && AbstractC3255y.d(this.f7332d, hVar.f7332d) && AbstractC3255y.d(this.f7333e, hVar.f7333e) && AbstractC3255y.d(this.f7334f, hVar.f7334f) && AbstractC3255y.d(this.f7335g, hVar.f7335g) && AbstractC3255y.d(this.f7336h, hVar.f7336h) && AbstractC3255y.d(this.f7337i, hVar.f7337i) && AbstractC3255y.d(this.f7338j, hVar.f7338j) && AbstractC3255y.d(this.f7339k, hVar.f7339k)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f7339k.hashCode() + t.a(this.f7338j, t.a(this.f7337i, t.a(this.f7336h, t.a(this.f7335g, t.a(this.f7334f, t.a(this.f7333e, t.a(this.f7332d, t.a(this.f7331c, t.a(this.f7330b, this.f7329a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        return "LegInterestScreen(title=" + this.f7329a + ", body=" + this.f7330b + ", objected=" + this.f7331c + ", accept=" + this.f7332d + ", objectAllButton=" + this.f7333e + ", searchBarHint=" + this.f7334f + ", purposesLabel=" + this.f7335g + ", partnersLabel=" + this.f7336h + ", showAllVendorsMenu=" + this.f7337i + ", showIABVendorsMenu=" + this.f7338j + ", backLabel=" + this.f7339k + ')';
    }
}
