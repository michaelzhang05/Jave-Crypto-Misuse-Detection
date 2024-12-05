package N2;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: h, reason: collision with root package name */
    public static final int f7669h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final StripeIntent f7670a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7671b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7672c;

    /* renamed from: d, reason: collision with root package name */
    private final b f7673d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f7674e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f7675f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f7676g;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            boolean z8;
            boolean z9;
            AbstractC3255y.i(parcel, "parcel");
            StripeIntent stripeIntent = (StripeIntent) parcel.readParcelable(d.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            b createFromParcel = b.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    linkedHashMap.put(parcel.readParcelable(d.class.getClassLoader()), parcel.readString());
                }
            }
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
            for (int i9 = 0; i9 != readInt2; i9++) {
                String readString3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                linkedHashMap2.put(readString3, Boolean.valueOf(z9));
            }
            return new d(stripeIntent, readString, readString2, createFromParcel, linkedHashMap, z8, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d[] newArray(int i8) {
            return new d[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f7677a;

        /* renamed from: b, reason: collision with root package name */
        private final String f7678b;

        /* renamed from: c, reason: collision with root package name */
        private final String f7679c;

        /* renamed from: d, reason: collision with root package name */
        private final String f7680d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String str, String str2, String str3, String str4) {
            this.f7677a = str;
            this.f7678b = str2;
            this.f7679c = str3;
            this.f7680d = str4;
        }

        public final String a() {
            return this.f7680d;
        }

        public final String b() {
            return this.f7678b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3255y.d(this.f7677a, bVar.f7677a) && AbstractC3255y.d(this.f7678b, bVar.f7678b) && AbstractC3255y.d(this.f7679c, bVar.f7679c) && AbstractC3255y.d(this.f7680d, bVar.f7680d)) {
                return true;
            }
            return false;
        }

        public final String g() {
            return this.f7677a;
        }

        public final String h() {
            return this.f7679c;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            String str = this.f7677a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            String str2 = this.f7678b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f7679c;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            String str4 = this.f7680d;
            if (str4 != null) {
                i8 = str4.hashCode();
            }
            return i11 + i8;
        }

        public String toString() {
            return "CustomerInfo(name=" + this.f7677a + ", email=" + this.f7678b + ", phone=" + this.f7679c + ", billingCountryCode=" + this.f7680d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f7677a);
            out.writeString(this.f7678b);
            out.writeString(this.f7679c);
            out.writeString(this.f7680d);
        }
    }

    public d(StripeIntent stripeIntent, String merchantName, String str, b customerInfo, Map map, boolean z8, Map flags) {
        AbstractC3255y.i(stripeIntent, "stripeIntent");
        AbstractC3255y.i(merchantName, "merchantName");
        AbstractC3255y.i(customerInfo, "customerInfo");
        AbstractC3255y.i(flags, "flags");
        this.f7670a = stripeIntent;
        this.f7671b = merchantName;
        this.f7672c = str;
        this.f7673d = customerInfo;
        this.f7674e = map;
        this.f7675f = z8;
        this.f7676g = flags;
    }

    public final b a() {
        return this.f7673d;
    }

    public final Map b() {
        return this.f7676g;
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
        if (AbstractC3255y.d(this.f7670a, dVar.f7670a) && AbstractC3255y.d(this.f7671b, dVar.f7671b) && AbstractC3255y.d(this.f7672c, dVar.f7672c) && AbstractC3255y.d(this.f7673d, dVar.f7673d) && AbstractC3255y.d(this.f7674e, dVar.f7674e) && this.f7675f == dVar.f7675f && AbstractC3255y.d(this.f7676g, dVar.f7676g)) {
            return true;
        }
        return false;
    }

    public final String g() {
        return this.f7672c;
    }

    public final String h() {
        return this.f7671b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f7670a.hashCode() * 31) + this.f7671b.hashCode()) * 31;
        String str = this.f7672c;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 + hashCode) * 31) + this.f7673d.hashCode()) * 31;
        Map map = this.f7674e;
        if (map != null) {
            i8 = map.hashCode();
        }
        return ((((hashCode3 + i8) * 31) + androidx.compose.foundation.a.a(this.f7675f)) * 31) + this.f7676g.hashCode();
    }

    public final boolean i() {
        return this.f7675f;
    }

    public final StripeIntent l() {
        return this.f7670a;
    }

    public String toString() {
        return "LinkConfiguration(stripeIntent=" + this.f7670a + ", merchantName=" + this.f7671b + ", merchantCountryCode=" + this.f7672c + ", customerInfo=" + this.f7673d + ", shippingValues=" + this.f7674e + ", passthroughModeEnabled=" + this.f7675f + ", flags=" + this.f7676g + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeParcelable(this.f7670a, i8);
        out.writeString(this.f7671b);
        out.writeString(this.f7672c);
        this.f7673d.writeToParcel(out, i8);
        Map map = this.f7674e;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                out.writeParcelable((Parcelable) entry.getKey(), i8);
                out.writeString((String) entry.getValue());
            }
        }
        out.writeInt(this.f7675f ? 1 : 0);
        Map map2 = this.f7676g;
        out.writeInt(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            out.writeString((String) entry2.getKey());
            out.writeInt(((Boolean) entry2.getValue()).booleanValue() ? 1 : 0);
        }
    }
}
