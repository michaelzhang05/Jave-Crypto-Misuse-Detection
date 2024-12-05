package T3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public abstract class a implements c, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f9983a;

    /* renamed from: b, reason: collision with root package name */
    private String f9984b;

    /* renamed from: c, reason: collision with root package name */
    private int f9985c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Parcel parcel) {
        this.f9983a = parcel.readString();
        this.f9984b = parcel.readString();
        this.f9985c = parcel.readInt();
    }

    @Override // T3.c
    public String G() {
        return this.f9983a;
    }

    @Override // T3.c
    public String k() {
        return this.f9984b;
    }

    @Override // T3.c
    public int o() {
        return this.f9985c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f9983a);
        parcel.writeString(this.f9984b);
        parcel.writeInt(this.f9985c);
    }
}
