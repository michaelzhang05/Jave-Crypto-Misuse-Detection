package M5;

import B5.t;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f7208a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7209b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7210c;

    public b(String country, String region, String city) {
        AbstractC3255y.i(country, "country");
        AbstractC3255y.i(region, "region");
        AbstractC3255y.i(city, "city");
        this.f7208a = country;
        this.f7209b = region;
        this.f7210c = city;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3255y.d(this.f7208a, bVar.f7208a) && AbstractC3255y.d(this.f7209b, bVar.f7209b) && AbstractC3255y.d(this.f7210c, bVar.f7210c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f7210c.hashCode() + t.a(this.f7209b, this.f7208a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("GeoIP(country=");
        a8.append(this.f7208a);
        a8.append(", region=");
        a8.append(this.f7209b);
        a8.append(", city=");
        a8.append(this.f7210c);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ b(String str, String str2, String str3, int i8) {
        this((i8 & 1) != 0 ? "" : null, (i8 & 2) != 0 ? "" : null, (i8 & 4) == 0 ? null : "");
    }
}
