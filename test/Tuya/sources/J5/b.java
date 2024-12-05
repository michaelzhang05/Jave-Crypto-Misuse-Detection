package J5;

import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f5502a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5503b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5504c;

    public b(String country, String region, String city) {
        AbstractC3159y.i(country, "country");
        AbstractC3159y.i(region, "region");
        AbstractC3159y.i(city, "city");
        this.f5502a = country;
        this.f5503b = region;
        this.f5504c = city;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3159y.d(this.f5502a, bVar.f5502a) && AbstractC3159y.d(this.f5503b, bVar.f5503b) && AbstractC3159y.d(this.f5504c, bVar.f5504c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5504c.hashCode() + t.a(this.f5503b, this.f5502a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("GeoIP(country=");
        a8.append(this.f5502a);
        a8.append(", region=");
        a8.append(this.f5503b);
        a8.append(", city=");
        a8.append(this.f5504c);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ b(String str, String str2, String str3, int i8) {
        this((i8 & 1) != 0 ? "" : null, (i8 & 2) != 0 ? "" : null, (i8 & 4) == 0 ? null : "");
    }
}
