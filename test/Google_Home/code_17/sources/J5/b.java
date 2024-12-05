package J5;

import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f4932a;

    /* renamed from: b, reason: collision with root package name */
    public final a f4933b;

    public b(Integer num, a aVar) {
        this.f4932a = num;
        this.f4933b = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3255y.d(this.f4932a, bVar.f4932a) && AbstractC3255y.d(this.f4933b, bVar.f4933b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.f4932a;
        int i8 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i9 = hashCode * 31;
        a aVar = this.f4933b;
        if (aVar != null) {
            i8 = aVar.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("GBCPurpose(id=");
        a8.append(this.f4932a);
        a8.append(", banner=");
        a8.append(this.f4933b);
        a8.append(')');
        return a8.toString();
    }
}
