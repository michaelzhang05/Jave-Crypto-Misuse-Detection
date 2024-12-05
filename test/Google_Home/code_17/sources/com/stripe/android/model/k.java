package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import e3.C2779C;
import e3.C2785I;
import f3.C2822E;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class k implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final C2785I f25360a;

    /* renamed from: b, reason: collision with root package name */
    private final com.stripe.android.model.a f25361b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25362c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25363d;

    /* renamed from: e, reason: collision with root package name */
    private final String f25364e;

    /* renamed from: f, reason: collision with root package name */
    private final C2779C f25365f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f25358g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f25359h = 8;
    public static final Parcelable.Creator<k> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        private final C2779C a(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("shippingAddress");
            if (optJSONObject != null) {
                String l8 = y2.e.l(optJSONObject, "address1");
                String l9 = y2.e.l(optJSONObject, "address2");
                String l10 = y2.e.l(optJSONObject, HintConstants.AUTOFILL_HINT_POSTAL_CODE);
                return new C2779C(new com.stripe.android.model.a(y2.e.l(optJSONObject, "locality"), y2.e.l(optJSONObject, "countryCode"), l8, l9, l10, y2.e.l(optJSONObject, "administrativeArea")), y2.e.l(optJSONObject, "name"), y2.e.l(optJSONObject, HintConstants.AUTOFILL_HINT_PHONE_NUMBER));
            }
            return null;
        }

        public final k b(JSONObject paymentDataJson) {
            com.stripe.android.model.a aVar;
            AbstractC3255y.i(paymentDataJson, "paymentDataJson");
            JSONObject jSONObject = paymentDataJson.getJSONObject("paymentMethodData");
            C2785I a8 = new C2822E().a(new JSONObject(jSONObject.getJSONObject("tokenizationData").getString("token")));
            JSONObject optJSONObject = jSONObject.getJSONObject("info").optJSONObject("billingAddress");
            if (optJSONObject != null) {
                aVar = new com.stripe.android.model.a(y2.e.l(optJSONObject, "locality"), y2.e.l(optJSONObject, "countryCode"), y2.e.l(optJSONObject, "address1"), y2.e.l(optJSONObject, "address2"), y2.e.l(optJSONObject, HintConstants.AUTOFILL_HINT_POSTAL_CODE), y2.e.l(optJSONObject, "administrativeArea"));
            } else {
                aVar = null;
            }
            return new k(a8, aVar, y2.e.l(optJSONObject, "name"), y2.e.l(paymentDataJson, NotificationCompat.CATEGORY_EMAIL), y2.e.l(optJSONObject, HintConstants.AUTOFILL_HINT_PHONE_NUMBER), a(paymentDataJson));
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new k((C2785I) parcel.readParcelable(k.class.getClassLoader()), parcel.readInt() == 0 ? null : com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? C2779C.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k[] newArray(int i8) {
            return new k[i8];
        }
    }

    public k(C2785I c2785i, com.stripe.android.model.a aVar, String str, String str2, String str3, C2779C c2779c) {
        this.f25360a = c2785i;
        this.f25361b = aVar;
        this.f25362c = str;
        this.f25363d = str2;
        this.f25364e = str3;
        this.f25365f = c2779c;
    }

    public final com.stripe.android.model.a a() {
        return this.f25361b;
    }

    public final String b() {
        return this.f25363d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return AbstractC3255y.d(this.f25360a, kVar.f25360a) && AbstractC3255y.d(this.f25361b, kVar.f25361b) && AbstractC3255y.d(this.f25362c, kVar.f25362c) && AbstractC3255y.d(this.f25363d, kVar.f25363d) && AbstractC3255y.d(this.f25364e, kVar.f25364e) && AbstractC3255y.d(this.f25365f, kVar.f25365f);
    }

    public final String g() {
        return this.f25362c;
    }

    public final String h() {
        return this.f25364e;
    }

    public int hashCode() {
        C2785I c2785i = this.f25360a;
        int hashCode = (c2785i == null ? 0 : c2785i.hashCode()) * 31;
        com.stripe.android.model.a aVar = this.f25361b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f25362c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25363d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25364e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C2779C c2779c = this.f25365f;
        return hashCode5 + (c2779c != null ? c2779c.hashCode() : 0);
    }

    public final C2785I i() {
        return this.f25360a;
    }

    public String toString() {
        return "GooglePayResult(token=" + this.f25360a + ", address=" + this.f25361b + ", name=" + this.f25362c + ", email=" + this.f25363d + ", phoneNumber=" + this.f25364e + ", shippingInformation=" + this.f25365f + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeParcelable(this.f25360a, i8);
        com.stripe.android.model.a aVar = this.f25361b;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
        out.writeString(this.f25362c);
        out.writeString(this.f25363d);
        out.writeString(this.f25364e);
        C2779C c2779c = this.f25365f;
        if (c2779c == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c2779c.writeToParcel(out, i8);
        }
    }
}
