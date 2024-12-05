package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ShareHashtag implements Parcelable {
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    private final String f9420f;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<ShareHashtag> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareHashtag createFromParcel(Parcel parcel) {
            return new ShareHashtag(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareHashtag[] newArray(int i2) {
            return new ShareHashtag[i2];
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        private String a;

        public ShareHashtag b() {
            return new ShareHashtag(this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b c(Parcel parcel) {
            return d((ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader()));
        }

        public b d(ShareHashtag shareHashtag) {
            return shareHashtag == null ? this : e(shareHashtag.a());
        }

        public b e(String str) {
            this.a = str;
            return this;
        }
    }

    /* synthetic */ ShareHashtag(b bVar, a aVar) {
        this(bVar);
    }

    public String a() {
        return this.f9420f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f9420f);
    }

    private ShareHashtag(b bVar) {
        this.f9420f = bVar.a;
    }

    ShareHashtag(Parcel parcel) {
        this.f9420f = parcel.readString();
    }
}
