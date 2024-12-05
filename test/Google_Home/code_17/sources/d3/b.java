package d3;

import N2.d;
import W2.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class b implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final k f31166a;

    /* renamed from: b, reason: collision with root package name */
    private final d f31167b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f31165c = d.f7669h;
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new b(k.valueOf(parcel.readString()), (d) parcel.readParcelable(b.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b[] newArray(int i8) {
            return new b[i8];
        }
    }

    public b(k signupMode, d linkConfiguration) {
        AbstractC3255y.i(signupMode, "signupMode");
        AbstractC3255y.i(linkConfiguration, "linkConfiguration");
        this.f31166a = signupMode;
        this.f31167b = linkConfiguration;
    }

    public final d a() {
        return this.f31167b;
    }

    public final k b() {
        return this.f31166a;
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
        if (this.f31166a == bVar.f31166a && AbstractC3255y.d(this.f31167b, bVar.f31167b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f31166a.hashCode() * 31) + this.f31167b.hashCode();
    }

    public String toString() {
        return "LinkInlineConfiguration(signupMode=" + this.f31166a + ", linkConfiguration=" + this.f31167b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f31166a.name());
        out.writeParcelable(this.f31167b, i8);
    }
}
