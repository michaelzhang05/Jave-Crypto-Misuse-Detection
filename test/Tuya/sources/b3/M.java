package b3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class M implements v2.f {
    public static final Parcelable.Creator<M> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f14386a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14387b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14388c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14389d;

    /* renamed from: e, reason: collision with root package name */
    private final String f14390e;

    /* renamed from: f, reason: collision with root package name */
    private final String f14391f;

    /* renamed from: g, reason: collision with root package name */
    private final String f14392g;

    /* renamed from: h, reason: collision with root package name */
    private final String f14393h;

    /* renamed from: i, reason: collision with root package name */
    private final String f14394i;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new M(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final M[] newArray(int i8) {
            return new M[i8];
        }
    }

    public M(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f14386a = str;
        this.f14387b = str2;
        this.f14388c = str3;
        this.f14389d = str4;
        this.f14390e = str5;
        this.f14391f = str6;
        this.f14392g = str7;
        this.f14393h = str8;
        this.f14394i = str9;
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
        if (AbstractC3159y.d(this.f14386a, m8.f14386a) && AbstractC3159y.d(this.f14387b, m8.f14387b) && AbstractC3159y.d(this.f14388c, m8.f14388c) && AbstractC3159y.d(this.f14389d, m8.f14389d) && AbstractC3159y.d(this.f14390e, m8.f14390e) && AbstractC3159y.d(this.f14391f, m8.f14391f) && AbstractC3159y.d(this.f14392g, m8.f14392g) && AbstractC3159y.d(this.f14393h, m8.f14393h) && AbstractC3159y.d(this.f14394i, m8.f14394i)) {
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
        String str = this.f14386a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f14387b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f14388c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str4 = this.f14389d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.f14390e;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str6 = this.f14391f;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str7 = this.f14392g;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        String str8 = this.f14393h;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        String str9 = this.f14394i;
        if (str9 != null) {
            i8 = str9.hashCode();
        }
        return i16 + i8;
    }

    public String toString() {
        return "WeChat(statementDescriptor=" + this.f14386a + ", appId=" + this.f14387b + ", nonce=" + this.f14388c + ", packageValue=" + this.f14389d + ", partnerId=" + this.f14390e + ", prepayId=" + this.f14391f + ", sign=" + this.f14392g + ", timestamp=" + this.f14393h + ", qrCodeUrl=" + this.f14394i + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f14386a);
        out.writeString(this.f14387b);
        out.writeString(this.f14388c);
        out.writeString(this.f14389d);
        out.writeString(this.f14390e);
        out.writeString(this.f14391f);
        out.writeString(this.f14392g);
        out.writeString(this.f14393h);
        out.writeString(this.f14394i);
    }

    public /* synthetic */ M(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? null : str, str2, str3, str4, str5, str6, str7, str8, (i8 & 256) != 0 ? null : str9);
    }
}
