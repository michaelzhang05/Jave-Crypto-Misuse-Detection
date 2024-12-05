package X3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f12244a;

    /* renamed from: b, reason: collision with root package name */
    private String f12245b;

    /* renamed from: c, reason: collision with root package name */
    private String f12246c;

    /* renamed from: d, reason: collision with root package name */
    private String f12247d;

    /* renamed from: e, reason: collision with root package name */
    private String f12248e;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new e(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e[] newArray(int i8) {
            return new e[i8];
        }
    }

    public e(String str, String str2, String str3, String str4, String str5) {
        this.f12244a = str;
        this.f12245b = str2;
        this.f12246c = str3;
        this.f12247d = str4;
        this.f12248e = str5;
    }

    public final String b() {
        return this.f12247d;
    }

    public final String c() {
        return this.f12245b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f12244a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3159y.d(this.f12244a, eVar.f12244a) && AbstractC3159y.d(this.f12245b, eVar.f12245b) && AbstractC3159y.d(this.f12246c, eVar.f12246c) && AbstractC3159y.d(this.f12247d, eVar.f12247d) && AbstractC3159y.d(this.f12248e, eVar.f12248e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f12244a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f12245b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f12246c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str4 = this.f12247d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.f12248e;
        if (str5 != null) {
            i8 = str5.hashCode();
        }
        return i12 + i8;
    }

    public String toString() {
        return "ChallengeParameters(threeDsServerTransactionId=" + this.f12244a + ", acsTransactionId=" + this.f12245b + ", acsRefNumber=" + this.f12246c + ", acsSignedContent=" + this.f12247d + ", threeDSRequestorAppURL=" + this.f12248e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f12244a);
        out.writeString(this.f12245b);
        out.writeString(this.f12246c);
        out.writeString(this.f12247d);
        out.writeString(this.f12248e);
    }

    public /* synthetic */ e(String str, String str2, String str3, String str4, String str5, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : str5);
    }
}
