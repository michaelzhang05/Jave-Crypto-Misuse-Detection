package e3;

import P5.AbstractC1378t;
import P5.Q;
import P5.a0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: e3.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC2798l extends InterfaceC2784H, Parcelable {

    /* renamed from: e3.l$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC2798l {

        /* renamed from: a, reason: collision with root package name */
        private final Map f31500a;

        /* renamed from: b, reason: collision with root package name */
        private final String f31501b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f31502c;

        /* renamed from: d, reason: collision with root package name */
        public static final C0725a f31499d = new C0725a(null);
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: e3.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0725a {
            private C0725a() {
            }

            public final Map a(Map paymentMethodCreateParams) {
                Map map;
                AbstractC3255y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
                Object obj = paymentMethodCreateParams.get("card");
                if (obj instanceof Map) {
                    map = (Map) obj;
                } else {
                    map = null;
                }
                if (map == null) {
                    return null;
                }
                return Q.e(O5.x.a("card", Q.e(O5.x.a("cvc", map.get("cvc")))));
            }

            public /* synthetic */ C0725a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* renamed from: e3.l$a$b */
        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                boolean z8 = false;
                for (int i8 = 0; i8 != readInt; i8++) {
                    linkedHashMap.put(parcel.readString(), parcel.readValue(a.class.getClassLoader()));
                }
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    z8 = true;
                }
                return new a(linkedHashMap, readString, z8);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(Map cardPaymentMethodCreateParamsMap, String email, boolean z8) {
            AbstractC3255y.i(cardPaymentMethodCreateParamsMap, "cardPaymentMethodCreateParamsMap");
            AbstractC3255y.i(email, "email");
            this.f31500a = cardPaymentMethodCreateParamsMap;
            this.f31501b = email;
            this.f31502c = z8;
        }

        @Override // e3.InterfaceC2784H
        public Map B() {
            Map map;
            Map map2;
            Object obj;
            Map m8 = Q.m(O5.x.a("type", "card"), O5.x.a("active", Boolean.valueOf(this.f31502c)), O5.x.a("billing_email_address", this.f31501b));
            O5.r a8 = AbstractC2799m.a(this.f31500a);
            if (a8 != null) {
                m8.put(a8.c(), a8.d());
            }
            Object obj2 = this.f31500a.get("card");
            String str = null;
            if (obj2 instanceof Map) {
                map = (Map) obj2;
            } else {
                map = null;
            }
            if (map != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (AbstractC1378t.d0(a0.i("number", "exp_month", "exp_year"), entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Map B8 = Q.B(linkedHashMap);
                Object obj3 = map.get("networks");
                if (obj3 instanceof Map) {
                    map2 = (Map) obj3;
                } else {
                    map2 = null;
                }
                if (map2 != null) {
                    obj = map2.get("preferred");
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str = (String) obj;
                }
                if (str != null) {
                    B8.put("preferred_network", str);
                }
                m8.put("card", Q.y(B8));
            }
            return m8;
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
            if (AbstractC3255y.d(this.f31500a, aVar.f31500a) && AbstractC3255y.d(this.f31501b, aVar.f31501b) && this.f31502c == aVar.f31502c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f31500a.hashCode() * 31) + this.f31501b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f31502c);
        }

        public String toString() {
            return "Card(cardPaymentMethodCreateParamsMap=" + this.f31500a + ", email=" + this.f31501b + ", active=" + this.f31502c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            Map map = this.f31500a;
            out.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                out.writeString((String) entry.getKey());
                out.writeValue(entry.getValue());
            }
            out.writeString(this.f31501b);
            out.writeInt(this.f31502c ? 1 : 0);
        }
    }
}
