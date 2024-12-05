package l2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: l2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3166a implements v2.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f33796a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0778a f33795b = new C0778a(null);
    public static final Parcelable.Creator<C3166a> CREATOR = new b();

    /* renamed from: l2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0778a {
        private C0778a() {
        }

        public final C3166a a(String cardNumber) {
            AbstractC3159y.i(cardNumber, "cardNumber");
            String U02 = g6.n.U0(cardNumber, 6);
            if (U02.length() != 6) {
                U02 = null;
            }
            if (U02 == null) {
                return null;
            }
            return new C3166a(U02);
        }

        public /* synthetic */ C0778a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: l2.a$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3166a createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new C3166a(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3166a[] newArray(int i8) {
            return new C3166a[i8];
        }
    }

    public C3166a(String value) {
        AbstractC3159y.i(value, "value");
        this.f33796a = value;
    }

    public final String b() {
        return this.f33796a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3166a) && AbstractC3159y.d(this.f33796a, ((C3166a) obj).f33796a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f33796a.hashCode();
    }

    public String toString() {
        return this.f33796a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f33796a);
    }
}
