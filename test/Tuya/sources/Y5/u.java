package y5;

import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class u extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final String f39958a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39959b;

    /* renamed from: c, reason: collision with root package name */
    public final String f39960c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String fieldName, String fieldValue, String msg) {
        super("invalid value " + fieldValue + " passed for " + fieldName + ' ' + msg);
        AbstractC3159y.i(fieldName, "fieldName");
        AbstractC3159y.i(fieldValue, "fieldValue");
        AbstractC3159y.i(msg, "msg");
        this.f39958a = fieldName;
        this.f39959b = fieldValue;
        this.f39960c = msg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (AbstractC3159y.d(this.f39958a, uVar.f39958a) && AbstractC3159y.d(this.f39959b, uVar.f39959b) && AbstractC3159y.d(this.f39960c, uVar.f39960c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f39960c.hashCode() + t.a(this.f39959b, this.f39958a.hashCode() * 31, 31);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("TCModelError(fieldName=");
        a8.append(this.f39958a);
        a8.append(", fieldValue=");
        a8.append(this.f39959b);
        a8.append(", msg=");
        a8.append(this.f39960c);
        a8.append(')');
        return a8.toString();
    }
}
