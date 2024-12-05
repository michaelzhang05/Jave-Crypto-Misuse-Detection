package V3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0214a();

    /* renamed from: a, reason: collision with root package name */
    private final String f10664a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10665b;

    /* renamed from: V3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0214a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new a(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(String sdkAppId, int i8) {
        AbstractC3255y.i(sdkAppId, "sdkAppId");
        this.f10664a = sdkAppId;
        this.f10665b = i8;
    }

    public final String a() {
        return this.f10664a;
    }

    public final int b() {
        return this.f10665b;
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
        if (AbstractC3255y.d(this.f10664a, aVar.f10664a) && this.f10665b == aVar.f10665b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f10664a.hashCode() * 31) + this.f10665b;
    }

    public String toString() {
        return "AppInfo(sdkAppId=" + this.f10664a + ", version=" + this.f10665b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f10664a);
        out.writeInt(this.f10665b);
    }
}
