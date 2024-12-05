package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f13659a;

    /* renamed from: b, reason: collision with root package name */
    public int f13660b;

    /* renamed from: c, reason: collision with root package name */
    public int f13661c;

    /* renamed from: d, reason: collision with root package name */
    public int f13662d;

    /* renamed from: e, reason: collision with root package name */
    public int f13663e;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i8) {
            return new ParcelableVolumeInfo[i8];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f13659a = parcel.readInt();
        this.f13661c = parcel.readInt();
        this.f13662d = parcel.readInt();
        this.f13663e = parcel.readInt();
        this.f13660b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f13659a);
        parcel.writeInt(this.f13661c);
        parcel.writeInt(this.f13662d);
        parcel.writeInt(this.f13663e);
        parcel.writeInt(this.f13660b);
    }
}
