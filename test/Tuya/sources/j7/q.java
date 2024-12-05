package J7;

import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f5704a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5705b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5706c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5707d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5708e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5709f;

    public q(String title, String legalDescriptionTextLabel, String agreeToAllButton, String searchBarHint, String closeLabel, String backLabel) {
        AbstractC3159y.i(title, "title");
        AbstractC3159y.i(legalDescriptionTextLabel, "legalDescriptionTextLabel");
        AbstractC3159y.i(agreeToAllButton, "agreeToAllButton");
        AbstractC3159y.i(searchBarHint, "searchBarHint");
        AbstractC3159y.i(closeLabel, "closeLabel");
        AbstractC3159y.i(backLabel, "backLabel");
        this.f5704a = title;
        this.f5705b = legalDescriptionTextLabel;
        this.f5706c = agreeToAllButton;
        this.f5707d = searchBarHint;
        this.f5708e = closeLabel;
        this.f5709f = backLabel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (AbstractC3159y.d(this.f5704a, qVar.f5704a) && AbstractC3159y.d(this.f5705b, qVar.f5705b) && AbstractC3159y.d(this.f5706c, qVar.f5706c) && AbstractC3159y.d(this.f5707d, qVar.f5707d) && AbstractC3159y.d(this.f5708e, qVar.f5708e) && AbstractC3159y.d(this.f5709f, qVar.f5709f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5709f.hashCode() + t.a(this.f5708e, t.a(this.f5707d, t.a(this.f5706c, t.a(this.f5705b, this.f5704a.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("StacksScreen(title=");
        a8.append(this.f5704a);
        a8.append(", legalDescriptionTextLabel=");
        a8.append(this.f5705b);
        a8.append(", agreeToAllButton=");
        a8.append(this.f5706c);
        a8.append(", searchBarHint=");
        a8.append(this.f5707d);
        a8.append(", closeLabel=");
        a8.append(this.f5708e);
        a8.append(", backLabel=");
        a8.append(this.f5709f);
        a8.append(')');
        return a8.toString();
    }
}
