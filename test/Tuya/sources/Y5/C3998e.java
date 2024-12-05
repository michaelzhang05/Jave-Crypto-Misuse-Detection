package y5;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

/* renamed from: y5.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3998e {

    /* renamed from: a, reason: collision with root package name */
    public Map f39889a;

    public C3998e(Map googleVendorsInfoList) {
        AbstractC3159y.i(googleVendorsInfoList, "googleVendorsInfoList");
        this.f39889a = googleVendorsInfoList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3998e) && AbstractC3159y.d(this.f39889a, ((C3998e) obj).f39889a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f39889a.hashCode();
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("GoogleVendorList(googleVendorsInfoList=");
        a8.append(this.f39889a);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ C3998e(Map map, int i8) {
        this((i8 & 1) != 0 ? new LinkedHashMap() : null);
    }
}
