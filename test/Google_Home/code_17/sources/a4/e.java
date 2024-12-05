package a4;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f13865a;

    /* renamed from: b, reason: collision with root package name */
    private String f13866b;

    /* renamed from: c, reason: collision with root package name */
    private String f13867c;

    /* renamed from: d, reason: collision with root package name */
    private String f13868d;

    /* renamed from: e, reason: collision with root package name */
    private String f13869e;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new e(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e[] newArray(int i8) {
            return new e[i8];
        }
    }

    public e(String str, String str2, String str3, String str4, String str5) {
        this.f13865a = str;
        this.f13866b = str2;
        this.f13867c = str3;
        this.f13868d = str4;
        this.f13869e = str5;
    }

    public final String a() {
        return this.f13868d;
    }

    public final String b() {
        return this.f13866b;
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
        if (AbstractC3255y.d(this.f13865a, eVar.f13865a) && AbstractC3255y.d(this.f13866b, eVar.f13866b) && AbstractC3255y.d(this.f13867c, eVar.f13867c) && AbstractC3255y.d(this.f13868d, eVar.f13868d) && AbstractC3255y.d(this.f13869e, eVar.f13869e)) {
            return true;
        }
        return false;
    }

    public final String g() {
        return this.f13865a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f13865a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f13866b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f13867c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str4 = this.f13868d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.f13869e;
        if (str5 != null) {
            i8 = str5.hashCode();
        }
        return i12 + i8;
    }

    public String toString() {
        return "ChallengeParameters(threeDsServerTransactionId=" + this.f13865a + ", acsTransactionId=" + this.f13866b + ", acsRefNumber=" + this.f13867c + ", acsSignedContent=" + this.f13868d + ", threeDSRequestorAppURL=" + this.f13869e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f13865a);
        out.writeString(this.f13866b);
        out.writeString(this.f13867c);
        out.writeString(this.f13868d);
        out.writeString(this.f13869e);
    }

    public /* synthetic */ e(String str, String str2, String str3, String str4, String str5, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : str5);
    }
}
