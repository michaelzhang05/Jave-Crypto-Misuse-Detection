package J5;

import B5.t;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f4928a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4929b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4930c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4931d;

    public a(String title, String sectionTitle, String description, String confirm) {
        AbstractC3255y.i(title, "title");
        AbstractC3255y.i(sectionTitle, "sectionTitle");
        AbstractC3255y.i(description, "description");
        AbstractC3255y.i(confirm, "confirm");
        this.f4928a = title;
        this.f4929b = sectionTitle;
        this.f4930c = description;
        this.f4931d = confirm;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3255y.d(this.f4928a, aVar.f4928a) && AbstractC3255y.d(this.f4929b, aVar.f4929b) && AbstractC3255y.d(this.f4930c, aVar.f4930c) && AbstractC3255y.d(this.f4931d, aVar.f4931d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f4931d.hashCode() + t.a(this.f4930c, t.a(this.f4929b, this.f4928a.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("Banner(title=");
        a8.append(this.f4928a);
        a8.append(", sectionTitle=");
        a8.append(this.f4929b);
        a8.append(", description=");
        a8.append(this.f4930c);
        a8.append(", confirm=");
        a8.append(this.f4931d);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, int i8) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : null, (i8 & 4) != 0 ? "" : str3, (i8 & 8) == 0 ? null : "");
    }
}
