package W3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public abstract class a implements c, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f11640a;

    /* renamed from: b, reason: collision with root package name */
    private String f11641b;

    /* renamed from: c, reason: collision with root package name */
    private int f11642c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Parcel parcel) {
        this.f11640a = parcel.readString();
        this.f11641b = parcel.readString();
        this.f11642c = parcel.readInt();
    }

    @Override // W3.c
    public String p() {
        return this.f11641b;
    }

    @Override // W3.c
    public int u() {
        return this.f11642c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f11640a);
        parcel.writeString(this.f11641b);
        parcel.writeInt(this.f11642c);
    }

    @Override // W3.c
    public String y() {
        return this.f11640a;
    }
}
