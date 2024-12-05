package B5;

import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class u extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final String f1002a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1003b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1004c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String fieldName, String fieldValue, String msg) {
        super("invalid value " + fieldValue + " passed for " + fieldName + ' ' + msg);
        AbstractC3255y.i(fieldName, "fieldName");
        AbstractC3255y.i(fieldValue, "fieldValue");
        AbstractC3255y.i(msg, "msg");
        this.f1002a = fieldName;
        this.f1003b = fieldValue;
        this.f1004c = msg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (AbstractC3255y.d(this.f1002a, uVar.f1002a) && AbstractC3255y.d(this.f1003b, uVar.f1003b) && AbstractC3255y.d(this.f1004c, uVar.f1004c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f1004c.hashCode() + t.a(this.f1003b, this.f1002a.hashCode() * 31, 31);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("TCModelError(fieldName=");
        a8.append(this.f1002a);
        a8.append(", fieldValue=");
        a8.append(this.f1003b);
        a8.append(", msg=");
        a8.append(this.f1004c);
        a8.append(')');
        return a8.toString();
    }
}
