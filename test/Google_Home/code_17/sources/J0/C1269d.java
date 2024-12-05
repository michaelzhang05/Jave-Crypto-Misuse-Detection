package J0;

import J0.E;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: J0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1269d extends E.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f4666a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4667b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4668c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1269d(String str, String str2, String str3) {
        if (str != null) {
            this.f4666a = str;
            this.f4667b = str2;
            this.f4668c = str3;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }

    @Override // J0.E.a
    public String c() {
        return this.f4666a;
    }

    @Override // J0.E.a
    public String d() {
        return this.f4668c;
    }

    @Override // J0.E.a
    public String e() {
        return this.f4667b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof E.a)) {
            return false;
        }
        E.a aVar = (E.a) obj;
        if (this.f4666a.equals(aVar.c()) && ((str = this.f4667b) != null ? str.equals(aVar.e()) : aVar.e() == null)) {
            String str2 = this.f4668c;
            if (str2 == null) {
                if (aVar.d() == null) {
                    return true;
                }
            } else if (str2.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f4666a.hashCode() ^ 1000003) * 1000003;
        String str = this.f4667b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode2 ^ hashCode) * 1000003;
        String str2 = this.f4668c;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i9 ^ i8;
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f4666a + ", firebaseInstallationId=" + this.f4667b + ", firebaseAuthenticationToken=" + this.f4668c + "}";
    }
}
