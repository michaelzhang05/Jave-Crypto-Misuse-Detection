package o2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: o2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3514a implements y2.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f35797a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0807a f35796b = new C0807a(null);
    public static final Parcelable.Creator<C3514a> CREATOR = new b();

    /* renamed from: o2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0807a {
        private C0807a() {
        }

        public final C3514a a(String cardNumber) {
            AbstractC3255y.i(cardNumber, "cardNumber");
            String U02 = j6.n.U0(cardNumber, 6);
            if (U02.length() != 6) {
                U02 = null;
            }
            if (U02 == null) {
                return null;
            }
            return new C3514a(U02);
        }

        public /* synthetic */ C0807a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: o2.a$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3514a createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new C3514a(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3514a[] newArray(int i8) {
            return new C3514a[i8];
        }
    }

    public C3514a(String value) {
        AbstractC3255y.i(value, "value");
        this.f35797a = value;
    }

    public final String a() {
        return this.f35797a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3514a) && AbstractC3255y.d(this.f35797a, ((C3514a) obj).f35797a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f35797a.hashCode();
    }

    public String toString() {
        return this.f35797a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f35797a);
    }
}
