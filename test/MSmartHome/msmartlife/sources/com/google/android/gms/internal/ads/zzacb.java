package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzacb implements Parcelable.Creator<zzaca> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaca createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        String str = null;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            if (SafeParcelReader.v(z) != 15) {
                SafeParcelReader.H(parcel, z);
            } else {
                str = SafeParcelReader.p(parcel, z);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzaca(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaca[] newArray(int i2) {
        return new zzaca[i2];
    }
}
