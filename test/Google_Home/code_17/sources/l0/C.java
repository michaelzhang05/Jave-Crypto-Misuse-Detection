package L0;

import L0.G;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class C extends G.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f5315a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5316b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5317c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5318d;

    /* renamed from: e, reason: collision with root package name */
    private final int f5319e;

    /* renamed from: f, reason: collision with root package name */
    private final G0.g f5320f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C(String str, String str2, String str3, String str4, int i8, G0.g gVar) {
        if (str != null) {
            this.f5315a = str;
            if (str2 != null) {
                this.f5316b = str2;
                if (str3 != null) {
                    this.f5317c = str3;
                    if (str4 != null) {
                        this.f5318d = str4;
                        this.f5319e = i8;
                        if (gVar != null) {
                            this.f5320f = gVar;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    @Override // L0.G.a
    public String a() {
        return this.f5315a;
    }

    @Override // L0.G.a
    public int c() {
        return this.f5319e;
    }

    @Override // L0.G.a
    public G0.g d() {
        return this.f5320f;
    }

    @Override // L0.G.a
    public String e() {
        return this.f5318d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G.a)) {
            return false;
        }
        G.a aVar = (G.a) obj;
        if (this.f5315a.equals(aVar.a()) && this.f5316b.equals(aVar.f()) && this.f5317c.equals(aVar.g()) && this.f5318d.equals(aVar.e()) && this.f5319e == aVar.c() && this.f5320f.equals(aVar.d())) {
            return true;
        }
        return false;
    }

    @Override // L0.G.a
    public String f() {
        return this.f5316b;
    }

    @Override // L0.G.a
    public String g() {
        return this.f5317c;
    }

    public int hashCode() {
        return ((((((((((this.f5315a.hashCode() ^ 1000003) * 1000003) ^ this.f5316b.hashCode()) * 1000003) ^ this.f5317c.hashCode()) * 1000003) ^ this.f5318d.hashCode()) * 1000003) ^ this.f5319e) * 1000003) ^ this.f5320f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f5315a + ", versionCode=" + this.f5316b + ", versionName=" + this.f5317c + ", installUuid=" + this.f5318d + ", deliveryMechanism=" + this.f5319e + ", developmentPlatformProvider=" + this.f5320f + "}";
    }
}
