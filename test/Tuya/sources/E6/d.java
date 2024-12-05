package E6;

import B6.l;
import M5.AbstractC1246t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f2364a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2365b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2366c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2367d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2368e;

    /* renamed from: f, reason: collision with root package name */
    public final List f2369f;

    /* renamed from: g, reason: collision with root package name */
    public final List f2370g;

    public d(int i8, String pCode, String name, String description, String privacyPolicyUrl, List nonIabPurposeConsentIds, List nonIabPurposeLegitimateInterestIds) {
        AbstractC3159y.i(pCode, "pCode");
        AbstractC3159y.i(name, "name");
        AbstractC3159y.i(description, "description");
        AbstractC3159y.i(privacyPolicyUrl, "privacyPolicyUrl");
        AbstractC3159y.i(nonIabPurposeConsentIds, "nonIabPurposeConsentIds");
        AbstractC3159y.i(nonIabPurposeLegitimateInterestIds, "nonIabPurposeLegitimateInterestIds");
        this.f2364a = i8;
        this.f2365b = pCode;
        this.f2366c = name;
        this.f2367d = description;
        this.f2368e = privacyPolicyUrl;
        this.f2369f = nonIabPurposeConsentIds;
        this.f2370g = nonIabPurposeLegitimateInterestIds;
    }

    public final l a() {
        return new l(this.f2364a, this.f2366c, this.f2367d, AbstractC1246t.a1(this.f2369f), AbstractC1246t.a1(this.f2370g), null, null, null, null, this.f2368e, null, null, 0, false, false, null, null, null, null, null, 914912);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f2364a == dVar.f2364a && AbstractC3159y.d(this.f2365b, dVar.f2365b) && AbstractC3159y.d(this.f2366c, dVar.f2366c) && AbstractC3159y.d(this.f2367d, dVar.f2367d) && AbstractC3159y.d(this.f2368e, dVar.f2368e) && AbstractC3159y.d(this.f2369f, dVar.f2369f) && AbstractC3159y.d(this.f2370g, dVar.f2370g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f2370g.hashCode() + C6.l.a(this.f2369f, t.a(this.f2368e, t.a(this.f2367d, t.a(this.f2366c, t.a(this.f2365b, this.f2364a * 31, 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("NonIABVendor(vendorId=");
        a8.append(this.f2364a);
        a8.append(", pCode=");
        a8.append(this.f2365b);
        a8.append(", name=");
        a8.append(this.f2366c);
        a8.append(", description=");
        a8.append(this.f2367d);
        a8.append(", privacyPolicyUrl=");
        a8.append(this.f2368e);
        a8.append(", nonIabPurposeConsentIds=");
        a8.append(this.f2369f);
        a8.append(", nonIabPurposeLegitimateInterestIds=");
        a8.append(this.f2370g);
        a8.append(')');
        return a8.toString();
    }
}
