package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f14458a;

    /* renamed from: b, reason: collision with root package name */
    public int f14459b;

    /* renamed from: c, reason: collision with root package name */
    public int f14460c;

    /* renamed from: d, reason: collision with root package name */
    public int f14461d;

    /* renamed from: e, reason: collision with root package name */
    public int f14462e;

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
        this.f14458a = parcel.readInt();
        this.f14460c = parcel.readInt();
        this.f14461d = parcel.readInt();
        this.f14462e = parcel.readInt();
        this.f14459b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f14458a);
        parcel.writeInt(this.f14460c);
        parcel.writeInt(this.f14461d);
        parcel.writeInt(this.f14462e);
        parcel.writeInt(this.f14459b);
    }
}
