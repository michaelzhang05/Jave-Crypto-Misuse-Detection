package A5;

import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f505a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f506b;

    /* renamed from: c, reason: collision with root package name */
    public final List f507c;

    public f(Boolean bool, Integer num, List list) {
        this.f505a = bool;
        this.f506b = num;
        this.f507c = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3159y.d(this.f505a, fVar.f505a) && AbstractC3159y.d(this.f506b, fVar.f506b) && AbstractC3159y.d(this.f507c, fVar.f507c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Boolean bool = this.f505a;
        int i8 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i9 = hashCode * 31;
        Integer num = this.f506b;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        List list = this.f507c;
        if (list != null) {
            i8 = list.hashCode();
        }
        return i10 + i8;
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("EncodingOptions(isForVendors=");
        a8.append(this.f505a);
        a8.append(", version=");
        a8.append(this.f506b);
        a8.append(", segments=");
        a8.append(this.f507c);
        a8.append(')');
        return a8.toString();
    }
}
