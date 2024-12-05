package l1;

import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: l1.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3299b {

    /* renamed from: a, reason: collision with root package name */
    private final String f34276a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34277b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34278c;

    /* renamed from: d, reason: collision with root package name */
    private final String f34279d;

    /* renamed from: e, reason: collision with root package name */
    private final t f34280e;

    /* renamed from: f, reason: collision with root package name */
    private final C3298a f34281f;

    public C3299b(String appId, String deviceModel, String sessionSdkVersion, String osVersion, t logEnvironment, C3298a androidAppInfo) {
        AbstractC3255y.i(appId, "appId");
        AbstractC3255y.i(deviceModel, "deviceModel");
        AbstractC3255y.i(sessionSdkVersion, "sessionSdkVersion");
        AbstractC3255y.i(osVersion, "osVersion");
        AbstractC3255y.i(logEnvironment, "logEnvironment");
        AbstractC3255y.i(androidAppInfo, "androidAppInfo");
        this.f34276a = appId;
        this.f34277b = deviceModel;
        this.f34278c = sessionSdkVersion;
        this.f34279d = osVersion;
        this.f34280e = logEnvironment;
        this.f34281f = androidAppInfo;
    }

    public final C3298a a() {
        return this.f34281f;
    }

    public final String b() {
        return this.f34276a;
    }

    public final String c() {
        return this.f34277b;
    }

    public final t d() {
        return this.f34280e;
    }

    public final String e() {
        return this.f34279d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3299b)) {
            return false;
        }
        C3299b c3299b = (C3299b) obj;
        if (AbstractC3255y.d(this.f34276a, c3299b.f34276a) && AbstractC3255y.d(this.f34277b, c3299b.f34277b) && AbstractC3255y.d(this.f34278c, c3299b.f34278c) && AbstractC3255y.d(this.f34279d, c3299b.f34279d) && this.f34280e == c3299b.f34280e && AbstractC3255y.d(this.f34281f, c3299b.f34281f)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f34278c;
    }

    public int hashCode() {
        return (((((((((this.f34276a.hashCode() * 31) + this.f34277b.hashCode()) * 31) + this.f34278c.hashCode()) * 31) + this.f34279d.hashCode()) * 31) + this.f34280e.hashCode()) * 31) + this.f34281f.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.f34276a + ", deviceModel=" + this.f34277b + ", sessionSdkVersion=" + this.f34278c + ", osVersion=" + this.f34279d + ", logEnvironment=" + this.f34280e + ", androidAppInfo=" + this.f34281f + ')';
    }
}
