package J0;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final String f4627a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4628b;

    public C(String str, String str2) {
        this.f4627a = str;
        this.f4628b = str2;
    }

    public final String a() {
        return this.f4628b;
    }

    public final String b() {
        return this.f4627a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c8 = (C) obj;
        if (AbstractC3255y.d(this.f4627a, c8.f4627a) && AbstractC3255y.d(this.f4628b, c8.f4628b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f4627a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f4628b;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        return "FirebaseInstallationId(fid=" + this.f4627a + ", authToken=" + this.f4628b + ')';
    }
}
