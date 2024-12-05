package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class ShareMedia implements Parcelable {

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f9421f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ShareMedia(Parcel parcel) {
        this.f9421f = parcel.readBundle();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.f9421f);
    }
}
