package L5;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class w implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Object f6522a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f6523b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f6524c;

    public w(Object obj, Object obj2, Object obj3) {
        this.f6522a = obj;
        this.f6523b = obj2;
        this.f6524c = obj3;
    }

    public final Object a() {
        return this.f6522a;
    }

    public final Object b() {
        return this.f6523b;
    }

    public final Object c() {
        return this.f6524c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (AbstractC3159y.d(this.f6522a, wVar.f6522a) && AbstractC3159y.d(this.f6523b, wVar.f6523b) && AbstractC3159y.d(this.f6524c, wVar.f6524c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Object obj = this.f6522a;
        int i8 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i9 = hashCode * 31;
        Object obj2 = this.f6523b;
        if (obj2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = obj2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        Object obj3 = this.f6524c;
        if (obj3 != null) {
            i8 = obj3.hashCode();
        }
        return i10 + i8;
    }

    public String toString() {
        return '(' + this.f6522a + ", " + this.f6523b + ", " + this.f6524c + ')';
    }
}
