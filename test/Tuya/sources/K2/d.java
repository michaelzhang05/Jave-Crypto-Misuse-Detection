package K2;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: h, reason: collision with root package name */
    public static final int f5890h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final StripeIntent f5891a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5892b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5893c;

    /* renamed from: d, reason: collision with root package name */
    private final b f5894d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f5895e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f5896f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f5897g;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            boolean z8;
            boolean z9;
            AbstractC3159y.i(parcel, "parcel");
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
        private final String f5898a;

        /* renamed from: b, reason: collision with root package name */
        private final String f5899b;

        /* renamed from: c, reason: collision with root package name */
        private final String f5900c;

        /* renamed from: d, reason: collision with root package name */
        private final String f5901d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String str, String str2, String str3, String str4) {
            this.f5898a = str;
            this.f5899b = str2;
            this.f5900c = str3;
            this.f5901d = str4;
        }

        public final String b() {
            return this.f5901d;
        }

        public final String c() {
            return this.f5899b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f5898a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3159y.d(this.f5898a, bVar.f5898a) && AbstractC3159y.d(this.f5899b, bVar.f5899b) && AbstractC3159y.d(this.f5900c, bVar.f5900c) && AbstractC3159y.d(this.f5901d, bVar.f5901d)) {
                return true;
            }
            return false;
        }

        public final String f() {
            return this.f5900c;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            String str = this.f5898a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            String str2 = this.f5899b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f5900c;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            String str4 = this.f5901d;
            if (str4 != null) {
                i8 = str4.hashCode();
            }
            return i11 + i8;
        }

        public String toString() {
            return "CustomerInfo(name=" + this.f5898a + ", email=" + this.f5899b + ", phone=" + this.f5900c + ", billingCountryCode=" + this.f5901d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f5898a);
            out.writeString(this.f5899b);
            out.writeString(this.f5900c);
            out.writeString(this.f5901d);
        }
    }

    public d(StripeIntent stripeIntent, String merchantName, String str, b customerInfo, Map map, boolean z8, Map flags) {
        AbstractC3159y.i(stripeIntent, "stripeIntent");
        AbstractC3159y.i(merchantName, "merchantName");
        AbstractC3159y.i(customerInfo, "customerInfo");
        AbstractC3159y.i(flags, "flags");
        this.f5891a = stripeIntent;
        this.f5892b = merchantName;
        this.f5893c = str;
        this.f5894d = customerInfo;
        this.f5895e = map;
        this.f5896f = z8;
        this.f5897g = flags;
    }

    public final b b() {
        return this.f5894d;
    }

    public final Map c() {
        return this.f5897g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f5893c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3159y.d(this.f5891a, dVar.f5891a) && AbstractC3159y.d(this.f5892b, dVar.f5892b) && AbstractC3159y.d(this.f5893c, dVar.f5893c) && AbstractC3159y.d(this.f5894d, dVar.f5894d) && AbstractC3159y.d(this.f5895e, dVar.f5895e) && this.f5896f == dVar.f5896f && AbstractC3159y.d(this.f5897g, dVar.f5897g)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f5892b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f5891a.hashCode() * 31) + this.f5892b.hashCode()) * 31;
        String str = this.f5893c;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 + hashCode) * 31) + this.f5894d.hashCode()) * 31;
        Map map = this.f5895e;
        if (map != null) {
            i8 = map.hashCode();
        }
        return ((((hashCode3 + i8) * 31) + androidx.compose.foundation.a.a(this.f5896f)) * 31) + this.f5897g.hashCode();
    }

    public final boolean i() {
        return this.f5896f;
    }

    public final StripeIntent j() {
        return this.f5891a;
    }

    public String toString() {
        return "LinkConfiguration(stripeIntent=" + this.f5891a + ", merchantName=" + this.f5892b + ", merchantCountryCode=" + this.f5893c + ", customerInfo=" + this.f5894d + ", shippingValues=" + this.f5895e + ", passthroughModeEnabled=" + this.f5896f + ", flags=" + this.f5897g + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeParcelable(this.f5891a, i8);
        out.writeString(this.f5892b);
        out.writeString(this.f5893c);
        this.f5894d.writeToParcel(out, i8);
        Map map = this.f5895e;
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
        out.writeInt(this.f5896f ? 1 : 0);
        Map map2 = this.f5897g;
        out.writeInt(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            out.writeString((String) entry2.getKey());
            out.writeInt(((Boolean) entry2.getValue()).booleanValue() ? 1 : 0);
        }
    }
}
