package j4;

import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private String f33952a;

    /* renamed from: b, reason: collision with root package name */
    private String f33953b;

    /* renamed from: c, reason: collision with root package name */
    private String f33954c;

    /* renamed from: d, reason: collision with root package name */
    private String f33955d;

    /* renamed from: e, reason: collision with root package name */
    private String f33956e;

    public c(String str, String str2, String str3, String str4, String str5) {
        this.f33952a = str;
        this.f33953b = str2;
        this.f33954c = str3;
        this.f33955d = str4;
        this.f33956e = str5;
    }

    public final String a() {
        return this.f33953b;
    }

    public final String b() {
        return this.f33952a;
    }

    public final String c() {
        return this.f33954c;
    }

    public final String d() {
        return this.f33955d;
    }

    public final String e() {
        return this.f33956e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3255y.d(this.f33952a, cVar.f33952a) && AbstractC3255y.d(this.f33953b, cVar.f33953b) && AbstractC3255y.d(this.f33954c, cVar.f33954c) && AbstractC3255y.d(this.f33955d, cVar.f33955d) && AbstractC3255y.d(this.f33956e, cVar.f33956e)) {
            return true;
        }
        return false;
    }

    public final void f(String str) {
        this.f33953b = str;
    }

    public final void g(String str) {
        this.f33952a = str;
    }

    public final void h(String str) {
        this.f33954c = str;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f33952a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f33953b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f33954c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str4 = this.f33955d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.f33956e;
        if (str5 != null) {
            i8 = str5.hashCode();
        }
        return i12 + i8;
    }

    public final void i(String str) {
        this.f33955d = str;
    }

    public final void j(String str) {
        this.f33956e = str;
    }

    public String toString() {
        return "AddressLine1(streetNumber=" + this.f33952a + ", route=" + this.f33953b + ", subLocalityLevel2=" + this.f33954c + ", subLocalityLevel3=" + this.f33955d + ", subLocalityLevel4=" + this.f33956e + ")";
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, String str5, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : str5);
    }
}
