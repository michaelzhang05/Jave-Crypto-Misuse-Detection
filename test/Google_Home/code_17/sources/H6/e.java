package H6;

import B5.t;
import P5.AbstractC1378t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public List f3921a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3922b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3923c;

    public e(List nonIabVendorList, String updateAt, String nonIabVendorsHash) {
        AbstractC3255y.i(nonIabVendorList, "nonIabVendorList");
        AbstractC3255y.i(updateAt, "updateAt");
        AbstractC3255y.i(nonIabVendorsHash, "nonIabVendorsHash");
        this.f3921a = nonIabVendorList;
        this.f3922b = updateAt;
        this.f3923c = nonIabVendorsHash;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3255y.d(this.f3921a, eVar.f3921a) && AbstractC3255y.d(this.f3922b, eVar.f3922b) && AbstractC3255y.d(this.f3923c, eVar.f3923c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f3923c.hashCode() + t.a(this.f3922b, this.f3921a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("NonIabVendorsInfo(nonIabVendorList=");
        a8.append(this.f3921a);
        a8.append(", updateAt=");
        a8.append(this.f3922b);
        a8.append(", nonIabVendorsHash=");
        a8.append(this.f3923c);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ e(List list, String str, String str2, int i8) {
        this((i8 & 1) != 0 ? AbstractC1378t.m() : null, (i8 & 2) != 0 ? "" : null, (i8 & 4) != 0 ? "" : null);
    }
}
