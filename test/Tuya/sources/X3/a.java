package X3;

import android.os.Parcel;
import android.os.Parcelable;
import java.security.interfaces.ECPublicKey;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0237a();

    /* renamed from: a, reason: collision with root package name */
    private final String f12235a;

    /* renamed from: b, reason: collision with root package name */
    private final ECPublicKey f12236b;

    /* renamed from: c, reason: collision with root package name */
    private final ECPublicKey f12237c;

    /* renamed from: X3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0237a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new a(parcel.readString(), (ECPublicKey) parcel.readSerializable(), (ECPublicKey) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(String acsUrl, ECPublicKey acsEphemPubKey, ECPublicKey sdkEphemPubKey) {
        AbstractC3159y.i(acsUrl, "acsUrl");
        AbstractC3159y.i(acsEphemPubKey, "acsEphemPubKey");
        AbstractC3159y.i(sdkEphemPubKey, "sdkEphemPubKey");
        this.f12235a = acsUrl;
        this.f12236b = acsEphemPubKey;
        this.f12237c = sdkEphemPubKey;
    }

    public final String b() {
        return this.f12235a;
    }

    public final ECPublicKey c() {
        return this.f12236b;
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
        if (AbstractC3159y.d(this.f12235a, aVar.f12235a) && AbstractC3159y.d(this.f12236b, aVar.f12236b) && AbstractC3159y.d(this.f12237c, aVar.f12237c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f12235a.hashCode() * 31) + this.f12236b.hashCode()) * 31) + this.f12237c.hashCode();
    }

    public String toString() {
        return "AcsData(acsUrl=" + this.f12235a + ", acsEphemPubKey=" + this.f12236b + ", sdkEphemPubKey=" + this.f12237c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f12235a);
        out.writeSerializable(this.f12236b);
        out.writeSerializable(this.f12237c);
    }
}
