package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.ShareOpenGraphValueContainer.a;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class ShareOpenGraphValueContainer<P extends ShareOpenGraphValueContainer, E extends a> implements Parcelable {

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f9422f;

    /* loaded from: classes.dex */
    public static abstract class a<P extends ShareOpenGraphValueContainer, E extends a> {
        private Bundle a = new Bundle();

        public E b(String str, String str2) {
            this.a.putString(str, str2);
            return this;
        }

        public E c(P p) {
            if (p != null) {
                this.a.putAll(p.b());
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ShareOpenGraphValueContainer(a<P, E> aVar) {
        this.f9422f = (Bundle) ((a) aVar).a.clone();
    }

    public Object a(String str) {
        return this.f9422f.get(str);
    }

    public Bundle b() {
        return (Bundle) this.f9422f.clone();
    }

    public String c(String str) {
        return this.f9422f.getString(str);
    }

    public Set<String> d() {
        return this.f9422f.keySet();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.f9422f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ShareOpenGraphValueContainer(Parcel parcel) {
        this.f9422f = parcel.readBundle(a.class.getClassLoader());
    }
}
