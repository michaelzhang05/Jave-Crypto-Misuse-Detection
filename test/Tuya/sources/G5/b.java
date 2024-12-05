package G5;

import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f3213a;

    /* renamed from: b, reason: collision with root package name */
    public final a f3214b;

    public b(Integer num, a aVar) {
        this.f3213a = num;
        this.f3214b = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3159y.d(this.f3213a, bVar.f3213a) && AbstractC3159y.d(this.f3214b, bVar.f3214b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.f3213a;
        int i8 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i9 = hashCode * 31;
        a aVar = this.f3214b;
        if (aVar != null) {
            i8 = aVar.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("GBCPurpose(id=");
        a8.append(this.f3213a);
        a8.append(", banner=");
        a8.append(this.f3214b);
        a8.append(')');
        return a8.toString();
    }
}
