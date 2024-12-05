package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzasa implements Parcelable.Creator<zzarz> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzarz createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        String str = null;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            if (SafeParcelReader.v(z) != 2) {
                SafeParcelReader.H(parcel, z);
            } else {
                str = SafeParcelReader.p(parcel, z);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzarz(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzarz[] newArray(int i2) {
        return new zzarz[i2];
    }
}
