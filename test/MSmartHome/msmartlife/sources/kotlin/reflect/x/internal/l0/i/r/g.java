package kotlin.reflect.x.internal.l0.i.r;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.x.internal.l0.l.e0;

/* compiled from: constantValues.kt */
/* loaded from: classes2.dex */
public abstract class g<T> {
    private final T a;

    public g(T t) {
        this.a = t;
    }

    public abstract e0 a(g0 g0Var);

    public T b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            T b2 = b();
            g gVar = obj instanceof g ? (g) obj : null;
            if (!l.a(b2, gVar != null ? gVar.b() : null)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        T b2 = b();
        if (b2 != null) {
            return b2.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
