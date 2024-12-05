package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzc implements Parcelable.Creator<PublisherAdViewOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PublisherAdViewOptions createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        boolean z = false;
        while (parcel.dataPosition() < I) {
            int z2 = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z2);
            if (v == 1) {
                z = SafeParcelReader.w(parcel, z2);
            } else if (v == 2) {
                iBinder = SafeParcelReader.A(parcel, z2);
            } else if (v != 3) {
                SafeParcelReader.H(parcel, z2);
            } else {
                iBinder2 = SafeParcelReader.A(parcel, z2);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new PublisherAdViewOptions(z, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PublisherAdViewOptions[] newArray(int i2) {
        return new PublisherAdViewOptions[i2];
    }
}
