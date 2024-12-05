package D5;

import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f2227a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f2228b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2229c;

    public f(Boolean bool, Integer num, List list) {
        this.f2227a = bool;
        this.f2228b = num;
        this.f2229c = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3255y.d(this.f2227a, fVar.f2227a) && AbstractC3255y.d(this.f2228b, fVar.f2228b) && AbstractC3255y.d(this.f2229c, fVar.f2229c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Boolean bool = this.f2227a;
        int i8 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i9 = hashCode * 31;
        Integer num = this.f2228b;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        List list = this.f2229c;
        if (list != null) {
            i8 = list.hashCode();
        }
        return i10 + i8;
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("EncodingOptions(isForVendors=");
        a8.append(this.f2227a);
        a8.append(", version=");
        a8.append(this.f2228b);
        a8.append(", segments=");
        a8.append(this.f2229c);
        a8.append(')');
        return a8.toString();
    }
}
