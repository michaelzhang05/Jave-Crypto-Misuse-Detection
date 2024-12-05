package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzadz implements Parcelable.Creator<zzady> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzady createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        zzacd zzacdVar = null;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        while (parcel.dataPosition() < I) {
            int z4 = SafeParcelReader.z(parcel);
            switch (SafeParcelReader.v(z4)) {
                case 1:
                    i2 = SafeParcelReader.B(parcel, z4);
                    break;
                case 2:
                    z = SafeParcelReader.w(parcel, z4);
                    break;
                case 3:
                    i3 = SafeParcelReader.B(parcel, z4);
                    break;
                case 4:
                    z2 = SafeParcelReader.w(parcel, z4);
                    break;
                case 5:
                    i4 = SafeParcelReader.B(parcel, z4);
                    break;
                case 6:
                    zzacdVar = (zzacd) SafeParcelReader.o(parcel, z4, zzacd.CREATOR);
                    break;
                case 7:
                    z3 = SafeParcelReader.w(parcel, z4);
                    break;
                case 8:
                    i5 = SafeParcelReader.B(parcel, z4);
                    break;
                default:
                    SafeParcelReader.H(parcel, z4);
                    break;
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzady(i2, z, i3, z2, i4, zzacdVar, z3, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzady[] newArray(int i2) {
        return new zzady[i2];
    }
}
