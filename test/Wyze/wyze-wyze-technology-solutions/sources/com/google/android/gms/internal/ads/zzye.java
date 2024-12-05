package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzye implements Parcelable.Creator<zzyd> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzyd createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        String str = null;
        zzyd[] zzydVarArr = null;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < I) {
            int z5 = SafeParcelReader.z(parcel);
            switch (SafeParcelReader.v(z5)) {
                case 2:
                    str = SafeParcelReader.p(parcel, z5);
                    break;
                case 3:
                    i2 = SafeParcelReader.B(parcel, z5);
                    break;
                case 4:
                    i3 = SafeParcelReader.B(parcel, z5);
                    break;
                case 5:
                    z = SafeParcelReader.w(parcel, z5);
                    break;
                case 6:
                    i4 = SafeParcelReader.B(parcel, z5);
                    break;
                case 7:
                    i5 = SafeParcelReader.B(parcel, z5);
                    break;
                case 8:
                    zzydVarArr = (zzyd[]) SafeParcelReader.s(parcel, z5, zzyd.CREATOR);
                    break;
                case 9:
                    z2 = SafeParcelReader.w(parcel, z5);
                    break;
                case 10:
                    z3 = SafeParcelReader.w(parcel, z5);
                    break;
                case 11:
                    z4 = SafeParcelReader.w(parcel, z5);
                    break;
                default:
                    SafeParcelReader.H(parcel, z5);
                    break;
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzyd(str, i2, i3, z, i4, i5, zzydVarArr, z2, z3, z4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzyd[] newArray(int i2) {
        return new zzyd[i2];
    }
}
