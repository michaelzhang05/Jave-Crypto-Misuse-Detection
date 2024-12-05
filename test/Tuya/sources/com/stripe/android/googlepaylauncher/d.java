package com.stripe.android.googlepaylauncher;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23856a;

    /* renamed from: b, reason: collision with root package name */
    private final b f23857b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23858c;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new d(parcel.readInt() != 0, b.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d[] newArray(int i8) {
            return new d[i8];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f23859b = new b("Min", 0, "MIN");

        /* renamed from: c, reason: collision with root package name */
        public static final b f23860c = new b("Full", 1, "FULL");

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f23861d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ R5.a f23862e;

        /* renamed from: a, reason: collision with root package name */
        private final String f23863a;

        static {
            b[] a8 = a();
            f23861d = a8;
            f23862e = R5.b.a(a8);
        }

        private b(String str, int i8, String str2) {
            this.f23863a = str2;
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f23859b, f23860c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f23861d.clone();
        }
    }

    public d(boolean z8, b format, boolean z9) {
        AbstractC3159y.i(format, "format");
        this.f23856a = z8;
        this.f23857b = format;
        this.f23858c = z9;
    }

    public final b b() {
        return this.f23857b;
    }

    public final boolean c() {
        return this.f23858c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f23856a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f23856a == dVar.f23856a && this.f23857b == dVar.f23857b && this.f23858c == dVar.f23858c;
    }

    public int hashCode() {
        return (((androidx.compose.foundation.a.a(this.f23856a) * 31) + this.f23857b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f23858c);
    }

    public String toString() {
        return "BillingAddressConfig(isRequired=" + this.f23856a + ", format=" + this.f23857b + ", isPhoneNumberRequired=" + this.f23858c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeInt(this.f23856a ? 1 : 0);
        out.writeString(this.f23857b.name());
        out.writeInt(this.f23858c ? 1 : 0);
    }
}
