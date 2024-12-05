package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zae implements Parcelable.Creator<WebImage> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WebImage createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        int i2 = 0;
        Uri uri = null;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z);
            if (v == 1) {
                i2 = SafeParcelReader.B(parcel, z);
            } else if (v == 2) {
                uri = (Uri) SafeParcelReader.o(parcel, z, Uri.CREATOR);
            } else if (v == 3) {
                i3 = SafeParcelReader.B(parcel, z);
            } else if (v != 4) {
                SafeParcelReader.H(parcel, z);
            } else {
                i4 = SafeParcelReader.B(parcel, z);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new WebImage(i2, uri, i3, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WebImage[] newArray(int i2) {
        return new WebImage[i2];
    }
}
