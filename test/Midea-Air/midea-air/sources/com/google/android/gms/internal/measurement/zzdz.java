package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzdz implements Parcelable.Creator<zzdy> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdy createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < I) {
            int z2 = SafeParcelReader.z(parcel);
            switch (SafeParcelReader.v(z2)) {
                case 1:
                    j2 = SafeParcelReader.D(parcel, z2);
                    break;
                case 2:
                    j3 = SafeParcelReader.D(parcel, z2);
                    break;
                case 3:
                    z = SafeParcelReader.w(parcel, z2);
                    break;
                case 4:
                    str = SafeParcelReader.p(parcel, z2);
                    break;
                case 5:
                    str2 = SafeParcelReader.p(parcel, z2);
                    break;
                case 6:
                    str3 = SafeParcelReader.p(parcel, z2);
                    break;
                case 7:
                    bundle = SafeParcelReader.f(parcel, z2);
                    break;
                default:
                    SafeParcelReader.H(parcel, z2);
                    break;
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzdy(j2, j3, z, str, str2, str3, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdy[] newArray(int i2) {
        return new zzdy[i2];
    }
}
