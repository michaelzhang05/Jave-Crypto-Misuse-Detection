package a4;

import android.os.Parcel;
import android.os.Parcelable;
import java.security.KeyPair;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f13909a;

    /* renamed from: b, reason: collision with root package name */
    private final KeyPair f13910b;

    /* renamed from: c, reason: collision with root package name */
    private final e f13911c;

    /* renamed from: d, reason: collision with root package name */
    private final int f13912d;

    /* renamed from: e, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.n f13913e;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new m(parcel.readString(), (KeyPair) parcel.readSerializable(), e.CREATOR.createFromParcel(parcel), parcel.readInt(), com.stripe.android.stripe3ds2.transaction.n.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m[] newArray(int i8) {
            return new m[i8];
        }
    }

    public m(String sdkReferenceNumber, KeyPair sdkKeyPair, e challengeParameters, int i8, com.stripe.android.stripe3ds2.transaction.n intentData) {
        AbstractC3255y.i(sdkReferenceNumber, "sdkReferenceNumber");
        AbstractC3255y.i(sdkKeyPair, "sdkKeyPair");
        AbstractC3255y.i(challengeParameters, "challengeParameters");
        AbstractC3255y.i(intentData, "intentData");
        this.f13909a = sdkReferenceNumber;
        this.f13910b = sdkKeyPair;
        this.f13911c = challengeParameters;
        this.f13912d = i8;
        this.f13913e = intentData;
    }

    public final e a() {
        return this.f13911c;
    }

    public final com.stripe.android.stripe3ds2.transaction.n b() {
        return this.f13913e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (AbstractC3255y.d(this.f13909a, mVar.f13909a) && AbstractC3255y.d(this.f13910b, mVar.f13910b) && AbstractC3255y.d(this.f13911c, mVar.f13911c) && this.f13912d == mVar.f13912d && AbstractC3255y.d(this.f13913e, mVar.f13913e)) {
            return true;
        }
        return false;
    }

    public final KeyPair g() {
        return this.f13910b;
    }

    public final String h() {
        return this.f13909a;
    }

    public int hashCode() {
        return (((((((this.f13909a.hashCode() * 31) + this.f13910b.hashCode()) * 31) + this.f13911c.hashCode()) * 31) + this.f13912d) * 31) + this.f13913e.hashCode();
    }

    public final int i() {
        return this.f13912d;
    }

    public String toString() {
        return "InitChallengeArgs(sdkReferenceNumber=" + this.f13909a + ", sdkKeyPair=" + this.f13910b + ", challengeParameters=" + this.f13911c + ", timeoutMins=" + this.f13912d + ", intentData=" + this.f13913e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f13909a);
        out.writeSerializable(this.f13910b);
        this.f13911c.writeToParcel(out, i8);
        out.writeInt(this.f13912d);
        this.f13913e.writeToParcel(out, i8);
    }
}
