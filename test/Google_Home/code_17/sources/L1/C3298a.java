package l1;

import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: l1.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3298a {

    /* renamed from: a, reason: collision with root package name */
    private final String f34270a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34271b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34272c;

    /* renamed from: d, reason: collision with root package name */
    private final String f34273d;

    /* renamed from: e, reason: collision with root package name */
    private final u f34274e;

    /* renamed from: f, reason: collision with root package name */
    private final List f34275f;

    public C3298a(String packageName, String versionName, String appBuildVersion, String deviceManufacturer, u currentProcessDetails, List appProcessDetails) {
        AbstractC3255y.i(packageName, "packageName");
        AbstractC3255y.i(versionName, "versionName");
        AbstractC3255y.i(appBuildVersion, "appBuildVersion");
        AbstractC3255y.i(deviceManufacturer, "deviceManufacturer");
        AbstractC3255y.i(currentProcessDetails, "currentProcessDetails");
        AbstractC3255y.i(appProcessDetails, "appProcessDetails");
        this.f34270a = packageName;
        this.f34271b = versionName;
        this.f34272c = appBuildVersion;
        this.f34273d = deviceManufacturer;
        this.f34274e = currentProcessDetails;
        this.f34275f = appProcessDetails;
    }

    public final String a() {
        return this.f34272c;
    }

    public final List b() {
        return this.f34275f;
    }

    public final u c() {
        return this.f34274e;
    }

    public final String d() {
        return this.f34273d;
    }

    public final String e() {
        return this.f34270a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3298a)) {
            return false;
        }
        C3298a c3298a = (C3298a) obj;
        if (AbstractC3255y.d(this.f34270a, c3298a.f34270a) && AbstractC3255y.d(this.f34271b, c3298a.f34271b) && AbstractC3255y.d(this.f34272c, c3298a.f34272c) && AbstractC3255y.d(this.f34273d, c3298a.f34273d) && AbstractC3255y.d(this.f34274e, c3298a.f34274e) && AbstractC3255y.d(this.f34275f, c3298a.f34275f)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f34271b;
    }

    public int hashCode() {
        return (((((((((this.f34270a.hashCode() * 31) + this.f34271b.hashCode()) * 31) + this.f34272c.hashCode()) * 31) + this.f34273d.hashCode()) * 31) + this.f34274e.hashCode()) * 31) + this.f34275f.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f34270a + ", versionName=" + this.f34271b + ", appBuildVersion=" + this.f34272c + ", deviceManufacturer=" + this.f34273d + ", currentProcessDetails=" + this.f34274e + ", appProcessDetails=" + this.f34275f + ')';
    }
}
