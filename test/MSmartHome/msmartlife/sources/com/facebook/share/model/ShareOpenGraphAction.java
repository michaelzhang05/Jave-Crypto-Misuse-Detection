package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareOpenGraphValueContainer;

/* loaded from: classes.dex */
public final class ShareOpenGraphAction extends ShareOpenGraphValueContainer<ShareOpenGraphAction, b> {
    public static final Parcelable.Creator<ShareOpenGraphAction> CREATOR = new a();

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<ShareOpenGraphAction> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareOpenGraphAction createFromParcel(Parcel parcel) {
            return new ShareOpenGraphAction(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareOpenGraphAction[] newArray(int i2) {
            return new ShareOpenGraphAction[i2];
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ShareOpenGraphValueContainer.a<ShareOpenGraphAction, b> {
        public ShareOpenGraphAction d() {
            return new ShareOpenGraphAction(this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b e(Parcel parcel) {
            return f((ShareOpenGraphAction) parcel.readParcelable(ShareOpenGraphAction.class.getClassLoader()));
        }

        public b f(ShareOpenGraphAction shareOpenGraphAction) {
            return shareOpenGraphAction == null ? this : ((b) super.c(shareOpenGraphAction)).g(shareOpenGraphAction.e());
        }

        public b g(String str) {
            b("og:type", str);
            return this;
        }
    }

    /* synthetic */ ShareOpenGraphAction(b bVar, a aVar) {
        this(bVar);
    }

    public String e() {
        return c("og:type");
    }

    private ShareOpenGraphAction(b bVar) {
        super(bVar);
    }

    ShareOpenGraphAction(Parcel parcel) {
        super(parcel);
    }
}
