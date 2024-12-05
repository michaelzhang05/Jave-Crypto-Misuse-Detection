package com.stripe.android.googlepaylauncher;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f24911a;

    /* renamed from: b, reason: collision with root package name */
    private final b f24912b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f24913c;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
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
        public static final b f24914b = new b("Min", 0, "MIN");

        /* renamed from: c, reason: collision with root package name */
        public static final b f24915c = new b("Full", 1, "FULL");

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f24916d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ U5.a f24917e;

        /* renamed from: a, reason: collision with root package name */
        private final String f24918a;

        static {
            b[] a8 = a();
            f24916d = a8;
            f24917e = U5.b.a(a8);
        }

        private b(String str, int i8, String str2) {
            this.f24918a = str2;
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f24914b, f24915c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f24916d.clone();
        }
    }

    public d(boolean z8, b format, boolean z9) {
        AbstractC3255y.i(format, "format");
        this.f24911a = z8;
        this.f24912b = format;
        this.f24913c = z9;
    }

    public final b a() {
        return this.f24912b;
    }

    public final boolean b() {
        return this.f24913c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f24911a == dVar.f24911a && this.f24912b == dVar.f24912b && this.f24913c == dVar.f24913c;
    }

    public final boolean g() {
        return this.f24911a;
    }

    public int hashCode() {
        return (((androidx.compose.foundation.a.a(this.f24911a) * 31) + this.f24912b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f24913c);
    }

    public String toString() {
        return "BillingAddressConfig(isRequired=" + this.f24911a + ", format=" + this.f24912b + ", isPhoneNumberRequired=" + this.f24913c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeInt(this.f24911a ? 1 : 0);
        out.writeString(this.f24912b.name());
        out.writeInt(this.f24913c ? 1 : 0);
    }
}
