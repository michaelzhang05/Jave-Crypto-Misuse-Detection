package C2;

import android.os.Parcel;
import android.os.Parcelable;
import j6.n;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class a implements b {
    public static final Parcelable.Creator<a> CREATOR = new C0014a();

    /* renamed from: a, reason: collision with root package name */
    private final String f1182a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1183b;

    /* renamed from: C2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0014a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new a(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(String original, String replacement) {
        AbstractC3255y.i(original, "original");
        AbstractC3255y.i(replacement, "replacement");
        this.f1182a = original;
        this.f1183b = replacement;
    }

    @Override // C2.b
    public String P(String value) {
        AbstractC3255y.i(value, "value");
        return n.A(value, this.f1182a, this.f1183b, false, 4, null);
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
        if (AbstractC3255y.d(this.f1182a, aVar.f1182a) && AbstractC3255y.d(this.f1183b, aVar.f1183b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f1182a.hashCode() * 31) + this.f1183b.hashCode();
    }

    public String toString() {
        return "Replace(original=" + this.f1182a + ", replacement=" + this.f1183b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f1182a);
        out.writeString(this.f1183b);
    }
}
