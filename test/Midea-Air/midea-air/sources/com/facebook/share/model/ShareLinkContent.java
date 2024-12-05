package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ShareLinkContent extends ShareContent<ShareLinkContent, ?> {
    public static final Parcelable.Creator<ShareLinkContent> CREATOR = new a();

    @Deprecated
    private final String l;

    @Deprecated
    private final String m;

    @Deprecated
    private final Uri n;
    private final String o;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<ShareLinkContent> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareLinkContent createFromParcel(Parcel parcel) {
            return new ShareLinkContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareLinkContent[] newArray(int i2) {
            return new ShareLinkContent[i2];
        }
    }

    ShareLinkContent(Parcel parcel) {
        super(parcel);
        this.l = parcel.readString();
        this.m = parcel.readString();
        this.n = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.o = parcel.readString();
    }

    public String d() {
        return this.o;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeParcelable(this.n, 0);
        parcel.writeString(this.o);
    }
}
