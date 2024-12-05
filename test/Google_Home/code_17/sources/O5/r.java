package O5;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class r implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Object f8300a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f8301b;

    public r(Object obj, Object obj2) {
        this.f8300a = obj;
        this.f8301b = obj2;
    }

    public final Object a() {
        return this.f8300a;
    }

    public final Object b() {
        return this.f8301b;
    }

    public final Object c() {
        return this.f8300a;
    }

    public final Object d() {
        return this.f8301b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (AbstractC3255y.d(this.f8300a, rVar.f8300a) && AbstractC3255y.d(this.f8301b, rVar.f8301b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Object obj = this.f8300a;
        int i8 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i9 = hashCode * 31;
        Object obj2 = this.f8301b;
        if (obj2 != null) {
            i8 = obj2.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        return '(' + this.f8300a + ", " + this.f8301b + ')';
    }
}
