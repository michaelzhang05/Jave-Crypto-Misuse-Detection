package O5;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class w implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Object f8313a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f8314b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f8315c;

    public w(Object obj, Object obj2, Object obj3) {
        this.f8313a = obj;
        this.f8314b = obj2;
        this.f8315c = obj3;
    }

    public final Object a() {
        return this.f8313a;
    }

    public final Object b() {
        return this.f8314b;
    }

    public final Object c() {
        return this.f8315c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (AbstractC3255y.d(this.f8313a, wVar.f8313a) && AbstractC3255y.d(this.f8314b, wVar.f8314b) && AbstractC3255y.d(this.f8315c, wVar.f8315c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Object obj = this.f8313a;
        int i8 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i9 = hashCode * 31;
        Object obj2 = this.f8314b;
        if (obj2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = obj2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        Object obj3 = this.f8315c;
        if (obj3 != null) {
            i8 = obj3.hashCode();
        }
        return i10 + i8;
    }

    public String toString() {
        return '(' + this.f8313a + ", " + this.f8314b + ", " + this.f8315c + ')';
    }
}
