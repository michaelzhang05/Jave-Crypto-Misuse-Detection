package C6;

import M5.AbstractC1246t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1298a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1299b;

    /* renamed from: c, reason: collision with root package name */
    public final List f1300c;

    /* renamed from: d, reason: collision with root package name */
    public List f1301d;

    public a(String str, String str2, List list, List list2) {
        this.f1298a = str;
        this.f1299b = str2;
        this.f1300c = list;
        this.f1301d = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3159y.d(this.f1298a, aVar.f1298a) && AbstractC3159y.d(this.f1299b, aVar.f1299b) && AbstractC3159y.d(this.f1300c, aVar.f1300c) && AbstractC3159y.d(this.f1301d, aVar.f1301d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f1298a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f1299b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        List list = this.f1300c;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        List list2 = this.f1301d;
        if (list2 != null) {
            i8 = list2.hashCode();
        }
        return i11 + i8;
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("MSPAConfig(jurisdiction=");
        a8.append((Object) this.f1298a);
        a8.append(", state=");
        a8.append((Object) this.f1299b);
        a8.append(", purposes=");
        a8.append(this.f1300c);
        a8.append(", applicablePurposes=");
        a8.append(this.f1301d);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ a(String str, String str2, List list, List list2, int i8) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) == 0 ? null : "", (i8 & 4) != 0 ? AbstractC1246t.m() : list, (i8 & 8) != 0 ? AbstractC1246t.m() : null);
    }
}
