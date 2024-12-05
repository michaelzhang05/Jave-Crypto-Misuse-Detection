package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzawd implements Parcelable.Creator<zzawc> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzawc createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        String str = null;
        String str2 = null;
        zzyd zzydVar = null;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z);
            if (v == 1) {
                str = SafeParcelReader.p(parcel, z);
            } else if (v == 2) {
                str2 = SafeParcelReader.p(parcel, z);
            } else if (v != 3) {
                SafeParcelReader.H(parcel, z);
            } else {
                zzydVar = (zzyd) SafeParcelReader.o(parcel, z, zzyd.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzawc(str, str2, zzydVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzawc[] newArray(int i2) {
        return new zzawc[i2];
    }
}
