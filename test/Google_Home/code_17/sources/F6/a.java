package F6;

import P5.AbstractC1378t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2808a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2809b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2810c;

    /* renamed from: d, reason: collision with root package name */
    public List f2811d;

    public a(String str, String str2, List list, List list2) {
        this.f2808a = str;
        this.f2809b = str2;
        this.f2810c = list;
        this.f2811d = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3255y.d(this.f2808a, aVar.f2808a) && AbstractC3255y.d(this.f2809b, aVar.f2809b) && AbstractC3255y.d(this.f2810c, aVar.f2810c) && AbstractC3255y.d(this.f2811d, aVar.f2811d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f2808a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f2809b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        List list = this.f2810c;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        List list2 = this.f2811d;
        if (list2 != null) {
            i8 = list2.hashCode();
        }
        return i11 + i8;
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("MSPAConfig(jurisdiction=");
        a8.append((Object) this.f2808a);
        a8.append(", state=");
        a8.append((Object) this.f2809b);
        a8.append(", purposes=");
        a8.append(this.f2810c);
        a8.append(", applicablePurposes=");
        a8.append(this.f2811d);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ a(String str, String str2, List list, List list2, int i8) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) == 0 ? null : "", (i8 & 4) != 0 ? AbstractC1378t.m() : list, (i8 & 8) != 0 ? AbstractC1378t.m() : null);
    }
}
