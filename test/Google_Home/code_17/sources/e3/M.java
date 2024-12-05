package e3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class M implements y2.f {
    public static final Parcelable.Creator<M> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f31392a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31393b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31394c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31395d;

    /* renamed from: e, reason: collision with root package name */
    private final String f31396e;

    /* renamed from: f, reason: collision with root package name */
    private final String f31397f;

    /* renamed from: g, reason: collision with root package name */
    private final String f31398g;

    /* renamed from: h, reason: collision with root package name */
    private final String f31399h;

    /* renamed from: i, reason: collision with root package name */
    private final String f31400i;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new M(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final M[] newArray(int i8) {
            return new M[i8];
        }
    }

    public M(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f31392a = str;
        this.f31393b = str2;
        this.f31394c = str3;
        this.f31395d = str4;
        this.f31396e = str5;
        this.f31397f = str6;
        this.f31398g = str7;
        this.f31399h = str8;
        this.f31400i = str9;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m8 = (M) obj;
        if (AbstractC3255y.d(this.f31392a, m8.f31392a) && AbstractC3255y.d(this.f31393b, m8.f31393b) && AbstractC3255y.d(this.f31394c, m8.f31394c) && AbstractC3255y.d(this.f31395d, m8.f31395d) && AbstractC3255y.d(this.f31396e, m8.f31396e) && AbstractC3255y.d(this.f31397f, m8.f31397f) && AbstractC3255y.d(this.f31398g, m8.f31398g) && AbstractC3255y.d(this.f31399h, m8.f31399h) && AbstractC3255y.d(this.f31400i, m8.f31400i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        String str = this.f31392a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f31393b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f31394c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str4 = this.f31395d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.f31396e;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str6 = this.f31397f;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str7 = this.f31398g;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        String str8 = this.f31399h;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        String str9 = this.f31400i;
        if (str9 != null) {
            i8 = str9.hashCode();
        }
        return i16 + i8;
    }

    public String toString() {
        return "WeChat(statementDescriptor=" + this.f31392a + ", appId=" + this.f31393b + ", nonce=" + this.f31394c + ", packageValue=" + this.f31395d + ", partnerId=" + this.f31396e + ", prepayId=" + this.f31397f + ", sign=" + this.f31398g + ", timestamp=" + this.f31399h + ", qrCodeUrl=" + this.f31400i + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f31392a);
        out.writeString(this.f31393b);
        out.writeString(this.f31394c);
        out.writeString(this.f31395d);
        out.writeString(this.f31396e);
        out.writeString(this.f31397f);
        out.writeString(this.f31398g);
        out.writeString(this.f31399h);
        out.writeString(this.f31400i);
    }

    public /* synthetic */ M(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? null : str, str2, str3, str4, str5, str6, str7, str8, (i8 & 256) != 0 ? null : str9);
    }
}
