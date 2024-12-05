package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ShareContent<P extends ShareContent, E> implements Parcelable {

    /* renamed from: f, reason: collision with root package name */
    private final Uri f9414f;

    /* renamed from: g, reason: collision with root package name */
    private final List<String> f9415g;

    /* renamed from: h, reason: collision with root package name */
    private final String f9416h;

    /* renamed from: i, reason: collision with root package name */
    private final String f9417i;

    /* renamed from: j, reason: collision with root package name */
    private final String f9418j;

    /* renamed from: k, reason: collision with root package name */
    private final ShareHashtag f9419k;

    /* JADX INFO: Access modifiers changed from: protected */
    public ShareContent(Parcel parcel) {
        this.f9414f = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f9415g = c(parcel);
        this.f9416h = parcel.readString();
        this.f9417i = parcel.readString();
        this.f9418j = parcel.readString();
        this.f9419k = new ShareHashtag.b().c(parcel).b();
    }

    private List<String> c(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.size() == 0) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Uri a() {
        return this.f9414f;
    }

    public ShareHashtag b() {
        return this.f9419k;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f9414f, 0);
        parcel.writeStringList(this.f9415g);
        parcel.writeString(this.f9416h);
        parcel.writeString(this.f9417i);
        parcel.writeString(this.f9418j);
        parcel.writeParcelable(this.f9419k, 0);
    }
}
