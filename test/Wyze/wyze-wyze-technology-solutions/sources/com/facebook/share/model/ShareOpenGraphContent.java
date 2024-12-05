package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareOpenGraphAction;

/* loaded from: classes.dex */
public final class ShareOpenGraphContent extends ShareContent<ShareOpenGraphContent, ?> {
    public static final Parcelable.Creator<ShareOpenGraphContent> CREATOR = new a();
    private final ShareOpenGraphAction l;
    private final String m;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<ShareOpenGraphContent> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareOpenGraphContent createFromParcel(Parcel parcel) {
            return new ShareOpenGraphContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareOpenGraphContent[] newArray(int i2) {
            return new ShareOpenGraphContent[i2];
        }
    }

    ShareOpenGraphContent(Parcel parcel) {
        super(parcel);
        this.l = new ShareOpenGraphAction.b().e(parcel).d();
        this.m = parcel.readString();
    }

    public ShareOpenGraphAction d() {
        return this.l;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.l, 0);
        parcel.writeString(this.m);
    }
}
