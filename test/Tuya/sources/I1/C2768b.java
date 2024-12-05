package i1;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2768b {

    /* renamed from: a, reason: collision with root package name */
    private final String f31431a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31432b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31433c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31434d;

    /* renamed from: e, reason: collision with root package name */
    private final m f31435e;

    /* renamed from: f, reason: collision with root package name */
    private final C2767a f31436f;

    public C2768b(String appId, String deviceModel, String sessionSdkVersion, String osVersion, m logEnvironment, C2767a androidAppInfo) {
        AbstractC3159y.i(appId, "appId");
        AbstractC3159y.i(deviceModel, "deviceModel");
        AbstractC3159y.i(sessionSdkVersion, "sessionSdkVersion");
        AbstractC3159y.i(osVersion, "osVersion");
        AbstractC3159y.i(logEnvironment, "logEnvironment");
        AbstractC3159y.i(androidAppInfo, "androidAppInfo");
        this.f31431a = appId;
        this.f31432b = deviceModel;
        this.f31433c = sessionSdkVersion;
        this.f31434d = osVersion;
        this.f31435e = logEnvironment;
        this.f31436f = androidAppInfo;
    }

    public final C2767a a() {
        return this.f31436f;
    }

    public final String b() {
        return this.f31431a;
    }

    public final String c() {
        return this.f31432b;
    }

    public final m d() {
        return this.f31435e;
    }

    public final String e() {
        return this.f31434d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2768b)) {
            return false;
        }
        C2768b c2768b = (C2768b) obj;
        if (AbstractC3159y.d(this.f31431a, c2768b.f31431a) && AbstractC3159y.d(this.f31432b, c2768b.f31432b) && AbstractC3159y.d(this.f31433c, c2768b.f31433c) && AbstractC3159y.d(this.f31434d, c2768b.f31434d) && this.f31435e == c2768b.f31435e && AbstractC3159y.d(this.f31436f, c2768b.f31436f)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f31433c;
    }

    public int hashCode() {
        return (((((((((this.f31431a.hashCode() * 31) + this.f31432b.hashCode()) * 31) + this.f31433c.hashCode()) * 31) + this.f31434d.hashCode()) * 31) + this.f31435e.hashCode()) * 31) + this.f31436f.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.f31431a + ", deviceModel=" + this.f31432b + ", sessionSdkVersion=" + this.f31433c + ", osVersion=" + this.f31434d + ", logEnvironment=" + this.f31435e + ", androidAppInfo=" + this.f31436f + ')';
    }
}
