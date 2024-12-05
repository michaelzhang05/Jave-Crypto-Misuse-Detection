package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.ads.zzbai;

/* loaded from: classes2.dex */
public final class zzn implements Parcelable.Creator<AdOverlayInfoParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdOverlayInfoParcel createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        zzc zzcVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        zzbai zzbaiVar = null;
        String str4 = null;
        com.google.android.gms.ads.internal.zzh zzhVar = null;
        IBinder iBinder6 = null;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < I) {
            int z2 = SafeParcelReader.z(parcel);
            switch (SafeParcelReader.v(z2)) {
                case 2:
                    zzcVar = (zzc) SafeParcelReader.o(parcel, z2, zzc.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.A(parcel, z2);
                    break;
                case 4:
                    iBinder2 = SafeParcelReader.A(parcel, z2);
                    break;
                case 5:
                    iBinder3 = SafeParcelReader.A(parcel, z2);
                    break;
                case 6:
                    iBinder4 = SafeParcelReader.A(parcel, z2);
                    break;
                case 7:
                    str = SafeParcelReader.p(parcel, z2);
                    break;
                case 8:
                    z = SafeParcelReader.w(parcel, z2);
                    break;
                case 9:
                    str2 = SafeParcelReader.p(parcel, z2);
                    break;
                case 10:
                    iBinder5 = SafeParcelReader.A(parcel, z2);
                    break;
                case 11:
                    i2 = SafeParcelReader.B(parcel, z2);
                    break;
                case 12:
                    i3 = SafeParcelReader.B(parcel, z2);
                    break;
                case 13:
                    str3 = SafeParcelReader.p(parcel, z2);
                    break;
                case 14:
                    zzbaiVar = (zzbai) SafeParcelReader.o(parcel, z2, zzbai.CREATOR);
                    break;
                case 15:
                default:
                    SafeParcelReader.H(parcel, z2);
                    break;
                case 16:
                    str4 = SafeParcelReader.p(parcel, z2);
                    break;
                case 17:
                    zzhVar = (com.google.android.gms.ads.internal.zzh) SafeParcelReader.o(parcel, z2, com.google.android.gms.ads.internal.zzh.CREATOR);
                    break;
                case 18:
                    iBinder6 = SafeParcelReader.A(parcel, z2);
                    break;
            }
        }
        SafeParcelReader.u(parcel, I);
        return new AdOverlayInfoParcel(zzcVar, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i2, i3, str3, zzbaiVar, str4, zzhVar, iBinder6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdOverlayInfoParcel[] newArray(int i2) {
        return new AdOverlayInfoParcel[i2];
    }
}
