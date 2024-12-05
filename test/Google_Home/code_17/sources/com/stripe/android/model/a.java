package com.stripe.android.model;

import P5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import e3.InterfaceC2784H;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import y2.C4203b;

/* loaded from: classes4.dex */
public final class a implements y2.f, InterfaceC2784H {

    /* renamed from: h, reason: collision with root package name */
    public static final int f25255h = 0;

    /* renamed from: a, reason: collision with root package name */
    private final String f25256a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25257b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25258c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25259d;

    /* renamed from: e, reason: collision with root package name */
    private final String f25260e;

    /* renamed from: f, reason: collision with root package name */
    private final String f25261f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f25254g = new b(null);
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* renamed from: com.stripe.android.model.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0494a {

        /* renamed from: a, reason: collision with root package name */
        private String f25262a;

        /* renamed from: b, reason: collision with root package name */
        private String f25263b;

        /* renamed from: c, reason: collision with root package name */
        private String f25264c;

        /* renamed from: d, reason: collision with root package name */
        private String f25265d;

        /* renamed from: e, reason: collision with root package name */
        private String f25266e;

        /* renamed from: f, reason: collision with root package name */
        private String f25267f;

        public final a a() {
            return new a(this.f25262a, this.f25263b, this.f25264c, this.f25265d, this.f25266e, this.f25267f);
        }

        public final C0494a b(String str) {
            this.f25262a = str;
            return this;
        }

        public final C0494a c(String str) {
            String str2;
            if (str != null) {
                str2 = str.toUpperCase(Locale.ROOT);
                AbstractC3255y.h(str2, "toUpperCase(...)");
            } else {
                str2 = null;
            }
            this.f25263b = str2;
            return this;
        }

        public final C0494a d(C4203b c4203b) {
            String str;
            if (c4203b != null) {
                str = c4203b.b();
            } else {
                str = null;
            }
            this.f25263b = str;
            return this;
        }

        public final C0494a e(String str) {
            this.f25264c = str;
            return this;
        }

        public final C0494a f(String str) {
            this.f25265d = str;
            return this;
        }

        public final C0494a g(String str) {
            this.f25266e = str;
            return this;
        }

        public final C0494a h(String str) {
            this.f25267f = str;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f25256a = str;
        this.f25257b = str2;
        this.f25258c = str3;
        this.f25259d = str4;
        this.f25260e = str5;
        this.f25261f = str6;
    }

    @Override // e3.InterfaceC2784H
    public Map B() {
        String str = this.f25256a;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        O5.r a8 = O5.x.a("city", str);
        String str3 = this.f25257b;
        if (str3 == null) {
            str3 = "";
        }
        O5.r a9 = O5.x.a("country", str3);
        String str4 = this.f25258c;
        if (str4 == null) {
            str4 = "";
        }
        O5.r a10 = O5.x.a("line1", str4);
        String str5 = this.f25259d;
        if (str5 == null) {
            str5 = "";
        }
        O5.r a11 = O5.x.a("line2", str5);
        String str6 = this.f25260e;
        if (str6 == null) {
            str6 = "";
        }
        O5.r a12 = O5.x.a("postal_code", str6);
        String str7 = this.f25261f;
        if (str7 != null) {
            str2 = str7;
        }
        Map k8 = Q.k(a8, a9, a10, a11, a12, O5.x.a("state", str2));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : k8.entrySet()) {
            if (((String) entry.getValue()).length() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public final String a() {
        return this.f25256a;
    }

    public final String b() {
        return this.f25257b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC3255y.d(this.f25256a, aVar.f25256a) && AbstractC3255y.d(this.f25257b, aVar.f25257b) && AbstractC3255y.d(this.f25258c, aVar.f25258c) && AbstractC3255y.d(this.f25259d, aVar.f25259d) && AbstractC3255y.d(this.f25260e, aVar.f25260e) && AbstractC3255y.d(this.f25261f, aVar.f25261f);
    }

    public final String g() {
        return this.f25258c;
    }

    public final String h() {
        return this.f25259d;
    }

    public int hashCode() {
        String str = this.f25256a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f25257b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25258c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f25259d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f25260e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f25261f;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String i() {
        return this.f25260e;
    }

    public final String l() {
        return this.f25261f;
    }

    public final boolean p() {
        if (this.f25256a == null && this.f25257b == null && this.f25258c == null && this.f25259d == null && this.f25260e == null && this.f25261f == null) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Address(city=" + this.f25256a + ", country=" + this.f25257b + ", line1=" + this.f25258c + ", line2=" + this.f25259d + ", postalCode=" + this.f25260e + ", state=" + this.f25261f + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f25256a);
        out.writeString(this.f25257b);
        out.writeString(this.f25258c);
        out.writeString(this.f25259d);
        out.writeString(this.f25260e);
        out.writeString(this.f25261f);
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : str5, (i8 & 32) != 0 ? null : str6);
    }
}
