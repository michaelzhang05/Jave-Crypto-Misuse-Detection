package J7;

import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5535a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5536b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5537c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5538d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5539e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5540f;

    public a(String title, List body, String deleteDataLinkText, String accessDataLinkText, String privacyPolicyLinkText, String backLabel) {
        AbstractC3159y.i(title, "title");
        AbstractC3159y.i(body, "body");
        AbstractC3159y.i(deleteDataLinkText, "deleteDataLinkText");
        AbstractC3159y.i(accessDataLinkText, "accessDataLinkText");
        AbstractC3159y.i(privacyPolicyLinkText, "privacyPolicyLinkText");
        AbstractC3159y.i(backLabel, "backLabel");
        this.f5535a = title;
        this.f5536b = body;
        this.f5537c = deleteDataLinkText;
        this.f5538d = accessDataLinkText;
        this.f5539e = privacyPolicyLinkText;
        this.f5540f = backLabel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3159y.d(this.f5535a, aVar.f5535a) && AbstractC3159y.d(this.f5536b, aVar.f5536b) && AbstractC3159y.d(this.f5537c, aVar.f5537c) && AbstractC3159y.d(this.f5538d, aVar.f5538d) && AbstractC3159y.d(this.f5539e, aVar.f5539e) && AbstractC3159y.d(this.f5540f, aVar.f5540f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5540f.hashCode() + t.a(this.f5539e, t.a(this.f5538d, t.a(this.f5537c, C6.l.a(this.f5536b, this.f5535a.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("CCPAScreen(title=");
        a8.append(this.f5535a);
        a8.append(", body=");
        a8.append(this.f5536b);
        a8.append(", deleteDataLinkText=");
        a8.append(this.f5537c);
        a8.append(", accessDataLinkText=");
        a8.append(this.f5538d);
        a8.append(", privacyPolicyLinkText=");
        a8.append(this.f5539e);
        a8.append(", backLabel=");
        a8.append(this.f5540f);
        a8.append(')');
        return a8.toString();
    }
}
