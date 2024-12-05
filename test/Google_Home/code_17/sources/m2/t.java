package m2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class t extends AbstractC3413K {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final com.stripe.android.model.n f35044b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35045c;

    /* renamed from: d, reason: collision with root package name */
    private final String f35046d;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new t(com.stripe.android.model.n.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t[] newArray(int i8) {
            return new t[i8];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.stripe.android.model.n intent, int i8, String str) {
        super(i8);
        AbstractC3255y.i(intent, "intent");
        this.f35044b = intent;
        this.f35045c = i8;
        this.f35046d = str;
    }

    @Override // m2.AbstractC3413K
    public String b() {
        return this.f35046d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (AbstractC3255y.d(this.f35044b, tVar.f35044b) && this.f35045c == tVar.f35045c && AbstractC3255y.d(this.f35046d, tVar.f35046d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f35044b.hashCode() * 31) + this.f35045c) * 31;
        String str = this.f35046d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @Override // m2.AbstractC3413K
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.n g() {
        return this.f35044b;
    }

    public String toString() {
        return "PaymentIntentResult(intent=" + this.f35044b + ", outcomeFromFlow=" + this.f35045c + ", failureMessage=" + this.f35046d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        this.f35044b.writeToParcel(out, i8);
        out.writeInt(this.f35045c);
        out.writeString(this.f35046d);
    }
}
