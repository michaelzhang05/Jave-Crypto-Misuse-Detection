package M7;

import B5.t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f7241a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7242b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7243c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7244d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7245e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7246f;

    public a(String title, List body, String deleteDataLinkText, String accessDataLinkText, String privacyPolicyLinkText, String backLabel) {
        AbstractC3255y.i(title, "title");
        AbstractC3255y.i(body, "body");
        AbstractC3255y.i(deleteDataLinkText, "deleteDataLinkText");
        AbstractC3255y.i(accessDataLinkText, "accessDataLinkText");
        AbstractC3255y.i(privacyPolicyLinkText, "privacyPolicyLinkText");
        AbstractC3255y.i(backLabel, "backLabel");
        this.f7241a = title;
        this.f7242b = body;
        this.f7243c = deleteDataLinkText;
        this.f7244d = accessDataLinkText;
        this.f7245e = privacyPolicyLinkText;
        this.f7246f = backLabel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3255y.d(this.f7241a, aVar.f7241a) && AbstractC3255y.d(this.f7242b, aVar.f7242b) && AbstractC3255y.d(this.f7243c, aVar.f7243c) && AbstractC3255y.d(this.f7244d, aVar.f7244d) && AbstractC3255y.d(this.f7245e, aVar.f7245e) && AbstractC3255y.d(this.f7246f, aVar.f7246f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f7246f.hashCode() + t.a(this.f7245e, t.a(this.f7244d, t.a(this.f7243c, F6.l.a(this.f7242b, this.f7241a.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("CCPAScreen(title=");
        a8.append(this.f7241a);
        a8.append(", body=");
        a8.append(this.f7242b);
        a8.append(", deleteDataLinkText=");
        a8.append(this.f7243c);
        a8.append(", accessDataLinkText=");
        a8.append(this.f7244d);
        a8.append(", privacyPolicyLinkText=");
        a8.append(this.f7245e);
        a8.append(", backLabel=");
        a8.append(this.f7246f);
        a8.append(')');
        return a8.toString();
    }
}
