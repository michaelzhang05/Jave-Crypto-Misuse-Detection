package W3;

import android.os.Parcel;
import android.os.Parcelable;
import c4.C2045c;

/* loaded from: classes4.dex */
public final class i extends W3.a implements o, Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    private int f11648d;

    /* renamed from: e, reason: collision with root package name */
    private String f11649e;

    /* renamed from: f, reason: collision with root package name */
    private int f11650f;

    /* renamed from: g, reason: collision with root package name */
    private String f11651g;

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

    private boolean z(i iVar) {
        if (this.f11648d == iVar.f11648d && C2045c.a(this.f11649e, iVar.f11649e) && this.f11650f == iVar.f11650f && C2045c.a(this.f11651g, iVar.f11651g)) {
            return true;
        }
        return false;
    }

    @Override // W3.o
    public int b() {
        return this.f11650f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof i) || !z((i) obj))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C2045c.b(Integer.valueOf(this.f11648d), this.f11649e, Integer.valueOf(this.f11650f), this.f11651g);
    }

    @Override // W3.o
    public String i() {
        return this.f11651g;
    }

    @Override // W3.o
    public String s() {
        return this.f11649e;
    }

    @Override // W3.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        parcel.writeInt(this.f11648d);
        parcel.writeString(this.f11649e);
        parcel.writeInt(this.f11650f);
        parcel.writeString(this.f11651g);
    }

    private i(Parcel parcel) {
        super(parcel);
        this.f11648d = parcel.readInt();
        this.f11649e = parcel.readString();
        this.f11650f = parcel.readInt();
        this.f11651g = parcel.readString();
    }
}
