package N4;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f7736a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7737b;

    /* renamed from: c, reason: collision with root package name */
    private String f7738c;

    public b(String packageName, String name) {
        AbstractC3255y.i(packageName, "packageName");
        AbstractC3255y.i(name, "name");
        this.f7736a = packageName;
        this.f7737b = name;
    }

    public final String a() {
        return this.f7738c;
    }

    public final String b() {
        return this.f7737b;
    }

    public final String c() {
        return this.f7736a;
    }

    public final void d(String str) {
        this.f7738c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3255y.d(this.f7736a, bVar.f7736a) && AbstractC3255y.d(this.f7737b, bVar.f7737b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f7736a.hashCode() * 31) + this.f7737b.hashCode();
    }

    public String toString() {
        return "AppToBackup(packageName=" + this.f7736a + ", name=" + this.f7737b + ')';
    }
}
