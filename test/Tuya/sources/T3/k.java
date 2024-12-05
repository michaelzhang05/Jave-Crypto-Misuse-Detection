package T3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class k extends T3.a implements p, Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    private String f9995d;

    /* renamed from: e, reason: collision with root package name */
    private String f9996e;

    /* renamed from: f, reason: collision with root package name */
    private String f9997f;

    /* renamed from: g, reason: collision with root package name */
    private String f9998g;

    /* loaded from: classes4.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i8) {
            return new k[i8];
        }
    }

    private boolean I(k kVar) {
        if (Z3.c.a(this.f9995d, kVar.f9995d) && Z3.c.a(this.f9996e, kVar.f9996e) && Z3.c.a(this.f9997f, kVar.f9997f) && Z3.c.a(this.f9998g, kVar.f9998g)) {
            return true;
        }
        return false;
    }

    @Override // T3.p
    public String b() {
        return this.f9996e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // T3.p
    public String e() {
        return this.f9995d;
    }

    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof k) || !I((k) obj))) {
            return false;
        }
        return true;
    }

    @Override // T3.p
    public String f() {
        return this.f9997f;
    }

    public int hashCode() {
        return Z3.c.b(this.f9995d, this.f9996e, this.f9997f, this.f9998g);
    }

    @Override // T3.p
    public String s() {
        return this.f9998g;
    }

    @Override // T3.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        parcel.writeString(this.f9995d);
        parcel.writeString(this.f9996e);
        parcel.writeString(this.f9997f);
        parcel.writeString(this.f9998g);
    }

    private k(Parcel parcel) {
        super(parcel);
        this.f9995d = parcel.readString();
        this.f9996e = parcel.readString();
        this.f9997f = parcel.readString();
        this.f9998g = parcel.readString();
    }
}
