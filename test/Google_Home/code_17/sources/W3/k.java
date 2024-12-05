package W3;

import android.os.Parcel;
import android.os.Parcelable;
import c4.C2045c;

/* loaded from: classes4.dex */
public final class k extends W3.a implements p, Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    private String f11652d;

    /* renamed from: e, reason: collision with root package name */
    private String f11653e;

    /* renamed from: f, reason: collision with root package name */
    private String f11654f;

    /* renamed from: g, reason: collision with root package name */
    private String f11655g;

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

    private boolean z(k kVar) {
        if (C2045c.a(this.f11652d, kVar.f11652d) && C2045c.a(this.f11653e, kVar.f11653e) && C2045c.a(this.f11654f, kVar.f11654f) && C2045c.a(this.f11655g, kVar.f11655g)) {
            return true;
        }
        return false;
    }

    @Override // W3.p
    public String a() {
        return this.f11653e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof k) || !z((k) obj))) {
            return false;
        }
        return true;
    }

    @Override // W3.p
    public String g() {
        return this.f11652d;
    }

    @Override // W3.p
    public String h() {
        return this.f11654f;
    }

    public int hashCode() {
        return C2045c.b(this.f11652d, this.f11653e, this.f11654f, this.f11655g);
    }

    @Override // W3.p
    public String v() {
        return this.f11655g;
    }

    @Override // W3.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        parcel.writeString(this.f11652d);
        parcel.writeString(this.f11653e);
        parcel.writeString(this.f11654f);
        parcel.writeString(this.f11655g);
    }

    private k(Parcel parcel) {
        super(parcel);
        this.f11652d = parcel.readString();
        this.f11653e = parcel.readString();
        this.f11654f = parcel.readString();
        this.f11655g = parcel.readString();
    }
}
