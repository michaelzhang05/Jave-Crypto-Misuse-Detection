package a4;

import android.os.Parcel;
import android.os.Parcelable;
import java.security.interfaces.ECPublicKey;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: a4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1627a implements Parcelable {
    public static final Parcelable.Creator<C1627a> CREATOR = new C0264a();

    /* renamed from: a, reason: collision with root package name */
    private final String f13856a;

    /* renamed from: b, reason: collision with root package name */
    private final ECPublicKey f13857b;

    /* renamed from: c, reason: collision with root package name */
    private final ECPublicKey f13858c;

    /* renamed from: a4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0264a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1627a createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new C1627a(parcel.readString(), (ECPublicKey) parcel.readSerializable(), (ECPublicKey) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1627a[] newArray(int i8) {
            return new C1627a[i8];
        }
    }

    public C1627a(String acsUrl, ECPublicKey acsEphemPubKey, ECPublicKey sdkEphemPubKey) {
        AbstractC3255y.i(acsUrl, "acsUrl");
        AbstractC3255y.i(acsEphemPubKey, "acsEphemPubKey");
        AbstractC3255y.i(sdkEphemPubKey, "sdkEphemPubKey");
        this.f13856a = acsUrl;
        this.f13857b = acsEphemPubKey;
        this.f13858c = sdkEphemPubKey;
    }

    public final String a() {
        return this.f13856a;
    }

    public final ECPublicKey b() {
        return this.f13857b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1627a)) {
            return false;
        }
        C1627a c1627a = (C1627a) obj;
        if (AbstractC3255y.d(this.f13856a, c1627a.f13856a) && AbstractC3255y.d(this.f13857b, c1627a.f13857b) && AbstractC3255y.d(this.f13858c, c1627a.f13858c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f13856a.hashCode() * 31) + this.f13857b.hashCode()) * 31) + this.f13858c.hashCode();
    }

    public String toString() {
        return "AcsData(acsUrl=" + this.f13856a + ", acsEphemPubKey=" + this.f13857b + ", sdkEphemPubKey=" + this.f13858c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f13856a);
        out.writeSerializable(this.f13857b);
        out.writeSerializable(this.f13858c);
    }
}
