package kotlin.reflect.x.internal.l0.l.y1;

import kotlin.jvm.internal.l;

/* compiled from: CapturedTypeApproximation.kt */
/* loaded from: classes2.dex */
public final class a<T> {
    private final T a;

    /* renamed from: b, reason: collision with root package name */
    private final T f21389b;

    public a(T t, T t2) {
        this.a = t;
        this.f21389b = t2;
    }

    public final T a() {
        return this.a;
    }

    public final T b() {
        return this.f21389b;
    }

    public final T c() {
        return this.a;
    }

    public final T d() {
        return this.f21389b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.a, aVar.a) && l.a(this.f21389b, aVar.f21389b);
    }

    public int hashCode() {
        T t = this.a;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f21389b;
        return hashCode + (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.a + ", upper=" + this.f21389b + ')';
    }
}
