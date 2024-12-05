package T3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class g extends T3.a implements d, Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    private String f9988d;

    /* renamed from: e, reason: collision with root package name */
    private String f9989e;

    /* renamed from: f, reason: collision with root package name */
    private int f9990f;

    /* loaded from: classes4.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i8) {
            return new g[i8];
        }
    }

    private boolean I(g gVar) {
        if (Z3.c.a(this.f9988d, gVar.f9988d) && Z3.c.a(this.f9989e, gVar.f9989e) && this.f9990f == gVar.f9990f) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof g) || !I((g) obj))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Z3.c.b(this.f9988d, this.f9989e, Integer.valueOf(this.f9990f));
    }

    @Override // T3.d
    public String j() {
        return this.f9988d;
    }

    @Override // T3.d
    public String u() {
        return this.f9989e;
    }

    @Override // T3.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        parcel.writeString(this.f9988d);
        parcel.writeString(this.f9989e);
        parcel.writeInt(this.f9990f);
    }

    @Override // T3.d
    public int z() {
        return this.f9990f;
    }

    private g(Parcel parcel) {
        super(parcel);
        this.f9988d = parcel.readString();
        this.f9989e = parcel.readString();
        this.f9990f = parcel.readInt();
    }
}
