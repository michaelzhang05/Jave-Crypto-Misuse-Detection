package X3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f12238a;

    /* renamed from: b, reason: collision with root package name */
    private final q f12239b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12240c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12241d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12242e;

    /* renamed from: f, reason: collision with root package name */
    private final String f12243f;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new c(parcel.readString(), q.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i8) {
            return new c[i8];
        }
    }

    public c(String deviceData, q sdkTransactionId, String sdkAppId, String sdkReferenceNumber, String sdkEphemeralPublicKey, String messageVersion) {
        AbstractC3159y.i(deviceData, "deviceData");
        AbstractC3159y.i(sdkTransactionId, "sdkTransactionId");
        AbstractC3159y.i(sdkAppId, "sdkAppId");
        AbstractC3159y.i(sdkReferenceNumber, "sdkReferenceNumber");
        AbstractC3159y.i(sdkEphemeralPublicKey, "sdkEphemeralPublicKey");
        AbstractC3159y.i(messageVersion, "messageVersion");
        this.f12238a = deviceData;
        this.f12239b = sdkTransactionId;
        this.f12240c = sdkAppId;
        this.f12241d = sdkReferenceNumber;
        this.f12242e = sdkEphemeralPublicKey;
        this.f12243f = messageVersion;
    }

    public final String b() {
        return this.f12238a;
    }

    public final String c() {
        return this.f12243f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f12240c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3159y.d(this.f12238a, cVar.f12238a) && AbstractC3159y.d(this.f12239b, cVar.f12239b) && AbstractC3159y.d(this.f12240c, cVar.f12240c) && AbstractC3159y.d(this.f12241d, cVar.f12241d) && AbstractC3159y.d(this.f12242e, cVar.f12242e) && AbstractC3159y.d(this.f12243f, cVar.f12243f)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f12242e;
    }

    public int hashCode() {
        return (((((((((this.f12238a.hashCode() * 31) + this.f12239b.hashCode()) * 31) + this.f12240c.hashCode()) * 31) + this.f12241d.hashCode()) * 31) + this.f12242e.hashCode()) * 31) + this.f12243f.hashCode();
    }

    public final String i() {
        return this.f12241d;
    }

    public final q j() {
        return this.f12239b;
    }

    public String toString() {
        return "AuthenticationRequestParameters(deviceData=" + this.f12238a + ", sdkTransactionId=" + this.f12239b + ", sdkAppId=" + this.f12240c + ", sdkReferenceNumber=" + this.f12241d + ", sdkEphemeralPublicKey=" + this.f12242e + ", messageVersion=" + this.f12243f + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f12238a);
        this.f12239b.writeToParcel(out, i8);
        out.writeString(this.f12240c);
        out.writeString(this.f12241d);
        out.writeString(this.f12242e);
        out.writeString(this.f12243f);
    }
}
