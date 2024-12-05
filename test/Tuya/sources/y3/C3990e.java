package y3;

import android.os.Parcel;
import android.os.Parcelable;
import g6.n;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: y3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3990e extends AbstractC3986a {
    public static final Parcelable.Creator<C3990e> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f39763a;

    /* renamed from: y3.e$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3990e createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new C3990e(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3990e[] newArray(int i8) {
            return new C3990e[i8];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3990e(String value) {
        super(null);
        AbstractC3159y.i(value, "value");
        this.f39763a = value;
    }

    @Override // y3.AbstractC3986a
    public String b() {
        return this.f39763a;
    }

    public void c() {
        if (!n.u(b())) {
        } else {
            throw new IllegalArgumentException("The PaymentIntent client_secret cannot be an empty string.");
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
        if ((obj instanceof C3990e) && AbstractC3159y.d(this.f39763a, ((C3990e) obj).f39763a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f39763a.hashCode();
    }

    public String toString() {
        return "PaymentIntentClientSecret(value=" + this.f39763a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f39763a);
    }
}
