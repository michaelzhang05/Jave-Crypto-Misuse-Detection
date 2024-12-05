package e3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class n implements y2.f {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f31503a;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new n(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n[] newArray(int i8) {
            return new n[i8];
        }
    }

    public n(String id) {
        AbstractC3255y.i(id, "id");
        this.f31503a = id;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && AbstractC3255y.d(this.f31503a, ((n) obj).f31503a)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.f31503a;
    }

    public int hashCode() {
        return this.f31503a.hashCode();
    }

    public String toString() {
        return "ConsumerPaymentDetailsShare(id=" + this.f31503a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f31503a);
    }
}
