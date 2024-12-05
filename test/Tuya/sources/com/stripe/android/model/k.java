package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import b3.C1858C;
import b3.C1864I;
import c3.C1912E;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class k implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final C1864I f24305a;

    /* renamed from: b, reason: collision with root package name */
    private final com.stripe.android.model.a f24306b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24307c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24308d;

    /* renamed from: e, reason: collision with root package name */
    private final String f24309e;

    /* renamed from: f, reason: collision with root package name */
    private final C1858C f24310f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f24303g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f24304h = 8;
    public static final Parcelable.Creator<k> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        private final C1858C a(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("shippingAddress");
            if (optJSONObject != null) {
                String l8 = v2.e.l(optJSONObject, "address1");
                String l9 = v2.e.l(optJSONObject, "address2");
                String l10 = v2.e.l(optJSONObject, HintConstants.AUTOFILL_HINT_POSTAL_CODE);
                return new C1858C(new com.stripe.android.model.a(v2.e.l(optJSONObject, "locality"), v2.e.l(optJSONObject, "countryCode"), l8, l9, l10, v2.e.l(optJSONObject, "administrativeArea")), v2.e.l(optJSONObject, "name"), v2.e.l(optJSONObject, HintConstants.AUTOFILL_HINT_PHONE_NUMBER));
            }
            return null;
        }

        public final k b(JSONObject paymentDataJson) {
            com.stripe.android.model.a aVar;
            AbstractC3159y.i(paymentDataJson, "paymentDataJson");
            JSONObject jSONObject = paymentDataJson.getJSONObject("paymentMethodData");
            C1864I a8 = new C1912E().a(new JSONObject(jSONObject.getJSONObject("tokenizationData").getString("token")));
            JSONObject optJSONObject = jSONObject.getJSONObject("info").optJSONObject("billingAddress");
            if (optJSONObject != null) {
                aVar = new com.stripe.android.model.a(v2.e.l(optJSONObject, "locality"), v2.e.l(optJSONObject, "countryCode"), v2.e.l(optJSONObject, "address1"), v2.e.l(optJSONObject, "address2"), v2.e.l(optJSONObject, HintConstants.AUTOFILL_HINT_POSTAL_CODE), v2.e.l(optJSONObject, "administrativeArea"));
            } else {
                aVar = null;
            }
            return new k(a8, aVar, v2.e.l(optJSONObject, "name"), v2.e.l(paymentDataJson, NotificationCompat.CATEGORY_EMAIL), v2.e.l(optJSONObject, HintConstants.AUTOFILL_HINT_PHONE_NUMBER), a(paymentDataJson));
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new k((C1864I) parcel.readParcelable(k.class.getClassLoader()), parcel.readInt() == 0 ? null : com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? C1858C.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k[] newArray(int i8) {
            return new k[i8];
        }
    }

    public k(C1864I c1864i, com.stripe.android.model.a aVar, String str, String str2, String str3, C1858C c1858c) {
        this.f24305a = c1864i;
        this.f24306b = aVar;
        this.f24307c = str;
        this.f24308d = str2;
        this.f24309e = str3;
        this.f24310f = c1858c;
    }

    public final com.stripe.android.model.a b() {
        return this.f24306b;
    }

    public final String c() {
        return this.f24308d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f24307c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return AbstractC3159y.d(this.f24305a, kVar.f24305a) && AbstractC3159y.d(this.f24306b, kVar.f24306b) && AbstractC3159y.d(this.f24307c, kVar.f24307c) && AbstractC3159y.d(this.f24308d, kVar.f24308d) && AbstractC3159y.d(this.f24309e, kVar.f24309e) && AbstractC3159y.d(this.f24310f, kVar.f24310f);
    }

    public final String f() {
        return this.f24309e;
    }

    public int hashCode() {
        C1864I c1864i = this.f24305a;
        int hashCode = (c1864i == null ? 0 : c1864i.hashCode()) * 31;
        com.stripe.android.model.a aVar = this.f24306b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f24307c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24308d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f24309e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C1858C c1858c = this.f24310f;
        return hashCode5 + (c1858c != null ? c1858c.hashCode() : 0);
    }

    public final C1864I i() {
        return this.f24305a;
    }

    public String toString() {
        return "GooglePayResult(token=" + this.f24305a + ", address=" + this.f24306b + ", name=" + this.f24307c + ", email=" + this.f24308d + ", phoneNumber=" + this.f24309e + ", shippingInformation=" + this.f24310f + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeParcelable(this.f24305a, i8);
        com.stripe.android.model.a aVar = this.f24306b;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
        out.writeString(this.f24307c);
        out.writeString(this.f24308d);
        out.writeString(this.f24309e);
        C1858C c1858c = this.f24310f;
        if (c1858c == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c1858c.writeToParcel(out, i8);
        }
    }
}
