package i1;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: i1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2767a {

    /* renamed from: a, reason: collision with root package name */
    private final String f31427a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31428b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31429c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31430d;

    public C2767a(String packageName, String versionName, String appBuildVersion, String deviceManufacturer) {
        AbstractC3159y.i(packageName, "packageName");
        AbstractC3159y.i(versionName, "versionName");
        AbstractC3159y.i(appBuildVersion, "appBuildVersion");
        AbstractC3159y.i(deviceManufacturer, "deviceManufacturer");
        this.f31427a = packageName;
        this.f31428b = versionName;
        this.f31429c = appBuildVersion;
        this.f31430d = deviceManufacturer;
    }

    public final String a() {
        return this.f31429c;
    }

    public final String b() {
        return this.f31430d;
    }

    public final String c() {
        return this.f31427a;
    }

    public final String d() {
        return this.f31428b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2767a)) {
            return false;
        }
        C2767a c2767a = (C2767a) obj;
        if (AbstractC3159y.d(this.f31427a, c2767a.f31427a) && AbstractC3159y.d(this.f31428b, c2767a.f31428b) && AbstractC3159y.d(this.f31429c, c2767a.f31429c) && AbstractC3159y.d(this.f31430d, c2767a.f31430d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f31427a.hashCode() * 31) + this.f31428b.hashCode()) * 31) + this.f31429c.hashCode()) * 31) + this.f31430d.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f31427a + ", versionName=" + this.f31428b + ", appBuildVersion=" + this.f31429c + ", deviceManufacturer=" + this.f31430d + ')';
    }
}
