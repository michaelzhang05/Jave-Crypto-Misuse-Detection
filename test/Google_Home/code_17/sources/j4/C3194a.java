package j4;

import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: j4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3194a {

    /* renamed from: a, reason: collision with root package name */
    private String f33938a;

    /* renamed from: b, reason: collision with root package name */
    private String f33939b;

    /* renamed from: c, reason: collision with root package name */
    private String f33940c;

    /* renamed from: d, reason: collision with root package name */
    private String f33941d;

    /* renamed from: e, reason: collision with root package name */
    private String f33942e;

    /* renamed from: f, reason: collision with root package name */
    private String f33943f;

    /* renamed from: g, reason: collision with root package name */
    private String f33944g;

    public C3194a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f33938a = str;
        this.f33939b = str2;
        this.f33940c = str3;
        this.f33941d = str4;
        this.f33942e = str5;
        this.f33943f = str6;
        this.f33944g = str7;
    }

    public static /* synthetic */ C3194a b(C3194a c3194a, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = c3194a.f33938a;
        }
        if ((i8 & 2) != 0) {
            str2 = c3194a.f33939b;
        }
        String str8 = str2;
        if ((i8 & 4) != 0) {
            str3 = c3194a.f33940c;
        }
        String str9 = str3;
        if ((i8 & 8) != 0) {
            str4 = c3194a.f33941d;
        }
        String str10 = str4;
        if ((i8 & 16) != 0) {
            str5 = c3194a.f33942e;
        }
        String str11 = str5;
        if ((i8 & 32) != 0) {
            str6 = c3194a.f33943f;
        }
        String str12 = str6;
        if ((i8 & 64) != 0) {
            str7 = c3194a.f33944g;
        }
        return c3194a.a(str, str8, str9, str10, str11, str12, str7);
    }

    public final C3194a a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new C3194a(str, str2, str3, str4, str5, str6, str7);
    }

    public final String c() {
        return this.f33940c;
    }

    public final String d() {
        return this.f33941d;
    }

    public final String e() {
        return this.f33942e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3194a)) {
            return false;
        }
        C3194a c3194a = (C3194a) obj;
        if (AbstractC3255y.d(this.f33938a, c3194a.f33938a) && AbstractC3255y.d(this.f33939b, c3194a.f33939b) && AbstractC3255y.d(this.f33940c, c3194a.f33940c) && AbstractC3255y.d(this.f33941d, c3194a.f33941d) && AbstractC3255y.d(this.f33942e, c3194a.f33942e) && AbstractC3255y.d(this.f33943f, c3194a.f33943f) && AbstractC3255y.d(this.f33944g, c3194a.f33944g)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f33939b;
    }

    public final String g() {
        return this.f33943f;
    }

    public final String h() {
        return this.f33938a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        String str = this.f33938a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f33939b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f33940c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str4 = this.f33941d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.f33942e;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str6 = this.f33943f;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str7 = this.f33944g;
        if (str7 != null) {
            i8 = str7.hashCode();
        }
        return i14 + i8;
    }

    public final String i() {
        return this.f33944g;
    }

    public final void j(String str) {
        this.f33940c = str;
    }

    public final void k(String str) {
        this.f33941d = str;
    }

    public final void l(String str) {
        this.f33942e = str;
    }

    public final void m(String str) {
        this.f33939b = str;
    }

    public final void n(String str) {
        this.f33943f = str;
    }

    public final void o(String str) {
        this.f33938a = str;
    }

    public final void p(String str) {
        this.f33944g = str;
    }

    public String toString() {
        return "Address(locality=" + this.f33938a + ", country=" + this.f33939b + ", addressLine1=" + this.f33940c + ", addressLine2=" + this.f33941d + ", administrativeArea=" + this.f33942e + ", dependentLocality=" + this.f33943f + ", postalCode=" + this.f33944g + ")";
    }

    public /* synthetic */ C3194a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : str5, (i8 & 32) != 0 ? null : str6, (i8 & 64) != 0 ? null : str7);
    }
}
