package kotlin.reflect.x.internal.l0.j.b;

import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.f.b;

/* compiled from: IncompatibleVersionErrorData.kt */
/* loaded from: classes2.dex */
public final class t<T> {
    private final T a;

    /* renamed from: b, reason: collision with root package name */
    private final T f21113b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21114c;

    /* renamed from: d, reason: collision with root package name */
    private final b f21115d;

    public t(T t, T t2, String str, b bVar) {
        l.f(str, "filePath");
        l.f(bVar, "classId");
        this.a = t;
        this.f21113b = t2;
        this.f21114c = str;
        this.f21115d = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return l.a(this.a, tVar.a) && l.a(this.f21113b, tVar.f21113b) && l.a(this.f21114c, tVar.f21114c) && l.a(this.f21115d, tVar.f21115d);
    }

    public int hashCode() {
        T t = this.a;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f21113b;
        return ((((hashCode + (t2 != null ? t2.hashCode() : 0)) * 31) + this.f21114c.hashCode()) * 31) + this.f21115d.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.a + ", expectedVersion=" + this.f21113b + ", filePath=" + this.f21114c + ", classId=" + this.f21115d + ')';
    }
}
