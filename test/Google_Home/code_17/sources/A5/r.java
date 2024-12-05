package a5;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private String f14326a;

    /* renamed from: b, reason: collision with root package name */
    private String f14327b;

    /* renamed from: c, reason: collision with root package name */
    private long f14328c;

    /* renamed from: d, reason: collision with root package name */
    private String f14329d;

    public final String a() {
        return this.f14329d;
    }

    public final String b() {
        return this.f14326a;
    }

    public final String c() {
        String str = this.f14329d;
        if (str == null) {
            return null;
        }
        AbstractC3255y.f(str);
        String str2 = this.f14329d;
        AbstractC3255y.f(str2);
        String substring = str.substring(j6.n.X(str2, "/", 0, false, 6, null) + 1);
        AbstractC3255y.h(substring, "substring(...)");
        return substring;
    }

    public final String d() {
        return this.f14327b;
    }

    public final long e() {
        return this.f14328c;
    }

    public final void f(String str) {
        this.f14329d = str;
    }

    public final void g(String str) {
        this.f14326a = str;
    }

    public final void h(String str) {
        this.f14327b = str;
    }

    public final void i(long j8) {
        this.f14328c = j8;
    }

    public String toString() {
        return "FileInfo{md5='" + this.f14326a + "', sha256='" + this.f14327b + "', size=" + this.f14328c + ", absolutePath='" + this.f14329d + "'}";
    }
}
