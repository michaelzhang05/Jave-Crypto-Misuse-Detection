package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzary implements Parcelable.Creator<zzarx> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzarx createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        Bundle bundle = null;
        zzbai zzbaiVar = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList<String> arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        boolean z = false;
        while (parcel.dataPosition() < I) {
            int z2 = SafeParcelReader.z(parcel);
            switch (SafeParcelReader.v(z2)) {
                case 1:
                    bundle = SafeParcelReader.f(parcel, z2);
                    break;
                case 2:
                    zzbaiVar = (zzbai) SafeParcelReader.o(parcel, z2, zzbai.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.o(parcel, z2, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = SafeParcelReader.p(parcel, z2);
                    break;
                case 5:
                    arrayList = SafeParcelReader.r(parcel, z2);
                    break;
                case 6:
                    packageInfo = (PackageInfo) SafeParcelReader.o(parcel, z2, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = SafeParcelReader.p(parcel, z2);
                    break;
                case 8:
                    z = SafeParcelReader.w(parcel, z2);
                    break;
                case 9:
                    str3 = SafeParcelReader.p(parcel, z2);
                    break;
                default:
                    SafeParcelReader.H(parcel, z2);
                    break;
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzarx(bundle, zzbaiVar, applicationInfo, str, arrayList, packageInfo, str2, z, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzarx[] newArray(int i2) {
        return new zzarx[i2];
    }
}
