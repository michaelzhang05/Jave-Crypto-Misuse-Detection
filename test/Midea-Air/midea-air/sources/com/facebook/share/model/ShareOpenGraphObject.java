package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ShareOpenGraphObject extends ShareOpenGraphValueContainer<ShareOpenGraphObject, ?> {
    public static final Parcelable.Creator<ShareOpenGraphObject> CREATOR = new a();

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<ShareOpenGraphObject> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareOpenGraphObject createFromParcel(Parcel parcel) {
            return new ShareOpenGraphObject(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareOpenGraphObject[] newArray(int i2) {
            return new ShareOpenGraphObject[i2];
        }
    }

    ShareOpenGraphObject(Parcel parcel) {
        super(parcel);
    }
}
