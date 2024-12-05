package e3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Currency;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: e3.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2780D implements y2.f {
    public static final Parcelable.Creator<C2780D> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f31281a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31282b;

    /* renamed from: c, reason: collision with root package name */
    private final long f31283c;

    /* renamed from: d, reason: collision with root package name */
    private final Currency f31284d;

    /* renamed from: e, reason: collision with root package name */
    private final String f31285e;

    /* renamed from: e3.D$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2780D createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new C2780D(parcel.readString(), parcel.readString(), parcel.readLong(), (Currency) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2780D[] newArray(int i8) {
            return new C2780D[i8];
        }
    }

    public C2780D(String label, String identifier, long j8, Currency currency, String str) {
        AbstractC3255y.i(label, "label");
        AbstractC3255y.i(identifier, "identifier");
        AbstractC3255y.i(currency, "currency");
        this.f31281a = label;
        this.f31282b = identifier;
        this.f31283c = j8;
        this.f31284d = currency;
        this.f31285e = str;
    }

    public final long a() {
        return this.f31283c;
    }

    public final Currency b() {
        return this.f31284d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2780D)) {
            return false;
        }
        C2780D c2780d = (C2780D) obj;
        if (AbstractC3255y.d(this.f31281a, c2780d.f31281a) && AbstractC3255y.d(this.f31282b, c2780d.f31282b) && this.f31283c == c2780d.f31283c && AbstractC3255y.d(this.f31284d, c2780d.f31284d) && AbstractC3255y.d(this.f31285e, c2780d.f31285e)) {
            return true;
        }
        return false;
    }

    public final String g() {
        return this.f31285e;
    }

    public final String h() {
        return this.f31281a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.f31281a.hashCode() * 31) + this.f31282b.hashCode()) * 31) + androidx.collection.a.a(this.f31283c)) * 31) + this.f31284d.hashCode()) * 31;
        String str = this.f31285e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "ShippingMethod(label=" + this.f31281a + ", identifier=" + this.f31282b + ", amount=" + this.f31283c + ", currency=" + this.f31284d + ", detail=" + this.f31285e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f31281a);
        out.writeString(this.f31282b);
        out.writeLong(this.f31283c);
        out.writeSerializable(this.f31284d);
        out.writeString(this.f31285e);
    }
}
