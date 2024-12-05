package H0;

import H0.A;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: H0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1170d extends A.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f3290a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3291b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1170d(String str, String str2) {
        if (str != null) {
            this.f3290a = str;
            this.f3291b = str2;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }

    @Override // H0.A.a
    public String c() {
        return this.f3290a;
    }

    @Override // H0.A.a
    public String d() {
        return this.f3291b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof A.a)) {
            return false;
        }
        A.a aVar = (A.a) obj;
        if (this.f3290a.equals(aVar.c())) {
            String str = this.f3291b;
            if (str == null) {
                if (aVar.d() == null) {
                    return true;
                }
            } else if (str.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f3290a.hashCode() ^ 1000003) * 1000003;
        String str = this.f3291b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f3290a + ", firebaseInstallationId=" + this.f3291b + "}";
    }
}
