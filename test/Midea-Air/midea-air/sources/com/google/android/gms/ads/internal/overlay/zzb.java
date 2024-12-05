package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzb implements Parcelable.Creator<zzc> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzc createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            switch (SafeParcelReader.v(z)) {
                case 2:
                    str = SafeParcelReader.p(parcel, z);
                    break;
                case 3:
                    str2 = SafeParcelReader.p(parcel, z);
                    break;
                case 4:
                    str3 = SafeParcelReader.p(parcel, z);
                    break;
                case 5:
                    str4 = SafeParcelReader.p(parcel, z);
                    break;
                case 6:
                    str5 = SafeParcelReader.p(parcel, z);
                    break;
                case 7:
                    str6 = SafeParcelReader.p(parcel, z);
                    break;
                case 8:
                    str7 = SafeParcelReader.p(parcel, z);
                    break;
                case 9:
                    intent = (Intent) SafeParcelReader.o(parcel, z, Intent.CREATOR);
                    break;
                default:
                    SafeParcelReader.H(parcel, z);
                    break;
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzc(str, str2, str3, str4, str5, str6, str7, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzc[] newArray(int i2) {
        return new zzc[i2];
    }
}
