package S3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f9203a;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new j(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final j[] newArray(int i8) {
            return new j[i8];
        }
    }

    public j(String value) {
        AbstractC3159y.i(value, "value");
        this.f9203a = value;
    }

    public final String b() {
        return this.f9203a;
    }

    public final boolean c() {
        if (this.f9203a.length() > 0) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j) && AbstractC3159y.d(this.f9203a, ((j) obj).f9203a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f9203a.hashCode();
    }

    public String toString() {
        return "HardwareId(value=" + this.f9203a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f9203a);
    }
}
