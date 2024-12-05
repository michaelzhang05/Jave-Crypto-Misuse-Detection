package z4;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class g implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Object f10053a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f10054b;

    public g(Object obj, Object obj2) {
        this.f10053a = obj;
        this.f10054b = obj2;
    }

    public final Object a() {
        return this.f10053a;
    }

    public final Object b() {
        return this.f10054b;
    }

    public final Object c() {
        return this.f10053a;
    }

    public final Object d() {
        return this.f10054b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return f5.h.a(this.f10053a, gVar.f10053a) && f5.h.a(this.f10054b, gVar.f10054b);
    }

    public int hashCode() {
        Object obj = this.f10053a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f10054b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f10053a + ", " + this.f10054b + ')';
    }
}
