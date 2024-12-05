package W3;

import android.os.Parcel;
import android.os.Parcelable;
import c4.C2045c;

/* loaded from: classes4.dex */
public final class e extends W3.a implements b, Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    private String f11643d;

    /* renamed from: e, reason: collision with root package name */
    private int f11644e;

    /* loaded from: classes4.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i8) {
            return new e[i8];
        }
    }

    private boolean z(e eVar) {
        if (C2045c.a(this.f11643d, eVar.f11643d) && this.f11644e == eVar.f11644e) {
            return true;
        }
        return false;
    }

    @Override // W3.b
    public int b() {
        return this.f11644e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof e) || !z((e) obj))) {
            return false;
        }
        return true;
    }

    @Override // W3.b
    public String g() {
        return this.f11643d;
    }

    public int hashCode() {
        return C2045c.b(this.f11643d, Integer.valueOf(this.f11644e));
    }

    @Override // W3.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        parcel.writeString(this.f11643d);
        parcel.writeInt(this.f11644e);
    }

    private e(Parcel parcel) {
        super(parcel);
        this.f11643d = parcel.readString();
        this.f11644e = parcel.readInt();
    }
}
