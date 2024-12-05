package W3;

import android.os.Parcel;
import android.os.Parcelable;
import c4.C2045c;

/* loaded from: classes4.dex */
public final class g extends W3.a implements d, Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    private String f11645d;

    /* renamed from: e, reason: collision with root package name */
    private String f11646e;

    /* renamed from: f, reason: collision with root package name */
    private int f11647f;

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

    private boolean z(g gVar) {
        if (C2045c.a(this.f11645d, gVar.f11645d) && C2045c.a(this.f11646e, gVar.f11646e) && this.f11647f == gVar.f11647f) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof g) || !z((g) obj))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C2045c.b(this.f11645d, this.f11646e, Integer.valueOf(this.f11647f));
    }

    @Override // W3.d
    public String l() {
        return this.f11645d;
    }

    @Override // W3.d
    public String w() {
        return this.f11646e;
    }

    @Override // W3.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        parcel.writeString(this.f11645d);
        parcel.writeString(this.f11646e);
        parcel.writeInt(this.f11647f);
    }

    @Override // W3.d
    public int x() {
        return this.f11647f;
    }

    private g(Parcel parcel) {
        super(parcel);
        this.f11645d = parcel.readString();
        this.f11646e = parcel.readString();
        this.f11647f = parcel.readInt();
    }
}
