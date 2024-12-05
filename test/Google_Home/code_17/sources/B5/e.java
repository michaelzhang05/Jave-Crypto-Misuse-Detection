package B5;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public Map f933a;

    public e(Map googleVendorsInfoList) {
        AbstractC3255y.i(googleVendorsInfoList, "googleVendorsInfoList");
        this.f933a = googleVendorsInfoList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && AbstractC3255y.d(this.f933a, ((e) obj).f933a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f933a.hashCode();
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("GoogleVendorList(googleVendorsInfoList=");
        a8.append(this.f933a);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ e(Map map, int i8) {
        this((i8 & 1) != 0 ? new LinkedHashMap() : null);
    }
}
