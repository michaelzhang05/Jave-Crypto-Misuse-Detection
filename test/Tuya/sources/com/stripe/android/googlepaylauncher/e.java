package com.stripe.android.googlepaylauncher;

import android.os.Parcel;
import android.os.Parcelable;
import g6.n;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final I2.d f23864a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23865b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23866c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f23867d;

    /* renamed from: e, reason: collision with root package name */
    private d f23868e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f23869f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f23870g;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new e(I2.d.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, d.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e[] newArray(int i8) {
            return new e[i8];
        }
    }

    public e(I2.d environment, String merchantCountryCode, String merchantName, boolean z8, d billingAddressConfig, boolean z9, boolean z10) {
        AbstractC3159y.i(environment, "environment");
        AbstractC3159y.i(merchantCountryCode, "merchantCountryCode");
        AbstractC3159y.i(merchantName, "merchantName");
        AbstractC3159y.i(billingAddressConfig, "billingAddressConfig");
        this.f23864a = environment;
        this.f23865b = merchantCountryCode;
        this.f23866c = merchantName;
        this.f23867d = z8;
        this.f23868e = billingAddressConfig;
        this.f23869f = z9;
        this.f23870g = z10;
    }

    public final boolean b() {
        return this.f23870g;
    }

    public final d c() {
        return this.f23868e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final I2.d e() {
        return this.f23864a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f23864a == eVar.f23864a && AbstractC3159y.d(this.f23865b, eVar.f23865b) && AbstractC3159y.d(this.f23866c, eVar.f23866c) && this.f23867d == eVar.f23867d && AbstractC3159y.d(this.f23868e, eVar.f23868e) && this.f23869f == eVar.f23869f && this.f23870g == eVar.f23870g;
    }

    public final boolean f() {
        return this.f23869f;
    }

    public int hashCode() {
        return (((((((((((this.f23864a.hashCode() * 31) + this.f23865b.hashCode()) * 31) + this.f23866c.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f23867d)) * 31) + this.f23868e.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f23869f)) * 31) + androidx.compose.foundation.a.a(this.f23870g);
    }

    public final String i() {
        return this.f23865b;
    }

    public final String j() {
        return this.f23866c;
    }

    public final boolean k() {
        return this.f23867d;
    }

    public final boolean n() {
        return n.s(this.f23865b, Locale.JAPAN.getCountry(), true);
    }

    public String toString() {
        return "Config(environment=" + this.f23864a + ", merchantCountryCode=" + this.f23865b + ", merchantName=" + this.f23866c + ", isEmailRequired=" + this.f23867d + ", billingAddressConfig=" + this.f23868e + ", existingPaymentMethodRequired=" + this.f23869f + ", allowCreditCards=" + this.f23870g + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f23864a.name());
        out.writeString(this.f23865b);
        out.writeString(this.f23866c);
        out.writeInt(this.f23867d ? 1 : 0);
        this.f23868e.writeToParcel(out, i8);
        out.writeInt(this.f23869f ? 1 : 0);
        out.writeInt(this.f23870g ? 1 : 0);
    }
}
