package G5;

import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3209a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3210b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3211c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3212d;

    public a(String title, String sectionTitle, String description, String confirm) {
        AbstractC3159y.i(title, "title");
        AbstractC3159y.i(sectionTitle, "sectionTitle");
        AbstractC3159y.i(description, "description");
        AbstractC3159y.i(confirm, "confirm");
        this.f3209a = title;
        this.f3210b = sectionTitle;
        this.f3211c = description;
        this.f3212d = confirm;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3159y.d(this.f3209a, aVar.f3209a) && AbstractC3159y.d(this.f3210b, aVar.f3210b) && AbstractC3159y.d(this.f3211c, aVar.f3211c) && AbstractC3159y.d(this.f3212d, aVar.f3212d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f3212d.hashCode() + t.a(this.f3211c, t.a(this.f3210b, this.f3209a.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("Banner(title=");
        a8.append(this.f3209a);
        a8.append(", sectionTitle=");
        a8.append(this.f3210b);
        a8.append(", description=");
        a8.append(this.f3211c);
        a8.append(", confirm=");
        a8.append(this.f3212d);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, int i8) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : null, (i8 & 4) != 0 ? "" : str3, (i8 & 8) == 0 ? null : "");
    }
}
