package b3;

import M5.AbstractC1246t;
import M5.Q;
import M5.a0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: b3.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC1877l extends InterfaceC1863H, Parcelable {

    /* renamed from: b3.l$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC1877l {

        /* renamed from: a, reason: collision with root package name */
        private final Map f14494a;

        /* renamed from: b, reason: collision with root package name */
        private final String f14495b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f14496c;

        /* renamed from: d, reason: collision with root package name */
        public static final C0357a f14493d = new C0357a(null);
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: b3.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0357a {
            private C0357a() {
            }

            public final Map a(Map paymentMethodCreateParams) {
                Map map;
                AbstractC3159y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
                Object obj = paymentMethodCreateParams.get("card");
                if (obj instanceof Map) {
                    map = (Map) obj;
                } else {
                    map = null;
                }
                if (map == null) {
                    return null;
                }
                return Q.e(L5.x.a("card", Q.e(L5.x.a("cvc", map.get("cvc")))));
            }

            public /* synthetic */ C0357a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* renamed from: b3.l$a$b */
        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
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
            AbstractC3159y.i(cardPaymentMethodCreateParamsMap, "cardPaymentMethodCreateParamsMap");
            AbstractC3159y.i(email, "email");
            this.f14494a = cardPaymentMethodCreateParamsMap;
            this.f14495b = email;
            this.f14496c = z8;
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
            if (AbstractC3159y.d(this.f14494a, aVar.f14494a) && AbstractC3159y.d(this.f14495b, aVar.f14495b) && this.f14496c == aVar.f14496c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f14494a.hashCode() * 31) + this.f14495b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f14496c);
        }

        public String toString() {
            return "Card(cardPaymentMethodCreateParamsMap=" + this.f14494a + ", email=" + this.f14495b + ", active=" + this.f14496c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            Map map = this.f14494a;
            out.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                out.writeString((String) entry.getKey());
                out.writeValue(entry.getValue());
            }
            out.writeString(this.f14495b);
            out.writeInt(this.f14496c ? 1 : 0);
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            Map map;
            Map map2;
            Object obj;
            Map m8 = Q.m(L5.x.a("type", "card"), L5.x.a("active", Boolean.valueOf(this.f14496c)), L5.x.a("billing_email_address", this.f14495b));
            L5.r a8 = AbstractC1878m.a(this.f14494a);
            if (a8 != null) {
                m8.put(a8.c(), a8.d());
            }
            Object obj2 = this.f14494a.get("card");
            String str = null;
            if (obj2 instanceof Map) {
                map = (Map) obj2;
            } else {
                map = null;
            }
            if (map != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (AbstractC1246t.d0(a0.i("number", "exp_month", "exp_year"), entry.getKey())) {
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
    }
}
