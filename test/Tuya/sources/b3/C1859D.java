package b3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Currency;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: b3.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1859D implements v2.f {
    public static final Parcelable.Creator<C1859D> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f14275a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14276b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14277c;

    /* renamed from: d, reason: collision with root package name */
    private final Currency f14278d;

    /* renamed from: e, reason: collision with root package name */
    private final String f14279e;

    /* renamed from: b3.D$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1859D createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new C1859D(parcel.readString(), parcel.readString(), parcel.readLong(), (Currency) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1859D[] newArray(int i8) {
            return new C1859D[i8];
        }
    }

    public C1859D(String label, String identifier, long j8, Currency currency, String str) {
        AbstractC3159y.i(label, "label");
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(currency, "currency");
        this.f14275a = label;
        this.f14276b = identifier;
        this.f14277c = j8;
        this.f14278d = currency;
        this.f14279e = str;
    }

    public final long b() {
        return this.f14277c;
    }

    public final Currency c() {
        return this.f14278d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f14279e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1859D)) {
            return false;
        }
        C1859D c1859d = (C1859D) obj;
        if (AbstractC3159y.d(this.f14275a, c1859d.f14275a) && AbstractC3159y.d(this.f14276b, c1859d.f14276b) && this.f14277c == c1859d.f14277c && AbstractC3159y.d(this.f14278d, c1859d.f14278d) && AbstractC3159y.d(this.f14279e, c1859d.f14279e)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f14275a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.f14275a.hashCode() * 31) + this.f14276b.hashCode()) * 31) + androidx.collection.a.a(this.f14277c)) * 31) + this.f14278d.hashCode()) * 31;
        String str = this.f14279e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "ShippingMethod(label=" + this.f14275a + ", identifier=" + this.f14276b + ", amount=" + this.f14277c + ", currency=" + this.f14278d + ", detail=" + this.f14279e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f14275a);
        out.writeString(this.f14276b);
        out.writeLong(this.f14277c);
        out.writeSerializable(this.f14278d);
        out.writeString(this.f14279e);
    }
}
