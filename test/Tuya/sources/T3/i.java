package T3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class i extends T3.a implements o, Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    private int f9991d;

    /* renamed from: e, reason: collision with root package name */
    private String f9992e;

    /* renamed from: f, reason: collision with root package name */
    private int f9993f;

    /* renamed from: g, reason: collision with root package name */
    private String f9994g;

    /* loaded from: classes4.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i[] newArray(int i8) {
            return new i[i8];
        }
    }

    private boolean I(i iVar) {
        if (this.f9991d == iVar.f9991d && Z3.c.a(this.f9992e, iVar.f9992e) && this.f9993f == iVar.f9993f && Z3.c.a(this.f9994g, iVar.f9994g)) {
            return true;
        }
        return false;
    }

    @Override // T3.o
    public int c() {
        return this.f9993f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof i) || !I((i) obj))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Z3.c.b(Integer.valueOf(this.f9991d), this.f9992e, Integer.valueOf(this.f9993f), this.f9994g);
    }

    @Override // T3.o
    public String i() {
        return this.f9994g;
    }

    @Override // T3.o
    public String n() {
        return this.f9992e;
    }

    @Override // T3.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        parcel.writeInt(this.f9991d);
        parcel.writeString(this.f9992e);
        parcel.writeInt(this.f9993f);
        parcel.writeString(this.f9994g);
    }

    private i(Parcel parcel) {
        super(parcel);
        this.f9991d = parcel.readInt();
        this.f9992e = parcel.readString();
        this.f9993f = parcel.readInt();
        this.f9994g = parcel.readString();
    }
}
