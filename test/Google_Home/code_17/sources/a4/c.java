package a4;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f13859a;

    /* renamed from: b, reason: collision with root package name */
    private final q f13860b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13861c;

    /* renamed from: d, reason: collision with root package name */
    private final String f13862d;

    /* renamed from: e, reason: collision with root package name */
    private final String f13863e;

    /* renamed from: f, reason: collision with root package name */
    private final String f13864f;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new c(parcel.readString(), q.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i8) {
            return new c[i8];
        }
    }

    public c(String deviceData, q sdkTransactionId, String sdkAppId, String sdkReferenceNumber, String sdkEphemeralPublicKey, String messageVersion) {
        AbstractC3255y.i(deviceData, "deviceData");
        AbstractC3255y.i(sdkTransactionId, "sdkTransactionId");
        AbstractC3255y.i(sdkAppId, "sdkAppId");
        AbstractC3255y.i(sdkReferenceNumber, "sdkReferenceNumber");
        AbstractC3255y.i(sdkEphemeralPublicKey, "sdkEphemeralPublicKey");
        AbstractC3255y.i(messageVersion, "messageVersion");
        this.f13859a = deviceData;
        this.f13860b = sdkTransactionId;
        this.f13861c = sdkAppId;
        this.f13862d = sdkReferenceNumber;
        this.f13863e = sdkEphemeralPublicKey;
        this.f13864f = messageVersion;
    }

    public final String a() {
        return this.f13859a;
    }

    public final String b() {
        return this.f13864f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3255y.d(this.f13859a, cVar.f13859a) && AbstractC3255y.d(this.f13860b, cVar.f13860b) && AbstractC3255y.d(this.f13861c, cVar.f13861c) && AbstractC3255y.d(this.f13862d, cVar.f13862d) && AbstractC3255y.d(this.f13863e, cVar.f13863e) && AbstractC3255y.d(this.f13864f, cVar.f13864f)) {
            return true;
        }
        return false;
    }

    public final String g() {
        return this.f13861c;
    }

    public final String h() {
        return this.f13863e;
    }

    public int hashCode() {
        return (((((((((this.f13859a.hashCode() * 31) + this.f13860b.hashCode()) * 31) + this.f13861c.hashCode()) * 31) + this.f13862d.hashCode()) * 31) + this.f13863e.hashCode()) * 31) + this.f13864f.hashCode();
    }

    public final String i() {
        return this.f13862d;
    }

    public final q l() {
        return this.f13860b;
    }

    public String toString() {
        return "AuthenticationRequestParameters(deviceData=" + this.f13859a + ", sdkTransactionId=" + this.f13860b + ", sdkAppId=" + this.f13861c + ", sdkReferenceNumber=" + this.f13862d + ", sdkEphemeralPublicKey=" + this.f13863e + ", messageVersion=" + this.f13864f + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f13859a);
        this.f13860b.writeToParcel(out, i8);
        out.writeString(this.f13861c);
        out.writeString(this.f13862d);
        out.writeString(this.f13863e);
        out.writeString(this.f13864f);
    }
}
