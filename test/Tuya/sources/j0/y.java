package J0;

import J0.D;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class y extends D.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f4672a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4673b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4674c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4675d;

    /* renamed from: e, reason: collision with root package name */
    private final int f4676e;

    /* renamed from: f, reason: collision with root package name */
    private final E0.e f4677f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(String str, String str2, String str3, String str4, int i8, E0.e eVar) {
        if (str != null) {
            this.f4672a = str;
            if (str2 != null) {
                this.f4673b = str2;
                if (str3 != null) {
                    this.f4674c = str3;
                    if (str4 != null) {
                        this.f4675d = str4;
                        this.f4676e = i8;
                        if (eVar != null) {
                            this.f4677f = eVar;
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

    @Override // J0.D.a
    public String a() {
        return this.f4672a;
    }

    @Override // J0.D.a
    public int c() {
        return this.f4676e;
    }

    @Override // J0.D.a
    public E0.e d() {
        return this.f4677f;
    }

    @Override // J0.D.a
    public String e() {
        return this.f4675d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D.a)) {
            return false;
        }
        D.a aVar = (D.a) obj;
        if (this.f4672a.equals(aVar.a()) && this.f4673b.equals(aVar.f()) && this.f4674c.equals(aVar.g()) && this.f4675d.equals(aVar.e()) && this.f4676e == aVar.c() && this.f4677f.equals(aVar.d())) {
            return true;
        }
        return false;
    }

    @Override // J0.D.a
    public String f() {
        return this.f4673b;
    }

    @Override // J0.D.a
    public String g() {
        return this.f4674c;
    }

    public int hashCode() {
        return ((((((((((this.f4672a.hashCode() ^ 1000003) * 1000003) ^ this.f4673b.hashCode()) * 1000003) ^ this.f4674c.hashCode()) * 1000003) ^ this.f4675d.hashCode()) * 1000003) ^ this.f4676e) * 1000003) ^ this.f4677f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f4672a + ", versionCode=" + this.f4673b + ", versionName=" + this.f4674c + ", installUuid=" + this.f4675d + ", deliveryMechanism=" + this.f4676e + ", developmentPlatformProvider=" + this.f4677f + "}";
    }
}
