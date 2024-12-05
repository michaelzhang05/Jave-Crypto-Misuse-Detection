package J7;

import kotlin.jvm.internal.AbstractC3159y;
import y5.t;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f5623a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5624b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5625c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5626d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5627e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5628f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5629g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5630h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5631i;

    /* renamed from: j, reason: collision with root package name */
    public final String f5632j;

    /* renamed from: k, reason: collision with root package name */
    public final String f5633k;

    public h(String title, String body, String objected, String accept, String objectAllButton, String searchBarHint, String purposesLabel, String partnersLabel, String showAllVendorsMenu, String showIABVendorsMenu, String backLabel) {
        AbstractC3159y.i(title, "title");
        AbstractC3159y.i(body, "body");
        AbstractC3159y.i(objected, "objected");
        AbstractC3159y.i(accept, "accept");
        AbstractC3159y.i(objectAllButton, "objectAllButton");
        AbstractC3159y.i(searchBarHint, "searchBarHint");
        AbstractC3159y.i(purposesLabel, "purposesLabel");
        AbstractC3159y.i(partnersLabel, "partnersLabel");
        AbstractC3159y.i(showAllVendorsMenu, "showAllVendorsMenu");
        AbstractC3159y.i(showIABVendorsMenu, "showIABVendorsMenu");
        AbstractC3159y.i(backLabel, "backLabel");
        this.f5623a = title;
        this.f5624b = body;
        this.f5625c = objected;
        this.f5626d = accept;
        this.f5627e = objectAllButton;
        this.f5628f = searchBarHint;
        this.f5629g = purposesLabel;
        this.f5630h = partnersLabel;
        this.f5631i = showAllVendorsMenu;
        this.f5632j = showIABVendorsMenu;
        this.f5633k = backLabel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (AbstractC3159y.d(this.f5623a, hVar.f5623a) && AbstractC3159y.d(this.f5624b, hVar.f5624b) && AbstractC3159y.d(this.f5625c, hVar.f5625c) && AbstractC3159y.d(this.f5626d, hVar.f5626d) && AbstractC3159y.d(this.f5627e, hVar.f5627e) && AbstractC3159y.d(this.f5628f, hVar.f5628f) && AbstractC3159y.d(this.f5629g, hVar.f5629g) && AbstractC3159y.d(this.f5630h, hVar.f5630h) && AbstractC3159y.d(this.f5631i, hVar.f5631i) && AbstractC3159y.d(this.f5632j, hVar.f5632j) && AbstractC3159y.d(this.f5633k, hVar.f5633k)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5633k.hashCode() + t.a(this.f5632j, t.a(this.f5631i, t.a(this.f5630h, t.a(this.f5629g, t.a(this.f5628f, t.a(this.f5627e, t.a(this.f5626d, t.a(this.f5625c, t.a(this.f5624b, this.f5623a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        return "LegInterestScreen(title=" + this.f5623a + ", body=" + this.f5624b + ", objected=" + this.f5625c + ", accept=" + this.f5626d + ", objectAllButton=" + this.f5627e + ", searchBarHint=" + this.f5628f + ", purposesLabel=" + this.f5629g + ", partnersLabel=" + this.f5630h + ", showAllVendorsMenu=" + this.f5631i + ", showIABVendorsMenu=" + this.f5632j + ", backLabel=" + this.f5633k + ')';
    }
}
