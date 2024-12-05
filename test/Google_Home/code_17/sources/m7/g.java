package M7;

import B5.t;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f7321a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7322b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7323c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7324d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7325e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7326f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7327g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7328h;

    public g(String title, String body, String settings, String accept, String reject, String consentLink, String privacyPolicyLink, String privacyPolicyLinkText) {
        AbstractC3255y.i(title, "title");
        AbstractC3255y.i(body, "body");
        AbstractC3255y.i(settings, "settings");
        AbstractC3255y.i(accept, "accept");
        AbstractC3255y.i(reject, "reject");
        AbstractC3255y.i(consentLink, "consentLink");
        AbstractC3255y.i(privacyPolicyLink, "privacyPolicyLink");
        AbstractC3255y.i(privacyPolicyLinkText, "privacyPolicyLinkText");
        this.f7321a = title;
        this.f7322b = body;
        this.f7323c = settings;
        this.f7324d = accept;
        this.f7325e = reject;
        this.f7326f = consentLink;
        this.f7327g = privacyPolicyLink;
        this.f7328h = privacyPolicyLinkText;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC3255y.d(this.f7321a, gVar.f7321a) && AbstractC3255y.d(this.f7322b, gVar.f7322b) && AbstractC3255y.d(this.f7323c, gVar.f7323c) && AbstractC3255y.d(this.f7324d, gVar.f7324d) && AbstractC3255y.d(this.f7325e, gVar.f7325e) && AbstractC3255y.d(this.f7326f, gVar.f7326f) && AbstractC3255y.d(this.f7327g, gVar.f7327g) && AbstractC3255y.d(this.f7328h, gVar.f7328h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f7328h.hashCode() + t.a(this.f7327g, t.a(this.f7326f, t.a(this.f7325e, t.a(this.f7324d, t.a(this.f7323c, t.a(this.f7322b, this.f7321a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("InitScreen(title=");
        a8.append(this.f7321a);
        a8.append(", body=");
        a8.append(this.f7322b);
        a8.append(", settings=");
        a8.append(this.f7323c);
        a8.append(", accept=");
        a8.append(this.f7324d);
        a8.append(", reject=");
        a8.append(this.f7325e);
        a8.append(", consentLink=");
        a8.append(this.f7326f);
        a8.append(", privacyPolicyLink=");
        a8.append(this.f7327g);
        a8.append(", privacyPolicyLinkText=");
        a8.append(this.f7328h);
        a8.append(')');
        return a8.toString();
    }
}
