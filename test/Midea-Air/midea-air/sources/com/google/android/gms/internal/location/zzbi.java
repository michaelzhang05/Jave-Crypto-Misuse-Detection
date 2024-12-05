package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbi implements Parcelable.Creator<zzbh> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbh createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        double d2 = 0.0d;
        double d3 = 0.0d;
        String str = null;
        long j2 = 0;
        int i2 = 0;
        short s = 0;
        float f2 = 0.0f;
        int i3 = 0;
        int i4 = -1;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            switch (SafeParcelReader.v(z)) {
                case 1:
                    str = SafeParcelReader.p(parcel, z);
                    break;
                case 2:
                    j2 = SafeParcelReader.D(parcel, z);
                    break;
                case 3:
                    s = SafeParcelReader.F(parcel, z);
                    break;
                case 4:
                    d2 = SafeParcelReader.x(parcel, z);
                    break;
                case 5:
                    d3 = SafeParcelReader.x(parcel, z);
                    break;
                case 6:
                    f2 = SafeParcelReader.y(parcel, z);
                    break;
                case 7:
                    i2 = SafeParcelReader.B(parcel, z);
                    break;
                case 8:
                    i3 = SafeParcelReader.B(parcel, z);
                    break;
                case 9:
                    i4 = SafeParcelReader.B(parcel, z);
                    break;
                default:
                    SafeParcelReader.H(parcel, z);
                    break;
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzbh(str, i2, s, d2, d3, f2, j2, i3, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbh[] newArray(int i2) {
        return new zzbh[i2];
    }
}
