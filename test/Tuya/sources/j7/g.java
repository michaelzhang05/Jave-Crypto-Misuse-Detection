package J7;

import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f5615a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5616b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5617c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5618d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5619e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5620f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5621g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5622h;

    public g(String title, String body, String settings, String accept, String reject, String consentLink, String privacyPolicyLink, String privacyPolicyLinkText) {
        AbstractC3159y.i(title, "title");
        AbstractC3159y.i(body, "body");
        AbstractC3159y.i(settings, "settings");
        AbstractC3159y.i(accept, "accept");
        AbstractC3159y.i(reject, "reject");
        AbstractC3159y.i(consentLink, "consentLink");
        AbstractC3159y.i(privacyPolicyLink, "privacyPolicyLink");
        AbstractC3159y.i(privacyPolicyLinkText, "privacyPolicyLinkText");
        this.f5615a = title;
        this.f5616b = body;
        this.f5617c = settings;
        this.f5618d = accept;
        this.f5619e = reject;
        this.f5620f = consentLink;
        this.f5621g = privacyPolicyLink;
        this.f5622h = privacyPolicyLinkText;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC3159y.d(this.f5615a, gVar.f5615a) && AbstractC3159y.d(this.f5616b, gVar.f5616b) && AbstractC3159y.d(this.f5617c, gVar.f5617c) && AbstractC3159y.d(this.f5618d, gVar.f5618d) && AbstractC3159y.d(this.f5619e, gVar.f5619e) && AbstractC3159y.d(this.f5620f, gVar.f5620f) && AbstractC3159y.d(this.f5621g, gVar.f5621g) && AbstractC3159y.d(this.f5622h, gVar.f5622h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5622h.hashCode() + t.a(this.f5621g, t.a(this.f5620f, t.a(this.f5619e, t.a(this.f5618d, t.a(this.f5617c, t.a(this.f5616b, this.f5615a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("InitScreen(title=");
        a8.append(this.f5615a);
        a8.append(", body=");
        a8.append(this.f5616b);
        a8.append(", settings=");
        a8.append(this.f5617c);
        a8.append(", accept=");
        a8.append(this.f5618d);
        a8.append(", reject=");
        a8.append(this.f5619e);
        a8.append(", consentLink=");
        a8.append(this.f5620f);
        a8.append(", privacyPolicyLink=");
        a8.append(this.f5621g);
        a8.append(", privacyPolicyLinkText=");
        a8.append(this.f5622h);
        a8.append(')');
        return a8.toString();
    }
}
