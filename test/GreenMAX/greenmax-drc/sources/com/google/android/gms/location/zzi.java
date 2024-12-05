package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzi implements Parcelable.Creator<DetectedActivity> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DetectedActivity createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z);
            if (v == 1) {
                i2 = SafeParcelReader.B(parcel, z);
            } else if (v != 2) {
                SafeParcelReader.H(parcel, z);
            } else {
                i3 = SafeParcelReader.B(parcel, z);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new DetectedActivity(i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DetectedActivity[] newArray(int i2) {
        return new DetectedActivity[i2];
    }
}
