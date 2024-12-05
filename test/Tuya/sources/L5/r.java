package L5;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class r implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Object f6509a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f6510b;

    public r(Object obj, Object obj2) {
        this.f6509a = obj;
        this.f6510b = obj2;
    }

    public final Object a() {
        return this.f6509a;
    }

    public final Object b() {
        return this.f6510b;
    }

    public final Object c() {
        return this.f6509a;
    }

    public final Object d() {
        return this.f6510b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (AbstractC3159y.d(this.f6509a, rVar.f6509a) && AbstractC3159y.d(this.f6510b, rVar.f6510b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Object obj = this.f6509a;
        int i8 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i9 = hashCode * 31;
        Object obj2 = this.f6510b;
        if (obj2 != null) {
            i8 = obj2.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        return '(' + this.f6509a + ", " + this.f6510b + ')';
    }
}
