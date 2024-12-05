package M7;

import B5.t;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f7410a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7411b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7412c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7413d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7414e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7415f;

    public q(String title, String legalDescriptionTextLabel, String agreeToAllButton, String searchBarHint, String closeLabel, String backLabel) {
        AbstractC3255y.i(title, "title");
        AbstractC3255y.i(legalDescriptionTextLabel, "legalDescriptionTextLabel");
        AbstractC3255y.i(agreeToAllButton, "agreeToAllButton");
        AbstractC3255y.i(searchBarHint, "searchBarHint");
        AbstractC3255y.i(closeLabel, "closeLabel");
        AbstractC3255y.i(backLabel, "backLabel");
        this.f7410a = title;
        this.f7411b = legalDescriptionTextLabel;
        this.f7412c = agreeToAllButton;
        this.f7413d = searchBarHint;
        this.f7414e = closeLabel;
        this.f7415f = backLabel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (AbstractC3255y.d(this.f7410a, qVar.f7410a) && AbstractC3255y.d(this.f7411b, qVar.f7411b) && AbstractC3255y.d(this.f7412c, qVar.f7412c) && AbstractC3255y.d(this.f7413d, qVar.f7413d) && AbstractC3255y.d(this.f7414e, qVar.f7414e) && AbstractC3255y.d(this.f7415f, qVar.f7415f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f7415f.hashCode() + t.a(this.f7414e, t.a(this.f7413d, t.a(this.f7412c, t.a(this.f7411b, this.f7410a.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("StacksScreen(title=");
        a8.append(this.f7410a);
        a8.append(", legalDescriptionTextLabel=");
        a8.append(this.f7411b);
        a8.append(", agreeToAllButton=");
        a8.append(this.f7412c);
        a8.append(", searchBarHint=");
        a8.append(this.f7413d);
        a8.append(", closeLabel=");
        a8.append(this.f7414e);
        a8.append(", backLabel=");
        a8.append(this.f7415f);
        a8.append(')');
        return a8.toString();
    }
}
