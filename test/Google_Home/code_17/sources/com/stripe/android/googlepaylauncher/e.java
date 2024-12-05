package com.stripe.android.googlepaylauncher;

import android.os.Parcel;
import android.os.Parcelable;
import j6.n;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final L2.d f24919a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24920b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24921c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f24922d;

    /* renamed from: e, reason: collision with root package name */
    private d f24923e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f24924f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f24925g;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new e(L2.d.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, d.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e[] newArray(int i8) {
            return new e[i8];
        }
    }

    public e(L2.d environment, String merchantCountryCode, String merchantName, boolean z8, d billingAddressConfig, boolean z9, boolean z10) {
        AbstractC3255y.i(environment, "environment");
        AbstractC3255y.i(merchantCountryCode, "merchantCountryCode");
        AbstractC3255y.i(merchantName, "merchantName");
        AbstractC3255y.i(billingAddressConfig, "billingAddressConfig");
        this.f24919a = environment;
        this.f24920b = merchantCountryCode;
        this.f24921c = merchantName;
        this.f24922d = z8;
        this.f24923e = billingAddressConfig;
        this.f24924f = z9;
        this.f24925g = z10;
    }

    public final boolean a() {
        return this.f24925g;
    }

    public final d b() {
        return this.f24923e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f24919a == eVar.f24919a && AbstractC3255y.d(this.f24920b, eVar.f24920b) && AbstractC3255y.d(this.f24921c, eVar.f24921c) && this.f24922d == eVar.f24922d && AbstractC3255y.d(this.f24923e, eVar.f24923e) && this.f24924f == eVar.f24924f && this.f24925g == eVar.f24925g;
    }

    public final L2.d g() {
        return this.f24919a;
    }

    public final boolean h() {
        return this.f24924f;
    }

    public int hashCode() {
        return (((((((((((this.f24919a.hashCode() * 31) + this.f24920b.hashCode()) * 31) + this.f24921c.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f24922d)) * 31) + this.f24923e.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f24924f)) * 31) + androidx.compose.foundation.a.a(this.f24925g);
    }

    public final String i() {
        return this.f24920b;
    }

    public final String l() {
        return this.f24921c;
    }

    public final boolean p() {
        return this.f24922d;
    }

    public final boolean s() {
        return n.s(this.f24920b, Locale.JAPAN.getCountry(), true);
    }

    public String toString() {
        return "Config(environment=" + this.f24919a + ", merchantCountryCode=" + this.f24920b + ", merchantName=" + this.f24921c + ", isEmailRequired=" + this.f24922d + ", billingAddressConfig=" + this.f24923e + ", existingPaymentMethodRequired=" + this.f24924f + ", allowCreditCards=" + this.f24925g + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f24919a.name());
        out.writeString(this.f24920b);
        out.writeString(this.f24921c);
        out.writeInt(this.f24922d ? 1 : 0);
        this.f24923e.writeToParcel(out, i8);
        out.writeInt(this.f24924f ? 1 : 0);
        out.writeInt(this.f24925g ? 1 : 0);
    }
}
