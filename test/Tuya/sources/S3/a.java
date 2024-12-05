package S3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0189a();

    /* renamed from: a, reason: collision with root package name */
    private final String f9021a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9022b;

    /* renamed from: S3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0189a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new a(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(String sdkAppId, int i8) {
        AbstractC3159y.i(sdkAppId, "sdkAppId");
        this.f9021a = sdkAppId;
        this.f9022b = i8;
    }

    public final String b() {
        return this.f9021a;
    }

    public final int c() {
        return this.f9022b;
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
        if (AbstractC3159y.d(this.f9021a, aVar.f9021a) && this.f9022b == aVar.f9022b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f9021a.hashCode() * 31) + this.f9022b;
    }

    public String toString() {
        return "AppInfo(sdkAppId=" + this.f9021a + ", version=" + this.f9022b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f9021a);
        out.writeInt(this.f9022b);
    }
}
