package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzi implements Parcelable.Creator<zzh> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzh createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f2 = 0.0f;
        int i2 = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < I) {
            int z7 = SafeParcelReader.z(parcel);
            switch (SafeParcelReader.v(z7)) {
                case 2:
                    z = SafeParcelReader.w(parcel, z7);
                    break;
                case 3:
                    z2 = SafeParcelReader.w(parcel, z7);
                    break;
                case 4:
                    str = SafeParcelReader.p(parcel, z7);
                    break;
                case 5:
                    z3 = SafeParcelReader.w(parcel, z7);
                    break;
                case 6:
                    f2 = SafeParcelReader.y(parcel, z7);
                    break;
                case 7:
                    i2 = SafeParcelReader.B(parcel, z7);
                    break;
                case 8:
                    z4 = SafeParcelReader.w(parcel, z7);
                    break;
                case 9:
                    z5 = SafeParcelReader.w(parcel, z7);
                    break;
                case 10:
                    z6 = SafeParcelReader.w(parcel, z7);
                    break;
                default:
                    SafeParcelReader.H(parcel, z7);
                    break;
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzh(z, z2, str, z3, f2, i2, z4, z5, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzh[] newArray(int i2) {
        return new zzh[i2];
    }
}
