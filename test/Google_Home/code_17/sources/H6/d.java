package H6;

import B5.t;
import E6.l;
import P5.AbstractC1378t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f3914a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3915b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3916c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3917d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3918e;

    /* renamed from: f, reason: collision with root package name */
    public final List f3919f;

    /* renamed from: g, reason: collision with root package name */
    public final List f3920g;

    public d(int i8, String pCode, String name, String description, String privacyPolicyUrl, List nonIabPurposeConsentIds, List nonIabPurposeLegitimateInterestIds) {
        AbstractC3255y.i(pCode, "pCode");
        AbstractC3255y.i(name, "name");
        AbstractC3255y.i(description, "description");
        AbstractC3255y.i(privacyPolicyUrl, "privacyPolicyUrl");
        AbstractC3255y.i(nonIabPurposeConsentIds, "nonIabPurposeConsentIds");
        AbstractC3255y.i(nonIabPurposeLegitimateInterestIds, "nonIabPurposeLegitimateInterestIds");
        this.f3914a = i8;
        this.f3915b = pCode;
        this.f3916c = name;
        this.f3917d = description;
        this.f3918e = privacyPolicyUrl;
        this.f3919f = nonIabPurposeConsentIds;
        this.f3920g = nonIabPurposeLegitimateInterestIds;
    }

    public final l a() {
        return new l(this.f3914a, this.f3916c, this.f3917d, AbstractC1378t.a1(this.f3919f), AbstractC1378t.a1(this.f3920g), null, null, null, null, this.f3918e, null, null, 0, false, false, null, null, null, null, null, 914912);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f3914a == dVar.f3914a && AbstractC3255y.d(this.f3915b, dVar.f3915b) && AbstractC3255y.d(this.f3916c, dVar.f3916c) && AbstractC3255y.d(this.f3917d, dVar.f3917d) && AbstractC3255y.d(this.f3918e, dVar.f3918e) && AbstractC3255y.d(this.f3919f, dVar.f3919f) && AbstractC3255y.d(this.f3920g, dVar.f3920g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f3920g.hashCode() + F6.l.a(this.f3919f, t.a(this.f3918e, t.a(this.f3917d, t.a(this.f3916c, t.a(this.f3915b, this.f3914a * 31, 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("NonIABVendor(vendorId=");
        a8.append(this.f3914a);
        a8.append(", pCode=");
        a8.append(this.f3915b);
        a8.append(", name=");
        a8.append(this.f3916c);
        a8.append(", description=");
        a8.append(this.f3917d);
        a8.append(", privacyPolicyUrl=");
        a8.append(this.f3918e);
        a8.append(", nonIabPurposeConsentIds=");
        a8.append(this.f3919f);
        a8.append(", nonIabPurposeLegitimateInterestIds=");
        a8.append(this.f3920g);
        a8.append(')');
        return a8.toString();
    }
}
