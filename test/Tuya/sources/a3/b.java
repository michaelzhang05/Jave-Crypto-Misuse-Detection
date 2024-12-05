package a3;

import K2.d;
import T2.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class b implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final k f13503a;

    /* renamed from: b, reason: collision with root package name */
    private final d f13504b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f13502c = d.f5890h;
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new b(k.valueOf(parcel.readString()), (d) parcel.readParcelable(b.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b[] newArray(int i8) {
            return new b[i8];
        }
    }

    public b(k signupMode, d linkConfiguration) {
        AbstractC3159y.i(signupMode, "signupMode");
        AbstractC3159y.i(linkConfiguration, "linkConfiguration");
        this.f13503a = signupMode;
        this.f13504b = linkConfiguration;
    }

    public final d b() {
        return this.f13504b;
    }

    public final k c() {
        return this.f13503a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f13503a == bVar.f13503a && AbstractC3159y.d(this.f13504b, bVar.f13504b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f13503a.hashCode() * 31) + this.f13504b.hashCode();
    }

    public String toString() {
        return "LinkInlineConfiguration(signupMode=" + this.f13503a + ", linkConfiguration=" + this.f13504b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f13503a.name());
        out.writeParcelable(this.f13504b, i8);
    }
}
