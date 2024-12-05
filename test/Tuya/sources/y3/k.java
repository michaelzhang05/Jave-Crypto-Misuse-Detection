package y3;

import android.os.Parcel;
import android.os.Parcelable;
import g6.n;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class k extends AbstractC3986a {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f39836a;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new k(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k[] newArray(int i8) {
            return new k[i8];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String value) {
        super(null);
        AbstractC3159y.i(value, "value");
        this.f39836a = value;
    }

    @Override // y3.AbstractC3986a
    public String b() {
        return this.f39836a;
    }

    public void c() {
        if (!n.u(b())) {
        } else {
            throw new IllegalArgumentException("The SetupIntent client_secret cannot be an empty string.");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k) && AbstractC3159y.d(this.f39836a, ((k) obj).f39836a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f39836a.hashCode();
    }

    public String toString() {
        return "SetupIntentClientSecret(value=" + this.f39836a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f39836a);
    }
}
