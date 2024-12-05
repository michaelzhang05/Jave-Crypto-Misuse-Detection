package g4;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private String f31225a;

    /* renamed from: b, reason: collision with root package name */
    private String f31226b;

    /* renamed from: c, reason: collision with root package name */
    private String f31227c;

    /* renamed from: d, reason: collision with root package name */
    private String f31228d;

    /* renamed from: e, reason: collision with root package name */
    private String f31229e;

    public c(String str, String str2, String str3, String str4, String str5) {
        this.f31225a = str;
        this.f31226b = str2;
        this.f31227c = str3;
        this.f31228d = str4;
        this.f31229e = str5;
    }

    public final String a() {
        return this.f31226b;
    }

    public final String b() {
        return this.f31225a;
    }

    public final String c() {
        return this.f31227c;
    }

    public final String d() {
        return this.f31228d;
    }

    public final String e() {
        return this.f31229e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3159y.d(this.f31225a, cVar.f31225a) && AbstractC3159y.d(this.f31226b, cVar.f31226b) && AbstractC3159y.d(this.f31227c, cVar.f31227c) && AbstractC3159y.d(this.f31228d, cVar.f31228d) && AbstractC3159y.d(this.f31229e, cVar.f31229e)) {
            return true;
        }
        return false;
    }

    public final void f(String str) {
        this.f31226b = str;
    }

    public final void g(String str) {
        this.f31225a = str;
    }

    public final void h(String str) {
        this.f31227c = str;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f31225a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f31226b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f31227c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str4 = this.f31228d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.f31229e;
        if (str5 != null) {
            i8 = str5.hashCode();
        }
        return i12 + i8;
    }

    public final void i(String str) {
        this.f31228d = str;
    }

    public final void j(String str) {
        this.f31229e = str;
    }

    public String toString() {
        return "AddressLine1(streetNumber=" + this.f31225a + ", route=" + this.f31226b + ", subLocalityLevel2=" + this.f31227c + ", subLocalityLevel3=" + this.f31228d + ", subLocalityLevel4=" + this.f31229e + ")";
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, String str5, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : str5);
    }
}
