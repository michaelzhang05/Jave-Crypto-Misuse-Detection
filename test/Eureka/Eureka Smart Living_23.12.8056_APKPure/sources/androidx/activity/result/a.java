package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0007a();

    /* renamed from: a, reason: collision with root package name */
    private final int f181a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f182b;

    /* renamed from: androidx.activity.result.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0007a implements Parcelable.Creator {
        C0007a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i6) {
            return new a[i6];
        }
    }

    public a(int i6, Intent intent) {
        this.f181a = i6;
        this.f182b = intent;
    }

    public static String c(int i6) {
        return i6 != -1 ? i6 != 0 ? String.valueOf(i6) : "RESULT_CANCELED" : "RESULT_OK";
    }

    public Intent a() {
        return this.f182b;
    }

    public int b() {
        return this.f181a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + c(this.f181a) + ", data=" + this.f182b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f181a);
        parcel.writeInt(this.f182b == null ? 0 : 1);
        Intent intent = this.f182b;
        if (intent != null) {
            intent.writeToParcel(parcel, i6);
        }
    }

    a(Parcel parcel) {
        this.f181a = parcel.readInt();
        this.f182b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
