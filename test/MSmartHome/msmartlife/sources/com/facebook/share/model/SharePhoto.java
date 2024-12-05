package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class SharePhoto extends ShareMedia {
    public static final Parcelable.Creator<SharePhoto> CREATOR = new a();

    /* renamed from: g, reason: collision with root package name */
    private final Bitmap f9423g;

    /* renamed from: h, reason: collision with root package name */
    private final Uri f9424h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f9425i;

    /* renamed from: j, reason: collision with root package name */
    private final String f9426j;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<SharePhoto> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SharePhoto createFromParcel(Parcel parcel) {
            return new SharePhoto(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SharePhoto[] newArray(int i2) {
            return new SharePhoto[i2];
        }
    }

    SharePhoto(Parcel parcel) {
        super(parcel);
        this.f9423g = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f9424h = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f9425i = parcel.readByte() != 0;
        this.f9426j = parcel.readString();
    }

    public Uri a() {
        return this.f9424h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.f9423g, 0);
        parcel.writeParcelable(this.f9424h, 0);
        parcel.writeByte(this.f9425i ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f9426j);
    }
}
