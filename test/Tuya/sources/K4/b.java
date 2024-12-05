package K4;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f5957a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5958b;

    /* renamed from: c, reason: collision with root package name */
    private String f5959c;

    public b(String packageName, String name) {
        AbstractC3159y.i(packageName, "packageName");
        AbstractC3159y.i(name, "name");
        this.f5957a = packageName;
        this.f5958b = name;
    }

    public final String a() {
        return this.f5959c;
    }

    public final String b() {
        return this.f5958b;
    }

    public final String c() {
        return this.f5957a;
    }

    public final void d(String str) {
        this.f5959c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3159y.d(this.f5957a, bVar.f5957a) && AbstractC3159y.d(this.f5958b, bVar.f5958b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f5957a.hashCode() * 31) + this.f5958b.hashCode();
    }

    public String toString() {
        return "AppToBackup(packageName=" + this.f5957a + ", name=" + this.f5958b + ')';
    }
}
