package g4;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: g4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2717a {

    /* renamed from: a, reason: collision with root package name */
    private String f31211a;

    /* renamed from: b, reason: collision with root package name */
    private String f31212b;

    /* renamed from: c, reason: collision with root package name */
    private String f31213c;

    /* renamed from: d, reason: collision with root package name */
    private String f31214d;

    /* renamed from: e, reason: collision with root package name */
    private String f31215e;

    /* renamed from: f, reason: collision with root package name */
    private String f31216f;

    /* renamed from: g, reason: collision with root package name */
    private String f31217g;

    public C2717a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f31211a = str;
        this.f31212b = str2;
        this.f31213c = str3;
        this.f31214d = str4;
        this.f31215e = str5;
        this.f31216f = str6;
        this.f31217g = str7;
    }

    public static /* synthetic */ C2717a b(C2717a c2717a, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = c2717a.f31211a;
        }
        if ((i8 & 2) != 0) {
            str2 = c2717a.f31212b;
        }
        String str8 = str2;
        if ((i8 & 4) != 0) {
            str3 = c2717a.f31213c;
        }
        String str9 = str3;
        if ((i8 & 8) != 0) {
            str4 = c2717a.f31214d;
        }
        String str10 = str4;
        if ((i8 & 16) != 0) {
            str5 = c2717a.f31215e;
        }
        String str11 = str5;
        if ((i8 & 32) != 0) {
            str6 = c2717a.f31216f;
        }
        String str12 = str6;
        if ((i8 & 64) != 0) {
            str7 = c2717a.f31217g;
        }
        return c2717a.a(str, str8, str9, str10, str11, str12, str7);
    }

    public final C2717a a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new C2717a(str, str2, str3, str4, str5, str6, str7);
    }

    public final String c() {
        return this.f31213c;
    }

    public final String d() {
        return this.f31214d;
    }

    public final String e() {
        return this.f31215e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2717a)) {
            return false;
        }
        C2717a c2717a = (C2717a) obj;
        if (AbstractC3159y.d(this.f31211a, c2717a.f31211a) && AbstractC3159y.d(this.f31212b, c2717a.f31212b) && AbstractC3159y.d(this.f31213c, c2717a.f31213c) && AbstractC3159y.d(this.f31214d, c2717a.f31214d) && AbstractC3159y.d(this.f31215e, c2717a.f31215e) && AbstractC3159y.d(this.f31216f, c2717a.f31216f) && AbstractC3159y.d(this.f31217g, c2717a.f31217g)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f31212b;
    }

    public final String g() {
        return this.f31216f;
    }

    public final String h() {
        return this.f31211a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        String str = this.f31211a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f31212b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f31213c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str4 = this.f31214d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.f31215e;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str6 = this.f31216f;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str7 = this.f31217g;
        if (str7 != null) {
            i8 = str7.hashCode();
        }
        return i14 + i8;
    }

    public final String i() {
        return this.f31217g;
    }

    public final void j(String str) {
        this.f31213c = str;
    }

    public final void k(String str) {
        this.f31214d = str;
    }

    public final void l(String str) {
        this.f31215e = str;
    }

    public final void m(String str) {
        this.f31212b = str;
    }

    public final void n(String str) {
        this.f31216f = str;
    }

    public final void o(String str) {
        this.f31211a = str;
    }

    public final void p(String str) {
        this.f31217g = str;
    }

    public String toString() {
        return "Address(locality=" + this.f31211a + ", country=" + this.f31212b + ", addressLine1=" + this.f31213c + ", addressLine2=" + this.f31214d + ", administrativeArea=" + this.f31215e + ", dependentLocality=" + this.f31216f + ", postalCode=" + this.f31217g + ")";
    }

    public /* synthetic */ C2717a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : str5, (i8 & 32) != 0 ? null : str6, (i8 & 64) != 0 ? null : str7);
    }
}
